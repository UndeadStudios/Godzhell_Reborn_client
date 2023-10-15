public class Class30_Sub2_Sub4_Sub5 extends Class30_Sub2_Sub4
{

    public final Class30_Sub2_Sub4_Sub6 method444(int i)
    {
        int j = -1;
        if(i != 4016)
            anInt1613 = -272;
        if(aClass20_1607 != null)
        {
            int k = client.anInt1161 - anInt1608;
            if(k > 100 && aClass20_1607.anInt356 > 0)
                k = 100;
            while(k > aClass20_1607.method258(anInt1599, (byte)-39)) 
            {
                k -= aClass20_1607.method258(anInt1599, (byte)-39);
                anInt1599++;
                if(anInt1599 < aClass20_1607.anInt352)
                    continue;
                anInt1599 -= aClass20_1607.anInt356;
                if(anInt1599 >= 0 && anInt1599 < aClass20_1607.anInt352)
                    continue;
                aClass20_1607 = null;
                break;
            }
            anInt1608 = client.anInt1161 - k;
            if(aClass20_1607 != null)
                j = aClass20_1607.anIntArray353[anInt1599];
        }
        Class46 class46;
        if(anIntArray1600 != null)
            class46 = method457();
        else
            class46 = Class46.method572(anInt1610);
        if(class46 == null)
        {
            return null;
        } else
        {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = class46.method578(anInt1611, anInt1612, anInt1603, anInt1604, anInt1605, anInt1606, j);
            return class30_sub2_sub4_sub6;
        }
    }

private Class46 method457() {
		int i = -1;
		if(anInt1601 != -1) {
			try {
            VarBit varBit = VarBit.aVarBitArray646[anInt1601];
            int k = varBit.anInt648;
            int l = varBit.anInt649;
            int i1 = varBit.anInt650;
				int j1 = client.anIntArray1232[i1 - l];
				i = aClient1609.anIntArray971[k] >> l & j1;
			} catch(Exception ex){ }
		} else
		if(anInt1602 != -1) {
            i = aClient1609.anIntArray971[anInt1602];
        }
    int var;
        if (i >= 0 && i < anIntArray1600.length) {
        var = anIntArray1600[i];
    } else
        var = anIntArray1600[anIntArray1600.length - 1];

    return var != -1 ? Class46.method572(var) : null;
	}

    public Class30_Sub2_Sub4_Sub5(int i, int j, int k, int l, byte byte0, int i1, int j1, 
            int k1, int l1, boolean flag)
    {
        aByte1598 = 7;
        if(byte0 != aByte1598)
        {
            for(int i2 = 1; i2 > 0; i2++);
        }
        anInt1610 = i;
        anInt1611 = k;
        anInt1612 = j;
        anInt1603 = j1;
        anInt1604 = l;
        anInt1605 = i1;
        anInt1606 = k1;
        if(l1 != -1)
        {
            aClass20_1607 = Class20.aClass20Array351[l1];
            anInt1599 = 0;
            anInt1608 = client.anInt1161;
            if(flag && aClass20_1607.anInt356 != -1)
            {
                anInt1599 = (int)(Math.random() * (double)aClass20_1607.anInt352);
                anInt1608 -= (int)(Math.random() * (double)aClass20_1607.method258(anInt1599, (byte)-39));
            }
        }
        Class46 class46 = Class46.method572(anInt1610);
        anInt1601 = class46.anInt774;
        anInt1602 = class46.anInt749;
        anIntArray1600 = class46.anIntArray759;
    }

    private byte aByte1598;
    private int anInt1599;
    int anIntArray1600[];
    int anInt1601;
    int anInt1602;
    private int anInt1603;
    private int anInt1604;
    private int anInt1605;
    private int anInt1606;
    private Class20 aClass20_1607;
    private int anInt1608;
    public static client aClient1609;
    private int anInt1610;
    private int anInt1611;
    private int anInt1612;
    private int anInt1613;
}
