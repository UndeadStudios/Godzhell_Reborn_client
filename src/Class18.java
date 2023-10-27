// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import sign.signlink;

public class Class18
{
    public Class18(Class30_Sub2_Sub2 stream,int junk)
    {
        int anInt341 = stream.method410();
	anIntArray342 = new int[anInt341];
        anIntArrayArray343 = new int[anInt341][];
        for(int j = 0; j < anInt341; j++)
            anIntArray342[j] = stream.method410();

	for(int j = 0; j < anInt341; j++)
	    anIntArrayArray343[j] = new int[stream.method410()];

        for(int j = 0; j < anInt341; j++)
		for (int l = 0; l < anIntArrayArray343[j].length; l++)
			anIntArrayArray343[j][l] = stream.method410();
    }

    private int anInt340;
    public int anInt341;
    public int anIntArray342[];
    public int anIntArrayArray343[][];
}
