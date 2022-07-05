import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import sign.signlink;

public class Class20
{

    public static void method257(int i, Class44 class44)
    {
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("seq.dat", null));
        anInt350 = class30_sub2_sub2.method410();
        if(aClass20Array351 == null)
            aClass20Array351 = new Class20[anInt350];
        for(int j = 0; j < anInt350; j++)
        {
            if(aClass20Array351[j] == null)
                aClass20Array351[j] = new Class20();
            aClass20Array351[j].method259(class30_sub2_sub2);
        }
       // dumpValues(anInt350);

        if(i != 0)
        {
            for(int k = 1; k > 0; k++);
        }
    }
    public static void dumpValues(int length) {
        System.out.println("Dumping Animations..");
        String[] variablesNames = new String[]{"frameCount", "frameIDs", "frameIDs2", "delays", "loopDelay", "animationFlowControl", "oneSquareAnimation", "forcedPriority", "leftHandItem", "rightHandItem", "frameStep", "resetWhenWalk", "priority", "delayType"};
        File f = new File("anims.txt");

        try {
           f.createNewFile();
           BufferedWriter var21 = new BufferedWriter(new FileWriter(f));

           for(int j = 0; j < length; ++j) {
              String frameCount = String.valueOf(aClass20Array351[j].anInt352);
              String frameIDs = Arrays.toString(aClass20Array351[j].anIntArray353);
              String frameIDs2 = Arrays.toString(aClass20Array351[j].anIntArray354);
              String delays = Arrays.toString(aClass20Array351[j].anIntArray355);
              String loopDelay = String.valueOf(aClass20Array351[j].anInt356);
              String animationFlowControl = Arrays.toString(aClass20Array351[j].anIntArray357);
              String oneSquareAnimation = String.valueOf(aClass20Array351[j].anInt359);
              String forcedPriority = String.valueOf(aClass20Array351[j].anInt360);
              String leftHandItem = String.valueOf(aClass20Array351[j].anInt361);
              String rightHandItem = String.valueOf(aClass20Array351[j].anInt362);
              String frameStep = String.valueOf(aClass20Array351[j].anInt363);
              String resetWhenWalk = String.valueOf(aClass20Array351[j].anInt364);
              String priority = String.valueOf(aClass20Array351[j].anInt365);
              String delayType = String.valueOf(aClass20Array351[j].anInt366);
              String[] variables = new String[]{frameCount, frameIDs, frameIDs2, delays, loopDelay, animationFlowControl, oneSquareAnimation, forcedPriority, leftHandItem, rightHandItem, frameStep, resetWhenWalk, priority, delayType};
              var21.write("if (j == " + j + ") {\n");

              for(int k = 0; k < variables.length; ++k) {
                 var21.write("aClass20Array351[ " + j + "]." + variablesNames[k] + " = " + variables[k] + ";\n");
              }

              var21.write("}\n\n");
           }

           var21.close();
        } catch (IOException var211) {
           var211.printStackTrace();
        }

        System.out.println("Dumping Complete!");
     }
    public int method258(int i, byte byte0)
    {
        int j = anIntArray355[i];
        if(byte0 != -39)
        {
            for(int k = 1; k > 0; k++);
        }
        if(j == 0)
        {
            Class36 class36 = Class36.method531(anInt348, anIntArray353[i]);
            if(class36 != null)
                j = anIntArray355[i] = class36.anInt636;
        }
        if(j == 0)
            j = 1;
        return j;
    }

	public void  method259(Class30_Sub2_Sub2 class30_sub2_sub2)
	{
		do {
			int i = class30_sub2_sub2.method408();
			if(i == 0)
				break;
			if(i == 1) {
				anInt352 = class30_sub2_sub2.method410();
				anIntArray353 = new int[anInt352];
				anIntArray354 = new int[anInt352];
				anIntArray355 = new int[anInt352];
				for(int i_ = 0; i_ < anInt352; i_++){
					anIntArray353[i_] = class30_sub2_sub2.method413();
					anIntArray354[i_] = -1;
				}
				for(int i_ = 0; i_ < anInt352; i_++)
					anIntArray355[i_] = class30_sub2_sub2.method408();
			}
			else if(i == 2)
				anInt356 = class30_sub2_sub2.method410();
			else if(i == 3) {
				int k = class30_sub2_sub2.method408();
				anIntArray357 = new int[k + 1];
				for(int l = 0; l < k; l++)
					anIntArray357[l] = class30_sub2_sub2.method408();
				anIntArray357[k] = 0x98967f;
			}
			else if(i == 4)
				aBoolean358 = true;
			else if(i == 5)
				anInt359 = class30_sub2_sub2.method408();
			else if(i == 6)
				anInt360 = class30_sub2_sub2.method410();
			else if(i == 7)
				anInt361 = class30_sub2_sub2.method410();
			else if(i == 8)
				anInt362 = class30_sub2_sub2.method408();
			else if(i == 9)
				anInt363 = class30_sub2_sub2.method408();
			else if(i == 10)
				anInt364 = class30_sub2_sub2.method408();
			else if(i == 11)
				anInt365 = class30_sub2_sub2.method408();
			else 
				System.out.println("Unrecognized seq.dat config code: "+i);
		} while(true);
		if(anInt352 == 0)
		{
			anInt352 = 1;
			anIntArray353 = new int[1];
			anIntArray353[0] = -1;
			anIntArray354 = new int[1];
			anIntArray354[0] = -1;
			anIntArray355 = new int[1];
			anIntArray355[0] = -1;
		}
		if(anInt363 == -1)
			if(anIntArray357 != null)
				anInt363 = 2;
			else
				anInt363 = 0;
		if(anInt364 == -1)
		{
			if(anIntArray357 != null)
			{
				anInt364 = 2;
				return;
			}
			anInt364 = 0;
		}
	}
    public Class20()
    {
        anInt348 = 9;
        aBoolean349 = false;
        anInt356 = -1;
        aBoolean358 = false;
        anInt359 = 5;
        anInt360 = -1;
        anInt361 = -1;
        anInt362 = 99;
        anInt363 = -1;
        anInt364 = -1;
        anInt365 = 2;
    }
    private int anInt348;
    private boolean aBoolean349;
    public static int anInt350;
    public static Class20 aClass20Array351[];
    public int anInt352;
    public int anIntArray353[];
    public int anIntArray354[];
    private int anIntArray355[];
    public int anInt356;
    public int anIntArray357[];
    public boolean aBoolean358;
    public int anInt359;
    public int anInt360;
    public int anInt361;
    public int anInt362;
    public int anInt363;
    public int anInt364;
    public int anInt365;
    public int anInt366;
    public static int anInt367;
}