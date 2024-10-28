import sign.signlink;
import java.io.*;
import java.util.stream.IntStream;

final class Class5
{

    public static final Class5 method159(int i)
    {
        for(int j = 0; j < 20; j++)
            if(aClass5Array80[j].aLong78 == (long)i)
                return aClass5Array80[j];

        anInt56 = (anInt56 + 1) % 20;
        Class5 class5 = aClass5Array80[anInt56] = new Class5();
        aStream_60.currentPosition = anIntArray72[i];
        class5.aLong78 = i;
        class5.method165(aStream_60);

		if(i == 97) {
			aStream_60.currentPosition = anIntArray72[630];
			class5.method165(aStream_60);
			class5.aStringArray66 = new String[5];
			class5.aStringArray66[1] = "Attack";
			class5.anInt61 = 105;
			class5.name = "Pikachu";
			class5.anInt83 = -1;
			class5.anIntArray94 = new int[1];
			class5.anIntArray94[0] = 35223;
 			class5.aByteArray89 = "It\'s Pikachu.".getBytes();
		}
				if(i == 96) {
			aStream_60.currentPosition = anIntArray72[630];
			class5.method165(aStream_60);
			class5.aStringArray66 = new String[5];
			class5.aStringArray66[1] = "Attack";
			class5.anInt61 = 315;
			class5.name = "Charmander";
			class5.anInt83 = -1;
			class5.anIntArray94 = new int[1];
			class5.anIntArray94[0] = 32345;
 			class5.aByteArray89 = "It\'s a Charmander.".getBytes();
		}
				if(i == 95) {
			aStream_60.currentPosition = anIntArray72[630];
			class5.method165(aStream_60);
			class5.aStringArray66 = new String[5];
			class5.aStringArray66[1] = "Attack";
			class5.anInt61 = 420;
			class5.name = "Thugbob";
			class5.anInt83 = -1;
			class5.anIntArray94 = new int[1];
			class5.anIntArray94[0] = 31123;
 			class5.aByteArray89 = "It\'s a .... thug.".getBytes();
		}
				if(i == 98) {
			aStream_60.currentPosition = anIntArray72[630];
			class5.method165(aStream_60);
			class5.aStringArray66 = new String[5];
			class5.aStringArray66[1] = "Attack";
			class5.anInt61 = 205;
			class5.name = "Homer";
			class5.anInt83 = -1;
			class5.anIntArray94 = new int[1];
			class5.anIntArray94[0] = 35229;
 			class5.aByteArray89 = "It\'s a homer.".getBytes();
		}
						if(i == 7943) {
			class5.aStringArray66 = new String[5];
			class5.aStringArray66[1] = "Attack";
			class5.name = " King Green Dragon";
 			class5.aByteArray89 = "wtf green kbd??".getBytes();
		}
				        if(i == 945) { // NPC ID, can be changed.
						    class5.name = "Ghreborn Guide"; // NPC name
						    class5.aByteArray89 = "It's a Ghreborn guide.".getBytes(); // NPC description, you must leave the .getBytes() at the end or it will not work.
				}
return class5;
    }
	   public static void dumpNpc() {
		      for(int i = 0; i < 9000; ++i) {
		         Class5 EntityDef = method159(i);
		         BufferedWriter bw = null;

		         try {
		            bw = new BufferedWriter(new FileWriter(signlink.findcachedir() + "/dumps/NpcList.txt", true));
		            if(EntityDef.name != null) {
		               bw.write("////////////////////////////////////////////");
		               bw.newLine();
		               bw.newLine();
		               bw.newLine();
		               bw.write("if(i == " + i + ") {//Npc ID");
		               bw.newLine();
		               bw.write("EntityDef.name = \"" + EntityDef.name + "\";//Npc Name");
		               bw.newLine();
		               bw.write("EntityDef.combatLevel = " + EntityDef.anInt61 + ";//Npc Combat");
		               bw.newLine();
		               bw.write("class5.standAnim = " + EntityDef.anInt77 + ";//Stand Animation  (Default = 808)");
		               bw.newLine();
		               bw.write("class5.walkAnim = " + EntityDef.anInt67 + ";//Walk Forward Animation (Default = 819");
		               bw.newLine();
		               bw.write("class5.anInt58 = " + EntityDef.anInt58 + ";//Walk Backwards Animation (Retreat) (Default = 820)");
		               bw.newLine();
		               bw.write("class5.anInt55 = " + EntityDef.anInt55 + ";//Walk Right (Default = 822)");
		               bw.newLine();
		               bw.write("class5.anInt83 = " + EntityDef.anInt83 + ";//Walk Left (Default = 821)");
		               bw.newLine();
		               int i2;
		               if(EntityDef.anIntArray94 != null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray94.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("EntityDef.npcModels[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray94.length - 1) {
		                        bw.write(EntityDef.anIntArray94[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray94[i2] + ";//Npc Model/Models. ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               if(EntityDef.anIntArray76 != null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray76.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("EntityDef.originalModelColors[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray76.length - 1) {
		                        bw.write(EntityDef.anIntArray76[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray76[i2] + ";//Old Colours ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               if(EntityDef.anIntArray70!= null) {
		                  for(i2 = 0; i2 < EntityDef.anIntArray70.length; ++i2) {
		                     if(i2 == 0) {
		                        bw.write("EntityDef.changedModelColors[0] = ");
		                     }

		                     if(i2 != EntityDef.anIntArray70.length - 1) {
		                        bw.write(EntityDef.anIntArray70[i2] + "; ");
		                     } else {
		                        bw.write(EntityDef.anIntArray70[i2] + ";//New Colours ");
		                        bw.newLine();
		                     }
		                  }
		               }

		               bw.write("}");
		               bw.newLine();
		               bw.flush();
		               bw.close();
		            }
		         } catch (IOException var4) {
		            ;
		         }
		      }

		   }
    public final Model method160(boolean flag)
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161();
            if(class5 == null)
                return null;
            else
                return class5.method160(true);
        }
        if(anIntArray73 == null)
            return null;
        boolean flag1 = false;
        if(!flag)
            anInt64 = 303;
        for(int i = 0; i < anIntArray73.length; i++)
            if(!Model.method463(anIntArray73[i]))
                flag1 = true;

        if(flag1)
            return null;
        Model aclass30_sub2_sub4_sub6[] = new Model[anIntArray73.length];
        for(int j = 0; j < anIntArray73.length; j++)
            aclass30_sub2_sub4_sub6[j] = Model.method462(anInt69, anIntArray73[j]);

        Model model;
        if(aclass30_sub2_sub4_sub6.length == 1)
            model = aclass30_sub2_sub4_sub6[0];
        else
            model = new Model(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
        if(anIntArray76 != null)
        {
            for(int k = 0; k < anIntArray76.length; k++)
                model.method476(anIntArray76[k], anIntArray70[k]);

        }
        return model;
    }

    public final Class5 method161() {
	int j = -1;
        if(anInt57 != -1) {
        try{
            VarBit varBit = VarBit.cache[anInt57];
            int k = varBit.anInt648;
            int l = varBit.anInt649;
            int i1 = varBit.anInt650;
            int j1 = client.anIntArray1232[i1 - l];
            j = aClient82.variousSettings[k] >> l & j1;
			} catch (Exception failed) {}
        } else
        if(anInt59 != -1)
            j = aClient82.variousSettings[anInt59];
        if(j < 0 || j >= anIntArray88.length || anIntArray88[j] == -1)
            return null;
        else
            return method159(anIntArray88[j]);
    }

    public static final void method162(FileArchive fileArchive)
    {
        aStream_60 = new Stream(fileArchive.method571("npc.dat"), 891);
        Stream stream = new Stream(fileArchive.method571("npc.idx"), 891);
        anInt62 = stream.readUnsignedShort();
        anIntArray72 = new int[anInt62];
        int i = 2;
        for(int j = 0; j < anInt62; j++)
        {
            anIntArray72[j] = i;
            i += stream.readUnsignedShort();
        }

        aClass5Array80 = new Class5[20];
        for(int k = 0; k < 20; k++)
            aClass5Array80[k] = new Class5();
		//dumpNpccfg();
		if (Configuration.dumpDataLists) {

			TempWriter writer2 = new TempWriter("npc_fields");
			FieldGenerator generator = new FieldGenerator(writer2::writeLine);
			IntStream.range(0, 100_000).forEach(id -> {
				try {
					Class5 definition = Class5.method159(id);
					generator.add(definition.name, id);
				} catch (Exception e) {}
			});
			writer2.close();
		}
    }
	
		public static void dumpNpcList() {
	for(int i = 0; i < anInt62; i++) {
	Class5 class5 = method159(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter("Npccconfigs.txt", true));
	if(class5.name != null) {
	bw.write("ID: "+i+"\t\tName: "+class5.name.replace(" ", "_")+", Combat: "+class5.anInt61+" walk anim: "+class5.anInt67+" stand anim: "+ class5.anInt77+" walking right anim: "+class5.anInt55+" walk left anim: "+class5.anInt83);
	bw.newLine();
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}
		public static void dumpNpccfg() {
	for(int i = 8589; i < anInt62; i++) {
	Class5 class5 = method159(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter("npc.cfg", true));
	if(class5.name != null) {
	bw.write("npc = "+i+"\t"+class5.name.replace(" ", "_")+"\t"+class5.anInt61+"\t0\t"+class5.aByte68+"");
	bw.newLine();
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}

    public static final void method163(int i)
    {
        aClass12_95 = null;
        anIntArray72 = null;
        if(i >= 0)
            anInt74 = 60;
        aClass5Array80 = null;
        aStream_60 = null;
    }

    public final Model method164(int i, int j, int k, int ai[])
    {
        if(anIntArray88 != null)
        {
            Class5 class5 = method161();
            if(class5 == null)
                return null;
            else
                return class5.method164(0, j, k, ai);
        }
        Model model = (Model)aClass12_95.method222(aLong78);
        if(i != 0)
        {
            for(int l = 1; l > 0; l++);
        }
        if(model == null)
        {
            boolean flag = false;
            for(int i1 = 0; i1 < anIntArray94.length; i1++)
                if(!Model.method463(anIntArray94[i1]))
                    flag = true;

            if(flag)
                return null;
            Model aclass30_sub2_sub4_sub6[] = new Model[anIntArray94.length];
            for(int j1 = 0; j1 < anIntArray94.length; j1++)
                aclass30_sub2_sub4_sub6[j1] = Model.method462(anInt69, anIntArray94[j1]);

            if(aclass30_sub2_sub4_sub6.length == 1)
                model = aclass30_sub2_sub4_sub6[0];
            else
                model = new Model(aclass30_sub2_sub4_sub6.length, aclass30_sub2_sub4_sub6, -38);
            if(anIntArray76 != null)
            {
                for(int k1 = 0; k1 < anIntArray76.length; k1++)
                    model.method476(anIntArray76[k1], anIntArray70[k1]);

            }
            model.method469((byte)-71);
            model.method479(64 + anInt85, 850 + anInt92, -30, -50, -30, true);
            aClass12_95.method223(model, aLong78, (byte)2);
        }
        Model model_1 = Model.aModel_1621;
        model_1.method464(7, model, Class36.method532(k, false) & Class36.method532(j, false));
        if(k != -1 && j != -1)
            model_1.method471(-20491, ai, j, k);
        else
        if(k != -1)
            model_1.method470(k, 40542);
        if(anInt91 != 128 || anInt86 != 128)
            model_1.method478(anInt91, anInt91, anInt63, anInt86);
        model_1.method466(false);
        model_1.anIntArrayArray1658 = null;
        model_1.anIntArrayArray1657 = null;
        if(aByte68 == 1)
            model_1.aBoolean1659 = true;
        return model_1;
    }

	private void method165(Stream stream)
	{
		do
		{
			int i = stream.readUnsignedByte();
			if(i == 0)
				return;
			if(i == 1)
			{
				int j = stream.readUnsignedByte();
				anIntArray94 = new int[j];
				for(int j1 = 0; j1 < j; j1++)
					anIntArray94[j1] = stream.readUnsignedShort();

			} else
			if(i == 2)
				name = stream.readString();
			else
			if(i == 3)
				aByteArray89 = stream.method416((byte)30);
			else
			if(i == 12)
				aByte68 = stream.readSignedByte();
			else
			if(i == 13)
				anInt77 = stream.readUnsignedShort();
			else
			if(i == 14)
				anInt67 = stream.readUnsignedShort();
			else
			if(i == 17)
			{
				anInt67 = stream.readUnsignedShort();
				anInt58 = stream.readUnsignedShort();
				anInt83 = stream.readUnsignedShort();
				anInt55 = stream.readUnsignedShort();
                if (anInt67 == 65535)
                    anInt67 = -1;
                if (anInt58 == 65535)
                    anInt58 = -1;
                if (anInt83 == 65535)
                    anInt83 = -1;
                if (anInt55 == 65535)
                    anInt55 = -1;
			} else
			if(i >= 30 && i < 40)
			{
				if(aStringArray66 == null)
					aStringArray66 = new String[5];
				aStringArray66[i - 30] = stream.readString();
				if(aStringArray66[i - 30].equalsIgnoreCase("hidden"))
					aStringArray66[i - 30] = null;
			} else
			if(i == 40)
			{
				int k = stream.readUnsignedByte();
				anIntArray76 = new int[k];
				anIntArray70 = new int[k];
				for(int k1 = 0; k1 < k; k1++)
				{
					anIntArray76[k1] = stream.readUnsignedShort();
					anIntArray70[k1] = stream.readUnsignedShort();
				}

			} else
			if(i == 60)
			{
				int l = stream.readUnsignedByte();
				anIntArray73 = new int[l];
				for(int l1 = 0; l1 < l; l1++)
					anIntArray73[l1] = stream.readUnsignedShort();

			} else
			if(i == 90)
				stream.readUnsignedShort();
			else
			if(i == 91)
				stream.readUnsignedShort();
			else
			if(i == 92)
				stream.readUnsignedShort();
			else
			if(i == 93)
				aBoolean87 = false;
			else
			if(i == 95)
				anInt61 = stream.readUnsignedShort();
			else
			if(i == 97)
				anInt91 = stream.readUnsignedShort();
			else
			if(i == 98)
				anInt86 = stream.readUnsignedShort();
			else
			if(i == 99)
				aBoolean93 = true;
			else
			if(i == 100)
				anInt85 = stream.readSignedByte();
			else
			if(i == 101)
				anInt92 = stream.readSignedByte() * 5;
			else
			if(i == 102)
				anInt75 = stream.readUnsignedShort();
			else
			if(i == 103)
				anInt79 = stream.readUnsignedShort();
			else
			if(i == 106)
			{
                anInt57 = stream.readUnsignedShort();
                if(anInt57 == 65535)
                    anInt57 = -1;
                anInt59 = stream.readUnsignedShort();
                if(anInt59 == 65535)
                    anInt59 = -1;
                int i1 = stream.readUnsignedByte();
                anIntArray88 = new int[i1 + 1];
                for(int i2 = 0; i2 <= i1; i2++)
                {
                    anIntArray88[i2] = stream.readUnsignedShort();
                    if(anIntArray88[i2] == 65535)
                        anIntArray88[i2] = -1;
                }

			} else
			if(i == 107)
				aBoolean84 = false;
		} while(true);
	}

    Class5()
    {
        anInt55 = -1;
        anInt57 = -1;
        anInt58 = -1;
        anInt59 = -1;
        anInt61 = -1;
        anInt63 = 9;
        anInt64 = 1834;
        anInt67 = -1;
        aByte68 = 1;
        anInt69 = 9;
        anInt71 = -1;
        anInt75 = -1;
        anInt77 = -1;
        aLong78 = -1L;
        anInt79 = 32;
        aBoolean81 = false;
        anInt83 = -1;
        aBoolean84 = true;
        anInt86 = 128;
        aBoolean87 = true;
        anInt90 = -1;
        anInt91 = 128;
        aBoolean93 = false;
        anInt96 = -1;
    }

    public int anInt55;
    private static int anInt56;
    public int anInt57;
    public int anInt58;
    public int anInt59;
    private static Stream aStream_60;
    public int anInt61;
    public static int anInt62;
    private int anInt63;
    private int anInt64;
    public String name;
    public String aStringArray66[];
    public int anInt67;
    public byte aByte68;
    private int anInt69;
    private int anIntArray70[];
    public int anInt71;
    private static int anIntArray72[];
    private int anIntArray73[];
    private static int anInt74 = 748;
    public int anInt75;
    private int anIntArray76[];
    public int anInt77;
    public long aLong78;
    public int anInt79;
    private static Class5 aClass5Array80[];
    private boolean aBoolean81;
    public static client aClient82;
    public int anInt83;
    public boolean aBoolean84;
    private int anInt85;
    private int anInt86;
    public boolean aBoolean87;
    public int anIntArray88[];
    public byte aByteArray89[];
    public int anInt90;
    private int anInt91;
    private int anInt92;
    public boolean aBoolean93;
    private int anIntArray94[];
    public static Class12 aClass12_95 = new Class12(false, 30);
    public int anInt96;

}
