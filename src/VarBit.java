import sign.signlink;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class VarBit
{

    public static void method533(int i, Class44 class44)
    {
        if(i != 0)
            anInt644 = 91;
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("varbit.dat", null), 891);
        anInt645 = class30_sub2_sub2.method410();
        if(aVarBitArray646 == null)
            aVarBitArray646 = new VarBit[anInt645];
        for(int j = 0; j < anInt645; j++)
        {
            if(aVarBitArray646[j] == null)
                aVarBitArray646[j] = new VarBit();
            aVarBitArray646[j].readValues(class30_sub2_sub2);
            System.out.println(""+aVarBitArray646[j].anInt648+" "+aVarBitArray646[j].anInt649);
            if(aVarBitArray646[j].aBoolean651)
                Class41.aClass41Array701[aVarBitArray646[j].anInt648].aBoolean713 = true;
        }

        if(class30_sub2_sub2.anInt1406 != class30_sub2_sub2.aByteArray1405.length)
            System.out.println("varbit load mismatch");
    }
    public void method534(Class30_Sub2_Sub2 class30_sub2_sub2, int i)
    {
            anInt648 = class30_sub2_sub2.method410();
            anInt649 = class30_sub2_sub2.method408();
            anInt650 = class30_sub2_sub2.method408();
    }
    private void readValues(Class30_Sub2_Sub2 stream) {
        do {
            int j = stream.method408();
            if (j == 0)
                return;
            if (j == 1) {
                anInt648 = stream.method410();
                anInt649 = stream.method408();
                anInt650 = stream.method408();
            } else if (j == 10)
                stream.readString();
            else if (j == 2)
                aBoolean651 = true;
            else if (j == 3)
                stream.method413();
            else if (j == 4)
                stream.method413();
            else
                System.out.println("Error unrecognised config code: " + j);
        } while (true);
    }
    public VarBit()
    {
        aBoolean651 = false;
        anInt652 = -1;
    }

    private static int anInt644;
    public static int anInt645;
    public static VarBit aVarBitArray646[];
    public String aString647;
    public int anInt648;
    public int anInt649;
    public int anInt650;
    public boolean aBoolean651;
    public int anInt652;
    public int anInt653;
}
