import sign.signlink;

import java.io.*;
import java.util.Objects;


final class Class8 {



    public static final void method191(int i) {
        aClass12_159 = null;
        aClass12_158 = null;
        anIntArray195 = null;
        if(i >= 0)
            aBoolean187 = !aBoolean187;
        aClass8Array172 = null;
        aClass30_Sub2_Sub2_183 = null;
    }

public static void dumpCfg() {
		boolean delete = (new File(signlink.findcachedir() + ("/dumps/item.cfg")).delete());
		for(int i = 0; i < 30000; i++) {
			Class8 class8 = method198(i);
			BufferedWriter bw = null;
			String des = "";
            if(!Objects.equals(class8.name, "null")) {
                if (class8.aByteArray178 != null)
                    des = new String(class8.aByteArray178);
                else
                    des = "Its a " + class8.name;
                try {
                    BufferedWriter bufferedwriter;
                    bufferedwriter = null;
                    BufferedWriter bufferedWriter2 = bufferedwriter = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/item.cfg"), true));
                    bufferedwriter.write((new StringBuilder()).append("item = ").append(i).append("	").append(class8.name).append("	").append(des).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").toString());
                    bufferedwriter.newLine();
                    bufferedwriter.flush();
                } catch (Exception e) {
                }
            }
		}
	}
	public static void dumpItemsList() {
	for(int i = 0; i < 9200; i++) {
	Class8 class8 = method198(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/ItemList.txt"), true));
	if(class8.name != null) {
	bw.write("ID: "+i+"\t\tName: "+class8.name);
	bw.newLine();
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}
public static void dumpNewItems() {
for(int i = 9000; i < 9200; i++) {
Class8 class8 = method198(i);
BufferedWriter bw = null;
try {
bw = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/Item Dump.txt"), true));
if(class8.name != null) {
bw.write("<item members='true'  name='" + class8.name + "'  type='"+i+"'> </item>");
bw.newLine();
bw.flush();
bw.close();
}
} catch (IOException ioe2) {
}
}
}
    public final boolean method192(int i, int j) {
        if(i != -2836)
            aBoolean186 = !aBoolean186;
        int k = anInt175;
        int l = anInt166;
        if(j == 1)
        {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
            return true;
        boolean flag = true;
        if(!Class30_Sub2_Sub4_Sub6.method463(k))
            flag = false;
        if(l != -1 && !Class30_Sub2_Sub4_Sub6.method463(l))
            flag = false;
        return flag;
    }

public static void dumpItems() {
for(int i = 0; i < 9250; i++) {
Class8 class8 = method198(i);
      BufferedWriter bw = null;

      try {
         bw = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/itemdump.cfg"), true));
                 bw.write("====================");
	 bw.newLine();
	 bw.write("Item Name: "+class8.name);
	 bw.newLine();
	 bw.write("Item ID: "+i);
	 bw.newLine();
                 if(class8.modifiedModelColors != null) {
                     for(int i2 = 0; i2 < class8.modifiedModelColors.length; i2++) {
                         if(i2 == 0) {
                             bw.write("Original model colors: ");
                         }
                         if(i2 != class8.modifiedModelColors.length - 1) {
                             bw.write(""+class8.modifiedModelColors[i2]+", ");
                         } else {
                             bw.write(""+class8.modifiedModelColors[i2]);
                             bw.newLine();
                         }
                     }
                 }
                 if(class8.originalModelColors != null) {
                     for(int i2 = 0; i2 < class8.originalModelColors.length; i2++) {
                         if(i2 == 0) {
                             bw.write("Changed model colors: ");
                         }
                         if(i2 != class8.originalModelColors.length - 1) {
                             bw.write(""+class8.originalModelColors[i2]+", ");
                         } else {
                             bw.write(""+class8.originalModelColors[i2]);
                             bw.newLine();
                         }
                     }
                 }
                 bw.write("class8.anInt174 = "+class8.modelId +";");
                 bw.newLine();
                 bw.write("class8.anInt181 = "+class8.anInt181+";");
                 bw.newLine();
                 bw.write("class8.anInt190 = "+class8.anInt190+";");
                 bw.newLine();
                 bw.write("class8.anInt198 = "+class8.anInt198+";");
                 bw.newLine();
                 bw.write("class8.anInt204 = "+class8.anInt204+";");
                 bw.newLine();
                 bw.write("class8.anInt169 = "+class8.anInt169+";");
                 bw.newLine();
                 bw.write("class8.anInt194 = "+class8.anInt194+";");
                 bw.newLine();
                 bw.write("class8.anInt165 = "+class8.anInt165+";");
                 bw.newLine();
                 bw.write("class8.anInt200 = "+class8.anInt200+";");
                 bw.newLine();
                 bw.write("class8.anInt188 = "+class8.anInt188+";");
                 bw.newLine();
                 bw.write("class8.anInt164 = "+class8.anInt164+";");
                 bw.newLine();
                 bw.write("class8.anInt175 = "+class8.anInt175+";");
                 bw.newLine();
                 bw.write("class8.anInt197 = "+class8.anInt197+";");
                 bw.newLine();
	 bw.flush();
      } catch (IOException ioe) {
	 ioe.printStackTrace();
      } finally {
	 if (bw != null) try {
	    bw.close();
	 } catch (IOException ioe2) {
	 }
      }
}
}

public static final void method193(Class44 class44) {
    aClass30_Sub2_Sub2_183 = new Class30_Sub2_Sub2(class44.method571("obj.dat", null), 891);
    Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class44.method571("obj.idx", null), 891);
    anInt203 = class30_sub2_sub2.method410();
    anIntArray195 = new int[anInt203+400000];
    int i = 2;
    for(int j = 0; j < anInt203; j++)
    {
        anIntArray195[j] = i;
        i += class30_sub2_sub2.method410();
    }

    aClass8Array172 = new Class8[10];
    for(int k = 0; k < 10; k++)
        aClass8Array172[k] = new Class8();
    //dumpCfg();
}
    public final Class30_Sub2_Sub4_Sub6 method194(int i, int j) {
        while(i >= 0)
            aBoolean186 = !aBoolean186;
        int k = anInt175;
        int l = anInt166;
        if(j == 1) {
            k = anInt197;
            l = anInt173;
        }
        if(k == -1)
            return null;
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
        if(l != -1) {
            Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.method462(anInt171, l);
            Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = {
                class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_1
            };
            class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(2, aclass30_sub2_sub4_sub6, -38);
        }
        if(modifiedModelColors != null) {
            for(int i1 = 0; i1 < modifiedModelColors.length; i1++)
                class30_sub2_sub4_sub6.method476(modifiedModelColors[i1], originalModelColors[i1]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final boolean method195(int i, int j) {
        if(i != 40903)
            aBoolean206 = !aBoolean206;
        int k = anInt165;
        int l = anInt188;
        int i1 = anInt185;
        if(j == 1) {
            k = anInt200;
            l = anInt164;
            i1 = anInt162;
        }
        if(k == -1)
            return true;
        boolean flag = true;
        if(!Class30_Sub2_Sub4_Sub6.method463(k))
            flag = false;
        if(l != -1 && !Class30_Sub2_Sub4_Sub6.method463(l))
            flag = false;
        if(i1 != -1 && !Class30_Sub2_Sub4_Sub6.method463(i1))
            flag = false;
        return flag;
    }

    public final Class30_Sub2_Sub4_Sub6 method196(boolean flag, int i) {
        if(flag)
            throw new NullPointerException();
        int j = anInt165;
        int k = anInt188;
        int l = anInt185;
        if(i == 1) {
            j = anInt200;
            k = anInt164;
            l = anInt162;
        }
        if(j == -1)
            return null;
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, j);
        if(k != -1)
            if(l != -1) {
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_3 = Class30_Sub2_Sub4_Sub6.method462(anInt171, l);
                Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6_1[] = {
                    class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_1, class30_sub2_sub4_sub6_3
                };
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(3, aclass30_sub2_sub4_sub6_1, -38);
            } else {
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_2 = Class30_Sub2_Sub4_Sub6.method462(anInt171, k);
                Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = {
                    class30_sub2_sub4_sub6, class30_sub2_sub4_sub6_2
                };
                class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(2, aclass30_sub2_sub4_sub6, -38);
            }
        if(i == 0 && aByte205 != 0)
            class30_sub2_sub4_sub6.method475(0, aByte205, 16384, 0);
        if(i == 1 && aByte154 != 0)
            class30_sub2_sub4_sub6.method475(0, aByte154, 16384, 0);
        if(modifiedModelColors != null) {
            for(int i1 = 0; i1 < modifiedModelColors.length; i1++)
                class30_sub2_sub4_sub6.method476(modifiedModelColors[i1], originalModelColors[i1]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final void method197()
    {
        modelId = 0;
        name = null;
        aByteArray178 = null;
        modifiedModelColors = null;
        originalModelColors = null;
        anInt181 = 2000;
        anInt190 = 0;
        anInt198 = 0;
        anInt204 = 0;
        anInt169 = 0;
        anInt194 = 0;
        anInt199 = -1;
        aBoolean176 = false;
        anInt155 = 1;
        aBoolean161 = false;
        aStringArray168 = null;
        aStringArray189 = null;
        anInt165 = -1;
        anInt188 = -1;
        aByte205 = 0;
        anInt200 = -1;
        anInt164 = -1;
        aByte154 = 0;
        anInt185 = -1;
        anInt162 = -1;
        anInt175 = -1;
        anInt166 = -1;
        anInt197 = -1;
        anInt173 = -1;
        anIntArray193 = null;
        anIntArray201 = null;
        anInt179 = -1;
        anInt163 = -1;
        anInt167 = 128;
        anInt192 = 128;
        anInt191 = 128;
        anInt196 = 0;
        anInt184 = 0;
        anInt202 = 0;
    }

    public static final Class8 method198(int i)
    {
		for(int j = 0; j < 10; j++)
            if(aClass8Array172[j].anInt157 == i)
                return aClass8Array172[j];

        anInt180 = (anInt180 + 1) % 10;
        Class8 class8 = aClass8Array172[anInt180];
        aClass30_Sub2_Sub2_183.anInt1406 = anIntArray195[i];
        class8.anInt157 = i;
        class8.method197();
        class8.readValues(true, aClass30_Sub2_Sub2_183);
	class8.method198_2(i, class8);
	class8.method198_3(i, class8);
    class8.method198_4(i, class8);

if(i == 9004)
{ 
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Summon from the";
	class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int [1];
	class8.modifiedModelColors[0] = 7446;//color change
	class8.originalModelColors[0] = 926;//color change 1
	class8.modelId = 8933;//itemdrop look
	class8.anInt181 = 1595;//zoom
	class8.anInt190 = 196; //rotation rotation up/down
	class8.anInt198 = 2031;//rotation left/right
	class8.anInt204 = 2047;//i think more zoom stuff
	class8.anInt169 = 0;   
	class8.anInt194 = -3;  
	class8.anInt165 = 8932;//male weild
	class8.anInt200 = 8932;//female weild
	class8.anInt175 = 2;  //offset
	class8.anInt197 = -1;  //offset
	class8.name = "Monkey Bag";
	class8.aByteArray178 = "Wear a monkey for FREE!".getBytes();
}

             if(i == 15340)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.modifiedModelColors = new int[1];
		            class8.originalModelColors = new int[1];
		            class8.modifiedModelColors[0] = 0;
		            class8.originalModelColors[0] = 0;
		            class8.modelId = 14923;
		            class8.anInt181 = 1957;
		            class8.anInt190 = 498;
		            class8.anInt198 = 484;
		            class8.anInt204 = 0;
		            class8.anInt169 = -1;
		            class8.anInt194 = -1;
		            class8.anInt165 = 13427;
		            class8.anInt200 = 13427;
		            class8.anInt175 = -1;
		            class8.anInt197 = -1;
		            class8.name = "Lucky Saradomin Godsword";
		            class8.aByteArray178 = "A heavy sword".getBytes();
		        }
        if(i == 15341)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modifiedModelColors = new int[0];
		class8.originalModelColors = new int[0];
		class8.modelId = 7212; //Model ID
		class8.anInt181 = 1957;
		class8.anInt190 = 498;
		class8.anInt198 = 484;
		class8.anInt204 = 0;
		class8.anInt169 = -1;
		class8.anInt194 = -1;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.anInt165 = 7209;//male wearing
		class8.anInt200 = 7209;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Lucky Armadyl Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
		        }
				        if(i == 18431)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";//New option
		class8.modifiedModelColors = new int[0];
		class8.originalModelColors = new int[0];
		class8.modelId = 70730; //Model ID
		class8.anInt181 = 1758;
		class8.anInt190 = 512;
		class8.anInt198 = 0;
		class8.anInt204 = 0;
		class8.anInt169 = -1;
		class8.anInt194 = -1;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.anInt165 = 70669;//male wearing
		class8.anInt200 = 70669;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Dragonbone platebody";//Name of the new item
		class8.aByteArray178 = "Provides excellent protection with a meaner, bonier look.".getBytes();//examin info
		        }
		if(i == 17431)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modifiedModelColors = new int[0];
		class8.originalModelColors = new int[0];
		class8.modelId = 70899; //Model ID
		class8.anInt181 = 1897;
		class8.anInt190 = 520;
		class8.anInt198 = 520;
		class8.anInt204 = 1;
		class8.anInt169 = 1;
		class8.anInt194 = -1;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.anInt165 = 70900;//male wearing
		class8.anInt200 = 70900;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Golden katana";//Name of the new item
		class8.aByteArray178 = "A fine blade from the Eastern Lands.".getBytes();//examin info
		        }
		if(i == 15342)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modifiedModelColors = new int[0];
		class8.originalModelColors = new int[0];
		class8.modelId = 7213; //Model ID
		class8.anInt181 = 1957;
		class8.anInt190 = 498;
		class8.anInt198 = 484;
		class8.anInt204 = 0;
		class8.anInt169 = -1;
		class8.anInt194 = -1;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.anInt165 = 7206;//male wearing
		class8.anInt200 = 7206;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Lucky Zamorak Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
        }
		        if(i == 15343){
				            class8.aStringArray189 = new String[5];
				            class8.aStringArray189[1] = "Wear";
				            class8.modifiedModelColors = new int[1];
				            class8.originalModelColors = new int[1];
							class8.modifiedModelColors[0] = 0;
							class8.originalModelColors[0] = 0;
							class8.modelId = 12354;//item look
							class8.anInt181 = 1957;
							class8.anInt190 = 498;
							class8.anInt198 = 484;
							class8.anInt204 = 0;
							class8.anInt169 = -1;
							class8.anInt194 = -1;
							class8.anInt165 = 7355;
							class8.anInt200 = 7355;
							class8.anInt175 = -1;
							class8.anInt197 = -1;
                            class8.name = "Lucky Bandos godsword";
				            class8.aByteArray178 = "A heavy sword".getBytes();
        }
if(i == 16212) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.modelId = 51845;
class8.anInt181 = 2256;
class8.anInt190 = 456;
class8.anInt198 = 513;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 51795;
class8.anInt200 = 51795;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;					
class8.name = "Staff of Light"; // Item Name
class8.aByteArray178 = "Humming with power.".getBytes(); // Item Examine
      }
		       if(i == 9106)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.modifiedModelColors = new int[1];
		            class8.originalModelColors = new int[1];
		            class8.modifiedModelColors[0] = 528;
		            class8.originalModelColors[0] = 100;
		            class8.modelId = 5412;
		            class8.anInt181 = 840;
		            class8.anInt190 = 280;
		            class8.anInt198 = 0;
		            class8.anInt204 = 0;
		            class8.anInt169 = -2;
		            class8.anInt194 = 56;
		            class8.anInt165 = 5409;
		            class8.anInt200 = 5409;
		            class8.anInt188 = -1;
		            class8.anInt164 = -1;
		            class8.anInt175 = -1;
		            class8.anInt197 = -1;
		            class8.name = "White whip";
		            class8.aByteArray178 = "Made By The White Knights.".getBytes();
        }
if(i == 15333)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
        class8.modelId = 28162;
        class8.anInt181 = 1957;
        class8.anInt190 = 498;
        class8.anInt198 = 484;
        class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 27731;
        class8.anInt200 = 27731;
        class8.anInt188 = -1;
        class8.anInt164 = -1;
        class8.anInt175 = -1;
        class8.anInt197 = -1;
            class8.name = "Armadyl godsword";
            class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
        }

        if(i == 15334)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
class8.modelId = 28154;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 27726;
class8.anInt200 = 27726;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "Bandos godsword ";
            class8.aByteArray178 = "A great weapon, used by the best warriors.".getBytes();
        }
        if(i == 15335)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
class8.modelId = 28151;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 27729;
class8.anInt200 = 27729;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "Saradomin Godsword";
            class8.aByteArray178 = "A saradomin godsword, once used by saradomin himself.".getBytes();
        }
		if(i == 15336)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modifiedModelColors = new int[0];
		class8.originalModelColors = new int[0];
		class8.modelId = 7213; //Model ID
		class8.anInt181 = 1957;
		class8.anInt190 = 498;
		class8.anInt198 = 484;
		class8.anInt204 = 0;
		class8.anInt169 = -1;
		class8.anInt194 = -1;
		class8.anInt175 = -1;
		class8.anInt197 = -1;
		class8.anInt165 = 7206;//male wearing
		class8.anInt200 = 7206;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
        }
if(i == 13665)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 43072;
class8.originalModelColors[0] = 925;
class8.modifiedModelColors[1] = 4550;
class8.originalModelColors[1] = 925;
class8.modelId = 14104; //Model ID
class8.anInt181 = 1330; //zoom increase will make it smaller
class8.anInt190 = 310; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1800; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 14105;//male wearing
class8.anInt200 = 14105;//female wearing
class8.anInt164 = 14106;//Female arms/sleeves
class8.anInt188 = 14106;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Dragon platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 15111){ //lava helm
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 10394;
              class8.originalModelColors[0] = 26706;
              class8.modifiedModelColors[1] = 6020;
              class8.originalModelColors[1] = 6020;
 class8.modelId = 6583;
class8.anInt181= 860;
class8.anInt190= 2012;
class8.anInt198= 188;
class8.anInt204= 0;
class8.anInt169= 17;
class8.anInt194= 0;
class8.anInt165= 6653;
class8.anInt200= 6687;
class8.anInt188= -1;
class8.anInt164= -1;
class8.anInt175= 6570;
class8.anInt197= 6575;
              class8.name = "Ivandis helm";
              class8.aByteArray178 = "It's a Ivandis helm".getBytes();
              }
if(i == 20139)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 43072;
class8.originalModelColors[0] = 925;
class8.modifiedModelColors[1] = 4550;
class8.originalModelColors[1] = 925;
class8.modelId = 14148; //Model ID
class8.anInt181 = 1330; //zoom increase will make it smaller
class8.anInt190 = 310; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1800; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 14147;//male wearing
class8.anInt200 = 14146;//female wearing
class8.anInt164 = 14146;//Female arms/sleeves
class8.anInt188 = 14147;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Torva platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 20143)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14150;
class8.anInt165 = 10110;
class8.anInt200 = 14149;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.name = "Torva platelegs";
class8.aByteArray178 = "A pair of Torva platelegs".getBytes();
}
if(i == 18358)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 43072;
class8.originalModelColors[0] = 925;
class8.modifiedModelColors[1] = 4550;
class8.originalModelColors[1] = 925;
class8.modelId = 74148; //Model ID
class8.anInt181 = 1330; //zoom increase will make it smaller
class8.anInt190 = 310; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1800; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 74147;//male wearing
class8.anInt200 = 74146;//female wearing
class8.anInt164 = 74146;//Female arms/sleeves
class8.anInt188 = 74147;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Ice Torva platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 18359)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 74150;
class8.anInt165 = 70110;
class8.anInt200 = 74149;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.name = "Ice Torva platelegs";
class8.aByteArray178 = "A pair of Ice Torva platelegs".getBytes();
}
if(i == 20137){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
			class8.modifiedModelColors[0] = 0;
			class8.originalModelColors[0] = 0;
			class8.modelId = 14153;//item look
			class8.anInt181 = 700;
			class8.anInt190 = 1100;
			class8.anInt198 = 650;
			class8.anInt204 = 1148;
			class8.anInt169 = 5;
			class8.anInt194 = -25;
			class8.anInt165 = 14151;
			class8.anInt200 = 14152;
            class8.name = "Torva full helm ";
            class8.aByteArray178 = "A ancient warior's full helm.".getBytes();
        }

if(i == 15107) { //ladies legs
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.modifiedModelColors = new int[2];
		class8.originalModelColors = new int [2];
		class8.modifiedModelColors[0] = 926;
		class8.originalModelColors[0] = 62920;
		class8.modifiedModelColors[1] = 912;
		class8.originalModelColors[1] = 62928;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = -8;
		class8.anInt165 = 5024;
		class8.anInt200 = 5025;
		class8.modelId = 5026;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ladies Platelegs";
	class8.aByteArray178 = "Ladies platelegs".getBytes();
}


if(i == 15112) { //ivandis legs
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.modifiedModelColors = new int[2];
		class8.originalModelColors = new int [2];
		class8.modifiedModelColors[0] = 926;
		class8.originalModelColors[0] = 26706;
		class8.modifiedModelColors[1] = 912;
		class8.originalModelColors[1] = 26667;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = -8;
		class8.anInt165 = 5024;
		class8.anInt200 = 5025;
		class8.modelId = 5026;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ivandis Platelegs";
	class8.aByteArray178 = "Stride through enemies territory in a heart beat.".getBytes();
}
if(i == 15109){ //ladies helm
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 10394;
              class8.originalModelColors[0] = 62928;
              class8.modifiedModelColors[1] = 6020;
              class8.originalModelColors[1] = 6020;
 class8.modelId = 6583;
class8.anInt181= 860;
class8.anInt190= 2012;
class8.anInt198= 188;
class8.anInt204= 0;
class8.anInt169= 17;
class8.anInt194= 0;
class8.anInt165= 6653;
class8.anInt200= 6687;
class8.anInt188= -1;
class8.anInt164= -1;
class8.anInt175= 6570;
class8.anInt197= 6575;
              class8.name = "Ladies Helm";
              class8.aByteArray178 = "It's a Ladies helm".getBytes();
              }
if(i == 15337)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modelId = 28045;
            class8.anInt181 = 2151;
            class8.anInt190 = 636;
            class8.anInt198 = 1521;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt204 = 3;
            class8.anInt165 = 27652;
            class8.anInt200 = 27652;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;
            class8.name = "Saradomin Sword";
            class8.aByteArray178 = "Its A sword from saradomin himself".getBytes();
        }

if(i == 15113){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 10283;
class8.originalModelColors[0] = 26706;
class8.modifiedModelColors[1] = 10270;
class8.originalModelColors[1] = 24648;
class8.modifiedModelColors[2] = 3326;
class8.originalModelColors[2] = 24640;
class8.modelId = 8700;
class8.anInt181 = 710;
class8.anInt190 = 332;
class8.anInt198 = 2000;
class8.anInt204 = 0;
class8.anInt169 = 2;
class8.anInt194 = -14;
class8.anInt165 = 8726;
class8.anInt200 = 8750;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Ivandis Gauntlets";
class8.aByteArray178 = "Ivandis Gauntlets.".getBytes();
}
if(i == 15215){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 8741;
class8.originalModelColors[0] = 924;
class8.modifiedModelColors[1] = 14490;
class8.originalModelColors[1] = 921;
class8.modelId = 6578;
class8.anInt181 = 1250;
class8.anInt190 = 468;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 3;
class8.anInt165 = 6669;
class8.anInt200 = 6697;
class8.anInt188 = 170;
class8.anInt164 = 348;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Draconic Top";
class8.aByteArray178 = "A draconic Ahrims top.".getBytes();
}
if(i == 15216){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 14490;
class8.originalModelColors[0] = 924;
class8.modifiedModelColors[1] = 45468;
class8.originalModelColors[1] = 921;
class8.modelId = 6577;
class8.anInt181 = 1730;
class8.anInt190 = 504;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -4;
class8.anInt165 = 6659;
class8.anInt200 = 6691;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Draconic Bottoms";
class8.aByteArray178 = "A draconic Ahrims bottoms.".getBytes();
}
if(i == 15217){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 8741;
class8.originalModelColors[0] = 924;
class8.modelId = 5419;
class8.anInt181 = 730;
class8.anInt190 = 0;
class8.anInt198 = 2036;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 5430;
class8.anInt200 = 5435;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 5428;
class8.anInt197 = 5429;
class8.name = "Draconic Hood";
class8.aByteArray178 = "A draconic Ahrims Hood.".getBytes();
}
 if(i == 15234) // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 28;
class8.modifiedModelColors[0] = 74;
class8.originalModelColors[0] = 38676;
class8.originalModelColors[0] = 760;
class8.modelId = 5139;
	class8.anInt181 = 490;
	class8.anInt190 = 344;
	class8.anInt198 = 192;
	class8.anInt204 = 138;
        class8.anInt169 = 1;
        class8.anInt194 = 20;
class8.anInt165 = 5114;//male wearing 15413
class8.anInt200 = 5114;//female wearing 15413
class8.anInt175 = 56;
class8.anInt197 = 116;
            class8.name = "Slayer Sword";
            class8.aByteArray178 = "A Slayer sword by thedragon.".getBytes();
        }
if(i == 15106){//ladies gaunts
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 10283;
class8.originalModelColors[0] = 62928;
class8.modifiedModelColors[1] = 10270;
class8.originalModelColors[1] = 62928;
class8.modifiedModelColors[2] = 3326;
class8.originalModelColors[2] = 62928;
class8.modelId = 8700;
class8.anInt181 = 710;
class8.anInt190 = 332;
class8.anInt198 = 2000;
class8.anInt204 = 0;
class8.anInt169 = 2;
class8.anInt194 = -14;
class8.anInt165 = 8726;
class8.anInt200 = 8750;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Ladies Gauntlets";
class8.aByteArray178 = "Ladies Gauntlets.".getBytes();
}
if(i == 15118){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 278;
            class8.anInt200 = 278;
            class8.anInt175 = 0;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon tail";
            class8.aByteArray178 = "A demon tail.".getBytes();
}

if(i == 15119){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 760;
            class8.anInt190 = 552;
            class8.anInt198 = 28;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 2;
            class8.anInt165 = 242;
            class8.anInt200 = 242;
            class8.anInt175 = 0;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon Horns #1";
            class8.aByteArray178 = "Horns of a demon.".getBytes();
}

if(i == 15120){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 760;
            class8.anInt190 = 552;
            class8.anInt198 = 28;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 2;
            class8.anInt165 = 239;
            class8.anInt200 = 239;
            class8.anInt175 = 0;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon Horns #2";
            class8.aByteArray178 = "Horns of a demon.".getBytes();
}

if(i == 15121){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 760;
            class8.anInt190 = 552;
            class8.anInt198 = 28;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 2;
            class8.anInt165 = 229;
            class8.anInt200 = 229;
            class8.anInt175 = 0;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon Head";
            class8.aByteArray178 = "The head of a demon.".getBytes();
}

if(i == 15122){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 770;
            class8.anInt190 = 152;
            class8.anInt198 = 160;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -6;
            class8.anInt165 = 182;
            class8.anInt200 = 182;
            class8.anInt175 = -1;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon Feet";
            class8.aByteArray178 = "The feet of a demon.".getBytes();
}

if(i == 15123){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modelId = 153;
            class8.anInt181 = 770;
            class8.anInt190 = 152;
            class8.anInt198 = 160;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -6;
            class8.anInt165 = 180;
            class8.anInt200 = 180;
            class8.anInt175 = -1;
            class8.anInt188 = -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Demon Hands";
            class8.aByteArray178 = "The hands of a demon.".getBytes();
}
if(i == 15114) { //ivandis chain
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.modifiedModelColors = new int[5];
		class8.originalModelColors = new int [5];
		class8.modifiedModelColors[0] = 914;
		class8.originalModelColors[0] = 26706;
		class8.modifiedModelColors[1] = 918;
		class8.originalModelColors[1] = 24648;
		class8.modifiedModelColors[2] = 922;
		class8.originalModelColors[2] = 24640;
		class8.modifiedModelColors[3] = 391;
		class8.originalModelColors[3] = 26706;
		class8.modifiedModelColors[4] = 917;
		class8.originalModelColors[4] = 24648;
	class8.anInt181 = 1100;
	class8.anInt190 = 568;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = 2;
		class8.anInt165 = 3820;
		class8.anInt200 = 3821;
		class8.modelId = 3823;
	class8.anInt188 = 156;
	class8.anInt164 = 337;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ivandis Chainmail";
	class8.aByteArray178 = "Its a Ivandis Chain".getBytes();
}

if(i == 15150) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 0xD4E7;
class8.modifiedModelColors[1] = 0xDFC0;
class8.modifiedModelColors[2] = 0xD3A7;
class8.originalModelColors[0] = 8128;
class8.originalModelColors[1] = 9126;
class8.originalModelColors[2] = 8128;
class8.modelId = 7022; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 7021; //Male
class8.anInt200 = 7021; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Summoning Cape";
class8.aByteArray178 = "You've recieved this for achieving 99 Summoning".getBytes();
}

if(i == 15115){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[4];
class8.originalModelColors = new int[4];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 26706;
class8.modelId = 5037;
class8.anInt181 = 770;
class8.anInt190 = 164;
class8.anInt198 = 156;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = -3;
class8.anInt165 = 4954;
class8.anInt200 = 5031;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Ivandis Boots";
class8.aByteArray178 = "Ivandis boots".getBytes();
}

if(i == 15105) { //ladies chain
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.modifiedModelColors = new int[5];
		class8.originalModelColors = new int [5];
		class8.modifiedModelColors[0] = 914;
		class8.originalModelColors[0] = 62928;
		class8.modifiedModelColors[1] = 918;
		class8.originalModelColors[1] = 62931;
		class8.modifiedModelColors[2] = 922;
		class8.originalModelColors[2] = 62928;
		class8.modifiedModelColors[3] = 391;
		class8.originalModelColors[3] = 62930;
		class8.modifiedModelColors[4] = 917;
		class8.originalModelColors[4] = 62928;
	class8.anInt181 = 1100;
	class8.anInt190 = 568;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = 2;
		class8.anInt165 = 3820;
		class8.anInt200 = 3821;
		class8.modelId = 3823;
	class8.anInt188 = 156;
	class8.anInt164 = 337;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ladies Chainmail";
	class8.aByteArray178 = "Its a Ladies Chain".getBytes();
}

if(i == 15104) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.modifiedModelColors = new int[3];
				class8.originalModelColors = new int [3];
				class8.modifiedModelColors[0] = 43127;
				class8.originalModelColors[0] = 62928;
				class8.modifiedModelColors[1] = 38119;
				class8.originalModelColors[1] = 62928;
				class8.modifiedModelColors[2] = 36975;
				class8.originalModelColors[2] = 62928;
			class8.modelId = 5198;//Drop model & inv model
			class8.anInt181 = 1900;
			class8.anInt190 = 500;
			class8.anInt198 = 500;
			class8.anInt204 = 0;
		        class8.anInt169 = 3;
		        class8.anInt194 = 6;
			class8.anInt200 = 5196;//female wearing
			class8.anInt165 = 5196;//male wearing
		        class8.anInt175 = -1;
		        class8.anInt197 = -1;
			class8.name = "Ladies shield";
			class8.aByteArray178 = "Ladies shield".getBytes();
}



if(i == 15103){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[4];
class8.originalModelColors = new int[4];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 62929;
class8.modelId = 5037;
class8.anInt181 = 770;
class8.anInt190 = 164;
class8.anInt198 = 156;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = -3;
class8.anInt165 = 4954;
class8.anInt200 = 5031;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Ladies Boots";
class8.aByteArray178 = "Ladies boots".getBytes();
}
if(i == 15102){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.modifiedModelColors = new int[2];
        class8.originalModelColors = new int [2];
	class8.modifiedModelColors[0] = 933;
	class8.originalModelColors[0] = 62928;
	class8.modifiedModelColors[1] = 935;
	class8.originalModelColors[1] = 62930;
	class8.modelId = 6033;//Item Look
	class8.anInt181 = 980;
	class8.anInt190 = 350;
	class8.anInt198 = 1020;
	class8.anInt204 = 324;
	class8.anInt169 = -2;
	class8.anInt194 = 0;
	class8.anInt165 = 6031;
	class8.anInt200 = 6031;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ladies Blade";
	class8.aByteArray178 = "".getBytes();
        	}

        if(i == 9109) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.modifiedModelColors = new int[3];
				class8.originalModelColors = new int [3];
				class8.modifiedModelColors[0] = 43127;
				class8.originalModelColors[0] = 43968;
				class8.modifiedModelColors[1] = 38119;
				class8.originalModelColors[1] = 43968;
				class8.modifiedModelColors[2] = 36975;
				class8.originalModelColors[2] = 43968;
			class8.modelId = 5198;//Drop model & inv model
			class8.anInt181 = 1900;
			class8.anInt190 = 500;
			class8.anInt198 = 500;
			class8.anInt204 = 0;
		        class8.anInt169 = 3;
		        class8.anInt194 = 6;
			class8.anInt200 = 5196;//female wearing
			class8.anInt165 = 5196;//male wearing
		        class8.anInt175 = -1;
		        class8.anInt197 = -1;
			class8.name = "Blue Crystal shield";
			class8.aByteArray178 = "Blue Crystal shield".getBytes();
}

        if(i == 15203) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.modifiedModelColors = new int[3];
				class8.originalModelColors = new int [3];
				class8.modifiedModelColors[0] = 43127;
				class8.originalModelColors[0] = 43968;
				class8.modifiedModelColors[1] = 38119;
				class8.originalModelColors[1] = 43968;
				class8.modifiedModelColors[2] = 36975;
				class8.originalModelColors[2] = 43968;
			class8.modelId = 3902;//Drop model & inv model
			class8.anInt181 = 1570;
			class8.anInt190 = 192;
			class8.anInt198 = 76;
			class8.anInt204 = 0;
		        class8.anInt169 = 1;
		        class8.anInt194 = 6;
			class8.anInt200 = 5197;//female wearing
			class8.anInt165 = 5197;//male wearing
class8.anInt188 = -1;
		        class8.anInt164 = -1;
		        class8.anInt175 = -1;
		        class8.anInt197 = -1;
			class8.name = "Blue Crystal shield";
			class8.aByteArray178 = "Blue Crystal shield".getBytes();
}

if(i == 15116) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.modifiedModelColors = new int[3];
				class8.originalModelColors = new int [3];
				class8.modifiedModelColors[0] = 43127;
				class8.originalModelColors[0] = 26706;
				class8.modifiedModelColors[1] = 38119;
				class8.originalModelColors[1] = 24648;
				class8.modifiedModelColors[2] = 36975;
				class8.originalModelColors[2] = 24640;
			class8.modelId = 5198;//Drop model & inv model
			class8.anInt181 = 1900;
			class8.anInt190 = 500;
			class8.anInt198 = 500;
			class8.anInt204 = 0;
		        class8.anInt169 = 3;
		        class8.anInt194 = 6;
			class8.anInt200 = 5196;//female wearing
			class8.anInt165 = 5196;//male wearing
		        class8.anInt175 = -1;
		        class8.anInt197 = -1;
			class8.name = "Ivandis shield";
			class8.aByteArray178 = "Ivandis shield".getBytes();
}

if(i == 15117){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.modifiedModelColors = new int[2];
        class8.originalModelColors = new int [2];
	class8.modifiedModelColors[0] = 933;
	class8.originalModelColors[0] = 26706;
	class8.modifiedModelColors[1] = 935;
	class8.originalModelColors[1] = 24648;
	class8.modelId = 6033;//Item Look
	class8.anInt181 = 980;
	class8.anInt190 = 350;
	class8.anInt198 = 1020;
	class8.anInt204 = 324;
	class8.anInt169 = -2;
	class8.anInt194 = 0;
	class8.anInt165 = 6031;
	class8.anInt200 = 6031;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.name = "Ivandis Blade";
	class8.aByteArray178 = "Show no mercy, led anger rule your fury.".getBytes();
        	}
if(i == 9115) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.modifiedModelColors = new int[3];
				class8.originalModelColors = new int [3];
				class8.modifiedModelColors[0] = 43127;
				class8.originalModelColors[0] = 128;
				class8.modifiedModelColors[1] = 38119;
				class8.originalModelColors[1] = 128;
				class8.modifiedModelColors[2] = 36975;
				class8.originalModelColors[2] = 128;
			class8.modelId = 5198;//Drop model & inv model
			class8.anInt181 = 1900;
			class8.anInt190 = 500;
			class8.anInt198 = 500;
			class8.anInt204 = 0;
		        class8.anInt169 = 3;
		        class8.anInt194 = 6;
			class8.anInt200 = 5196;//female wearing
			class8.anInt165 = 5196;//male wearing
		        class8.anInt175 = -1;
		        class8.anInt197 = -1;
			class8.name = "Black Crystal shield";
			class8.aByteArray178 = "Black Crystal shield".getBytes();
}
		if(i == 9117)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 926;  //original color
class8.originalModelColors[0] = 0; //changed color
class8.modelId =   2438;
class8.anInt181 =   730;
class8.anInt190 =   516;
class8.anInt198 =   0;
class8.anInt204 =   0;
class8.anInt169 =   0;
class8.anInt194 =   -10;
class8.anInt165 =   3188;
class8.anInt200 =   3192;
class8.anInt188 =   -1;
class8.anInt164 =   -1;
class8.anInt175 =   1755;
class8.anInt197 =   3187;
	class8.name = "Black h'ween Mask";
	class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
}
if(i == 9118)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 926;  //original color
class8.originalModelColors[0] = 11200; //changed color
class8.modelId =   2438;
class8.anInt181 =   730;
class8.anInt190 =   516;
class8.anInt198 =   0;
class8.anInt204 =   0;
class8.anInt169 =   0;
class8.anInt194 =   -10;
class8.anInt165 =   3188;
class8.anInt200 =   3192;
class8.anInt188 =   -1;
class8.anInt164 =   -1;
class8.anInt175 =   1755;
class8.anInt197 =   3187;
	class8.name = "Yellow h'ween Mask";
	class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
}

if(i == 12365)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //t
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 22416;  //original color
class8.originalModelColors[0] = 11200; //changed color
class8.modifiedModelColors[1] = 22424;  //original color
class8.originalModelColors[1] = 11200; //changed color
class8.modelId = 2745;
class8.anInt181 = 1030;
class8.anInt190 = 548;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -4;
class8.anInt165 = 314;
class8.anInt200 = 477;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
	class8.name = "Yellow d'hide body";
	class8.aByteArray178 = "really a yellow d'hide body".getBytes();
}

		if(i == 9094)    //WH1P!!!!
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
		            class8.modifiedModelColors = new int[1];
		        class8.originalModelColors = new int[1];
		class8.modifiedModelColors[0] = 528;  //original color
		class8.originalModelColors[0] = 36133; //changed color
		class8.modelId =  5412;
		class8.anInt181 =  840;
		class8.anInt190 =  280;
		class8.anInt198 =  0;
		class8.anInt204 =  0;
		class8.anInt169 =  -2;
		class8.anInt194 =  56;
		class8.anInt165 =  5409;
		class8.anInt200 =  5409;
		class8.anInt188 =  -1;
		class8.anInt164 =  -1;
		class8.anInt175 =  -1;
		class8.anInt197 =  -1;
		            class8.name = "Rune Whip";
		            class8.aByteArray178 = "A whip made of Rune".getBytes();
        }
        if(i == 9096) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6944; //Model ID
		class8.anInt181 = 1050; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt165 = 6940;//male wearing
		class8.anInt200 = 6943;//female wearing
		class8.anInt164 = 6942;//Female arms/sleeves
		class8.anInt188 = 6941;//male arms/sleeves
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Robe top";//Name of the new item
		class8.aByteArray178 = "A Robe Top Worn By the Gods.".getBytes();//examin info
		}

		if(i == 9097) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6947; //Model ID
		class8.anInt181 = 1800; //1690 zoom increase will make it smaller
		class8.anInt190 = 408; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //2024 model rotate side ways increase to move right in circle
		class8.anInt169 = 5; // model offset increase to move to the right
		class8.anInt194 = 0; //model offset increase to move up
		class8.anInt165 = 6945;//male wearing
		class8.anInt200 = 6946;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Robe Bottom";//Name of the new item
		class8.aByteArray178 = "A Robe Bottom Worn By the Gods.".getBytes();//examin info
		}

		if(i == 9098) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6948; //Model ID
		class8.anInt181 = 600; //980 zoom increase will make it smaller
		class8.anInt190 = 208; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 220; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = -18; //model offset increase to move up
		class8.anInt165 = 6949;//male wearing
		class8.anInt200 = 6950;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Mitre";//Name of the new item
		class8.aByteArray178 = "A Hat Worn By the Gods.".getBytes();//examin info
		}


		if(i == 9099) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6953; //Model ID
		class8.anInt181 = 1980; //zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 1000; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 0; //model offset increase to move up
		class8.anInt165 = 6951;//male wearing
		class8.anInt200 = 6952;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Cape";//Name of the new item
		class8.aByteArray178 = "A Cape Worn By the Gods.".getBytes();//examin info
		}


		if(i == 9100) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6954; //Model ID
		class8.anInt181 = 2000; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt165 = 6955;//male wearing
		class8.anInt200 = 6955;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Crozier";//Name of the new item
		class8.aByteArray178 = "A Staff Used By the Gods.".getBytes();//examin info
		}


		if(i == 9101) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 6956; //Model ID
		class8.anInt181 = 1700; //1200 zoom increase will make it smaller
		class8.anInt190 = 490; //572 model rotate up+down increase to move doen away from you
		class8.anInt198 = 60; //0 model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = -10; //model offset increase to move up
		class8.anInt165 = 6982;//male wearing
		class8.anInt200 = 6984;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Zamorak Stole";//Name of the new item
		class8.aByteArray178 = "A Stole Worn By the Gods.".getBytes();//examin info
		}


if(i == 14632){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 3196;
	class8.anInt181 = 1370;
	class8.anInt190 = 204;
	class8.anInt198 = 804;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = 0;
        class8.anInt165 = 3189;
	class8.anInt200 = 3194;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Ice Cape";
              class8.aByteArray178 = "It's Black Platelegs (B)".getBytes();
              }

if(i == 9091){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int [1];
      //Purple: 926-127
        class8.modifiedModelColors[0] = 926;
        class8.originalModelColors[0] = 128;
	class8.modelId = 2635;//Item Look
	class8.anInt181 = 440;
	class8.anInt190 = 76;
	class8.anInt198 = 1850;
	class8.anInt204 = 0;
        class8.anInt169 = 1;
        class8.anInt194 = 1;
        class8.anInt165 = 187;
	class8.anInt200 = 363;
	class8.anInt175 = 29;
	class8.anInt197 = 87;
	class8.name = "Black Party Hat";
	class8.aByteArray178 = "A nice hat from a cracker.".getBytes();
        }
if(i == 10090)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 51136;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Purple santa hat ";
            class8.aByteArray178 = "Purple santa hat.".getBytes();
        }
        if(i == 12322)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 35321;
            class8.modifiedModelColors[1] = 35321;
            class8.originalModelColors[1] = 35321;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "sky santa hat ";
            class8.aByteArray178 = "Sky santa hat.".getBytes();
        }
if(i == 10091)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 6;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Black santa hat ";
            class8.aByteArray178 = "Black santa hat.".getBytes();
        }

if(i == 10092)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 43297;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Mithril santa hat ";
            class8.aByteArray178 = "Mithril santa hat.".getBytes();
        }

 if(i == 10093)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 36133;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Rune santa hat ";
            class8.aByteArray178 = "Rune santa hat.".getBytes();
        }

        if(i == 10094)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 1000;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Dragon santa hat ";
            class8.aByteArray178 = "Dragon santa hat.".getBytes();
        }

        if(i == 10095)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 21662 ;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Addy santa hat ";
            class8.aByteArray178 = "Addy santa hat.".getBytes();
        }

        if(i == 10096)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 7114;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Gold santa hat ";
            class8.aByteArray178 = "Gold santa hat.".getBytes();
        }

        if(i == 10097)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 10394;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Barrows santa hat ";
            class8.aByteArray178 = "Barrows santa hat.".getBytes();
        }

        if(i == 10098)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 43968;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7097;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Blue santa hat ";
            class8.aByteArray178 = "Blue santa hat.".getBytes();
        }

					if(i == 15095) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 14623; //Model ID
		class8.anInt181 = 800; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt175 = -1;
        class8.anInt197 = -1;
        class8.anInt199 = -1;//noteable
		class8.anInt165 = 14623;//male wearing
		class8.anInt200 = 14623;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Winged Sandals";//Name of the new item
		class8.aByteArray178 = "Apollo's gift.".getBytes();//examine info
		}
        if(i == 7885)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 14045;
            class8.anInt181 = 2000;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt169 = 25;
            class8.anInt194 = 1;
            class8.anInt165 = 14046;
            class8.anInt200 = 14046;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Bandos whip";
            class8.aByteArray178 = "A whip from the warchief Graardor".getBytes();
        }
if(i == 10100)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 6073;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Orange Whip";
            class8.aByteArray178 = "a Orange Whip".getBytes();
        }

if(i == 10101)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 51136;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Purple Whip";
            class8.aByteArray178 = "a Purple Whip".getBytes();
        }

if(i == 10102)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 25;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Unknown Color Whip";
            class8.aByteArray178 = "a Unknown Color Whip".getBytes();
        }

if(i == 10103)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 950;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Red Whip";
            class8.aByteArray178 = "a Red Whip".getBytes();
        }

if(i == 10104)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 43968;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Blue Whip";
            class8.aByteArray178 = "a Blue Whip".getBytes();
        }

if(i == 10105)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 10394;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Barrows Whip";
            class8.aByteArray178 = "a Barrows Whip".getBytes();
        }

if(i == 10106)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 7114;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Gold Whip";
            class8.aByteArray178 = "a Gold Whip".getBytes();
        }
if(i == 10107)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 100;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "White Whip";
            class8.aByteArray178 = "a White Whip".getBytes();
        }

if(i == 15000)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 926;
class8.originalModelColors[0] = 924;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Dragon Whip";
            class8.aByteArray178 = "It Is a Dragon Whip if ur rich its for u!".getBytes();
        }

if(i == 15001)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.aStringArray189[2] = "die!";
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 0;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Death Whip";
            class8.aByteArray178 = "omfg its a death whip!".getBytes();
        }

 if(i == 8000){ //black phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 0;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Black Party Hat";
 class8.aByteArray178 = "An Black Party Hat.".getBytes();
 }

 if(i == 10109){ //orange phat
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int[1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 6073;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Orange Party Hat";
 class8.aByteArray178 = "An Orange Party Hat.".getBytes();
 }

 if(i == 10110){ //Gold phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 8128;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Gold Party Hat";
 class8.aByteArray178 = "A Gold Party Hat.".getBytes();
 }

 if(i == 10111){ 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 50;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Grey Party Hat";
 class8.aByteArray178 = "A Grey Party Hat.".getBytes();
 }

 if(i == 10112){ //Bronze phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 5652;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Bronze Party Hat";
 class8.aByteArray178 = "A Bronze Party Hat.".getBytes();
 }

 if(i == 10113){ //Steel phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 41;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Steel Party Hat";
 class8.aByteArray178 = "A Steel Party Hat.".getBytes();
 }

 if(i == 10114){ //Mithril phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 43297;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Mithril Party Hat";
 class8.aByteArray178 = "A Mithril Party Hat.".getBytes();
 }
 if(i == 15090){ //Mithril phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "look at";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 586;
 class8.originalModelColors[0] = 43297;
 class8.modelId = 546;
 class8.anInt181 = 654;
 class8.anInt190 = 852;
 class8.anInt198 = 36;
 class8.anInt204 = 85;
 class8.anInt169 = 8745;
 class8.anInt194 = 5487;
 class8.anInt165 = 9856;
 class8.anInt200 = 8547;
 class8.anInt175 = 2103;
 class8.anInt197 = 8956;
 class8.name = "rum deal";
 class8.aByteArray178 = "omfg its the rum deal thingy.".getBytes();
 }
 if(i == 10115){ //Adamant phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 21662;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Adamant Party Hat";
 class8.aByteArray178 = "An Addy Party Hat.".getBytes();
 }

 if(i == 10116){ //Rune phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 36133;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Rune Party Hat";
 class8.aByteArray178 = "A Rune Party Hat.".getBytes();
 }

 if(i == 10117){ //Dragon phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 924;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Dragon Party Hat";
 class8.aByteArray178 = "A Dragon Party Hat.".getBytes();
 }

 if(i == 10118){ //Barrows phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.modifiedModelColors = new int[1];
 class8.originalModelColors = new int [1];
 class8.modifiedModelColors[0] = 926;
 class8.originalModelColors[0] = 10388;
 class8.modelId = 2635;
 class8.anInt181 = 440;
 class8.anInt190 = 76;
 class8.anInt198 = 1850;
 class8.anInt204 = 0;
 class8.anInt169 = 1;
 class8.anInt194 = 1;
 class8.anInt165 = 187;
 class8.anInt200 = 363;
 class8.anInt175 = 29;
 class8.anInt197 = 87;
 class8.name = "Barrows Party Hat";
 class8.aByteArray178 = "A Party Hat worn by the Barrows Brothers.".getBytes();
 }

if(i == 10119)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 22464;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Green Whip";
            class8.aByteArray178 = "a Green Whip".getBytes();
        }
if(i == 12345) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.modelId = 12122; // Drop/Inv Model
class8.anInt165 = 12121; // Male Wield Model
class8.anInt200 = 12121; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.name = "Bandos Cape"; // Item Name
class8.aByteArray178 = "The Legendary God Cape".getBytes(); // Item Examine
      }
if(i == 9119)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modelId = 3288;
            class8.anInt181 = 2000;
            class8.anInt190 = 500;
            class8.anInt198 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = 1;
            class8.anInt204 = 14;
            class8.anInt165 = 3287;
            class8.anInt200 = 3287;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;
            class8.name = "Death Cape";
            class8.aByteArray178 = "Death Cape made by death! ".getBytes();
        }







if(i == 6570)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 9631; //Model ID

class8.aBoolean176 = false;//Stackable
}
        if(i == 13599)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 902; // colors
            class8.originalModelColors[0] = 5652; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Bronze defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
        if(i == 13596)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 12; // colors
            class8.originalModelColors[0] = 33; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Iron defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
        if(i == 13597)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 37; // colors
            class8.originalModelColors[0] = 61; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Steel defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
        if(i == 13598)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 1; // colors
            class8.originalModelColors[0] = 1; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Black defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
        if(i == 13599)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 43660; // colors
            class8.originalModelColors[0] = 43297; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Mithril defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
        if(i == 13600)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28; // colors
            class8.modifiedModelColors[0] = 74; // colors
            class8.originalModelColors[0] = 22026; // colors
            class8.originalModelColors[0] = 21662; // colors
            class8.modelId = 4671; //Model ID
            class8.anInt181 = 490;//Model Zoom
            class8.anInt190 = 344;//Model Rotation
            class8.anInt198 = 192;//Unknown
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 1;//Unknown
            class8.anInt194 = 20;//Unknown
            class8.anInt165 = 4672;//male wearing
            class8.anInt200 = 4672;//female wearing
            class8.anInt175 = 56;//Unknown
            class8.anInt197 = 116;//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Adamant defender";//Name of the new item
            class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
if(i == 13601)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 28; // colors
class8.modifiedModelColors[0] = 74; // colors
class8.originalModelColors[0] = 38676; // colors
class8.originalModelColors[0] = 38313; // colors
class8.modelId = 4671; //Model ID
class8.anInt181 = 490;//Model Zoom
class8.anInt190 = 344;//Model Rotation
class8.anInt198 = 192;//Unknown
class8.anInt204 = 138;//Unknown
class8.anInt199 = -1;//noteable
class8.anInt169 = 1;//Unknown
class8.anInt194 = 20;//Unknown
class8.anInt165 = 4672;//male wearing
class8.anInt200 = 4672;//female wearing
class8.anInt175 = 56;//Unknown
class8.anInt197 = 116;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Rune defender";//Name of the new item
class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
              if(i == 13602)  // change this if you need to "item number"
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wield";
		            class8.modifiedModelColors = new int[1];
		            class8.originalModelColors = new int[1];
		class8.modifiedModelColors[0] = 28; // colors
		class8.modifiedModelColors[0] = 74; // colors
		class8.originalModelColors[0] = 38676; // colors
		class8.originalModelColors[0] = 924; // colors
		class8.modelId = 4671; //Model ID - 15335 -These are the models I over wrote for it
			class8.anInt181 = 490;
			class8.anInt190 = 344;
			class8.anInt198 = 192;
			class8.anInt204 = 138;
		        class8.anInt169 = 1;
		        class8.anInt194 = 20;
		class8.anInt165 = 4672;//male wearing 15413
		class8.anInt200 = 4672;//female wearing 15413
		class8.anInt175 = 56;
		class8.anInt197 = 116;
		            class8.name = "Dragon defender";
		            class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
  if(i == 13603)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 28;
            class8.modifiedModelColors[0] = 74;
            class8.originalModelColors[0] = 10512;
            class8.originalModelColors[0] = 10512;
            class8.modelId = 4671;
            class8.anInt181 = 490;
            class8.anInt190 = 344;
            class8.anInt198 = 192;
            class8.anInt204 = 138;
            class8.anInt199 = -1;
            class8.anInt169 = 1;
            class8.anInt194 = 20;
            class8.anInt165 = 4672;
            class8.anInt200 = 4672;
            class8.anInt175 = 56;
            class8.anInt197 = 116;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Barrows defender";
            class8.aByteArray178 = "A defensive weapon.".getBytes();
        }

if(i == 430)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 4673; //Model ID
class8.anInt181 = 1200; //zoom increase will make it smaller
class8.anInt190 = 510; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1840; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 5; //model offset increase to move up
class8.anInt165 = 4674;//male wearing
class8.anInt200 = 4675;//female wearing
class8.anInt164 = 337;//Female arms/sleeves
class8.anInt188 = 156;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Fighter Torso";//Name of the new item
class8.aByteArray178 = "Its A fighter Torso".getBytes();//examin info
        }

if(i == 4827)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 4676; //Model ID
class8.anInt181 = 2128;//Model Zoom
class8.anInt190 = 591;//Model Rotation
class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
class8.anInt204 = 138;//Unknown
class8.anInt199 = -1;//noteable
class8.anInt169 = 8;// model offset increase to move to the right
class8.anInt194 = 11;//model offset increase to move up
class8.anInt165 = 4677;//male wearing
class8.anInt200 = 4677;//female wearing
class8.anInt175 = -1;//Unknown
class8.aBoolean176 = false;//Stackable//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Dark bow";//Name of the new item
class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
if(i == 2904)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 4678; //Model ID
class8.anInt181 = 595;//Model Zoom
class8.anInt190 = 0;//Model Rotation
class8.anInt198 = 0;//model rotate side ways increase to move right in circle
class8.anInt204 = 0;//Unknown
class8.anInt199 = 0;//noteable
class8.anInt169 = 0;// model offset increase to move to the right
class8.anInt194 = 0;//model offset increase to move up
class8.anInt165 = 4679;//male wearing
class8.anInt200 = 4680;//female wearing
class8.anInt175 = 56;//Unknown
class8.anInt197 = 116;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Dragon Boots";//Name of the new item
class8.aByteArray178 = "A nice pair Of boots".getBytes();//examin info
        }
        if(i == 15350)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.modelId = 28135;
class8.anInt181 = 724;
class8.anInt190 = 171;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -7;
class8.anInt165 = 27737;
class8.anInt200 = 19951;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "Bandos boots";
            class8.aByteArray178 = "A nice set of Bandos boots, worn once by the god Bandos.".getBytes();
        }
        if(i == 15348)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
class8.modelId = 28133;
class8.anInt181 = 984;
class8.anInt190 = 501;
class8.anInt198 = 6;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 4;
class8.anInt165 = 27732;
class8.anInt200 = 27753;
class8.anInt188 = 27748;
class8.anInt164 = 27759;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Bandos Chestplate";
            class8.aByteArray178 = "Its A Bandos Chestplate".getBytes();
        }
        if(i == 15349)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
class8.modelId = 28131;
class8.anInt181 = 854;
class8.anInt190 = 540;
class8.anInt198 = 2039;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = 3;
class8.anInt165 = 27739;
class8.anInt200 = 27755;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Bandos tassets";
            class8.aByteArray178 = "Its A Bandos Tassets".getBytes();
        }
if(i == 15345) //id
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 28139;
class8.anInt181 = 789;
class8.anInt190 = 66;
class8.anInt198 = 372;
class8.anInt204 = 0;
class8.anInt169 = 9;
class8.anInt194 = 0;
class8.anInt165 = 27747;
class8.anInt200 = 27757;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28259;
class8.anInt197 = 28260;
class8.name = "Armadyl Helm";
class8.aByteArray178 = "Its an Armadyl Helm".getBytes();
}
if (i == 15346) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 28141;
class8.anInt181 = 854;
class8.anInt190 = 453;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = -5;
class8.anInt165 = 27734;
class8.anInt200 = 27752;
class8.anInt188 = 27750;
class8.anInt164 = 27758;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Armadyl chestplate";
class8.aByteArray178 = "Provides excellent protection.".getBytes();
}
if (i == 15347) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 28132;
class8.anInt181 = 1957;
class8.anInt190 = 555;
class8.anInt198 = 2036;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -3;
class8.anInt165 = 27742;
class8.anInt200 = 27756;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.name = "Armadyl plateskirt";
class8.aByteArray178 = "Provides excellent protection.".getBytes();
}
if(i == 15989)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 4678; //Model ID
class8.anInt181 = 595;//Model Zoom
class8.anInt190 = 0;//Model Rotation
class8.anInt198 = 0;//model rotate side ways increase to move right in circle
class8.anInt204 = 0;//Unknown
class8.anInt199 = 0;//noteable
class8.anInt169 = 0;// model offset increase to move to the right
class8.anInt194 = 0;//model offset increase to move up
class8.anInt165 = 4679;//male wearing
class8.anInt200 = 4680;//female wearing
class8.anInt175 = 56;//Unknown
class8.anInt197 = 116;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Red Boots";//Name of the new item
class8.aByteArray178 = "Just Some Old Red Boots.".getBytes();//examin info
        }
if(i == 14571)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 32465;
    class8.modifiedModelColors[1] = 912;
    class8.originalModelColors[1] = 64449;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.modelId = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Mod Sgs Platelegs";
    class8.aByteArray178 = "A set of Mod Sgs's platelegs.".getBytes();
}
        if(i == 9172)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modelId = 12234;
            class8.anInt181 = 1100;
            class8.anInt190 = 498;
            class8.anInt198 = 550;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12233;
            class8.anInt200 = 12233;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bandos C'Bow";
            class8.aByteArray178 = "A great bow, used by the best warriors.".getBytes();
        }
        if(i == 9173)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modelId = 13421;
            class8.anInt181 = 1100;
            class8.anInt190 = 498;
            class8.anInt198 = 550;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 13422;
            class8.anInt200 = 13422;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dragon C'Bow";
            class8.aByteArray178 = "A powerful and rare crossbow".getBytes();
        }
if(i == 9015)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modelId = 9226;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9233;
    class8.anInt200 = 9233;
    class8.name = "Death Cape (blue)";
    class8.aByteArray178 = "Its A Death Cape (blue)".getBytes();
}
if(i == 9014)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modelId = 9232;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9231;
    class8.anInt200 = 9231;
    class8.name = "Death Cape (green)";
    class8.aByteArray178 = "Its A Death Cape (green)".getBytes();
}
if(i == 9013)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modelId = 9230;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9229;
    class8.anInt200 = 9229;
    class8.name = "Death Cape (sky)";
    class8.aByteArray178 = "Its A Death Cape (sky)".getBytes();
}
if(i == 9012)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modelId = 9228;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9227;
    class8.anInt200 = 9227;
    class8.name = "Mod Sgs Death Cape";
    class8.aByteArray178 = "Its Mod Sgs's Death cape".getBytes();
}
if(i == 12312)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 6073;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
    class8.name = "Orange cavalier";
    class8.aByteArray178 = "a Orange cavalier".getBytes();
}
if(i == 12313)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 51136;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
    class8.name = "Purple cavalier";
    class8.aByteArray178 = "a Purple cavalier".getBytes();
}
if(i == 12314)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 25;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
    class8.name = "Unknown Color cavalier";
    class8.aByteArray178 = "a Unknown Color cavalier".getBytes();
}
if(i == 12315)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 950;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
    class8.name = "Red cavalier";
    class8.aByteArray178 = "a Red cavalier".getBytes();
}

if(i == 15043) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7360;
class8.anInt194 = 0;
class8.anInt181 = 810;
class8.anInt198 = 194;
class8.anInt190 = 207;
class8.anInt169 = 4;
class8.anInt165 = 7388;
class8.modelId = 7720;
class8.anInt164 = -1;
class8.name = "Lord marshal boots";
class8.aByteArray178 = "Its a lord marshal boots".getBytes();
}

if(i == 15044) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7366;
class8.anInt194 = 0;
class8.anInt181 = 779;
class8.anInt198 = 828;
class8.anInt190 = 420;
class8.anInt169 = 0;
class8.anInt165 = 7390;
class8.modelId = 7743;
class8.anInt164 = -1;
class8.name = "Lord marshal gloves";
class8.aByteArray178 = "Its a lord marshal gloves".getBytes();
}
if(i == 16030)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 8245;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 8245;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Dark Gray santa hat ";
    class8.aByteArray178 = "Dark Gray santa hat.".getBytes();
}
if(i == 16031)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 18105;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 18105;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Lime Green santa hat ";
    class8.aByteArray178 = "Lime Green santa hat.".getBytes();
}
if(i == 16032)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 45549;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 45549;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Unknowed White santa hat ";
    class8.aByteArray178 = "Unknowed White santa hat.".getBytes();
}
if(i == 16033)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 50971;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 50971;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Deep Purple santa hat ";
    class8.aByteArray178 = "Deep Purple santa hat.".getBytes();
}
if(i == 16034)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 60176;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 60176;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Deeper Purple santa hat ";
    class8.aByteArray178 = "Deeper Purple santa hat.".getBytes();
}
if(i == 16035)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 19213;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 19213;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Deep Green santa hat ";
    class8.aByteArray178 = "Deep Green santa hat.".getBytes();
}
if(i == 16035)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 3654;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 3654;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Dull Orange santa hat ";
    class8.aByteArray178 = "Dull Orange santa hat.".getBytes();
}
if(i == 16036)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 12904;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 12904;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Bright Yellow santa hat ";
    class8.aByteArray178 = "Bright Yellow santa hat.".getBytes();
}
if(i == 16037)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 618;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 618;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Bright Pink santa hat ";
    class8.aByteArray178 = "Bright Pink santa hat.".getBytes();
}
if(i == 16038)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 46440;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 46440;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Bright Blue santa hat ";
    class8.aByteArray178 = "Bright Blue santa hat.".getBytes();
}
if(i == 16039)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 11378;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 11378;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Bright Gray santa hat ";
    class8.aByteArray178 = "Bright Gray santa hat.".getBytes();
}
if(i == 16040)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 36207;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 36207;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Bright Sky Blue santa hat ";
    class8.aByteArray178 = "Bright Sky Blue santa hat.".getBytes();
}
if(i == 16041)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 32562;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 32562;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Teal santa hat ";
    class8.aByteArray178 = "Teal santa hat.".getBytes();
}
if(i == 16042)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 933;
    class8.originalModelColors[0] = 8245;
    class8.modifiedModelColors[1] = 10351;
    class8.originalModelColors[1] = 8245;
    class8.modelId = 2537;
    class8.anInt181 = 540;
    class8.anInt190 = 72;
    class8.anInt198 = 136;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -3;
    class8.anInt165 = 189;
    class8.anInt188 = -1;
    class8.anInt200 = 366;
    class8.anInt164 = -1;
    class8.anInt175 = 69;
    class8.anInt197 = 127;
    class8.aBoolean176 = false;
    class8.name = "Dark Gray santa hat ";
    class8.aByteArray178 = "Dark Gray santa hat.".getBytes();
}

if(i == 15612)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 32984;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
    class8.name = "Diamond Whip";
    class8.aByteArray178 = "a Diamond Whip".getBytes();
}


if(i == 15613)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 33;
class8.originalModelColors[0] = 32984;
class8.modifiedModelColors[1] = 49;
class8.originalModelColors[1] = 32984;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 32984;
class8.modelId = 2558;
class8.anInt181 = 1100;
class8.anInt190 = 568;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt165 = 301;
class8.anInt200 = 464;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Diamond chainbody";
    class8.aByteArray178 = "a Diamond chainbody".getBytes();
}

if(i == 15614)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 24;
class8.originalModelColors[0] = 32984;
class8.modifiedModelColors[1] = 61;
class8.originalModelColors[1] = 32984;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 32984;
class8.modelId = 2605;
class8.anInt181 = 1250;
class8.anInt190 = 488;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 0;
class8.anInt165 = 306;
class8.anInt200 = 468;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Diamond Platebody";
    class8.aByteArray178 = "a Diamond Platebody".getBytes();
}

if(i == 15615)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 32984;
class8.modelId = 2833;
class8.anInt181 = 640;
class8.anInt190 = 108;
class8.anInt198 = 156;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = -4;
class8.anInt165 = 219;
class8.anInt200 = 395;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 57;
class8.anInt197 = 117;
    class8.name = "Diamond Med Helm";
    class8.aByteArray178 = "a Diamond Med Helm".getBytes();
}

if(i == 15616)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 32984;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 48030;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 56;
class8.anInt197 = 116;
    class8.name = "Diamond full Helm";
    class8.aByteArray178 = "a Diamond full Helm".getBytes();
}

if(i == 15617)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 32984;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 32984;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 32984;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Diamond Platelegs";
    class8.aByteArray178 = "a Diamond platelegs".getBytes();
}
if(i == 15040)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11003;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Black trimmed-armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full black T.".getBytes();
}
if(i == 15039)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11002;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Red D'hide armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full Red D'hide. ".getBytes();
}
if(i == 15038)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11009;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Donators-items set";
class8.aByteArray178 = "If you Separate it,you will get all the donators item!".getBytes();
}
if(i == 15037)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11008;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Void Knight armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get Full Void!".getBytes();
}
if(i == 15036)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11007;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Dharok armour set (I)";
class8.aByteArray178 = "Full Dharok! (Helm,Plate,Legs,Axe).".getBytes();
}
if(i == 15035)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11006;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Armadyl armour set (I)";
class8.aByteArray178 = "Full Armadyl + Ags (Armadyl God Sword).".getBytes();
}
if(i == 15034)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11005;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Zamarok armour set (I)";
class8.aByteArray178 = "Full Zamarok,includes helm,plate,legs,kite!".getBytes();
}
if(i == 15033)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11004;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Skill Capes set (I)";
class8.aByteArray178 = "Includes all skill capes that bobs sell!".getBytes();
}
if(i == 15032)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11000;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Saradomin armour set (I)";
class8.aByteArray178 = "Includes saradomin helm,plate,legs,kite!".getBytes();
}
if(i == 15031)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11023;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Ahrim armour set (I)";
class8.aByteArray178 = "Full Ahrim! (Helm,Plate,Legs,Staff).".getBytes();
}
if(i == 15030)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11022;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Godswords set (I)";
class8.aByteArray178 = "Includes all godswords!(Ags+Sgs+Zgs+Bgs).".getBytes();
}
if(i == 15029)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11021;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Black trimmed-armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full black T.".getBytes();
}
if(i == 15028)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11020;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Guthix armour set (I)";
class8.aByteArray178 = "Includes guthix helm,plate,legs,kite!".getBytes();
}
if(i == 15027)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11019;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Initiate armour set (I)";
class8.aByteArray178 = "Includes Initiate helm,plate,legs.".getBytes();
}
if(i == 15026)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11018;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Green D'hide armour set (I)";
class8.aByteArray178 = "It has full Green D'hide armour!".getBytes();
}
if(i == 15025)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11017;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Verac armour set (I)";
class8.aByteArray178 = "Full Verac! (Helm,Chest,Skirt,Falil!).".getBytes();
}
if(i == 15024)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11016;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Blue D'hide armour set (I)";
class8.aByteArray178 = "It has full Blue D'hide armour!".getBytes();
}
if(i == 15023)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11015;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Guthan armour set (I)";
class8.aByteArray178 = "Full Guthan! (Helm,Chest,Skirt,Warspear!).".getBytes();
}
if(i == 15022)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11014;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Saradomin armour set (I)";
class8.aByteArray178 = "Includes saradomin helm,plate,legs,kite!".getBytes();
}
if(i == 15021)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11013;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "Torag armour set (I)";
class8.aByteArray178 = "Full Torag! (Helm,Plate,Legs,Hammers).".getBytes();
}
if(i == 15020)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11011;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "uknown";
class8.aByteArray178 = "A g.e boxset.".getBytes();
}
if(i == 15019)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.modelId = 11010;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.name = "unknown";
class8.aByteArray178 = "A g.e boxset.".getBytes();
}
if(i == 14343)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 10394;
    class8.originalModelColors[0] = 6069;
    class8.modifiedModelColors[1] = 6020;
    class8.originalModelColors[1] = 6020;
    class8.modelId = 6583;
    class8.anInt181 = 860;
    class8.anInt190 = 2012;
    class8.anInt198 = 188;
    class8.anInt204 = 0;
    class8.anInt169 = 17;
    class8.anInt194 = 0;
    class8.anInt165 = 6653;
    class8.anInt200 = 6687;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = 6570;
    class8.anInt197 = 6575;
    class8.name = "Lava Helm";
    class8.aByteArray178 = "It's a Lava helm".getBytes();
}
if(i == 14338)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 6072;
    class8.modifiedModelColors[1] = 912;
    class8.originalModelColors[1] = 6054;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.modelId = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Lava Platelegs";
    class8.aByteArray178 = "Lava platelegs".getBytes();
}
if(i == 14342)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[3];
    class8.originalModelColors = new int[3];
    class8.modifiedModelColors[0] = 10283;
    class8.originalModelColors[0] = 6069;
    class8.modifiedModelColors[1] = 10270;
    class8.originalModelColors[1] = 6073;
    class8.modifiedModelColors[2] = 3326;
    class8.originalModelColors[2] = 6074;
    class8.modelId = 8700;
    class8.anInt181 = 710;
    class8.anInt190 = 332;
    class8.anInt198 = 2000;
    class8.anInt204 = 0;
    class8.anInt169 = 2;
    class8.anInt194 = -14;
    class8.anInt165 = 8726;
    class8.anInt200 = 8750;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Lava Gauntlets";
    class8.aByteArray178 = "Lava Gauntlets.".getBytes();
}
if(i == 14339)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[5];
    class8.originalModelColors = new int[5];
    class8.modifiedModelColors[0] = 914;
    class8.originalModelColors[0] = 6070;
    class8.modifiedModelColors[1] = 918;
    class8.originalModelColors[1] = 6070;
    class8.modifiedModelColors[2] = 922;
    class8.originalModelColors[2] = 6071;
    class8.modifiedModelColors[3] = 391;
    class8.originalModelColors[3] = 6070;
    class8.modifiedModelColors[4] = 917;
    class8.originalModelColors[4] = 6069;
    class8.anInt181 = 1100;
    class8.anInt190 = 568;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = 2;
    class8.anInt165 = 3820;
    class8.anInt200 = 3821;
    class8.modelId = 3823;
    class8.anInt188 = 156;
    class8.anInt164 = 337;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Lava Chainmail";
    class8.aByteArray178 = "It's a Lava Chain".getBytes();
}
if(i == 14340)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[3];
    class8.originalModelColors = new int[3];
    class8.modifiedModelColors[0] = 43127;
    class8.originalModelColors[0] = 6073;
    class8.modifiedModelColors[1] = 38119;
    class8.originalModelColors[1] = 6069;
    class8.modifiedModelColors[2] = 36975;
    class8.originalModelColors[2] = 6069;
    class8.modelId = 5198;
    class8.anInt181 = 1900;
    class8.anInt190 = 500;
    class8.anInt198 = 500;
    class8.anInt204 = 0;
    class8.anInt169 = 3;
    class8.anInt194 = 6;
    class8.anInt200 = 5196;
    class8.anInt165 = 5196;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Lava shield";
    class8.aByteArray178 = "Lava shield".getBytes();
}
if(i == 14341)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[4];
    class8.originalModelColors = new int[4];
    class8.modifiedModelColors[0] = 61;
    class8.originalModelColors[0] = 6073;
    class8.modelId = 5037;
    class8.anInt181 = 770;
    class8.anInt190 = 164;
    class8.anInt198 = 156;
    class8.anInt204 = 0;
    class8.anInt169 = 3;
    class8.anInt194 = -3;
    class8.anInt165 = 4954;
    class8.anInt200 = 5031;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Lava Boots";
    class8.aByteArray178 = "Lava boots".getBytes();
}
if(i == 14243)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 10394;
    class8.originalModelColors[0] = -22221;
    class8.modifiedModelColors[1] = 6020;
    class8.originalModelColors[1] = -22221;
    class8.modelId = 6583;
    class8.anInt181 = 860;
    class8.anInt190 = 2012;
    class8.anInt198 = 188;
    class8.anInt204 = 0;
    class8.anInt169 = 17;
    class8.anInt194 = 0;
    class8.anInt165 = 6653;
    class8.anInt200 = 6687;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = 6570;
    class8.anInt197 = 6575;
    class8.name = "Blue Dragon Helm";
    class8.aByteArray178 = "It's a Blue Dragon helm".getBytes();
}
if(i == 14238)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[2];
    class8.originalModelColors = new int[2];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = -22221;
    class8.modifiedModelColors[1] = 912;
    class8.originalModelColors[1] = -22221;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.modelId = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Blue Dragon Platelegs";
    class8.aByteArray178 = "Blue Dragon platelegs".getBytes();
}
if(i == 14242)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[3];
    class8.originalModelColors = new int[3];
    class8.modifiedModelColors[0] = 10283;
    class8.originalModelColors[0] = -22221;
    class8.modifiedModelColors[1] = 10270;
    class8.originalModelColors[1] = -22221;
    class8.modifiedModelColors[2] = 3326;
    class8.originalModelColors[2] = -22221;
    class8.modelId = 8700;
    class8.anInt181 = 710;
    class8.anInt190 = 332;
    class8.anInt198 = 2000;
    class8.anInt204 = 0;
    class8.anInt169 = 2;
    class8.anInt194 = -14;
    class8.anInt165 = 8726;
    class8.anInt200 = 8750;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Blue Dragon Gauntlets";
    class8.aByteArray178 = "Blue Dragon Gauntlets.".getBytes();
}
if(i == 14239)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[5];
    class8.originalModelColors = new int[5];
    class8.modifiedModelColors[0] = 914;
    class8.originalModelColors[0] = -22221;
    class8.modifiedModelColors[1] = 918;
    class8.originalModelColors[1] = -22221;
    class8.modifiedModelColors[2] = 922;
    class8.originalModelColors[2] = -22221;
    class8.modifiedModelColors[3] = 391;
    class8.originalModelColors[3] = -22221;
    class8.modifiedModelColors[4] = 917;
    class8.originalModelColors[4] = -22221;
    class8.anInt181 = 1100;
    class8.anInt190 = 568;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = 2;
    class8.anInt165 = 3820;
    class8.anInt200 = 3821;
    class8.modelId = 3823;
    class8.anInt188 = 156;
    class8.anInt164 = 337;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Blue Dragon chainbody";
    class8.aByteArray178 = "It's a Blue Dragon Chain".getBytes();
}
if(i == 14240)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[3];
    class8.originalModelColors = new int[3];
    class8.modifiedModelColors[0] = 43127;
    class8.originalModelColors[0] = 43968;
    class8.modifiedModelColors[1] = 38119;
    class8.originalModelColors[1] = 43968;
    class8.modifiedModelColors[2] = 36975;
    class8.originalModelColors[2] = 43968;
    class8.modelId = 5198;
    class8.anInt181 = 1900;
    class8.anInt190 = 500;
    class8.anInt198 = 500;
    class8.anInt204 = 0;
    class8.anInt169 = 3;
    class8.anInt194 = 6;
    class8.anInt200 = 5196;
    class8.anInt165 = 5196;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Blue shield";
    class8.aByteArray178 = "Blue shield".getBytes();
}
if(i == 14241)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[4];
    class8.originalModelColors = new int[4];
    class8.modifiedModelColors[0] = 61;
    class8.originalModelColors[0] = 43968;
    class8.modelId = 5037;
    class8.anInt181 = 770;
    class8.anInt190 = 164;
    class8.anInt198 = 156;
    class8.anInt204 = 0;
    class8.anInt169 = 3;
    class8.anInt194 = -3;
    class8.anInt165 = 4954;
    class8.anInt200 = 5031;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.name = "Blue Boots";
    class8.aByteArray178 = "Blue boots".getBytes();
}


if (i == 17391) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13302;
class8.anInt194 = 0;
class8.anInt181 = 1447;
class8.anInt198 = 0;
class8.anInt190 = 485;
class8.anInt169 = 0;
class8.anInt165 = 13303;
class8.modelId = 13304;
class8.anInt164 = -1;
class8.name = "Katagon platebody";
class8.aByteArray178 = "Its a Katagon platebody".getBytes();
}
if(i == 15712)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43968;
class8.modelId = 2373;
class8.anInt181 = 1180;
class8.anInt190 = 300;
class8.anInt198 = 1120;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = 4;
class8.anInt165 = 490;
class8.anInt200 = 490;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Blue scimitar";
    class8.aByteArray178 = "a Blue scimitar".getBytes();
}
if(i == 15310)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 0;
    class8.originalModelColors[0] = 0;
class8.modelId = 27163;
class8.anInt181 = 620;
class8.anInt190 = 88;
class8.anInt198 = 188;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = -1;
class8.anInt165 = 230;
class8.anInt200 = 403;
class8.anInt188 = 27150;
class8.anInt164 = 27138;
class8.anInt175 = 63;
class8.anInt197 = 120;
    class8.name = "Void ranger helm";
    class8.aByteArray178 = "a Void ranger helm".getBytes();
}
if(i == 13591)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 43072;
    class8.originalModelColors[0] = 4550;
class8.modelId = 15282;
class8.anInt181 = 919;
class8.anInt190 = 459;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 3;
class8.anInt165 = 14567;
class8.anInt200 = 15290;
class8.anInt188 = 173;
class8.anInt164 = 14570;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Void knight top";
    class8.aByteArray178 = "Its a Void knight top".getBytes();
}
if(i == 13592)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    //class8.anIntArray156 = new int[1];
    //class8.anIntArray160 = new int[1];
    //class8.anIntArray156[0] = 43072;
    //class8.anIntArray160[0] = 4550;
class8.modelId = 15281;
class8.anInt181 = 2022;
class8.anInt190 = 408;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 14566;
class8.anInt200 = 14576;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Void knight robe";
    class8.aByteArray178 = "Its a Void knight robe".getBytes();
}
if(i == 1617){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut diamond";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 127;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1619){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut ruby";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 931;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1621){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut emerald";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 22443;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1623){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut sapphire";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43951;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1625){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut opal";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 10465;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1627){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut jade";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 17633;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1629){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut red topaz";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 61376;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 1631){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut dragonstone";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 51111;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 6571){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.name = "Uncut onyx";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43528;
class8.modelId = 2528;//Inv & Ground
class8.anInt181 = 780;
class8.anInt190 = 368;
class8.anInt198 = 220;
class8.anInt204 = 1860;
class8.anInt169 = -5;
class8.anInt194 = 7;
class8.anInt165 = -1;//Male Wield View
class8.anInt200 = -1;//Female Wield View
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
}
if(i == 18379){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56430;
class8.anInt194 = 0;
class8.anInt181 = 921;
class8.anInt198 = 0;
class8.anInt190 = 108;
class8.anInt169 = 0;
class8.anInt165 = 55762;
class8.modelId = 54104;
class8.anInt164 = -1;
class8.name = "Promethium full helm";
class8.aByteArray178 = "A Promethium full helm".getBytes();
}
if(i == 18377){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56142;
class8.anInt194 = 0;
class8.anInt181 = 1645;
class8.anInt198 = 1589;
class8.anInt190 = 1603;
class8.anInt169 = -1;
class8.anInt165 = 56142;
class8.modelId = 54230;
class8.anInt164 = -1;
class8.name = "Promethium 2h sword";
class8.aByteArray178 = "A Promethium 2h sword".getBytes();
}
if(i == 18375){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56487;
class8.anInt194 = 0;
class8.anInt181 = 1730;
class8.anInt198 = 0;
class8.anInt190 = 525;
class8.anInt169 = 7;
class8.anInt165 = 55818;
class8.modelId = 54012;
class8.anInt164 = -1;
class8.name = "Promethium platelegs ";
class8.aByteArray178 = "A pair of Promethium platelegs ".getBytes();
}
if(i == 18373){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56491;
class8.anInt194 = 0;
class8.anInt181 = 1711;
class8.anInt198 = 0;
class8.anInt190 = 485;
class8.anInt169 = 0;
class8.anInt165 = 55802;
class8.modelId = 54166;
class8.anInt164 = -1;
class8.name = "Promethium plateskirt ";
class8.aByteArray178 = "A Promethium Plateskirt ".getBytes();
}
if(i == 18371){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56372;
class8.anInt194 = 0;
class8.anInt181 = 789;
class8.anInt198 = 156;
class8.anInt190 = 164;
class8.anInt169 = 3;
class8.anInt165 = 55698;
class8.modelId = 54179;
class8.anInt164 = -1;
class8.name = "Promethium boots ";
class8.aByteArray178 = "A pair of Promethium boots ".getBytes();
}
if(i == 18369){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 56416;
class8.anInt194 = 0;
class8.anInt181 = 930;
class8.anInt198 = 828;
class8.anInt190 = 420;
class8.anInt169 = 3;
class8.anInt165 = 55737;
class8.modelId = 54002;
class8.anInt164 = -1;
class8.name = "Promethium gauntlets ";
class8.aByteArray178 = "A pair of Promethium gauntlets ".getBytes();
}
if(i == 18367){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.modelId = 54445;
class8.anInt165 = 56075;
class8.anInt200 = 56075;
class8.anInt181 = 1776;
class8.anInt190 = 344;
class8.anInt188 = -1;
class8.anInt198 = 0;  
class8.anInt169 = -3;              
class8.anInt164 = -1;
class8.anInt194 = 0;
class8.name = "Promethium kiteshield ";
class8.aByteArray178 = "A Promethium kiteshield ".getBytes();
}
if(i == 18365){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.modelId = 54171;
class8.anInt165 = 55884;
class8.anInt200 = 56539;
class8.anInt181 = 1447;
class8.anInt190 = 485;
class8.anInt188 = -1;
class8.anInt198 = 0;  
class8.anInt169 = 0;              
class8.anInt164 = -1;
class8.name = "Promethium platebody";
class8.aByteArray178 = "A Promethium platebody".getBytes();
}
if(i == 11686)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 5652;
class8.modelId = 28164;
class8.anInt181 = 1503;
class8.anInt190 = 567;
class8.anInt198 = 249;
class8.anInt204 = 0;
class8.anInt169 = 8;
class8.anInt194 = 8;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}

if(i == 11687)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 5652;
class8.modelId = 28145;
class8.anInt181 = 1632;
class8.anInt190 = 567;
class8.anInt198 = 249;
class8.anInt204 = 0;
class8.anInt169 = 8;
class8.anInt194 = 8;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}
if(i == 11688)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 5652;
class8.modelId = 28166;
class8.anInt181 = 1040;
class8.anInt190 = 352;
class8.anInt198 = 1156;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -3;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Godsword blade";
    class8.aByteArray178 = "Its a Godsword blade".getBytes();
}
if(i == 11689)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 5652;
class8.modelId = 28150;
class8.anInt181 = 1168;
class8.anInt190 = 463;
class8.anInt198 = 263;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -3;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}
if(i == 11690)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.aStringArray189[2] = "Dismantle"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.modelId = 28162;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 27731;
class8.anInt200 = 27731;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Armadyl godsword";
    class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
}

if(i == 12316)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 10394;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Barrows cavalier";
class8.aByteArray178 = "a Barrows cavalier".getBytes();
}
if(i == 12317)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 7114;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Gold cavalier";
class8.aByteArray178 = "a Gold cavalier".getBytes();
}
if(i == 12318)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 100;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "White cavalier";
class8.aByteArray178 = "a White cavalier".getBytes();
}
if(i == 12319)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 924;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Dragon cavalier";
class8.aByteArray178 = "a Dragon cavalier".getBytes();
}
if(i == 13482){ //Black Platelegs (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 22464;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platelegs (G)";
class8.aByteArray178 = "It's Steel Platelegs (G)".getBytes();
}
if(i == 13483){ //Black Platebody (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 22464;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43072;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platebody (G)";
class8.aByteArray178 = "It's a Steel Platebody (G)".getBytes();
}
if(i == 13484){ //Black Helm (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 22464;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Steel Helm (G)";
class8.aByteArray178 = "It's a Steel Helm (G)".getBytes();
}
if(i == 13485){ //Black Kiteshield (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 22464;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Kiteshield (G)";
class8.aByteArray178 = "It's a Steel Kiteshield (G)".getBytes();
}
if(i == 13486){ //Black Platelegs (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 100;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platelegs (W)";
class8.aByteArray178 = "It's Steel Platelegs (W)".getBytes();
}
if(i == 13487){ //Black Platebody (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 100;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43072;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platebody (W)";
class8.aByteArray178 = "It's a Steel Platebody (W)".getBytes();
}
if(i == 13488){ //Black Helm (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 100;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Steel Helm (W)";
class8.aByteArray178 = "It's a Steel Helm (W)".getBytes();
}
if(i == 13489){ //Black Kiteshield (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 100;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Kiteshield (W)";
class8.aByteArray178 = "It's a Steel Kiteshield (W)".getBytes();
}
if(i == 13490){ //Black Platelegs (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 43968;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platelegs (B)";
class8.aByteArray178 = "It's Steel Platelegs (B)".getBytes();
}
if(i == 13491){ //Black Platebody (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 43968;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43072;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platebody (B)";
class8.aByteArray178 = "It's a Steel Platebody (B)".getBytes();
}
if(i == 13492){ //Black Helm (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 43968;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Steel Helm (B)";
class8.aByteArray178 = "It's a Steel Helm (B)".getBytes();
}
if(i == 13493){ //Black Kiteshield (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 43968;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Kiteshield (B)";
class8.aByteArray178 = "It's a Steel Kiteshield (B)".getBytes();
}
if(i == 13494){ //Steel Platelegs (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 6073;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platelegs (O)";
class8.aByteArray178 = "It's Steel Platelegs (O)".getBytes();
}
if(i == 13495){ //Steel Platebody (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 6073;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43072;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platebody (O)";
class8.aByteArray178 = "It's a Steel Platebody (O)".getBytes();
}
if(i == 13496){ //Steel Helm (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 6073;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Steel Helm (O)";
class8.aByteArray178 = "It's a Steel Helm (O)".getBytes();
}
if(i == 13497){ //Steel Kiteshield (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 6073;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Kiteshield (O)";
class8.aByteArray178 = "It's a Steel Kiteshield (O)".getBytes();
}
if(i == 13498){ //Steel Platelegs (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 51136;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platelegs (P)";
class8.aByteArray178 = "It's Steel Platelegs (P)".getBytes();
}
if(i == 13499){ //Steel Platebody (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 51136;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43072;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Platebody (P)";
class8.aByteArray178 = "It's a Steel Platebody (P)".getBytes();
}
if(i == 13500){ //Steel Helm (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 51136;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Steel Helm (P)";
class8.aByteArray178 = "It's a Steel Helm (P)".getBytes();
}
if(i == 13501){ //Steel Kiteshield (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43072;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43072;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 51136;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Steel Kiteshield (P)";
class8.aByteArray178 = "It's a Steel Kiteshield (P)".getBytes();
}
if(i == 13502){ //Mith Platelegs (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43297;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 22464;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Mith Platelegs (G)";
class8.aByteArray178 = "It's Mith Platelegs (G)".getBytes();
}
if(i == 13503){ //Mith Platebody (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 22464;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43297;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Mith Platebody (G)";
class8.aByteArray178 = "It's a Mith Platebody (G)".getBytes();
}
if(i == 13504){ //Mith Helm (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 22464;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Mith Helm (G)";
class8.aByteArray178 = "It's a Mith Helm (G)".getBytes();
}
if(i == 13505){ //Mith Kiteshield (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 57;
class8.originalModelColors[1] = 43297;
class8.modifiedModelColors[2] = 7054;
class8.originalModelColors[2] = 22464;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Mith Kiteshield (G)";
class8.aByteArray178 = "It's a Mith Kiteshield (G)".getBytes();
}
if(i == 13506){ //Mith Platelegs (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 43297;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 100;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Mith Platelegs (W)";
class8.aByteArray178 = "It's Mith Platelegs (W)".getBytes();
}
if(i == 13507){ //Mith Platebody (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int [3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 24;
class8.originalModelColors[1] = 100;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 43297;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Mith Platebody (W)";
class8.aByteArray178 = "It's a Mith Platebody (W)".getBytes();
}
if(i == 13508){ //Mith Helm (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int [2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 43297;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 100;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
class8.name = "Mith Helm (W)";
class8.aByteArray178 = "It's a Mith Helm (W)".getBytes();
}
        if(class8.anInt163 != -1)
            class8.method199((byte)61);
        if(!aBoolean182 && class8.aBoolean161)
        {
            class8.name = "Members Object";
            class8.aByteArray178 = "Login to a members' server to use this object.".getBytes();
            class8.aStringArray168 = null;
            class8.aStringArray189 = null;
            class8.anInt202 = 0;
        }

        return class8;
    }

 public static Class8 method198_2(int i, Class8 class8)
{

        if(i == 14568)
        {
            Jukkyname("Mod sgs Platebody", "Its Mod Sgs's platebody.");
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            Jukkycolors(61, 32465, 0);
            Jukkycolors(24, 64449, 1);
            Jukkycolors(41, 32465, 2);
            Jukkycolors(10394, 32465, 3);
            Jukkycolors(10518, 64449, 4);
            Jukkycolors(10388, 64449, 5);
            Jukkycolors(10514, 64449, 6);
            Jukkycolors(10508, 64449, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
if(i == 13509){ //Mith Kiteshield (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 100;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Kiteshield (W)";
      class8.aByteArray178 = "It's a Mith Kiteshield (W)".getBytes();
      }
if(i == 13510){ //Mith Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platelegs (B)";
      class8.aByteArray178 = "It's Mith Platelegs (B)".getBytes();
      }
if(i == 13511){ //Mith Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 43968;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 43297;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platebody (B)";
      class8.aByteArray178 = "It's a Mith Platebody (B)".getBytes();
      }
if(i == 13512){ //Mith Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 43968;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Mith Helm (B)";
      class8.aByteArray178 = "It's a Mith Helm (B)".getBytes();
      }
if(i == 13513){ //Mith Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Kiteshield (B)";
      class8.aByteArray178 = "It's a Mith Kiteshield (B)".getBytes();
      }
if(i == 13514){ //Mith Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platelegs (O)";
      class8.aByteArray178 = "It's Mith Platelegs (O)".getBytes();
      }
if(i == 13515){ //Mith Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 6073;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 43297;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platebody (O)";
      class8.aByteArray178 = "It's a Mith Platebody (O)".getBytes();
      }
if(i == 13516){ //Mith Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 6073;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Mith Helm (O)";
      class8.aByteArray178 = "It's a Mith Helm (O)".getBytes();
      }
if(i == 13517){ //Mith Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Kiteshield (O)";
      class8.aByteArray178 = "It's a Mith Kiteshield (O)".getBytes();
      }
if(i == 13518){ //Mith Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platelegs (P)";
      class8.aByteArray178 = "It's Mith Platelegs (P)".getBytes();
      }
if(i == 13519){ //Mith Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 51136;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 43297;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Platebody (P)";
      class8.aByteArray178 = "It's a Mith Platebody (P)".getBytes();
      }
if(i == 13520){ //Mith Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 51136;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Mith Helm (P)";
      class8.aByteArray178 = "It's a Mith Helm (P)".getBytes();
      }
if(i == 13521){ //Mith Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 43297;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 43297;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Mith Kiteshield (P)";
      class8.aByteArray178 = "It's a Mith Kiteshield (P)".getBytes();
      }
if(i == 13522){ //Adamant Platelegs (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 22464;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platelegs (G)";
      class8.aByteArray178 = "It's Adamant Platelegs (G)".getBytes();
      }
if(i == 13523){ //Adamant Platebody (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 22464;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 21662;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platebody (G)";
      class8.aByteArray178 = "It's a Adamant Platebody (G)".getBytes();
      }
if(i == 13524){ //Adamant Helm (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 22464;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Adamant Helm (G)";
      class8.aByteArray178 = "It's a Adamant Helm (G)".getBytes();
      }
if(i == 13525){ //Adamant Kiteshield (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 22464;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Kiteshield (G)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (G)".getBytes();
      }
if(i == 13526){ //Adamant Platelegs (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 100;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platelegs (W)";
      class8.aByteArray178 = "It's Adamant Platelegs (W)".getBytes();
      }
if(i == 13527){ //Adamant Platebody (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 100;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 21662;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platebody (W)";
      class8.aByteArray178 = "It's a Adamant Platebody (W)".getBytes();
      }
if(i == 13528){ //Adamant Helm (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 100;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Adamant Helm (W)";
      class8.aByteArray178 = "It's a Adamant Helm (W)".getBytes();
      }
if(i == 13529){ //Adamant Kiteshield (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 100;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Kiteshield (W)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (W)".getBytes();
      }
if(i == 13530){ //Adamant Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platelegs (B)";
      class8.aByteArray178 = "It's Adamant Platelegs (B)".getBytes();
      }
if(i == 13531){ //Adamant Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 43968;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 21662;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platebody (B)";
      class8.aByteArray178 = "It's a Adamant Platebody (B)".getBytes();
      }
if(i == 13532){ //Adamant Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 43968;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Adamant Helm (B)";
      class8.aByteArray178 = "It's a Adamant Helm (B)".getBytes();
      }
if(i == 13533){ //Adamant Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Kiteshield (B)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (B)".getBytes();
      }
if(i == 13534){ //Adamant Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platelegs (O)";
      class8.aByteArray178 = "It's Adamant Platelegs (O)".getBytes();
      }
if(i == 13535){ //Adamant Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 6073;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 21662;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platebody (O)";
      class8.aByteArray178 = "It's a Adamant Platebody (O)".getBytes();
      }
if(i == 13536){ //Adamant Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 6073;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Adamant Helm (O)";
      class8.aByteArray178 = "It's a Adamant Helm (O)".getBytes();
      }
if(i == 13537){ //Adamant Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Kiteshield (O)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (O)".getBytes();
      }
if(i == 13538){ //Adamant Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platelegs (P)";
      class8.aByteArray178 = "It's Adamant Platelegs (P)".getBytes();
      }
if(i == 13539){ //Adamant Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 51136;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 21662;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Platebody (P)";
      class8.aByteArray178 = "It's a Adamant Platebody (P)".getBytes();
      }
if(i == 13540){ //Adamant Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 51136;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Adamant Helm (P)";
      class8.aByteArray178 = "It's a Adamant Helm (P)".getBytes();
      }
if(i == 13541){ //Adamant Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 21662;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 21662;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Adamant Kiteshield (P)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (P)".getBytes();
      }
if(i == 13542){ //Rune Platelegs (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 22464;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platelegs (G)";
      class8.aByteArray178 = "It's Rune Platelegs (G)".getBytes();
      }
if(i == 13543){ //Rune Platebody (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 22464;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 36133;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platebody (G)";
      class8.aByteArray178 = "It's a Rune Platebody (G)".getBytes();
      }
if(i == 13544){ //Rune Helm (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 22464;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Rune Helm (G)";
      class8.aByteArray178 = "It's a Rune Helm (G)".getBytes();
      }
if(i == 13545){ //Rune Kiteshield (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 22464;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Kiteshield (G)";
      class8.aByteArray178 = "It's a Rune Kiteshield (G)".getBytes();
      }
if(i == 13546){ //Rune Platelegs (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 100;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platelegs (W)";
      class8.aByteArray178 = "It's Rune Platelegs (W)".getBytes();
      }
if(i == 13547){ //Rune Platebody (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 100;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 36133;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platebody (W)";
      class8.aByteArray178 = "It's a Rune Platebody (W)".getBytes();
      }
if(i == 13548){ //Rune Helm (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 100;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Rune Helm (W)";
      class8.aByteArray178 = "It's a Rune Helm (W)".getBytes();
      }
if(i == 13549){ //Rune Kiteshield (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 100;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Kiteshield (W)";
      class8.aByteArray178 = "It's a Rune Kiteshield (W)".getBytes();
      }
if(i == 13550){ //Rune Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platelegs (B)";
      class8.aByteArray178 = "It's Rune Platelegs (B)".getBytes();
      }
if(i == 13551){ //Rune Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 43968;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 36133;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platebody (B)";
      class8.aByteArray178 = "It's a Rune Platebody (B)".getBytes();
      }
if(i == 13552){ //Rune Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 43968;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Rune Helm (B)";
      class8.aByteArray178 = "It's a Rune Helm (B)".getBytes();
      }
if(i == 13553){ //Rune Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 43968;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Kiteshield (B)";
      class8.aByteArray178 = "It's a Rune Kiteshield (B)".getBytes();
      }
if(i == 13554){ //Rune Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platelegs (O)";
      class8.aByteArray178 = "It's Rune Platelegs (O)".getBytes();
      }
if(i == 13555){ //Rune Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 6073;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 36133;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platebody (O)";
      class8.aByteArray178 = "It's a Rune Platebody (O)".getBytes();
      }
if(i == 13556){ //Rune Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 6073;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Rune Helm (O)";
      class8.aByteArray178 = "It's a Rune Helm (O)".getBytes();
      }
if(i == 13557){ //Rune Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 6073;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Kiteshield (O)";
      class8.aByteArray178 = "It's a Rune Kiteshield (O)".getBytes();
      }
if(i == 13558){ //Rune Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 41;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 57;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platelegs (P)";
      class8.aByteArray178 = "It's Rune Platelegs (P)".getBytes();
      }
if(i == 13559){ //Rune Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 24;
      class8.originalModelColors[1] = 51136;
      class8.modifiedModelColors[2] = 41;
      class8.originalModelColors[2] = 36133;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Platebody (P)";
      class8.aByteArray178 = "It's a Rune Platebody (P)".getBytes();
      }
if(i == 13560){ //Rune Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[2];
      class8.originalModelColors = new int [2];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 926;
      class8.originalModelColors[1] = 51136;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt175 = 56;
class8.anInt197 = 116;
      class8.name = "Rune Helm (P)";
      class8.aByteArray178 = "It's a Rune Helm (P)".getBytes();
      }
if(i == 13561){ //Rune Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.modifiedModelColors = new int[3];
      class8.originalModelColors = new int [3];
      class8.modifiedModelColors[0] = 61;
      class8.originalModelColors[0] = 36133;
      class8.modifiedModelColors[1] = 57;
      class8.originalModelColors[1] = 36133;
      class8.modifiedModelColors[2] = 7054;
      class8.originalModelColors[2] = 51136;
class8.modelId = 2339;
class8.anInt181 = 1560;
class8.anInt190 = 344;
class8.anInt198 = 1104;
class8.anInt204 = 0;
class8.anInt169 = -6;
class8.anInt194 = -14;
class8.anInt165 = 486;
class8.anInt200 = 486;
class8.anInt175 = -1;
class8.anInt197 = -1;
      class8.name = "Rune Kiteshield (P)";
      class8.aByteArray178 = "It's a Rune Kiteshield (P)".getBytes();
      }
if(i == 16004)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 18105;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Lime Green Party Hat.";
    class8.aByteArray178 = "Lime Green Party Hat.".getBytes();
}
if(i == 16005)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 45549;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Unknowed White Partyhat";
    class8.aByteArray178 = "Unknowed White Partyhat".getBytes();
}
if(i == 16006)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 50971;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Deep Purple Partyhat";
    class8.aByteArray178 = "Deep Purple Partyhat".getBytes();
}
if(i == 16007)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 60176;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Deeper Purple Partyhat";
    class8.aByteArray178 = "Deeper Purple Partyhat".getBytes();
}
if(i == 16008)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 19213;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Deep Green Partyhat";
    class8.aByteArray178 = "Deep Green Partyhat".getBytes();
}
if(i == 16009)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 3654;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Dull Orange Partyhat";
    class8.aByteArray178 = "Dull Orange Partyhat".getBytes();
}
if(i == 16010)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 12904;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Bright Yellow Partyhat";
    class8.aByteArray178 = "Bright Yellow Partyhat".getBytes();
}
if(i == 16011)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 618;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Bright Pink Partyhat";
    class8.aByteArray178 = "Bright Pink Partyhat".getBytes();
}
if(i == 16012)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 46440;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Bright Blue Partyhat";
    class8.aByteArray178 = "Bright Blue Partyhat".getBytes();
}
if(i == 16013)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 11378;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Bright Gray Partyhat";
    class8.aByteArray178 = "Bright Gray Partyhat".getBytes();
}
if(i == 16014)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 36207;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Bright Sky Blue Partyhat";
    class8.aByteArray178 = "Bright Sky Blue Partyhat".getBytes();
}
if(i == 16015)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 32562;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Teal Partyhat";
    class8.aByteArray178 = "Teal Partyhat".getBytes();
}
if(i == 16016)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.modifiedModelColors = new int[1];
    class8.originalModelColors = new int[1];
    class8.modifiedModelColors[0] = 926;
    class8.originalModelColors[0] = 8245;
    class8.modelId = 2635;
    class8.anInt181 = 440;
    class8.anInt190 = 76;
    class8.anInt198 = 1850;
    class8.anInt204 = 0;
    class8.anInt169 = 1;
    class8.anInt194 = 1;
    class8.anInt165 = 187;
    class8.anInt200 = 363;
    class8.anInt175 = 29;
    class8.anInt197 = 87;
    class8.name = "Dark Gray Partyhat";
    class8.aByteArray178 = "Dark Gray Partyhat".getBytes();
}
       if(i == 16017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 18105;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Lime Green Whip";
            class8.aByteArray178 = "Lime Green whip".getBytes();
}
       if(i == 16018)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 45549;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Unknowed White Whip";
            class8.aByteArray178 = "Unknowed White whip".getBytes();
}
       if(i == 16019)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 50971;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deep Purple Whip";
            class8.aByteArray178 = "Deep Purple whip".getBytes();
}
       if(i == 16020)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 60176;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deeper Purple Whip";
            class8.aByteArray178 = "Deeper Purple whip".getBytes();
}
       if(i == 16021)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 19213;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deep Green Whip";
            class8.aByteArray178 = "Deep Green whip".getBytes();
}
       if(i == 16022)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 3654;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dull Orange Whip";
            class8.aByteArray178 = "Dull Orange whip".getBytes();
}
       if(i == 16023)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 12904;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Yellow Whip";
            class8.aByteArray178 = "Bright Yellow whip".getBytes();
}
       if(i == 16024)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 618;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Pink Whip";
            class8.aByteArray178 = "Bright Pink whip".getBytes();
}
       if(i == 16025)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 46440;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Blue Whip";
            class8.aByteArray178 = "Bright Blue whip".getBytes();
}
       if(i == 16026)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 11378;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Gray Whip";
            class8.aByteArray178 = "Bright Gray whip".getBytes();
}
       if(i == 16027)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 36207;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Sky Blue Whip";
            class8.aByteArray178 = "Bright Sky Blue whip".getBytes();
}
       if(i == 16028)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 32562;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Teal Whip";
            class8.aByteArray178 = "Teal whip".getBytes();
}
       if(i == 16029)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 8245;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dark Gray Whip";
            class8.aByteArray178 = "Dark Gray whip".getBytes();
}
       if(i == 9174)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 13876;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 13846;
            class8.anInt200 = 13846;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bronze crossbow";
            class8.aByteArray178 = "Bronze crossbow".getBytes();
}
       if(i == 9175)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 6447;
            class8.originalModelColors[0] = 8478;
            class8.modifiedModelColors[1] = 6443;
            class8.originalModelColors[1] = 8598;
            class8.modifiedModelColors[2] = 6439;
            class8.originalModelColors[2] = 8846;
            class8.modifiedModelColors[3] = 7054;
            class8.originalModelColors[3] = 41;
            class8.modifiedModelColors[4] = 5652;
            class8.originalModelColors[4] = 33;
            class8.modifiedModelColors[5] = 5656;
            class8.originalModelColors[5] = 24;
            class8.modelId = 13876;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 13846;
            class8.anInt200 = 13846;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Iron crossbow";
            class8.aByteArray178 = "Iron crossbow".getBytes();
}
if(i == 15232){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 12605;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 12607;
class8.anInt200 = 12607;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.name = "Batman cape";
class8.aByteArray178 = "Omfg Wheres BatMan!".getBytes();
}
if(i == 15039) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7369;
class8.anInt194 = 0;
class8.anInt181 = 919;
class8.anInt198 = 225;
class8.anInt190 = 184;
class8.anInt169 = -1;
class8.anInt165 = 7396;
class8.modelId = 7763;
class8.anInt164 = -1;
class8.name = "Lord marshal cap";
class8.aByteArray178 = "Its a lord marshal cap".getBytes();
}

if(i == 15040) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7372;
class8.anInt194 = 0;
class8.anInt181 = 1373;
class8.anInt198 = 0;
class8.anInt190 = 526;
class8.anInt169 = 0;
class8.anInt165 = 7400;
class8.modelId = 7732;
class8.anInt164 = -1;
class8.name = "Lord marshal top";
class8.aByteArray178 = "Its a lord marshal top".getBytes();
}

if(i == 15041) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7352;
class8.anInt194 = 0;
class8.anInt181 = 1697;
class8.anInt198 = 0;
class8.anInt190 = 444;
class8.anInt169 = 1;
class8.anInt165 = 7383;
class8.modelId = 7731;
class8.anInt164 = -1;
class8.name = "Lord marshal trousers";
class8.aByteArray178 = "Its a lord marshal trousers".getBytes();
}

if(i == 15042) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt188 = -1;
class8.anInt200 = 7354;
class8.anInt194 = 0;
class8.anInt181 = 1697;
class8.anInt198 = 0;
class8.anInt190 = 444;
class8.anInt169 = 1;
class8.anInt165 = 7381;
class8.modelId = 7751;
class8.anInt164 = -1;
class8.name = "Lord marshal skirt";
class8.aByteArray178 = "Its a lord marshal skirt".getBytes();
}
						                if (i == 11342)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 64200;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 64201;// wield
                        class8.anInt200 = 64201;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Black Energy";
                        class8.aByteArray178 = "A strong sword made of Black energy.".getBytes();
                }
				                if (i == 11343)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 64202;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 64203;// wield
                        class8.anInt200 = 64203;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Easter Energy sword";
                        class8.aByteArray178 = "From the easter bunny. =)".getBytes();
                }
				                if (i == 11344)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 64204;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 64205;// wield
                        class8.anInt200 = 64205;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Green Energy sword";
                        class8.aByteArray178 = "An Green Energy Sword".getBytes();
                }
				
				                if (i == 11345)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 64206;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 64207;// wield
                        class8.anInt200 = 64207;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Purple Energy sword";
                        class8.aByteArray178 = "An Purple Energy Sword".getBytes();
                }
				if(i == 11015){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.modelId = 23998;
class8.anInt181 = 1049;
class8.anInt190 = 609;
class8.anInt198 = 2047;
class8.anInt204 = 1950;
class8.anInt169 = 0;
class8.anInt194 = -3;
class8.anInt165 = 24034;
class8.anInt200 = 24046;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
     class8.name = "Chicken head";
class8.aByteArray178 = "It's a Chicken head".getBytes();
}

if(i == 11016){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.modelId = 23997;
class8.anInt181 = 848;
class8.anInt190 = 127;
class8.anInt198 = 1931;
class8.anInt204 = 0;
class8.anInt169 = -4;
class8.anInt194 = -5;
class8.anInt165 = 24033;
class8.anInt200 = 24045;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
     class8.name = "Chicken feet";
class8.aByteArray178 = "It's a Chicken feet".getBytes();
}
if(i == 11017){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.modelId = 24000;
class8.anInt181 = 1488;
class8.anInt190 = 595;
class8.anInt198 = 2047;
class8.anInt204 = 0;
class8.anInt169 = -8;
class8.anInt194 = -12;
class8.anInt165 = 24037;
class8.anInt200 = 24048;
class8.anInt188 = 24032;
class8.anInt164 = 24044;
class8.anInt175 = -1;
class8.anInt197 = -1;
     class8.name = "Chicken wings";
class8.aByteArray178 = "It's a Chicken wings".getBytes();
}
if(i == 11018){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.modelId = 23999;
class8.anInt181 = 1744;
class8.anInt190 = 622;
class8.anInt198 = 2047;
class8.anInt204 = 28;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 24035;
class8.anInt200 = 24047;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
     class8.name = "Chicken legs";
class8.aByteArray178 = "It's a Chicken legs".getBytes();
}

if(i == 15678) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14200; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 14201; //Male
class8.anInt200 = 14201; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Money cape";
class8.aByteArray178 = "Its A money cape".getBytes();
}
if(i == 14202) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 13426; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 13417; //Male
class8.anInt200 = 13417; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Polypore staff";
class8.aByteArray178 = "Its A Polypore staff.".getBytes();
}
if(i == 15185) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14531; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 14532; //Male
class8.anInt200 = 14532; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Dragon fire shield";
class8.aByteArray178 = "A heavy shield with a snarling, draconic visage.".getBytes();
}
        if(i == 15083)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 950;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.modelId = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owners Platelegs";
            class8.aByteArray178 = "A set of owners platelegs.".getBytes();
        }
		        if(i == 19083)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 950;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 95004;
            class8.anInt200 = 95004;
            class8.modelId = 95006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black dragon platelegs";
            class8.aByteArray178 = "Omg, you killed that thing??".getBytes();
        }
		        if(i == 19084)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 950;
            class8.anInt181 = 1300;
            class8.anInt190 = 500;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 7;
            class8.anInt165 = 95003;
            class8.anInt200 = 95007;
            class8.modelId = 95007;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black dragon platebody";
            class8.aByteArray178 = "Is he dead or just sleeping!?".getBytes();
        }
				        if(i == 19584)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93025;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93026;
            class8.modelId = 93026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Demonic Cape";
            class8.aByteArray178 = "Cache 27".getBytes();
        }
        if(i == 15084)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 950;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owners Boots";
            class8.aByteArray178 = "Owners boots".getBytes();
        }
        if(i == 15085)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57;
            class8.originalModelColors[1] = 0;
            class8.modifiedModelColors[2] = 7054;
            class8.originalModelColors[2] = 950;
            class8.modelId = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owners Kiteshield";
            class8.aByteArray178 = "It's an owners kiteshield.".getBytes();
        }
		        if(i == 19017)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 954;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 954;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 954;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 954;
			class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 954;
			class8.modifiedModelColors[6] = 56230;
            class8.originalModelColors[6] = 954;
			class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 954;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and red death Cape";
            class8.aByteArray178 = "Its A Black and red death cape".getBytes();
        }
				        if(i == 19018)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 53432;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 53432;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 53432;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 53432;
		class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 53432;
	class8.modifiedModelColors[6] = 56230;
        class8.originalModelColors[6] = 53432;
	class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 53432;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and light purple death Cape";
            class8.aByteArray178 = "Its A Black and light purple death cape".getBytes();
        }
				        if(i == 19019)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 32691;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 32691;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 32691;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 32691;
		class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 32691;
	class8.modifiedModelColors[6] = 56230;
        class8.originalModelColors[6] = 32691;
	class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 32691;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and teal death Cape";
            class8.aByteArray178 = "Its A Black and teal death cape".getBytes();
        }
				        if(i == 19020)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 13221;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 13221;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 13221;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 13221;
		class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 13221;
	class8.modifiedModelColors[6] = 56230;
        class8.originalModelColors[6] = 13221;
	class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 13221;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and light green death Cape";
            class8.aByteArray178 = "Its A Black and light green death cape".getBytes();
        }
				        if(i == 19021)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 5039;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 5039;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 5039;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 5039;
		class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 5039;
	class8.modifiedModelColors[6] = 56230;
        class8.originalModelColors[6] = 5039;
	class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 5039;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and orange death Cape";
            class8.aByteArray178 = "Its A Black and orange death cape".getBytes();
        }
				        if(i == 19022)
        {
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 125;
            class8.modifiedModelColors[1] = 57260;
            class8.originalModelColors[1] = 0;
			class8.modifiedModelColors[2] = 55218;
            class8.originalModelColors[2] = 0;
			class8.modifiedModelColors[3] = 55220;
            class8.originalModelColors[3] = 0;
			class8.modifiedModelColors[4] = 56246;
            class8.originalModelColors[4] = 0;
		class8.modifiedModelColors[5] = 56221;
            class8.originalModelColors[5] = 0;
	class8.modifiedModelColors[6] = 56230;
        class8.originalModelColors[6] = 0;
	class8.modifiedModelColors[7] = 57126;
            class8.originalModelColors[7] = 0;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "white and black death Cape";
            class8.aByteArray178 = "Its A white and black death cape".getBytes();
        }
      if(i == 10887)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 13039;
class8.anInt181 = 1104;
class8.anInt190 = 321;
class8.anInt198 = 24;
class8.anInt204 = 0;
class8.anInt169 = -5;
class8.anInt194 = 2;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt165 = 13040;
            class8.anInt200 = 13040;
            class8.aBoolean176 = false;
            class8.name = "Barrelchest Anchor";
            class8.aByteArray178 = "A Anchor".getBytes();
        }
      if(i == 14322)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 13768;
            class8.anInt181 = 2000;
            class8.anInt190 = 572;
            class8.anInt198 = 1200;
            class8.anInt204 = 0;
            class8.anInt169 = 16;
            class8.anInt194 = 1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt165 = 13767;
            class8.anInt200 = 13767;
            class8.aBoolean176 = false;
            class8.name = "Twin Ghostblades";
            class8.aByteArray178 = "Most powerful weapon on GHr crafted by the Gods themselves.".getBytes();
        }
		
        if(i == 15094)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 9016)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9233;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9234;
            class8.anInt200 = 9234;
            class8.name = "Black and yellow death Cape";
            class8.aByteArray178 = "Its A Black and yellow death cape".getBytes();
        }
        if(i == 9017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.name = "Black and Purple death Cape";
            class8.aByteArray178 = "Its A Black and Purple death cape".getBytes();
        }
if(i == 9120)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modelId = 13920;
            class8.anInt181 = 2000;
            class8.anInt190 = 500;
            class8.anInt198 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = 1;
            class8.anInt204 = 14;
            class8.anInt165 = 13921;
            class8.anInt200 = 13921;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;
            class8.name = "Angel Cape";
            class8.aByteArray178 = "Large winged angel cape".getBytes();
        }

if (i == 18390) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13200;
class8.anInt194 = 0;
class8.anInt181 = 2434;
class8.anInt198 = 0;
class8.anInt190 = 458;
class8.anInt169 = -3;
class8.anInt165 = 13200;
class8.modelId = 13201;
class8.anInt164 = -1;
class8.name = "Primal kiteshield";
class8.aByteArray178 = "Its a Primal kiteshield".getBytes();
}
if (i == 18391) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13202;
class8.anInt194 = 0;
class8.anInt181 = 1447;
class8.anInt198 = 0;
class8.anInt190 = 485;
class8.anInt169 = 0;
class8.anInt165 = 13203;
class8.modelId = 13204;
class8.anInt164 = -1;
class8.name = "Primal platebody";
class8.aByteArray178 = "Its a Primal platebody".getBytes();
}
if (i == 18392) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Weild";
class8.modelId = 13206;
class8.anInt165 = 13205;
class8.anInt200 = 13205;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 1840;
class8.anInt190 = 498;
class8.anInt198 = 1300;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt198 = 1552;
class8.name = "Primal 2h";
class8.aByteArray178 = "A 2h sword of pure evil.".getBytes();
class8.aByte205 = -10;
class8.aByte154 = -10; 
}
if (i == 18393) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13207;
class8.anInt194 = 0;
class8.anInt181 = 921;
class8.anInt198 = 0;
class8.anInt190 = 121;
class8.anInt169 = 0;
class8.anInt165 = 13208;
class8.modelId = 13209;
class8.anInt164 = -1;
class8.name = "Primal full helm";
class8.aByteArray178 = "Its a Primal full helm".getBytes();
}
if (i == 18394) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13210;
class8.anInt194 = 0;
class8.anInt181 = 1730;
class8.anInt198 = 0;
class8.anInt190 = 525;
class8.anInt169 = 7;
class8.anInt165 = 13211;
class8.modelId = 13212;
class8.anInt164 = -1;
class8.name = "Primal platelegs";
class8.aByteArray178 = "It are Primal platelegs".getBytes();
}
if (i == 18395) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13213;
class8.anInt194 = 0;
class8.anInt181 = 1711;
class8.anInt198 = 0;
class8.anInt190 = 488;
class8.anInt169 = -1;
class8.anInt165 = 13214;
class8.modelId = 13215;
class8.anInt164 = -1;
class8.name = "Primal plateskirt";
class8.aByteArray178 = "A Primal plateskirt".getBytes();
}
if (i == 18396) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13216;
class8.anInt194 = 0;
class8.anInt181 = 789;
class8.anInt198 = 156;
class8.anInt190 = 164;
class8.anInt169 = 0;
class8.anInt165 = 13217;
class8.modelId = 13218;
class8.anInt164 = -1;
class8.name = "Primal boots";
class8.aByteArray178 = "A pair of Primal boots".getBytes();
}
if (i == 18397) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt188 = -1;
class8.anInt200 = 13219;
class8.anInt194 = 0;
class8.anInt181 = 930;
class8.anInt198 = 828;
class8.anInt190 = 420;
class8.anInt169 = 3;
class8.anInt165 = 13220;
class8.modelId = 13220;
class8.anInt164 = -1;
class8.name = "Primal gauntlets";
class8.aByteArray178 = "A pair of Primal gauntlets".getBytes();
}

if(i == 10108)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 11200;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
            class8.name = "Yellow Whip";
            class8.aByteArray178 = "a Yellow Whip".getBytes();
        }
if(i == 13677) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14125; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 14126; //Male
class8.anInt200 = 14126; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Moderator cape";
class8.aByteArray178 = "Its A moderator Cape".getBytes();
}
if(i == 13678) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14127; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 14128; //Male
class8.anInt200 = 14128; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Administrator cape";
class8.aByteArray178 = "Its an administrator cape".getBytes();
}
if(i == 13679) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modelId = 14129; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 14130; //Male
class8.anInt200 = 14130; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.name = "Owner cape";
class8.aByteArray178 = "Its an owner cape".getBytes();
        }
if(i == 1275) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 36133;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Rune pickaxe";
	class8.aByteArray178 = "It's a Rune pickaxe.".getBytes();
}
if(i == 1265) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 5652;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Bronze pickaxe";
	class8.aByteArray178 = "It's a bronze pickaxe.".getBytes();
}
if(i == 1267) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 33;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Iron pickaxe";
	class8.aByteArray178 = "It's a iron pickaxe.".getBytes();
}
if(i == 1269) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 2130;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Steel pickaxe";
	class8.aByteArray178 = "It's a steel pickaxe.".getBytes();
}
if(i == 1271) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 21662;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Adamant pickaxe";
	class8.aByteArray178 = "It's a adamant pickaxe.".getBytes();
}
if(i == 1273) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.modelId = 2529;
	class8.modifiedModelColors = new int[1];
	class8.originalModelColors = new int[1];
	class8.modifiedModelColors[0] = 0;
	class8.originalModelColors[0] = 43279;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.name = "Mithril pickaxe";
	class8.aByteArray178 = "It's a mithril pickaxe.".getBytes();
}
        if(i == 10164)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 7114;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 7114;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Golden Bunny ears";
            class8.aByteArray178 = "Golden Bunny ears".getBytes();
        }
        if(i == 10165)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 43968;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 43968;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Blue Bunny ears";
            class8.aByteArray178 = "Its a Blue Bunny ears".getBytes();
        }
        if(i == 10166)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 950;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 950;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Red Bunny ears";
            class8.aByteArray178 = "Its a Red Bunny ears".getBytes();
        }
        if(i == 10167)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 51136;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 51136;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Purple Bunny ears";
            class8.aByteArray178 = "Its a Purple Bunny ears".getBytes();
        }
        if(i == 10168)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 22464;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 22464;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Green Bunny ears";
            class8.aByteArray178 = "Its a Green Bunny ears".getBytes();
        }
        if(i == 10169)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 6073;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 6073;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Orange Bunny ears";
            class8.aByteArray178 = "Its a Orange Bunny ears".getBytes();
        }
        if(i == 10170)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 10394;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 10394;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Barrows Bunny ears";
            class8.aByteArray178 = "Its A Barrows Bunny ears".getBytes();
        }
        if(i == 10171)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 926;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 926;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Dragon Bunny ears";
            class8.aByteArray178 = "Its A Dragon Bunny ears".getBytes();
        }
        if(i == 10172)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 5652;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 5652;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bronze Bunny ears";
            class8.aByteArray178 = "Its A Bronze Bunny ears".getBytes();
        }
        if(i == 10173)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 33;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 33;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Iron Bunny ears";
            class8.aByteArray178 = "Its A Iron Bunny ears".getBytes();
        }
        if(i == 10174)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 43072;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 43072;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Steel Bunny ears";
            class8.aByteArray178 = "Its A Steel Bunny ears".getBytes();
        }
        if(i == 10175)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 8;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 8;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Black Bunny ears";
            class8.aByteArray178 = "Its A Black Bunny ears".getBytes();
        }
        if(i == 10176)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 43297;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 43297;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Mith Bunny ears";
            class8.aByteArray178 = "Its A Mith Bunny ears".getBytes();
        }
        if(i == 10177)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 36133;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 36133;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Rune Bunny ears";
            class8.aByteArray178 = "Its A Rune Bunny ears".getBytes();
        }
        if(i == 10178)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 21662;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 21662;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Adam Bunny ears";
            class8.aByteArray178 = "Its A Adam Bunny ears".getBytes();
        }
        if(i == 10179)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 6069;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 6069;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Lava Bunny ears";
            class8.aByteArray178 = "Its A lava Bunny ears".getBytes();
        }

        if(i == 10180)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 26706;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 26706;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Ivandis Bunny ears";
            class8.aByteArray178 = "Its A Ivandis Bunny ears".getBytes();
        }
        if(i == 10181)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 62920;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 62920;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Ladies Bunny ears";
            class8.aByteArray178 = "Its A Ladies Bunny ears".getBytes();
        }

        if(i == 10182)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 10394;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 10394;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 10394;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Barrows Flowers";
            class8.aByteArray178 = "Its A Barrow Flower".getBytes();
        }


        if(i == 10183)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 926;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 926;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 926;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dragon Flowers";
            class8.aByteArray178 = "Its A Dragon Flowers".getBytes();
        }

        if(i == 10184)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 5652;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 5652;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 5652;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Bronze Flowers";
            class8.aByteArray178 = "Its A Bronze Flowers".getBytes();
        }

        if(i == 10185)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 33;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 33;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 33;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Iron Flowers";
            class8.aByteArray178 = "Its A Iron Flowers".getBytes();
        }

        if(i == 10186)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 43072;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 43072;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 43072;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Steel Flowers";
            class8.aByteArray178 = "Its A Steel Flowers".getBytes();
        }

        if(i == 10187)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 43297;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 43297;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 43297;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Mith Flowers";
            class8.aByteArray178 = "Its A Mith Flowers".getBytes();
        }

        if(i == 10188)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 21662;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 21662;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 21662;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Adam Flowers";
            class8.aByteArray178 = "Its A Adam Flowers".getBytes();
        }

        if(i == 10189)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 48596;
            class8.originalModelColors[0] = 36133;
            class8.modifiedModelColors[1] = 37196;
            class8.originalModelColors[1] = 36133;
            class8.modifiedModelColors[2] = 53167;
            class8.originalModelColors[2] = 36133;
	    class8.modelId = 1781;
	    class8.anInt181 = 840;
	    class8.anInt190 = 612;
	    class8.anInt198 = 816;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = -2;
	    class8.anInt165 = 677;
	    class8.anInt200 = 677;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = -1;
	    class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Rune Flowers";
            class8.aByteArray178 = "Its A Rune Flowers".getBytes();
        }
        if(i == 10190)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 32707;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 32707;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Light Blue Bunny ears";
            class8.aByteArray178 = "Its A Light Blue Bunny ears".getBytes();
        }
        if(i == 10191)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 52685;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 52685;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Light Purple Bunny ears";
            class8.aByteArray178 = "Its A Light Purple Bunny ears".getBytes();
	}
        if(i == 10192)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 13140;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 13140;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Light Yellow Bunny ears";
            class8.aByteArray178 = "Its A Light Yellow Bunny ears".getBytes();
        }
        if(i == 10193)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 20245;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 20245;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Forest Green Bunny ears";
            class8.aByteArray178 = "Its A Forest Green Bunny ears".getBytes();
        }
        if(i == 10194)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 50976;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 50976;
	    class8.modelId = 2553;
	    class8.anInt181 = 550;
	    class8.anInt190 = 360;
	    class8.anInt198 = 4;
	    class8.anInt204 = 0;
	    class8.anInt169 = 0;
	    class8.anInt194 = 0;
	    class8.anInt165 = 3352;
	    class8.anInt200 = 3353;
	    class8.anInt188 = -1;
	    class8.anInt164 = -1;
	    class8.anInt175 = 33;
	    class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Dark Purple Bunny ears";
            class8.aByteArray178 = "Its A Dark Purple Bunny ears".getBytes();
        }
if (i == 12323) {
class8.name = "Grim reaper hood";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.modelId = 10179;
class8.anInt165 = 10186;
class8.anInt188 = -1;
class8.anInt202 = 0;
class8.aBoolean176 = false;
class8.anInt198 = 858;
class8.anInt181 = 1762;
class8.anInt155 = 1;
class8.anInt200 = 10185;
class8.anInt164 = -1;
class8.anInt169 = 3;
class8.anInt204 = 0;
class8.anInt194 = -26;
class8.anInt179 = -1;
class8.anInt190 = 2047;
class8.aByteArray178 = "It's a Grim reaper hood.".getBytes();
}
if(i == 14517) // Your desired item id (the one you use after :ickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.modelId = 14117; // Drop/Inv Model
class8.anInt181 = 2083;
class8.anInt190 = 572;
class8.anInt198 = 1883;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 14115; // Male Wield Model
class8.anInt200 = 14115; // Female Wield
class8.anInt188 = 14116; // Male arms/sleeves (Leave as -1 if not used) and also the models come different with sleeves so i might have to redo it
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.name = "Dagon'hai top"; // Item Name
class8.aByteArray178 = "A robe worn by members of the Dagon'hai.".getBytes(); // Item Examine
}
        if(i == 15067)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 8128;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 38676;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.modelId = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Admin Platelegs";
            class8.aByteArray178 = "A set of administrators platelegs.".getBytes();
        }
        if(i == 15066)
        {
            Jukkyname("Admin Platebody", "An administrators platebody.");
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            Jukkycolors(61, 8128, 0);
            Jukkycolors(24, 38676, 1);
            Jukkycolors(41, 8128, 2);
            Jukkycolors(10394, 8128, 3);
            Jukkycolors(10518, 38676, 4);
            Jukkycolors(10388, 38676, 5);
            Jukkycolors(10514, 38676, 6);
            Jukkycolors(10508, 38676, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 15068)
        {
            NEO("Admin Crown", "Made by Jukk", "Wear");
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            NewColor(945, 38676, 0);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15069)
        {
            NEO("G-mod Crown", "Made by Jukk", "Wear");
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            NewColor(945, 22412, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15070)
        {
            NEO("Mod Crown", "Made by Jukk", "Wear");
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            NewColor(945, 6073, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15071)
        {
            NEO("SB-mod Crown", "Made by Jukk", "Wear");
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            NewColor(945, 128, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15072)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 38676;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Admin Boots";
            class8.aByteArray178 = "Admin boots".getBytes();
        }
        if(i == 15073)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 8128;
            class8.modifiedModelColors[1] = 57;
            class8.originalModelColors[1] = 8128;
            class8.modifiedModelColors[2] = 7054;
            class8.originalModelColors[2] = 38676;
            class8.modelId = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Admin Kiteshield";
            class8.aByteArray178 = "It's an administrator kiteshield.".getBytes();
        }
if(i == 12311)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.modifiedModelColors = new int[1];
        class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = -23903;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
            class8.name = "Navy cavalier";
            class8.aByteArray178 = "a Navy cavalier".getBytes();
        }
        if(i == 15075)
        {
            Jukkyname("Mod Platebody", "A moderator platebody.");
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            Jukkycolors(61, 63, 0);
            Jukkycolors(24, 6073, 1);
            Jukkycolors(41, 63, 2);
            Jukkycolors(10394, 63, 3);
            Jukkycolors(10518, 6073, 4);
            Jukkycolors(10388, 6073, 5);
            Jukkycolors(10514, 6073, 6);
            Jukkycolors(10508, 6073, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 15076)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 63;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 6073;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.modelId = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mod Platelegs";
            class8.aByteArray178 = "A set of moderators platelegs.".getBytes();
        }
        if(i == 15077)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 63;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mod Boots";
            class8.aByteArray178 = "Mod boots".getBytes();
        }
        if(i == 15078)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 63;
            class8.modifiedModelColors[1] = 57;
            class8.originalModelColors[1] = 63;
            class8.modifiedModelColors[2] = 7054;
            class8.originalModelColors[2] = 6073;
            class8.modelId = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mod Kiteshield";
            class8.aByteArray178 = "It's an moderator kiteshield.".getBytes();
        }
        if(i == 15080)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 8128;
            class8.modifiedModelColors[1] = 41;
            class8.originalModelColors[1] = 38676;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[2] = 38676;
            class8.modifiedModelColors[3] = 25238;
            class8.originalModelColors[3] = 8128;
            class8.modelId = 4208;
            class8.anInt181 = 1100;
            class8.anInt190 = 620;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = 5;
            class8.anInt165 = 4206;
            class8.anInt200 = 4207;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Admin Plateskirt";
            class8.aByteArray178 = "It's an admin skirt".getBytes();
        }
        if(i == 15081)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 63;
            class8.modifiedModelColors[1] = 41;
            class8.originalModelColors[1] = 6073;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[2] = 6073;
            class8.modifiedModelColors[3] = 25238;
            class8.originalModelColors[3] = 63;
            class8.modelId = 4208;
            class8.anInt181 = 1100;
            class8.anInt190 = 620;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = 5;
            class8.anInt165 = 4206;
            class8.anInt200 = 4207;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mod Plateskirt";
            class8.aByteArray178 = "It's a mod skirt".getBytes();
        }
        if(i == 15082)
        {
            Jukkyname("Owners Platebody", "An owners platebody.");
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            Jukkycolors(61, 0, 0);
            Jukkycolors(24, 950, 1);
            Jukkycolors(41, 0, 2);
            Jukkycolors(10394, 0, 3);
            Jukkycolors(10518, 950, 4);
            Jukkycolors(10388, 950, 5);
            Jukkycolors(10514, 950, 6);
            Jukkycolors(10508, 950, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 15086)
        {
            NEO("Owners Crown", "Made by Jukk", "Wear");
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            NewColor(945, 950, 0);
            NewColor(8128, 0, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 14518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 14119;
            class8.anInt181 = 917;
            class8.anInt190 = 212;
            class8.anInt198 = 1883;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 14118;
            class8.anInt200 = 14118;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dagon'hai hat";
            class8.aByteArray178 = "A hat worn by members of the Dagon'hai.".getBytes();
        }
        if(i == 14519)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 14121;
            class8.anInt181 = 2083;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 14120;
            class8.anInt200 = 14120;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dagon'hai Robes";
            class8.aByteArray178 = "Robes worn by members of the Dagon'hai.".getBytes();
        }
if(i == 2949){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.name = "Golden Hammer";
            class8.aByteArray178 = "A Replica Hammer Made Of Solid Gold.".getBytes();
        }
if(i == 2946){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.name = "Golden Tinderbox";
            class8.aByteArray178 = "A Replica Tinderbox Made Of Solid Gold.".getBytes();
        }
if(i == 773){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.name = "Perfect Ring";
            class8.aByteArray178 = "It's A Perfect Ring.".getBytes();
        }
        if(i == 8013)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 21662;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Adam Whip";
            class8.aByteArray178 = "Whip Made Of Adam".getBytes();
        }
        if(i == 8014)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 36133;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rune Whip";
            class8.aByteArray178 = "Whip Made Of Rune".getBytes();
        }
        if(i == 8015)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 43297;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mith Whip";
            class8.aByteArray178 = "Whip Made Of Mithril".getBytes();
        }
        if(i == 8016)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 8;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black Whip";
            class8.aByteArray178 = "Whip Made Of Black".getBytes();
        }
        if(i == 8017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 43072;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Steel Whip";
            class8.aByteArray178 = "Whip Made Of Steel".getBytes();
        }
        if(i == 8018)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 33;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Iron Whip";
            class8.aByteArray178 = "Whip Made Of Iron".getBytes();
        }
        if(i == 8019)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 5652;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bronze Whip";
            class8.aByteArray178 = "Whip Made Of Bronze".getBytes();
        }
        if(i == 9093)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 926;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dragon Whip";
            class8.aByteArray178 = "A whip made of Dragon".getBytes();
        }
        if(i == 10562)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 49500;
            class8.modelId = 2602;
            class8.anInt181 = 860;
            class8.anInt190 = 100;
            class8.anInt198 = 1348;
            class8.anInt204 = 96;
            class8.anInt169 = -13;
            class8.anInt194 = -2;
            class8.anInt165 = 518;
            class8.anInt200 = 518;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "sexy whip";
            class8.aByteArray178 = "hshsh".getBytes();
        }
if(i == 15679){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
			class8.modelId = 103;//item look
			class8.anInt181 = 1957;
			class8.anInt190 = 498;
			class8.anInt198 = 484;
			class8.anInt204 = 0;
			class8.anInt169 = -1;
			class8.anInt194 = -1;
			class8.anInt165 = 104;
			class8.anInt200 = 104;
			class8.anInt175 = -1;
			class8.anInt197 = -1;
            class8.name = "Faylin Godsword";
            class8.aByteArray178 = "A Godsword made by Faylin, a very powerful Angel.".getBytes();
        }
	if(i == 12321) {
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.modelId = 8254; //Model ID
		class8.anInt181 = 2000; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt165 = 8255;//male wearing
		class8.anInt200 = 8255;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.name = "Long Blade Of Ulysses";//Name of the new item
		class8.aByteArray178 = "An ancient, and powerful long blade of Ulysses.".getBytes();//examine info
		}
        if(i == 2749)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 41;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[0] = 924;
            class8.originalModelColors[1] = 127;
            class8.originalModelColors[2] = 924;
            class8.modelId = 2582;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 268;
            class8.anInt200 = 432;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa Legs";
            class8.aByteArray178 = "Santa Legs".getBytes();
        }
        if(i == 2750)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 41;
            class8.modifiedModelColors[2] = 24;
            class8.modifiedModelColors[3] = 11187;
            class8.originalModelColors[0] = 127;
            class8.originalModelColors[1] = 924;
            class8.originalModelColors[2] = 127;
            class8.originalModelColors[3] = 127;
            class8.modelId = 3020;
            class8.anInt181 = 1180;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 3379;
            class8.anInt200 = 3383;
            class8.anInt188 = 164;
            class8.anInt164 = 344;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa plate";
            class8.aByteArray178 = "Santa plate".getBytes();
        }
        if(i == 2751)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 7054;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[0] = 127;
            class8.originalModelColors[1] = 924;
            class8.originalModelColors[2] = 924;
            class8.modelId = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa Kite";
            class8.aByteArray178 = "Santa Kite".getBytes();
        }
        if(i == 2752)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 926;
            class8.modifiedModelColors[1] = 7700;
            class8.modifiedModelColors[2] = 11200;
            class8.modifiedModelColors[3] = 6032;
            class8.originalModelColors[0] = 127;
            class8.originalModelColors[1] = 127;
            class8.originalModelColors[2] = 924;
            class8.originalModelColors[3] = 127;
            class8.modelId = 2603;
            class8.anInt181 = 2140;
            class8.anInt190 = 400;
            class8.anInt198 = 948;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 6;
            class8.anInt165 = 323;
            class8.anInt200 = 481;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa cape";
            class8.aByteArray178 = "Santa cape".getBytes();
        }
        if(i == 2753)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 39009;
            class8.modifiedModelColors[1] = 40918;
            class8.originalModelColors[0] = 127;
            class8.originalModelColors[1] = 924;
            class8.originalModelColors[2] = 924;
            class8.originalModelColors[3] = 127;
            class8.modelId = 5039;
            class8.anInt181 = 830;
            class8.anInt190 = 536;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 3;
            class8.anInt165 = 4953;
            class8.anInt200 = 5030;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa Gloves";
            class8.aByteArray178 = "Santa Gloves".getBytes();
        }
        if(i == 2754)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 127;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa Boots";
            class8.aByteArray178 = "Santa boots".getBytes();
        }
        if(i == 2755)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 41;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[0] = 11200;
            class8.originalModelColors[1] = 0;
            class8.originalModelColors[2] = 11200;
            class8.modelId = 2582;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 268;
            class8.anInt200 = 432;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow Legs";
            class8.aByteArray178 = "Black & Yellow Legs".getBytes();
        }
        if(i == 2756)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 41;
            class8.modifiedModelColors[2] = 24;
            class8.modifiedModelColors[3] = 11187;
            class8.originalModelColors[0] = 0;
            class8.originalModelColors[1] = 11200;
            class8.originalModelColors[2] = 0;
            class8.originalModelColors[3] = 0;
            class8.modelId = 3020;
            class8.anInt181 = 1180;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 3379;
            class8.anInt200 = 3383;
            class8.anInt188 = 164;
            class8.anInt164 = 344;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow plate";
            class8.aByteArray178 = "Black & Yellow plate".getBytes();
        }
        if(i == 2757)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.modifiedModelColors[1] = 7054;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[0] = 0;
            class8.originalModelColors[1] = 11200;
            class8.originalModelColors[2] = 11200;
            class8.modelId = 2339;
            class8.anInt181 = 1560;
            class8.anInt190 = 344;
            class8.anInt198 = 1104;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = -14;
            class8.anInt165 = 486;
            class8.anInt200 = 486;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow Kite";
            class8.aByteArray178 = "Black & Yellow Kite".getBytes();
        }
        if(i == 2758)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 926;
            class8.modifiedModelColors[1] = 7700;
            class8.modifiedModelColors[2] = 11200;
            class8.modifiedModelColors[3] = 6032;
            class8.originalModelColors[0] = 0;
            class8.originalModelColors[1] = 0;
            class8.originalModelColors[2] = 11200;
            class8.originalModelColors[3] = 0;
            class8.modelId = 2603;
            class8.anInt181 = 2140;
            class8.anInt190 = 400;
            class8.anInt198 = 948;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 6;
            class8.anInt165 = 323;
            class8.anInt200 = 481;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow cape";
            class8.aByteArray178 = "Black & Yellow cape".getBytes();
        }
        if(i == 2759)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 39009;
            class8.modifiedModelColors[1] = 40918;
            class8.originalModelColors[0] = 0;
            class8.originalModelColors[1] = 11200;
            class8.originalModelColors[2] = 11200;
            class8.originalModelColors[3] = 0;
            class8.modelId = 5039;
            class8.anInt181 = 830;
            class8.anInt190 = 536;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 3;
            class8.anInt165 = 4953;
            class8.anInt200 = 5030;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow Gloves";
            class8.aByteArray178 = "Black & Yellow Gloves".getBytes();
        }
        if(i == 2760)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 0;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Black & Yellow Boots";
            class8.aByteArray178 = "Black & Yellow boots".getBytes();
        }
if(i == 15680) // ITEM ID
{
        class8.aStringArray189 = new String[5];
        class8.aStringArray189[1] = "Play"; 
        class8.modelId = 11134; // Drop/Inv Model
        class8.anInt165 = 11135; // Male Wield Model
        class8.anInt200 = 11135; // Female Wield
        class8.anInt188 = -1; // Male arms/sleeves
        class8.anInt164 = -1; // Female arms/sleeves
	class8.anInt181 = 850; // Zoom 
	class8.anInt190 = 498; // Rotate up/down 
	class8.anInt198 = 1300; // Rotate right/left
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.name = "Winkman's Guitar"; // Item Name
class8.aByteArray178 = "Whoa, Nice Guitar Dude!".getBytes(); // Item Examine
        }
        if(i == 10091)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 6;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 100;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Emo santa hat ";
            class8.aByteArray178 = "Emo santa hat.".getBytes();
        }
        if(i == 8012)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 926;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Black santa hat ";
            class8.aByteArray178 = "Black santa hat.".getBytes();
        }
        if(i == 15055)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 62928;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Pink Party Hat";
            class8.aByteArray178 = "A Pink Party Hat.".getBytes();
        }
        if(i == 15999)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 39758;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Light blue Party Hat";
            class8.aByteArray178 = "A Light blue Party Hat.".getBytes();
        }
        if(i == 16000)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 20763;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "dark green Party Hat";
            class8.aByteArray178 = "A dark green Party Hat.".getBytes();
        }
        if(i == 16001)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 44588;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Dark Blue Party Hat";
            class8.aByteArray178 = "A dark blue Party Hat.".getBytes();
        }
        if(i == 16002)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 64028;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Blood Red Party Hat";
            class8.aByteArray178 = "A Blood Red Party Hat.".getBytes();
        }
        if(i == 16003)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 33640;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Lighter blue Party Hat";
            class8.aByteArray178 = "Lighter blue Party Hat.".getBytes();
        }
        if(i == 10560)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 35321;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "sky phat";
            class8.aByteArray178 = "A sky Party Hat.".getBytes();
        }
        if(i == 9117)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 0;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Black h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 9118)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 11200;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Yellow h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 10099)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 23421;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 0;
            class8.modelId = 2537;
            class8.anInt181 = 540;
            class8.anInt190 = 72;
            class8.anInt198 = 136;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -3;
            class8.anInt165 = 189;
            class8.anInt188 = -1;
            class8.anInt200 = 366;
            class8.anInt164 = -1;
            class8.anInt175 = 69;
            class8.anInt197 = 127;
            class8.aBoolean176 = false;
            class8.name = "Pimp santa hat ";
            class8.aByteArray178 = "Pimpin santa hat.".getBytes();
        }
        if(i == 10105)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 10394;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = " Barrows Whip";
            class8.aByteArray178 = "a Barrows Whip".getBytes();
        }
        if(i == 10555)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 62928;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = " sissy Whip";
            class8.aByteArray178 = "a sissy  Whip".getBytes();
        }
        if(i == 10106)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 7114;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gold Whip";
            class8.aByteArray178 = "a Gold Whip".getBytes();
        }
        if(i == 11078)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 8128;
            class8.modelId = 2635;
            class8.anInt181 = 440;
            class8.anInt190 = 76;
            class8.anInt198 = 1850;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 187;
            class8.anInt200 = 363;
            class8.anInt175 = 29;
            class8.anInt197 = 87;
            class8.name = "Godz Party Hat";
            class8.aByteArray178 = "A  Party Hat for owner godz.".getBytes();
        }



if(i == 15681){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[0];
class8.originalModelColors = new int[0];
class8.modelId = 12214;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 12213;
class8.anInt200 = 12213;
class8.aBoolean176 = false;
class8.name = "Dragon Godsword";
class8.aByteArray178 = "A godsword From the Greatest Dragons.".getBytes();
}
if(i == 19954) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield"; // String name, this can be changed to wield, or attach, or whatever you want
class8.modelId = 12556; // Drop/Inv Model
class8.anInt165 = 12555; // Male Wield Model
class8.anInt200 = 12555; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)        
class8.anInt181 = 2000; // Zoom - Increase to make inv model smaller        
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards        
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right        
class8.anInt169 = -1; // Position in  inv, increase to move right        
class8.anInt194 = -1; // Position in inv, increase to move up                                                
class8.name = "Dungeoneering cape"; // Item Name
class8.aByteArray178 = "A nice looking cape.".getBytes(); // Item Examine      
}
	if(i == 15259)
		        {
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
        class8.modelId = 79229;
        class8.anInt181 = 1316;
        class8.anInt190 = 352;
        class8.anInt198 = 269;
        class8.anInt204 = 0;
        class8.anInt169 = -3;
        class8.anInt194 = -7;
        class8.anInt165 = 73867;// wield
        class8.anInt200 = 73867;
        class8.anInt188 = -1;
        class8.anInt164 = -1;
        class8.anInt175 = -1;
        class8.anInt197 = -1;
		class8.name = "Dragon pickaxe";
		class8.aByteArray178 = "Used for mining.".getBytes();
	}
if(i == 7979){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
     class8.modelId = 8553; //inv and drop
     class8.anInt181 = 2000;
     class8.anInt190 = 434;
     class8.anInt198 = 0;
     class8.anInt204 = 0;
     class8.anInt169 = 0;
     class8.anInt194 = -4;
     class8.anInt165 = 8554; //m wear
     class8.anInt200 = 8554; //f wear
     class8.name = "Demon Wind Shuriken";
class8.aByteArray178 = "A razor sharp shuriken weapon.".getBytes();
}
                if (i == 11338)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 14200;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 14201;// wield
                        class8.anInt200 = 14201;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Energy sword";
                        class8.aByteArray178 = "A strong sword made of energy.".getBytes();
                }
                if (i == 11339)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 5221;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 5222;// wield
                        class8.anInt200 = 5222;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "Red Energy sword";
                        class8.aByteArray178 = "A strong sword made of red energy.".getBytes();
                }
                if (i == 11340)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 6221;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 6222;// wield
                        class8.anInt200 = 6222;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "X-Mas Energy sword";
                        class8.aByteArray178 = "From Santa...".getBytes();
                }
                if (i == 11341)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.modelId = 7221;
                        class8.anInt181 = 1570;
                        class8.anInt190 = 400;
                        class8.anInt198 = 360;
                        class8.anInt204 = 0;
                        class8.anInt169 = 0;
                        class8.anInt194 = -5;
                        class8.anInt165 = 7222;// wield
                        class8.anInt200 = 7222;
                        class8.anInt188 = -1;
                        class8.anInt164 = -1;
                        class8.anInt175 = -1;
                        class8.anInt197 = -1;
                        // class8.aBoolean176 = false;
                        class8.name = "valentines Energy sword";
                        class8.aByteArray178 = "From traxxas Have a Happy valentines Day =)".getBytes();
                }
if(i == 10000) // ItemID
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.modelId = 60831;
class8.anInt181 = 1744;
class8.anInt190 = 330;
class8.anInt198 = 1505;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 57780;
class8.anInt200 = 57784;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.name = "Korasi sword";
class8.aByteArray178 = "It's a Korasi sword".getBytes();
}
if(i == 13214){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[0];
class8.originalModelColors = new int[0];
class8.modelId = 13215;
class8.anInt181 = 1957;
class8.anInt190 = 498;
class8.anInt198 = 484;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 13214;
class8.anInt200 = 13214;
class8.aBoolean176 = false;
class8.name = "Zaros Godsword";
class8.aByteArray178 = "A sword containing magical power.".getBytes();
}
if(i == 14590)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";//New option
class8.modelId = 3000; //Model ID
class8.anInt181 = 730;//Model Zoom
class8.anInt190 = 567;//Model Rotation
class8.anInt198 = 1120;//
class8.anInt169 = -4;// 
class8.anInt194 = -1;//
class8.anInt165 = 3001;
class8.anInt200 = 3002;
class8.anInt166 = 63;
class8.anInt173 = 120;
class8.anInt167 = 100;
class8.anInt192 = 100;
class8.anInt191 = 100;
class8.anInt196 = 15;
class8.anInt184 = 100;
class8.anInt204 = 1923;
class8.aBoolean176 = false;
class8.name = "Ava's accumulator";
class8.aByteArray178 = "Ava's accumulator".getBytes();
}
        if(i == 16897)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 10378;
            class8.anInt181 = 1200;
            class8.anInt190 = 1;
            class8.anInt198 = 1;
            class8.anInt204 = 1;
            class8.anInt169 = 1;
            class8.anInt194 = 50;
            class8.anInt165 = 10378;
            class8.anInt200 = 10378;
            class8.anInt188 = 10374;
            class8.anInt164 = 10374;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Ninja Body";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }

if(i == 10010)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 14061; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1800; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move down away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14062;//male wearing
class8.anInt200 = 14062;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Vesta's longsword";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10011)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 14063; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1600; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14064;//male wearing
class8.anInt200 = 14064;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Vesta's spear";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10012)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 14069; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 650; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14070;//male wearing
class8.anInt200 = 14070;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Morrigan's coif";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10013)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 14071; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1600; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14072;//male wearing
class8.anInt200 = 14072;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Morrigan's javelin";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10014)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.modelId = 14073; //
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 1000; //zoom increase will make it smaller
class8.anInt190 = 470; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 14074;//male wearing
class8.anInt200 = 14074;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.name = "Morrigan's throwing axe";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
		        }
        if(i == 16898)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 10377;
            class8.anInt181 = 1500;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 20;
            class8.anInt165 = 10377;
            class8.anInt200 = 10377;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Ninja legs";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }
        if(i == 16899)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 10376;
            class8.anInt181 = 700;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 80;
            class8.anInt165 = 10376;
            class8.anInt200 = 10376;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Ninja Balaclava";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }
        if(i == 16890)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 10312;
            class8.anInt181 = 700;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 80;
            class8.anInt165 = 10312;
            class8.anInt200 = 10312;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Samurai armor";
            class8.aByteArray178 = "Nice armor from the far east.".getBytes();
        }
        if(i == 16851)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Weild";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 80;
            class8.modifiedModelColors[1] = 6550;
            class8.originalModelColors[1] = 15;
            class8.modifiedModelColors[2] = 6430;
            class8.originalModelColors[2] = 10;
            class8.modelId = 10379;
            class8.anInt181 = 700;
            class8.anInt190 = 0;
            class8.anInt198 = 300;
            class8.anInt204 = 0;
            class8.anInt169 = -14;
            class8.anInt194 = 27;
            class8.anInt165 = 10379;
            class8.anInt200 = 10379;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Katana";
            class8.aByteArray178 = "Weilded by ninjas.".getBytes();
        }
        if(i == 16852)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Weild";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 10379;
            class8.anInt181 = 700;
            class8.anInt190 = 0;
            class8.anInt198 = 300;
            class8.anInt204 = 0;
            class8.anInt169 = -14;
            class8.anInt194 = 27;
            class8.anInt165 = 5233;
            class8.anInt200 = 5233;
            class8.anInt175 = 40;
            class8.anInt197 = 98;
            class8.name = "Katana";
            class8.aByteArray178 = "A nicely crafted sword and holder.".getBytes();
        }
if(i == 7276){ //Black Plateskirt (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[4];
              class8.originalModelColors = new int [4];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 22464;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 22464;
              class8.modifiedModelColors[3] = 25238;
              class8.originalModelColors[3] = 0;
  	class8.modelId = 4208;
	class8.anInt181 = 1100;
	class8.anInt190 = 620;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 5;
        class8.anInt194 = 5;
        class8.anInt165 = 4206;
	class8.anInt200 = 4207;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Plateskirt (G)";
              class8.aByteArray178 = "It's a Black Plateskirt (G)".getBytes();
              }
if(i == 13422){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platelegs (G)";
              class8.aByteArray178 = "It's Black Platelegs (G)".getBytes();
              }
 if(i == 13423){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 22464;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 0;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platebody (G)";
              class8.aByteArray178 = "It's a Black Platebody (G)".getBytes();
              }
 if(i == 13424){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 22464;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Black Helm (G)";
              class8.aByteArray178 = "It's a Black Helm (G)".getBytes();
              }
 if(i == 13425){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Kiteshield (G)";
              class8.aByteArray178 = "It's a Black Kiteshield (G)".getBytes();
              }
if(i == 13426){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platelegs (W)";
              class8.aByteArray178 = "It's Black Platelegs (W)".getBytes();
              }
 if(i == 13427){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 100;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 0;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platebody (W)";
              class8.aByteArray178 = "It's a Black Platebody (W)".getBytes();
              }
 if(i == 13428){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 100;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Black Helm (W)";
              class8.aByteArray178 = "It's a Black Helm (W)".getBytes();
              }
 if(i == 13429){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Kiteshield (W)";
              class8.aByteArray178 = "It's a Black Kiteshield (W)".getBytes();
              }

if(i == 13434){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platelegs (B)";
              class8.aByteArray178 = "It's Black Platelegs (B)".getBytes();
              }
 if(i == 13435){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 43968;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 0;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Black Platebody (B)";
              class8.aByteArray178 = "It's a Black Platebody (B)".getBytes();
              }
 if(i == 13436){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 43968;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Black Helm (B)";
              class8.aByteArray178 = "It's a Black Helm (B)".getBytes();
              }
 if(i == 13437){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Kiteshield (B)";
              class8.aByteArray178 = "It's a Black Kiteshield (B)".getBytes();
              }

if(i == 13438){ //Black Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platelegs (O)";
              class8.aByteArray178 = "It's Black Platelegs (O)".getBytes();
              }
 if(i == 13439){ //Black Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 6073;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 0;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platebody (O)";
              class8.aByteArray178 = "It's a Black Platebody (O)".getBytes();
              }
 if(i == 13440){ //Black Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 6073;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Black Helm (O)";
              class8.aByteArray178 = "It's a Black Helm (O)".getBytes();
              }
 if(i == 13441){ //Black Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Kiteshield (O)";
              class8.aByteArray178 = "It's a Black Kiteshield (O)".getBytes();
              }


if(i == 7277){ //Black Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platelegs (P)";
              class8.aByteArray178 = "It's Black Platelegs (P)".getBytes();
              }
 if(i == 7278){ //Black Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 51136;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 0;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Platebody (P)";
              class8.aByteArray178 = "It's a Black Platebody (P)".getBytes();
              }
 if(i == 7279){ //Black Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 51136;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Black Helm (P)";
              class8.aByteArray178 = "It's a Black Helm (P)".getBytes();
              }
 if(i == 7280){ //Black Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 0;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Kiteshield (P)";
              class8.aByteArray178 = "It's a Black Kiteshield (P)".getBytes();
              }
 if(i == 7281){ //Black Plateskirt (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[4];
              class8.originalModelColors = new int [4];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 0;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 51136;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 51136;
              class8.modifiedModelColors[3] = 25238;
              class8.originalModelColors[3] = 0;
  	class8.modelId = 4208;
	class8.anInt181 = 1100;
	class8.anInt190 = 620;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 5;
        class8.anInt194 = 5;
        class8.anInt165 = 4206;
	class8.anInt200 = 4207;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Black Plateskirt (P)";
              class8.aByteArray178 = "It's a Black Plateskirt (P)".getBytes();
              }
if(i == 13442){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platelegs (G)";
              class8.aByteArray178 = "It's Bronze Platelegs (G)".getBytes();
              }
 if(i == 13443){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 22464;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 5652;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platebody (G)";
              class8.aByteArray178 = "It's a Bronze Platebody (G)".getBytes();
              }
 if(i == 13444){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 22464;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Bronze Helm (G)";
              class8.aByteArray178 = "It's a Bronze Helm (G)".getBytes();
              }
 if(i == 13445){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Kiteshield (G)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (G)".getBytes();
              }
	if(i == 13446){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platelegs (W)";
              class8.aByteArray178 = "It's Bronze Platelegs (W)".getBytes();
              }
 if(i == 13447){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 100;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 5652;
  	class8.modelId = 2378;
	class8.anInt181 = 1180;
	class8.anInt190 = 452;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = -1;
        class8.anInt165 = 3379;
	class8.anInt200 = 3383;
	class8.anInt188 = 164;
	class8.anInt164 = 344;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platebody (W)";
              class8.aByteArray178 = "It's a Bronze Platebody (W)".getBytes();
              }
 if(i == 13448){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 100;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Bronze Helm (W)";
              class8.aByteArray178 = "It's a Bronze Helm (W)".getBytes();
              }
 if(i == 13449){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Kiteshield (W)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (W)".getBytes();
              }
if(i == 13450){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platelegs (B)";
              class8.aByteArray178 = "It's Bronze Platelegs (B)".getBytes();
              }
 if(i == 13451){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 43968;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 5652;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Bronze Platebody (B)";
              class8.aByteArray178 = "It's a Bronze Platebody (B)".getBytes();
              }
 if(i == 13452){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 43968;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Bronze Helm (B)";
              class8.aByteArray178 = "It's a Bronze Helm (B)".getBytes();
              }
 if(i == 13453){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Kiteshield (B)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (B)".getBytes();
              }
if(i == 13454){ //Bronze Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platelegs (O)";
              class8.aByteArray178 = "It's Bronze Platelegs (O)".getBytes();
              }
 if(i == 13455){ //Bronze Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 6073;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 5652;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Bronze Platebody (O)";
              class8.aByteArray178 = "It's a Bronze Platebody (O)".getBytes();
              }
 if(i == 13456){ //Bronze Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 6073;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Bronze Helm (O)";
              class8.aByteArray178 = "It's a Bronze Helm (O)".getBytes();
              }
 if(i == 13457){ //Bronze Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Kiteshield (O)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (O)".getBytes();
              }
if(i == 13458){ //Bronze Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Platelegs (P)";
              class8.aByteArray178 = "It's Bronze Platelegs (P)".getBytes();
              }
 if(i == 13459){ //Bronze Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 51136;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 5652;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Bronze Platebody (P)";
              class8.aByteArray178 = "It's a Bronze Platebody (P)".getBytes();
              }
 if(i == 13460){ //Bronze Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 51136;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Bronze Helm (P)";
              class8.aByteArray178 = "It's a Bronze Helm (P)".getBytes();
              }
 if(i == 13461){ //Bronze Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 5652;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 5652;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Bronze Kiteshield (P)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (P)".getBytes();
              }
if(i == 13462){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Platelegs (G)";
              class8.aByteArray178 = "It's Iron Platelegs (G)".getBytes();
              }
 if(i == 13463){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 22464;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 33;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Iron Platebody (G)";
              class8.aByteArray178 = "It's a Iron Platebody (G)".getBytes();
              }
 if(i == 13464){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 22464;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Iron Helm (G)";
              class8.aByteArray178 = "It's a Iron Helm (G)".getBytes();
              }
 if(i == 13465){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 22464;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Kiteshield (G)";
              class8.aByteArray178 = "It's a Iron Kiteshield (G)".getBytes();
              }
	if(i == 13466){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Platelegs (W)";
              class8.aByteArray178 = "It's Iron Platelegs (W)".getBytes();
              }
 if(i == 13467){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 100;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 33;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Iron Platebody (W)";
              class8.aByteArray178 = "It's a Iron Platebody (W)".getBytes();
              }
 if(i == 13468){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 100;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Iron Helm (W)";
              class8.aByteArray178 = "It's a Iron Helm (W)".getBytes();
              }
 if(i == 13469){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 100;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Kiteshield (W)";
              class8.aByteArray178 = "It's a Iron Kiteshield (W)".getBytes();
              }
if(i == 13470){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Platelegs (B)";
              class8.aByteArray178 = "It's Iron Platelegs (B)".getBytes();
              }
 if(i == 13471){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 43968;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 33;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Iron Platebody (B)";
              class8.aByteArray178 = "It's a Iron Platebody (B)".getBytes();
              }
 if(i == 13472){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 43968;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Iron Helm (B)";
              class8.aByteArray178 = "It's a Iron Helm (B)".getBytes();
              }
 if(i == 13473){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 43968;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Kiteshield (B)";
              class8.aByteArray178 = "It's a Iron Kiteshield (B)".getBytes();
              }
if(i == 13474){ //Iron Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Platelegs (O)";
              class8.aByteArray178 = "It's Iron Platelegs (O)".getBytes();
              }
 if(i == 13475){ //Iron Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 6073;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 33;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Iron Platebody (O)";
              class8.aByteArray178 = "It's a Iron Platebody (O)".getBytes();
              }
 if(i == 13476){ //Iron Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 6073;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Iron Helm (O)";
              class8.aByteArray178 = "It's a Iron Helm (O)".getBytes();
              }
 if(i == 13477){ //Iron Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 6073;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Kiteshield (O)";
              class8.aByteArray178 = "It's a Iron Kiteshield (O)".getBytes();
              }
if(i == 13478){ //Iron Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 41;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 57;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2582;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
        class8.anInt169 = 0;
        class8.anInt194 = -8;
        class8.anInt165 = 268;
	class8.anInt200 = 432;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Platelegs (P)";
              class8.aByteArray178 = "It's Iron Platelegs (P)".getBytes();
              }
 if(i == 13479){ //Iron Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 24;
              class8.originalModelColors[1] = 51136;
              class8.modifiedModelColors[2] = 41;
              class8.originalModelColors[2] = 33;
class8.modelId = 2378;
class8.anInt181 = 1180;
class8.anInt190 = 452;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 3379;
class8.anInt200 = 3383;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
              class8.name = "Iron Platebody (P)";
              class8.aByteArray178 = "It's a Iron Platebody (P)".getBytes();
              }
 if(i == 13480){ //Iron Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[2];
              class8.originalModelColors = new int [2];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 926;
              class8.originalModelColors[1] = 51136;
  	class8.modelId = 2813;
	class8.anInt181 = 800;
	class8.anInt190 = 160;
	class8.anInt198 = 152;
	class8.anInt204 = 0;
        class8.anInt169 = -1;
        class8.anInt194 = 6;
        class8.anInt165 = 218;
	class8.anInt200 = 394;
	class8.anInt175 = 56;
	class8.anInt197 = 116;
              class8.name = "Iron Helm (P)";
              class8.aByteArray178 = "It's a Iron Helm (P)".getBytes();
              }
 if(i == 13481){ //Iron Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.modifiedModelColors = new int[3];
              class8.originalModelColors = new int [3];
              class8.modifiedModelColors[0] = 61;
              class8.originalModelColors[0] = 33;
              class8.modifiedModelColors[1] = 57;
              class8.originalModelColors[1] = 33;
              class8.modifiedModelColors[2] = 7054;
              class8.originalModelColors[2] = 51136;
  	class8.modelId = 2339;
	class8.anInt181 = 1560;
	class8.anInt190 = 344;
	class8.anInt198 = 1104;
	class8.anInt204 = 0;
        class8.anInt169 = -6;
        class8.anInt194 = -14;
        class8.anInt165 = 486;
	class8.anInt200 = 486;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
              class8.name = "Iron Kiteshield (P)";
              class8.aByteArray178 = "It's a Iron Kiteshield (P)".getBytes();
              }
		             if(i == 18785)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.modifiedModelColors = new int[1];
		            class8.originalModelColors = new int[1];
		            class8.modifiedModelColors[0] = 0;
		            class8.originalModelColors[0] = 0;
		            class8.modelId = 0x1286b;
		            class8.anInt181 = 1579;
		            class8.anInt190 = 533;
		            class8.anInt198 = 533;
		            class8.anInt204 = 0;
		            class8.anInt169 = -4;
		            class8.anInt194 = -1;
		            class8.anInt165 = 0x1286b;
		            class8.anInt200 = 0x1286b;
		            class8.anInt175 = -1;
		            class8.anInt197 = -1;
		            class8.name = "@blu@ Ice katana";
		            class8.aByteArray178 = "Ghr's ninjas only".getBytes();
		        }
if(i == 6570){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
			class8.modifiedModelColors[0] = 0;
			class8.originalModelColors[0] = 0;
			class8.modelId = 9631;//item look
			class8.anInt181 = 2000;
			class8.anInt190 = 400;
			class8.anInt198 = 0;
			class8.anInt204 = 2047;
			class8.anInt169 = -8;
			class8.anInt194 = 12;
			class8.anInt197 = -1;
            class8.name = "Fire Cape";
            class8.aByteArray178 = "A cape of fire.".getBytes();
        }
		
		if(i == 15618)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 528;
class8.originalModelColors[0] = 931;
class8.modelId =  5412;
class8.anInt181 =  840;
class8.anInt190 =  280;
class8.anInt198 =  0;
class8.anInt204 =  0;
class8.anInt169 =  -2;
class8.anInt194 =  56;
class8.anInt165 =  5409;
class8.anInt200 =  5409;
class8.anInt188 =  -1;
class8.anInt164 =  -1;
class8.anInt175 =  -1;
class8.anInt197 =  -1;
    class8.name = "Ruby Whip";
    class8.aByteArray178 = "a Ruby Whip".getBytes();
}


if(i == 15619)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 33;
class8.originalModelColors[0] = 931;
class8.modifiedModelColors[1] = 49;
class8.originalModelColors[1] = 931;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 931;
class8.modelId = 2558;
class8.anInt181 = 1100;
class8.anInt190 = 568;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 2;
class8.anInt165 = 301;
class8.anInt200 = 464;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Ruby chainbody";
    class8.aByteArray178 = "a Ruby chainbody".getBytes();
}

if(i == 15620)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 24;
class8.originalModelColors[0] = 931;
class8.modifiedModelColors[1] = 61;
class8.originalModelColors[1] = 931;
class8.modifiedModelColors[2] = 41;
class8.originalModelColors[2] = 931;
class8.modelId = 2605;
class8.anInt181 = 1250;
class8.anInt190 = 488;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 0;
class8.anInt165 = 306;
class8.anInt200 = 468;
class8.anInt188 = 164;
class8.anInt164 = 344;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Ruby Platebody";
    class8.aByteArray178 = "a Ruby Platebody".getBytes();
}

if(i == 15621)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 931;
class8.modelId = 2833;
class8.anInt181 = 640;
class8.anInt190 = 108;
class8.anInt198 = 156;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = -4;
class8.anInt165 = 219;
class8.anInt200 = 395;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 57;
class8.anInt197 = 117;
    class8.name = "Ruby Med Helm";
    class8.aByteArray178 = "a Ruby Med Helm".getBytes();
}

if(i == 15622)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[2];
class8.originalModelColors = new int[2];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 931;
class8.modifiedModelColors[1] = 926;
class8.originalModelColors[1] = 48030;
class8.modelId = 2813;
class8.anInt181 = 800;
class8.anInt190 = 160;
class8.anInt198 = 152;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = 6;
class8.anInt165 = 218;
class8.anInt200 = 394;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 56;
class8.anInt197 = 116;
    class8.name = "Ruby full Helm";
    class8.aByteArray178 = "a Ruby full Helm".getBytes();
}

if(i == 15623)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.modifiedModelColors = new int[3];
class8.originalModelColors = new int[3];
class8.modifiedModelColors[0] = 61;
class8.originalModelColors[0] = 931;
class8.modifiedModelColors[1] = 41;
class8.originalModelColors[1] = 931;
class8.modifiedModelColors[2] = 57;
class8.originalModelColors[2] = 931;
class8.modelId = 2582;
class8.anInt181 = 1740;
class8.anInt190 = 444;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = -8;
class8.anInt165 = 268;
class8.anInt200 = 432;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Ruby Platelegs";
    class8.aByteArray178 = "a Ruby platelegs".getBytes();
}
if(i == 14321)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 40;
class8.originalModelColors[0] = 1;
class8.modelId = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.name = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
}
if(i == 14322)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 40;
class8.originalModelColors[0] = 50;
class8.modelId = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.name = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
}
if(i == 12324)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 18105;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Lime Green cavalier";
class8.aByteArray178 = "a Lime Green cavalier".getBytes();
}
if(i == 12325)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 45549;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Unknowed White cavalier";
class8.aByteArray178 = "a Unknowed White cavalier".getBytes();
}
if(i == 12326)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 50971;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Deep Purple cavalier";
class8.aByteArray178 = "a Deep Purple cavalier".getBytes();
}
if(i == 12327)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 60176;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Deeprt Purple cavalier";
class8.aByteArray178 = "a Deeper Purple cavalier".getBytes();
}
if(i == 12328)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 19213;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Deep Green cavalier";
class8.aByteArray178 = "a Deep Green cavalier".getBytes();
}
if(i == 12329)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 3654;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Dull Orange cavalier";
class8.aByteArray178 = "a Dull Orange cavalier".getBytes();
}
if(i == 12330)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 12904;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Bright Yellow cavalier";
class8.aByteArray178 = "a Bright Yellow cavalier".getBytes();
}
if(i == 12331)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 618;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Bright Pink cavalier";
class8.aByteArray178 = "a Bright Pink cavalier".getBytes();
}
if(i == 12332)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 46440;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Bright blue cavalier";
class8.aByteArray178 = "a Bright Blue cavalier".getBytes();
}
if(i == 12333)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 11378;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Bright Gray cavalier";
class8.aByteArray178 = "a Bright Gray cavalier".getBytes();
}
if(i == 12334)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 36207;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Bright Sky Blue cavalier";
class8.aByteArray178 = "a Bright Sky Blue cavalier".getBytes();
}
if(i == 12335)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 32562;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Teal cavalier";
class8.aByteArray178 = "a Teal cavalier".getBytes();
}
if(i == 12336)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.modifiedModelColors = new int[1];
class8.originalModelColors = new int[1];
class8.modifiedModelColors[0] = 7073;
class8.originalModelColors[0] = 8245;
class8.modelId = 2451;
class8.anInt181 = 690;
class8.anInt190 = 160;
class8.anInt198 = 1856;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -8;
class8.anInt165 = 186;
class8.anInt200 = 362;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 28;
class8.anInt197 = 86;
class8.name = "Dark Gray cavalier";
class8.aByteArray178 = "a Dark Gray cavalier".getBytes();
}
        if(i == 12366)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 18105;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Lime Green h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12367)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 45549;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Unknowed White h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12368)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 50971;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Deep Purple h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12369)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 60176;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Deeper Purple h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12370)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 19213;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Deep Green h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12370)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 3654;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Dull Orange h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12371)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 12904;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Bright Yellow h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12372)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 618;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Bright PInk h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12373)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 46440;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Bright Blue h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12374)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 11378;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Bright Gray h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12375)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 36207;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Bright Sky Blue h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12376)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 32562;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Teal h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12377)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 8245;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "Dark Gray h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
		
        if(i == 16123)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 7079;
            class8.originalModelColors[0] = 43968;
            class8.modifiedModelColors[1] = 7073;
            class8.originalModelColors[1] = 43968;
            class8.modifiedModelColors[2] = 8111;
            class8.originalModelColors[2] = 43968;
            class8.modifiedModelColors[3] = 8107;
            class8.originalModelColors[3] = 43968;
class8.modelId = 11074;
class8.anInt181 = 1000;
class8.anInt190 = 140;
class8.anInt198 = 1796;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 11076;
class8.anInt200 = 11076;
class8.anInt188 = 11077;
class8.anInt164 = 11077;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "blue Lit bug lantern";
            class8.aByteArray178 = "Its an blue Lit bug lantern".getBytes();
        }
		
		        if(i == 18747)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.modelId = 57626;
class8.anInt181 = 2128;
class8.anInt190 = 431;
class8.anInt198 = 10;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt165 = 57675;
class8.anInt200 = 57675;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt197 = -1;
            class8.name = "Faithful shield";
            class8.aByteArray178 = "Its an Faithful shield.".getBytes();
        }
		
				        if(i == 249)
        {
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 22428;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[1] = 22418;
class8.modelId = 2364;
class8.anInt181 = 789;
class8.anInt190 = 581;
class8.anInt198 = 1770;
class8.anInt204 = 97;
class8.anInt169 = 8;
class8.anInt194 = -1;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "Clean guam";
            class8.aByteArray178 = "Its Clean guam".getBytes();
        }
		if(i == 16213) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
            class8.modifiedModelColors = new int[12];
        class8.originalModelColors = new int[12];
class8.modifiedModelColors[0] = 7884;
class8.originalModelColors[0] = 588;
class8.modifiedModelColors[1] = 7856;
class8.originalModelColors[1] = 578;
class8.modifiedModelColors[2] = 7892;
class8.originalModelColors[2] = 596;
class8.modifiedModelColors[3] = 7876;
class8.originalModelColors[3] = 580;
class8.modifiedModelColors[4] = 7860;
class8.originalModelColors[4] = 564;
class8.modifiedModelColors[5] = 7864;
class8.originalModelColors[5] = 568;
class8.modifiedModelColors[6] = 7880;
class8.originalModelColors[6] = 584;
class8.modifiedModelColors[7] = 7880;
class8.originalModelColors[7] = 576;
class8.modifiedModelColors[8] = 7872;
class8.originalModelColors[8] = 578;
class8.modifiedModelColors[9] = 7888;
class8.originalModelColors[9] = 580;
class8.modifiedModelColors[10] = 7848;
class8.originalModelColors[10] = 578;
class8.modifiedModelColors[11] = 7856;
class8.originalModelColors[11] = 578;
class8.modelId = 51845;
class8.anInt181 = 2256;
class8.anInt190 = 456;
class8.anInt198 = 513;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 51795;
class8.anInt200 = 51795;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;					
class8.name = "Staff of Light"; // Item Name
class8.aByteArray178 = "Humming with power.".getBytes(); // Item Examine
      }
		
        if(i == 15124)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Choose-dice";
class8.modelId = 47850;
class8.anInt181 = 1104;
class8.anInt190 = 215;
class8.anInt198 = 94;
class8.anInt204 = 0;
class8.anInt169 = 1;
class8.anInt194 = 0;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Dice bag";
    class8.aByteArray178 = "Its a Dice Bag".getBytes();
}
        if(i == 14670)
        {
            Jukkyname("Mod Sgs Platebody V.2", "Made By Mod Sgsrocks From Godzhell.");
            class8.modifiedModelColors = new int[8];
            class8.originalModelColors = new int[8];
            Jukkycolors(61, 47009, 0);
            Jukkycolors(24, 64162, 1);
            Jukkycolors(41, 47009, 2);
            Jukkycolors(10394, 47009, 3);
            Jukkycolors(10518, 64162, 4);
            Jukkycolors(10388, 64162, 5);
            Jukkycolors(10514, 64162, 6);
            Jukkycolors(10508, 64162, 7);
            Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
            JukkyModels(6646, 3379, 6685, 3383, 2378);
        }
        if(i == 14671)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 47009;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 64162;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.modelId = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Mod Sgs Platelegs V.2";
            class8.aByteArray178 = "Made By Mod Sgsrocks From Godzhell.".getBytes();
        }
        if(i == 14536)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Read";
class8.aStringArray189[4] = "Destroy";
class8.modelId = 44853;
class8.anInt181 = 1114;
class8.anInt190 = 332;
class8.anInt198 = 138;
class8.anInt204 = 83;
class8.anInt169 = 4;
class8.anInt194 = 0;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Turkey book";
    class8.aByteArray178 = "Its a Turkey book".getBytes();
}
        if(i == 14537)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Heal";
class8.aStringArray189[1] = "Food-Count";
class8.aStringArray189[4] = "Destroy";
class8.modelId = 44855;
class8.anInt181 = 1616;
class8.anInt190 = 221;
class8.anInt198 = 168;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = -73;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Cornucopia";
    class8.aByteArray178 = "Its a Cornucopia".getBytes();
}
        if(i == 14538)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Heal";
class8.aStringArray189[1] = "Food-Count";
class8.aStringArray189[4] = "Destroy";
class8.modelId = 44857;
class8.anInt181 = 1616;
class8.anInt190 = 221;
class8.anInt198 = 168;
class8.anInt204 = 0;
class8.anInt169 = 3;
class8.anInt194 = -73;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Cornucopia";
    class8.aByteArray178 = "Its a Cornucopia".getBytes();
}
        if(i == 14539)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Heal";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 5784;
            class8.originalModelColors[0] = 200;
            class8.modifiedModelColors[1] = 5786;
            class8.originalModelColors[1] = 202;
            class8.modifiedModelColors[2] = 5788;
            class8.originalModelColors[2] = 204;
            class8.modifiedModelColors[3] = 5790;
            class8.originalModelColors[3] = 206;
class8.modelId = 44856;
class8.anInt181 = 2000;
class8.anInt190 = 194;
class8.anInt198 = 1563;
class8.anInt204 = 0;
class8.anInt169 = -5;
class8.anInt194 = -15;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt197 = -1;
    class8.name = "Raw turkey";
    class8.aByteArray178 = "Its a Raw turkey".getBytes();
}
        if(i == 14540)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[0] = "Eat";
        //class8.aStringArray189[1] = "Food-Count";
        //class8.aStringArray189[4] = "Destroy";
                    //class8.anIntArray156 = new int[4];
                    //class8.anIntArray160 = new int[4];
                    //class8.anIntArray156[0] = 5784;
                    //class8.anIntArray160[0] = 200;
                    //class8.anIntArray156[1] = 5786;
                    //class8.anIntArray160[1] = 202;
                   //class8.anIntArray156[2] = 5788;
                    //class8.anIntArray160[2] = 204;
                    //class8.anIntArray156[3] = 5790;
                    //class8.anIntArray160[3] = 206;
        class8.modelId = 44856;
        class8.anInt181 = 2000;
        class8.anInt190 = 194;
        class8.anInt198 = 1563;
        class8.anInt204 = 0;
        class8.anInt169 = -5;
        class8.anInt194 = -15;
        class8.anInt165 = -1;
        class8.anInt200 = -1;
        class8.anInt188 = -1;
        class8.anInt164 = -1;
        class8.anInt175 = -1;
        class8.anInt197 = -1;
        class8.anInt197 = -1;
            class8.name = "Cooked turkey";
            class8.aByteArray178 = "Its a Cooked turkey".getBytes();
        }
        if(i == 14541)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Eat";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 5784;
            class8.originalModelColors[0] = 20;
            class8.modifiedModelColors[1] = 5786;
            class8.originalModelColors[1] = 22;
           class8.modifiedModelColors[2] = 5788;
            class8.originalModelColors[2] = 24;
            class8.modifiedModelColors[3] = 5790;
            class8.originalModelColors[3] = 26;
class8.modelId = 44856;
class8.anInt181 = 2000;
class8.anInt190 = 194;
class8.anInt198 = 1563;
class8.anInt204 = 0;
class8.anInt169 = -5;
class8.anInt194 = -15;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt197 = -1;
    class8.name = "Burnt turkey";
    class8.aByteArray178 = "Its a Burnt turkey".getBytes();
}
        if(i == 14542)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Heal";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 5784;
            class8.originalModelColors[0] = 200;
            class8.modifiedModelColors[1] = 5786;
            class8.originalModelColors[1] = 202;
            class8.modifiedModelColors[2] = 5788;
            class8.originalModelColors[2] = 204;
            class8.modifiedModelColors[3] = 5790;
            class8.originalModelColors[3] = 206;
class8.modelId = 44854;
class8.anInt181 = 1616;
class8.anInt190 = 484;
class8.anInt198 = 498;
class8.anInt204 = 0;
class8.anInt169 = -9;
class8.anInt194 = 3;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Raw turkey drumstick";
    class8.aByteArray178 = "Its a Raw turkey drumstick".getBytes();
}
        if(i == 14543)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[0] = "Eat";
        //class8.aStringArray189[1] = "Food-Count";
        //class8.aStringArray189[4] = "Destroy";
                    //class8.anIntArray156 = new int[4];
                    //class8.anIntArray160 = new int[4];
                    //class8.anIntArray156[0] = 5784;
                    //class8.anIntArray160[0] = 200;
                    //class8.anIntArray156[1] = 5786;
                    //class8.anIntArray160[1] = 202;
                   //class8.anIntArray156[2] = 5788;
                    //class8.anIntArray160[2] = 204;
                    //class8.anIntArray156[3] = 5790;
                    //class8.anIntArray160[3] = 206;
class8.modelId = 44854;
class8.anInt181 = 1616;
class8.anInt190 = 484;
class8.anInt198 = 498;
class8.anInt204 = 0;
class8.anInt169 = -9;
class8.anInt194 = 3;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
            class8.name = "Cooked turkey drumstick";
            class8.aByteArray178 = "Its a Cooked turkey drumstick".getBytes();
        }
        if(i == 14544)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Eat";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 5784;
            class8.originalModelColors[0] = 20;
            class8.modifiedModelColors[1] = 5786;
            class8.originalModelColors[1] = 22;
           class8.modifiedModelColors[2] = 5788;
            class8.originalModelColors[2] = 24;
            class8.modifiedModelColors[3] = 5790;
            class8.originalModelColors[3] = 26;
class8.modelId = 44854;
class8.anInt181 = 1616;
class8.anInt190 = 484;
class8.anInt198 = 498;
class8.anInt204 = 0;
class8.anInt169 = -9;
class8.anInt194 = 3;
class8.anInt165 = -1;
class8.anInt200 = -1;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
    class8.name = "Burnt turkey drumstick";
    class8.aByteArray178 = "Its a Burnt turkey drumstick".getBytes();
}
        if(i == 18432)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";//New option
class8.modifiedModelColors = new int[0];
class8.originalModelColors = new int[0];
class8.modelId = 70728; //Model ID
class8.anInt181 = 1772;
class8.anInt190 = 512;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -1;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt165 = 70665;//male wearing
class8.anInt200 = 70665;//female wearing
class8.aBoolean176 = false;//Stackable
class8.name = "Dragonbone platelegs";//Name of the new item
class8.aByteArray178 = "Looks pretty heavy. And mean. And bony.".getBytes();//examin info
}
        if(i == 12378)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 18105;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Lime Green beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12379)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 45549;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Unknowed White beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12380)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 50971;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Deep Purple beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12381)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 60176;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Deeper Purple beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12382)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 19213;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Deep Green beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12383)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 3654;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Dull Orange beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12384)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 12904;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Bright Yellow beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12385)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 618;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Bright PInk beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12386)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 46440;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Bright Blue beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12387)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 11378;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Bright Gray beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12388)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 36207;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Bright Sky Blue beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12389)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 32562;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Teal beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12390)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 10659;
            class8.originalModelColors[0] = 8245;
class8.modelId = 3373;
class8.anInt181 = 560;
class8.anInt190 = 136;
class8.anInt198 = 1936;
class8.anInt204 = 0;
class8.anInt169 = -1;
class8.anInt194 = -4;
class8.anInt165 = 198;
class8.anInt200 = 373;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt175 = 40;
class8.anInt197 = 98;
            class8.name = "Dark Gray beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        
    return class8;
}

    public static Class8 method198_3(int i, Class8 class8)
    {

        if(i == 18365)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 4445;
            class8.anInt165 = 4446;
            class8.anInt200 = 4446;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt181 = 2151;
            class8.anInt190 = 429;
            class8.anInt198 = 1189;
            class8.anInt194 = 5;
            class8.name = "Sword of 1000 truths";
            class8.aByteArray178 = "Lich King sword".getBytes();
        }
        if(i == 18358)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 62692;
            class8.anInt165 = 62750;
            class8.anInt200 = 62750;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt181 = 2151;
            class8.anInt190 = 429;
            class8.anInt198 = 1189;
            class8.anInt194 = 5;
            class8.name = "Zaryte Bow";
            class8.aByteArray178 = "A powerful bow".getBytes();
        }

        if(i == 13482){ //Black Platelegs (G)
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int [3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 11200;
            class8.modifiedModelColors[1] = 41;
            class8.originalModelColors[1] = 11200;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[2] = 0;
            class8.modelId = 2582;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 268;
            class8.anInt200 = 432;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Kyubi Legs";
            class8.aByteArray178 = "It's Kurama's legs".getBytes();
        }

        if(i == 13483){ //Black Platebody (G)
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int [3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 11200;
            class8.modifiedModelColors[1] = 24;
            class8.originalModelColors[1] = 0;
            class8.modifiedModelColors[2] = 41;
            class8.originalModelColors[2] = 11200;
            class8.modelId = 2378;
            class8.anInt181 = 1180;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 3379;
            class8.anInt200 = 3383;
            class8.anInt188 = 164;
            class8.anInt164 = 344;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Kyubi Platebody";
            class8.aByteArray178 = "It's Kurama's body".getBytes();
        }
        if(i == 19568)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 23708;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 23708;
            class8.modelId = 23708;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "RPG";
            class8.aByteArray178 = "From Halo".getBytes();
        }
        if(i == 19567)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 39029;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 39029;
            class8.modelId = 39029;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Scarlet Spirit Shield";
            class8.aByteArray178 = "Spirit Shield".getBytes();
        }
        if(i == 19566)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 71126;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 71126;
            class8.modelId = 71126;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Off-Hand Drygore Rapier";
            class8.aByteArray178 = "Off-hand".getBytes();
        }
        if(i == 19565)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 72117;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 72117;
            class8.modelId = 72117;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Spine Cape";
            class8.aByteArray178 = "Ripped from a monster".getBytes();
        }
        if(i == 19564)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 72119;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 72119;
            class8.modelId = 72120;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Chain Chomp";
            class8.aByteArray178 = "Ripped from mario".getBytes();
        }
        if(i == 19563)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70001;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70001;
            class8.modelId = 70000;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Knightmare Plate";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19562)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70003;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70003;
            class8.modelId = 70002;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Knightmare Legs";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19561)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70005;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70005;
            class8.modelId = 70004;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Knightmare Boots";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19560)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70007;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70007;
            class8.modelId = 70006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Knightmare Gloves";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19559)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70009;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70009;
            class8.modelId = 70008;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Knightmare Helm";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19558)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70011;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70011;
            class8.modelId = 70010;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Soul Edge";
            class8.aByteArray178 = "Sword that destroys souls".getBytes();
        }
        if(i == 19557)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70012;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70012;
            class8.modelId = 70012;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Claws Cape";
            class8.aByteArray178 = "Dragon Claws Cape".getBytes();
        }
        if(i == 19556)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70013;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70013;
            class8.modelId = 70013;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pacman Cape";
            class8.aByteArray178 = "Pacman!".getBytes();
        }
        if(i == 19555)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70014;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70014;
            class8.modelId = 70014;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Seth Sword";
            class8.aByteArray178 = "Sword that destroys cows".getBytes();
        }
        if(i == 19554)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 22;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 22;
            class8.modelId = 604;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Swoc Sword";
            class8.aByteArray178 = "Sword that destroys cows".getBytes();
        }
        if(i == 19553)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 80040;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 80040;
            class8.modelId = 80041;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Plate";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19552)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95041;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95041;
            class8.modelId = 95043;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Legs";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19551)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 63301;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 63301;
            class8.modelId = 63300;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Boots";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19550)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 75667;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 75667;
            class8.modelId = 75666;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Gloves";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19549)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 75665;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 75665;
            class8.modelId = 75664;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Helm";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19548)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 62113;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 62113;
            class8.modelId = 62112;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Cape";
            class8.aByteArray178 = "Cape that destroys souls".getBytes();
        }

        if(i == 19547)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 62109;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 62109;
            class8.modelId = 62108;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Coffin Shield";
            class8.aByteArray178 = "Shield that destroys souls".getBytes();
        }
        if(i == 19546)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93095;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93095;
            class8.modelId = 93096;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Light Plate";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19545)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93093;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93093;
            class8.modelId = 93094;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Light Legs";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19544)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93045;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93045;
            class8.modelId = 93046;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Light Helmet";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19543)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 81000;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 81000;
            class8.modelId = 81001;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Sexy Cape";
            class8.aByteArray178 = "Cape that shows sexyness".getBytes();
        }
        if(i == 19542)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 62101;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 62101;
            class8.modelId = 62100;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Cow Cape";
            class8.aByteArray178 = "Cape that shows sexyness".getBytes();
        }
        if(i == 19541)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 87656;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 27656;
            class8.modelId = 27657;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Quest Cape";
            class8.aByteArray178 = "Cape that shows sexyness".getBytes();
        }
        if(i == 19540)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93001;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93001;
            class8.modelId = 93002;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Master Admin Cape";
            class8.aByteArray178 = "Admin Cape".getBytes();
        }
        if(i == 19539)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95012;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95012;
            class8.modelId = 95011;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Kiln Cape";
            class8.aByteArray178 = "Killed Jad".getBytes();
        }
        if(i == 19538)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 81066;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 81066;
            class8.modelId = 81067;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19537)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 73122;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 73122;
            class8.modelId = 73121;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bob Cape";
            class8.aByteArray178 = "Made by Joel".getBytes();
        }
        if(i == 19536)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 96500;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 96500;
            class8.modelId = 96501;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Veteran Cape";
            class8.aByteArray178 = "SwocScape vet".getBytes();
        }
        if(i == 19535)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95047;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95047;
            class8.modelId = 95048;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pyrebob Shield 2";
            class8.aByteArray178 = "Fire Shield".getBytes();
        }

        if(i == 19534)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95045;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95045;
            class8.modelId = 95046;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pyrebob Sword";
            class8.aByteArray178 = "Fire Sword".getBytes();
        }
        if(i == 19533)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 54555;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 54555;
            class8.modelId = 81063;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Golden Platelegs";
            class8.aByteArray178 = "Gold".getBytes();
        }
        if(i == 19532)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 72061;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 72061;
            class8.modelId = 72060;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Golden Plate";
            class8.aByteArray178 = "Gold".getBytes();
        }
        if(i == 19531)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 81020;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 81020;
            class8.modelId = 81021;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Sword of Ages";
            class8.aByteArray178 = "From MS".getBytes();
        }
        if(i == 19530)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 81030;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 81030;
            class8.modelId = 81031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Sword of the Sea";
            class8.aByteArray178 = "From MS".getBytes();
        }
        if(i == 19529)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 81026;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 81026;
            class8.modelId = 81027;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Slenderman Tenticles";
            class8.aByteArray178 = "From Slenderman".getBytes();
        }
        if(i == 19528)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 72049;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 72049;
            class8.modelId = 72048;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Sword of spirits";
            class8.aByteArray178 = "From MS".getBytes();
        }
        if(i == 19527)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93031;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93031;
            class8.modelId = 93032;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Blades";
            class8.aByteArray178 = "Rainbow Sword".getBytes();
        }
        if(i == 19526)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 80014;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 80014;
            class8.modelId = 80015;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Hween";
            class8.aByteArray178 = "Rainbow Hween".getBytes();
        }
        if(i == 19525)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 28998;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 28998;
            class8.modelId = 28999;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Claws";
            class8.aByteArray178 = "Rainbow Claws".getBytes();
        }
        if(i == 19524)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 80012;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 80012;
            class8.modelId = 80013;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Cav";
            class8.aByteArray178 = "Rainbow Cav".getBytes();
        }
        if(i == 19523)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 58050;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 58050;
            class8.modelId = 58051;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Whip";
            class8.aByteArray178 = "Rainbow Whip".getBytes();
        }
        if(i == 19522)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93057;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93057;
            class8.modelId = 93058;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Crown";
            class8.aByteArray178 = "Rainbow Crown".getBytes();
        }
        if(i == 19521)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95037;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95037;
            class8.modelId = 95038;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Drygore Legs";
            class8.aByteArray178 = "Drygore".getBytes();
        }
        if(i == 19520)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95008;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95008;
            class8.modelId = 95022;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Drygore Plate";
            class8.aByteArray178 = "Drygore".getBytes();
        }
        if(i == 19519)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93077;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93077;
            class8.modelId = 93078;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Wolf Helm";
            class8.aByteArray178 = "Wolf".getBytes();
        }
        if(i == 19518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 95077;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 95077;
            class8.modelId = 95078;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Superman Cape";
            class8.aByteArray178 = "Superman".getBytes();
        }
        if(i == 19517)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93101;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93101;
            class8.modelId = 93102;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Superman Plate";
            class8.aByteArray178 = "Superman".getBytes();
        }
        if(i == 19516)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 93099;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 93099;
            class8.modelId = 93100;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Superman Legs";
            class8.aByteArray178 = "Superman".getBytes();
        }
        if(i == 19515)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 53006;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 53006;
            class8.modelId = 53006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Cool Cape";
            class8.aByteArray178 = "Cape".getBytes();
        }

        if(i == 19505)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70533;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70533;
            class8.modelId = 69597;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Monkey Cape";
            class8.aByteArray178 = "Cape".getBytes();
        }
        if(i == 19506)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 9995;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 9995;
            class8.modelId = 62853;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Plate";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19507)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 9996;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 9996;
            class8.modelId = 62773;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Legs";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19508)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 70949;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 70949;
            class8.modelId = 70962;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Rainbow Skull";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19510)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 71936;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 71936;
            class8.modelId = 71935;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Summoning Shield";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19511)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 71932;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 71932;
            class8.modelId = 71931;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Slayer Shield";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19512)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 8883;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 8883;
            class8.modelId = 8884;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Strength Shield";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19513)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 62826;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 62826;
            class8.modelId = 62827;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Swoc Shield";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19514)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 71995;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 71995;
            class8.modelId = 71996;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Shark Fists";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19501)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 71987;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 71987;
            class8.modelId = 71986;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Golden Scythe";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19500)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19500;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19500;
            class8.modelId = 19500;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Demon Wings";
            class8.aByteArray178 = "Pure Demon".getBytes();
        }
        if(i == 19499)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19501;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19501;
            class8.modelId = 19502;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Slayer Cape";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19498)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 14390;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 14390;
            class8.modelId = 14390;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Corrupt Wings";
            class8.aByteArray178 = "Death".getBytes();
        }
        if(i == 19497)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 18865;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 18865;
            class8.modelId = 18865;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Batarang";
            class8.aByteArray178 = "Batman".getBytes();
        }
        if(i == 19496)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 18864;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 18864;
            class8.modelId = 18864;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dark Knight cape";
            class8.aByteArray178 = "Batman".getBytes();
        }
        if(i == 19495)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 18862;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 18862;
            class8.modelId = 18862;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Butterfly Wings";
            class8.aByteArray178 = "wings".getBytes();
        }
        if(i == 19494)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 66433;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 66433;
            class8.modelId = 66433;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pegasus Suit";
            class8.aByteArray178 = "boom".getBytes();
        }
        if(i == 19493)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 67890;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 67890;
            class8.modelId = 67891;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Demon Plate";
            class8.aByteArray178 = "demons".getBytes();
        }
        if(i == 19492)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 61666;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 61666;
            class8.modelId = 61666;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Jail Orb";
            class8.aByteArray178 = "demons".getBytes();
        }
        if(i == 19491)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19490;
            class8.anInt181 = 2000;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt200 = 19490;
            class8.modelId = 19490;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Hat";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19490)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19489;
            class8.anInt181 = 1300;
            class8.anInt190 = 300;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 0;
            class8.anInt200 = 19489;
            class8.modelId = 19489;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Plate";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19489)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19488;
            class8.anInt181 = 1740;
            class8.anInt190 = 300;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt200 = 19488;
            class8.modelId = 19488;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Legs";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19488)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19487;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19487;
            class8.modelId = 19487;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Cape";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19487)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19486;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19486;
            class8.modelId = 19486;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Gloves";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19486)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 19485;
            class8.anInt181 = 595;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt199 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 19485;
            class8.anInt200 = 19485;
            class8.anInt175 = 56;
            class8.anInt197 = 116;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Owner Boots";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19485)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 19484;
            class8.anInt181 = 595;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt199 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 19484;
            class8.anInt200 = 19484;
            class8.anInt175 = 56;
            class8.anInt197 = 116;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Seth Hood";
            class8.aByteArray178 = "Seth's noob hood".getBytes();
        }
        if(i == 19484)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19483;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19483;
            class8.modelId = 19483;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Seth Body";
            class8.aByteArray178 = "Seth's noob body".getBytes();
        }
        if(i == 19483)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19482;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19482;
            class8.modelId = 19482;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Seth Chaps";
            class8.aByteArray178 = "Seth's noob chaps".getBytes();
        }
        if(i == 19482)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19481;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19481;
            class8.modelId = 19481;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deathtouch Dart";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19481)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19480;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19480;
            class8.modelId = 19480;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Corruption Cape";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19480)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19479;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19479;
            class8.modelId = 19479;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Tattered Wings";
            class8.aByteArray178 = "Swoc".getBytes();
        }
        if(i == 19479)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19478;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19478;
            class8.modelId = 19477;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Torva Cape";
            class8.aByteArray178 = "Torva cape".getBytes();
        }
        if(i == 19478)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19476;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19476;
            class8.modelId = 19475;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deadric Bow";
            class8.aByteArray178 = "From Skyrim".getBytes();
        }
        if(i == 19477)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19474;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19474;
            class8.modelId = 19474;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Obliteration";
            class8.aByteArray178 = "Weapon of Destruction".getBytes();
        }
        if(i == 19476)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19473;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19473;
            class8.modelId = 19473;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Brutal Claws";
            class8.aByteArray178 = "Weapon of Destruction".getBytes();

        }
        if(i == 19475)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19471;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19471;
            class8.modelId = 19472;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Beats Headset";
            class8.aByteArray178 = "Red Beats".getBytes();
        }
        if(i == 19474)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19470;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19470;
            class8.modelId = 19470;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Cow Head";
            class8.aByteArray178 = "Cow".getBytes();
        }
        if(i == 19473)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19469;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19469;
            class8.modelId = 19469;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Sun Glasses";
            class8.aByteArray178 = "Shades".getBytes();
        }
        if(i == 19472)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19467;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19467;
            class8.modelId = 19468;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Master Admin Cape";
            class8.aByteArray178 = "Admin".getBytes();
        }
        if(i == 19471)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 19465;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 19465;
            class8.modelId = 19466;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Master Mod Cape";
            class8.aByteArray178 = "Mod".getBytes();
        }
        if(i == 19470)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 50333;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 50333;
            class8.modelId = 50332;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Wolf Head";
            class8.aByteArray178 = "In memory of a fallen hunter".getBytes();
        }
        if(i == 19469)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 50335;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 50335;
            class8.modelId = 50334;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Wolf Plate";
            class8.aByteArray178 = "In memory of a fallen hunter".getBytes();
        }
        if(i == 19468)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 50337;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 50337;
            class8.modelId = 50336;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Wolf Bow";
            class8.aByteArray178 = "In memory of a fallen hunter".getBytes();
        }
        if(i == 19467)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 50339;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 50339;
            class8.modelId = 50338;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Wolf Legs";
            class8.aByteArray178 = "In memory of a fallen hunter".getBytes();
        }
        if(i == 12391)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 18105;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Lime Green Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12392)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 45549;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Unknowed White Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12393)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 50971;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deep Purple Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12394)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 60176;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deeper Purple Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12395)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 19213;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Deep Green Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12396)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 3654;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dull Orange Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12397)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 12904;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Yellow Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12398)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 618;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright PInk Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12399)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 46440;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Blue Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12400)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 11378;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Gray Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12401)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 36207;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bright Sky Blue Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12402)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 32562;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Teal Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 12403)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 9529;
            class8.originalModelColors[0] = 8245;
            class8.modelId = 7079;
            class8.anInt181 = 730;
            class8.anInt190 = 584;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 7000;
            class8.anInt200 = 7006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dark Gray Shorts";
            class8.aByteArray178 = "These look great, on dwarves!".getBytes();
        }
        if(i == 15339)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 82217;
            class8.anInt181 = 2000;
            class8.anInt190 = 228;
            class8.anInt198 = 1985;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -55;
            class8.anInt165 = 82125;
            class8.anInt200 = 82125;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "X-MAS godsword";
            class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
        }
        if (i == 11346)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 64208;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 64209;// wield
            class8.anInt200 = 64209;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Orange Energy sword";
            class8.aByteArray178 = "An Orange Energy Sword".getBytes();
        }
        if (i == 11347)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67221;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67222;// wield
            class8.anInt200 = 67222;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Halloween Energy sword";
            class8.aByteArray178 = "From traxxas Have a Happy Halloween =)".getBytes();
        }
        if (i == 11348)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67223;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67224;// wield
            class8.anInt200 = 67224;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Bronze Energy sword";
            class8.aByteArray178 = "an energy sword made of bronze.".getBytes();
        }
        if (i == 11349)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67225;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67226;// wield
            class8.anInt200 = 67226;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Steel Energy sword";
            class8.aByteArray178 = "an energy sword made of steel.".getBytes();
        }
        if (i == 11350)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67227;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67228;// wield
            class8.anInt200 = 67228;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Mithril Energy sword";
            class8.aByteArray178 = "an energy sword made of mithril.".getBytes();
        }
        if (i == 11351)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67229;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67230;// wield
            class8.anInt200 = 67230;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Adamant Energy sword";
            class8.aByteArray178 = "an energy sword made of adamant.".getBytes();
        }
        if (i == 11352)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 67231;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 67232;// wield
            class8.anInt200 = 67232;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
// class8.aBoolean176 = false;
            class8.name = "Rune Energy sword";
            class8.aByteArray178 = "an energy sword made of rune.".getBytes();
        }
        if(i == 22215)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 508;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 492;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 508;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 492;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22216)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 7663;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 7647;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 7663;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 7647;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22217)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 40374;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 40358;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 40374;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 40358;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22218)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 26934;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 26918;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 26934;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 26918;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22219)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 2192;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 2192;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 2192;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 2192;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 20169)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 62700;
            class8.anInt181 = 1740;
            class8.anInt190 = 498;
            class8.anInt198 = 2045;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 4;
            class8.anInt165 = 62742;
            class8.anInt200 = 62758;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Virtus robe legs";
            class8.aByteArray178 = "its an Virtus robe legs".getBytes();
        }

        if(i == 20165)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 62704;
            class8.anInt181 = 1122;
            class8.anInt190 = 488;
            class8.anInt198 = 3;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = 62748;
            class8.anInt200 = 62764;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Virtus robe top";
            class8.aByteArray178 = "its an Virtus robe top".getBytes();
        }

        if(i == 20159)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 62710;
            class8.anInt181 = 928;
            class8.anInt190 = 406;
            class8.anInt198 = 2041;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -5;
            class8.anInt165 = 62736;
            class8.anInt200 = 62755;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 62728;
            class8.anInt197 = 62728;
            class8.name = "Virtus Mask";
            class8.aByteArray178 = "its an Virtus Mask".getBytes();
        }
        if(i == 14595)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45273;
            class8.anInt181 = 1360;
            class8.anInt190 = 561;
            class8.anInt198 = 6;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 3;
            class8.anInt165 = 45192;
            class8.anInt200 = 45199;
            class8.anInt188 = 45188;
            class8.anInt164 = 45197;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume top";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14596)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45276;
            class8.anInt181 = 1020;
            class8.anInt190 = 332;
            class8.anInt198 = 2020;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -16;
            class8.anInt165 = 45194;
            class8.anInt200 = 45201;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Ice amulet";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14599)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45276;
            class8.anInt181 = 1020;
            class8.anInt190 = 332;
            class8.anInt198 = 2020;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -16;
            class8.anInt165 = 45194;
            class8.anInt200 = 45201;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Ice amulet";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14601)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45278;
            class8.anInt181 = 1114;
            class8.anInt190 = 512;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 4;
            class8.anInt165 = 45192;
            class8.anInt200 = 45199;
            class8.anInt188 = 45188;
            class8.anInt164 = 45197;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume top";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14602)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45280;
            class8.anInt181 = 659;
            class8.anInt190 = 420;
            class8.anInt198 = 828;
            class8.anInt204 = 97;
            class8.anInt169 = 0;
            class8.anInt194 = -1;
            class8.anInt165 = 45196;
            class8.anInt200 = 45203;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume gloves";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14603)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45275;
            class8.anInt181 = 1872;
            class8.anInt190 = 541;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 4;
            class8.anInt165 = 45195;
            class8.anInt200 = 45202;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume legs";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14604)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45275;
            class8.anInt181 = 1872;
            class8.anInt190 = 541;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 4;
            class8.anInt165 = 45195;
            class8.anInt200 = 45202;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume legs";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14605)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 45272;
            class8.anInt181 = 770;
            class8.anInt190 = 62;
            class8.anInt198 = 124;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 0;
            class8.anInt165 = 45191;
            class8.anInt200 = 45198;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Santa costume boots";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14524)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 99552;
            class8.anInt181 = 770;
            class8.anInt190 = 62;
            class8.anInt198 = 124;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 0;
            class8.anInt165 = 99552;
            class8.anInt200 = 99552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "rasta wings";
            class8.aByteArray178 = "test".getBytes();
        }
        if(i == 25612)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            // class8.anIntArray156 = new int[1];
//class8.anIntArray160 = new int[1];
//class8.anIntArray160[0] = 32984;
            class8.modelId =  5412;
            class8.anInt181 =  840;
            class8.anInt190 =  280;
            class8.anInt198 =  0;
            class8.anInt204 =  0;
            class8.anInt169 =  -2;
            class8.anInt194 =  56;
            class8.anInt165 =  95409;
            class8.anInt200 =  95409;
            class8.anInt188 =  -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Tri Whip";
            class8.aByteArray178 = "a tri Whip".getBytes();
        }
        if (i == 21338)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 84200;
            class8.anInt181 = 1570;
            class8.anInt190 = 400;
            class8.anInt198 = 360;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -5;
            class8.anInt165 = 84201;// wield
            class8.anInt200 = 84201;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            // class8.aBoolean176 = false;
            class8.name = "Duel Energy swords";
            class8.aByteArray178 = "A strong swords made of energy.".getBytes();
        }
        if(i == 21690)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 88162;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 87731;
            class8.anInt200 = 87731;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Tri Armadyl godsword";
            class8.aByteArray178 = "Its a Tri Armadyl godsword".getBytes();
        }
        if(i == 20111)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 98162;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 98162;
            class8.anInt200 = 98162;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Blue halo";
            class8.aByteArray178 = "Its a halo".getBytes();
        }
        if(i == 20112)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 98163;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 98163;
            class8.anInt200 = 98163;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Green halo";
            class8.aByteArray178 = "Its a halo".getBytes();
        }
        if(i == 20113)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 98164;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 98164;
            class8.anInt200 = 98164;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pink halo";
            class8.aByteArray178 = "Its a halo".getBytes();
        }

        if(i == 20114)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 98165;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 98165;
            class8.anInt200 = 98165;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Red halo";
            class8.aByteArray178 = "Its a halo".getBytes();
        }

        if(i == 20115)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
//class8.anIntArray156[0] = 61;
//class8.anIntArray160[0] = 5652;
            class8.modelId = 98166;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 98166;
            class8.anInt200 = 98166;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Yellow halo";
            class8.aByteArray178 = "Its a halo".getBytes();
        }
        if(i == 12637)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 28844;
            class8.anInt181 = 550;
            class8.anInt190 = 228;
            class8.anInt198 = 141;
            class8.anInt169 = 0;
            class8.anInt194 = 3;
            class8.anInt165 = 87630;
            class8.anInt200 = 88833;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Saradomin halo";
            class8.aByteArray178 = "a Saradomin halo".getBytes();
        }
        if(i == 12638)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 28838;
            class8.anInt181 = 528;
            class8.anInt190 = 327;
            class8.anInt198 = 213;
            class8.anInt169 = 3;
            class8.anInt194 = 12;
            class8.anInt165 = 87643;
            class8.anInt200 = 88832;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Zamorak halo";
            class8.aByteArray178 = "a Zamorak halo".getBytes();
        }
        if(i == 12639)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 28837;
            class8.anInt181 = 528;
            class8.anInt190 = 294;
            class8.anInt198 = 123;
            class8.anInt169 = 0;
            class8.anInt194 = 20;
            class8.anInt165 = 87642;
            class8.anInt200 = 88831;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Guthix halo";
            class8.aByteArray178 = "a Guthix halo".getBytes();
        }

        if(i == 22639)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 93866;
            class8.anInt181 = 528;
            class8.anInt190 = 294;
            class8.anInt198 = 123;
            class8.anInt169 = 0;
            class8.anInt194 = 20;
            class8.anInt165 = 93866;
            class8.anInt200 = 93866;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Paradox Wings";
            class8.aByteArray178 = "epic right??".getBytes();
        }
        if(i == 22640)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 93865;
            class8.anInt181 = 528;
            class8.anInt190 = 294;
            class8.anInt198 = 123;
            class8.anInt169 = 0;
            class8.anInt194 = 20;
            class8.anInt165 = 93865;
            class8.anInt200 = 93865;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Crystalline wings";
            class8.aByteArray178 = "epic right??".getBytes();
        }
        if(i == 22641)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 93265;
            class8.anInt181 = 528;
            class8.anInt190 = 294;
            class8.anInt198 = 123;
            class8.anInt169 = 0;
            class8.anInt194 = 20;
            class8.anInt165 = 93266;
            class8.anInt200 = 93266;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Owen 2h sword";
            class8.aByteArray178 = "an Owen 2h sword.".getBytes();
        }
        if(i == 22642)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 93865;
            class8.anInt181 = 528;
            class8.anInt190 = 294;
            class8.anInt198 = 123;
            class8.anInt169 = 0;
            class8.anInt194 = 20;
            class8.anInt165 = 93920;
            class8.anInt200 = 93920;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dragon Rider cape";
            class8.aByteArray178 = "epic right??".getBytes();
        }
        if(i == 13746){
            class8.aStringArray189 = new String[5];
            class8.modelId = 40914;
            class8.anInt181 = 789;
            class8.anInt190 = 225;
            class8.anInt198 = 186;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = -10;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Arcane sigil";
            class8.aByteArray178 = "its an Arcane sigil.".getBytes();
        }
        if(i == 13748){
            class8.aStringArray189 = new String[5];
            class8.modelId = 40916;
            class8.anInt181 = 848;
            class8.anInt190 = 267;
            class8.anInt198 = 138;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Divine sigil";
            class8.aByteArray178 = "its an Divine sigil".getBytes();
        }
        if(i == 13750){
            class8.aStringArray189 = new String[5];
            class8.modelId = 40917;
            class8.anInt181 = 976;
            class8.anInt190 = 288;
            class8.anInt198 = 225;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Elysian sigil";
            class8.aByteArray178 = "its an Elysian sigil".getBytes();
        }
        if(i == 13752){
            class8.aStringArray189 = new String[5];
            class8.modelId = 40918;
            class8.anInt181 = 976;
            class8.anInt190 = 267;
            class8.anInt198 = 1304;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Spectral sigil";
            class8.aByteArray178 = "its an Spectral sigil".getBytes();
        }

        if(i == 13754){
            class8.aStringArray189 = new String[5];
            class8.modelId = 40949;
            class8.anInt181 = 1178;
            class8.anInt190 = 0;
            class8.anInt198 = 1881;
            class8.anInt204 = 1;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Holy elixir";
            class8.aByteArray178 = "its an Holy elixir".getBytes();
        }
        if(i == 13734)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40919;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40943;
            class8.anInt200 = 40943;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Spirit shield";
            class8.aByteArray178 = "its an Spirit shield.".getBytes();
        }

        if(i == 13736)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40913;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40941;
            class8.anInt200 = 40941;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Blessed spirit shield";
            class8.aByteArray178 = "its an Blessed spirit shield.".getBytes();
        }
        if(i == 1835)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 61;
            class8.originalModelColors[1] = 1000;
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -3;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "2008 H'ween boots";
            class8.aByteArray178 = "The 2008 Halloween event boots.".getBytes();
        }
        if(i == 1297)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 12;
            class8.modifiedModelColors[1] = 912;
            class8.originalModelColors[1] = 908;
            class8.modelId = 5026;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "2008 H'ween legs";
            class8.aByteArray178 = "The 2008 Halloween event platelegs.".getBytes();
        }
        if(i == 15235)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 10266;
            class8.originalModelColors[0] = 12;
            class8.modifiedModelColors[1] = 3171;
            class8.originalModelColors[1] = 908;
            class8.modelId = 8733;
            class8.anInt181 = 1190;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 8733;
            class8.anInt200 = 8736;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "2008 H'ween plate";
            class8.aByteArray178 = "The 2008 Halloween event Platebody...".getBytes();
        }
        if(i == 1573)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 10283;
            class8.originalModelColors[0] = 12;
            class8.modifiedModelColors[1] = 10270;
            class8.originalModelColors[1] = 908;
            class8.modelId = 8700;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 8726;
            class8.anInt200 = 8750;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "2008 H'ween gloves";
            class8.aByteArray178 = "2008 Halloween event gloves.".getBytes();
        }
        if(i == 1801)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 926;
            class8.originalModelColors[0] = 0;
            class8.modelId = 2438;
            class8.anInt181 = 730;
            class8.anInt190 = 516;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -10;
            class8.anInt165 = 3188;
            class8.anInt200 = 3192;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 1755;
            class8.anInt197 = 3187;
            class8.name = "2008 Mask";
            class8.aByteArray178 = "The 2008 Halloween event whip.".getBytes();
        }
        if(i == 13738)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40922;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40944;
            class8.anInt200 = 40944;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Arcane spirit shield";
            class8.aByteArray178 = "its an Arcane spirit shield.".getBytes();
        }
        if(i == 13740)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40921;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40939;
            class8.anInt200 = 40939;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Divine spirit shield";
            class8.aByteArray178 = "its an Divine spirit shield.".getBytes();
        }
        if(i == 13742)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40915;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40942;
            class8.anInt200 = 40942;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Elysian spirit shield";
            class8.aByteArray178 = "its an Elysian spirit shield.".getBytes();
        }
        if(i == 13744)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 40920;
            class8.anInt181 = 1616;
            class8.anInt190 = 396;
            class8.anInt198 = 1050;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 4;
            class8.anInt165 = 40940;
            class8.anInt200 = 40940;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Spectral spirit shield";
            class8.aByteArray178 = "its an Spectral spirit shield.".getBytes();
        }
        if(i == 19569)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91067;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91066;
            class8.anInt165 = 91066;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Blue)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19570)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91068;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91069;
            class8.anInt165 = 91069;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Green)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19571)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91070;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91071;
            class8.anInt165 = 91071;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Light Blue)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19572)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91072;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91073;
            class8.anInt165 = 91073;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Orange)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19573)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91074;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91075;
            class8.anInt165 = 91075;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Pink)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19574)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91076;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91077;
            class8.anInt165 = 91077;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Purple)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 19575)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 91078;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 91079;
            class8.anInt165 = 91079;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Dr Cape (Red)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
        if(i == 12337)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 7073;
            class8.originalModelColors[0] = 5231;
            class8.modifiedModelColors[1] = 127;
            class8.originalModelColors[1] = 24;
            class8.modelId = 2451;
            class8.anInt181 = 690;
            class8.anInt190 = 160;
            class8.anInt198 = 1856;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -8;
            class8.anInt165 = 186;
            class8.anInt200 = 362;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "White cavalier";
            class8.aByteArray178 = "an cavalier from osrs.".getBytes();
        }
        if(i == 12463)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.originalModelColors[0] = 5904;
            class8.modifiedModelColors[1] = 38119;
            class8.originalModelColors[1] = 5652;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors[2] = 4395;
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Bronze dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12465)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.originalModelColors[0] = 20;
            class8.modifiedModelColors[1] = 38119;
            class8.originalModelColors[1] = 24;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors[2] = 33;
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Iron dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12467)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.originalModelColors[0] = 5161;
            class8.modifiedModelColors[1] = 38119;
            class8.originalModelColors[1] = 3123;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors[2] = 3148;
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Steel dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12468)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.modifiedModelColors[1] = 38119;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors = new int[] { -27364, -27359, -27479 };
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Mithril dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12471)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 38119;
            class8.originalModelColors[0] = 6072;
            class8.modifiedModelColors[1] = 40167;
            class8.originalModelColors[1] = 6072;
            class8.modelId = 28714;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28512;
            class8.anInt200 = 28581;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Lava dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.modifiedModelColors[1] = 38119;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors = new int[] { 22049, 21910, 25484 };
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Green dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12520)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.modifiedModelColors[1] = 38119;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors = new int[] { -27099, -26841, -26845 };
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Blue dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12522)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.modifiedModelColors[1] = 38119;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors = new int[] { 935, 941, 716 };
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Red dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12524)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 127;
            class8.modifiedModelColors[1] = 38119;
            class8.modifiedModelColors[2] = 38315;
            class8.originalModelColors = new int[] { 0, 30, 26 };
            class8.modelId = 28739;
            class8.anInt181 = 905;
            class8.anInt190 = 202;
            class8.anInt198 = 121;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 22;
            class8.anInt165 = 28508;
            class8.anInt200 = 28552;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 28;
            class8.anInt197 = 86;
            class8.name = "Black dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
        if(i == 12347)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.originalModelColors = new int[] { 109, 11179, 9917, 9771, 8867, 10910 };
            class8.modifiedModelColors = new int[] { 105, 64, 55172, 47, 35, 26 };
            class8.modelId = 20235;
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 20158;
            class8.anInt200 = 20214;
            class8.anInt164 = 20122;
            class8.anInt188 = 20178;
            class8.aBoolean176 = false;
            class8.name = "Gold ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
        if(i == 12348)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.originalModelColors = new int[] { 11179, 11059, 11179, 9771, 10913 };
            class8.modifiedModelColors = new int[] { 105, 5169, 35, 26, 55272 };
            class8.modelId = 20234;
            class8.anInt169 = -1;
            class8.anInt181 = 1221;
            class8.anInt190 = 1333;
            class8.anInt198 = 0;
            class8.anInt194 = -1;
            class8.anInt165 = 20140;
            class8.anInt200 = 20195;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.name = "Gold ele' legs";
            class8.aByteArray178 = "A well made elegant legs.".getBytes();
        }
        if(i == 12489)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.originalModelColors = new int[] { 7114 };
            class8.modifiedModelColors = new int[] { 61 };
            class8.modelId = 2373;
            class8.anInt181 = 1180;
            class8.anInt190 = 300;
            class8.anInt198 = 1120;
            class8.anInt204 = 0;
            class8.anInt169 = -6;
            class8.anInt194 = 4;
            class8.anInt165 = 490;
            class8.anInt200 = 490;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Gilded scimitar";
            class8.aByteArray178 = "an Gilded scimitar from osrs".getBytes();
        }
        if(i == 12491)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.originalModelColors = new int[] {  7114, 7104  };
            class8.modifiedModelColors = new int[] { 61, 5400 };
            class8.modelId = 5037;
            class8.anInt181 = 770;
            class8.anInt190 = 164;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -1;
            class8.anInt165 = 4954;
            class8.anInt200 = 5031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Gilded boots";
            class8.aByteArray178 = "an Gilded boots from osrs".getBytes();
        }
        if(i == 12419)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.originalModelColors = new int[] { 107, 7114, 5239, 6253, 7114 };
            class8.modifiedModelColors = new int[] { 695, 55977, 9152, 41920, 17979  };
            class8.modelId = 10583;
            class8.anInt181 = 1150;
            class8.anInt190 = 112;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 10684;
            class8.anInt200 = 10691;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 10679;
            class8.anInt197 = 10679;
            class8.aBoolean176 = false;
            class8.name = "Light infinity hat";
            class8.aByteArray178 = "an Light infinity hat from osrs".getBytes();
        }
        if(i == 12420)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.originalModelColors = new int[] { 107, 7114, 6622, 6253, 5239, 7114 };
            class8.modifiedModelColors = new int[] {  695, 55977, 24512, 46016, 9152, 58316 };
            class8.modelId = 10586;
            class8.anInt181 = 1380;
            class8.anInt190 = 468;
            class8.anInt198 = 2044;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 0;
            class8.anInt165 = 10687;
            class8.anInt200 = 10694;
            class8.anInt188 = 10681;
            class8.anInt164 = 10688;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Light infinity top";
            class8.aByteArray178 = "an Light infinity top from osrs".getBytes();
        }
        if(i == 12421)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.originalModelColors = new int[] { 107, 7114, 6622, 6253, 7114 };
            class8.modifiedModelColors = new int[] { 695, 55977, 24512, 46016, 58316  };
            class8.modelId = 10585;
            class8.anInt181 = 1760;
            class8.anInt190 = 304;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 30;
            class8.anInt165 = 10686;
            class8.anInt200 = 10693;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Light infinity bottoms";
            class8.aByteArray178 = "an Light infinity bottoms from osrs".getBytes();
        }
        if(i == 12457)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.originalModelColors = new int[] {  0, -8535, -10344, -7220, -8535 };
            class8.modifiedModelColors = new int[] { 695, 55977, 9152, 41920, 17979  };
            class8.modelId = 10583;
            class8.anInt181 = 1150;
            class8.anInt190 = 112;
            class8.anInt198 = 68;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 10684;
            class8.anInt200 = 10691;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 10679;
            class8.anInt197 = 10679;
            class8.aBoolean176 = false;
            class8.name = "Dark infinity hat";
            class8.aByteArray178 = "an Dark infinity hat from osrs".getBytes();
        }
        if(i == 12458)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.originalModelColors = new int[] { 0, -8535, -10344, 0, 0, -8535 };
            class8.modifiedModelColors = new int[] {  695, 55977, 24512, 46016, 9152, 58316 };
            class8.modelId = 10586;
            class8.anInt181 = 1380;
            class8.anInt190 = 468;
            class8.anInt198 = 2044;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 0;
            class8.anInt165 = 10687;
            class8.anInt200 = 10694;
            class8.anInt188 = 10681;
            class8.anInt164 = 10688;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dark infinity top";
            class8.aByteArray178 = "an Dark infinity top from osrs".getBytes();
        }
        if(i == 12459)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.originalModelColors = new int[] { 0, -8535, -10344, 0, -8535 };
            class8.modifiedModelColors = new int[] { 695, 55977, 24512, 46016, 58316  };
            class8.modelId = 10585;
            class8.anInt181 = 1760;
            class8.anInt190 = 304;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 30;
            class8.anInt165 = 10686;
            class8.anInt200 = 10693;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Dark infinity bottoms";
            class8.aByteArray178 = "an Dark infinity bottoms from osrs".getBytes();
        }
        if(i == 10195)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 18105;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 18105;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Lime Green Bunny ears";
            class8.aByteArray178 = "Its A Lime Green Bunny ears".getBytes();
        }
        if(i == 10196)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 45549;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 45549;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Unknowned White Bunny ears";
            class8.aByteArray178 = "Its A Unknowned White Bunny ears".getBytes();
        }
        if(i == 10197)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 50971;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 50971;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Deep Purple Bunny ears";
            class8.aByteArray178 = "Its A Deep Purple Bunny ears".getBytes();
        }
        if(i == 10198)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 60176;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 60176;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Deeper Purple Bunny ears";
            class8.aByteArray178 = "Its A Deeper Purple Bunny ears".getBytes();
        }
        if(i == 10199)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 19213;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 19213;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Deep Green Bunny ears";
            class8.aByteArray178 = "Its A Deep Green Bunny ears".getBytes();
        }
        if(i == 10200)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 3654;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 3654;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Dull Orange Bunny ears";
            class8.aByteArray178 = "Its A Dull Orange Bunny ears".getBytes();
        }
        if(i == 10201)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 12904;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 12904;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bright Yellow Bunny ears";
            class8.aByteArray178 = "Its A Bright Yellow Bunny ears".getBytes();
        }
        if(i == 10202)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 618;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 618;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bright Pink Bunny ears";
            class8.aByteArray178 = "Its A Bright Pink Bunny ears".getBytes();
        }
        if(i == 10203)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 46440;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 46440;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bright Blue Bunny ears";
            class8.aByteArray178 = "Its A Bright Blue Bunny ears".getBytes();
        }
        if(i == 10204)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 11378;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 11378;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bright Gray Bunny ears";
            class8.aByteArray178 = "Its A Bright Gray Bunny ears".getBytes();
        }
        if(i == 10205)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 36207;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 36207;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Bright Sky Blue Bunny ears";
            class8.aByteArray178 = "Its A Bright Sky Blue Bunny ears".getBytes();
        }
        if(i == 10206)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 32562;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 32562;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Teal Bunny ears";
            class8.aByteArray178 = "Its A Teal Bunny ears".getBytes();
        }
        if(i == 10207)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 933;
            class8.originalModelColors[0] = 8245;
            class8.modifiedModelColors[1] = 10351;
            class8.originalModelColors[1] = 8245;
            class8.modelId = 2553;
            class8.anInt181 = 550;
            class8.anInt190 = 360;
            class8.anInt198 = 4;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 3352;
            class8.anInt200 = 3353;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 33;
            class8.anInt197 = 91;
            class8.aBoolean176 = false;
            class8.name = "Dark Gray Bunny ears";
            class8.aByteArray178 = "Its A Dark Gray Bunny ears".getBytes();
        }
        if(i == 24711)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 0;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 0;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 0;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 0;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 0;
            class8.modelId = 71948;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71951;
            class8.anInt200 = 71953;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Depleted pendant";
            class8.aByteArray178 = "It's a Depleted pendant.".getBytes();
        }
        if(i == 24712)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 0;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 0;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 0;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 0;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 0;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 0;
            class8.modelId = 71949;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71950;
            class8.anInt200 = 71952;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Depleted prized pendant";
            class8.aByteArray178 = "It's a Depleted prized pendant.".getBytes();
        }
        if(i == 24713)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 65408;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 65441;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 65458;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 8086;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 8119;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 8187;
            class8.modelId = 71948;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71951;
            class8.anInt200 = 71953;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pendant of Attack";
            class8.aByteArray178 = "It's a Pendant of Attack.".getBytes();
        }
        if(i == 24714)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 65408;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 65441;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 65458;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 8086;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 8119;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 8187;
            class8.modelId = 71949;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71950;
            class8.anInt200 = 71952;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Prized pendant of Attack";
            class8.aByteArray178 = "It's a Prized pendant of Attack.".getBytes();
        }
        if(i == 24715)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 26505;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 26516;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 26537;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 918;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 951;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 1019;
            class8.modelId = 71948;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71951;
            class8.anInt200 = 71953;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pendant of Strength";
            class8.aByteArray178 = "It's a Pendant of Strength.".getBytes();
        }
        if(i == 24716)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 26505;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 26516;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 26537;
            class8.modifiedModelColors[3] = 20607;
            class8.originalModelColors[3] = 918;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 951;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 1019;
            class8.modelId = 71949;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71950;
            class8.anInt200 = 71952;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Prized pendant of Strength";
            class8.aByteArray178 = "It's a Prized pendant of Strength.".getBytes();
        }
        if(i == 24717)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 37780;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 37793;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 26537;
            class8.modifiedModelColors[3] = 37838;
            class8.originalModelColors[3] = 20607;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 64601;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 64639;
            class8.modelId = 71948;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71951;
            class8.anInt200 = 71953;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Pendant of Defence";
            class8.aByteArray178 = "It's a Pendant of Defence.".getBytes();
        }
        if(i == 24718)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 32779;
            class8.originalModelColors[0] = 37780;
            class8.modifiedModelColors[1] = 33754;
            class8.originalModelColors[1] = 37793;
            class8.modifiedModelColors[2] = 54245;
            class8.originalModelColors[2] = 26537;
            class8.modifiedModelColors[3] = 37838;
            class8.originalModelColors[3] = 20607;
            class8.modifiedModelColors[4] = 21466;
            class8.originalModelColors[4] = 64601;
            class8.modifiedModelColors[5] = 54245;
            class8.originalModelColors[5] = 64639;
            class8.modelId = 71949;
            class8.anInt181 = 592;
            class8.anInt190 = 552;
            class8.anInt198 = 242;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -3;
            class8.anInt165 = 71950;
            class8.anInt200 = 71952;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Prized pendant of Defence";
            class8.aByteArray178 = "It's a Prized pendant of Defence.".getBytes();
        }
        if(i == 20786)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 79221;
            class8.anInt181 = 1382;
            class8.anInt190 = 364;
            class8.anInt198 = 1158;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = -12;
            class8.anInt165 = 79828;// wield
            class8.anInt200 = 79828;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gilded dragon pickaxe";
            class8.aByteArray178 = "Used for mining.".getBytes();
        }
        if(i == 20108)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId =  65412;
            class8.anInt181 =  840;
            class8.anInt190 =  280;
            class8.anInt198 =  0;
            class8.anInt204 =  0;
            class8.anInt169 =  -2;
            class8.anInt194 =  56;
            class8.anInt165 =  65409;
            class8.anInt200 =  65409;
            class8.anInt188 =  -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Easter Whip";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
        if(i == 20109)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 65413;
            class8.anInt181 = 2000;
            class8.anInt190 = 308;
            class8.anInt198 = 36;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 17;
            class8.anInt165 = 65410;
            class8.anInt200 = 65410;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Easter maul";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
        if(i == 20110)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId =  65412;
            class8.anInt181 =  840;
            class8.anInt190 =  280;
            class8.anInt198 =  0;
            class8.anInt204 =  0;
            class8.anInt169 =  -2;
            class8.anInt194 =  56;
            class8.anInt165 =  65420;
            class8.anInt200 =  65420;
            class8.anInt188 =  -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Easter Whip ( 3D )";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
        if(i == 12809)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.originalModelColors = new int[] { 7097, 7114, 7114 };
            class8.modifiedModelColors = new int[] { 43086, 43111, 43098 };
            class8.modelId = 28045;
            class8.anInt181 = 2151;
            class8.anInt190 = 636;
            class8.anInt198 = 1521;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt204 = 3;
            class8.anInt165 = 27652;
            class8.anInt200 = 27652;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;
            class8.name = "Saradomin's blessed sword";
            class8.aByteArray178 = "The blade of an Icyene, blessed with a tear from Saradomin himself.".getBytes();
        }
        if(i == 15624)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 22443;
            class8.modelId =  5412;
            class8.anInt181 =  840;
            class8.anInt190 =  280;
            class8.anInt198 =  0;
            class8.anInt204 =  0;
            class8.anInt169 =  -2;
            class8.anInt194 =  56;
            class8.anInt165 =  5409;
            class8.anInt200 =  5409;
            class8.anInt188 =  -1;
            class8.anInt164 =  -1;
            class8.anInt175 =  -1;
            class8.anInt197 =  -1;
            class8.name = "Emerald Whip";
            class8.aByteArray178 = "a Emerald Whip".getBytes();
        }


        if(i == 15625)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 33;
            class8.originalModelColors[0] = 22443;
            class8.modifiedModelColors[1] = 49;
            class8.originalModelColors[1] = 22443;
            class8.modifiedModelColors[2] = 41;
            class8.originalModelColors[2] = 22443;
            class8.modelId = 2558;
            class8.anInt181 = 1100;
            class8.anInt190 = 568;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 2;
            class8.anInt165 = 301;
            class8.anInt200 = 464;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Emerald chainbody";
            class8.aByteArray178 = "a Emerald chainbody".getBytes();
        }

        if(i == 15626)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 24;
            class8.originalModelColors[0] = 22443;
            class8.modifiedModelColors[1] = 61;
            class8.originalModelColors[1] = 22443;
            class8.modifiedModelColors[2] = 41;
            class8.originalModelColors[2] = 22443;
            class8.modelId = 2605;
            class8.anInt181 = 1250;
            class8.anInt190 = 488;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 0;
            class8.anInt165 = 306;
            class8.anInt200 = 468;
            class8.anInt188 = 164;
            class8.anInt164 = 344;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Emerald Platebody";
            class8.aByteArray178 = "a Emerald Platebody".getBytes();
        }

        if(i == 15627)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 22443;
            class8.modelId = 2833;
            class8.anInt181 = 640;
            class8.anInt190 = 108;
            class8.anInt198 = 156;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -4;
            class8.anInt165 = 219;
            class8.anInt200 = 395;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 57;
            class8.anInt197 = 117;
            class8.name = "Emerald Med Helm";
            class8.aByteArray178 = "a Emerald Med Helm".getBytes();
        }

        if(i == 15628)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 22443;
            class8.modifiedModelColors[1] = 926;
            class8.originalModelColors[1] = 48030;
            class8.modelId = 2813;
            class8.anInt181 = 800;
            class8.anInt190 = 160;
            class8.anInt198 = 152;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 6;
            class8.anInt165 = 218;
            class8.anInt200 = 394;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 56;
            class8.anInt197 = 116;
            class8.name = "Emerald full Helm";
            class8.aByteArray178 = "a Emerald full Helm".getBytes();
        }

        if(i == 15629)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 61;
            class8.originalModelColors[0] = 22443;
            class8.modifiedModelColors[1] = 41;
            class8.originalModelColors[1] = 22443;
            class8.modifiedModelColors[2] = 57;
            class8.originalModelColors[2] = 22443;
            class8.modelId = 2582;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 268;
            class8.anInt200 = 432;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Emerald Platelegs";
            class8.aByteArray178 = "a Emerald platelegs".getBytes();
        }
        if(i == 18353)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 54286;
            class8.anInt181 = 1447;
            class8.anInt190 = 525;
            class8.anInt198 = 350;
            class8.anInt204 = 40;
            class8.anInt169 = 5;
            class8.anInt194 = 3;
            class8.anInt165 = 56294;
            class8.anInt200 = 56294;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Chaotic maul";
            class8.aByteArray178 = "A maul used to claim life from those who don't deserve it.".getBytes();
        }
        if(i == 18349)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 54197;
            class8.anInt181 = 1447;
            class8.anInt190 = 1522;
            class8.anInt198 = 1710;
            class8.anInt204 = 1158;
            class8.anInt169 = 9;
            class8.anInt194 = -7;
            class8.anInt165 = 56252;
            class8.anInt200 = 56252;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Chaotic rapier";
            class8.aByteArray178 = "A razor-sharp rapier.".getBytes();
        }
        if(i == 18351)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 54204;
            class8.anInt181 = 1579;
            class8.anInt190 = 1603;
            class8.anInt198 = 1805;
            class8.anInt204 = 916;
            class8.anInt169 = 3;
            class8.anInt194 = 0;
            class8.anInt165 = 56237;
            class8.anInt200 = 56237;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Chaotic longsword";
            class8.aByteArray178 = "A razor-sharp longsword.".getBytes();
        }
        if(i == 18355)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 54367;
            class8.anInt181 = 1711;
            class8.anInt190 = 471;
            class8.anInt198 = 391;
            class8.anInt204 = 2047;
            class8.anInt169 = 0;
            class8.anInt194 = -1;
            class8.anInt165 = 56286;
            class8.anInt200 = 56286;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Chaotic staff";
            class8.aByteArray178 = "This staff makes destructive spells more powerful.".getBytes();
        }
        if(i == 20745)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 65261;
            class8.anInt181 = 1513;
            class8.anInt190 = 279;
            class8.anInt198 = 948;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 24;
            class8.anInt165 = 65305;
            class8.anInt200 = 65318;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Veteran cape";
            class8.aByteArray178 = "Its A Veteran cape.".getBytes();
        }
        if(i == 20744)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 65271;
            class8.anInt181 = 658;
            class8.anInt190 = 323;
            class8.anInt198 = 798;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -1;
            class8.anInt165 = 65289;
            class8.anInt200 = 65314;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = 14;
            class8.anInt197 = 7;
            class8.name = "Veteran hood";
            class8.aByteArray178 = "Its A Veteran hood.".getBytes();
        }
        if(i == 13108)
        {
            class8.aStringArray189 = new String[] { null, "Wield", null, null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29121;
            class8.anInt181 = 1660;
            class8.anInt190 = 500;
            class8.anInt198 = 1800;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -1;
            class8.anInt165 = 29078;
            class8.anInt200 = 29091;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Wilderness sword 1";
            class8.aByteArray178 = "an Wilderness sword 1 from osrs".getBytes();
        }
        if(i == 13109)
        {
            class8.aStringArray189 = new String[] { null, "Wield", null, null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29128;
            class8.anInt181 = 1660;
            class8.anInt190 = 500;
            class8.anInt198 = 1800;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -1;
            class8.anInt165 = 29088;
            class8.anInt200 = 29075;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Wilderness sword 2";
            class8.aByteArray178 = "an Wilderness sword 2 from osrs".getBytes();
        }
        if(i == 13110)
        {
            class8.aStringArray189 = new String[] { null, "Wield", "Teleport", null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29160;
            class8.anInt181 = 1660;
            class8.anInt190 = 500;
            class8.anInt198 = 1800;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -1;
            class8.anInt165 = 29093;
            class8.anInt200 = 29081;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Wilderness sword 3";
            class8.aByteArray178 = "an Wilderness sword 3 from osrs".getBytes();
        }
        if(i == 13111)
        {
            class8.aStringArray189 = new String[] { null, "Wield", "Teleport", null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29157;
            class8.anInt181 = 1660;
            class8.anInt190 = 500;
            class8.anInt198 = 1800;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -1;
            class8.anInt165 = 29085;
            class8.anInt200 = 29092;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Wilderness sword 4";
            class8.aByteArray178 = "an Wilderness sword 4 from osrs".getBytes();
        }
        if(i == 29536)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[] { 50111, 43468 };
            class8.originalModelColors = new int[] { -23903, -23903 };
            class8.anInt165 = 96500;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 96500;
            class8.modelId = 96501;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Veteran Cape (Navy)";
            class8.aByteArray178 = "SwocScape vet".getBytes();
        }
        if(i == 13680) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 14125; //Inv & Ground
            class8.anInt181 = 2000; //Zoom
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 14126; //Male
            class8.anInt200 = 14126; //Female
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;//noteable
            class8.name = "Ex-Moderator cape";
            class8.aByteArray178 = "Its A Ex-moderator Cape".getBytes();
        }
        if(i == 13681) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 14127; //Inv & Ground
            class8.anInt181 = 2000; //Zoom
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 14128; //Male
            class8.anInt200 = 14128; //Female
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;//noteable
            class8.name = "Ex-Administrator cape";
            class8.aByteArray178 = "Its an Ex-administrator cape".getBytes();
        }
        if(i == 13682) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modelId = 14129; //Inv & Ground
            class8.anInt181 = 2000; //Zoom
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 14130; //Male
            class8.anInt200 = 14130; //Female
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt199 = -1;//noteable
            class8.name = "Ex-Owner cape";
            class8.aByteArray178 = "Its an Ex-owner cape".getBytes();
        }
        if(i == 9140) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[] { 17971, 5537, 5532, 5656, 5652 };
            class8.originalModelColors = new int[] { 45, 41, 37, 33, 28 };
            class8.modelId = 16862;
            class8.anInt181 = 720;
            class8.anInt190 = 477;
            class8.anInt198 = 117;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 5;
            class8.anInt199 = -1;
            class8.anInt155 = 300;
            class8.anInt165 = -1;
            class8.anInt188 = -1;
            class8.anInt200 = -1;
            class8.anInt164 = -1;
            class8.anInt185 = -1;
            class8.anInt162 = -1;
            class8.anInt175 = -1;
            class8.anInt166 = -1;
            class8.anInt197 = -1;
            class8.anInt173 = -1;
            class8.anInt179 = -1;
            class8.anInt163 = -1;
            class8.anInt167 = 128;
            class8.anInt192 = 128;
            class8.anInt191 = 128;
            class8.anInt196 = 0;
            class8.anInt184 = 0;
            class8.anInt202 = 0;
            class8.aBoolean176 = true;
            class8.name = "Iron bolts";
            class8.aByteArray178 = "Iron bolts".getBytes();
        }
        if(i == 9141) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[] { 17971, 5537, 5532, 5656, 5652 };
            class8.originalModelColors = new int[] { 78, 74, 70, 66, 61 };
            class8.modelId = 16862;
            class8.anInt181 = 720;
            class8.anInt190 = 477;
            class8.anInt198 = 117;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 5;
            class8.anInt199 = -1;
            class8.anInt155 = 300;
            class8.anInt165 = -1;
            class8.anInt188 = -1;
            class8.anInt200 = -1;
            class8.anInt164 = -1;
            class8.anInt185 = -1;
            class8.anInt162 = -1;
            class8.anInt175 = -1;
            class8.anInt166 = -1;
            class8.anInt197 = -1;
            class8.anInt173 = -1;
            class8.anInt179 = -1;
            class8.anInt163 = -1;
            class8.anInt167 = 128;
            class8.anInt192 = 128;
            class8.anInt191 = 128;
            class8.anInt196 = 0;
            class8.anInt184 = 0;
            class8.anInt202 = 0;
            class8.aBoolean176 = true;
            class8.name = "Steel bolts";
            class8.aByteArray178 = "Steel bolts".getBytes();
        }
        if(i == 9142) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[] { 17971, 5537, 5532, 5656, 5652 };
            class8.originalModelColors = new int[] { 43185, 43181, 43177, 43173, 43297 };
            class8.modelId = 16862;
            class8.anInt181 = 720;
            class8.anInt190 = 477;
            class8.anInt198 = 117;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 5;
            class8.anInt199 = -1;
            class8.anInt155 = 300;
            class8.anInt165 = -1;
            class8.anInt188 = -1;
            class8.anInt200 = -1;
            class8.anInt164 = -1;
            class8.anInt185 = -1;
            class8.anInt162 = -1;
            class8.anInt175 = -1;
            class8.anInt166 = -1;
            class8.anInt197 = -1;
            class8.anInt173 = -1;
            class8.anInt179 = -1;
            class8.anInt163 = -1;
            class8.anInt167 = 128;
            class8.anInt192 = 128;
            class8.anInt191 = 128;
            class8.anInt196 = 0;
            class8.anInt184 = 0;
            class8.anInt202 = 0;
            class8.aBoolean176 = true;
            class8.name = "Mithril bolts";
            class8.aByteArray178 = "Mithril bolts".getBytes();
        }
        if(i == 9143) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[] { 17971, 5537, 5532, 5656, 5652 };
            class8.originalModelColors = new int[] { 21671, 21671, 21667, 21662, 21658 };
            class8.modelId = 16862;
            class8.anInt181 = 720;
            class8.anInt190 = 477;
            class8.anInt198 = 117;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 5;
            class8.anInt199 = -1;
            class8.anInt155 = 300;
            class8.anInt165 = -1;
            class8.anInt188 = -1;
            class8.anInt200 = -1;
            class8.anInt164 = -1;
            class8.anInt185 = -1;
            class8.anInt162 = -1;
            class8.anInt175 = -1;
            class8.anInt166 = -1;
            class8.anInt197 = -1;
            class8.anInt173 = -1;
            class8.anInt179 = -1;
            class8.anInt163 = -1;
            class8.anInt167 = 128;
            class8.anInt192 = 128;
            class8.anInt191 = 128;
            class8.anInt196 = 0;
            class8.anInt184 = 0;
            class8.anInt202 = 0;
            class8.aBoolean176 = true;
            class8.name = "Adamant bolts";
            class8.aByteArray178 = "Adamant bolts".getBytes();
        }
        if(i == 9144) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[] { 17971, 5537, 5532, 5656, 5652 };
            class8.originalModelColors = new int[] { 21671, 21671, 21667, 21662, 21658 };
            class8.modelId = 16862;
            class8.anInt181 = 720;
            class8.anInt190 = 477;
            class8.anInt198 = 117;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 5;
            class8.anInt199 = -1;
            class8.anInt155 = 300;
            class8.anInt165 = -1;
            class8.anInt188 = -1;
            class8.anInt200 = -1;
            class8.anInt164 = -1;
            class8.anInt185 = -1;
            class8.anInt162 = -1;
            class8.anInt175 = -1;
            class8.anInt166 = -1;
            class8.anInt197 = -1;
            class8.anInt173 = -1;
            class8.anInt179 = -1;
            class8.anInt163 = -1;
            class8.anInt167 = 128;
            class8.anInt192 = 128;
            class8.anInt191 = 128;
            class8.anInt196 = 0;
            class8.anInt184 = 0;
            class8.anInt202 = 0;
            class8.aBoolean176 = true;
            class8.name = "Runite bolts";
            class8.aByteArray178 = "Runite bolts".getBytes();
        }
        if(i == 18786)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 0;
            class8.modelId = 95620;
            class8.anInt181 = 2000;
            class8.anInt190 = 533;
            class8.anInt198 = 533;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -1;
            class8.anInt165 = 95621;
            class8.anInt200 = 95621;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Zangetsu (Shikai)";
            class8.aByteArray178 = "Made by 198078".getBytes();
        }
        if(i == 19668)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt165 = 90338;
            class8.anInt181 = 2200;
            class8.anInt190 = 572;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt200 = 90337;
            class8.modelId = 90337;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Owner Bow";
            class8.aByteArray178 = "An Bow for Owners.".getBytes();
        }
        if(i == 11702)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28153;
            class8.anInt181 = 789;
            class8.anInt190 = 498;
            class8.anInt198 = 263;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Armadyl hilt";
            class8.aByteArray178 = "its an Armadyl hilt.".getBytes();
        }

        if(i == 11704)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28146;
            class8.anInt181 = 868;
            class8.anInt190 = 618;
            class8.anInt198 = 203;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Bandos hilt";
            class8.aByteArray178 = "its an Bandos hilt.".getBytes();
        }


        if(i == 11706)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28155;
            class8.anInt181 = 789;
            class8.anInt190 = 498;
            class8.anInt198 = 263;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Saradomin hilt";
            class8.aByteArray178 = "its an Saradomin hilt.".getBytes();
        }

        if(i == 11708)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28158;
            class8.anInt181 = 917;
            class8.anInt190 = 435;
            class8.anInt198 = 224;
            class8.anInt204 = 0;
            class8.anInt169 = 2;
            class8.anInt194 = -6;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Zamorak hilt";
            class8.aByteArray178 = "its an Zamorak hilt.".getBytes();
        }
        if(i == 11710)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28152;
            class8.anInt181 = 984;
            class8.anInt190 = 549;
            class8.anInt198 = 249;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Godsword shard 1";
            class8.aByteArray178 = "its an Godsword shard 1".getBytes();
        }
        if(i == 11712)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28168;
            class8.anInt181 = 984;
            class8.anInt190 = 675;
            class8.anInt198 = 249;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Godsword shard 2";
            class8.aByteArray178 = "its an Godsword shard 2".getBytes();
        }

        if(i == 11714)
        {
            class8.aStringArray189 = new String[5];
            class8.modelId = 28160;
            class8.anInt181 = 984;
            class8.anInt190 = 612;
            class8.anInt198 = 207;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Godsword shard 3";
            class8.aByteArray178 = "its an Godsword shard 3".getBytes();
        }

        if(i == 11690)
        {
            class8.aStringArray189 = new String[5];
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 41;
            class8.originalModelColors[0] = 5652;
            class8.modelId = 28166;
            class8.anInt181 = 1447;
            class8.anInt190 = 337;
            class8.anInt198 = 229;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = 9;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Godsword blade";
            class8.aByteArray178 = "its an Godsword blade".getBytes();
        }

        if(i == 14007) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit terrorbird pouch"; //Name
            class8.aByteArray178 = "Its an Spirit terrorbird pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30651;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14009) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Granite crab pouch"; //Name
            class8.aByteArray178 = "Its an Granite crab pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30676;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14011) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Praying mantis pouch"; //Name
            class8.aByteArray178 = "Its an Praying mantis pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30716;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14013) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Giant ent pouch"; //Name
            class8.aByteArray178 = "Its an Giant ent pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30622;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14015) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit cobra pouch"; //Name
            class8.aByteArray178 = "Its an Spirit cobra pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30779;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14017) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit dagannoth pouch"; //Name
            class8.aByteArray178 = "Its an Spirit dagannoth pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30604;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14019) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Thorny snail pouch"; //Name
            class8.aByteArray178 = "Its an Thorny snail pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30670;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14021) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Beaver pouch"; //Name
            class8.aByteArray178 = "Its an Beaver pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30812;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14023) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Karam. overlord pouch"; //Name
            class8.aByteArray178 = "Its an Karam. overlord pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30842;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14025) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Hydra pouch"; //Name
            class8.aByteArray178 = "Its an Hydra pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30625;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14027) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit jelly pouch"; //Name
            class8.aByteArray178 = "Its an Spirit jelly pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30847;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14029) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Bunyip pouch"; //Name
            class8.aByteArray178 = "Its an Bunyip pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30635;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14031) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "War tortoise pouch"; //Name
            class8.aByteArray178 = "Its an War tortoise pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30819;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14033) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Fruit bat pouch"; //Name
            class8.aByteArray178 = "Its an Fruit bat pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30586;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14035) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Abyssal parasite pouch"; //Name
            class8.aByteArray178 = "Its an Abyssal parasite pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30699;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14037) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Abyssal lurker pouch"; //Name
            class8.aByteArray178 = "Its an Abyssal lurker pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30692;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14039) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Unicorn stallion pouch"; //Name
            class8.aByteArray178 = "Its an Unicorn stallion pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30811;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14041) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Magpie pouch"; //Name
            class8.aByteArray178 = "Its an Magpie pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30711;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14043) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Dreadfowl pouch"; //Name
            class8.aByteArray178 = "Its an Dreadfowl pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30664;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14045) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Stranger plant pouch"; //Name
            class8.aByteArray178 = "Its an Stranger plant pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30718;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14047) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit wolf pouch"; //Name
            class8.aByteArray178 = "Its an Spirit wolf pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30591;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14049) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Desert wyrm pouch"; //Name
            class8.aByteArray178 = "Its an Desert wyrm pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30735;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14051) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Evil turnip pouch"; //Name
            class8.aByteArray178 = "Its an Evil turnip pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30739;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14053) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Vampyre bat pouch"; //Name
            class8.aByteArray178 = "Its an Vampyre bat pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30640;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14055) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit scorpion pouch"; //Name
            class8.aByteArray178 = "Its an Spirit scorpion pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30807;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14057) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Arctic bear pouch"; //Name
            class8.aByteArray178 = "Its an Arctic bear pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30777;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14059) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit spider pouch"; //Name
            class8.aByteArray178 = "Its an Spirit spider pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30764;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14061) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Bloated leech pouch"; //Name
            class8.aByteArray178 = "Its an Bloated leech pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30644;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14063) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Spirit kalphite pouch"; //Name
            class8.aByteArray178 = "Its an Spirit kalphite pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30800;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14065) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Honey badger pouch"; //Name
            class8.aByteArray178 = "Its an Honey badger pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30597;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14067) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Albino rat pouch"; //Name
            class8.aByteArray178 = "Its an Albino rat pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30588;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14069) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Granite lobster pouch"; //Name
            class8.aByteArray178 = "Its an Granite lobster pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30794;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14071) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Macaw pouch"; //Name
            class8.aByteArray178 = "Its an Macaw pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30610;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14073) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Bronze minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Bronze minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 5656;
            class8.originalModelColors[1] = 5652;
            class8.originalModelColors[2] = 5904;
            class8.originalModelColors[3] = 6674;
            class8.originalModelColors[4] = 6798;
            class8.originalModelColors[5] = 7050;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14075) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Iron minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Iron minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 37;
            class8.originalModelColors[1] = 33;
            class8.originalModelColors[2] = 28;
            class8.originalModelColors[3] = 20;
            class8.originalModelColors[4] = 16;
            class8.originalModelColors[5] = 12;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14077) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Steel minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Steel minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 70;
            class8.originalModelColors[1] = 66;
            class8.originalModelColors[2] = 61;
            class8.originalModelColors[3] = 41;
            class8.originalModelColors[4] = 37;
            class8.originalModelColors[5] = 33;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14079) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Mithril minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Mithril minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 43173;
            class8.originalModelColors[1] = 43297;
            class8.originalModelColors[2] = 43292;
            class8.originalModelColors[3] = 43292;
            class8.originalModelColors[4] = 43288;
            class8.originalModelColors[5] = 43412;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14081) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Adamant minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Adamant minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 21667;
            class8.originalModelColors[1] = 21662;
            class8.originalModelColors[2] = 21658;
            class8.originalModelColors[3] = 21656;
            class8.originalModelColors[4] = 21652;
            class8.originalModelColors[5] = 21776;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14083) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Rune minotaur pouch"; //Name
            class8.aByteArray178 = "Its an Rune minotaur pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 36137;
            class8.originalModelColors[1] = 36133;
            class8.originalModelColors[2] = 36257;
            class8.originalModelColors[3] = 36372;
            class8.originalModelColors[4] = 36624;
            class8.originalModelColors[5] = 36748;
            class8.modelId = 30780;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14085) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Smoke devil pouch"; //Name
            class8.aByteArray178 = "Its an Smoke devil pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30582;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14087) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Bull ant pouch"; //Name
            class8.aByteArray178 = "Its an Bull ant pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30827;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14089) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Wolpertinger pouch"; //Name
            class8.aByteArray178 = "Its an Wolpertinger pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30758;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14091) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Compost mound pouch"; //Name
            class8.aByteArray178 = "Its an Compost mound pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30648;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14093) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Pack yak pouch"; //Name
            class8.aByteArray178 = "Its an Pack yak pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30837;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14095) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. cockatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. cockatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 14097) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. guthatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. guthatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 10458;
            class8.originalModelColors[1] = 19361;
            class8.originalModelColors[2] = 18341;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14099) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. saratrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. saratrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 10326;
            class8.originalModelColors[1] = 33088;
            class8.originalModelColors[2] = 33096;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14101) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. zamatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. zamatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 3239;
            class8.originalModelColors[1] = 1438;
            class8.originalModelColors[2] = 2737;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 14103) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. pengatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. pengatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 3239;
            class8.originalModelColors[1] = 3239;
            class8.originalModelColors[2] = 3235;
            class8.modelId = 30623;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14105) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. coraxatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. coraxatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 28;
            class8.originalModelColors[1] = 28;
            class8.originalModelColors[2] = 24;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14107) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[3] = "Summon";
            class8.name = "Sp. vulatrice pouch"; //Name
            class8.aByteArray178 = "Its an Sp. vulatrice pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 8497;
            class8.modifiedModelColors[1] = 1455;
            class8.modifiedModelColors[2] = 1447;
            class8.originalModelColors[0] = 3239;
            class8.originalModelColors[1] = 3239;
            class8.originalModelColors[2] = 3235;
            class8.modelId = 30787;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 12158) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.name = "Gold charm"; //Name
            class8.aByteArray178 = "Its an Gold charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31553;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 12159) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Green charm"; //Name
            class8.aByteArray178 = "Its an Green charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31543;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 12160) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Crimson charm"; //Name
            class8.aByteArray178 = "Its an Crimson charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31525;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 12161) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Abyssal charm"; //Name
            class8.aByteArray178 = "Its an Abyssal charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31532;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12162) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Talon beast charm"; //Name
            class8.aByteArray178 = "Its an Talon beast charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31550;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12163) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Blue charm"; //Name
            class8.aByteArray178 = "Its an Blue charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31531;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 12164) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Ravager charm"; //Name
            class8.aByteArray178 = "Its an Ravager charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31536;
            class8.anInt181 = 550;
            class8.anInt190 = 417;
            class8.anInt198 = 781;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12165) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Shifter charm"; //Name
            class8.aByteArray178 = "Its an Shifter charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31547;
            class8.anInt181 = 550;
            class8.anInt190 = 377;
            class8.anInt198 = 1791;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12166) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Spinner charm"; //Name
            class8.aByteArray178 = "Its an Spinner charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31523;
            class8.anInt181 = 550;
            class8.anInt190 = 377;
            class8.anInt198 = 1791;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12167) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Torcher charm"; //Name
            class8.aByteArray178 = "Its an Torcher charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31552;
            class8.anInt181 = 550;
            class8.anInt190 = 404;
            class8.anInt198 = 1791;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 12168) //ID
        {
            class8.aStringArray189 = new String[5];

            class8.name = "Obsidian charm"; //Name
            class8.aByteArray178 = "Its an Obsidian charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31555;
            class8.anInt181 = 550;
            class8.anInt190 = 310;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14422) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Herbcall scroll"; //Name
            class8.aByteArray178 = "Its an Herbcall scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 43462;
            class8.modifiedModelColors[1] = 43466;
            class8.modifiedModelColors[2] = 43602;
            class8.modifiedModelColors[3] = 43486;
            class8.originalModelColors[0] = 43813;
            class8.originalModelColors[1] = 43561;
            class8.originalModelColors[2] = 43695;
            class8.originalModelColors[3] = 43458;
            class8.modelId = 30631;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14423) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Fruitfall scroll"; //Name
            class8.aByteArray178 = "Its an Fruitfall scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30752;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14424) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Fish rain scroll"; //Name
            class8.aByteArray178 = "Its an Fish rain scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30728;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14425) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Howl scroll"; //Name
            class8.aByteArray178 = "Its an Howl scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30796;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14426) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Thieving fingers scroll"; //Name
            class8.aByteArray178 = "Its an Thieving fingers scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30783;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14427) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Abyssal stealth scroll"; //Name
            class8.aByteArray178 = "Its an Abyssal stealth scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30788;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14428) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Egg spawn scroll"; //Name
            class8.aByteArray178 = "Its an Egg spawn scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30802;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14429) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Multichop scroll"; //Name
            class8.aByteArray178 = "Its an Multichop scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30808;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14430) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Cheese feast scroll"; //Name
            class8.aByteArray178 = "Its an Cheese feast scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30793;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14431) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Unburden scroll"; //Name
            class8.aByteArray178 = "Its an Unburden scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30772;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14432) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Venom shot scroll"; //Name
            class8.aByteArray178 = "Its an Venom shot scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30825;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14433) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Insane ferocity scroll"; //Name
            class8.aByteArray178 = "Its an Insane ferocity scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30701;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14434) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Healing aura scroll"; //Name
            class8.aByteArray178 = "Its an Healing aura scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30725;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14435) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Winter storage scroll"; //Name
            class8.aByteArray178 = "Its an Winter storage scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30768;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14436) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Oph. incubation scroll"; //Name
            class8.aByteArray178 = "Its an Oph. incubation scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30742;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14437) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Magic focus scroll"; //Name
            class8.aByteArray178 = "Its an Magic focus scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30803;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14438) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Swallow whole scroll"; //Name
            class8.aByteArray178 = "Its an Swallow whole scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30767;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14439) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Testudo scroll"; //Name
            class8.aByteArray178 = "Its an Testudo scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30734;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14440) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Generate compost scroll"; //Name
            class8.aByteArray178 = "Its an Generate compost scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30828;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14441) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Tireless run scroll"; //Name
            class8.aByteArray178 = "Its an Tireless run scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30679;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14442) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Regrowth scroll"; //Name
            class8.aByteArray178 = "Its an Regrowth scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30626;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14443) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Call to arms scroll"; //Name
            class8.aByteArray178 = "Its an Call to arms scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30706;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14444) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Blood drain scroll"; //Name
            class8.aByteArray178 = "Its an Blood drain scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30678;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14445) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Dreadfowl strike scroll"; //Name
            class8.aByteArray178 = "Its an Dreadfowl strike scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30771;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14446) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Sandstorm scroll"; //Name
            class8.aByteArray178 = "Its an Sandstorm scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30744;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14447) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Vampyre touch scroll"; //Name
            class8.aByteArray178 = "Its an Vampyre touch scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30707;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14448) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Evil flames scroll"; //Name
            class8.aByteArray178 = "Its an Evil flames scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30638;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }



        if(i == 14449) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Crushing claw scroll"; //Name
            class8.aByteArray178 = "Its an Crushing claw scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30646;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14450) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Mantis strike scroll"; //Name
            class8.aByteArray178 = "Its an Mantis strike scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30805;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14451) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Arctic blast scroll"; //Name
            class8.aByteArray178 = "Its an Arctic blast scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30745;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14452) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Toad bark scroll"; //Name
            class8.aByteArray178 = "Its an Toad bark scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30822;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14453) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Dissolve scroll"; //Name
            class8.aByteArray178 = "Its an Dissolve scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30784;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14454) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Abyssal drain scroll"; //Name
            class8.aByteArray178 = "Its an Abyssal drain scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30782;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14455) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Doomsphere scroll"; //Name
            class8.aByteArray178 = "Its an Doomsphere scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30778;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14456) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Spike shot scroll"; //Name
            class8.aByteArray178 = "Its an Spike shot scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30763;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14457) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Acorn missile scroll"; //Name
            class8.aByteArray178 = "Its an Acorn missile scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30587;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14458) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Petrifying gaze scroll"; //Name
            class8.aByteArray178 = "Its an Petrifying gaze scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30641;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14459) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Slime spray scroll"; //Name
            class8.aByteArray178 = "Its an Slime spray scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30729;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14460) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Electric lash scroll"; //Name
            class8.aByteArray178 = "Its an Electric lash scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30741;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14461) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Bronze bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Bronze bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 5656;
            class8.originalModelColors[1] = 5652;
            class8.originalModelColors[2] = 5904;
            class8.originalModelColors[3] = 6674;
            class8.originalModelColors[4] = 6798;
            class8.originalModelColors[5] = 7050;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14462) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Iron bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Iron bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 37;
            class8.originalModelColors[1] = 33;
            class8.originalModelColors[2] = 28;
            class8.originalModelColors[3] = 20;
            class8.originalModelColors[4] = 16;
            class8.originalModelColors[5] = 12;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14463) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Steel bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Steel bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 70;
            class8.originalModelColors[1] = 66;
            class8.originalModelColors[2] = 61;
            class8.originalModelColors[3] = 41;
            class8.originalModelColors[4] = 37;
            class8.originalModelColors[5] = 33;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14464) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Mith bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Mith bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 43173;
            class8.originalModelColors[1] = 43297;
            class8.originalModelColors[2] = 43292;
            class8.originalModelColors[3] = 43292;
            class8.originalModelColors[4] = 43288;
            class8.originalModelColors[5] = 43412;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14465) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Addy bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Addy bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 21667;
            class8.originalModelColors[1] = 21662;
            class8.originalModelColors[2] = 21658;
            class8.originalModelColors[3] = 21656;
            class8.originalModelColors[4] = 21652;
            class8.originalModelColors[5] = 21776;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14466) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Rune bull rush scroll"; //Name
            class8.aByteArray178 = "Its an Rune bull rush scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 7362;
            class8.modifiedModelColors[1] = 7357;
            class8.modifiedModelColors[2] = 8367;
            class8.modifiedModelColors[3] = 7339;
            class8.modifiedModelColors[4] = 7335;
            class8.modifiedModelColors[5] = 7331;
            class8.originalModelColors[0] = 36137;
            class8.originalModelColors[1] = 36133;
            class8.originalModelColors[2] = 36257;
            class8.originalModelColors[3] = 36372;
            class8.originalModelColors[4] = 36624;
            class8.originalModelColors[5] = 36748;
            class8.modelId = 30791;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14467) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Poisonous blast scroll"; //Name
            class8.aByteArray178 = "Its an Poisonous blast scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30714;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }


        if(i == 14468) //ID
        {
            class8.aStringArray189 = new String[5];
//	class8.aStringArray189[1] = "Wear";
            class8.name = "Dust cloud scroll"; //Name
            class8.aByteArray178 = "Its an Dust cloud scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30817;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = true;
        }

        if(i == 14469) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Hatchling dragon"; //Name
            class8.aByteArray178 = "Its an Hatchling dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30540;
            class8.anInt181 = 720;
            class8.anInt190 = 3;
            class8.anInt198 = 1724;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14470) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby dragon"; //Name
            class8.aByteArray178 = "Its an Baby dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30569;
            class8.anInt181 = 1104;
            class8.anInt190 = 1985;
            class8.anInt198 = 1793;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -11;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14471) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Hatchling dragon"; //Name
            class8.aByteArray178 = "Its an Hatchling dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.originalModelColors[0] = 41385;
            class8.originalModelColors[1] = 41381;
            class8.originalModelColors[2] = 41505;
            class8.originalModelColors[3] = 41500;
            class8.modelId = 30540;
            class8.anInt181 = 720;
            class8.anInt190 = 3;
            class8.anInt198 = 1724;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14472) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby dragon"; //Name
            class8.aByteArray178 = "Its an Baby dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.modifiedModelColors[4] = 5206;
            class8.originalModelColors[0] = 41385;
            class8.originalModelColors[1] = 41381;
            class8.originalModelColors[2] = 41505;
            class8.originalModelColors[3] = 41500;
            class8.originalModelColors[4] = 10446;
            class8.modelId = 30569;
            class8.anInt181 = 1104;
            class8.anInt190 = 1985;
            class8.anInt198 = 1793;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -11;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14473) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Hatchling dragon"; //Name
            class8.aByteArray178 = "Its an Hatchling dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.originalModelColors[0] = 16681;
            class8.originalModelColors[1] = 16677;
            class8.originalModelColors[2] = 16801;
            class8.originalModelColors[3] = 16796;
            class8.modelId = 30540;
            class8.anInt181 = 720;
            class8.anInt190 = 3;
            class8.anInt198 = 1724;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14474) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby dragon"; //Name
            class8.aByteArray178 = "Its an Baby dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.modifiedModelColors[4] = 5206;
            class8.originalModelColors[0] = 16681;
            class8.originalModelColors[1] = 16677;
            class8.originalModelColors[2] = 16801;
            class8.originalModelColors[3] = 16796;
            class8.originalModelColors[4] = 8396;
            class8.modelId = 30569;
            class8.anInt181 = 1104;
            class8.anInt190 = 1985;
            class8.anInt198 = 1793;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -11;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14475) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Hatchling dragon"; //Name
            class8.aByteArray178 = "Its an Hatchling dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.originalModelColors[0] = 43150;
            class8.originalModelColors[1] = 43146;
            class8.originalModelColors[2] = 43270;
            class8.originalModelColors[3] = 43906;
            class8.modelId = 30540;
            class8.anInt181 = 720;
            class8.anInt190 = 3;
            class8.anInt198 = 1724;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14476) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby dragon"; //Name
            class8.aByteArray178 = "Its an Baby dragon".getBytes(); //Description
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modifiedModelColors[0] = 1814;
            class8.modifiedModelColors[1] = 1938;
            class8.modifiedModelColors[2] = 912;
            class8.modifiedModelColors[3] = 910;
            class8.modifiedModelColors[4] = 5206;
            class8.originalModelColors[0] = 43150;
            class8.originalModelColors[1] = 43146;
            class8.originalModelColors[2] = 43270;
            class8.originalModelColors[3] = 43906;
            class8.originalModelColors[4] = 54311;
            class8.modelId = 30569;
            class8.anInt181 = 1104;
            class8.anInt190 = 1985;
            class8.anInt198 = 1793;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -11;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14477) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Red dragon egg"; //Name
            class8.aByteArray178 = "Its an Red dragon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 21706;
            class8.modifiedModelColors[1] = 21702;
            class8.modifiedModelColors[2] = 21693;
            class8.modifiedModelColors[3] = 21685;
            class8.originalModelColors[0] = 1690;
            class8.originalModelColors[1] = 1814;
            class8.originalModelColors[2] = 1938;
            class8.originalModelColors[3] = 910;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14478) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Blue dragon egg"; //Name
            class8.aByteArray178 = "Its an Blue dragon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 21706;
            class8.modifiedModelColors[1] = 21702;
            class8.modifiedModelColors[2] = 21693;
            class8.modifiedModelColors[3] = 21685;
            class8.originalModelColors[0] = 41505;
            class8.originalModelColors[1] = 41500;
            class8.originalModelColors[2] = 41624;
            class8.originalModelColors[3] = 41748;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14479) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Green dragon egg"; //Name
            class8.aByteArray178 = "Its an Green dragon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 21706;
            class8.modifiedModelColors[1] = 21702;
            class8.modifiedModelColors[2] = 21693;
            class8.modifiedModelColors[3] = 21685;
            class8.originalModelColors[0] = 16677;
            class8.originalModelColors[1] = 16801;
            class8.originalModelColors[2] = 16796;
            class8.originalModelColors[3] = 16920;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14480) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Black dragon egg"; //Name
            class8.aByteArray178 = "Its an Black dragon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 21706;
            class8.modifiedModelColors[1] = 21702;
            class8.modifiedModelColors[2] = 21693;
            class8.modifiedModelColors[3] = 21685;
            class8.originalModelColors[0] = 20;
            class8.originalModelColors[1] = 12;
            class8.originalModelColors[2] = 8;
            class8.originalModelColors[3] = 1;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14481) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby penguin"; //Name
            class8.aByteArray178 = "Its an Baby penguin".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30566;
            class8.anInt181 = 2476;
            class8.anInt190 = 138;
            class8.anInt198 = 1754;
            class8.anInt204 = 0;
            class8.anInt169 = 16;
            class8.anInt194 = -58;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14482) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Penguin"; //Name
            class8.aByteArray178 = "Its an Penguin".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30554;
            class8.anInt181 = 2476;
            class8.anInt190 = 138;
            class8.anInt198 = 1754;
            class8.anInt204 = 0;
            class8.anInt169 = 20;
            class8.anInt194 = -58;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14483) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Penguin egg"; //Name
            class8.aByteArray178 = "Its an Penguin egg".getBytes(); //Description
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 21706;
            class8.modifiedModelColors[1] = 21702;
            class8.modifiedModelColors[2] = 21693;
            class8.modifiedModelColors[3] = 21685;
            class8.originalModelColors[0] = 10343;
            class8.originalModelColors[1] = 10337;
            class8.originalModelColors[2] = 33;
            class8.originalModelColors[3] = 28;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14484) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Raven chick"; //Name
            class8.aByteArray178 = "Its an Raven chick".getBytes(); //Description
            class8.modifiedModelColors = new int[5];
            class8.originalModelColors = new int[5];
            class8.modifiedModelColors[0] = 8410;
            class8.modifiedModelColors[1] = 8414;
            class8.modifiedModelColors[2] = 9445;
            class8.modifiedModelColors[3] = 9028;
            class8.modifiedModelColors[4] = 9164;
            class8.originalModelColors[0] = 43045;
            class8.originalModelColors[1] = 43053;
            class8.originalModelColors[2] = 43057;
            class8.originalModelColors[3] = 7364;
            class8.originalModelColors[4] = 7364;
            class8.modelId = 30550;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 9;
            class8.anInt194 = -19;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14485) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Raven"; //Name
            class8.aByteArray178 = "Its an Raven".getBytes(); //Description
            class8.modifiedModelColors = new int[6];
            class8.originalModelColors = new int[6];
            class8.modifiedModelColors[0] = 43069;
            class8.modifiedModelColors[1] = 43065;
            class8.modifiedModelColors[2] = 43061;
            class8.modifiedModelColors[3] = 43057;
            class8.modifiedModelColors[4] = 43053;
            class8.modifiedModelColors[5] = 43045;
            class8.originalModelColors[0] = 43034;
            class8.originalModelColors[1] = 43030;
            class8.originalModelColors[2] = 43026;
            class8.originalModelColors[3] = 43150;
            class8.originalModelColors[4] = 43146;
            class8.originalModelColors[5] = 43022;
            class8.modelId = 30545;
            class8.anInt181 = 2000;
            class8.anInt190 = 2030;
            class8.anInt198 = 1844;
            class8.anInt204 = 0;
            class8.anInt169 = 13;
            class8.anInt194 = -35;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14486) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby raccoon"; //Name
            class8.aByteArray178 = "Its an Baby raccoon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30556;
            class8.anInt181 = 1438;
            class8.anInt190 = 75;
            class8.anInt198 = 1985;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -18;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14487) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Raccoon"; //Name
            class8.aByteArray178 = "Its an Raccoon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30556;
            class8.anInt181 = 1178;
            class8.anInt190 = 78;
            class8.anInt198 = 1952;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -18;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14488) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby gecko"; //Name
            class8.aByteArray178 = "Its an Baby gecko".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30543;
            class8.anInt181 = 1829;
            class8.anInt190 = 13;
            class8.anInt198 = 1832;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = -22;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14489) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Gecko"; //Name
            class8.aByteArray178 = "Its an Gecko".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30543;
            class8.anInt181 = 1957;
            class8.anInt190 = 15;
            class8.anInt198 = 1835;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = -22;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14490) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby squirrel"; //Name
            class8.aByteArray178 = "Its an Baby squirrel".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30560;
            class8.anInt181 = 2411;
            class8.anInt190 = 2033;
            class8.anInt198 = 1829;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -24;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14491) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Squirrel"; //Name
            class8.aByteArray178 = "Its an Squirrel".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30560;
            class8.anInt181 = 1892;
            class8.anInt190 = 2033;
            class8.anInt198 = 1829;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -24;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14492) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby chameleon"; //Name
            class8.aByteArray178 = "Its an Baby chameleon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30546;
            class8.anInt181 = 2000;
            class8.anInt190 = 18;
            class8.anInt198 = 1765;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = -18;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14493) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Chameleon"; //Name
            class8.aByteArray178 = "Its an Chameleon".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30546;
            class8.anInt181 = 1488;
            class8.anInt190 = 2039;
            class8.anInt198 = 1741;
            class8.anInt204 = 0;
            class8.anInt169 = 8;
            class8.anInt194 = -18;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14494) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Chameleon egg"; //Name
            class8.aByteArray178 = "Its an Chameleon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14495) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Chameleon egg"; //Name
            class8.aByteArray178 = "Its an Chameleon egg".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30384;
            class8.anInt181 = 663;
            class8.anInt190 = 2033;
            class8.anInt198 = 1673;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14496) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby monkey"; //Name
            class8.aByteArray178 = "Its an Baby monkey".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30562;
            class8.anInt181 = 530;
            class8.anInt190 = 55;
            class8.anInt198 = 1812;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14497) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Monkey"; //Name
            class8.aByteArray178 = "Its an Monkey".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30562;
            class8.anInt181 = 465;
            class8.anInt190 = 55;
            class8.anInt198 = 1812;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14498) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Vulture chick"; //Name
            class8.aByteArray178 = "Its an Vulture chick".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 6470;
            class8.originalModelColors[0] = 49;
            class8.modelId = 30548;
            class8.anInt181 = 2384;
            class8.anInt190 = 0;
            class8.anInt198 = 1784;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -17;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14499) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Vulture"; //Name
            class8.aByteArray178 = "Its an Vulture".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 6470;
            class8.originalModelColors[0] = 49;
            class8.modelId = 30548;
            class8.anInt181 = 1616;
            class8.anInt190 = 2006;
            class8.anInt198 = 1781;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -13;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14500) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Baby giant crab"; //Name
            class8.aByteArray178 = "Its an Baby giant crab".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30568;
            class8.anInt181 = 2725;
            class8.anInt190 = 519;
            class8.anInt198 = 306;
            class8.anInt204 = 0;
            class8.anInt169 = -16;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14501) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Giant crab"; //Name
            class8.aByteArray178 = "Its an Giant crab".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30568;
            class8.anInt181 = 1957;
            class8.anInt190 = 519;
            class8.anInt198 = 306;
            class8.anInt204 = 0;
            class8.anInt169 = -18;
            class8.anInt194 = -12;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14502) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Crunchy claw token"; //Name
            class8.aByteArray178 = "Its an Crunchy claw token".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30688;
            class8.anInt181 = 1232;
            class8.anInt190 = 222;
            class8.anInt198 = 2033;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14503) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Saradomin chick"; //Name
            class8.aByteArray178 = "Its an Saradomin chick".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30550;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 9;
            class8.anInt194 = -19;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14504) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Saradomin bird"; //Name
            class8.aByteArray178 = "Its an Saradomin bird".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 23085;
            class8.modifiedModelColors[1] = 23205;
            class8.modifiedModelColors[2] = 23324;
            class8.originalModelColors[0] = 38214;
            class8.originalModelColors[1] = 38205;
            class8.originalModelColors[2] = 38325;
            class8.modelId = 30563;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -30;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14505) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Saradomin owl"; //Name
            class8.aByteArray178 = "Its an Saradomin owl".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30567;
            class8.anInt181 = 2346;
            class8.anInt190 = 2047;
            class8.anInt198 = 1909;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -41;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14506) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Zamorak chick"; //Name
            class8.aByteArray178 = "Its an Zamorak chick".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30550;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 9;
            class8.anInt194 = -19;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14507) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Zamorak bird"; //Name
            class8.aByteArray178 = "Its an Zamorak bird".getBytes(); //Description
            class8.modifiedModelColors = new int[3];
            class8.originalModelColors = new int[3];
            class8.modifiedModelColors[0] = 23085;
            class8.modifiedModelColors[1] = 23205;
            class8.modifiedModelColors[2] = 23324;
            class8.originalModelColors[0] = 786;
            class8.originalModelColors[1] = 908;
            class8.originalModelColors[2] = 906;
            class8.modelId = 30563;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -30;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14508) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Zamorak hawk"; //Name
            class8.aByteArray178 = "Its an Zamorak hawk".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30541;
            class8.anInt181 = 1697;
            class8.anInt190 = 2018;
            class8.anInt198 = 1853;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -23;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14509) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Guthix chick"; //Name
            class8.aByteArray178 = "Its an Guthix chick".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30550;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 9;
            class8.anInt194 = -19;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14510) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Guthix bird"; //Name
            class8.aByteArray178 = "Its an Guthix bird".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30563;
            class8.anInt181 = 1616;
            class8.anInt190 = 3;
            class8.anInt198 = 1808;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -30;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14511) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Guthix raptor"; //Name
            class8.aByteArray178 = "Its an Guthix raptor".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30555;
            class8.anInt181 = 1697;
            class8.anInt190 = 2012;
            class8.anInt198 = 1817;
            class8.anInt204 = 0;
            class8.anInt169 = 11;
            class8.anInt194 = -19;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14512) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Terrier puppy"; //Name
            class8.aByteArray178 = "Its an Terrier puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30561;
            class8.anInt181 = 787;
            class8.anInt190 = 60;
            class8.anInt198 = 1826;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -9;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14513) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Terrier"; //Name
            class8.aByteArray178 = "Its an Terrier".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30561;
            class8.anInt181 = 659;
            class8.anInt190 = 60;
            class8.anInt198 = 1826;
            class8.anInt204 = 0;
            class8.anInt169 = -3;
            class8.anInt194 = -9;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14514) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Greyhound puppy"; //Name
            class8.aByteArray178 = "Its an Greyhound puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30547;
            class8.anInt181 = 395;
            class8.anInt190 = 33;
            class8.anInt198 = 1934;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14515) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Greyhound"; //Name
            class8.aByteArray178 = "Its an Greyhound".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30547;
            class8.anInt181 = 345;
            class8.anInt190 = 33;
            class8.anInt198 = 1934;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14516) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Labrador puppy"; //Name
            class8.aByteArray178 = "Its an Labrador puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30564;
            class8.anInt181 = 724;
            class8.anInt190 = 2045;
            class8.anInt198 = 1829;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14517) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Labrador"; //Name
            class8.aByteArray178 = "Its an Labrador".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30564;
            class8.anInt181 = 595;
            class8.anInt190 = 2045;
            class8.anInt198 = 1829;
            class8.anInt204 = 0;
            class8.anInt169 = 5;
            class8.anInt194 = -5;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14518) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Dalmatian puppy"; //Name
            class8.aByteArray178 = "Its an Dalmatian puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30542;
            class8.anInt181 = 465;
            class8.anInt190 = 153;
            class8.anInt198 = 1949;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14519) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Dalmatian"; //Name
            class8.aByteArray178 = "Its an Dalmatian".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30542;
            class8.anInt181 = 400;
            class8.anInt190 = 153;
            class8.anInt198 = 1949;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14520) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Sheepdog puppy"; //Name
            class8.aByteArray178 = "Its an Sheepdog puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30557;
            class8.anInt181 = 854;
            class8.anInt190 = 39;
            class8.anInt198 = 1907;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -9;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14521) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Sheepdog"; //Name
            class8.aByteArray178 = "Its an Sheepdog".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30557;
            class8.anInt181 = 720;
            class8.anInt190 = 39;
            class8.anInt198 = 1907;
            class8.anInt204 = 0;
            class8.anInt169 = 7;
            class8.anInt194 = -9;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14522) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Bulldog puppy"; //Name
            class8.aByteArray178 = "Its an Bulldog puppy".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30551;
            class8.anInt181 = 530;
            class8.anInt190 = 21;
            class8.anInt198 = 1937;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -4;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14523) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Bulldog"; //Name
            class8.aByteArray178 = "Its an Bulldog".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30551;
            class8.anInt181 = 464;
            class8.anInt190 = 21;
            class8.anInt198 = 1937;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = -4;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14524) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Summoning cape"; //Name
            class8.aByteArray178 = "Its an Summoning cape".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 57280;
            class8.modifiedModelColors[1] = 54183;
            class8.originalModelColors[0] = 38119;
            class8.originalModelColors[1] = 127;
            class8.modelId = 31094;
            class8.anInt181 = 2128;
            class8.anInt190 = 504;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 31629;
            class8.anInt200 = 31562;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14525) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Pouch"; //Name
            class8.aByteArray178 = "Its an Pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30826;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14526) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Spirit wolf pouch"; //Name
            class8.aByteArray178 = "Its an Spirit wolf pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30591;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14529) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Howl scroll"; //Name
            class8.aByteArray178 = "Its an Howl scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30796;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14530) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Spirit shards"; //Name
            class8.aByteArray178 = "Its an Spirit shards".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31279;
            class8.anInt181 = 1308;
            class8.anInt190 = 553;
            class8.anInt198 = 1950;
            class8.anInt204 = 0;
            class8.anInt169 = 3;
            class8.anInt194 = 1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 12527) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Gold charm"; //Name
            class8.aByteArray178 = "Its an Gold charm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 31553;
            class8.anInt181 = 550;
            class8.anInt190 = 512;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 0;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }

        if(i == 14531) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Ibis pouch"; //Name
            class8.aByteArray178 = "Its an Ibis pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30700;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 14532) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Ibis pouch"; //Name
            class8.aByteArray178 = "Its an Ibis pouch".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 2429;
            class8.anInt181 = 760;
            class8.anInt190 = 552;
            class8.anInt198 = 28;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 2;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        return class8;
    }

    public static Class8 method198_4(int i, Class8 class8)
    {
        if(i == 14533) //ID
        {
            class8.aStringArray189 = new String[5];
            //class8.aStringArray189[1] = "Wear";
            class8.name = "Stony shell scroll"; //Name
            class8.aByteArray178 = "Its an Stony shell scroll".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 0;
            class8.originalModelColors[0] = 1;
            class8.modelId = 30677;
            class8.anInt181 = 1049;
            class8.anInt190 = 545;
            class8.anInt198 = 1033;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 3;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
        if(i == 10826) //ID
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.name = "Fremennik round shield"; //Name
            class8.aByteArray178 = "Its an Fremennik round shield".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 9525;
            class8.modifiedModelColors[1] = 9517;
            class8.originalModelColors[0] = 9659;
            class8.originalModelColors[1] = 9651;
            class8.modelId = 21960;
            class8.anInt181 = 1632;
            class8.anInt190 = 609;
            class8.anInt198 = 954;
            class8.anInt204 = 28;
            class8.anInt169 = 0;
            class8.anInt194 = 1;
            class8.anInt165 = 19335;
            class8.anInt200 = 19335;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
        if(i == 9124)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 11058;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Off-yellow whip";
            class8.aByteArray178 = "Its an Off-yellow whip".getBytes();
        }
        if(i == 9125)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 19763;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Off-green whip";
            class8.aByteArray178 = "Its an Off-green whip".getBytes();
        }
        if(i == 9126)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 26419;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Teal whip";
            class8.aByteArray178 = "Its an Teal whip".getBytes();
        }
        if(i == 9127)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 528;
            class8.originalModelColors[0] = 38709;
            class8.modelId = 5412;
            class8.anInt181 = 840;
            class8.anInt190 = 280;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -2;
            class8.anInt194 = 56;
            class8.anInt165 = 5409;
            class8.anInt200 = 5409;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Blueer whip";
            class8.aByteArray178 = "Its an Blueer whip".getBytes();
        }
			/*if(i == 14718) //ID
		{
			class8.aStringArray189 = new String[5];
			class8.aStringArray189[1] = "Wear";
			class8.aString170 = "Crystal greataxe"; //Name
			class8.aByteArray178 = "Its an Crystal greataxe".getBytes(); //Description
			class8.anIntArray156 = new int[1];
			class8.anIntArray160 = new int[1];
			class8.anIntArray156[0] = 10291;
			class8.anIntArray160[0] = 10291;
			class8.anInt174 = 6579;
			class8.anInt181 = 1710;
			class8.anInt190 = 280;
			class8.anInt198 = 2004;
			class8.anInt204 = 0;
			class8.anInt169 = 0;
			class8.anInt194 = 51;
			class8.anInt165 = 96702;
			class8.anInt200 = 96702;
			class8.anInt188 = -1;
			class8.anInt164 = -1;
			class8.anInt175 = -1;
			class8.anInt197 = -1;
		}*/
        if(i == 12765)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.originalModelColors = new int[] { 10417, 18983, 24988, 23958, 27144 };
            class8.modifiedModelColors = new int[] { 1571, 1575, 1436, 2454, 2576 };
            class8.modelId = 4676; //Model ID
            class8.anInt181 = 2128;//Model Zoom
            class8.anInt190 = 591;//Model Rotation
            class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 8;// model offset increase to move to the right
            class8.anInt194 = 11;//model offset increase to move up
            class8.anInt165 = 4677;//male wearing
            class8.anInt200 = 4677;//female wearing
            class8.anInt175 = -1;//Unknown
            class8.aBoolean176 = false;//Stackable//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Dark bow";//Name of the new item
            class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
        if(i == 12766)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.originalModelColors = new int[] { -30173, -28121, -29284, -27116, -24048 };
            class8.modifiedModelColors = new int[] { 1571, 1575, 1436, 2454, 2576 };
            class8.modelId = 4676; //Model ID
            class8.anInt181 = 2128;//Model Zoom
            class8.anInt190 = 591;//Model Rotation
            class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 8;// model offset increase to move to the right
            class8.anInt194 = 11;//model offset increase to move up
            class8.anInt165 = 4677;//male wearing
            class8.anInt200 = 4677;//female wearing
            class8.anInt175 = -1;//Unknown
            class8.aBoolean176 = false;//Stackable//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Dark bow";//Name of the new item
            class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
        if(i == 12767)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.originalModelColors = new int[] { 10834, 10586, 12700, 8724, 5648 };
            class8.modifiedModelColors = new int[] { 1571, 1575, 1436, 2454, 2576 };
            class8.modelId = 4676; //Model ID
            class8.anInt181 = 2128;//Model Zoom
            class8.anInt190 = 591;//Model Rotation
            class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 8;// model offset increase to move to the right
            class8.anInt194 = 11;//model offset increase to move up
            class8.anInt165 = 4677;//male wearing
            class8.anInt200 = 4677;//female wearing
            class8.anInt175 = -1;//Unknown
            class8.aBoolean176 = false;//Stackable//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Dark bow";//Name of the new item
            class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
        if(i == 12768)  // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";//New option
            class8.originalModelColors = new int[] { 103, 90, 10324, 61, 28 };
            class8.modifiedModelColors = new int[] { 1571, 1575, 1436, 2454, 2576 };
            class8.modelId = 4676; //Model ID
            class8.anInt181 = 2128;//Model Zoom
            class8.anInt190 = 591;//Model Rotation
            class8.anInt198 = 1034;//model rotate side ways increase to move right in circle
            class8.anInt204 = 138;//Unknown
            class8.anInt199 = -1;//noteable
            class8.anInt169 = 8;// model offset increase to move to the right
            class8.anInt194 = 11;//model offset increase to move up
            class8.anInt165 = 4677;//male wearing
            class8.anInt200 = 4677;//female wearing
            class8.anInt175 = -1;//Unknown
            class8.aBoolean176 = false;//Stackable//Unknown
            class8.anInt164 = -1;//Female arms/sleeves
            class8.anInt188 = -1;//male arms/sleeves
            class8.aBoolean176 = false;//Stackable
            class8.name = "Dark bow";//Name of the new item
            class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
        if(i == 22220)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 57034;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 57034;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 57034;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 57034;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22221)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 42673;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 42673;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 42673;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 42673;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22222)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 53936;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 53936;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 53936;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 53936;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22223)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 64181;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 64181;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 64181;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 64181;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22224)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 20771;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 20771;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 20771;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 20771;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22225)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 48674;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 48674;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 48674;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 48674;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22226)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 56373;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 56373;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 56373;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 56373;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22227)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 13869;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 13869;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 13869;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 13869;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 22228)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.modifiedModelColors = new int[4];
            class8.originalModelColors = new int[4];
            class8.modifiedModelColors[0] = 126;
            class8.originalModelColors[0] = 926;
            class8.modifiedModelColors[1] = 110;
            class8.originalModelColors[1] = 926;
            class8.modifiedModelColors[2] = 1142;
            class8.originalModelColors[2] = 926;
            class8.modifiedModelColors[3] = 102;
            class8.originalModelColors[3] = 926;
            class8.modelId = 12020;
            class8.anInt181 = 1000;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt165 = 12021;
            class8.anInt200 = 12022;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 13121)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Teleport", null, "Destroy" };
            //class8.anIntArray160 = new int[] {  7114, 7104  };
            // class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29122;
            class8.anInt181 = 1950;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 4;
            class8.anInt165 = 28202;
            class8.anInt200 = 29049;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Ardougne cloak 1";
            class8.aByteArray178 = "an Ardougne cloak 1 from osrs".getBytes();
        }

        if(i == 13122)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Teleport", null, "Destroy" };
            //class8.anIntArray160 = new int[] {  7114, 7104  };
            // class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29144;
            class8.anInt181 = 1950;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 4;
            class8.anInt165 = 28199;
            class8.anInt200 = 29048;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Ardougne cloak 2";
            class8.aByteArray178 = "an Ardougne cloak 2 from osrs".getBytes();
        }
        if(i == 13123)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Teleport", null, "Destroy" };
            //class8.anIntArray160 = new int[] {  7114, 7104  };
            // class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29163;
            class8.anInt181 = 1950;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 4;
            class8.anInt165 = 28200;
            class8.anInt200 = 29050;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Ardougne cloak 3";
            class8.aByteArray178 = "an Ardougne cloak 3 from osrs".getBytes();
        }
        if(i == 13124)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Teleport", null, "Destroy" };
            //class8.anIntArray160 = new int[] {  7114, 7104  };
            // class8.anIntArray156 = new int[] { 61, 5400 };
            class8.modelId = 29156;
            class8.anInt181 = 1950;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = 4;
            class8.anInt194 = 4;
            class8.anInt165 = 28201;
            class8.anInt200 = 29052;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Ardougne cloak 4";
            class8.aByteArray178 = "an Ardougne cloak 4 from osrs".getBytes();
        }
        if(i == 13117)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Recharge-prayer", null, "Destroy" };
            class8.originalModelColors = new int[] { -29403, 7054 };
            class8.modifiedModelColors = new int[] { 61, 57 };
            class8.modelId = 29131;
            class8.anInt181 = 1100;
            class8.anInt190 = 500;
            class8.anInt198 = 600;
            class8.anInt204 = 0;
            class8.anInt169 = 1;
            class8.anInt194 = 1;
            class8.anInt165 = 29090;
            class8.anInt200 = 29082;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Falador shield 1";
            class8.aByteArray178 = "an Falador shield 1 from osrs".getBytes();
        }
        if(i == 13118)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Recharge-prayer", null, "Destroy" };
            class8.originalModelColors = new int[] { -29403, 7054 };
            class8.modifiedModelColors = new int[] { 61, 57 };
            class8.modelId = 29139;
            class8.anInt181 = 1500;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -5;
            class8.anInt165 = 29084;
            class8.anInt200 = 29079;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Falador shield 2";
            class8.aByteArray178 = "an Falador shield 2 from osrs".getBytes();
        }
        if(i == 13119)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Recharge-prayer", null, "Destroy" };
            //class8.anIntArray160 = new int[] { -29403, 7054 };
            //  class8.anIntArray156 = new int[] { 61, 57 };
            class8.modelId = 29132;
            class8.anInt181 = 1500;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = -5;
            class8.anInt194 = 1;
            class8.anInt165 = 29074;
            class8.anInt200 = 29077;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Falador shield 3";
            class8.aByteArray178 = "an Falador shield 2 from osrs".getBytes();
        }
        if(i == 13120)
        {
            class8.aStringArray189 = new String[] { null, "Wear", "Recharge-prayer", null, "Destroy" };
            //class8.anIntArray160 = new int[] { -29403, 7054 };
            //  class8.anIntArray156 = new int[] { 61, 57 };
            class8.modelId = 29162;
            class8.anInt181 = 1600;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -4;
            class8.anInt165 = 29086;
            class8.anInt200 = 29089;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Falador shield 4";
            class8.aByteArray178 = "an Falador shield 4 from osrs".getBytes();
        }
        if(i == 17120)
        {
            class8.aStringArray189 = new String[] { null, "Wear", null, null, "Drop" };
            //class8.anIntArray160 = new int[] { -29403, 7054 };
            //  class8.anIntArray156 = new int[] { 61, 57 };
            class8.modelId = 95624;
            class8.anInt181 = 1600;
            class8.anInt190 = 500;
            class8.anInt198 = 250;
            class8.anInt204 = 0;
            class8.anInt169 = -4;
            class8.anInt194 = -4;
            class8.anInt165 = 95625;
            class8.anInt200 = 95625;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aBoolean176 = false;
            class8.name = "Deku Shield";
            class8.aByteArray178 = "The Sheild from zelda.".getBytes();
        }
        if(i == 9542)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modifiedModelColors = new int[0];
            class8.originalModelColors = new int[0];
            class8.modelId = 93084;
            class8.anInt181 = 1957;
            class8.anInt190 = 498;
            class8.anInt198 = 484;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.anInt165 = 93083;
            class8.anInt200 = 13083;
            class8.aBoolean176 = false;
            class8.name = "Masamune";
            class8.aByteArray178 = "Auron's Celestial Weapon: The Masamune".getBytes();
        }
        if(i == 15690) //Hylian Shield
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.name = "Hylian Shield";
            class8.aByteArray178 = "The Hylian Shield from Zelda. - Brian F".getBytes();
            class8.modelId = 93717; //Drop Model - for Inventory also
            class8.anInt181 = 1560; //Zoom - Increase to make smaller
            class8.anInt190 = 500; //Model rotate Up+Down - Increase to move Down away from you
            class8.anInt198 = 500; //Model rotate Side-Ways - Increase to move Right in Circle
            class8.anInt204 = 0;
            class8.anInt169 = 0; //Model Offset - Increase to move to the Right
            class8.anInt194 = 0; //Model Offset - Increase to move Up
            class8.anInt165 = 93718; //Male Wield
            class8.anInt200 = 93719; //Female Wield
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
        //Cat mask
        if (i == 15404) {
            class8.name = "Cat mask";
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[4] = "Drop";
            class8.modelId = 33312;
            class8.anInt165 = 33342;
            class8.anInt188 = -1;
            class8.anInt202 = 0;
            class8.aBoolean176 = false;
            class8.anInt198 = 1808;
            class8.anInt181 = 595;
            class8.anInt155 = 800;
            class8.anInt200 = 33348;
            class8.anInt164 = -1;
            class8.anInt169 = -5;
            class8.anInt204 = 0;
            class8.anInt194 = -3;
            class8.anInt179 = 13114;
            class8.anInt190 = 108;
            class8.aByteArray178 = "It's a Cat mask.".getBytes();
        }
        //Bat mask
        if (i == 15405) {
            class8.name = "Bat mask";
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[4] = "Drop";
            class8.modelId = 33316;
            class8.anInt165 = 33339;
            class8.anInt188 = 215;
            class8.anInt202 = 0;
            class8.aBoolean176 = false;
            class8.anInt198 = 1830;
            class8.anInt181 = 1178;
            class8.anInt155 = 800;
            class8.anInt200 = 33344;
            class8.anInt164 = 391;
            class8.anInt169 = -3;
            class8.anInt204 = 0;
            class8.anInt194 = 1;
            class8.anInt179 = 13112;
            class8.anInt190 = 83;
            class8.aByteArray178 = "It's a Bat mask.".getBytes();
        }
        //Sheep mask
        if (i == 15406) {
            class8.name = "Sheep mask";
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[4] = "Drop";
            class8.modelId = 33308;
            class8.anInt165 = 33340;
            class8.anInt188 = -1;
            class8.anInt202 = 0;
            class8.aBoolean176 = false;
            class8.anInt198 = 1836;
            class8.anInt181 = 738;
            class8.anInt155 = 800;
            class8.anInt200 = 33349;
            class8.anInt164 = -1;
            class8.anInt169 = -3;
            class8.anInt204 = 0;
            class8.anInt194 = 1;
            class8.anInt179 = 13108;
            class8.anInt190 = 29;
            class8.aByteArray178 = "It's a Sheep mask.".getBytes();
        }
        //wolf mask
        if (i == 15407) {
            class8.name = "Wolf mask";
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[4] = "Drop";
            class8.modelId = 33309;
            class8.anInt165 = 33341;
            class8.anInt188 = -1;
            class8.anInt202 = 0;
            class8.aBoolean176 = false;
            class8.anInt198 = 1877;
            class8.anInt181 = 595;
            class8.anInt155 = 800;
            class8.anInt200 = 33350;
            class8.anInt164 = -1;
            class8.anInt169 = -3;
            class8.anInt204 = 0;
            class8.anInt194 = -4;
            class8.anInt179 = 13116;
            class8.anInt190 = 54;
            class8.aByteArray178 = "It's a Wolf mask.".getBytes();
        }
        if(i == 9030)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 94008;
            class8.anInt181 = 1670;
            class8.anInt190 = 336;
            class8.anInt198 = 64;
            class8.anInt204 = 97;
            class8.anInt169 = 3;
            class8.anInt194 = 37;
            class8.anInt165 = 94009;
            class8.anInt200 = 94009;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Broom";
            class8.aByteArray178 = "Threat to dusty corners everywhere.".getBytes();
        }
        if(i == 15241)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.modelId = 48512;
            class8.anInt181 = 1579;
            class8.anInt190 = 539;
            class8.anInt198 = 1805;
            class8.anInt204 = 0;
            class8.anInt169 = -13;
            class8.anInt194 = 11;
            class8.anInt165 = 48465;
            class8.anInt200 = 48465;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.name = "Hand cannon";
            class8.aByteArray178 = "it goes boom!".getBytes();
        }


        if(i == 199) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy guam"; //Name
            class8.aByteArray178 = "Its an Grimy guam".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 22428;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
        if(i == 201) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy marrentill"; //Name
            class8.aByteArray178 = "Its an Grimy marrentill".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 22433;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 203) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy tarromin"; //Name
            class8.aByteArray178 = "Its an Grimy tarromin".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 25505;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 205) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy harralander"; //Name
            class8.aByteArray178 = "Its an Grimy harralander".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 16289;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 207) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy ranarr"; //Name
            class8.aByteArray178 = "Its an Grimy ranarr".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 17304;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 209) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy irit"; //Name
            class8.aByteArray178 = "Its an Grimy irit".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 17961;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 211) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy avantoe"; //Name
            class8.aByteArray178 = "Its an Grimy avantoe".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 24342;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 213) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy kwuarm"; //Name
            class8.aByteArray178 = "Its an Grimy kwuarm".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 13204;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 215) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy cadantine"; //Name
            class8.aByteArray178 = "Its an Grimy cadantine".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 13974;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 217) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy dwarf weed"; //Name
            class8.aByteArray178 = "Its an Grimy dwarf weed".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 22416;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 219) //ID
        {
            class8.aStringArray189 = new String[] {"Clean", null, null, null, "Drop"};
            class8.name = "Grimy torstol"; //Name
            class8.aByteArray178 = "Its an Grimy torstol".getBytes(); //Description
            class8.modifiedModelColors = new int[1];
            class8.originalModelColors = new int[1];
            class8.modifiedModelColors[0] = 22418;
            class8.originalModelColors[0] = 22422;
            class8.modelId = 28853;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
        if(i == 249) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean guam"; //Name
            class8.aByteArray178 = "Its an Clean guam".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 22428;
            class8.originalModelColors[1] = 22418;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 251) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean marrentill"; //Name
            class8.aByteArray178 = "Its an Clean marrentill".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 22433;
            class8.originalModelColors[1] = 22424;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 253) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean tarromin"; //Name
            class8.aByteArray178 = "Its an Clean tarromin".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 25505;
            class8.originalModelColors[1] = 25496;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 255) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean harralander"; //Name
            class8.aByteArray178 = "Its an Clean harralander".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 16289;
            class8.originalModelColors[1] = 13204;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 257) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean ranarr"; //Name
            class8.aByteArray178 = "Its an Clean ranarr".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 17304;
            class8.originalModelColors[1] = 15250;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 259) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean irit"; //Name
            class8.aByteArray178 = "Its an Clean irit".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 17961;
            class8.originalModelColors[1] = 18974;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }


        if(i == 261) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean avantoe"; //Name
            class8.aByteArray178 = "Its an Clean avantoe".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 24342;
            class8.originalModelColors[1] = 25360;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }




        if(i == 263) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean kwuarm"; //Name
            class8.aByteArray178 = "Its an Clean kwuarm".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 13204;
            class8.originalModelColors[1] = 14224;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 265) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean cadantine"; //Name
            class8.aByteArray178 = "Its an Clean cadantine".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 13974;
            class8.originalModelColors[1] = 14866;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 267) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean dwarf weed"; //Name
            class8.aByteArray178 = "Its an Clean dwarf weed".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 22416;
            class8.originalModelColors[1] = 22414;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        if(i == 269) //ID
        {
            class8.aStringArray189 = new String[] {null, null, null, null, "Drop"};
            class8.name = "Clean torstol"; //Name
            class8.aByteArray178 = "Its an Clean torstol".getBytes(); //Description
            class8.modifiedModelColors = new int[2];
            class8.originalModelColors = new int[2];
            class8.modifiedModelColors[0] = 22418;
            class8.modifiedModelColors[1] = 22428;
            class8.originalModelColors[0] = 22422;
            class8.originalModelColors[1] = 22416;
            class8.modelId = 2364;
            class8.anInt181 = 789;
            class8.anInt190 = 581;
            class8.anInt198 = 1770;
            class8.anInt204 = 97;
            class8.anInt169 = 8;
            class8.anInt194 = -1;
            class8.anInt165 = -1;
            class8.anInt200 = -1;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }



        return class8;
    }



    public static void Models(int Ground, int Male, int Female)
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.modelId = Ground;
 class8.anInt165 = Male;
 class8.anInt200 = Female;
 }
 
 public static void NewColor(int Old, int New, int Num)
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.modifiedModelColors[Num] = Old;
 class8.originalModelColors[Num] = New;
 }

 public static void NEO(String Name, String Examine, String Option)// NEO = Name Examine Option
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = Option;
 class8.name = Name;
 class8.aByteArray178 = Examine.getBytes();
 }

 public static void Zoom(int zoom, int X, int Y, int RotateUp, int RotateRight, boolean Stackable) 
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.anInt181 = zoom;
 class8.anInt190 = RotateUp;
 class8.anInt198 = RotateRight;
 class8.anInt169 = Y;
 class8.anInt194 = X;
 class8.aBoolean176 = Stackable;
 }

 public static void Jukkycolors(int old, int neww, int num) {
     Class8 class8 = aClass8Array172[anInt180];
     class8.modifiedModelColors[num] = old;
     class8.originalModelColors[num] = neww;
 }
 public static void Jukkyzoom(int zoom, int rotation, int rotateright, int offsetY, int offsetX, int Brightness, int msc, int msc1, boolean stackable) {
     Class8 class8 = aClass8Array172[anInt180];
     class8.anInt181 = zoom;
     class8.anInt190 = rotation;
     class8.anInt198 = rotateright;
     class8.anInt204 = offsetY;
     class8.anInt169 = offsetX;
     class8.anInt194 = Brightness;
     class8.aBoolean176 = stackable;//Stackable
     class8.anInt175 = msc;//Unknown
     class8.anInt197 = msc1;//Unknown
 }
 public static void Jukkyname(String name, String examine) {
     Class8 class8 = aClass8Array172[anInt180];
     class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
     class8.name = name;
     class8.aByteArray178 = examine.getBytes();
 }
 public static void JukkyModels(int male, int malearms, int female, int femalearms, int dropmdl) {
     Class8 class8 = aClass8Array172[anInt180];
     class8.anInt165 = male;
     class8.anInt188 = malearms;
     class8.anInt200 = female;
     class8.anInt164 = femalearms;
     class8.modelId = dropmdl;
 }
    public void method199(byte byte0)
    {
        Class8 class8 = method198(anInt163);
        modelId = class8.modelId;
        anInt181 = class8.anInt181;
        anInt190 = class8.anInt190;
        anInt198 = class8.anInt198;
        anInt204 = class8.anInt204;
        anInt169 = class8.anInt169;
        anInt194 = class8.anInt194;
        if(byte0 != 61)
            aBoolean186 = !aBoolean186;
        modifiedModelColors = class8.modifiedModelColors;
        originalModelColors = class8.originalModelColors;
        Class8 class8_1 = method198(anInt179);
        name = class8_1.name;
        aBoolean161 = class8_1.aBoolean161;
        anInt155 = class8_1.anInt155;
        String s = "a";
        char c = class8_1.name.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            s = "an";
        aByteArray178 = ("Swap this note at any bank for " + s + " " + class8_1.name + ".").getBytes();
        aBoolean176 = true;
    }

    public static final Class30_Sub2_Sub1_Sub1 method200(int i, int j, int k, int l)
    {
        if(k == 0)
        {
            Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1 = (Class30_Sub2_Sub1_Sub1)aClass12_158.method222(i);
            if(class30_sub2_sub1_sub1 != null && class30_sub2_sub1_sub1.anInt1445 != j && class30_sub2_sub1_sub1.anInt1445 != -1)
            {
                class30_sub2_sub1_sub1.method329();
                class30_sub2_sub1_sub1 = null;
            }
            if(class30_sub2_sub1_sub1 != null)
                return class30_sub2_sub1_sub1;
        }
        Class8 class8 = method198(i);
    	class8 = method198_2(i, class8);
        if(class8.anIntArray193 == null)
            j = -1;
        if(j > 1)
        {
            int i1 = -1;
            for(int j1 = 0; j1 < 10; j1++)
                if(j >= class8.anIntArray201[j1] && class8.anIntArray201[j1] != 0)
                    i1 = class8.anIntArray193[j1];

            if(i1 != -1)
                class8 = method198(i1);
		class8 = method198_2(i, class8);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = class8.method201(1);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_2 = null;
        if(class8.anInt163 != -1)
        {
            class30_sub2_sub1_sub1_2 = method200(class8.anInt179, 10, -1, 9);
            if(class30_sub2_sub1_sub1_2 == null)
                return null;
        }
        Class30_Sub2_Sub1_Sub1 class30_sub2_sub1_sub1_1 = new Class30_Sub2_Sub1_Sub1(32, 32);
        int k1 = Class30_Sub2_Sub1_Sub3.anInt1466;
        int l1 = Class30_Sub2_Sub1_Sub3.anInt1467;
        int ai[] = Class30_Sub2_Sub1_Sub3.anIntArray1472;
        int ai1[] = Class30_Sub2_Sub1.anIntArray1378;
        int i2 = Class30_Sub2_Sub1.anInt1379;
        int j2 = Class30_Sub2_Sub1.anInt1380;
        int k2 = Class30_Sub2_Sub1.anInt1383;
        int l2 = Class30_Sub2_Sub1.anInt1384;
        int i3 = Class30_Sub2_Sub1.anInt1381;
        int j3 = Class30_Sub2_Sub1.anInt1382;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = false;
        Class30_Sub2_Sub1.method331(32, 32, class30_sub2_sub1_sub1_1.anIntArray1439, null);
        Class30_Sub2_Sub1.method336(32, 0, 0, 0, 32, 0);
        Class30_Sub2_Sub1_Sub3.method364((byte)6);
        int k3 = class8.anInt181;
        if(k == -1)
            k3 = (int)((double)k3 * 1.5D);
        if(k > 0)
            k3 = (int)((double)k3 * 1.04D);
        int l3 = Class30_Sub2_Sub1_Sub3.anIntArray1470[class8.anInt190] * k3 >> 16;
        int i4 = Class30_Sub2_Sub1_Sub3.anIntArray1471[class8.anInt190] * k3 >> 16;
        class30_sub2_sub4_sub6.method482(0, class8.anInt198, class8.anInt204, class8.anInt190, class8.anInt169, l3 + ((Class30_Sub2_Sub4) (class30_sub2_sub4_sub6)).anInt1426 / 2 + class8.anInt194, i4 + class8.anInt194);
        for(int i5 = 31; i5 >= 0; i5--)
        {
            for(int j4 = 31; j4 >= 0; j4--)
                if(class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] == 0)
                    if(i5 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(i5 - 1) + j4 * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(j4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + (j4 - 1) * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(i5 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + 1 + j4 * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;
                    else
                    if(j4 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[i5 + (j4 + 1) * 32] > 1)
                        class30_sub2_sub1_sub1_1.anIntArray1439[i5 + j4 * 32] = 1;

        }

        if(k > 0)
        {
            for(int j5 = 31; j5 >= 0; j5--)
            {
                for(int k4 = 31; k4 >= 0; k4--)
                    if(class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] == 0)
                        if(j5 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(j5 - 1) + k4 * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(k4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + (k4 - 1) * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(j5 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + 1 + k4 * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;
                        else
                        if(k4 < 31 && class30_sub2_sub1_sub1_1.anIntArray1439[j5 + (k4 + 1) * 32] == 1)
                            class30_sub2_sub1_sub1_1.anIntArray1439[j5 + k4 * 32] = k;

            }

        } else
        if(k == 0)
        {
            for(int k5 = 31; k5 >= 0; k5--)
            {
                for(int l4 = 31; l4 >= 0; l4--)
                    if(class30_sub2_sub1_sub1_1.anIntArray1439[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && class30_sub2_sub1_sub1_1.anIntArray1439[(k5 - 1) + (l4 - 1) * 32] > 0)
                        class30_sub2_sub1_sub1_1.anIntArray1439[k5 + l4 * 32] = 0x302020;

            }

        }
        if(class8.anInt163 != -1)
        {
            int l5 = class30_sub2_sub1_sub1_2.anInt1444;
            int j6 = class30_sub2_sub1_sub1_2.anInt1445;
            class30_sub2_sub1_sub1_2.anInt1444 = 32;
            class30_sub2_sub1_sub1_2.anInt1445 = 32;
            class30_sub2_sub1_sub1_2.method348(0, 16083, 0);
            class30_sub2_sub1_sub1_2.anInt1444 = l5;
            class30_sub2_sub1_sub1_2.anInt1445 = j6;
        }
        if(k == 0)
            aClass12_158.method223(class30_sub2_sub1_sub1_1, i, (byte)2);
        Class30_Sub2_Sub1.method331(j2, i2, ai1, null);
        Class30_Sub2_Sub1.method333(j3, k2, false, l2, i3);
        Class30_Sub2_Sub1_Sub3.anInt1466 = k1;
        Class30_Sub2_Sub1_Sub3.anInt1467 = l1;
        Class30_Sub2_Sub1_Sub3.anIntArray1472 = ai;
        Class30_Sub2_Sub1_Sub3.aBoolean1464 = true;
        if(l < 9 || l > 9)
        {
            for(int i6 = 1; i6 > 0; i6++);
        }
        if(class8.aBoolean176)
            class30_sub2_sub1_sub1_1.anInt1444 = 33;
        else
            class30_sub2_sub1_sub1_1.anInt1444 = 32;
        class30_sub2_sub1_sub1_1.anInt1445 = j;
        return class30_sub2_sub1_sub1_1;
    }

    public final Class30_Sub2_Sub4_Sub6 method201(int i)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                    j = anIntArray193[k];

            if(j != -1)
                return method198(j).method201(1);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_159.method222(anInt157);
        if(class30_sub2_sub4_sub6 != null)
            return class30_sub2_sub4_sub6;
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, modelId);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        if(anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
            class30_sub2_sub4_sub6.method478(anInt167, anInt191, anInt177, anInt192);
        if(modifiedModelColors != null)
        {
            for(int l = 0; l < modifiedModelColors.length; l++)
                class30_sub2_sub4_sub6.method476(modifiedModelColors[l], originalModelColors[l]);

        }
        class30_sub2_sub4_sub6.method479(64 + anInt196, 768 + anInt184, -50, -10, -50, true);
        class30_sub2_sub4_sub6.aBoolean1659 = true;
        aClass12_159.method223(class30_sub2_sub4_sub6, anInt157, (byte)2);
        return class30_sub2_sub4_sub6;
    }

    public final Class30_Sub2_Sub4_Sub6 method202(int i, boolean flag)
    {
        if(anIntArray193 != null && i > 1)
        {
            int j = -1;
            for(int k = 0; k < 10; k++)
                if(i >= anIntArray201[k] && anIntArray201[k] != 0)
                    j = anIntArray193[k];

            if(j != -1)
                return method198(j).method202(1, true);
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, modelId);
        if(!flag)
            throw new NullPointerException();
        if(class30_sub2_sub4_sub6 == null)
            return null;
        if(modifiedModelColors != null)
        {
            for(int l = 0; l < modifiedModelColors.length; l++)
                class30_sub2_sub4_sub6.method476(modifiedModelColors[l], originalModelColors[l]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final void readValues(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int opcode = class30_sub2_sub2.method408();
            if(opcode == 0)
                return;
            if(opcode == 1)
                modelId = class30_sub2_sub2.method410();
            else
            if(opcode == 2)
                name = class30_sub2_sub2.method415();
            else
            if(opcode == 3)
                aByteArray178 = class30_sub2_sub2.method416((byte)30);
            else
            if(opcode == 4)
                anInt181 = class30_sub2_sub2.method410();
            else
            if(opcode == 5)
                anInt190 = class30_sub2_sub2.method410();
            else
            if(opcode == 6)
                anInt198 = class30_sub2_sub2.method410();
            else
            if(opcode == 7)
            {
                anInt169 = class30_sub2_sub2.method410();
                if(anInt169 > 32767)
                    anInt169 -= 0x10000;
            } else
            if(opcode == 8)
            {
                anInt194 = class30_sub2_sub2.method410();
                if(anInt194 > 32767)
                    anInt194 -= 0x10000;
            } else
            if(opcode == 10)
                anInt199 = class30_sub2_sub2.method410();
            else
            if(opcode == 11)
                aBoolean176 = true;
            else
            if(opcode == 12)
                anInt155 = class30_sub2_sub2.method413();
            else
            if(opcode == 16)
                aBoolean161 = true;
            else
            if(opcode == 23)
            {
                anInt165 = class30_sub2_sub2.method410();
                aByte205 = class30_sub2_sub2.method409();
            } else
            if(opcode == 24)
                anInt188 = class30_sub2_sub2.method410();
            else
            if(opcode == 25)
            {
                anInt200 = class30_sub2_sub2.method410();
                aByte154 = class30_sub2_sub2.method409();
            } else
            if(opcode == 26)
                anInt164 = class30_sub2_sub2.method410();
            else
            if(opcode >= 30 && opcode < 35)
            {
                if(aStringArray168 == null)
                    aStringArray168 = new String[5];
                aStringArray168[opcode - 30] = class30_sub2_sub2.method415();
                if(aStringArray168[opcode - 30].equalsIgnoreCase("hidden"))
                    aStringArray168[opcode - 30] = null;
            } else
            if(opcode >= 35 && opcode < 40)
            {
                if(aStringArray189 == null)
                    aStringArray189 = new String[5];
                aStringArray189[opcode - 35] = class30_sub2_sub2.method415();
            } else
            if(opcode == 40)
            {
                int j = class30_sub2_sub2.method408();
                modifiedModelColors = new int[j];
                originalModelColors = new int[j];
                for(int k = 0; k < j; k++)
                {
                    modifiedModelColors[k] = class30_sub2_sub2.method410();
                    originalModelColors[k] = class30_sub2_sub2.method410();
                }

            } else
            if(opcode == 78)
                anInt185 = class30_sub2_sub2.method410();
            else
            if(opcode == 79)
                anInt162 = class30_sub2_sub2.method410();
            else
            if(opcode == 90)
                anInt175 = class30_sub2_sub2.method410();
            else
            if(opcode == 91)
                anInt197 = class30_sub2_sub2.method410();
            else
            if(opcode == 92)
                anInt166 = class30_sub2_sub2.method410();
            else
            if(opcode == 93)
                anInt173 = class30_sub2_sub2.method410();
            else
            if(opcode == 95)
                anInt204 = class30_sub2_sub2.method410();
            else
            if(opcode == 97)
                anInt179 = class30_sub2_sub2.method410();
            else
            if(opcode == 98)
                anInt163 = class30_sub2_sub2.method410();
            else
            if(opcode >= 100 && opcode < 110)
            {
                if(anIntArray193 == null)
                {
                    anIntArray193 = new int[10];
                    anIntArray201 = new int[10];
                }
                anIntArray193[opcode - 100] = class30_sub2_sub2.method410();
                anIntArray201[opcode - 100] = class30_sub2_sub2.method410();
            } else
            if(opcode == 110)
                anInt167 = class30_sub2_sub2.method410();
            else
            if(opcode == 111)
                anInt192 = class30_sub2_sub2.method410();
            else
            if(opcode == 112)
                anInt191 = class30_sub2_sub2.method410();
            else
            if(opcode == 113)
                anInt196 = class30_sub2_sub2.method409();
            else
            if(opcode == 114)
                anInt184 = class30_sub2_sub2.method409() * 5;
            else
            if(opcode == 115)
                anInt202 = class30_sub2_sub2.method408();
        } while(true);
    }

    Class8()
    {
        anInt157 = -1;
        anInt171 = 9;
        anInt177 = 9;
        aBoolean186 = false;
        aBoolean206 = false;
    }

    private byte aByte154;
    public int anInt155;
    private int modifiedModelColors[];
    public int anInt157;
    static Class12 aClass12_158 = new Class12(false, 100);
    public static Class12 aClass12_159 = new Class12(false, 50);
    private int originalModelColors[];
    public boolean aBoolean161;
    public int anInt162;
    public int anInt163;
	private boolean stockmarket;
	private int[] retextureDst;
	private int[] retextureSrc;
    private int anInt164;
    private int anInt165;
    public int anInt166;
    private int anInt167;
    public String aStringArray168[];
    private int anInt169;
    public String name;
    private int anInt171;
    private static Class8 aClass8Array172[];
    public int anInt173;
    private int modelId;
    private int anInt175;
    public boolean aBoolean176;
    private int anInt177;
    public byte aByteArray178[];
    public int anInt179;
    private static int anInt180;
    public int anInt181;
    public static boolean aBoolean182 = true;
    private static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_183;
    private int anInt184;
    public int anInt185;
    private boolean aBoolean186;
    private static boolean aBoolean187;
    private int anInt188;
    public String aStringArray189[];
    public int anInt190;
    private int anInt191;
    private int anInt192;
    public int anIntArray193[];
    private int anInt194;
    private static int anIntArray195[];
    private int anInt196;
    public int anInt197;
    public int anInt198;
    public int anInt199;
    private int anInt200;
    public int anIntArray201[];
    public int anInt202;
    public static int anInt203;
    public static int frugooItems = 5;
    private int anInt204;
    private byte aByte205;
    private boolean aBoolean206;

}
