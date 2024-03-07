// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

public class Class23
{

    public static void method264(int i, Class44 class44)
    {
        Stream stream = new Stream(class44.method571("spotanim.dat", null));
        anInt402 = stream.readUnsignedShort();
        if(aClass23Array403 == null)
            aClass23Array403 = new Class23[anInt402];
        for(int j = 0; j < anInt402; j++)
        {
            if(aClass23Array403[j] == null)
                aClass23Array403[j] = new Class23();
            aClass23Array403[j].anInt404 = j;
            aClass23Array403[j].method265(stream);
		}
    }
	public void method265(Stream stream)
    {
        do {
		anInt405 = stream.readUnsignedShort();
		anInt406 = stream.readUnsignedShort();
        if(Class20.aClass20Array351 != null && anInt406 != 65535 && anInt406 != -1)
         aClass20_407 = Class20.aClass20Array351[anInt406];
        anInt410 = stream.readUnsignedByte();
        anInt411 = stream.readUnsignedByte();
		int j = stream.readUnsignedByte();
		if(j != 0){
			for (int k = 0; k < j; k++)
				anIntArray408[k] = stream.readUnsignedShort();
			for (int k = 0; k < j; k++)
				anIntArray409[k] = stream.readUnsignedShort();
		}
		break;
        } while(true);
    }

    public Class30_Sub2_Sub4_Sub6 method266()
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_415.method222(anInt404);
        if(class30_sub2_sub4_sub6 != null)
            return class30_sub2_sub4_sub6;
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt400, anInt405);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        for(int i = 0; i < 6; i++)
            if(anIntArray408[0] != 0)
                class30_sub2_sub4_sub6.method476(anIntArray408[i], anIntArray409[i]);

        aClass12_415.method223(class30_sub2_sub4_sub6, anInt404, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public Class23()
    {
        anInt400 = 9;
        anInt406 = -1;
        anIntArray408 = new int[11];
        anIntArray409 = new int[11];
        anInt410 = 128;
        anInt411 = 128;
    }

    private int anInt400;
    private static boolean aBoolean401 = true;
    public static int anInt402;
    public static Class23 aClass23Array403[];
    public int anInt404;
    public int anInt405;
    public int anInt406;
    public Class20 aClass20_407;
    public int anIntArray408[];
    public int anIntArray409[];
    public int anInt410;
    public int anInt411;
    public int anInt412;
    public int anInt413;
    public int anInt414;
    public static Class12 aClass12_415 = new Class12(false, 30);

}