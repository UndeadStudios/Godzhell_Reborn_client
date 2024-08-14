import java.io.*;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

public class OnDemandFetcher extends OnDemandFetcherParent
    implements Runnable
{

    /*private final boolean method549(int i, byte byte0, int j, byte abyte0[])
    {
        if(abyte0 == null || abyte0.length < 2)
            return false;
        int k = abyte0.length - 2;
        int l = ((abyte0[k] & 0xff) << 8) + (abyte0[k + 1] & 0xff);
        if(byte0 != 3)
            aBoolean1336 = !aBoolean1336;
        aCRC32_1338.reset();
        aCRC32_1338.update(abyte0, 0, k);
        int i1 = (int)aCRC32_1338.getValue();
        if(l != i)
            return true;
        return i1 == j;
    }*/
    private boolean crcMatches(int type, int id, byte[] data) {
        if (data == null || data.length < 2) {
            return false;
        }
        int length = data.length - 2;
        int hash = ((data[length] & 0xFF) << 8) + (data[length + 1] & 0xFF);
        aCRC32_1338.reset();
        aCRC32_1338.update(data, 0, length);
        int crc = (int) aCRC32_1338.getValue();
        return hash == type && crc == id;
    }


    private final void readData() {
        try
        {
            int j = inputStream.available();
            if(expectedSize == 0 && j >= 6)
            {
                waiting = true;
                for(int k = 0; k < 6; k += inputStream.read(ioBuffer, k, 6 - k));
                int l = ioBuffer[0] & 0xff;
                int j1 = ((ioBuffer[1] & 0xff) << 8) + (ioBuffer[2] & 0xff);
                int l1 = ((ioBuffer[3] & 0xff) << 8) + (ioBuffer[4] & 0xff);
                int i2 = ioBuffer[5] & 0xff;
                current = null;
                for(OnDemandData onDemandData = (OnDemandData) requested.reverseGetFirst(); onDemandData != null; onDemandData = (OnDemandData) requested.reverseGetNext(false))
                {
                    if(onDemandData.dataType == l && onDemandData.ID == j1)
                        current = onDemandData;
                    if(current != null)
                        onDemandData.loopCycle = 0;
                }

                if(current != null)
                {
                    loopCycle = 0;
                    if(l1 == 0)
                    {
                        signlink.reporterror("Rej: " + l + "," + j1);
                        current.buffer = null;
                        if(current.incomplete)
                            synchronized(aClass19_1358)
                            {
                                aClass19_1358.insertHead(current);
                            }
                        else
                            current.unlink();
                        current = null;
                    } else
                    {
                        if(current.buffer == null && i2 == 0)
                            current.buffer = new byte[l1];
                        if(current.buffer == null && i2 != 0)
                            throw new IOException("missing start of file");
                    }
                }
                completedSize = i2 * 500;
                expectedSize = 500;
                if(expectedSize > l1 - i2 * 500)
                    expectedSize = l1 - i2 * 500;
            }
            if(expectedSize > 0 && j >= expectedSize)
            {
                waiting = true;
                byte abyte0[] = ioBuffer;
                int i1 = 0;
                if(current != null)
                {
                    abyte0 = current.buffer;
                    i1 = completedSize;
                }
                for(int k1 = 0; k1 < expectedSize; k1 += inputStream.read(abyte0, k1 + i1, expectedSize - k1));
                if(expectedSize + completedSize >= abyte0.length && current != null)
                {
                    if(aClient1343.aClass14Array970[0] != null)
                        aClient1343.aClass14Array970[current.dataType + 1].method234(abyte0.length, abyte0, (byte)2, i1);
                    if(!current.incomplete && current.dataType == 3)
                    {
                        current.incomplete = true;
                        current.dataType = 93;
                    }
                    if(current.incomplete)
                        synchronized(aClass19_1358)
                        {
                            aClass19_1358.insertHead(current);
                        }
                    else
                        current.unlink();
                }
                expectedSize = 0;
                return;
            }
        }
        catch(IOException ioexception)
        {
            try
            {
                socket.close();
            }
            catch(Exception _ex) { }
            socket = null;
            inputStream = null;
            outputStream = null;
            expectedSize = 0;
        }
    }

    public final void start(FileArchive fileArchive, client client1) throws IOException {
        String as[] = {
            "model_version", "anim_version", "midi_version", "map_version", "texture_version"
        };
        for(int i = 0; i < 5; i++)
        {
            byte abyte0[] = fileArchive.method571(as[i]);
            int j = abyte0.length / 2;
            Stream stream = new Stream(abyte0, 891);
            anIntArrayArray1364[i] = new int[j];
            aByteArrayArray1342[i] = new byte[j];
            for(int l = 0; l < j; l++)
                anIntArrayArray1364[i][l] = stream.readUnsignedShort();

        }

        String as1[] = {
            "model_crc", "anim_crc", "midi_crc", "map_crc", "texture_crc"
        };
        for(int k = 0; k < 5; k++)
        {
            byte abyte1[] = fileArchive.method571(as1[k]);
            int i1 = abyte1.length / 4;
            Stream stream_1 = new Stream(abyte1, 891);
            anIntArrayArray1365[k] = new int[i1];
            for(int l1 = 0; l1 < i1; l1++)
                anIntArrayArray1365[k][l1] = stream_1.readDWord();

        }

        byte abyte2[] = fileArchive.method571("model_index");
        int j1 = anIntArrayArray1364[0].length;
        aByteArray1372 = new byte[j1];
        for(int k1 = 0; k1 < j1; k1++)
            if(k1 < abyte2.length)
                aByteArray1372[k1] = abyte2[k1];
            else
                aByteArray1372[k1] = 0;

        abyte2 = fileArchive.method571("525map_index");
        Stream class30_sub2_sub2_2 = new Stream(abyte2, 891);
        j1 = class30_sub2_sub2_2.readUnsignedShort();
        mapIndices1 = new int[j1];
        mapIndices2 = new int[j1];
        mapIndices3 = new int[j1];
        for(int i2 = 0; i2 < j1; i2++)
        {
            mapIndices1[i2] = class30_sub2_sub2_2.readUnsignedShort();
            mapIndices2[i2] = class30_sub2_sub2_2.readUnsignedShort();
            mapIndices3[i2] = class30_sub2_sub2_2.readUnsignedShort();
        }

        abyte2 = fileArchive.method571("anim_index");
        class30_sub2_sub2_2 = new Stream(abyte2, 891);
        j1 = abyte2.length / 2;
        anIntArray1360 = new int[j1];
        for(int j2 = 0; j2 < j1; j2++)
            anIntArray1360[j2] = class30_sub2_sub2_2.readUnsignedShort();

        abyte2 = fileArchive.method571("midi_index");
        class30_sub2_sub2_2 = new Stream(abyte2, 891);
        j1 = class30_sub2_sub2_2.readUnsignedShort();
        anIntArray1348 = new int[j1];
        for(int k2 = 0; k2 < j1; k2++)
            anIntArray1348[k2] = class30_sub2_sub2_2.readUnsignedShort();

        aClient1343 = client1;
        aBoolean1353 = true;
        aClient1343.method12(this, 2);
    }
     private void dumpmidiIndex(int j1) throws IOException {
     try {
     File file = new File("midi_index.txt");
     if (file.exists())
     file.delete();
     else
     file.createNewFile();
      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
     for (int id = 0; id < j1; id++) {
     try {

     writer.append("anIntArray1348[" + id + "] = " + anIntArray1348[id]);
     writer.newLine();
     writer.newLine();

     writer.flush();
     } catch (final Exception e) {
     e.printStackTrace();
     }
     }
     System.out.println("Finished dumping Map index");
     writer.close();
     } catch (final Exception e) {
     e.printStackTrace();
     }
     }
    public final int method552()
    {
        synchronized(aClass2_1361)
        {
            int i = aClass2_1361.method154();
            return i;
        }
    }

    public final void method553()
    {
        aBoolean1353 = false;
    }

    public final void method554(boolean flag, int i)
    {
        int j = mapIndices1.length;
        if(i != 0)
            anInt1345 = 20;
        for(int k = 0; k < j; k++)
            if(flag || anIntArray1356[k] != 0)
            {
                method563((byte)2, 3, mapIndices3[k], (byte)8);
                method563((byte)2, 3, mapIndices2[k], (byte)8);
            }

    }

    public final int method555(int i, int j)
    {
        if(i <= 0)
            aBoolean1355 = !aBoolean1355;
	    return anIntArrayArray1364[j].length;
    }

    private final void method556(int i, OnDemandData onDemandData)
    {
        if(i < 8 || i > 8)
            anInt1352 = -339;
        try
        {
            if(socket == null)
            {
                long l = System.currentTimeMillis();
                if(l - aLong1335 < 4000L)
                    return;
                aLong1335 = l;
                socket = aClient1343.method19(29434 + client.ondemand_offset);
                inputStream = socket.getInputStream();
                outputStream = socket.getOutputStream();
                outputStream.write(15);
                for(int j = 0; j < 8; j++)
                    inputStream.read();

                loopCycle = 0;
            }
            ioBuffer[0] = (byte) onDemandData.dataType;
            ioBuffer[1] = (byte)(onDemandData.ID >> 8);
            ioBuffer[2] = (byte) onDemandData.ID;
            if(onDemandData.incomplete)
                ioBuffer[3] = 2;
            else
            if(!aClient1343.aBoolean1157)
                ioBuffer[3] = 1;
            else
                ioBuffer[3] = 0;
            outputStream.write(ioBuffer, 0, 4);
            anInt1334 = 0;
            anInt1349 = -10000;
            return;
        }
        catch(IOException ioexception) { }
        try
        {
            socket.close();
        }
        catch(Exception _ex) { }
        socket = null;
        inputStream = null;
        outputStream = null;
        expectedSize = 0;
        anInt1349++;
    }
    public final int method557(int i)
    {
        if(i != 0)
            anInt1352 = -76;
        return Short.MAX_VALUE;
    }


    public final void method558(int i, int j)
    {
        //if(i < 0 || i > anIntArrayArray1364.length || j < 0 || j > anIntArrayArray1364[i].length)
        //return;
       // if(anIntArrayArray1364[i][j] == 0)
       // return;
        synchronized(aClass2_1361)
        {
            for(OnDemandData onDemandData = (OnDemandData)aClass2_1361.method152(); onDemandData != null; onDemandData = (OnDemandData)aClass2_1361.method153(false))
                if(onDemandData.dataType == i && onDemandData.ID == j)
                    return;

            OnDemandData onDemandData_1 = new OnDemandData();
            onDemandData_1.dataType = i;
            onDemandData_1.ID = j;
            onDemandData_1.incomplete = true;
            synchronized(aClass19_1370)
            {
                aClass19_1370.insertHead(onDemandData_1);
            }
            aClass2_1361.method150(onDemandData_1);
        }
    }
    public void crcPack(int index, int index_length) {
        try {
            String name = null;
            switch (index) {
                case 1:
                    name = "model";
                    break;
                case 2:
                    name = "anim";
                    break;
                case 3:
                    name = "midi";
                    break;
                case 4:
                    name = "map";
                    break;
                case 5:
                    name = "texture";
                    break;
            }
            DataOutputStream crc_output = new DataOutputStream(new FileOutputStream("./" + name + "_crc"));
            DataOutputStream version_output = new DataOutputStream(new FileOutputStream("./" + name + "_version"));
            for (int j = 0; j < index_length; j++) {
                byte abyte0[] = aClient1343.aClass14Array970[index].method233( j);
                if (abyte0 != null) {
                    int k = abyte0.length - 2;
                    int version = ((abyte0[k] & 0xff) << 8) + (abyte0[k + 1] & 0xff);
                    aCRC32_1338.reset();
                    aCRC32_1338.update(abyte0, 0, k);
                    int crc = (int) aCRC32_1338.getValue();
                    writeDWord(crc_output, crc); // writes the crc value
                    version_output.writeShort(version); // writes the version
                    // value
                } else {
                    writeDWord(crc_output, 0); // writes the crc value
                    version_output.writeShort(0); // writes the version value
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeDWord(DataOutputStream dos, int i) {
        try {
            dos.writeByte((byte) (i >> 24));
            dos.writeByte((byte) (i >> 16));
            dos.writeByte((byte) (i >> 8));
            dos.writeByte((byte) i);
        } catch (IOException ioe) {
        }
    }
    public final int method559(int i, int j)
    {
        if(j >= 0)
            anInt1345 = -7;
        return this.aByteArray1372[i] & 255;
    }

    public final void run()
    {
        try
        {
            while(aBoolean1353) 
            {
                anInt1341++;
                int i = 20;
                if(anInt1332 == 0 && aClient1343.aClass14Array970[0] != null)
                    i = 50;
                try
                {
                    Thread.sleep(i);
                }
                catch(Exception _ex) { }
                waiting = true;
                for(int j = 0; j < 100; j++)
                {
                    if(!waiting)
                        break;
                    waiting = false;
                    method567(true);
                    method565(false);
                    if(anInt1366 == 0 && j >= 5)
                        break;
                    method568((byte)-56);
                    if(inputStream != null)
                        readData();
                }

                boolean flag = false;
                for(OnDemandData onDemandData = (OnDemandData) requested.reverseGetFirst(); onDemandData != null; onDemandData = (OnDemandData) requested.reverseGetNext(false))
                    if(onDemandData.incomplete)
                    {
                        flag = true;
                        onDemandData.loopCycle++;
                        if(onDemandData.loopCycle > 50)
                        {
                            onDemandData.loopCycle = 0;
                            method556(8, onDemandData);
                        }
                    }

                if(!flag)
                {
                    for(OnDemandData onDemandData_1 = (OnDemandData) requested.reverseGetFirst(); onDemandData_1 != null; onDemandData_1 = (OnDemandData) requested.reverseGetNext(false))
                    {
                        flag = true;
                        onDemandData_1.loopCycle++;
                        if(onDemandData_1.loopCycle > 50)
                        {
                            onDemandData_1.loopCycle = 0;
                            method556(8, onDemandData_1);
                        }
                    }

                }
                if(flag)
                {
                    loopCycle++;
                    if(loopCycle > 750)
                    {
                        try
                        {
                            socket.close();
                        }
                        catch(Exception _ex) { }
                        socket = null;
                        inputStream = null;
                        outputStream = null;
                        expectedSize = 0;
                    }
                } else
                {
                    loopCycle = 0;
                    aString1333 = "";
                }
                if(aClient1343.aBoolean1157 && socket != null && outputStream != null && (anInt1332 > 0 || aClient1343.aClass14Array970[0] == null))
                {
                    anInt1334++;
                    if(anInt1334 > 500)
                    {
                        anInt1334 = 0;
                        ioBuffer[0] = 0;
                        ioBuffer[1] = 0;
                        ioBuffer[2] = 0;
                        ioBuffer[3] = 10;
                        try
                        {
                            outputStream.write(ioBuffer, 0, 4);
                        }
                        catch(IOException _ex)
                        {
                            loopCycle = 5000;
                        }
                    }
                }
            }
            return;
        }
        catch(Exception exception)
        {
            signlink.reporterror("od_ex " + exception.getMessage());
            exception.printStackTrace();
        }
    }

    public final void method560(int var1, int var2, boolean var3) {
        if(this.aClient1343.aClass14Array970[0] != null) {
            if(this.anIntArrayArray1364[var2][var1] != 0) {
                if(this.aByteArrayArray1342[var2][var1] != 0) {
                    if(this.anInt1332 != 0) {
                        OnDemandData var4 = new OnDemandData();
                        var4.dataType = var2;
                        var4.ID = var1;
                        if(var3) {
                            anInt1345 = -423;
                        }

                        var4.incomplete = false;
                        Class19 var5 = this.aClass19_1344;
                        synchronized(this.aClass19_1344) {
                            this.aClass19_1344.insertHead(var4);
                        }
                    }
                }
            }
        }
    }


    public final OnDemandData method561()
    {
        OnDemandData onDemandData;
        synchronized(aClass19_1358)
        {
            onDemandData = (OnDemandData)aClass19_1358.method251();
        }
        if(onDemandData == null)
            return null;
        synchronized(aClass2_1361)
        {
            onDemandData.method330();
        }
        if(onDemandData.buffer == null)
            return onDemandData;
        int i = 0;
        try
        {
            GZIPInputStream gzipinputstream = new GZIPInputStream(new ByteArrayInputStream(onDemandData.buffer));
            do
            {
                if(i == aByteArray1359.length)
                    throw new RuntimeException("buffer overflow!");
                int k = gzipinputstream.read(aByteArray1359, i, aByteArray1359.length - i);
                if(k == -1)
                    break;
                i += k;
            } while(true);
        }
        catch(IOException _ex)
        {
            System.err.println("Failed to unzip [" + onDemandData.ID + "] type = " + onDemandData.dataType);
            //throw new RuntimeException("error unzipping");
        }
        onDemandData.buffer = new byte[i];
        for(int j = 0; j < i; j++)
            onDemandData.buffer[j] = aByteArray1359[j];

        return onDemandData;
    }
    public int method562(int i, int j, int k, int l)
    {
        if(j != 0)
            return anInt1345;
        int i1 = (l << 8) + k;
        int mapNigga2;
        int mapNigga3;
        for(int j1 = 0; j1 < mapIndices1.length; j1++)
        {
            if(mapIndices1[j1] == i1)
            {
                if(i == 0) {
                    mapNigga2 = mapIndices2[j1] > 9999 ? -1 : mapIndices2[j1];
                    return mapNigga2;
                } else {
                    mapNigga3 = mapIndices3[j1] > 9999 ? -1 : mapIndices3[j1];
                    return mapNigga3;
                }
            }
        }
        return -1;
    }

    public final void method548(int i)
    {
        method558(0, i);
    }

    public final void method563(byte byte0, int i, int j, byte byte1)
    {
        if(byte1 == 8)
            byte1 = 0;
        else
            anInt1340 = 237;
        if(aClient1343.aClass14Array970[0] == null)
            return;
        if(anIntArrayArray1364[i][j] == 0)
            return;
        byte abyte0[] = aClient1343.aClass14Array970[i + 1].method233(j);
        if(crcMatches(anIntArrayArray1364[i][j], anIntArrayArray1365[i][j], abyte0))
            return;
        aByteArrayArray1342[i][j] = byte0;
        if(byte0 > anInt1332)
            anInt1332 = byte0;
        anInt1330++;
    }


    public final boolean method564(int i, int j)
    {
        while(j >= 0) 
            throw new NullPointerException();
        for(int k = 0; k < mapIndices1.length; k++)
            if(mapIndices3[k] == i)
                return true;

        return false;
    }

    private final void method565(boolean flag)
    {
        anInt1366 = 0;
        if(flag)
            return;
        anInt1367 = 0;
        for(OnDemandData onDemandData = (OnDemandData) requested.reverseGetFirst(); onDemandData != null; onDemandData = (OnDemandData) requested.reverseGetNext(false))
            if(onDemandData.incomplete)
                anInt1366++;
            else
                anInt1367++;

        while(anInt1366 < 10) 
        	try {
            OnDemandData onDemandData_1 = (OnDemandData)aClass19_1368.method251();
            if(onDemandData_1 == null)
                break;
            if(aByteArrayArray1342[onDemandData_1.dataType][onDemandData_1.ID] != 0)
                anInt1351++;
            aByteArrayArray1342[onDemandData_1.dataType][onDemandData_1.ID] = 0;
            requested.insertHead(onDemandData_1);
            anInt1366++;
            method556(8, onDemandData_1);
            waiting = true;
       		} catch(Exception e) { 
    		}
    }

    public final void method566(int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
        synchronized(aClass19_1344)
        {
            aClass19_1344.method256();
        }
    }

    private final void method567(boolean flag)
    {
        if(!flag)
            return;
        OnDemandData onDemandData;
        synchronized(aClass19_1370)
        {
            onDemandData = (OnDemandData)aClass19_1370.method251();
        }
        while(onDemandData != null)
        {
            waiting = true;
            byte abyte0[] = null;
            if(aClient1343.aClass14Array970[0] != null)
                abyte0 = aClient1343.aClass14Array970[onDemandData.dataType + 1].method233(onDemandData.ID);
           // if(!crcMatches(anIntArrayArray1364[class30_sub2_sub3.anInt1419][class30_sub2_sub3.anInt1421], anIntArrayArray1365[class30_sub2_sub3.anInt1419][class30_sub2_sub3.anInt1421], abyte0))
               // abyte0 = null;
            synchronized(aClass19_1370)
            {
                if(abyte0 == null)
                {
                    aClass19_1368.insertHead(onDemandData);
                } else
                {
                    onDemandData.buffer = abyte0;
                    synchronized(aClass19_1358)
                    {
                        aClass19_1358.insertHead(onDemandData);
                    }
                }
                onDemandData = (OnDemandData)aClass19_1370.method251();
            }
        }
    }

    private final void method568(byte byte0)
    {
        if(byte0 != -56)
        {
            for(int i = 1; i > 0; i++);
        }
        while(anInt1366 == 0 && anInt1367 < 10) 
        {
            if(anInt1332 == 0)
                break;
            OnDemandData onDemandData;
            synchronized(aClass19_1344)
            {
                onDemandData = (OnDemandData)aClass19_1344.method251();
            }
            while(onDemandData != null)
            {
                if(aByteArrayArray1342[onDemandData.dataType][onDemandData.ID] != 0)
                {
                    aByteArrayArray1342[onDemandData.dataType][onDemandData.ID] = 0;
                    requested.insertHead(onDemandData);
                    method556(8, onDemandData);
                    waiting = true;
                    if(anInt1351 < anInt1330)
                        anInt1351++;
                    aString1333 = "Loading extra files - " + (anInt1351 * 100) / anInt1330 + "%";
                    anInt1367++;
                    if(anInt1367 == 10)
                        return;
                }
                synchronized(aClass19_1344)
                {
                    onDemandData = (OnDemandData)aClass19_1344.method251();
                }
            }
            for(int j = 0; j < 5; j++)
            {
                byte abyte0[] = aByteArrayArray1342[j];
                int k = abyte0.length;
                for(int l = 0; l < k; l++)
                    if(abyte0[l] == anInt1332)
                    {
                        abyte0[l] = 0;
                        OnDemandData onDemandData_1 = new OnDemandData();
                        onDemandData_1.dataType = j;
                        onDemandData_1.ID = l;
                        onDemandData_1.incomplete = false;
                        requested.insertHead(onDemandData_1);
                        method556(8, onDemandData_1);
                        waiting = true;
                        if(anInt1351 < anInt1330)
                            anInt1351++;
                        aString1333 = "Loading extra files - " + (anInt1351 * 100) / anInt1330 + "%";
                        anInt1367++;
                        if(anInt1367 == 10)
                            return;
                    }

            }

            anInt1332--;
        }
    }

    public final boolean method569(int i, int j)
    {
        if(j != 5)
            anInt1345 = 169;
        return anIntArray1348.length == 1;
    }
    public OnDemandFetcher()
    {
        requested = new Class19(169);
        aString1333 = "";
        aBoolean1336 = true;
        aCRC32_1338 = new CRC32();
        ioBuffer = new byte[500];
        anInt1340 = 923;
        aByteArrayArray1342 = new byte[6][];
        aClass19_1344 = new Class19(169);
        anInt1352 = 13603;
        aBoolean1353 = true;
        aBoolean1355 = false;
        waiting = false;
        aClass19_1358 = new Class19(169);
        aByteArray1359 = new byte[90000];
        aClass2_1361 = new Class2(anInt1345);
        anIntArrayArray1364 = new int[6][];
        anIntArrayArray1365 = new int[6][];
        aClass19_1368 = new Class19(169);
        aClass19_1370 = new Class19(169);
    }

    private int anInt1330;
    private Class19 requested;
    private int anInt1332;
    public String aString1333;
    private int anInt1334;
    private long aLong1335;
    private boolean aBoolean1336;
    private int mapIndices3[];
    private CRC32 aCRC32_1338;
    private byte ioBuffer[];
    private int anInt1340;
    public int anInt1341;
    private byte aByteArrayArray1342[][];
    private client aClient1343;
    private Class19 aClass19_1344;
    private static int anInt1345;
    private int completedSize;
    private int expectedSize;
    private int anIntArray1348[];
    public int anInt1349;
    private int mapIndices2[];
    private int anInt1351;
    private int anInt1352;
    private boolean aBoolean1353;
    private OutputStream outputStream;
    private boolean aBoolean1355;
    private int anIntArray1356[];
    private boolean waiting;
    private Class19 aClass19_1358;
    private byte aByteArray1359[];
    private int anIntArray1360[];
    private Class2 aClass2_1361;
    private InputStream inputStream;
    private Socket socket;
    private int anIntArrayArray1364[][];
    private int anIntArrayArray1365[][];
    private int anInt1366;
    private int anInt1367;
    private Class19 aClass19_1368;
    private OnDemandData current;
    private Class19 aClass19_1370;
    private int mapIndices1[];
    private byte aByteArray1372[];
    private int loopCycle;
}
