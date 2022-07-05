import sign.signlink;

import java.io.*;


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
			if(class8.aByteArray178 != null)
			des = new String(class8.aByteArray178);
			else
			des = "Its a "+class8.aString170;
			try {
				BufferedWriter bufferedwriter;
				bufferedwriter = null;
				BufferedWriter bufferedWriter2 = bufferedwriter = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/item.cfg"), true));
				bufferedwriter.write((new StringBuilder()).append("item = ").append(i).append("	").append(class8.aString170).append("	").append(des).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append(class8.anInt155).append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").append("	").append("0").toString());
				bufferedwriter.newLine();
				bufferedwriter.flush();
			} catch(Exception e) {
			}
		}
	}
	public static void dumpItemsList() {
	for(int i = 0; i < 9200; i++) {
	Class8 class8 = method198(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter(signlink.findcachedir() + ("/dumps/ItemList.txt"), true));
	if(class8.aString170 != null) {
	bw.write("ID: "+i+"\t\tName: "+class8.aString170);
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
if(class8.aString170 != null) {
bw.write("<item members='true'  name='" + class8.aString170 + "'  type='"+i+"'> </item>");
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
	 bw.write("Item Name: "+class8.aString170);
	 bw.newLine();
	 bw.write("Item ID: "+i);
	 bw.newLine();
                 if(class8.anIntArray156 != null) {
                     for(int i2 = 0; i2 < class8.anIntArray156.length; i2++) {
                         if(i2 == 0) {
                             bw.write("Original model colors: ");
                         }
                         if(i2 != class8.anIntArray156.length - 1) {
                             bw.write(""+class8.anIntArray156[i2]+", ");
                         } else {
                             bw.write(""+class8.anIntArray156[i2]);
                             bw.newLine();
                         }
                     }
                 }
                 if(class8.anIntArray160 != null) {
                     for(int i2 = 0; i2 < class8.anIntArray160.length; i2++) {
                         if(i2 == 0) {
                             bw.write("Changed model colors: ");
                         }
                         if(i2 != class8.anIntArray160.length - 1) {
                             bw.write(""+class8.anIntArray160[i2]+", ");
                         } else {
                             bw.write(""+class8.anIntArray160[i2]);
                             bw.newLine();
                         }
                     }
                 }
                 bw.write("class8.anInt174 = "+class8.anInt174+";");
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
        if(anIntArray156 != null) {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
                class30_sub2_sub4_sub6.method476(anIntArray156[i1], anIntArray160[i1]);

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
        if(anIntArray156 != null) {
            for(int i1 = 0; i1 < anIntArray156.length; i1++)
                class30_sub2_sub4_sub6.method476(anIntArray156[i1], anIntArray160[i1]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final void method197()
    {
        anInt174 = 0;
        aString170 = null;
        aByteArray178 = null;
        anIntArray156 = null;
        anIntArray160 = null;
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
        class8.method203(true, aClass30_Sub2_Sub2_183);
	class8.method198_2(i, class8);
	class8.method198_3(i, class8);

if(i == 9004)
{ 
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Summon from the";
	class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int [1];
	class8.anIntArray156[0] = 7446;//color change
	class8.anIntArray160[0] = 926;//color change 1
	class8.anInt174 = 8933;//itemdrop look
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
	class8.aString170 = "Monkey Bag";
	class8.aByteArray178 = "Wear a monkey for FREE!".getBytes();
}

             if(i == 15340)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.anIntArray156 = new int[1];
		            class8.anIntArray160 = new int[1];
		            class8.anIntArray156[0] = 0;
		            class8.anIntArray160[0] = 0;
		            class8.anInt174 = 14923;
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
		            class8.aString170 = "Lucky Saradomin Godsword";
		            class8.aByteArray178 = "A heavy sword".getBytes();
		        }
        if(i == 15341)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anIntArray156 = new int[0];
		class8.anIntArray160 = new int[0];
		class8.anInt174 = 7212; //Model ID
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
		class8.aString170 = "Lucky Armadyl Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
		        }
				        if(i == 18431)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";//New option
		class8.anIntArray156 = new int[0];
		class8.anIntArray160 = new int[0];
		class8.anInt174 = 70730; //Model ID
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
		class8.aString170 = "Dragonbone platebody";//Name of the new item
		class8.aByteArray178 = "Provides excellent protection with a meaner, bonier look.".getBytes();//examin info
		        }
		if(i == 17431)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anIntArray156 = new int[0];
		class8.anIntArray160 = new int[0];
		class8.anInt174 = 70899; //Model ID
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
		class8.aString170 = "Golden katana";//Name of the new item
		class8.aByteArray178 = "A fine blade from the Eastern Lands.".getBytes();//examin info
		        }
		if(i == 15342)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anIntArray156 = new int[0];
		class8.anIntArray160 = new int[0];
		class8.anInt174 = 7213; //Model ID
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
		class8.aString170 = "Lucky Zamorak Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
        }
		        if(i == 15343){
				            class8.aStringArray189 = new String[5];
				            class8.aStringArray189[1] = "Wear";
				            class8.anIntArray156 = new int[1];
				            class8.anIntArray160 = new int[1];
							class8.anIntArray156[0] = 0;
							class8.anIntArray160[0] = 0;
							class8.anInt174 = 12354;//item look
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
				            class8.aString170 = "Lucky Bandos godsword";
				            class8.aByteArray178 = "A heavy sword".getBytes();
        }
if(i == 2677) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray160[0] = 926;
class8.anIntArray156[1] = 54503;
class8.anIntArray160[1] = 926;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[2] = 926;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[3] = 926;
class8.anInt174 = 4158; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4181; //Male
class8.anInt200 = 7178; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Attack Cape";
class8.aByteArray178 = "Its A attack Cape".getBytes();
}
if(i == 4319) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4158; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4181; //Male
class8.anInt200 = 7178; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Attack Cape(t)";
class8.aByteArray178 = "Its A attack Cape(t)".getBytes();
}
if(i == 16212) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 51845;
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
class8.aString170 = "Staff of Light"; // Item Name
class8.aByteArray178 = "Humming with power.".getBytes(); // Item Examine
      }
		       if(i == 9106)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.anIntArray156 = new int[1];
		            class8.anIntArray160 = new int[1];
		            class8.anIntArray156[0] = 528;
		            class8.anIntArray160[0] = 100;
		            class8.anInt174 = 5412;
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
		            class8.aString170 = "White whip";
		            class8.aByteArray178 = "Made By The White Knights.".getBytes();
        }
if(i == 15333)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
        class8.anInt174 = 28162;
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
            class8.aString170 = "Armadyl godsword";
            class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
        }

        if(i == 15334)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
class8.anInt174 = 28154;
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
            class8.aString170 = "Bandos godsword ";
            class8.aByteArray178 = "A great weapon, used by the best warriors.".getBytes();
        }
        if(i == 15335)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Dismantle"; 
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
class8.anInt174 = 28151;
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
            class8.aString170 = "Saradomin Godsword";
            class8.aByteArray178 = "A saradomin godsword, once used by saradomin himself.".getBytes();
        }
		if(i == 15336)  // change this if you need to "item number"
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anIntArray156 = new int[0];
		class8.anIntArray160 = new int[0];
		class8.anInt174 = 7213; //Model ID
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
		class8.aString170 = "Zamorak Godsword";//Name of the new item
		class8.aByteArray178 = "A heavy sword".getBytes();//examin info
        }
if(i == 13665)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 43072;
class8.anIntArray160[0] = 925;
class8.anIntArray156[1] = 4550;
class8.anIntArray160[1] = 925;
class8.anInt174 = 14104; //Model ID
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
class8.aString170 = "Dragon platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 15111){ //lava helm
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 10394;
              class8.anIntArray160[0] = 26706;      
              class8.anIntArray156[1] = 6020;
              class8.anIntArray160[1] = 6020;
 class8.anInt174= 6583;
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
              class8.aString170 = "Ivandis helm";
              class8.aByteArray178 = "It's a Ivandis helm".getBytes();
              }
if(i == 20139)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 43072;
class8.anIntArray160[0] = 925;
class8.anIntArray156[1] = 4550;
class8.anIntArray160[1] = 925;
class8.anInt174 = 14148; //Model ID
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
class8.aString170 = "Torva platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 20143)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14150;
class8.anInt165 = 10110;
class8.anInt200 = 14149;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.aString170 = "Torva platelegs";
class8.aByteArray178 = "A pair of Torva platelegs".getBytes();
}
if(i == 18358)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 43072;
class8.anIntArray160[0] = 925;
class8.anIntArray156[1] = 4550;
class8.anIntArray160[1] = 925;
class8.anInt174 = 74148; //Model ID
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
class8.aString170 = "Ice Torva platebody";//Name of the new item
class8.aByteArray178 = "Provides excellent protection".getBytes();//examin info
}
if(i == 18359)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 74150;
class8.anInt165 = 70110;
class8.anInt200 = 74149;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.aString170 = "Ice Torva platelegs";
class8.aByteArray178 = "A pair of Ice Torva platelegs".getBytes();
}
if(i == 20137){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
			class8.anIntArray156[0] = 0;
			class8.anIntArray160[0] = 0;
			class8.anInt174 = 14153;//item look
			class8.anInt181 = 700;
			class8.anInt190 = 1100;
			class8.anInt198 = 650;
			class8.anInt204 = 1148;
			class8.anInt169 = 5;
			class8.anInt194 = -25;
			class8.anInt165 = 14151;
			class8.anInt200 = 14152;
            class8.aString170 = "Torva full helm ";
            class8.aByteArray178 = "A ancient warior's full helm.".getBytes();
        }

if(i == 15107) { //ladies legs
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.anIntArray156 = new int[2];
		class8.anIntArray160 = new int [2];
		class8.anIntArray156[0] = 926;
		class8.anIntArray160[0] = 62920;
		class8.anIntArray156[1] = 912;
		class8.anIntArray160[1] = 62928;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = -8;
		class8.anInt165 = 5024;
		class8.anInt200 = 5025;
		class8.anInt174 = 5026;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.aString170 = "Ladies Platelegs";
	class8.aByteArray178 = "Ladies platelegs".getBytes();
}


if(i == 15112) { //ivandis legs
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.anIntArray156 = new int[2];
		class8.anIntArray160 = new int [2];
		class8.anIntArray156[0] = 926;
		class8.anIntArray160[0] = 26706;
		class8.anIntArray156[1] = 912;
		class8.anIntArray160[1] = 26667;
	class8.anInt181 = 1740;
	class8.anInt190 = 444;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = -8;
		class8.anInt165 = 5024;
		class8.anInt200 = 5025;
		class8.anInt174 = 5026;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.aString170 = "Ivandis Platelegs";
	class8.aByteArray178 = "Stride through enemies territory in a heart beat.".getBytes();
}
if(i == 15109){ //ladies helm
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 10394;
              class8.anIntArray160[0] = 62928;      
              class8.anIntArray156[1] = 6020;
              class8.anIntArray160[1] = 6020;
 class8.anInt174= 6583;
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
              class8.aString170 = "Ladies Helm";
              class8.aByteArray178 = "It's a Ladies helm".getBytes();
              }
if(i == 15337)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
            class8.anInt174 = 28045;
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
            class8.aString170 = "Saradomin Sword";
            class8.aByteArray178 = "Its A sword from saradomin himself".getBytes();
        }

if(i == 15113){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 10283;
class8.anIntArray160[0] = 26706;
class8.anIntArray156[1] = 10270;
class8.anIntArray160[1] = 24648;
class8.anIntArray156[2] = 3326;
class8.anIntArray160[2] = 24640;
class8.anInt174 = 8700;
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
class8.aString170 = "Ivandis Gauntlets";
class8.aByteArray178 = "Ivandis Gauntlets.".getBytes();
}
if(i == 15215){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 8741;
class8.anIntArray160[0] = 924;
class8.anIntArray156[1] = 14490;
class8.anIntArray160[1] = 921;
class8.anInt174 = 6578;
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
class8.aString170 = "Draconic Top";
class8.aByteArray178 = "A draconic Ahrims top.".getBytes();
}
if(i == 15216){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 14490;
class8.anIntArray160[0] = 924;
class8.anIntArray156[1] = 45468;
class8.anIntArray160[1] = 921;
class8.anInt174 = 6577;
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
class8.aString170 = "Draconic Bottoms";
class8.aByteArray178 = "A draconic Ahrims bottoms.".getBytes();
}
if(i == 15217){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 8741;
class8.anIntArray160[0] = 924;
class8.anInt174 = 5419;
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
class8.aString170 = "Draconic Hood";
class8.aByteArray178 = "A draconic Ahrims Hood.".getBytes();
}
 if(i == 15234) // change this if you need to "item number"
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28;
class8.anIntArray156[0] = 74;
class8.anIntArray160[0] = 38676;
class8.anIntArray160[0] = 760;
class8.anInt174 = 5139;
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
            class8.aString170 = "Slayer Sword";
            class8.aByteArray178 = "A Slayer sword by thedragon.".getBytes();
        }
if(i == 15106){//ladies gaunts
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 10283;
class8.anIntArray160[0] = 62928;
class8.anIntArray156[1] = 10270;
class8.anIntArray160[1] = 62928;
class8.anIntArray156[2] = 3326;
class8.anIntArray160[2] = 62928;
class8.anInt174 = 8700;
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
class8.aString170 = "Ladies Gauntlets";
class8.aByteArray178 = "Ladies Gauntlets.".getBytes();
}
if(i == 2679)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray160[0] = 912;
class8.anIntArray156[1] = 22464;
class8.anIntArray160[1] = 912;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[2] = 912;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Attack Hood";
class8.aByteArray178 = "Its A attack Hood".getBytes();
}
if(i == 15118){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon tail";
            class8.aByteArray178 = "A demon tail.".getBytes();
}

if(i == 15119){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon Horns #1";
            class8.aByteArray178 = "Horns of a demon.".getBytes();
}

if(i == 15120){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon Horns #2";
            class8.aByteArray178 = "Horns of a demon.".getBytes();
}

if(i == 15121){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon Head";
            class8.aByteArray178 = "The head of a demon.".getBytes();
}

if(i == 15122){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon Feet";
            class8.aByteArray178 = "The feet of a demon.".getBytes();
}

if(i == 15123){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Equip";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anInt174 = 153;
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
            class8.aString170 = "Demon Hands";
            class8.aByteArray178 = "The hands of a demon.".getBytes();
}
if(i == 15114) { //ivandis chain
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.anIntArray156 = new int[5];
		class8.anIntArray160 = new int [5];
		class8.anIntArray156[0] = 914;
		class8.anIntArray160[0] = 26706;
		class8.anIntArray156[1] = 918;
		class8.anIntArray160[1] = 24648;
		class8.anIntArray156[2] = 922;
		class8.anIntArray160[2] = 24640;
		class8.anIntArray156[3] = 391;
		class8.anIntArray160[3] = 26706;
		class8.anIntArray156[4] = 917;
		class8.anIntArray160[4] = 24648;
	class8.anInt181 = 1100;
	class8.anInt190 = 568;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = 2;
		class8.anInt165 = 3820;
		class8.anInt200 = 3821;
		class8.anInt174 = 3823;
	class8.anInt188 = 156;
	class8.anInt164 = 337;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.aString170 = "Ivandis Chainmail";
	class8.aByteArray178 = "Its a Ivandis Chain".getBytes();
}

if(i == 15150) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 0xD4E7;
class8.anIntArray156[1] = 0xDFC0;
class8.anIntArray156[2] = 0xD3A7;
class8.anIntArray160[0] = 8128;
class8.anIntArray160[1] = 9126;
class8.anIntArray160[2] = 8128;
class8.anInt174 = 7022; //Inv & Ground
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
class8.aString170 = "Summoning Cape";
class8.aByteArray178 = "You've recieved this for achieving 99 Summoning".getBytes();
}

if(i == 15115){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 26706;
class8.anInt174 = 5037;
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
class8.aString170 = "Ivandis Boots";
class8.aByteArray178 = "Ivandis boots".getBytes();
}

if(i == 15105) { //ladies chain
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
		class8.anIntArray156 = new int[5];
		class8.anIntArray160 = new int [5];
		class8.anIntArray156[0] = 914;
		class8.anIntArray160[0] = 62928;
		class8.anIntArray156[1] = 918;
		class8.anIntArray160[1] = 62931;
		class8.anIntArray156[2] = 922;
		class8.anIntArray160[2] = 62928;
		class8.anIntArray156[3] = 391;
		class8.anIntArray160[3] = 62930;
		class8.anIntArray156[4] = 917;
		class8.anIntArray160[4] = 62928;
	class8.anInt181 = 1100;
	class8.anInt190 = 568;
	class8.anInt198 = 0;
	class8.anInt204 = 0;
	class8.anInt169 = 0;
	class8.anInt194 = 2;
		class8.anInt165 = 3820;
		class8.anInt200 = 3821;
		class8.anInt174 = 3823;
	class8.anInt188 = 156;
	class8.anInt164 = 337;
	class8.anInt175 = -1;
	class8.anInt197 = -1;
	class8.aString170 = "Ladies Chainmail";
	class8.aByteArray178 = "Its a Ladies Chain".getBytes();
}

if(i == 15104) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.anIntArray156 = new int[3];
				class8.anIntArray160 = new int [3];
				class8.anIntArray156[0] = 43127;
				class8.anIntArray160[0] = 62928;
				class8.anIntArray156[1] = 38119;
				class8.anIntArray160[1] = 62928;
				class8.anIntArray156[2] = 36975;
				class8.anIntArray160[2] = 62928;
			class8.anInt174 = 5198;//Drop model & inv model
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
			class8.aString170 = "Ladies shield";
			class8.aByteArray178 = "Ladies shield".getBytes();
}



if(i == 15103){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 62929;
class8.anInt174 = 5037;
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
class8.aString170 = "Ladies Boots";
class8.aByteArray178 = "Ladies boots".getBytes();
}
if(i == 3753)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7202; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 984; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 7200;//male wearing
class8.anInt200 = 7201;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Helm of neitiznot";//Name of the new item
class8.aByteArray178 = "Its A Helm of neitiznot".getBytes();//examin info
      }
if(i == 15195)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7205; //Model ID
class8.anInt181 = 984; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 7204;//male wearing
class8.anInt200 = 7203;//female wearing
class8.anInt175 = -1;//Unknown
class8.aBoolean176 = false;//Stackable
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Dragon Full Helm";//Name of the new item
class8.aByteArray178 = "Its A Dragon Full Helm".getBytes();//examin info
      }
if(i == 15102){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.anIntArray156 = new int[2];
        class8.anIntArray160 = new int [2];
	class8.anIntArray156[0] = 933;
	class8.anIntArray160[0] = 62928;
	class8.anIntArray156[1] = 935;
	class8.anIntArray160[1] = 62930;
	class8.anInt174 = 6033;//Item Look
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
	class8.aString170 = "Ladies Blade";
	class8.aByteArray178 = "".getBytes();
        	}

        if(i == 9109) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.anIntArray156 = new int[3];
				class8.anIntArray160 = new int [3];
				class8.anIntArray156[0] = 43127;
				class8.anIntArray160[0] = 43968;
				class8.anIntArray156[1] = 38119;
				class8.anIntArray160[1] = 43968;
				class8.anIntArray156[2] = 36975;
				class8.anIntArray160[2] = 43968;
			class8.anInt174 = 5198;//Drop model & inv model
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
			class8.aString170 = "Blue Crystal shield";
			class8.aByteArray178 = "Blue Crystal shield".getBytes();
}

        if(i == 15203) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.anIntArray156 = new int[3];
				class8.anIntArray160 = new int [3];
				class8.anIntArray156[0] = 43127;
				class8.anIntArray160[0] = 43968;
				class8.anIntArray156[1] = 38119;
				class8.anIntArray160[1] = 43968;
				class8.anIntArray156[2] = 36975;
				class8.anIntArray160[2] = 43968;
			class8.anInt174 = 3902;//Drop model & inv model
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
			class8.aString170 = "Blue Crystal shield";
			class8.aByteArray178 = "Blue Crystal shield".getBytes();
}

if(i == 15116) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.anIntArray156 = new int[3];
				class8.anIntArray160 = new int [3];
				class8.anIntArray156[0] = 43127;
				class8.anIntArray160[0] = 26706;
				class8.anIntArray156[1] = 38119;
				class8.anIntArray160[1] = 24648;
				class8.anIntArray156[2] = 36975;
				class8.anIntArray160[2] = 24640;
			class8.anInt174 = 5198;//Drop model & inv model
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
			class8.aString170 = "Ivandis shield";
			class8.aByteArray178 = "Ivandis shield".getBytes();
}

if(i == 15117){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.anIntArray156 = new int[2];
        class8.anIntArray160 = new int [2];
	class8.anIntArray156[0] = 933;
	class8.anIntArray160[0] = 26706;
	class8.anIntArray156[1] = 935;
	class8.anIntArray160[1] = 24648;
	class8.anInt174 = 6033;//Item Look
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
	class8.aString170 = "Ivandis Blade";
	class8.aByteArray178 = "Show no mercy, led anger rule your fury.".getBytes();
        	}
if(i == 9115) {
				class8.aStringArray189 = new String[5];
				class8.aStringArray189[1] = "Wear";
				class8.anIntArray156 = new int[3];
				class8.anIntArray160 = new int [3];
				class8.anIntArray156[0] = 43127;
				class8.anIntArray160[0] = 128;
				class8.anIntArray156[1] = 38119;
				class8.anIntArray160[1] = 128;
				class8.anIntArray156[2] = 36975;
				class8.anIntArray160[2] = 128;
			class8.anInt174 = 5198;//Drop model & inv model
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
			class8.aString170 = "Black Crystal shield";
			class8.aByteArray178 = "Black Crystal shield".getBytes();
}
		if(i == 9117)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 926;  //original color
class8.anIntArray160[0] = 0; //changed color
class8.anInt174 =   2438;
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
	class8.aString170 = "Black h'ween Mask";
	class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
}
if(i == 9118)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 926;  //original color
class8.anIntArray160[0] = 11200; //changed color
class8.anInt174 =   2438;
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
	class8.aString170 = "Yellow h'ween Mask";
	class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
}

if(i == 12365)
		        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; //t
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 22416;  //original color
class8.anIntArray160[0] = 11200; //changed color
class8.anIntArray156[1] = 22424;  //original color
class8.anIntArray160[1] = 11200; //changed color
class8.anInt174 = 2745;
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
	class8.aString170 = "Yellow d'hide body";
	class8.aByteArray178 = "really a yellow d'hide body".getBytes();
}

		if(i == 9094)    //WH1P!!!!
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear"; //this is the new option to equipt, can change to w/e u want
		            class8.anIntArray156 = new int[1];
		        class8.anIntArray160 = new int[1];
		class8.anIntArray156[0] = 528;  //original color
		class8.anIntArray160[0] = 36133; //changed color
		class8.anInt174 =  5412;
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
		            class8.aString170 = "Rune Whip";
		            class8.aByteArray178 = "A whip made of Rune".getBytes();
        }
        if(i == 9096) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6944; //Model ID
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
		class8.aString170 = "Zamorak Robe top";//Name of the new item
		class8.aByteArray178 = "A Robe Top Worn By the Gods.".getBytes();//examin info
		}

		if(i == 9097) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6947; //Model ID
		class8.anInt181 = 1800; //1690 zoom increase will make it smaller
		class8.anInt190 = 408; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //2024 model rotate side ways increase to move right in circle
		class8.anInt169 = 5; // model offset increase to move to the right
		class8.anInt194 = 0; //model offset increase to move up
		class8.anInt165 = 6945;//male wearing
		class8.anInt200 = 6946;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Zamorak Robe Bottom";//Name of the new item
		class8.aByteArray178 = "A Robe Bottom Worn By the Gods.".getBytes();//examin info
		}

		if(i == 9098) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6948; //Model ID
		class8.anInt181 = 600; //980 zoom increase will make it smaller
		class8.anInt190 = 208; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 220; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = -18; //model offset increase to move up
		class8.anInt165 = 6949;//male wearing
		class8.anInt200 = 6950;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Zamorak Mitre";//Name of the new item
		class8.aByteArray178 = "A Hat Worn By the Gods.".getBytes();//examin info
		}


		if(i == 9099) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6953; //Model ID
		class8.anInt181 = 1980; //zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 1000; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 0; //model offset increase to move up
		class8.anInt165 = 6951;//male wearing
		class8.anInt200 = 6952;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Zamorak Cape";//Name of the new item
		class8.aByteArray178 = "A Cape Worn By the Gods.".getBytes();//examin info
		}


		if(i == 9100) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6954; //Model ID
		class8.anInt181 = 2000; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt165 = 6955;//male wearing
		class8.anInt200 = 6955;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Zamorak Crozier";//Name of the new item
		class8.aByteArray178 = "A Staff Used By the Gods.".getBytes();//examin info
		}


		if(i == 9101) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 6956; //Model ID
		class8.anInt181 = 1700; //1200 zoom increase will make it smaller
		class8.anInt190 = 490; //572 model rotate up+down increase to move doen away from you
		class8.anInt198 = 60; //0 model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = -10; //model offset increase to move up
		class8.anInt165 = 6982;//male wearing
		class8.anInt200 = 6984;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Zamorak Stole";//Name of the new item
		class8.aByteArray178 = "A Stole Worn By the Gods.".getBytes();//examin info
		}

if(i == 2680)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[0] = 22424;
class8.anIntArray160[1] = 22424;
class8.anIntArray160[2] = 22424;
class8.anInt174 = 4177; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4199; //Male
class8.anInt200 = 7197; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Strength Cape";
class8.aByteArray178 = "Its A Strength Cape".getBytes();
}

if(i == 14632){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 3196;
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
              class8.aString170 = "Ice Cape";
              class8.aByteArray178 = "It's Black Platelegs (B)".getBytes();
              }

if(i == 9091){
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wear";
	class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int [1];
      //Purple: 926-127
        class8.anIntArray156[0] = 926;
        class8.anIntArray160[0] = 128;
	class8.anInt174 = 2635;//Item Look
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
	class8.aString170 = "Black Party Hat";
	class8.aByteArray178 = "A nice hat from a cracker.".getBytes();
        }
if(i == 10090)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 51136;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Purple santa hat ";
            class8.aByteArray178 = "Purple santa hat.".getBytes();
        }
        if(i == 12322)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 35321;
            class8.anIntArray156[1] = 35321;
            class8.anIntArray160[1] = 35321;
            class8.anInt174 = 2537;
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
            class8.aString170 = "sky santa hat ";
            class8.aByteArray178 = "Sky santa hat.".getBytes();
        }
if(i == 10091)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Black santa hat ";
            class8.aByteArray178 = "Black santa hat.".getBytes();
        }

if(i == 10092)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43297;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Mithril santa hat ";
            class8.aByteArray178 = "Mithril santa hat.".getBytes();
        }

 if(i == 10093)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 36133;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Rune santa hat ";
            class8.aByteArray178 = "Rune santa hat.".getBytes();
        }

        if(i == 10094)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 1000;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Dragon santa hat ";
            class8.aByteArray178 = "Dragon santa hat.".getBytes();
        }

        if(i == 10095)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 21662 ;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Addy santa hat ";
            class8.aByteArray178 = "Addy santa hat.".getBytes();
        }

        if(i == 10096)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 7114;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Gold santa hat ";
            class8.aByteArray178 = "Gold santa hat.".getBytes();
        }

        if(i == 10097)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 10394;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Barrows santa hat ";
            class8.aByteArray178 = "Barrows santa hat.".getBytes();
        }

        if(i == 10098)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43968;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7097;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Blue santa hat ";
            class8.aByteArray178 = "Blue santa hat.".getBytes();
        }

					if(i == 15095) //Replace with the id you want
		{
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 14623; //Model ID
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
		class8.aString170 = "Winged Sandals";//Name of the new item
		class8.aByteArray178 = "Apollo's gift.".getBytes();//examine info
		}
        if(i == 7885)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anInt174 = 14045;
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
            class8.aString170 = "Bandos whip";
            class8.aByteArray178 = "A whip from the warchief Graardor".getBytes();
        }
if(i == 10100)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 6073;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Orange Whip";
            class8.aByteArray178 = "a Orange Whip".getBytes();
        }

if(i == 10101)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 51136;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Purple Whip";
            class8.aByteArray178 = "a Purple Whip".getBytes();
        }

if(i == 10102)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 25;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Unknown Color Whip";
            class8.aByteArray178 = "a Unknown Color Whip".getBytes();
        }

if(i == 10103)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 950;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Red Whip";
            class8.aByteArray178 = "a Red Whip".getBytes();
        }

if(i == 10104)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 43968;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Blue Whip";
            class8.aByteArray178 = "a Blue Whip".getBytes();
        }

if(i == 10105)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 10394;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Barrows Whip";
            class8.aByteArray178 = "a Barrows Whip".getBytes();
        }

if(i == 10106)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 7114;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Gold Whip";
            class8.aByteArray178 = "a Gold Whip".getBytes();
        }
if(i == 10107)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 100;       
class8.anInt174 =  5412;
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
            class8.aString170 = "White Whip";
            class8.aByteArray178 = "a White Whip".getBytes();
        }

if(i == 15000)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 926;  
class8.anIntArray160[0] = 924;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Dragon Whip";
            class8.aByteArray178 = "It Is a Dragon Whip if ur rich its for u!".getBytes();
        }

if(i == 15001)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.aStringArray189[2] = "die!";
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 0;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Death Whip";
            class8.aByteArray178 = "omfg its a death whip!".getBytes();
        }

 if(i == 8000){ //black phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 0;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Black Party Hat";
 class8.aByteArray178 = "An Black Party Hat.".getBytes();
 }

 if(i == 10109){ //orange phat
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int[1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 6073;
 class8.anInt174 = 2635;
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
 class8.aString170 = "Orange Party Hat";
 class8.aByteArray178 = "An Orange Party Hat.".getBytes();
 }

 if(i == 10110){ //Gold phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 8128;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Gold Party Hat";
 class8.aByteArray178 = "A Gold Party Hat.".getBytes();
 }

 if(i == 10111){ 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 50;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Grey Party Hat";
 class8.aByteArray178 = "A Grey Party Hat.".getBytes();
 }

 if(i == 10112){ //Bronze phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 5652;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Bronze Party Hat";
 class8.aByteArray178 = "A Bronze Party Hat.".getBytes();
 }

 if(i == 10113){ //Steel phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 41;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Steel Party Hat";
 class8.aByteArray178 = "A Steel Party Hat.".getBytes();
 }

 if(i == 10114){ //Mithril phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 43297;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Mithril Party Hat";
 class8.aByteArray178 = "A Mithril Party Hat.".getBytes();
 }
 if(i == 15090){ //Mithril phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "look at";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 586;
 class8.anIntArray160[0] = 43297;		
 class8.anInt174 = 546;
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
 class8.aString170 = "rum deal";
 class8.aByteArray178 = "omfg its the rum deal thingy.".getBytes();
 }
 if(i == 10115){ //Adamant phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 21662;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Adamant Party Hat";
 class8.aByteArray178 = "An Addy Party Hat.".getBytes();
 }

 if(i == 10116){ //Rune phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 36133;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Rune Party Hat";
 class8.aByteArray178 = "A Rune Party Hat.".getBytes();
 }

 if(i == 10117){ //Dragon phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 924;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Dragon Party Hat";
 class8.aByteArray178 = "A Dragon Party Hat.".getBytes();
 }

 if(i == 10118){ //Barrows phat 
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = "Wear";
 class8.anIntArray156 = new int[1];
 class8.anIntArray160 = new int [1];
 class8.anIntArray156[0] = 926;
 class8.anIntArray160[0] = 10388;		
 class8.anInt174 = 2635;
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
 class8.aString170 = "Barrows Party Hat";
 class8.aByteArray178 = "A Party Hat worn by the Barrows Brothers.".getBytes();
 }

if(i == 10119)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 22464;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Green Whip";
            class8.aByteArray178 = "a Green Whip".getBytes();
        }
if(i == 12345) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 12122; // Drop/Inv Model
class8.anInt165 = 12121; // Male Wield Model
class8.anInt200 = 12121; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
	class8.anInt181 = 800; // Zoom - Increase to make inv model smaller
	class8.anInt190 = 498; // Rotate up/down -  Increase to rotate upwards
	class8.anInt198 = 1300; // Rotate right/left - Increase to rotate right
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Bandos Cape"; // Item Name
class8.aByteArray178 = "The Legendary God Cape".getBytes(); // Item Examine
      }
if(i == 9119)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
            class8.anInt174 = 3288;
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
            class8.aString170 = "Death Cape";
            class8.aByteArray178 = "Death Cape made by death! ".getBytes();
        }

if(i == 4359) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156[0] = 8256;
class8.anIntArray160[0] = 926;
class8.anIntArray156[1] = 54183;
class8.anIntArray160[1] = 926;
class8.anIntArray156[2] = 57280;
class8.anIntArray160[2] = 926;
class8.anIntArray156[3] = 960;
class8.anIntArray160[3] = 926;
class8.anIntArray156[4] = 22464;
class8.anIntArray160[4] = 926;
class8.anIntArray156[5] = 21568;
class8.anIntArray160[5] = 926;
class8.anInt174 = 4177; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4199; //Male
class8.anInt200 = 7197; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Strength Cape(t)";
class8.aByteArray178 = "Its A Strenght Cape(t)".getBytes();
}
if(i == 2682)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22424;
class8.anIntArray160[1] = 22424;
class8.anIntArray160[2] = 22424;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Strength Hood";
class8.aByteArray178 = "Its A Strength Hood".getBytes();
}
if(i == 14079) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray160[0] = 41416;
class8.anIntArray156[1] = 54503;
class8.anIntArray160[1] = 41416;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[2] = 41416;
class8.anIntArray156[3] = 127;
class8.anIntArray160[3] = 41416;
class8.anInt174 = 4162; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4184; //Male
class8.anInt200 = 7182; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Defence Cape";
class8.aByteArray178 = "Its A Defence Cape".getBytes();
}
if(i == 14080) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 57280;
class8.anIntArray160[0] = 107;
class8.anIntArray156[1] = 54503;
class8.anIntArray160[1] = 107;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[2] = 107;
class8.anInt174 = 4162; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4184; //Male
class8.anInt200 = 7182; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Defence Cape(t)";
class8.aByteArray178 = "Its A Defence Cape(t)".getBytes();
}
if(i == 14081)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray160[0] = 41416;
class8.anIntArray156[1] = 22464;
class8.anIntArray160[1] = 41416;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[2] = 41416;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Defence Hood";
class8.aByteArray178 = "Its A Defence Hood".getBytes();
}
if(i == 14082) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[6];
class8.anIntArray160 = new int[6];
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[0] = 13214;
class8.anIntArray160[1] = 13214;
class8.anIntArray160[2] = 13214;
class8.anInt174 = 4173; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4195; //Male
class8.anInt200 = 7193; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Ranging Cape";
class8.aByteArray178 = "Its A Ranging Cape".getBytes();
}
if(i == 14083) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray160[0] = 8111;
class8.anIntArray160[1] = 8111;
class8.anIntArray160[2] = 8111;
class8.anInt174 = 4173; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4195; //Male
class8.anInt200 = 7193; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Ranging Cape(t)";
class8.aByteArray178 = "Its A Ranging Cape(t)".getBytes();
}
if(i == 14084)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 13214;
class8.anIntArray160[1] = 13214;
class8.anIntArray160[2] = 13214;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Range Hood";
class8.aByteArray178 = "A Range Hood".getBytes();
}
if(i == 14085) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anIntArray160[3] = 107;
class8.anInt174 = 4171; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4193; //Male
class8.anInt200 = 7191; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "Prayer Cape";
class8.aByteArray178 = "Its A Prayer Cape".getBytes();
}
if(i == 14086) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4171; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4193; //Male
class8.anInt200 = 7191; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Prayer Cape(t)";
class8.aByteArray178 = "Its A Prayer Cape(t)".getBytes();
}
if(i == 14087)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 107;
class8.anIntArray160[1] = 107;
class8.anIntArray160[2] = 107;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Prayer Hood";
class8.aByteArray178 = "A Prayer Hood".getBytes();
}
if(i == 14088) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6348;
class8.anIntArray160[1] = 6340;
class8.anIntArray160[2] = 6331;
class8.anIntArray160[3] = 6331;
class8.anInt174 = 4169; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4191; //Male
class8.anInt200 = 7189; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Magic Cape";
class8.aByteArray178 = "Its A magic Cape".getBytes();
}
if(i == 14089) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 43934;
class8.anIntArray160[1] = 43934;
class8.anIntArray160[2] = 43934;
class8.anIntArray160[3] = 43934;
class8.anInt174 = 4169; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4191; //Male
class8.anInt200 = 7189; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Magic Cape(t)";
class8.aByteArray178 = "Its A magic Cape(t)".getBytes();
}
if(i == 14090)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 6348;
class8.anIntArray160[1] = 6340;
class8.anIntArray160[2] = 6331;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Magic Hood";
class8.aByteArray178 = "A Magic Hood".getBytes();
}
if(i == 14130) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6073;
class8.anIntArray160[1] = 6073;
class8.anIntArray160[2] = 6073;
class8.anIntArray160[3] = 6073;
class8.anInt174 = 4159; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4186; //Male
class8.anInt200 = 7184; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Firemaking Cape";
class8.aByteArray178 = "Its A firemaking Cape(t)".getBytes();
}
if(i == 11232)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 40;
class8.anIntArray160[0] = 24;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
}

if(i == 13488)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 40;
class8.anIntArray160[0] = 50;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Blue Lava Cape";
class8.aByteArray178 = "A rare blue lava cape.".getBytes();
}

if(i == 14131) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4159; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4186; //Male
class8.anInt200 = 7184; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Firemaking Cape(t)";
class8.aByteArray178 = "Its A firemaking Cape(t)".getBytes();
}
if(i == 14132)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 6073;
class8.anIntArray160[1] = 6073;
class8.anIntArray160[2] = 6073;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "FireMaking Hood";
class8.aByteArray178 = "Its A FireMaking Hood".getBytes();
}
if(i == 14091) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 99;
class8.anIntArray160[1] = 99;
class8.anIntArray160[2] = 99;
class8.anIntArray160[3] = 99;
class8.anInt174 = 4164; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4196; //Male
class8.anInt200 = 7194; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "RuneCrafting Cape";
class8.aByteArray178 = "Its A firemaking Cape(t)".getBytes();
}
if(i == 14092) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4164; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4196; //Male
class8.anInt200 = 7194; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "RuneCrafting Cape(t)";
class8.aByteArray178 = "Its A firemaking Cape(t)".getBytes();
}
if(i == 14093)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 99;
class8.anIntArray160[1] = 99;
class8.anIntArray160[2] = 99;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "RuneCrafting Hood";
class8.aByteArray178 = "Its A RuneCrafting Hood".getBytes();
}
if(i == 14094) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 99;
class8.anIntArray160[1] = 99;
class8.anIntArray160[2] = 99;
class8.anIntArray160[3] = 99;
class8.anInt174 = 4168; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4190; //Male
class8.anInt200 = 7188; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Hitpoint Cape";
class8.aByteArray178 = "Its A Hitpoint Cape".getBytes();
}
if(i == 14095) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 926;
class8.anIntArray160[1] = 926;
class8.anIntArray160[2] = 926;
class8.anIntArray160[3] = 926;
class8.anInt174 = 4168; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4190; //Male
class8.anInt200 = 7188; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Hitpoint Cape(t)";
class8.aByteArray178 = "Its A Hitpoint Cape(t)".getBytes();
}
if(i == 14096)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 99;
class8.anIntArray160[1] = 99;
class8.anIntArray160[2] = 99;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Hitpoint Hood";
class8.aByteArray178 = "Its A Hitpoint Hood".getBytes();
}
if(i == 14097) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 43932;
class8.anIntArray160[1] = 43932;
class8.anIntArray160[2] = 43932;
class8.anIntArray160[3] = 43932;
class8.anInt174 = 4157; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4180; //Male
class8.anInt200 = 7177; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Agility Cape";
class8.aByteArray178 = "Its A Agility Cape".getBytes();
}
if(i == 14098) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 677;
class8.anIntArray160[1] = 677;
class8.anIntArray160[2] = 801;
class8.anIntArray160[3] = 924;
class8.anInt174 = 4157; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4180; //Male
class8.anInt200 = 7177; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Agility Cape(t)";
class8.aByteArray178 = "Its A Agility Cape(t)".getBytes();
}
if(i == 14099)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 43934;
class8.anIntArray160[1] = 43934;
class8.anIntArray160[2] = 43934;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Agility Hood";
class8.aByteArray178 = "Its A Agility Hood".getBytes();
}
if(i == 14100) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22416;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anIntArray160[3] = 22416;
class8.anInt174 = 4167; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4189; //Male
class8.anInt200 = 7187; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Herblore Cape";
class8.aByteArray178 = "Its A Herblore Cape".getBytes();
}
if(i == 14101) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4167; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4189; //Male
class8.anInt200 = 7187; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Herblore Cape(t)";
class8.aByteArray178 = "Its A Herblore Cape(t)".getBytes();
}
if(i == 14102)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22416;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Herblore Hood";
class8.aByteArray178 = "Its A Herblore Hood".getBytes();
}
if(i == 14103)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 51120;
class8.anIntArray160[1] = 51120;
class8.anIntArray160[2] = 51120;
class8.anIntArray160[3] = 51120;
class8.anInt174 = 4178; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4201; //Male
class8.anInt200 = 7198; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Thieving Cape";
class8.aByteArray178 = "Its A thieving Cape".getBytes();
}
if(i == 14104)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 16000;
class8.anIntArray160[1] = 16000;
class8.anIntArray160[2] = 16000;
class8.anIntArray160[3] = 16000;
class8.anInt174 = 4178; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4201; //Male
class8.anInt200 = 7198; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Thieving Cape(t)";
class8.aByteArray178 = "Its A Thieving Cape(t)".getBytes();
}
if(i == 14105)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 51120;
class8.anIntArray160[1] = 51120;
class8.anIntArray160[2] = 51120;
class8.anInt174 = 4203; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Thieving Hood";
class8.aByteArray178 = "Its A Thieving Hood".getBytes();
}
if(i == 14106)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 4769;
class8.anIntArray160[1] = 4769;
class8.anIntArray160[2] = 4769;
class8.anIntArray160[3] = 4769;
class8.anInt174 = 4161; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4183; //Male
class8.anInt200 = 7181; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Crafting Cape";
class8.aByteArray178 = "Its A Crafting Cape".getBytes();
}
if(i == 14107)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4161; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4183; //Male
class8.anInt200 = 7181; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "crafting Cape(t)";
class8.aByteArray178 = "Its A Crafting Cape(t)".getBytes();
}
if(i == 14108)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 4769;
class8.anIntArray160[1] = 4769;
class8.anIntArray160[2] = 4769;
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Crafting Hood";
class8.aByteArray178 = "Its A Crafting Hood".getBytes();
}
if(i == 14109)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4166; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4188; //Male
class8.anInt200 = 7186; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Fletching Cape(t)";
class8.aByteArray178 = "Its A Fletching Cape(t)".getBytes();
}
if(i == 14110)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22430;
class8.anIntArray160[1] = 22430;
class8.anIntArray160[2] = 22430;
class8.anIntArray160[3] = 22430;
class8.anInt174 = 4166; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4188; //Male
class8.anInt200 = 7186; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Fletching Cape";
class8.aByteArray178 = "Its A Fletching Cape".getBytes();
}
if(i == 14111)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22430;
class8.anIntArray160[1] = 22430;
class8.anIntArray160[2] = 22430;
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Fletching Hood";
class8.aByteArray178 = "Its A Fletching Hood".getBytes();
}
if(i == 14112)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6;
class8.anIntArray160[1] = 6;
class8.anIntArray160[2] = 6;
class8.anIntArray160[3] = 6;
class8.anInt174 = 4175; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4197; //Male
class8.anInt200 = 7195; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Slayer Cape";
class8.aByteArray178 = "Its A slayer Cape".getBytes();
}
if(i == 14113)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 912;
class8.anIntArray160[1] = 912;
class8.anIntArray160[2] = 912;
class8.anIntArray160[3] = 912;
class8.anInt174 = 4175; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4197; //Male
class8.anInt200 = 7195; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Slayer Cape";
class8.aByteArray178 = "Its A slayer Cape".getBytes();
}
if(i == 14114)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 0;//Back
class8.anIntArray160[1] = 0;//front Line
class8.anIntArray160[2] = 6;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Slayer Hood";
class8.aByteArray178 = "Its A Slayer Hood".getBytes();
}
if(i == 14118) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 10512;
class8.anIntArray160[1] = 10512;
class8.anIntArray160[2] = 10512;
class8.anIntArray160[3] = 10512;
class8.anInt174 = 4170; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4192; //Male
class8.anInt200 = 7190; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Mining Cape";
class8.aByteArray178 = "Its A mining Cape".getBytes();
}
if(i == 14119) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 38226;
class8.anIntArray160[1] = 38226;
class8.anIntArray160[2] = 38226;
class8.anIntArray160[3] = 38226;
class8.anInt174 = 4170; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4192; //Male
class8.anInt200 = 7190; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Mining Cape(t)";
class8.aByteArray178 = "Its A mining Cape(t)".getBytes();
}

if(i == 14120)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 10512;//Back
class8.anIntArray160[1] = 10512;//front Line
class8.anIntArray160[2] = 10512;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Mining Hood";
class8.aByteArray178 = "Its A Mining Hood".getBytes();
}

if(i == 14121) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 10512;
class8.anIntArray160[1] = 10512;
class8.anIntArray160[2] = 10512;
class8.anIntArray160[3] = 10512;
class8.anInt174 = 4176; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4198; //Male
class8.anInt200 = 7196; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Smithing Cape";
class8.aByteArray178 = "Its A smithing Cape".getBytes();
}
if(i == 14122) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4176; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4198; //Male
class8.anInt200 = 7196; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Smithing Cape(t)";
class8.aByteArray178 = "Its A smithing Cape(t)".getBytes();
}
if(i == 14123)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 10512;//Back
class8.anIntArray160[1] = 10512;//front Line
class8.anIntArray160[2] = 10512;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Smithing Hood";
class8.aByteArray178 = "Its A Smithing Hood".getBytes();
}
if(i == 14124) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 38226;
class8.anIntArray160[1] = 38226;
class8.anIntArray160[2] = 38226;
class8.anIntArray160[3] = 38226;
class8.anInt174 = 4165; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4187; //Male
class8.anInt200 = 7185; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Fishing Cape";
class8.aByteArray178 = "Its A fishing Cape".getBytes();
}
if(i == 14125) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt174 = 4165; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4187; //Male
class8.anInt200 = 7185; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Fishing Cape(t)";
class8.aByteArray178 = "Its A Fishing Cape(t)".getBytes();
}
if(i == 14126)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 38226;//Back
class8.anIntArray160[1] = 38226;//front Line
class8.anIntArray160[2] = 38226;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Fishing Hood";
class8.aByteArray178 = "Its A Fishing Hood".getBytes();
}
if(i == 14127) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 51000;
class8.anIntArray160[1] = 51000;
class8.anIntArray160[2] = 51000;
class8.anIntArray160[3] = 51000;
class8.anInt174 = 4160; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4182; //Male
class8.anInt200 = 7180; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "cooking Cape";
class8.aByteArray178 = "Its A Cooking Cape".getBytes();
}

if(i == 13664)
         {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.aString170 = "Dragon claws";
            class8.aByteArray178 = "A set of fighting claws.".getBytes();
            class8.anInt174 = 13699;
            class8.anInt181 = 630;
            class8.anInt190 = 268;
            class8.anInt198 = 1340;
            class8.anInt204 = 0;
            class8.anInt169 = -7;
            class8.anInt194 = -13;
            class8.anInt165 = 13698;
            class8.anInt200 = 13698;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
        }
if(i == 14128) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 926;
class8.anIntArray160[1] = 926;
class8.anIntArray160[2] = 926;
class8.anIntArray160[3] = 926;
class8.anInt174 = 4160; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4182; //Male
class8.anInt200 = 7180; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "cooking Cape(t)";
class8.aByteArray178 = "Its A Cooking Cape(t)".getBytes();
}
if(i == 14129)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 51136;//Back
class8.anIntArray160[1] = 51136;//front Line
class8.anIntArray160[2] = 51136;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Cooking Hood";
class8.aByteArray178 = "Its A Cooking Hood".getBytes();
}

if(i == 14133)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 5560;
class8.anIntArray160[1] = 5560;
class8.anIntArray160[2] = 5560;
class8.anIntArray160[3] = 5560;
class8.anInt174 = 4174; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4200; //Male
class8.anInt200 = 7199; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "woodcutting Cape";
class8.aByteArray178 = "Its A woodcutting Cape".getBytes();
}
if(i == 14134)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22430;
class8.anIntArray160[1] = 22430;
class8.anIntArray160[2] = 22430;
class8.anIntArray160[3] = 22430;
class8.anInt174 = 4174; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4200; //Male
class8.anInt200 = 7199; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.aString170 = "woodcutting Cape";
class8.aByteArray178 = "Its A woodcutting Cape".getBytes();
}
if(i == 14135)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 5560;//Back
class8.anIntArray160[1] = 5560;//front Line
class8.anIntArray160[2] = 5560;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Woodcutting Hood";
class8.aByteArray178 = "Its A woodcutting Hood".getBytes();
}
if(i == 14136)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 22416;
class8.anIntArray160[1] = 22416;
class8.anIntArray160[2] = 22416;
class8.anIntArray160[3] = 22416;
class8.anInt174 = 4163; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4185; //Male
class8.anInt200 = 7183; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Farming Cape";
class8.aByteArray178 = "Its A Farming Cape".getBytes();
}

if(i == 14137)
{
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 8256;
            class8.anIntArray160[0] = 22416;
            class8.anIntArray156[1] = 54183;
            class8.anIntArray160[1] = 22416;
            class8.anIntArray156[2] = 57280;
            class8.anIntArray160[2] = 22416;
            class8.anIntArray156[3] = 960;
            class8.anIntArray160[3] = 22416;
            class8.anIntArray156[4] = 22464;
            class8.anIntArray160[4] = 22416;
            class8.anIntArray156[5] = 21568;
            class8.anIntArray160[5] = 22416;
class8.anInt174 = 4163; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4185; //Male
class8.anInt200 = 7183; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Farming Cape(t)";
class8.aByteArray178 = "Its A Farming Cape(t)".getBytes();
}
if(i == 14138)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 22416;//Back
class8.anIntArray160[1] = 22416;//front Line
class8.anIntArray160[2] = 22416;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Farming Hood";
class8.aByteArray178 = "Its A Farming Hood".getBytes();
}
if(i == 14139)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 38226;
class8.anIntArray160[1] = 38226;
class8.anIntArray160[2] = 38226;
class8.anIntArray160[3] = 38226;
class8.anInt174 = 4172; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4194; //Male
class8.anInt200 = 7192; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Quest Cape";
class8.aByteArray178 = "Its A quest Cape".getBytes();
}
if(i == 14140)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 38226;//Back
class8.anIntArray160[1] = 38226;//front Line
class8.anIntArray160[2] = 38226;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Quest Hood";
class8.aByteArray178 = "Its A Quest Hood".getBytes();
}


if(i == 14115) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 6340;
class8.anIntArray160[1] = 6338;
class8.anIntArray160[2] = 6338;
class8.anIntArray160[3] = 6340;
class8.anInt190 = 0;//ModelRotation1
class8.anInt198 = 0;//modelrotate2 side ways increase to move right in circle
class8.anInt169 = 0;// modeloffset1 increase to move to the right
class8.anInt194 = 0;//modeloffset2 increase to move up
class8.anInt174 = 4156; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4179; //Male
class8.anInt200 = 7179; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Const. Cape";
class8.aByteArray178 = "Its A ConstructionCape".getBytes();
}
if(i == 14116) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 9152;
class8.anIntArray160[1] = 7104;
class8.anIntArray160[2] = 7104;
class8.anIntArray160[3] = 796;
class8.anInt190 = 0;//ModelRotation1
class8.anInt198 = 0;//modelrotate2 side ways increase to move right in circle
class8.anInt169 = 0;// modeloffset1 increase to move to the right
class8.anInt194 = 0;//modeloffset2 increase to move up
class8.anInt174 = 4156; //Inv & Ground
class8.anInt181 = 2000; //Zoom
class8.anInt190 = 572;
class8.anInt198 = 0;
class8.anInt204 = 0;
class8.anInt169 = 0;
class8.anInt194 = 1;
class8.anInt165 = 4179; //Male
class8.anInt200 = 7179; //Female
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;//noteable
class8.aString170 = "Const. Cape(t)";
class8.aByteArray178 = "Its A ConstructionCape".getBytes();
}
if(i == 14117)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 960;
class8.anIntArray156[1] = 22464;
class8.anIntArray156[2] = 43968;
class8.anIntArray160[0] = 6340;//Back
class8.anIntArray160[1] = 6340;//front Line
class8.anIntArray160[2] = 6340;//Inside
class8.anInt174 = 4203; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 0; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 4202;//male wearing
class8.anInt200 = 4202;//female wearing
class8.aString170 = "Const. Hood";
class8.aByteArray178 = "Its A Quest Hood".getBytes();
}









if(i == 6570)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 9631; //Model ID

class8.aBoolean176 = false;//Stackable
}
if(i == 13601)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 28; // colors
class8.anIntArray156[0] = 74; // colors
class8.anIntArray160[0] = 38676; // colors
class8.anIntArray160[0] = 38313; // colors
class8.anInt174 = 4671; //Model ID
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
class8.aString170 = "Rune defender";//Name of the new item
class8.aByteArray178 = "A defensive weapon.".getBytes();//examin info
        }
              if(i == 13602)  // change this if you need to "item number"
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wield";
		            class8.anIntArray156 = new int[1];
		            class8.anIntArray160 = new int[1];
		class8.anIntArray156[0] = 28; // colors
		class8.anIntArray156[0] = 74; // colors
		class8.anIntArray160[0] = 38676; // colors
		class8.anIntArray160[0] = 924; // colors
		class8.anInt174 = 4671; //Model ID - 15335 -These are the models I over wrote for it
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
		            class8.aString170 = "Dragon defender";
		            class8.aByteArray178 = "A defensive weapon.".getBytes();
        }
  if(i == 13603)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 28;
            class8.anIntArray156[0] = 74;
            class8.anIntArray160[0] = 10512;
            class8.anIntArray160[0] = 10512;
            class8.anInt174 = 4671;
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
            class8.aString170 = "Barrows defender";
            class8.aByteArray178 = "A defensive weapon.".getBytes();
        }

if(i == 430)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 4673; //Model ID
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
class8.aString170 = "Fighter Torso";//Name of the new item
class8.aByteArray178 = "Its A fighter Torso".getBytes();//examin info
        }

if(i == 4827)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 4676; //Model ID
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
class8.aString170 = "Dark bow";//Name of the new item
class8.aByteArray178 = "A very PowerFull Bow".getBytes();//examin info
        }
if(i == 2904)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 4678; //Model ID
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
class8.aString170 = "Dragon Boots";//Name of the new item
class8.aByteArray178 = "A nice pair Of boots".getBytes();//examin info
        }
        if(i == 15350)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 28135;
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
            class8.aString170 = "Bandos boots";
            class8.aByteArray178 = "A nice set of Bandos boots, worn once by the god Bandos.".getBytes();
        }
        if(i == 15348)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
class8.anInt174 = 28133;
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
            class8.aString170 = "Bandos Chestplate";
            class8.aByteArray178 = "Its A Bandos Chestplate".getBytes();
        }
        if(i == 15349)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
class8.anInt174 = 28131;
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
            class8.aString170 = "Bandos tassets";
            class8.aByteArray178 = "Its A Bandos Tassets".getBytes();
        }
if(i == 15345) //id
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 28139;
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
class8.aString170 = "Armadyl Helm";
class8.aByteArray178 = "Its an Armadyl Helm".getBytes();
}
if (i == 15346) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 28141;
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
class8.aString170 = "Armadyl chestplate";
class8.aByteArray178 = "Provides excellent protection.".getBytes();
}
if (i == 15347) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 28132;
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
class8.aString170 = "Armadyl plateskirt";
class8.aByteArray178 = "Provides excellent protection.".getBytes();
}
if(i == 3753)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7202; //Model ID
class8.aBoolean176 = false;//Stackable
class8.anInt181 = 984; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 7200;//male wearing
class8.anInt200 = 7201;//female wearing
class8.anInt204 = 28;
class8.anInt175 = -1;//Unknown
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Helm of neitiznot";//Name of the new item
class8.aByteArray178 = "Its A Helm of neitiznot".getBytes();//examin info
      }
if(i == 15195)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7205; //Model ID
class8.anInt181 = 984; //zoom increase will make it smaller
class8.anInt190 = 126; //model rotate up+down increase to move doen away from you
class8.anInt198 = 129; //model rotate side ways increase to move right in circle
class8.anInt169 = -1; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt204 = 28;
class8.anInt165 = 7204;//male wearing
class8.anInt200 = 7203;//female wearing
class8.anInt175 = -1;//Unknown
class8.aBoolean176 = false;//Stackable
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "Dragon Full Helm";//Name of the new item
class8.aByteArray178 = "Its A Dragon Full Helm".getBytes();//examin info
      }
if(i == 14512)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7169; //Model ID
class8.anInt181 = 1200; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 7148;//male wearing
class8.anInt200 = 7163;//female wearing
class8.anInt164 = 7152;//Female arms/sleeves
class8.anInt188 = 7138;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age plateBody";//Name of the new item
class8.aByteArray178 = "A ancient PlateBody".getBytes();//examin info
        }
if(i == 14511)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7167; //Model ID
class8.anInt181 = 1740; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 4; // model offset increase to move to the right
class8.anInt194 = 11; //model offset increase to move up
class8.anInt165 = 7145;//male wearing
class8.anInt200 = 7159;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age plateLegs";//Name of the new item
class8.aByteArray178 = "A ancient Platelegs".getBytes();//examin info
        }
if(i == 14513)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7166; //Model ID
class8.anInt181 = 720; //zoom increase will make it smaller
class8.anInt190 = 28; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1892; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7142;//male wearing
class8.anInt200 = 7156;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Full helm";//Name of the new item
class8.aByteArray178 = "A ancient Full helm".getBytes();//examin info
        }
if(i == 14514)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7168; //Model ID
class8.anInt181 = 2030; //zoom increase will make it smaller
class8.anInt190 = 364; //model rotate up+down increase to move doen away from you
class8.anInt198 = 56; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7151;//male wearing
class8.anInt200 = 7151;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age KiteShield";//Name of the new item
class8.aByteArray178 = "A ancient Kiteshield".getBytes();//examin info
        }
if(i == 14507)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7172; //Model ID
class8.anInt181 = 2083; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7149;//male wearing
class8.anInt200 = 7164;//female wearing
class8.anInt164 = 7153;//Female arms/sleeves
class8.anInt188 = 7139;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Robe Top";//Name of the new item
class8.aByteArray178 = "A ancient Robe Top".getBytes();//examin info
        }
if(i == 14508)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7171; //Model ID
class8.anInt181 = 2083; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 7146;//male wearing
class8.anInt200 = 7160;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Robe";//Name of the new item
class8.aByteArray178 = "A ancient Robe".getBytes();//examin info
        }
if(i == 14509)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7170; //Model ID
class8.anInt181 = 917; //zoom increase will make it smaller
class8.anInt190 = 212; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1883; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7143;//male wearing
class8.anInt200 = 7157;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Mage Hat";//Name of the new item
class8.aByteArray178 = "A ancient hat".getBytes();//examin info
        }
if(i == 14503)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7175; //Model ID
class8.anInt181 = 1200; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 7150;//male wearing
class8.anInt200 = 7165;//female wearing
class8.anInt164 = 7154;//Female arms/sleeves
class8.anInt188 = 7140;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Range Top";//Name of the new item
class8.aByteArray178 = "A ancient Range Top".getBytes();//examin info
        }
if(i == 14504)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7174; //Model ID
class8.anInt181 = 1827; //zoom increase will make it smaller
class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
class8.anInt198 = 0; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 1; //model offset increase to move up
class8.anInt165 = 7147;//male wearing
class8.anInt200 = 7161;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Range Legs";//Name of the new item
class8.aByteArray178 = "A ancient Range Legs".getBytes();//examin info
        }
if(i == 14504)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7173; //Model ID
class8.anInt181 = 917; //zoom increase will make it smaller
class8.anInt190 = 212; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1883; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7144;//male wearing
class8.anInt200 = 7158;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age Range Coif";//Name of the new item
class8.aByteArray178 = "A ancient Range coif".getBytes();//examin info
        }
if(i == 14505)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 7176; //Model ID
class8.anInt181 = 740; //zoom increase will make it smaller
class8.anInt190 = 196; //model rotate up+down increase to move doen away from you
class8.anInt198 = 1784; //model rotate side ways increase to move right in circle
class8.anInt169 = 0; // model offset increase to move to the right
class8.anInt194 = 0; //model offset increase to move up
class8.anInt165 = 7141;//male wearing
class8.anInt200 = 7155;//female wearing
class8.anInt164 = -1;//Female arms/sleeves
class8.anInt188 = -1;//male arms/sleeves
class8.aBoolean176 = false;//Stackable
class8.aString170 = "3rd Age vambraces";//Name of the new item
class8.aByteArray178 = "A ancient vambraces".getBytes();//examin info
        }
if(i == 15989)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 4678; //Model ID
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
class8.aString170 = "Red Boots";//Name of the new item
class8.aByteArray178 = "Just Some Old Red Boots.".getBytes();//examin info
        }
if(i == 14571)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 32465;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 64449;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Mod Sgs Platelegs";
    class8.aByteArray178 = "A set of Mod Sgs's platelegs.".getBytes();
}
if(i == 9172)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 0;
    class8.anIntArray160[0] = 0;
    class8.anInt174 = 12234;
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
    class8.aString170 = "Bandos C'Bow";
    class8.aByteArray178 = "A great bow, used by the best warriors.".getBytes();
}
if(i == 9173)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 0;
    class8.anIntArray160[0] = 0;
    class8.anInt174 = 13421;
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
    class8.aString170 = "Dragon C'Bow";
    class8.aByteArray178 = "A powerful and rare crossbow".getBytes();
}
if(i == 9015)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 9226;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9233;
    class8.anInt200 = 9233;
    class8.aString170 = "Death Cape (blue)";
    class8.aByteArray178 = "Its A Death Cape (blue)".getBytes();
}
if(i == 9014)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 9232;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9231;
    class8.anInt200 = 9231;
    class8.aString170 = "Death Cape (green)";
    class8.aByteArray178 = "Its A Death Cape (green)".getBytes();
}
if(i == 9013)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 9230;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9229;
    class8.anInt200 = 9229;
    class8.aString170 = "Death Cape (sky)";
    class8.aByteArray178 = "Its A Death Cape (sky)".getBytes();
}
if(i == 9012)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 9228;
    class8.anInt181 = 467;
    class8.anInt190 = 74;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -4;
    class8.anInt165 = 9227;
    class8.anInt200 = 9227;
    class8.aString170 = "Mod Sgs Death Cape";
    class8.aByteArray178 = "Its Mod Sgs's Death cape".getBytes();
}
if(i == 12312)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 6073;       
class8.anInt174 = 2451;
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
    class8.aString170 = "Orange cavalier";
    class8.aByteArray178 = "a Orange cavalier".getBytes();
}
if(i == 12313)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 51136;       
class8.anInt174 = 2451;
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
    class8.aString170 = "Purple cavalier";
    class8.aByteArray178 = "a Purple cavalier".getBytes();
}
if(i == 12314)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 25;       
class8.anInt174 = 2451;
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
    class8.aString170 = "Unknown Color cavalier";
    class8.aByteArray178 = "a Unknown Color cavalier".getBytes();
}
if(i == 12315)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 950;       
class8.anInt174 = 2451;
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
    class8.aString170 = "Red cavalier";
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
class8.anInt174 = 7720;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal boots";
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
class8.anInt174 = 7743;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal gloves";
class8.aByteArray178 = "Its a lord marshal gloves".getBytes();
}
if(i == 16030)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 8245;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 8245;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Dark Gray santa hat ";
    class8.aByteArray178 = "Dark Gray santa hat.".getBytes();
}
if(i == 16031)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 18105;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 18105;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Lime Green santa hat ";
    class8.aByteArray178 = "Lime Green santa hat.".getBytes();
}
if(i == 16032)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 45549;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 45549;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Unknowed White santa hat ";
    class8.aByteArray178 = "Unknowed White santa hat.".getBytes();
}
if(i == 16033)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 50971;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 50971;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Deep Purple santa hat ";
    class8.aByteArray178 = "Deep Purple santa hat.".getBytes();
}
if(i == 16034)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 60176;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 60176;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Deeper Purple santa hat ";
    class8.aByteArray178 = "Deeper Purple santa hat.".getBytes();
}
if(i == 16035)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 19213;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 19213;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Deep Green santa hat ";
    class8.aByteArray178 = "Deep Green santa hat.".getBytes();
}
if(i == 16035)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 3654;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 3654;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Dull Orange santa hat ";
    class8.aByteArray178 = "Dull Orange santa hat.".getBytes();
}
if(i == 16036)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 12904;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 12904;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Bright Yellow santa hat ";
    class8.aByteArray178 = "Bright Yellow santa hat.".getBytes();
}
if(i == 16037)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 618;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 618;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Bright Pink santa hat ";
    class8.aByteArray178 = "Bright Pink santa hat.".getBytes();
}
if(i == 16038)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 46440;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 46440;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Bright Blue santa hat ";
    class8.aByteArray178 = "Bright Blue santa hat.".getBytes();
}
if(i == 16039)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 11378;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 11378;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Bright Gray santa hat ";
    class8.aByteArray178 = "Bright Gray santa hat.".getBytes();
}
if(i == 16040)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 36207;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 36207;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Bright Sky Blue santa hat ";
    class8.aByteArray178 = "Bright Sky Blue santa hat.".getBytes();
}
if(i == 16041)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 32562;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 32562;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Teal santa hat ";
    class8.aByteArray178 = "Teal santa hat.".getBytes();
}
if(i == 16042)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 933;
    class8.anIntArray160[0] = 8245;
    class8.anIntArray156[1] = 10351;
    class8.anIntArray160[1] = 8245;
    class8.anInt174 = 2537;
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
    class8.aString170 = "Dark Gray santa hat ";
    class8.aByteArray178 = "Dark Gray santa hat.".getBytes();
}

if(i == 15612)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 32984;       
class8.anInt174 =  5412;
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
    class8.aString170 = "Diamond Whip";
    class8.aByteArray178 = "a Diamond Whip".getBytes();
}


if(i == 15613)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 33;  
class8.anIntArray160[0] = 32984;   
class8.anIntArray156[1] = 49;  
class8.anIntArray160[1] = 32984;
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 32984;    
class8.anInt174 = 2558;
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
    class8.aString170 = "Diamond chainbody";
    class8.aByteArray178 = "a Diamond chainbody".getBytes();
}

if(i == 15614)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 24;  
class8.anIntArray160[0] = 32984;   
class8.anIntArray156[1] = 61;  
class8.anIntArray160[1] = 32984;
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 32984;    
class8.anInt174 = 2605;
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
    class8.aString170 = "Diamond Platebody";
    class8.aByteArray178 = "a Diamond Platebody".getBytes();
}

if(i == 15615)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 32984;   
class8.anInt174 = 2833;
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
    class8.aString170 = "Diamond Med Helm";
    class8.aByteArray178 = "a Diamond Med Helm".getBytes();
}

if(i == 15616)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 32984;   
class8.anIntArray156[1] = 926;  
class8.anIntArray160[1] = 48030;   
class8.anInt174 = 2813;
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
    class8.aString170 = "Diamond full Helm";
    class8.aByteArray178 = "a Diamond full Helm".getBytes();
}

if(i == 15617)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 32984;   
class8.anIntArray156[1] = 41;  
class8.anIntArray160[1] = 32984;   
class8.anIntArray156[2] = 57;  
class8.anIntArray160[2] = 32984;  
class8.anInt174 = 2582;
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
    class8.aString170 = "Diamond Platelegs";
    class8.aByteArray178 = "a Diamond platelegs".getBytes();
}
if(i == 15040)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11003;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Black trimmed-armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full black T.".getBytes();
}
if(i == 15039)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11002;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Red D'hide armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full Red D'hide. ".getBytes();
}
if(i == 15038)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11009;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Donators-items set";
class8.aByteArray178 = "If you Separate it,you will get all the donators item!".getBytes();
}
if(i == 15037)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11008;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Void Knight armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get Full Void!".getBytes();
}
if(i == 15036)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11007;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Dharok armour set (I)";
class8.aByteArray178 = "Full Dharok! (Helm,Plate,Legs,Axe).".getBytes();
}
if(i == 15035)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11006;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Armadyl armour set (I)";
class8.aByteArray178 = "Full Armadyl + Ags (Armadyl God Sword).".getBytes();
}
if(i == 15034)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11005;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Zamarok armour set (I)";
class8.aByteArray178 = "Full Zamarok,includes helm,plate,legs,kite!".getBytes();
}
if(i == 15033)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11004;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Skill Capes set (I)";
class8.aByteArray178 = "Includes all skill capes that bobs sell!".getBytes();
}
if(i == 15032)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11000;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Saradomin armour set (I)";
class8.aByteArray178 = "Includes saradomin helm,plate,legs,kite!".getBytes();
}
if(i == 15031)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11023;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Ahrim armour set (I)";
class8.aByteArray178 = "Full Ahrim! (Helm,Plate,Legs,Staff).".getBytes();
}
if(i == 15030)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11022;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Godswords set (I)";
class8.aByteArray178 = "Includes all godswords!(Ags+Sgs+Zgs+Bgs).".getBytes();
}
if(i == 15029)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11021;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Black trimmed-armour set (I)";
class8.aByteArray178 = "If you Separate it,you will get a full black T.".getBytes();
}
if(i == 15028)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11020;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Guthix armour set (I)";
class8.aByteArray178 = "Includes guthix helm,plate,legs,kite!".getBytes();
}
if(i == 15027)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11019;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Initiate armour set (I)";
class8.aByteArray178 = "Includes Initiate helm,plate,legs.".getBytes();
}
if(i == 15026)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11018;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Green D'hide armour set (I)";
class8.aByteArray178 = "It has full Green D'hide armour!".getBytes();
}
if(i == 15025)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11017;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Verac armour set (I)";
class8.aByteArray178 = "Full Verac! (Helm,Chest,Skirt,Falil!).".getBytes();
}
if(i == 15024)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11016;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Blue D'hide armour set (I)";
class8.aByteArray178 = "It has full Blue D'hide armour!".getBytes();
}
if(i == 15023)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11015;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Guthan armour set (I)";
class8.aByteArray178 = "Full Guthan! (Helm,Chest,Skirt,Warspear!).".getBytes();
}
if(i == 15022)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11014;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Saradomin armour set (I)";
class8.aByteArray178 = "Includes saradomin helm,plate,legs,kite!".getBytes();
}
if(i == 15021)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11013;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "Torag armour set (I)";
class8.aByteArray178 = "Full Torag! (Helm,Plate,Legs,Hammers).".getBytes();
}
if(i == 15020)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11011;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "uknown";
class8.aByteArray178 = "A g.e boxset.".getBytes();
}
if(i == 15019)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[3] = "Separate";
class8.anInt174 = 11010;
class8.anInt181 = 2000; // zoom; increase will make it smaller
class8.anInt190 = 245; // model rotate; up+down increase to move down away from you
class8.anInt198 = 80; // model rotate; side ways increase to move right in circle
class8.anInt169 = -2; // model offset; increase to move to the right
class8.anInt194 = 3; // model offset; increase to move up
class8.aString170 = "unknown";
class8.aByteArray178 = "A g.e boxset.".getBytes();
}
if(i == 14343)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 10394;
    class8.anIntArray160[0] = 6069;
    class8.anIntArray156[1] = 6020;
    class8.anIntArray160[1] = 6020;
    class8.anInt174 = 6583;
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
    class8.aString170 = "Lava Helm";
    class8.aByteArray178 = "It's a Lava helm".getBytes();
}
if(i == 14338)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 6072;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 6054;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Lava Platelegs";
    class8.aByteArray178 = "Lava platelegs".getBytes();
}
if(i == 14342)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[3];
    class8.anIntArray160 = new int[3];
    class8.anIntArray156[0] = 10283;
    class8.anIntArray160[0] = 6069;
    class8.anIntArray156[1] = 10270;
    class8.anIntArray160[1] = 6073;
    class8.anIntArray156[2] = 3326;
    class8.anIntArray160[2] = 6074;
    class8.anInt174 = 8700;
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
    class8.aString170 = "Lava Gauntlets";
    class8.aByteArray178 = "Lava Gauntlets.".getBytes();
}
if(i == 14339)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[5];
    class8.anIntArray160 = new int[5];
    class8.anIntArray156[0] = 914;
    class8.anIntArray160[0] = 6070;
    class8.anIntArray156[1] = 918;
    class8.anIntArray160[1] = 6070;
    class8.anIntArray156[2] = 922;
    class8.anIntArray160[2] = 6071;
    class8.anIntArray156[3] = 391;
    class8.anIntArray160[3] = 6070;
    class8.anIntArray156[4] = 917;
    class8.anIntArray160[4] = 6069;
    class8.anInt181 = 1100;
    class8.anInt190 = 568;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = 2;
    class8.anInt165 = 3820;
    class8.anInt200 = 3821;
    class8.anInt174 = 3823;
    class8.anInt188 = 156;
    class8.anInt164 = 337;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Lava Chainmail";
    class8.aByteArray178 = "It's a Lava Chain".getBytes();
}
if(i == 14340)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[3];
    class8.anIntArray160 = new int[3];
    class8.anIntArray156[0] = 43127;
    class8.anIntArray160[0] = 6073;
    class8.anIntArray156[1] = 38119;
    class8.anIntArray160[1] = 6069;
    class8.anIntArray156[2] = 36975;
    class8.anIntArray160[2] = 6069;
    class8.anInt174 = 5198;
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
    class8.aString170 = "Lava shield";
    class8.aByteArray178 = "Lava shield".getBytes();
}
if(i == 14341)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
    class8.anIntArray160 = new int[4];
    class8.anIntArray156[0] = 61;
    class8.anIntArray160[0] = 6073;
    class8.anInt174 = 5037;
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
    class8.aString170 = "Lava Boots";
    class8.aByteArray178 = "Lava boots".getBytes();
}
if(i == 14243)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 10394;
    class8.anIntArray160[0] = -22221;
    class8.anIntArray156[1] = 6020;
    class8.anIntArray160[1] = -22221;
    class8.anInt174 = 6583;
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
    class8.aString170 = "Blue Dragon Helm";
    class8.aByteArray178 = "It's a Blue Dragon helm".getBytes();
}
if(i == 14238)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = -22221;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = -22221;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Blue Dragon Platelegs";
    class8.aByteArray178 = "Blue Dragon platelegs".getBytes();
}
if(i == 14242)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[3];
    class8.anIntArray160 = new int[3];
    class8.anIntArray156[0] = 10283;
    class8.anIntArray160[0] = -22221;
    class8.anIntArray156[1] = 10270;
    class8.anIntArray160[1] = -22221;
    class8.anIntArray156[2] = 3326;
    class8.anIntArray160[2] = -22221;
    class8.anInt174 = 8700;
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
    class8.aString170 = "Blue Dragon Gauntlets";
    class8.aByteArray178 = "Blue Dragon Gauntlets.".getBytes();
}
if(i == 14239)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[5];
    class8.anIntArray160 = new int[5];
    class8.anIntArray156[0] = 914;
    class8.anIntArray160[0] = -22221;
    class8.anIntArray156[1] = 918;
    class8.anIntArray160[1] = -22221;
    class8.anIntArray156[2] = 922;
    class8.anIntArray160[2] = -22221;
    class8.anIntArray156[3] = 391;
    class8.anIntArray160[3] = -22221;
    class8.anIntArray156[4] = 917;
    class8.anIntArray160[4] = -22221;
    class8.anInt181 = 1100;
    class8.anInt190 = 568;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = 2;
    class8.anInt165 = 3820;
    class8.anInt200 = 3821;
    class8.anInt174 = 3823;
    class8.anInt188 = 156;
    class8.anInt164 = 337;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Blue Dragon chainbody";
    class8.aByteArray178 = "It's a Blue Dragon Chain".getBytes();
}
if(i == 14240)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[3];
    class8.anIntArray160 = new int[3];
    class8.anIntArray156[0] = 43127;
    class8.anIntArray160[0] = 43968;
    class8.anIntArray156[1] = 38119;
    class8.anIntArray160[1] = 43968;
    class8.anIntArray156[2] = 36975;
    class8.anIntArray160[2] = 43968;
    class8.anInt174 = 5198;
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
    class8.aString170 = "Blue shield";
    class8.aByteArray178 = "Blue shield".getBytes();
}
if(i == 14241)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
    class8.anIntArray160 = new int[4];
    class8.anIntArray156[0] = 61;
    class8.anIntArray160[0] = 43968;
    class8.anInt174 = 5037;
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
    class8.aString170 = "Blue Boots";
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
class8.anInt174 = 13304;                
class8.anInt164 = -1;
class8.aString170 = "Katagon platebody";
class8.aByteArray178 = "Its a Katagon platebody".getBytes();
}
if(i == 15712)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 43968;       
class8.anInt174 = 2373;
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
    class8.aString170 = "Blue scimitar";
    class8.aByteArray178 = "a Blue scimitar".getBytes();
}
if(i == 15310)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 0;
    class8.anIntArray160[0] = 0;
class8.anInt174 = 27163;
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
    class8.aString170 = "Void ranger helm";
    class8.aByteArray178 = "a Void ranger helm".getBytes();
}
if(i == 13591)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 43072;
    class8.anIntArray160[0] = 4550;
class8.anInt174 = 15282;
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
    class8.aString170 = "Void knight top";
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
class8.anInt174 = 15281;
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
    class8.aString170 = "Void knight robe";
    class8.aByteArray178 = "Its a Void knight robe".getBytes();
}
if(i == 1617){//Another Model By Comboed of Runelocus
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = null;
class8.aString170 = "Uncut diamond";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 127;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut ruby";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 931;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut emerald";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 22443;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut sapphire";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43951;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut opal";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 10465;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut jade";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 17633;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut red topaz";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 61376;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut dragonstone";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 51111;
class8.anInt174 = 2528;//Inv & Ground
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
class8.aString170 = "Uncut onyx";
class8.aByteArray178 = "This would be worth more cut.".getBytes();
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43528;
class8.anInt174 = 2528;//Inv & Ground
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
class8.anInt174 = 54104;                
class8.anInt164 = -1;
class8.aString170 = "Promethium full helm";
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
class8.anInt174 = 54230;                
class8.anInt164 = -1;
class8.aString170 = "Promethium 2h sword";
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
class8.anInt174 = 54012;                
class8.anInt164 = -1;
class8.aString170 = "Promethium platelegs ";
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
class8.anInt174 = 54166;                
class8.anInt164 = -1;
class8.aString170 = "Promethium plateskirt ";
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
class8.anInt174 = 54179;                
class8.anInt164 = -1;
class8.aString170 = "Promethium boots ";
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
class8.anInt174 = 54002;                
class8.anInt164 = -1;
class8.aString170 = "Promethium gauntlets ";
class8.aByteArray178 = "A pair of Promethium gauntlets ".getBytes();
}
if(i == 18367){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 54445;
class8.anInt165 = 56075;
class8.anInt200 = 56075;
class8.anInt181 = 1776;
class8.anInt190 = 344;
class8.anInt188 = -1;
class8.anInt198 = 0;  
class8.anInt169 = -3;              
class8.anInt164 = -1;
class8.anInt194 = 0;
class8.aString170 = "Promethium kiteshield ";
class8.aByteArray178 = "A Promethium kiteshield ".getBytes();
}
if(i == 18365){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 54171;
class8.anInt165 = 55884;
class8.anInt200 = 56539;
class8.anInt181 = 1447;
class8.anInt190 = 485;
class8.anInt188 = -1;
class8.anInt198 = 0;  
class8.anInt169 = 0;              
class8.anInt164 = -1;
class8.aString170 = "Promethium platebody";
class8.aByteArray178 = "A Promethium platebody".getBytes();
}
if(i == 11686)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 5652;       
class8.anInt174 = 28164;
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
    class8.aString170 = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}

if(i == 11687)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 5652;       
class8.anInt174 = 28145;
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
    class8.aString170 = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}
if(i == 11688)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 5652;       
class8.anInt174 = 28166;
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
    class8.aString170 = "Godsword blade";
    class8.aByteArray178 = "Its a Godsword blade".getBytes();
}
if(i == 11689)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 5652;       
class8.anInt174 = 28150;
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
    class8.aString170 = "Godsword shards";
    class8.aByteArray178 = "Its a Godsword shards".getBytes();
}
if(i == 11690)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.aStringArray189[2] = "Dismantle"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 28162;
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
    class8.aString170 = "Armadyl godsword";
    class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
}

if(i == 12316)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 10394;       
class8.anInt174 = 2451;
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
class8.aString170 = "Barrows cavalier";
class8.aByteArray178 = "a Barrows cavalier".getBytes();
}
if(i == 12317)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 7114;       
class8.anInt174 = 2451;
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
class8.aString170 = "Gold cavalier";
class8.aByteArray178 = "a Gold cavalier".getBytes();
}
if(i == 12318)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 100;       
class8.anInt174 = 2451;
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
class8.aString170 = "White cavalier";
class8.aByteArray178 = "a White cavalier".getBytes();
}
if(i == 12319)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 924;       
class8.anInt174 = 2451;
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
class8.aString170 = "Dragon cavalier";
class8.aByteArray178 = "a Dragon cavalier".getBytes();
}
if(i == 13482){ //Black Platelegs (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43072;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2582;
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
class8.aString170 = "Steel Platelegs (G)";
class8.aByteArray178 = "It's Steel Platelegs (G)".getBytes();
}
if(i == 13483){ //Black Platebody (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 22464;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43072; 
class8.anInt174 = 2378;
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
class8.aString170 = "Steel Platebody (G)";
class8.aByteArray178 = "It's a Steel Platebody (G)".getBytes();
}
if(i == 13484){ //Black Helm (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 22464; 
class8.anInt174 = 2813;
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
class8.aString170 = "Steel Helm (G)";
class8.aByteArray178 = "It's a Steel Helm (G)".getBytes();
}
if(i == 13485){ //Black Kiteshield (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43072; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2339;
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
class8.aString170 = "Steel Kiteshield (G)";
class8.aByteArray178 = "It's a Steel Kiteshield (G)".getBytes();
}
if(i == 13486){ //Black Platelegs (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43072;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 100; 
class8.anInt174 = 2582;
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
class8.aString170 = "Steel Platelegs (W)";
class8.aByteArray178 = "It's Steel Platelegs (W)".getBytes();
}
if(i == 13487){ //Black Platebody (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 100;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43072; 
class8.anInt174 = 2378;
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
class8.aString170 = "Steel Platebody (W)";
class8.aByteArray178 = "It's a Steel Platebody (W)".getBytes();
}
if(i == 13488){ //Black Helm (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 100; 
class8.anInt174 = 2813;
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
class8.aString170 = "Steel Helm (W)";
class8.aByteArray178 = "It's a Steel Helm (W)".getBytes();
}
if(i == 13489){ //Black Kiteshield (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43072; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 100; 
class8.anInt174 = 2339;
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
class8.aString170 = "Steel Kiteshield (W)";
class8.aByteArray178 = "It's a Steel Kiteshield (W)".getBytes();
}
if(i == 13490){ //Black Platelegs (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43072;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2582;
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
class8.aString170 = "Steel Platelegs (B)";
class8.aByteArray178 = "It's Steel Platelegs (B)".getBytes();
}
if(i == 13491){ //Black Platebody (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 43968;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43072; 
class8.anInt174 = 2378;
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
class8.aString170 = "Steel Platebody (B)";
class8.aByteArray178 = "It's a Steel Platebody (B)".getBytes();
}
if(i == 13492){ //Black Helm (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 43968; 
class8.anInt174 = 2813;
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
class8.aString170 = "Steel Helm (B)";
class8.aByteArray178 = "It's a Steel Helm (B)".getBytes();
}
if(i == 13493){ //Black Kiteshield (B)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43072; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2339;
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
class8.aString170 = "Steel Kiteshield (B)";
class8.aByteArray178 = "It's a Steel Kiteshield (B)".getBytes();
}
if(i == 13494){ //Steel Platelegs (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43072;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2582;
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
class8.aString170 = "Steel Platelegs (O)";
class8.aByteArray178 = "It's Steel Platelegs (O)".getBytes();
}
if(i == 13495){ //Steel Platebody (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 6073;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43072; 
class8.anInt174 = 2378;
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
class8.aString170 = "Steel Platebody (O)";
class8.aByteArray178 = "It's a Steel Platebody (O)".getBytes();
}
if(i == 13496){ //Steel Helm (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 6073; 
class8.anInt174 = 2813;
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
class8.aString170 = "Steel Helm (O)";
class8.aByteArray178 = "It's a Steel Helm (O)".getBytes();
}
if(i == 13497){ //Steel Kiteshield (O)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43072; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2339;
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
class8.aString170 = "Steel Kiteshield (O)";
class8.aByteArray178 = "It's a Steel Kiteshield (O)".getBytes();
}
if(i == 13498){ //Steel Platelegs (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43072;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2582;
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
class8.aString170 = "Steel Platelegs (P)";
class8.aByteArray178 = "It's Steel Platelegs (P)".getBytes();
}
if(i == 13499){ //Steel Platebody (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 51136;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43072; 
class8.anInt174 = 2378;
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
class8.aString170 = "Steel Platebody (P)";
class8.aByteArray178 = "It's a Steel Platebody (P)".getBytes();
}
if(i == 13500){ //Steel Helm (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 51136; 
class8.anInt174 = 2813;
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
class8.aString170 = "Steel Helm (P)";
class8.aByteArray178 = "It's a Steel Helm (P)".getBytes();
}
if(i == 13501){ //Steel Kiteshield (P)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43072;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43072; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2339;
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
class8.aString170 = "Steel Kiteshield (P)";
class8.aByteArray178 = "It's a Steel Kiteshield (P)".getBytes();
}
if(i == 13502){ //Mith Platelegs (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43297;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2582;
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
class8.aString170 = "Mith Platelegs (G)";
class8.aByteArray178 = "It's Mith Platelegs (G)".getBytes();
}
if(i == 13503){ //Mith Platebody (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 22464;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43297; 
class8.anInt174 = 2378;
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
class8.aString170 = "Mith Platebody (G)";
class8.aByteArray178 = "It's a Mith Platebody (G)".getBytes();
}
if(i == 13504){ //Mith Helm (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 22464; 
class8.anInt174 = 2813;
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
class8.aString170 = "Mith Helm (G)";
class8.aByteArray178 = "It's a Mith Helm (G)".getBytes();
}
if(i == 13505){ //Mith Kiteshield (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 57;
class8.anIntArray160[1] = 43297; 
class8.anIntArray156[2] = 7054;
class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2339;
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
class8.aString170 = "Mith Kiteshield (G)";
class8.aByteArray178 = "It's a Mith Kiteshield (G)".getBytes();
}
if(i == 13506){ //Mith Platelegs (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 43297;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 100; 
class8.anInt174 = 2582;
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
class8.aString170 = "Mith Platelegs (W)";
class8.aByteArray178 = "It's Mith Platelegs (W)".getBytes();
}
if(i == 13507){ //Mith Platebody (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 100;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 43297; 
class8.anInt174 = 2378;
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
class8.aString170 = "Mith Platebody (W)";
class8.aByteArray178 = "It's a Mith Platebody (W)".getBytes();
}
if(i == 13508){ //Mith Helm (W)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int [2];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 43297;		
class8.anIntArray156[1] = 926;
class8.anIntArray160[1] = 100; 
class8.anInt174 = 2813;
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
class8.aString170 = "Mith Helm (W)";
class8.aByteArray178 = "It's a Mith Helm (W)".getBytes();
}
        if(class8.anInt163 != -1)
            class8.method199((byte)61);
        if(!aBoolean182 && class8.aBoolean161)
        {
            class8.aString170 = "Members Object";
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
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
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
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 43297; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 100; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Mith Kiteshield (W)";
      class8.aByteArray178 = "It's a Mith Kiteshield (W)".getBytes();
      }
if(i == 13510){ //Mith Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 43297;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Mith Platelegs (B)";
      class8.aByteArray178 = "It's Mith Platelegs (B)".getBytes();
      }
if(i == 13511){ //Mith Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 43968;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 43297; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Mith Platebody (B)";
      class8.aByteArray178 = "It's a Mith Platebody (B)".getBytes();
      }
if(i == 13512){ //Mith Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 43968; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Mith Helm (B)";
      class8.aByteArray178 = "It's a Mith Helm (B)".getBytes();
      }
if(i == 13513){ //Mith Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 43297; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Mith Kiteshield (B)";
      class8.aByteArray178 = "It's a Mith Kiteshield (B)".getBytes();
      }
if(i == 13514){ //Mith Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 43297;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Mith Platelegs (O)";
      class8.aByteArray178 = "It's Mith Platelegs (O)".getBytes();
      }
if(i == 13515){ //Mith Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 6073;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 43297; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Mith Platebody (O)";
      class8.aByteArray178 = "It's a Mith Platebody (O)".getBytes();
      }
if(i == 13516){ //Mith Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 6073; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Mith Helm (O)";
      class8.aByteArray178 = "It's a Mith Helm (O)".getBytes();
      }
if(i == 13517){ //Mith Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 43297; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Mith Kiteshield (O)";
      class8.aByteArray178 = "It's a Mith Kiteshield (O)".getBytes();
      }
if(i == 13518){ //Mith Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 43297;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Mith Platelegs (P)";
      class8.aByteArray178 = "It's Mith Platelegs (P)".getBytes();
      }
if(i == 13519){ //Mith Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 51136;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 43297; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Mith Platebody (P)";
      class8.aByteArray178 = "It's a Mith Platebody (P)".getBytes();
      }
if(i == 13520){ //Mith Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 51136; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Mith Helm (P)";
      class8.aByteArray178 = "It's a Mith Helm (P)".getBytes();
      }
if(i == 13521){ //Mith Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 43297;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 43297; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Mith Kiteshield (P)";
      class8.aByteArray178 = "It's a Mith Kiteshield (P)".getBytes();
      }
if(i == 13522){ //Adamant Platelegs (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 21662;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Adamant Platelegs (G)";
      class8.aByteArray178 = "It's Adamant Platelegs (G)".getBytes();
      }
if(i == 13523){ //Adamant Platebody (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 22464;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 21662; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Adamant Platebody (G)";
      class8.aByteArray178 = "It's a Adamant Platebody (G)".getBytes();
      }
if(i == 13524){ //Adamant Helm (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 22464; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Adamant Helm (G)";
      class8.aByteArray178 = "It's a Adamant Helm (G)".getBytes();
      }
if(i == 13525){ //Adamant Kiteshield (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 21662; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Adamant Kiteshield (G)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (G)".getBytes();
      }
if(i == 13526){ //Adamant Platelegs (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 21662;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 100; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Adamant Platelegs (W)";
      class8.aByteArray178 = "It's Adamant Platelegs (W)".getBytes();
      }
if(i == 13527){ //Adamant Platebody (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 100;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 21662; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Adamant Platebody (W)";
      class8.aByteArray178 = "It's a Adamant Platebody (W)".getBytes();
      }
if(i == 13528){ //Adamant Helm (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 100; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Adamant Helm (W)";
      class8.aByteArray178 = "It's a Adamant Helm (W)".getBytes();
      }
if(i == 13529){ //Adamant Kiteshield (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 21662; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 100; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Adamant Kiteshield (W)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (W)".getBytes();
      }
if(i == 13530){ //Adamant Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 21662;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Adamant Platelegs (B)";
      class8.aByteArray178 = "It's Adamant Platelegs (B)".getBytes();
      }
if(i == 13531){ //Adamant Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 43968;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 21662; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Adamant Platebody (B)";
      class8.aByteArray178 = "It's a Adamant Platebody (B)".getBytes();
      }
if(i == 13532){ //Adamant Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 43968; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Adamant Helm (B)";
      class8.aByteArray178 = "It's a Adamant Helm (B)".getBytes();
      }
if(i == 13533){ //Adamant Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 21662; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Adamant Kiteshield (B)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (B)".getBytes();
      }
if(i == 13534){ //Adamant Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 21662;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Adamant Platelegs (O)";
      class8.aByteArray178 = "It's Adamant Platelegs (O)".getBytes();
      }
if(i == 13535){ //Adamant Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 6073;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 21662; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Adamant Platebody (O)";
      class8.aByteArray178 = "It's a Adamant Platebody (O)".getBytes();
      }
if(i == 13536){ //Adamant Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 6073; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Adamant Helm (O)";
      class8.aByteArray178 = "It's a Adamant Helm (O)".getBytes();
      }
if(i == 13537){ //Adamant Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 21662; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Adamant Kiteshield (O)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (O)".getBytes();
      }
if(i == 13538){ //Adamant Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 21662;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Adamant Platelegs (P)";
      class8.aByteArray178 = "It's Adamant Platelegs (P)".getBytes();
      }
if(i == 13539){ //Adamant Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 51136;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 21662; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Adamant Platebody (P)";
      class8.aByteArray178 = "It's a Adamant Platebody (P)".getBytes();
      }
if(i == 13540){ //Adamant Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 51136; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Adamant Helm (P)";
      class8.aByteArray178 = "It's a Adamant Helm (P)".getBytes();
      }
if(i == 13541){ //Adamant Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 21662;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 21662; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Adamant Kiteshield (P)";
      class8.aByteArray178 = "It's a Adamant Kiteshield (P)".getBytes();
      }
if(i == 13542){ //Rune Platelegs (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 36133;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Rune Platelegs (G)";
      class8.aByteArray178 = "It's Rune Platelegs (G)".getBytes();
      }
if(i == 13543){ //Rune Platebody (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 22464;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 36133; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Rune Platebody (G)";
      class8.aByteArray178 = "It's a Rune Platebody (G)".getBytes();
      }
if(i == 13544){ //Rune Helm (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 22464; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Rune Helm (G)";
      class8.aByteArray178 = "It's a Rune Helm (G)".getBytes();
      }
if(i == 13545){ //Rune Kiteshield (G)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 36133; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 22464; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Rune Kiteshield (G)";
      class8.aByteArray178 = "It's a Rune Kiteshield (G)".getBytes();
      }
if(i == 13546){ //Rune Platelegs (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 36133;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 100; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Rune Platelegs (W)";
      class8.aByteArray178 = "It's Rune Platelegs (W)".getBytes();
      }
if(i == 13547){ //Rune Platebody (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 100;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 36133; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Rune Platebody (W)";
      class8.aByteArray178 = "It's a Rune Platebody (W)".getBytes();
      }
if(i == 13548){ //Rune Helm (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 100; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Rune Helm (W)";
      class8.aByteArray178 = "It's a Rune Helm (W)".getBytes();
      }
if(i == 13549){ //Rune Kiteshield (W)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 36133; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 100; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Rune Kiteshield (W)";
      class8.aByteArray178 = "It's a Rune Kiteshield (W)".getBytes();
      }
if(i == 13550){ //Rune Platelegs (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 36133;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Rune Platelegs (B)";
      class8.aByteArray178 = "It's Rune Platelegs (B)".getBytes();
      }
if(i == 13551){ //Rune Platebody (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 43968;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 36133; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Rune Platebody (B)";
      class8.aByteArray178 = "It's a Rune Platebody (B)".getBytes();
      }
if(i == 13552){ //Rune Helm (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 43968; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Rune Helm (B)";
      class8.aByteArray178 = "It's a Rune Helm (B)".getBytes();
      }
if(i == 13553){ //Rune Kiteshield (B)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 36133; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 43968; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Rune Kiteshield (B)";
      class8.aByteArray178 = "It's a Rune Kiteshield (B)".getBytes();
      }
if(i == 13554){ //Rune Platelegs (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 36133;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Rune Platelegs (O)";
      class8.aByteArray178 = "It's Rune Platelegs (O)".getBytes();
      }
if(i == 13555){ //Rune Platebody (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 6073;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 36133; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Rune Platebody (O)";
      class8.aByteArray178 = "It's a Rune Platebody (O)".getBytes();
      }
if(i == 13556){ //Rune Helm (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 6073; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Rune Helm (O)";
      class8.aByteArray178 = "It's a Rune Helm (O)".getBytes();
      }
if(i == 13557){ //Rune Kiteshield (O)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 36133; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 6073; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Rune Kiteshield (O)";
      class8.aByteArray178 = "It's a Rune Kiteshield (O)".getBytes();
      }
if(i == 13558){ //Rune Platelegs (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 41;
      class8.anIntArray160[1] = 36133;
      class8.anIntArray156[2] = 57;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2582;
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
      class8.aString170 = "Rune Platelegs (P)";
      class8.aByteArray178 = "It's Rune Platelegs (P)".getBytes();
      }
if(i == 13559){ //Rune Platebody (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 24;
      class8.anIntArray160[1] = 51136;
      class8.anIntArray156[2] = 41;
      class8.anIntArray160[2] = 36133; 
class8.anInt174 = 2378;
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
      class8.aString170 = "Rune Platebody (P)";
      class8.aByteArray178 = "It's a Rune Platebody (P)".getBytes();
      }
if(i == 13560){ //Rune Helm (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[2];
      class8.anIntArray160 = new int [2];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 926;
      class8.anIntArray160[1] = 51136; 
class8.anInt174 = 2813;
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
      class8.aString170 = "Rune Helm (P)";
      class8.aByteArray178 = "It's a Rune Helm (P)".getBytes();
      }
if(i == 13561){ //Rune Kiteshield (P)
      class8.aStringArray189 = new String[5];
      class8.aStringArray189[1] = "Wear";
      class8.anIntArray156 = new int[3];
      class8.anIntArray160 = new int [3];
      class8.anIntArray156[0] = 61;
      class8.anIntArray160[0] = 36133;		
      class8.anIntArray156[1] = 57;
      class8.anIntArray160[1] = 36133; 
      class8.anIntArray156[2] = 7054;
      class8.anIntArray160[2] = 51136; 
class8.anInt174 = 2339;
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
      class8.aString170 = "Rune Kiteshield (P)";
      class8.aByteArray178 = "It's a Rune Kiteshield (P)".getBytes();
      }
if(i == 16004)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 18105;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Lime Green Party Hat.";
    class8.aByteArray178 = "Lime Green Party Hat.".getBytes();
}
if(i == 16005)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 45549;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Unknowed White Partyhat";
    class8.aByteArray178 = "Unknowed White Partyhat".getBytes();
}
if(i == 16006)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 50971;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Deep Purple Partyhat";
    class8.aByteArray178 = "Deep Purple Partyhat".getBytes();
}
if(i == 16007)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 60176;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Deeper Purple Partyhat";
    class8.aByteArray178 = "Deeper Purple Partyhat".getBytes();
}
if(i == 16008)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 19213;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Deep Green Partyhat";
    class8.aByteArray178 = "Deep Green Partyhat".getBytes();
}
if(i == 16009)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 3654;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Dull Orange Partyhat";
    class8.aByteArray178 = "Dull Orange Partyhat".getBytes();
}
if(i == 16010)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 12904;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Bright Yellow Partyhat";
    class8.aByteArray178 = "Bright Yellow Partyhat".getBytes();
}
if(i == 16011)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 618;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Bright Pink Partyhat";
    class8.aByteArray178 = "Bright Pink Partyhat".getBytes();
}
if(i == 16012)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 46440;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Bright Blue Partyhat";
    class8.aByteArray178 = "Bright Blue Partyhat".getBytes();
}
if(i == 16013)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 11378;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Bright Gray Partyhat";
    class8.aByteArray178 = "Bright Gray Partyhat".getBytes();
}
if(i == 16014)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 36207;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Bright Sky Blue Partyhat";
    class8.aByteArray178 = "Bright Sky Blue Partyhat".getBytes();
}
if(i == 16015)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 32562;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Teal Partyhat";
    class8.aByteArray178 = "Teal Partyhat".getBytes();
}
if(i == 16016)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 8245;
    class8.anInt174 = 2635;
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
    class8.aString170 = "Dark Gray Partyhat";
    class8.aByteArray178 = "Dark Gray Partyhat".getBytes();
}
       if(i == 16017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 18105;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Lime Green Whip";
            class8.aByteArray178 = "Lime Green whip".getBytes();
}
       if(i == 16018)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 45549;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Unknowed White Whip";
            class8.aByteArray178 = "Unknowed White whip".getBytes();
}
       if(i == 16019)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 50971;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Deep Purple Whip";
            class8.aByteArray178 = "Deep Purple whip".getBytes();
}
       if(i == 16020)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 60176;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Deeper Purple Whip";
            class8.aByteArray178 = "Deeper Purple whip".getBytes();
}
       if(i == 16021)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 19213;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Deep Green Whip";
            class8.aByteArray178 = "Deep Green whip".getBytes();
}
       if(i == 16022)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 3654;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Dull Orange Whip";
            class8.aByteArray178 = "Dull Orange whip".getBytes();
}
       if(i == 16023)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 12904;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bright Yellow Whip";
            class8.aByteArray178 = "Bright Yellow whip".getBytes();
}
       if(i == 16024)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 618;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bright Pink Whip";
            class8.aByteArray178 = "Bright Pink whip".getBytes();
}
       if(i == 16025)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 46440;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bright Blue Whip";
            class8.aByteArray178 = "Bright Blue whip".getBytes();
}
       if(i == 16026)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 11378;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bright Gray Whip";
            class8.aByteArray178 = "Bright Gray whip".getBytes();
}
       if(i == 16027)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 36207;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bright Sky Blue Whip";
            class8.aByteArray178 = "Bright Sky Blue whip".getBytes();
}
       if(i == 16028)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 32562;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Teal Whip";
            class8.aByteArray178 = "Teal whip".getBytes();
}
       if(i == 16029)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 8245;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Dark Gray Whip";
            class8.aByteArray178 = "Dark Gray whip".getBytes();
}
       if(i == 9174)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 13876;
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
            class8.aString170 = "Bronze crossbow";
            class8.aByteArray178 = "Bronze crossbow".getBytes();
}
       if(i == 9175)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 6447;
            class8.anIntArray160[0] = 8478;
            class8.anIntArray156[1] = 6443;
            class8.anIntArray160[1] = 8598;
            class8.anIntArray156[2] = 6439;
            class8.anIntArray160[2] = 8846;
            class8.anIntArray156[3] = 7054;
            class8.anIntArray160[3] = 41;
            class8.anIntArray156[4] = 5652;
            class8.anIntArray160[4] = 33;
            class8.anIntArray156[5] = 5656;
            class8.anIntArray160[5] = 24;
            class8.anInt174 = 13876;
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
            class8.aString170 = "Iron crossbow";
            class8.aByteArray178 = "Iron crossbow".getBytes();
}
if(i == 15232){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 12605;
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
class8.aString170 = "Batman cape";
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
class8.anInt174 = 7763;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal cap";
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
class8.anInt174 = 7732;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal top";
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
class8.anInt174 = 7731;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal trousers";
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
class8.anInt174 = 7751;               
class8.anInt164 = -1;
class8.aString170 = "Lord marshal skirt";
class8.aByteArray178 = "Its a lord marshal skirt".getBytes();
}
						                if (i == 11342)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 64200;
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
                        class8.aString170 = "Black Energy";
                        class8.aByteArray178 = "A strong sword made of Black energy.".getBytes();
                }
				                if (i == 11343)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 64202;
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
                        class8.aString170 = "Easter Energy sword";
                        class8.aByteArray178 = "From the easter bunny. =)".getBytes();
                }
				                if (i == 11344)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 64204;
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
                        class8.aString170 = "Green Energy sword";
                        class8.aByteArray178 = "An Green Energy Sword".getBytes();
                }
				
				                if (i == 11345)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 64206;
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
                        class8.aString170 = "Purple Energy sword";
                        class8.aByteArray178 = "An Purple Energy Sword".getBytes();
                }
				if(i == 11015){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.anInt174 = 23998;
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
     class8.aString170 = "Chicken head";
class8.aByteArray178 = "It's a Chicken head".getBytes();
}

if(i == 11016){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.anInt174 = 23997;
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
     class8.aString170 = "Chicken feet";
class8.aByteArray178 = "It's a Chicken feet".getBytes();
}
if(i == 11017){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.anInt174 = 24000;
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
     class8.aString170 = "Chicken wings";
class8.aByteArray178 = "It's a Chicken wings".getBytes();
}
if(i == 11018){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
class8.anInt174 = 23999;
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
     class8.aString170 = "Chicken legs";
class8.aByteArray178 = "It's a Chicken legs".getBytes();
}

if(i == 15678) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14200; //Inv & Ground
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
class8.aString170 = "Money cape";
class8.aByteArray178 = "Its A money cape".getBytes();
}
if(i == 14202) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 13426; //Inv & Ground
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
class8.aString170 = "Polypore staff";
class8.aByteArray178 = "Its A Polypore staff.".getBytes();
}
if(i == 15185) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14531; //Inv & Ground
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
class8.aString170 = "Dragon fire shield";
class8.aByteArray178 = "A heavy shield with a snarling, draconic visage.".getBytes();
}
        if(i == 15083)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 950;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owners Platelegs";
            class8.aByteArray178 = "A set of owners platelegs.".getBytes();
        }
		        if(i == 19083)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 950;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 95004;
            class8.anInt200 = 95004;
            class8.anInt174 = 95006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Black dragon platelegs";
            class8.aByteArray178 = "Omg, you killed that thing??".getBytes();
        }
		        if(i == 19084)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 950;
            class8.anInt181 = 1300;
            class8.anInt190 = 500;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = -1;
            class8.anInt194 = 7;
            class8.anInt165 = 95003;
            class8.anInt200 = 95007;
            class8.anInt174 = 95007;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Black dragon platebody";
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
            class8.anInt174 = 93026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Demonic Cape";
            class8.aByteArray178 = "Cache 27".getBytes();
        }
        if(i == 15084)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 950;
            class8.anInt174 = 5037;
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
            class8.aString170 = "Owners Boots";
            class8.aByteArray178 = "Owners boots".getBytes();
        }
        if(i == 15085)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57;
            class8.anIntArray160[1] = 0;
            class8.anIntArray156[2] = 7054;
            class8.anIntArray160[2] = 950;
            class8.anInt174 = 2339;
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
            class8.aString170 = "Owners Kiteshield";
            class8.aByteArray178 = "It's an owners kiteshield.".getBytes();
        }
		        if(i == 19017)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 954;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 954;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 954;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 954;
			class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 954;
			class8.anIntArray156[6] = 56230;
            class8.anIntArray160[6] = 954;
			class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 954;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and red death Cape";
            class8.aByteArray178 = "Its A Black and red death cape".getBytes();
        }
				        if(i == 19018)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 53432;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 53432;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 53432;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 53432;
		class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 53432;
	class8.anIntArray156[6] = 56230;
        class8.anIntArray160[6] = 53432;
	class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 53432;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and light purple death Cape";
            class8.aByteArray178 = "Its A Black and light purple death cape".getBytes();
        }
				        if(i == 19019)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 32691;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 32691;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 32691;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 32691;
		class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 32691;
	class8.anIntArray156[6] = 56230;
        class8.anIntArray160[6] = 32691;
	class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 32691;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and teal death Cape";
            class8.aByteArray178 = "Its A Black and teal death cape".getBytes();
        }
				        if(i == 19020)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 13221;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 13221;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 13221;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 13221;
		class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 13221;
	class8.anIntArray156[6] = 56230;
        class8.anIntArray160[6] = 13221;
	class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 13221;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and light green death Cape";
            class8.aByteArray178 = "Its A Black and light green death cape".getBytes();
        }
				        if(i == 19021)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 5039;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 5039;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 5039;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 5039;
		class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 5039;
	class8.anIntArray156[6] = 56230;
        class8.anIntArray160[6] = 5039;
	class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 5039;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and orange death Cape";
            class8.aByteArray178 = "Its A Black and orange death cape".getBytes();
        }
				        if(i == 19022)
        {
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
            class8.anIntArray156[0] = 0;
            class8.anIntArray160[0] = 125;
            class8.anIntArray156[1] = 57260;
            class8.anIntArray160[1] = 0;
			class8.anIntArray156[2] = 55218;
            class8.anIntArray160[2] = 0;
			class8.anIntArray156[3] = 55220;
            class8.anIntArray160[3] = 0;
			class8.anIntArray156[4] = 56246;
            class8.anIntArray160[4] = 0;
		class8.anIntArray156[5] = 56221;
            class8.anIntArray160[5] = 0;
	class8.anIntArray156[6] = 56230;
        class8.anIntArray160[6] = 0;
	class8.anIntArray156[7] = 57126;
            class8.anIntArray160[7] = 0;
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "white and black death Cape";
            class8.aByteArray178 = "Its A white and black death cape".getBytes();
        }
      if(i == 10887)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 13039;
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
            class8.aString170 = "Barrelchest Anchor";
            class8.aByteArray178 = "A Anchor".getBytes();
        }
      if(i == 14322)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 13768;
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
            class8.aString170 = "Twin Ghostblades";
            class8.aByteArray178 = "Most powerful weapon on GHr crafted by the Gods themselves.".getBytes();
        }
		
        if(i == 15094)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 12020;
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
            class8.aString170 = "Gnome scarf";
            class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
        }
        if(i == 9016)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9233;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9234;
            class8.anInt200 = 9234;
            class8.aString170 = "Black and yellow death Cape";
            class8.aByteArray178 = "Its A Black and yellow death cape".getBytes();
        }
        if(i == 9017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 9235;
            class8.anInt181 = 467;
            class8.anInt190 = 74;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -4;
            class8.anInt165 = 9236;
            class8.anInt200 = 9236;
            class8.aString170 = "Black and Purple death Cape";
            class8.aByteArray178 = "Its A Black and Purple death cape".getBytes();
        }
if(i == 9120)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
            class8.anInt174 = 13920;
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
            class8.aString170 = "Angel Cape";
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
class8.anInt174 = 13201;                
class8.anInt164 = -1;
class8.aString170 = "Primal kiteshield";
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
class8.anInt174 = 13204;                
class8.anInt164 = -1;
class8.aString170 = "Primal platebody";
class8.aByteArray178 = "Its a Primal platebody".getBytes();
}
if (i == 18392) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Weild";
class8.anInt174 = 13206;
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
class8.aString170 = "Primal 2h";
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
class8.anInt174 = 13209;                
class8.anInt164 = -1;
class8.aString170 = "Primal full helm";
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
class8.anInt174 = 13212;                
class8.anInt164 = -1;
class8.aString170 = "Primal platelegs";
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
class8.anInt174 = 13215;                
class8.anInt164 = -1;
class8.aString170 = "Primal plateskirt";
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
class8.anInt174 = 13218;                
class8.anInt164 = -1;
class8.aString170 = "Primal boots";
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
class8.anInt174 = 13220;                
class8.anInt164 = -1;
class8.aString170 = "Primal gauntlets";
class8.aByteArray178 = "A pair of Primal gauntlets".getBytes();
}

if(i == 10108)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 11200;       
class8.anInt174 =  5412;
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
            class8.aString170 = "Yellow Whip";
            class8.aByteArray178 = "a Yellow Whip".getBytes();
        }
if(i == 13677) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14125; //Inv & Ground
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
class8.aString170 = "Moderator cape";
class8.aByteArray178 = "Its A moderator Cape".getBytes();
}
if(i == 13678) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14127; //Inv & Ground
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
class8.aString170 = "Administrator cape";
class8.aByteArray178 = "Its an administrator cape".getBytes();
}
if(i == 13679) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14129; //Inv & Ground
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
class8.aString170 = "Owner cape";
class8.aByteArray178 = "Its an owner cape".getBytes();
        }
if(i == 1275) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 36133;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Rune pickaxe";
	class8.aByteArray178 = "It's a Rune pickaxe.".getBytes();
}
if(i == 1265) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 5652;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Bronze pickaxe";
	class8.aByteArray178 = "It's a bronze pickaxe.".getBytes();
}
if(i == 1267) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 33;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Iron pickaxe";
	class8.aByteArray178 = "It's a iron pickaxe.".getBytes();
}
if(i == 1269) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 2130;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Steel pickaxe";
	class8.aByteArray178 = "It's a steel pickaxe.".getBytes();
}
if(i == 1271) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 21662;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Adamant pickaxe";
	class8.aByteArray178 = "It's a adamant pickaxe.".getBytes();
}
if(i == 1273) {
	class8.aStringArray189 = new String[5];
	class8.aStringArray189[1] = "Wield";
	class8.anInt174 = 2529;
	class8.anIntArray156 = new int[1];
	class8.anIntArray160 = new int[1];
	class8.anIntArray156[0] = 0;
	class8.anIntArray160[0] = 43279;
	class8.anInt181 = 1382;
	class8.anInt190 = 660;
	class8.anInt198 = 997;
	class8.anInt169 = -6;
	class8.anInt194 = 1;
	class8.anInt165 = 509;
	class8.anInt200 = 509;
	class8.anInt188 = -1;
	class8.anInt164 = -1;
	class8.aString170 = "Mithril pickaxe";
	class8.aByteArray178 = "It's a mithril pickaxe.".getBytes();
}
        if(i == 10164)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 7114;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 7114;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Golden Bunny ears";
            class8.aByteArray178 = "Golden Bunny ears".getBytes();
        }
        if(i == 10165)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43968;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43968;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Blue Bunny ears";
            class8.aByteArray178 = "Its a Blue Bunny ears".getBytes();
        }
        if(i == 10166)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 950;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 950;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Red Bunny ears";
            class8.aByteArray178 = "Its a Red Bunny ears".getBytes();
        }
        if(i == 10167)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 51136;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 51136;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Purple Bunny ears";
            class8.aByteArray178 = "Its a Purple Bunny ears".getBytes();
        }
        if(i == 10168)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 22464;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 22464;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Green Bunny ears";
            class8.aByteArray178 = "Its a Green Bunny ears".getBytes();
        }
        if(i == 10169)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6073;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 6073;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Orange Bunny ears";
            class8.aByteArray178 = "Its a Orange Bunny ears".getBytes();
        }
        if(i == 10170)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 10394;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 10394;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Barrows Bunny ears";
            class8.aByteArray178 = "Its A Barrows Bunny ears".getBytes();
        }
        if(i == 10171)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 926;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 926;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Dragon Bunny ears";
            class8.aByteArray178 = "Its A Dragon Bunny ears".getBytes();
        }
        if(i == 10172)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 5652;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 5652;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bronze Bunny ears";
            class8.aByteArray178 = "Its A Bronze Bunny ears".getBytes();
        }
        if(i == 10173)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 33;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 33;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Iron Bunny ears";
            class8.aByteArray178 = "Its A Iron Bunny ears".getBytes();
        }
        if(i == 10174)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43072;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43072;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Steel Bunny ears";
            class8.aByteArray178 = "Its A Steel Bunny ears".getBytes();
        }
        if(i == 10175)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 8;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 8;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Black Bunny ears";
            class8.aByteArray178 = "Its A Black Bunny ears".getBytes();
        }
        if(i == 10176)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 43297;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 43297;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Mith Bunny ears";
            class8.aByteArray178 = "Its A Mith Bunny ears".getBytes();
        }
        if(i == 10177)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 36133;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 36133;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Rune Bunny ears";
            class8.aByteArray178 = "Its A Rune Bunny ears".getBytes();
        }
        if(i == 10178)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 21662;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 21662;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Adam Bunny ears";
            class8.aByteArray178 = "Its A Adam Bunny ears".getBytes();
        }
        if(i == 10179)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6069;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 6069;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Lava Bunny ears";
            class8.aByteArray178 = "Its A lava Bunny ears".getBytes();
        }

        if(i == 10180)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 26706;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 26706;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Ivandis Bunny ears";
            class8.aByteArray178 = "Its A Ivandis Bunny ears".getBytes();
        }
        if(i == 10181)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 62920;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 62920;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Ladies Bunny ears";
            class8.aByteArray178 = "Its A Ladies Bunny ears".getBytes();
        }

        if(i == 10182)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 10394;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 10394;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 10394;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Barrows Flowers";
            class8.aByteArray178 = "Its A Barrow Flower".getBytes();
        }


        if(i == 10183)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 926;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 926;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 926;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Dragon Flowers";
            class8.aByteArray178 = "Its A Dragon Flowers".getBytes();
        }

        if(i == 10184)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 5652;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 5652;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 5652;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Bronze Flowers";
            class8.aByteArray178 = "Its A Bronze Flowers".getBytes();
        }

        if(i == 10185)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 33;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 33;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 33;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Iron Flowers";
            class8.aByteArray178 = "Its A Iron Flowers".getBytes();
        }

        if(i == 10186)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 43072;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 43072;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 43072;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Steel Flowers";
            class8.aByteArray178 = "Its A Steel Flowers".getBytes();
        }

        if(i == 10187)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 43297;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 43297;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 43297;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Mith Flowers";
            class8.aByteArray178 = "Its A Mith Flowers".getBytes();
        }

        if(i == 10188)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 21662;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 21662;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 21662;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Adam Flowers";
            class8.aByteArray178 = "Its A Adam Flowers".getBytes();
        }

        if(i == 10189)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 48596;
            class8.anIntArray160[0] = 36133;
            class8.anIntArray156[1] = 37196;
            class8.anIntArray160[1] = 36133;
            class8.anIntArray156[2] = 53167;
            class8.anIntArray160[2] = 36133;
	    class8.anInt174 = 1781;
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
            class8.aString170 = "Rune Flowers";
            class8.aByteArray178 = "Its A Rune Flowers".getBytes();
        }
        if(i == 10190)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 32707;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 32707;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Light Blue Bunny ears";
            class8.aByteArray178 = "Its A Light Blue Bunny ears".getBytes();
        }
        if(i == 10191)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 52685;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 52685;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Light Purple Bunny ears";
            class8.aByteArray178 = "Its A Light Purple Bunny ears".getBytes();
	}
        if(i == 10192)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 13140;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 13140;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Light Yellow Bunny ears";
            class8.aByteArray178 = "Its A Light Yellow Bunny ears".getBytes();
        }
        if(i == 10193)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 20245;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 20245;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Forest Green Bunny ears";
            class8.aByteArray178 = "Its A Forest Green Bunny ears".getBytes();
        }
        if(i == 10194)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 50976;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 50976;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Dark Purple Bunny ears";
            class8.aByteArray178 = "Its A Dark Purple Bunny ears".getBytes();
        }
if (i == 12323) {
class8.aString170 = "Grim reaper hood";
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 10179;
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
class8.anInt174 = 14117; // Drop/Inv Model
class8.anInt181 = 2083;
class8.anInt190 = 572;
class8.anInt198 = 1883;
class8.anInt169 = 0;
class8.anInt194 = 0;
class8.anInt165 = 14115; // Male Wield Model
class8.anInt200 = 14115; // Female Wield
class8.anInt188 = 14116; // Male arms/sleeves (Leave as -1 if not used) and also the models come different with sleeves so i might have to redo it
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)
class8.aString170 = "Dagon'hai top"; // Item Name
class8.aByteArray178 = "A robe worn by members of the Dagon'hai.".getBytes(); // Item Examine
}
        if(i == 15067)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 38676;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Admin Platelegs";
            class8.aByteArray178 = "A set of administrators platelegs.".getBytes();
        }
        if(i == 15066)
        {
            Jukkyname("Admin Platebody", "An administrators platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
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
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            NewColor(945, 38676, 0);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15069)
        {
            NEO("G-mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 22412, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15070)
        {
            NEO("Mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 6073, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15071)
        {
            NEO("SB-mod Crown", "Made by Jukk", "Wear");
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 128, 0);
            NewColor(8128, 63, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 15072)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 38676;
            class8.anInt174 = 5037;
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
            class8.aString170 = "Admin Boots";
            class8.aByteArray178 = "Admin boots".getBytes();
        }
        if(i == 15073)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 57;
            class8.anIntArray160[1] = 8128;
            class8.anIntArray156[2] = 7054;
            class8.anIntArray160[2] = 38676;
            class8.anInt174 = 2339;
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
            class8.aString170 = "Admin Kiteshield";
            class8.aByteArray178 = "It's an administrator kiteshield.".getBytes();
        }
if(i == 12311)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[1];
        class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = -23903;       
class8.anInt174 = 2451;
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
            class8.aString170 = "Navy cavalier";
            class8.aByteArray178 = "a Navy cavalier".getBytes();
        }
        if(i == 15075)
        {
            Jukkyname("Mod Platebody", "A moderator platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
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
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 6073;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Platelegs";
            class8.aByteArray178 = "A set of moderators platelegs.".getBytes();
        }
        if(i == 15077)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anInt174 = 5037;
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
            class8.aString170 = "Mod Boots";
            class8.aByteArray178 = "Mod boots".getBytes();
        }
        if(i == 15078)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 57;
            class8.anIntArray160[1] = 63;
            class8.anIntArray156[2] = 7054;
            class8.anIntArray160[2] = 6073;
            class8.anInt174 = 2339;
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
            class8.aString170 = "Mod Kiteshield";
            class8.aByteArray178 = "It's an moderator kiteshield.".getBytes();
        }
        if(i == 15080)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 8128;
            class8.anIntArray156[1] = 41;
            class8.anIntArray160[1] = 38676;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[2] = 38676;
            class8.anIntArray156[3] = 25238;
            class8.anIntArray160[3] = 8128;
            class8.anInt174 = 4208;
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
            class8.aString170 = "Admin Plateskirt";
            class8.aByteArray178 = "It's an admin skirt".getBytes();
        }
        if(i == 15081)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 63;
            class8.anIntArray156[1] = 41;
            class8.anIntArray160[1] = 6073;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[2] = 6073;
            class8.anIntArray156[3] = 25238;
            class8.anIntArray160[3] = 63;
            class8.anInt174 = 4208;
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
            class8.aString170 = "Mod Plateskirt";
            class8.aByteArray178 = "It's a mod skirt".getBytes();
        }
        if(i == 15082)
        {
            Jukkyname("Owners Platebody", "An owners platebody.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
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
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            NewColor(945, 950, 0);
            NewColor(8128, 0, 1);
            Zoom(500, 90, 0, 0, 0, false);
            Models(8774, 8774, 8774);
        }
        if(i == 14518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 14119;
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
            class8.aString170 = "Dagon'hai hat";
            class8.aByteArray178 = "A hat worn by members of the Dagon'hai.".getBytes();
        }
        if(i == 14519)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anInt174 = 14121;
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
            class8.aString170 = "Dagon'hai Robes";
            class8.aByteArray178 = "Robes worn by members of the Dagon'hai.".getBytes();
        }
if(i == 2949){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.aString170 = "Golden Hammer";
            class8.aByteArray178 = "A Replica Hammer Made Of Solid Gold.".getBytes();
        }
if(i == 2946){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.aString170 = "Golden Tinderbox";
            class8.aByteArray178 = "A Replica Tinderbox Made Of Solid Gold.".getBytes();
        }
if(i == 773){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aString170 = "Perfect Ring";
            class8.aByteArray178 = "It's A Perfect Ring.".getBytes();
        }
        if(i == 8013)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 21662;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Adam Whip";
            class8.aByteArray178 = "Whip Made Of Adam".getBytes();
        }
        if(i == 8014)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 36133;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Rune Whip";
            class8.aByteArray178 = "Whip Made Of Rune".getBytes();
        }
        if(i == 8015)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 43297;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Mith Whip";
            class8.aByteArray178 = "Whip Made Of Mithril".getBytes();
        }
        if(i == 8016)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 8;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Black Whip";
            class8.aByteArray178 = "Whip Made Of Black".getBytes();
        }
        if(i == 8017)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 43072;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Steel Whip";
            class8.aByteArray178 = "Whip Made Of Steel".getBytes();
        }
        if(i == 8018)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 33;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Iron Whip";
            class8.aByteArray178 = "Whip Made Of Iron".getBytes();
        }
        if(i == 8019)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 5652;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Bronze Whip";
            class8.aByteArray178 = "Whip Made Of Bronze".getBytes();
        }
        if(i == 9093)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 926;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Dragon Whip";
            class8.aByteArray178 = "A whip made of Dragon".getBytes();
        }
        if(i == 10562)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 49500;
            class8.anInt174 = 2602;
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
            class8.aString170 = "sexy whip";
            class8.aByteArray178 = "hshsh".getBytes();
        }
if(i == 15679){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
			class8.anInt174 = 103;//item look
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
            class8.aString170 = "Faylin Godsword";
            class8.aByteArray178 = "A Godsword made by Faylin, a very powerful Angel.".getBytes();
        }
	if(i == 12321) {
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wield";//New option
		class8.anInt174 = 8254; //Model ID
		class8.anInt181 = 2000; //1200 zoom increase will make it smaller
		class8.anInt190 = 572; //model rotate up+down increase to move doen away from you
		class8.anInt198 = 0; //model rotate side ways increase to move right in circle
		class8.anInt169 = 0; // model offset increase to move to the right
		class8.anInt194 = 1; //model offset increase to move up
		class8.anInt165 = 8255;//male wearing
		class8.anInt200 = 8255;//female wearing
		class8.aBoolean176 = false;//Stackable
		class8.aString170 = "Long Blade Of Ulysses";//Name of the new item
		class8.aByteArray178 = "An ancient, and powerful long blade of Ulysses.".getBytes();//examine info
		}
        if(i == 2749)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 41;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[0] = 924;
            class8.anIntArray160[1] = 127;
            class8.anIntArray160[2] = 924;
            class8.anInt174 = 2582;
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
            class8.aString170 = "Santa Legs";
            class8.aByteArray178 = "Santa Legs".getBytes();
        }
        if(i == 2750)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 41;
            class8.anIntArray156[2] = 24;
            class8.anIntArray156[3] = 11187;
            class8.anIntArray160[0] = 127;
            class8.anIntArray160[1] = 924;
            class8.anIntArray160[2] = 127;
            class8.anIntArray160[3] = 127;
            class8.anInt174 = 3020;
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
            class8.aString170 = "Santa plate";
            class8.aByteArray178 = "Santa plate".getBytes();
        }
        if(i == 2751)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 7054;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[0] = 127;
            class8.anIntArray160[1] = 924;
            class8.anIntArray160[2] = 924;
            class8.anInt174 = 2339;
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
            class8.aString170 = "Santa Kite";
            class8.aByteArray178 = "Santa Kite".getBytes();
        }
        if(i == 2752)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 926;
            class8.anIntArray156[1] = 7700;
            class8.anIntArray156[2] = 11200;
            class8.anIntArray156[3] = 6032;
            class8.anIntArray160[0] = 127;
            class8.anIntArray160[1] = 127;
            class8.anIntArray160[2] = 924;
            class8.anIntArray160[3] = 127;
            class8.anInt174 = 2603;
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
            class8.aString170 = "Santa cape";
            class8.aByteArray178 = "Santa cape".getBytes();
        }
        if(i == 2753)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 39009;
            class8.anIntArray156[1] = 40918;
            class8.anIntArray160[0] = 127;
            class8.anIntArray160[1] = 924;
            class8.anIntArray160[2] = 924;
            class8.anIntArray160[3] = 127;
            class8.anInt174 = 5039;
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
            class8.aString170 = "Santa Gloves";
            class8.aByteArray178 = "Santa Gloves".getBytes();
        }
        if(i == 2754)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 127;
            class8.anInt174 = 5037;
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
            class8.aString170 = "Santa Boots";
            class8.aByteArray178 = "Santa boots".getBytes();
        }
        if(i == 2755)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 41;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[0] = 11200;
            class8.anIntArray160[1] = 0;
            class8.anIntArray160[2] = 11200;
            class8.anInt174 = 2582;
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
            class8.aString170 = "Black & Yellow Legs";
            class8.aByteArray178 = "Black & Yellow Legs".getBytes();
        }
        if(i == 2756)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 41;
            class8.anIntArray156[2] = 24;
            class8.anIntArray156[3] = 11187;
            class8.anIntArray160[0] = 0;
            class8.anIntArray160[1] = 11200;
            class8.anIntArray160[2] = 0;
            class8.anIntArray160[3] = 0;
            class8.anInt174 = 3020;
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
            class8.aString170 = "Black & Yellow plate";
            class8.aByteArray178 = "Black & Yellow plate".getBytes();
        }
        if(i == 2757)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray156[1] = 7054;
            class8.anIntArray156[2] = 57;
            class8.anIntArray160[0] = 0;
            class8.anIntArray160[1] = 11200;
            class8.anIntArray160[2] = 11200;
            class8.anInt174 = 2339;
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
            class8.aString170 = "Black & Yellow Kite";
            class8.aByteArray178 = "Black & Yellow Kite".getBytes();
        }
        if(i == 2758)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 926;
            class8.anIntArray156[1] = 7700;
            class8.anIntArray156[2] = 11200;
            class8.anIntArray156[3] = 6032;
            class8.anIntArray160[0] = 0;
            class8.anIntArray160[1] = 0;
            class8.anIntArray160[2] = 11200;
            class8.anIntArray160[3] = 0;
            class8.anInt174 = 2603;
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
            class8.aString170 = "Black & Yellow cape";
            class8.aByteArray178 = "Black & Yellow cape".getBytes();
        }
        if(i == 2759)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 39009;
            class8.anIntArray156[1] = 40918;
            class8.anIntArray160[0] = 0;
            class8.anIntArray160[1] = 11200;
            class8.anIntArray160[2] = 11200;
            class8.anIntArray160[3] = 0;
            class8.anInt174 = 5039;
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
            class8.aString170 = "Black & Yellow Gloves";
            class8.aByteArray178 = "Black & Yellow Gloves".getBytes();
        }
        if(i == 2760)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 0;
            class8.anInt174 = 5037;
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
            class8.aString170 = "Black & Yellow Boots";
            class8.aByteArray178 = "Black & Yellow boots".getBytes();
        }
if(i == 15680) // ITEM ID
{
        class8.aStringArray189 = new String[5];
        class8.aStringArray189[1] = "Play"; 
        class8.anInt174 = 11134; // Drop/Inv Model
        class8.anInt165 = 11135; // Male Wield Model
        class8.anInt200 = 11135; // Female Wield
        class8.anInt188 = -1; // Male arms/sleeves
        class8.anInt164 = -1; // Female arms/sleeves
	class8.anInt181 = 850; // Zoom 
	class8.anInt190 = 498; // Rotate up/down 
	class8.anInt198 = 1300; // Rotate right/left
	class8.anInt169 = -1; // Position in inv, increase to move right
	class8.anInt194 = -1; // Position in inv, increase to move up						
class8.aString170 = "Winkman's Guitar"; // Item Name
class8.aByteArray178 = "Whoa, Nice Guitar Dude!".getBytes(); // Item Examine
        }
        if(i == 10091)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 6;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 100;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Emo santa hat ";
            class8.aByteArray178 = "Emo santa hat.".getBytes();
        }
        if(i == 8012)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 926;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Black santa hat ";
            class8.aByteArray178 = "Black santa hat.".getBytes();
        }
        if(i == 15055)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 62928;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Pink Party Hat";
            class8.aByteArray178 = "A Pink Party Hat.".getBytes();
        }
        if(i == 15999)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 39758;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Light blue Party Hat";
            class8.aByteArray178 = "A Light blue Party Hat.".getBytes();
        }
        if(i == 16000)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 20763;
            class8.anInt174 = 2635;
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
            class8.aString170 = "dark green Party Hat";
            class8.aByteArray178 = "A dark green Party Hat.".getBytes();
        }
        if(i == 16001)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 44588;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Dark Blue Party Hat";
            class8.aByteArray178 = "A dark blue Party Hat.".getBytes();
        }
        if(i == 16002)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 64028;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Blood Red Party Hat";
            class8.aByteArray178 = "A Blood Red Party Hat.".getBytes();
        }
        if(i == 16003)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 33640;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Lighter blue Party Hat";
            class8.aByteArray178 = "Lighter blue Party Hat.".getBytes();
        }
        if(i == 10560)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 35321;
            class8.anInt174 = 2635;
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
            class8.aString170 = "sky phat";
            class8.aByteArray178 = "A sky Party Hat.".getBytes();
        }
        if(i == 9117)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 0;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Black h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 9118)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 11200;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Yellow h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 10099)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 23421;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 0;
            class8.anInt174 = 2537;
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
            class8.aString170 = "Pimp santa hat ";
            class8.aByteArray178 = "Pimpin santa hat.".getBytes();
        }
        if(i == 10105)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 10394;
            class8.anInt174 = 5412;
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
            class8.aString170 = " Barrows Whip";
            class8.aByteArray178 = "a Barrows Whip".getBytes();
        }
        if(i == 10555)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 62928;
            class8.anInt174 = 5412;
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
            class8.aString170 = " sissy Whip";
            class8.aByteArray178 = "a sissy  Whip".getBytes();
        }
        if(i == 10106)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 528;
            class8.anIntArray160[0] = 7114;
            class8.anInt174 = 5412;
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
            class8.aString170 = "Gold Whip";
            class8.aByteArray178 = "a Gold Whip".getBytes();
        }
        if(i == 11078)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 8128;
            class8.anInt174 = 2635;
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
            class8.aString170 = "Godz Party Hat";
            class8.aByteArray178 = "A  Party Hat for owner godz.".getBytes();
        }



if(i == 15681){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 12214;
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
class8.aString170 = "Dragon Godsword";
class8.aByteArray178 = "A godsword From the Greatest Dragons.".getBytes();
}
if(i == 19954) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield"; // String name, this can be changed to wield, or attach, or whatever you want
class8.anInt174 = 12556; // Drop/Inv Model
class8.anInt165 = 12555; // Male Wield Model
class8.anInt200 = 12555; // Female Wield
class8.anInt188 = -1; // Male arms/sleeves (Leave as -1 if not used)
class8.anInt164 = -1; // Female arms/sleeves (Leave as -1 if not used)        
class8.anInt181 = 2000; // Zoom - Increase to make inv model smaller        
class8.anInt190 = 500; // Rotate up/down -  Increase to rotate upwards        
class8.anInt198 = 0; // Rotate right/left - Increase to rotate right        
class8.anInt169 = -1; // Position in  inv, increase to move right        
class8.anInt194 = -1; // Position in inv, increase to move up                                                
class8.aString170 = "Dungeoneering cape"; // Item Name
class8.aByteArray178 = "A nice looking cape.".getBytes(); // Item Examine      
}
	if(i == 15259)
		        {
		class8.aStringArray189 = new String[5];
		class8.aStringArray189[1] = "Wear";
        class8.anInt174 = 79229;
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
		class8.aString170 = "Dragon pickaxe";
		class8.aByteArray178 = "Used for mining.".getBytes();
	}
if(i == 7979){ 
  class8.aStringArray189 = new String[5];
     class8.aStringArray189[1] = "Wear";
     class8.anInt174 = 8553; //inv and drop
     class8.anInt181 = 2000;
     class8.anInt190 = 434;
     class8.anInt198 = 0;
     class8.anInt204 = 0;
     class8.anInt169 = 0;
     class8.anInt194 = -4;
     class8.anInt165 = 8554; //m wear
     class8.anInt200 = 8554; //f wear
     class8.aString170 = "Demon Wind Shuriken";
class8.aByteArray178 = "A razor sharp shuriken weapon.".getBytes();
}
                if (i == 11338)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 14200;
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
                        class8.aString170 = "Energy sword";
                        class8.aByteArray178 = "A strong sword made of energy.".getBytes();
                }
                if (i == 11339)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 5221;
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
                        class8.aString170 = "Red Energy sword";
                        class8.aByteArray178 = "A strong sword made of red energy.".getBytes();
                }
                if (i == 11340)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 6221;
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
                        class8.aString170 = "X-Mas Energy sword";
                        class8.aByteArray178 = "From Santa...".getBytes();
                }
                if (i == 11341)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 7221;
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
                        class8.aString170 = "valentines Energy sword";
                        class8.aByteArray178 = "From traxxas Have a Happy valentines Day =)".getBytes();
                }
if(i == 10000) // ItemID
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 60831;
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
class8.aString170 = "Korasi sword";
class8.aByteArray178 = "It's a Korasi sword".getBytes();
}
if(i == 13214){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 13215;
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
class8.aString170 = "Zaros Godsword";
class8.aByteArray178 = "A sword containing magical power.".getBytes();
}
if(i == 14590)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";//New option
class8.anInt174 = 3000; //Model ID
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
class8.aString170 = "Ava's accumulator";
class8.aByteArray178 = "Ava's accumulator".getBytes();
}
        if(i == 16897)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 10378;
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
            class8.aString170 = "Ninja Body";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }
if(i == 7956)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 22168;
            class8.anIntArray160[0] = -21846;
            class8.anIntArray156[1] = 8070;
            class8.anIntArray160[1] = -24771;
            class8.anIntArray156[2] = 24082;
            class8.anIntArray160[2] = -24046;
            class8.anIntArray156[3] = 22156;
            class8.anIntArray160[3] = -21876;
            class8.anIntArray156[4] = 920;
            class8.anIntArray160[4] = -25788;
            class8.anIntArray156[5] = 912;
            class8.anIntArray160[5] = -27983;
            class8.anInt174 = 10114;            
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 10115;
            class8.anInt200 = 10117;
            class8.anInt164 = 10118;
            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Black ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
if(i == 7957)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = -22421;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = -22357;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = -22235;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -22111;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -19944;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -19572;
            class8.anInt174 = 10114;            
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 10115;
            class8.anInt200 = 10117;
            class8.anInt164 = 10118;
            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Blue ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
if(i == 7958)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = 109;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = 171;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = 293;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -1631;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -1512;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -1140;
            class8.anInt174 = 10114;            
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 10115;
            class8.anInt200 = 10117;
            class8.anInt164 = 10118;
            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Red ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
if(i == 7959)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = -16157;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = -16190;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = -20297;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -20175;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -15848;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -14452;
            class8.anInt174 = 10114;            
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 10115;
            class8.anInt200 = 10117;
            class8.anInt164 = 10118;
            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Purple ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
		if(i == 17960)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anInt174 = 23697;
            class8.anInt181 = 2290;
            class8.anInt190 = 588;
            class8.anInt198 = 1985;
            class8.anInt204 = 4;
            class8.anInt169 = 2;
            class8.anInt194 = 28;
            class8.anInt165 = 23697;
            class8.anInt200 = 23697;
            class8.anInt188 = 23872;
            class8.anInt164 = 23344;
            class8.anInt175 = 28;
            class8.anInt197 = 23335;
            class8.aString170 = "Plasma Rifle";
            class8.aByteArray178 = "The Halo Plasma".getBytes();
        }
if(i == 7960)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = 21611;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = 21675;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = 21797;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = 21921;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = 26388;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = 22158;
            class8.anInt174 = 10114;            
            class8.anInt169 = -1;
            class8.anInt181 = 1373;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt194 = 7;
            class8.anInt204 = 2047;
            class8.anInt165 = 10115;
            class8.anInt200 = 10117;
            class8.anInt164 = 10118;
            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Green ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
if(i == 7961)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 22168;
            class8.anIntArray160[0] = -21846;
            class8.anIntArray156[1] = 8070;
            class8.anIntArray160[1] = -24771;
            class8.anIntArray156[2] = 24082;
            class8.anIntArray160[2] = -24046;
            class8.anIntArray156[3] = 22156;
            class8.anIntArray160[3] = -21876;
            class8.anIntArray156[4] = 920;
            class8.anIntArray160[4] = -25788;
            class8.anIntArray156[5] = 912;
            class8.anIntArray160[5] = -27983;
            class8.anInt174 = 10119;            
            class8.anInt169 = -1;
            class8.anInt181 = 1827;
            class8.anInt190 = 444;
            class8.anInt198 = 1259;
            class8.anInt194 = -1;
            class8.anInt204 = 2047;
            class8.anInt165 = 10120;
            class8.anInt200 = 10121;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Black ele' legs";
            class8.aByteArray178 = "A well made elegant bottom.".getBytes();
        }
if(i == 7962)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = -22421;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = -22357;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = -22235;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -22111;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -19944;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -19572;
            class8.anInt174 = 10119;            
            class8.anInt169 = -1;
            class8.anInt181 = 1827;
            class8.anInt190 = 444;
            class8.anInt198 = 1259;
            class8.anInt194 = -1;
            class8.anInt204 = 2047;
            class8.anInt165 = 10120;
            class8.anInt200 = 10121;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Blue ele' legs";
            class8.aByteArray178 = "A well made elegant bottom.".getBytes();
        }
if(i == 7963)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = 109;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = 171;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = 293;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -1631;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -1512;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -1140;
            class8.anInt174 = 10119;            
            class8.anInt169 = -1;
            class8.anInt181 = 1827;
            class8.anInt190 = 444;
            class8.anInt198 = 1259;
            class8.anInt194 = -1;
            class8.anInt204 = 2047;
            class8.anInt165 = 10120;
            class8.anInt200 = 10121;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Red ele' legs";
            class8.aByteArray178 = "A well made elegant bottom.".getBytes();
        }
if(i == 7964)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = -16157;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = -16190;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = -20297;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = -20175;
            class8.anIntArray156[4] = 26;
            class8.anIntArray160[4] = -15848;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = -14452;
            class8.anInt174 = 10119;            
            class8.anInt169 = -1;
            class8.anInt181 = 1827;
            class8.anInt190 = 444;
            class8.anInt198 = 1259;
            class8.anInt194 = -1;
            class8.anInt204 = 2047;
            class8.anInt165 = 10120;
            class8.anInt200 = 10121;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Purple ele' legs";
            class8.aByteArray178 = "A well made elegant bottom.".getBytes();
        }
if(i == 7965)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 105;
            class8.anIntArray160[0] = 21611;
            class8.anIntArray156[1] = 64;
            class8.anIntArray160[1] = 21675;
            class8.anIntArray156[2] = 47;
            class8.anIntArray160[2] = 21797;
            class8.anIntArray156[3] = 35;
            class8.anIntArray160[3] = 21921;
            class8.anIntArray156[4] = -10364;
            class8.anIntArray160[4] = 26388;
            class8.anIntArray156[5] = -10364;
            class8.anIntArray160[5] = 22158;
            class8.anInt174 = 10119;            
            class8.anInt169 = -1;
            class8.anInt181 = 1827;
            class8.anInt190 = 444;
            class8.anInt198 = 1259;
            class8.anInt194 = -1;
            class8.anInt204 = 2047;
            class8.anInt165 = 10120;
            class8.anInt200 = 10121;
            class8.anInt164 = -1;
            class8.anInt188 = -1;
            class8.aBoolean176 = false;
            class8.aString170 = "Green ele' legs";
            class8.aByteArray178 = "A well made elegant bottom.".getBytes();
        }
if(i == 10010)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14061; //
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
class8.aString170 = "Vesta's longsword";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10011)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14063; //
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
class8.aString170 = "Vesta's spear";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10012)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14069; //
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
class8.aString170 = "Morrigan's coif";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10013)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14071; //
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
class8.aString170 = "Morrigan's javelin";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
      }
if(i == 10014)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";//New option
class8.anInt174 = 14073; //
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
class8.aString170 = "Morrigan's throwing axe";//Name of the new item
class8.aByteArray178 = "This item degrades in combat, and will turn to dust.".getBytes();//examin info
		        }
        if(i == 16898)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 10377;
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
            class8.aString170 = "Ninja legs";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }
        if(i == 16899)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 10376;
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
            class8.aString170 = "Ninja Balaclava";
            class8.aByteArray178 = "Stealthy.".getBytes();
        }
        if(i == 16890)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 10312;
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
            class8.aString170 = "Samurai armor";
            class8.aByteArray178 = "Nice armor from the far east.".getBytes();
        }
        if(i == 16851)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Weild";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 80;
            class8.anIntArray156[1] = 6550;
            class8.anIntArray160[1] = 15;
            class8.anIntArray156[2] = 6430;
            class8.anIntArray160[2] = 10;
            class8.anInt174 = 10379;
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
            class8.aString170 = "Katana";
            class8.aByteArray178 = "Weilded by ninjas.".getBytes();
        }
        if(i == 16852)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Weild";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
            class8.anInt174 = 10379;
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
            class8.aString170 = "Katana";
            class8.aByteArray178 = "A nicely crafted sword and holder.".getBytes();
        }
if(i == 7276){ //Black Plateskirt (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[4];
              class8.anIntArray160 = new int [4];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 22464; 
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 22464; 
              class8.anIntArray156[3] = 25238;
              class8.anIntArray160[3] = 0; 
  	class8.anInt174 = 4208;
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
              class8.aString170 = "Black Plateskirt (G)";
              class8.aByteArray178 = "It's a Black Plateskirt (G)".getBytes();
              }
if(i == 13422){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Black Platelegs (G)";
              class8.aByteArray178 = "It's Black Platelegs (G)".getBytes();
              }
 if(i == 13423){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 22464;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 0; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Black Platebody (G)";
              class8.aByteArray178 = "It's a Black Platebody (G)".getBytes();
              }
 if(i == 13424){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 22464; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Black Helm (G)";
              class8.aByteArray178 = "It's a Black Helm (G)".getBytes();
              }
 if(i == 13425){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 0; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Black Kiteshield (G)";
              class8.aByteArray178 = "It's a Black Kiteshield (G)".getBytes();
              }
if(i == 13426){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Black Platelegs (W)";
              class8.aByteArray178 = "It's Black Platelegs (W)".getBytes();
              }
 if(i == 13427){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 100;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 0; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Black Platebody (W)";
              class8.aByteArray178 = "It's a Black Platebody (W)".getBytes();
              }
 if(i == 13428){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 100; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Black Helm (W)";
              class8.aByteArray178 = "It's a Black Helm (W)".getBytes();
              }
 if(i == 13429){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 0; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Black Kiteshield (W)";
              class8.aByteArray178 = "It's a Black Kiteshield (W)".getBytes();
              }

if(i == 13434){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Black Platelegs (B)";
              class8.aByteArray178 = "It's Black Platelegs (B)".getBytes();
              }
 if(i == 13435){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 43968;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 0; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Black Platebody (B)";
              class8.aByteArray178 = "It's a Black Platebody (B)".getBytes();
              }
 if(i == 13436){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 43968; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Black Helm (B)";
              class8.aByteArray178 = "It's a Black Helm (B)".getBytes();
              }
 if(i == 13437){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 0; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Black Kiteshield (B)";
              class8.aByteArray178 = "It's a Black Kiteshield (B)".getBytes();
              }

if(i == 13438){ //Black Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Black Platelegs (O)";
              class8.aByteArray178 = "It's Black Platelegs (O)".getBytes();
              }
 if(i == 13439){ //Black Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 6073;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 0; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Black Platebody (O)";
              class8.aByteArray178 = "It's a Black Platebody (O)".getBytes();
              }
 if(i == 13440){ //Black Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 6073; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Black Helm (O)";
              class8.aByteArray178 = "It's a Black Helm (O)".getBytes();
              }
 if(i == 13441){ //Black Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 0; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Black Kiteshield (O)";
              class8.aByteArray178 = "It's a Black Kiteshield (O)".getBytes();
              }


if(i == 7277){ //Black Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 0;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Black Platelegs (P)";
              class8.aByteArray178 = "It's Black Platelegs (P)".getBytes();
              }
 if(i == 7278){ //Black Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 51136;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 0; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Black Platebody (P)";
              class8.aByteArray178 = "It's a Black Platebody (P)".getBytes();
              }
 if(i == 7279){ //Black Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 51136; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Black Helm (P)";
              class8.aByteArray178 = "It's a Black Helm (P)".getBytes();
              }
 if(i == 7280){ //Black Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 0; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Black Kiteshield (P)";
              class8.aByteArray178 = "It's a Black Kiteshield (P)".getBytes();
              }
 if(i == 7281){ //Black Plateskirt (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[4];
              class8.anIntArray160 = new int [4];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 0;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 51136; 
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 51136; 
              class8.anIntArray156[3] = 25238;
              class8.anIntArray160[3] = 0; 
  	class8.anInt174 = 4208;
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
              class8.aString170 = "Black Plateskirt (P)";
              class8.aByteArray178 = "It's a Black Plateskirt (P)".getBytes();
              }
if(i == 13442){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 5652;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Bronze Platelegs (G)";
              class8.aByteArray178 = "It's Bronze Platelegs (G)".getBytes();
              }
 if(i == 13443){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 22464;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 5652; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Bronze Platebody (G)";
              class8.aByteArray178 = "It's a Bronze Platebody (G)".getBytes();
              }
 if(i == 13444){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 22464; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Bronze Helm (G)";
              class8.aByteArray178 = "It's a Bronze Helm (G)".getBytes();
              }
 if(i == 13445){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 5652; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Bronze Kiteshield (G)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (G)".getBytes();
              }
	if(i == 13446){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 5652;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Bronze Platelegs (W)";
              class8.aByteArray178 = "It's Bronze Platelegs (W)".getBytes();
              }
 if(i == 13447){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 100;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 5652; 
  	class8.anInt174 = 2378;
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
              class8.aString170 = "Bronze Platebody (W)";
              class8.aByteArray178 = "It's a Bronze Platebody (W)".getBytes();
              }
 if(i == 13448){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 100; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Bronze Helm (W)";
              class8.aByteArray178 = "It's a Bronze Helm (W)".getBytes();
              }
 if(i == 13449){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 5652; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Bronze Kiteshield (W)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (W)".getBytes();
              }
if(i == 13450){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 5652;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Bronze Platelegs (B)";
              class8.aByteArray178 = "It's Bronze Platelegs (B)".getBytes();
              }
 if(i == 13451){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 43968;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 5652; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Bronze Platebody (B)";
              class8.aByteArray178 = "It's a Bronze Platebody (B)".getBytes();
              }
 if(i == 13452){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 43968; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Bronze Helm (B)";
              class8.aByteArray178 = "It's a Bronze Helm (B)".getBytes();
              }
 if(i == 13453){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 5652; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Bronze Kiteshield (B)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (B)".getBytes();
              }
if(i == 13454){ //Bronze Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 5652;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Bronze Platelegs (O)";
              class8.aByteArray178 = "It's Bronze Platelegs (O)".getBytes();
              }
 if(i == 13455){ //Bronze Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 6073;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 5652; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Bronze Platebody (O)";
              class8.aByteArray178 = "It's a Bronze Platebody (O)".getBytes();
              }
 if(i == 13456){ //Bronze Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 6073; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Bronze Helm (O)";
              class8.aByteArray178 = "It's a Bronze Helm (O)".getBytes();
              }
 if(i == 13457){ //Bronze Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 5652; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Bronze Kiteshield (O)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (O)".getBytes();
              }
if(i == 13458){ //Bronze Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 5652;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Bronze Platelegs (P)";
              class8.aByteArray178 = "It's Bronze Platelegs (P)".getBytes();
              }
 if(i == 13459){ //Bronze Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 51136;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 5652; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Bronze Platebody (P)";
              class8.aByteArray178 = "It's a Bronze Platebody (P)".getBytes();
              }
 if(i == 13460){ //Bronze Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 51136; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Bronze Helm (P)";
              class8.aByteArray178 = "It's a Bronze Helm (P)".getBytes();
              }
 if(i == 13461){ //Bronze Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 5652;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 5652; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Bronze Kiteshield (P)";
              class8.aByteArray178 = "It's a Bronze Kiteshield (P)".getBytes();
              }
if(i == 13462){ //Black Platelegs (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 33;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Iron Platelegs (G)";
              class8.aByteArray178 = "It's Iron Platelegs (G)".getBytes();
              }
 if(i == 13463){ //Black Platebody (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 22464;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 33; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Iron Platebody (G)";
              class8.aByteArray178 = "It's a Iron Platebody (G)".getBytes();
              }
 if(i == 13464){ //Black Helm (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 22464; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Iron Helm (G)";
              class8.aByteArray178 = "It's a Iron Helm (G)".getBytes();
              }
 if(i == 13465){ //Black Kiteshield (G)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 33; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 22464; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Iron Kiteshield (G)";
              class8.aByteArray178 = "It's a Iron Kiteshield (G)".getBytes();
              }
	if(i == 13466){ //Black Platelegs (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 33;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Iron Platelegs (W)";
              class8.aByteArray178 = "It's Iron Platelegs (W)".getBytes();
              }
 if(i == 13467){ //Black Platebody (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 100;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 33; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Iron Platebody (W)";
              class8.aByteArray178 = "It's a Iron Platebody (W)".getBytes();
              }
 if(i == 13468){ //Black Helm (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 100; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Iron Helm (W)";
              class8.aByteArray178 = "It's a Iron Helm (W)".getBytes();
              }
 if(i == 13469){ //Black Kiteshield (W)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 33; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 100; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Iron Kiteshield (W)";
              class8.aByteArray178 = "It's a Iron Kiteshield (W)".getBytes();
              }
if(i == 13470){ //Black Platelegs (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 33;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Iron Platelegs (B)";
              class8.aByteArray178 = "It's Iron Platelegs (B)".getBytes();
              }
 if(i == 13471){ //Black Platebody (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 43968;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 33; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Iron Platebody (B)";
              class8.aByteArray178 = "It's a Iron Platebody (B)".getBytes();
              }
 if(i == 13472){ //Black Helm (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 43968; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Iron Helm (B)";
              class8.aByteArray178 = "It's a Iron Helm (B)".getBytes();
              }
 if(i == 13473){ //Black Kiteshield (B)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 33; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 43968; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Iron Kiteshield (B)";
              class8.aByteArray178 = "It's a Iron Kiteshield (B)".getBytes();
              }
if(i == 13474){ //Iron Platelegs (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 33;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Iron Platelegs (O)";
              class8.aByteArray178 = "It's Iron Platelegs (O)".getBytes();
              }
 if(i == 13475){ //Iron Platebody (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 6073;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 33; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Iron Platebody (O)";
              class8.aByteArray178 = "It's a Iron Platebody (O)".getBytes();
              }
 if(i == 13476){ //Iron Helm (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 6073; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Iron Helm (O)";
              class8.aByteArray178 = "It's a Iron Helm (O)".getBytes();
              }
 if(i == 13477){ //Iron Kiteshield (O)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 33; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 6073; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Iron Kiteshield (O)";
              class8.aByteArray178 = "It's a Iron Kiteshield (O)".getBytes();
              }
if(i == 13478){ //Iron Platelegs (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 41;
              class8.anIntArray160[1] = 33;
              class8.anIntArray156[2] = 57;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2582;
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
              class8.aString170 = "Iron Platelegs (P)";
              class8.aByteArray178 = "It's Iron Platelegs (P)".getBytes();
              }
 if(i == 13479){ //Iron Platebody (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 24;
              class8.anIntArray160[1] = 51136;
              class8.anIntArray156[2] = 41;
              class8.anIntArray160[2] = 33; 
class8.anInt174 = 2378;
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
              class8.aString170 = "Iron Platebody (P)";
              class8.aByteArray178 = "It's a Iron Platebody (P)".getBytes();
              }
 if(i == 13480){ //Iron Helm (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[2];
              class8.anIntArray160 = new int [2];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 926;
              class8.anIntArray160[1] = 51136; 
  	class8.anInt174 = 2813;
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
              class8.aString170 = "Iron Helm (P)";
              class8.aByteArray178 = "It's a Iron Helm (P)".getBytes();
              }
 if(i == 13481){ //Iron Kiteshield (P)
              class8.aStringArray189 = new String[5];
              class8.aStringArray189[1] = "Wear";
              class8.anIntArray156 = new int[3];
              class8.anIntArray160 = new int [3];
              class8.anIntArray156[0] = 61;
              class8.anIntArray160[0] = 33;		
              class8.anIntArray156[1] = 57;
              class8.anIntArray160[1] = 33; 
              class8.anIntArray156[2] = 7054;
              class8.anIntArray160[2] = 51136; 
  	class8.anInt174 = 2339;
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
              class8.aString170 = "Iron Kiteshield (P)";
              class8.aByteArray178 = "It's a Iron Kiteshield (P)".getBytes();
              }
 if(i == 15224) {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[3];
            class8.anIntArray160 = new int[3];
            class8.anIntArray156[0] = 960;
            class8.anIntArray156[1] = 22464;
            class8.anIntArray156[2] = 43968;
            class8.anIntArray160[0] = 10530;
            class8.anIntArray160[1] = 10530;
            class8.anIntArray160[2] = 10530;
            class8.anInt174 = 13450;
            class8.aBoolean176 = false;
            class8.anInt181 = 720;
            class8.anInt190 = 0;
            class8.anInt198 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 13451;
            class8.anInt200 = 13451;
            class8.aString170 = "hunter hood";
            class8.aByteArray178 = "hunter skillcape hood.".getBytes();
        }
		             if(i == 18785)
		        {
		            class8.aStringArray189 = new String[5];
		            class8.aStringArray189[1] = "Wear";
		            class8.anIntArray156 = new int[1];
		            class8.anIntArray160 = new int[1];
		            class8.anIntArray156[0] = 0;
		            class8.anIntArray160[0] = 0;
		            class8.anInt174 = 0x1286b;
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
		            class8.aString170 = "@blu@ Ice katana";
		            class8.aByteArray178 = "Ghr's ninjas only".getBytes();
		        }
if(i == 15167){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 15;
class8.anIntArray160[1] = 0;
class8.anIntArray160[2] = 0;
class8.anIntArray160[3] = 15;
class8.anInt174 = 9244;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 8610;
class8.anInt200 = 8610;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Hunter cape";
class8.aByteArray178 = "The cape worn by the best of farmers.".getBytes();
}
if(i == 15168){
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 57280;
class8.anIntArray156[1] = 54503;
class8.anIntArray156[2] = 54183;
class8.anIntArray156[3] = 11200;
class8.anIntArray160[0] = 15;
class8.anIntArray160[1] = 0;
class8.anIntArray160[2] = 0;
class8.anIntArray160[3] = 15;
class8.anInt174 = 8605;
class8.anInt181 = 2000;
class8.anInt190 = 500;
class8.anInt198 = 0;
class8.anInt204 = 14;
class8.anInt169 = -6;
class8.anInt194 = 1;
class8.anInt165 = 8607;
class8.anInt200 = 8607;
class8.anInt175 = -1;
class8.anInt197 = -1;
class8.anInt199 = -1;
class8.aString170 = "Hunter cape(t)";
class8.aByteArray178 = "The cape worn by the best of farmers.".getBytes();
}
if(i == 6570){
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
			class8.anIntArray156[0] = 0;
			class8.anIntArray160[0] = 0;
			class8.anInt174 = 9631;//item look
			class8.anInt181 = 2000;
			class8.anInt190 = 400;
			class8.anInt198 = 0;
			class8.anInt204 = 2047;
			class8.anInt169 = -8;
			class8.anInt194 = 12;
			class8.anInt197 = -1;
            class8.aString170 = "Fire Cape";
            class8.aByteArray178 = "A cape of fire.".getBytes();
        }
		
		if(i == 15618)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 931;       
class8.anInt174 =  5412;
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
    class8.aString170 = "Ruby Whip";
    class8.aByteArray178 = "a Ruby Whip".getBytes();
}


if(i == 15619)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 33;  
class8.anIntArray160[0] = 931;   
class8.anIntArray156[1] = 49;  
class8.anIntArray160[1] = 931;
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 931;    
class8.anInt174 = 2558;
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
    class8.aString170 = "Ruby chainbody";
    class8.aByteArray178 = "a Ruby chainbody".getBytes();
}

if(i == 15620)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 24;  
class8.anIntArray160[0] = 931;   
class8.anIntArray156[1] = 61;  
class8.anIntArray160[1] = 931;
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 931;    
class8.anInt174 = 2605;
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
    class8.aString170 = "Ruby Platebody";
    class8.aByteArray178 = "a Ruby Platebody".getBytes();
}

if(i == 15621)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 931;   
class8.anInt174 = 2833;
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
    class8.aString170 = "Ruby Med Helm";
    class8.aByteArray178 = "a Ruby Med Helm".getBytes();
}

if(i == 15622)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 931;   
class8.anIntArray156[1] = 926;  
class8.anIntArray160[1] = 48030;   
class8.anInt174 = 2813;
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
    class8.aString170 = "Ruby full Helm";
    class8.aByteArray178 = "a Ruby full Helm".getBytes();
}

if(i == 15623)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 931;   
class8.anIntArray156[1] = 41;  
class8.anIntArray160[1] = 931;   
class8.anIntArray156[2] = 57;  
class8.anIntArray160[2] = 931;  
class8.anInt174 = 2582;
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
    class8.aString170 = "Ruby Platelegs";
    class8.aByteArray178 = "a Ruby platelegs".getBytes();
}
if(i == 14321)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 40;
class8.anIntArray160[0] = 1;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
}
if(i == 14322)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 40;
class8.anIntArray160[0] = 50;
class8.anInt174 = 9631;
class8.anInt181 = 2000;
class8.anInt190 = 400;
class8.anInt198 = 0;
class8.anInt204 = 2047;
class8.anInt165 = 9638;
class8.anInt200 = 9638;
class8.anInt169 = -8;
class8.anInt194 = 12;
class8.anInt197 = -1;
class8.aString170 = "Water Cape";
class8.aByteArray178 = "A cape of water.".getBytes();
}
if(i == 12324)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 18105;       
class8.anInt174 = 2451;
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
class8.aString170 = "Lime Green cavalier";
class8.aByteArray178 = "a Lime Green cavalier".getBytes();
}
if(i == 12325)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 45549;       
class8.anInt174 = 2451;
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
class8.aString170 = "Unknowed White cavalier";
class8.aByteArray178 = "a Unknowed White cavalier".getBytes();
}
if(i == 12326)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 50971;       
class8.anInt174 = 2451;
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
class8.aString170 = "Deep Purple cavalier";
class8.aByteArray178 = "a Deep Purple cavalier".getBytes();
}
if(i == 12327)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 60176;       
class8.anInt174 = 2451;
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
class8.aString170 = "Deeprt Purple cavalier";
class8.aByteArray178 = "a Deeper Purple cavalier".getBytes();
}
if(i == 12328)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 19213;       
class8.anInt174 = 2451;
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
class8.aString170 = "Deep Green cavalier";
class8.aByteArray178 = "a Deep Green cavalier".getBytes();
}
if(i == 12329)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 3654;       
class8.anInt174 = 2451;
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
class8.aString170 = "Dull Orange cavalier";
class8.aByteArray178 = "a Dull Orange cavalier".getBytes();
}
if(i == 12330)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 12904;       
class8.anInt174 = 2451;
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
class8.aString170 = "Bright Yellow cavalier";
class8.aByteArray178 = "a Bright Yellow cavalier".getBytes();
}
if(i == 12331)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 618;       
class8.anInt174 = 2451;
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
class8.aString170 = "Bright Pink cavalier";
class8.aByteArray178 = "a Bright Pink cavalier".getBytes();
}
if(i == 12332)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 46440;       
class8.anInt174 = 2451;
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
class8.aString170 = "Bright blue cavalier";
class8.aByteArray178 = "a Bright Blue cavalier".getBytes();
}
if(i == 12333)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 11378;       
class8.anInt174 = 2451;
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
class8.aString170 = "Bright Gray cavalier";
class8.aByteArray178 = "a Bright Gray cavalier".getBytes();
}
if(i == 12334)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 36207;       
class8.anInt174 = 2451;
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
class8.aString170 = "Bright Sky Blue cavalier";
class8.aByteArray178 = "a Bright Sky Blue cavalier".getBytes();
}
if(i == 12335)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 32562;       
class8.anInt174 = 2451;
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
class8.aString170 = "Teal cavalier";
class8.aByteArray178 = "a Teal cavalier".getBytes();
}
if(i == 12336)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; 
class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 8245;       
class8.anInt174 = 2451;
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
class8.aString170 = "Dark Gray cavalier";
class8.aByteArray178 = "a Dark Gray cavalier".getBytes();
}
        if(i == 12366)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 18105;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Lime Green h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12367)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 45549;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Unknowed White h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12368)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 50971;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Deep Purple h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12369)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 60176;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Deeper Purple h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12370)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 19213;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Deep Green h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12370)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 3654;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Dull Orange h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12371)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 12904;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Bright Yellow h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12372)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 618;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Bright PInk h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12373)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 46440;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Bright Blue h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12374)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 11378;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Bright Gray h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12375)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 36207;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Bright Sky Blue h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12376)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 32562;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Teal h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
        if(i == 12377)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 8245;
            class8.anInt174 = 2438;
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
            class8.aString170 = "Dark Gray h'ween Mask";
            class8.aByteArray178 = "Aaaarrrghhh... I'm a monster.".getBytes();
        }
		
        if(i == 16123)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 7079;
            class8.anIntArray160[0] = 43968;
            class8.anIntArray156[1] = 7073;
            class8.anIntArray160[1] = 43968;
            class8.anIntArray156[2] = 8111;
            class8.anIntArray160[2] = 43968;
            class8.anIntArray156[3] = 8107;
            class8.anIntArray160[3] = 43968;
class8.anInt174 = 11074;
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
            class8.aString170 = "blue Lit bug lantern";
            class8.aByteArray178 = "Its an blue Lit bug lantern".getBytes();
        }
		
		        if(i == 18747)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 57626;
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
            class8.aString170 = "Faithful shield";
            class8.aByteArray178 = "Its an Faithful shield.".getBytes();
        }
		
				        if(i == 249)
        {
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 22418;
            class8.anIntArray160[0] = 22428;
            class8.anIntArray156[1] = 22428;
            class8.anIntArray160[1] = 22418;
class8.anInt174 = 2364;
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
            class8.aString170 = "Clean guam";
            class8.aByteArray178 = "Its Clean guam".getBytes();
        }
		if(i == 16213) // Your desired item id (the one you use after ::pickup ##### #)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear"; // String name, this can be changed to wield, or attach, or whatever you want
            class8.anIntArray156 = new int[12];
        class8.anIntArray160 = new int[12];
class8.anIntArray156[0] = 7884;  
class8.anIntArray160[0] = 588;  
class8.anIntArray156[1] = 7856;  
class8.anIntArray160[1] = 578;  
class8.anIntArray156[2] = 7892;  
class8.anIntArray160[2] = 596;  
class8.anIntArray156[3] = 7876;  
class8.anIntArray160[3] = 580;  
class8.anIntArray156[4] = 7860;  
class8.anIntArray160[4] = 564;  
class8.anIntArray156[5] = 7864;  
class8.anIntArray160[5] = 568;  
class8.anIntArray156[6] = 7880;  
class8.anIntArray160[6] = 584;  
class8.anIntArray156[7] = 7880;  
class8.anIntArray160[7] = 576;  
class8.anIntArray156[8] = 7872;  
class8.anIntArray160[8] = 578;  
class8.anIntArray156[9] = 7888;  
class8.anIntArray160[9] = 580;  
class8.anIntArray156[10] = 7848;  
class8.anIntArray160[10] = 578;  
class8.anIntArray156[11] = 7856;  
class8.anIntArray160[11] = 578;  
class8.anInt174 = 51845;
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
class8.aString170 = "Staff of Light"; // Item Name
class8.aByteArray178 = "Humming with power.".getBytes(); // Item Examine
      }
		
        if(i == 15124)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Choose-dice";
class8.anInt174 = 47850;
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
    class8.aString170 = "Dice bag";
    class8.aByteArray178 = "Its a Dice Bag".getBytes();
}
        if(i == 14670)
        {
            Jukkyname("Mod Sgs Platebody V.2", "Made By Mod Sgsrocks From Godzhell.");
            class8.anIntArray156 = new int[8];
            class8.anIntArray160 = new int[8];
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
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 47009;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 64162;
            class8.anInt181 = 1740;
            class8.anInt190 = 444;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = -8;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt174 = 5026;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Mod Sgs Platelegs V.2";
            class8.aByteArray178 = "Made By Mod Sgsrocks From Godzhell.".getBytes();
        }
        if(i == 14536)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Read";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 44853;
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
    class8.aString170 = "Turkey book";
    class8.aByteArray178 = "Its a Turkey book".getBytes();
}
        if(i == 14537)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Heal";
class8.aStringArray189[1] = "Food-Count";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 44855;
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
    class8.aString170 = "Cornucopia";
    class8.aByteArray178 = "Its a Cornucopia".getBytes();
}
        if(i == 14538)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[0] = "Heal";
class8.aStringArray189[1] = "Food-Count";
class8.aStringArray189[4] = "Destroy";
class8.anInt174 = 44857;
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
    class8.aString170 = "Cornucopia";
    class8.aByteArray178 = "Its a Cornucopia".getBytes();
}
        if(i == 14539)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Heal";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 5784;
            class8.anIntArray160[0] = 200;
            class8.anIntArray156[1] = 5786;
            class8.anIntArray160[1] = 202;
            class8.anIntArray156[2] = 5788;
            class8.anIntArray160[2] = 204;
            class8.anIntArray156[3] = 5790;
            class8.anIntArray160[3] = 206;
class8.anInt174 = 44856;
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
    class8.aString170 = "Raw turkey";
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
        class8.anInt174 = 44856;
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
            class8.aString170 = "Cooked turkey";
            class8.aByteArray178 = "Its a Cooked turkey".getBytes();
        }
        if(i == 14541)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Eat";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 5784;
            class8.anIntArray160[0] = 20;
            class8.anIntArray156[1] = 5786;
            class8.anIntArray160[1] = 22;
           class8.anIntArray156[2] = 5788;
            class8.anIntArray160[2] = 24;
            class8.anIntArray156[3] = 5790;
            class8.anIntArray160[3] = 26;
class8.anInt174 = 44856;
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
    class8.aString170 = "Burnt turkey";
    class8.aByteArray178 = "Its a Burnt turkey".getBytes();
}
        if(i == 14542)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Heal";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 5784;
            class8.anIntArray160[0] = 200;
            class8.anIntArray156[1] = 5786;
            class8.anIntArray160[1] = 202;
            class8.anIntArray156[2] = 5788;
            class8.anIntArray160[2] = 204;
            class8.anIntArray156[3] = 5790;
            class8.anIntArray160[3] = 206;
class8.anInt174 = 44854;
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
    class8.aString170 = "Raw turkey drumstick";
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
class8.anInt174 = 44854;
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
            class8.aString170 = "Cooked turkey drumstick";
            class8.aByteArray178 = "Its a Cooked turkey drumstick".getBytes();
        }
        if(i == 14544)
{
    class8.aStringArray189 = new String[5];
    //class8.aStringArray189[0] = "Eat";
//class8.aStringArray189[1] = "Food-Count";
//class8.aStringArray189[4] = "Destroy";
            class8.anIntArray156 = new int[4];
            class8.anIntArray160 = new int[4];
            class8.anIntArray156[0] = 5784;
            class8.anIntArray160[0] = 20;
            class8.anIntArray156[1] = 5786;
            class8.anIntArray160[1] = 22;
           class8.anIntArray156[2] = 5788;
            class8.anIntArray160[2] = 24;
            class8.anIntArray156[3] = 5790;
            class8.anIntArray160[3] = 26;
class8.anInt174 = 44854;
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
    class8.aString170 = "Burnt turkey drumstick";
    class8.aByteArray178 = "Its a Burnt turkey drumstick".getBytes();
}
        if(i == 18432)  // change this if you need to "item number"
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";//New option
class8.anIntArray156 = new int[0];
class8.anIntArray160 = new int[0];
class8.anInt174 = 70728; //Model ID
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
class8.aString170 = "Dragonbone platelegs";//Name of the new item
class8.aByteArray178 = "Looks pretty heavy. And mean. And bony.".getBytes();//examin info
}
        if(i == 12378)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 18105;
class8.anInt174 = 3373;
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
            class8.aString170 = "Lime Green beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12379)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 45549;
class8.anInt174 = 3373;
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
            class8.aString170 = "Unknowed White beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12380)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 50971;
class8.anInt174 = 3373;
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
            class8.aString170 = "Deep Purple beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12381)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 60176;
class8.anInt174 = 3373;
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
            class8.aString170 = "Deeper Purple beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12382)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 19213;
class8.anInt174 = 3373;
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
            class8.aString170 = "Deep Green beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12383)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 3654;
class8.anInt174 = 3373;
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
            class8.aString170 = "Dull Orange beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12384)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 12904;
class8.anInt174 = 3373;
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
            class8.aString170 = "Bright Yellow beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12385)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 618;
class8.anInt174 = 3373;
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
            class8.aString170 = "Bright PInk beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12386)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 46440;
class8.anInt174 = 3373;
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
            class8.aString170 = "Bright Blue beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12387)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 11378;
class8.anInt174 = 3373;
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
            class8.aString170 = "Bright Gray beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12388)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 36207;
class8.anInt174 = 3373;
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
            class8.aString170 = "Bright Sky Blue beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12389)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 32562;
class8.anInt174 = 3373;
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
            class8.aString170 = "Teal beret";
            class8.aByteArray178 = "Parlez-voius francais?".getBytes();
        }
        if(i == 12390)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 10659;
            class8.anIntArray160[0] = 8245;
class8.anInt174 = 3373;
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
            class8.aString170 = "Dark Gray beret";
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
class8.anInt174 = 4445;
class8.anInt165 = 4446;
class8.anInt200 = 4446;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.aString170 = "Sword of 1000 truths";
class8.aByteArray178 = "Lich King sword".getBytes();
}
if(i == 18358)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 62692;
class8.anInt165 = 62750;
class8.anInt200 = 62750;
class8.anInt188 = -1;
class8.anInt164 = -1;
class8.anInt181 = 2151;
class8.anInt190 = 429;
class8.anInt198 = 1189;
class8.anInt194 = 5;
class8.aString170 = "Zaryte Bow";
class8.aByteArray178 = "A powerful bow".getBytes();
}

if(i == 13482){ //Black Platelegs (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 11200;		
class8.anIntArray156[1] = 41;
class8.anIntArray160[1] = 11200;
class8.anIntArray156[2] = 57;
class8.anIntArray160[2] = 0; 
class8.anInt174 = 2582;
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
class8.aString170 = "Kyubi Legs";
class8.aByteArray178 = "It's Kurama's legs".getBytes();
}

if(i == 13483){ //Black Platebody (G)
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int [3];
class8.anIntArray156[0] = 61;
class8.anIntArray160[0] = 11200;		
class8.anIntArray156[1] = 24;
class8.anIntArray160[1] = 0;
class8.anIntArray156[2] = 41;
class8.anIntArray160[2] = 11200; 
class8.anInt174 = 2378;
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
class8.aString170 = "Kyubi Platebody";
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
            class8.anInt174 = 23708;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "RPG";
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
            class8.anInt174 = 39029;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Scarlet Spirit Shield";
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
            class8.anInt174 = 71126;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Off-Hand Drygore Rapier";
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
            class8.anInt174 = 72117;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Spine Cape";
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
            class8.anInt174 = 72120;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Chain Chomp";
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
            class8.anInt174 = 70000;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Knightmare Plate";
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
            class8.anInt174 = 70002;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Knightmare Legs";
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
            class8.anInt174 = 70004;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Knightmare Boots";
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
            class8.anInt174 = 70006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Knightmare Gloves";
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
            class8.anInt174 = 70008;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Knightmare Helm";
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
            class8.anInt174 = 70010;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Soul Edge";
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
            class8.anInt174 = 70012;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Claws Cape";
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
            class8.anInt174 = 70013;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Pacman Cape";
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
            class8.anInt174 = 70014;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Seth Sword";
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
            class8.anInt174 = 604;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Swoc Sword";
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
            class8.anInt174 = 80041;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Plate";
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
            class8.anInt174 = 95043;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Legs";
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
            class8.anInt174 = 63300;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Boots";
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
            class8.anInt174 = 75666;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Gloves";
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
            class8.anInt174 = 75664;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Helm";
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
            class8.anInt174 = 62112;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Cape";
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
            class8.anInt174 = 62108;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Coffin Shield";
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
            class8.anInt174 = 93096;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Light Plate";
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
            class8.anInt174 = 93094;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Light Legs";
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
            class8.anInt174 = 93046;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Light Helmet";
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
            class8.anInt174 = 81001;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Sexy Cape";
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
            class8.anInt174 = 62100;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Cow Cape";
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
            class8.anInt174 = 27657;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Quest Cape";
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
            class8.anInt174 = 93002;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Master Admin Cape";
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
            class8.anInt174 = 95011;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Kiln Cape";
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
            class8.anInt174 = 81067;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Dr Cape";
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
            class8.anInt174 = 73121;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Bob Cape";
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
            class8.anInt174 = 96501;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Veteran Cape";
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
            class8.anInt174 = 95048;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Pyrebob Shield 2";
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
            class8.anInt174 = 95046;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Pyrebob Sword";
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
            class8.anInt174 = 81063;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Golden Platelegs";
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
            class8.anInt174 = 72060;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Golden Plate";
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
            class8.anInt174 = 81021;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Sword of Ages";
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
            class8.anInt174 = 81031;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Sword of the Sea";
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
            class8.anInt174 = 81027;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Slenderman Tenticles";
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
            class8.anInt174 = 72048;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Sword of spirits";
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
            class8.anInt174 = 93032;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Blades";
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
            class8.anInt174 = 80015;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Hween";
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
            class8.anInt174 = 28999;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Claws";
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
            class8.anInt174 = 80013;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Cav";
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
            class8.anInt174 = 58051;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Whip";
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
            class8.anInt174 = 93058;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Crown";
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
            class8.anInt174 = 95038;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Drygore Legs";
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
            class8.anInt174 = 95022;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Drygore Plate";
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
            class8.anInt174 = 93078;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Wolf Helm";
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
            class8.anInt174 = 95078;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Superman Cape";
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
            class8.anInt174 = 93102;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Superman Plate";
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
            class8.anInt174 = 93100;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Superman Legs";
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
            class8.anInt174 = 53006;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Cool Cape";
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
            class8.anInt174 = 69597;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Monkey Cape";
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
            class8.anInt174 = 62853;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Plate";
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
            class8.anInt174 = 62773;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Legs";
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
            class8.anInt174 = 70962;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Rainbow Skull";
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
            class8.anInt174 = 71935;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Summoning Shield";
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
            class8.anInt174 = 71931;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Slayer Shield";
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
            class8.anInt174 = 8884;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Strength Shield";
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
            class8.anInt174 = 62827;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Swoc Shield";
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
            class8.anInt174 = 71996;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Shark Fists";
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
            class8.anInt174 = 71986;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Golden Scythe";
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
            class8.anInt174 = 19500;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Demon Wings";
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
            class8.anInt174 = 19502;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Slayer Cape";
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
            class8.anInt174 = 14390;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Corrupt Wings";
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
            class8.anInt174 = 18865;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Batarang";
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
            class8.anInt174 = 18864;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Dark Knight cape";
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
            class8.anInt174 = 18862;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Butterfly Wings";
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
            class8.anInt174 = 66433;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Pegasus Suit";
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
            class8.anInt174 = 67891;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Demon Plate";
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
            class8.anInt174 = 61666;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Jail Orb";
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
            class8.anInt174 = 19490;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owner Hat";
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
            class8.anInt174 = 19489;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owner Plate";
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
            class8.anInt174 = 19488;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owner Legs";
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
            class8.anInt174 = 19487;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owner Cape";
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
            class8.anInt174 = 19486;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Owner Gloves";
            class8.aByteArray178 = "Swoc".getBytes();
        }
if(i == 19486)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
           class8.anInt174 = 19485;
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
            class8.aString170 = "Owner Boots";
            class8.aByteArray178 = "Swoc".getBytes();
        }
if(i == 19485)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
           class8.anInt174 = 19484;
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
            class8.aString170 = "Seth Hood";
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
            class8.anInt174 = 19483;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Seth Body";
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
            class8.anInt174 = 19482;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Seth Chaps";
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
            class8.anInt174 = 19481;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Deathtouch Dart";
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
            class8.anInt174 = 19480;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Corruption Cape";
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
            class8.anInt174 = 19479;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Tattered Wings";
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
            class8.anInt174 = 19477;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Torva Cape";
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
            class8.anInt174 = 19475;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Deadric Bow";
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
            class8.anInt174 = 19474;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Obliteration";
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
            class8.anInt174 = 19473;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Brutal Claws";
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
            class8.anInt174 = 19472;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Beats Headset";
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
            class8.anInt174 = 19470;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Cow Head";
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
            class8.anInt174 = 19469;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Sun Glasses";
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
            class8.anInt174 = 19468;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Master Admin Cape";
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
            class8.anInt174 = 19466;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Master Mod Cape";
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
            class8.anInt174 = 50332;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Wolf Head";
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
            class8.anInt174 = 50334;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Wolf Plate";
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
            class8.anInt174 = 50336;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Wolf Bow";
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
            class8.anInt174 = 50338;
            class8.anInt188 = -1;
            class8.anInt164 = -1;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "Wolf Legs";
            class8.aByteArray178 = "In memory of a fallen hunter".getBytes();
}
if(i == 12391)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 18105;
class8.anInt174 = 7079;
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
    class8.aString170 = "Lime Green Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12392)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 45549;
class8.anInt174 = 7079;
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
    class8.aString170 = "Unknowed White Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12393)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 50971;
class8.anInt174 = 7079;
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
    class8.aString170 = "Deep Purple Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12394)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 60176;
class8.anInt174 = 7079;
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
    class8.aString170 = "Deeper Purple Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12395)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 19213;
class8.anInt174 = 7079;
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
    class8.aString170 = "Deep Green Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12396)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 3654;
class8.anInt174 = 7079;
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
    class8.aString170 = "Dull Orange Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12397)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 12904;
class8.anInt174 = 7079;
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
    class8.aString170 = "Bright Yellow Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12398)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 618;
class8.anInt174 = 7079;
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
    class8.aString170 = "Bright PInk Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12399)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 46440;
class8.anInt174 = 7079;
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
    class8.aString170 = "Bright Blue Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12400)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 11378;
class8.anInt174 = 7079;
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
    class8.aString170 = "Bright Gray Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12401)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 36207;
class8.anInt174 = 7079;
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
    class8.aString170 = "Bright Sky Blue Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12402)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 32562;
class8.anInt174 = 7079;
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
    class8.aString170 = "Teal Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 12403)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
    class8.anIntArray160 = new int[1];
    class8.anIntArray156[0] = 9529;
    class8.anIntArray160[0] = 8245;
class8.anInt174 = 7079;
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
    class8.aString170 = "Dark Gray Shorts";
    class8.aByteArray178 = "These look great, on dwarves!".getBytes();
}
if(i == 15339)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
class8.anInt174 = 82217;
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
    class8.aString170 = "X-MAS godsword";
    class8.aByteArray178 = "Its a Armadyl godsword".getBytes();
}
if(i == 14548)
{
    Jukkyname("Lexi's Platebody", "Its Lexi's platebody.");
    class8.anIntArray156 = new int[8];
    class8.anIntArray160 = new int[8];
    Jukkycolors(61, 100, 0);
    Jukkycolors(24, 58193, 1);
    Jukkycolors(41, 100, 2);
    Jukkycolors(10394, 100, 3);
    Jukkycolors(10518, 58193, 4);
    Jukkycolors(10388, 58193, 5);
    Jukkycolors(10514, 58193, 6);
    Jukkycolors(10508, 58193, 7);
    Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
    JukkyModels(6646, 3379, 6685, 3383, 2378);
}
if(i == 14549)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 100;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 58193;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Lexi's Platelegs";
    class8.aByteArray178 = "A set of Lexi's platelegs.".getBytes();
}
if(i == 14567)
{
    Jukkyname("Twistndshout Platebody", "Its Twistndshout's platebody.");
    class8.anIntArray156 = new int[8];
    class8.anIntArray160 = new int[8];
    Jukkycolors(61, 50, 0);
    Jukkycolors(24, 924, 1);
    Jukkycolors(41, 50, 2);
    Jukkycolors(10394, 50, 3);
    Jukkycolors(10518, 924, 4);
    Jukkycolors(10388, 924, 5);
    Jukkycolors(10514, 924, 6);
    Jukkycolors(10508, 924, 7);
    Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
    JukkyModels(6646, 3379, 6685, 3383, 2378);
}
if(i == 14572)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 50;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 924;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Twistndshout Platelegs";
    class8.aByteArray178 = "A set of Twistndshout's platelegs.".getBytes();
}
if(i == 14588)
{
    Jukkyname("Swoc Platebody", "Its Swoc's platebody.");
    class8.anIntArray156 = new int[8];
    class8.anIntArray160 = new int[8];
    Jukkycolors(61, 5035, 0);
    Jukkycolors(24, 41906, 1);
    Jukkycolors(41, 5035, 2);
    Jukkycolors(10394, 5035, 3);
    Jukkycolors(10518, 41906, 4);
    Jukkycolors(10388, 41906, 5);
    Jukkycolors(10514, 41906, 6);
    Jukkycolors(10508, 41906, 7);
    Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
    JukkyModels(6646, 3379, 6685, 3383, 2378);
}
if(i == 14589)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 5035;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 41906;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Swoc Platelegs";
    class8.aByteArray178 = "A set of Swoc's platelegs.".getBytes();
}
if(i == 14690)
{
    Jukkyname("x100 Platebody", "Its x100's platebody.");
    class8.anIntArray156 = new int[8];
    class8.anIntArray160 = new int[8];
    Jukkycolors(61, 65280, 0);
    Jukkycolors(24, 10934, 1);
    Jukkycolors(41, 65280, 2);
    Jukkycolors(10394, 65280, 3);
    Jukkycolors(10518, 10934, 4);
    Jukkycolors(10388, 10934, 5);
    Jukkycolors(10514, 10934, 6);
    Jukkycolors(10508, 10934, 7);
    Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
    JukkyModels(6646, 3379, 6685, 3383, 2378);
}
if(i == 14691)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 65280;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 10934;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "x100 Platelegs";
    class8.aByteArray178 = "A set of x100's platelegs.".getBytes();
}
if(i == 14692)
{
    Jukkyname("Payton Platebody", "Its Payton's platebody.");
    class8.anIntArray156 = new int[8];
    class8.anIntArray160 = new int[8];
    Jukkycolors(61, 44975, 0);
    Jukkycolors(24, 5053, 1);
    Jukkycolors(41, 44975, 2);
    Jukkycolors(10394, 44975, 3);
    Jukkycolors(10518, 5053, 4);
    Jukkycolors(10388, 5053, 5);
    Jukkycolors(10514, 5053, 6);
    Jukkycolors(10508, 5053, 7);
    Jukkyzoom(1380, 452, 0, 0, 0, -1, -1, -1, false);
    JukkyModels(6646, 3379, 6685, 3383, 2378);
}
if(i == 14693)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[2];
    class8.anIntArray160 = new int[2];
    class8.anIntArray156[0] = 926;
    class8.anIntArray160[0] = 44975;
    class8.anIntArray156[1] = 912;
    class8.anIntArray160[1] = 5053;
    class8.anInt181 = 1740;
    class8.anInt190 = 444;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = -8;
    class8.anInt165 = 5024;
    class8.anInt200 = 5025;
    class8.anInt174 = 5026;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Payton Platelegs";
    class8.aByteArray178 = "A set of Payton's platelegs.".getBytes();
}
if (i == 11346)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 64208;
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
class8.aString170 = "Orange Energy sword";
class8.aByteArray178 = "An Orange Energy Sword".getBytes();
}
if (i == 11347)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67221;
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
class8.aString170 = "Halloween Energy sword";
class8.aByteArray178 = "From traxxas Have a Happy Halloween =)".getBytes();
}
if (i == 11348)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67223;
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
class8.aString170 = "Bronze Energy sword";
class8.aByteArray178 = "an energy sword made of bronze.".getBytes();
}
if (i == 11349)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67225;
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
class8.aString170 = "Steel Energy sword";
class8.aByteArray178 = "an energy sword made of steel.".getBytes();
}
if (i == 11350)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67227;
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
class8.aString170 = "Mithril Energy sword";
class8.aByteArray178 = "an energy sword made of mithril.".getBytes();
}
if (i == 11351)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67229;
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
class8.aString170 = "Adamant Energy sword";
class8.aByteArray178 = "an energy sword made of adamant.".getBytes();
}
if (i == 11352)
{
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wield";
class8.anInt174 = 67231;
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
class8.aString170 = "Rune Energy sword";
class8.aByteArray178 = "an energy sword made of rune.".getBytes();
}
if(i == 22215)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 126;  
class8.anIntArray160[0] = 508;   
class8.anIntArray156[1] = 110;  
class8.anIntArray160[1] = 492;  
class8.anIntArray156[2] = 1142;  
class8.anIntArray160[2] = 508;   
class8.anIntArray156[3] = 102;  
class8.anIntArray160[3] = 492;  
    class8.anInt174 = 12020;
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
    class8.aString170 = "Gnome scarf";
    class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
}
if(i == 22216)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 126;  
class8.anIntArray160[0] = 7663;   
class8.anIntArray156[1] = 110;  
class8.anIntArray160[1] = 7647;  
class8.anIntArray156[2] = 1142;  
class8.anIntArray160[2] = 7663;   
class8.anIntArray156[3] = 102;  
class8.anIntArray160[3] = 7647;  
    class8.anInt174 = 12020;
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
    class8.aString170 = "Gnome scarf";
    class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
}
if(i == 22217)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 126;  
class8.anIntArray160[0] = 40374;   
class8.anIntArray156[1] = 110;  
class8.anIntArray160[1] = 40358;  
class8.anIntArray156[2] = 1142;  
class8.anIntArray160[2] = 40374;   
class8.anIntArray156[3] = 102;  
class8.anIntArray160[3] = 40358;  
    class8.anInt174 = 12020;
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
    class8.aString170 = "Gnome scarf";
    class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
}
if(i == 22218)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 126;  
class8.anIntArray160[0] = 26934;   
class8.anIntArray156[1] = 110;  
class8.anIntArray160[1] = 26918;  
class8.anIntArray156[2] = 1142;  
class8.anIntArray160[2] = 26934;   
class8.anIntArray156[3] = 102;  
class8.anIntArray160[3] = 26918;  
    class8.anInt174 = 12020;
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
    class8.aString170 = "Gnome scarf";
    class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
}
if(i == 22219)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[4];
class8.anIntArray160 = new int[4];
class8.anIntArray156[0] = 126;  
class8.anIntArray160[0] = 2192;   
class8.anIntArray156[1] = 110;  
class8.anIntArray160[1] = 2192;  
class8.anIntArray156[2] = 1142;  
class8.anIntArray160[2] = 2192;   
class8.anIntArray156[3] = 102;  
class8.anIntArray160[3] = 2192;  
    class8.anInt174 = 12020;
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
    class8.aString170 = "Gnome scarf";
    class8.aByteArray178 = "A scarf. You feel your upper lip stiffening.".getBytes();
}
if(i == 20169)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
class8.anInt174 = 62700;
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
    class8.aString170 = "Virtus robe legs";
    class8.aByteArray178 = "its an Virtus robe legs".getBytes();
}

if(i == 20165)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
class8.anInt174 = 62704;
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
    class8.aString170 = "Virtus robe top";
    class8.aByteArray178 = "its an Virtus robe top".getBytes();
}

if(i == 20159)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
class8.anInt174 = 62710;
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
    class8.aString170 = "Virtus Mask";
    class8.aByteArray178 = "its an Virtus Mask".getBytes();
}
		        if(i == 14595)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45273;
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
            class8.aString170 = "Santa costume top";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14596)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45276;
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
            class8.aString170 = "Ice amulet";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14599)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45276;
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
            class8.aString170 = "Ice amulet";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14601)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45278;
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
            class8.aString170 = "Santa costume top";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
		        if(i == 14602)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45280;
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
            class8.aString170 = "Santa costume gloves";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14603)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45275;
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
            class8.aString170 = "Santa costume legs";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14604)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
class8.anInt174 = 45275;
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
            class8.aString170 = "Santa costume legs";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
        if(i == 14605)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
			class8.anInt174 = 45272;
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
            class8.aString170 = "Santa costume boots";
            class8.aByteArray178 = "Merry X-mas! from traxxas. 2014!".getBytes();
        }
		        if(i == 14524)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
			class8.anInt174 = 99552;
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
            class8.aString170 = "rasta wings";
            class8.aByteArray178 = "test".getBytes();
        }
		if(i == 25612)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
   // class8.anIntArray156 = new int[1];
//class8.anIntArray160 = new int[1];
//class8.anIntArray160[0] = 32984;  
class8.anInt174 =  5412;
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
    class8.aString170 = "Tri Whip";
    class8.aByteArray178 = "a tri Whip".getBytes();
}
                if (i == 21338)
			{
                        class8.aStringArray189 = new String[5];
                        class8.aStringArray189[1] = "Wield";
                        class8.anInt174 = 84200;
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
                        class8.aString170 = "Duel Energy swords";
                        class8.aByteArray178 = "A strong swords made of energy.".getBytes();
                }
				if(i == 21690)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.aStringArray189[2] = "Dismantle"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 88162;
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
    class8.aString170 = "Tri Armadyl godsword";
    class8.aByteArray178 = "Its a Tri Armadyl godsword".getBytes();
}
if(i == 20111)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 98162;
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
    class8.aString170 = "Blue halo";
    class8.aByteArray178 = "Its a halo".getBytes();
}
if(i == 20112)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 98162;
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
    class8.aString170 = "Green halo";
    class8.aByteArray178 = "Its a halo".getBytes();
}
if(i == 20113)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 98164;
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
    class8.aString170 = "Pink halo";
    class8.aByteArray178 = "Its a halo".getBytes();
}

if(i == 20114)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 98165;
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
    class8.aString170 = "Red halo";
    class8.aByteArray178 = "Its a halo".getBytes();
}

if(i == 20115)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
//class8.anIntArray156[0] = 61;  
//class8.anIntArray160[0] = 5652;       
class8.anInt174 = 98166;
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
    class8.aString170 = "Yellow halo";
    class8.aByteArray178 = "Its a halo".getBytes();
}
if(i == 12637)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 28844;
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
    class8.aString170 = "Saradomin halo";
    class8.aByteArray178 = "a Saradomin halo".getBytes();
}
if(i == 12638)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 28838;
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
    class8.aString170 = "Zamorak halo";
    class8.aByteArray178 = "a Zamorak halo".getBytes();
}
if(i == 12639)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 28837;
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
    class8.aString170 = "Guthix halo";
    class8.aByteArray178 = "a Guthix halo".getBytes();
}

if(i == 22639)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 93866;
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
    class8.aString170 = "Paradox Wings";
    class8.aByteArray178 = "epic right??".getBytes();
}
if(i == 22640)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 93865;
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
    class8.aString170 = "Crystalline wings";
    class8.aByteArray178 = "epic right??".getBytes();
}
if(i == 22641)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 93265;
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
    class8.aString170 = "Owen 2h sword";
    class8.aByteArray178 = "an Owen 2h sword.".getBytes();
}
if(i == 22642)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 93865;
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
    class8.aString170 = "Dragon Rider cape";
    class8.aByteArray178 = "epic right??".getBytes();
}
		        if(i == 13746){
				            class8.aStringArray189 = new String[5];
class8.anInt174 = 40914;
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
				            class8.aString170 = "Arcane sigil";
				            class8.aByteArray178 = "its an Arcane sigil.".getBytes();
        }
		        if(i == 13748){
				            class8.aStringArray189 = new String[5];
class8.anInt174 = 40916;
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
				            class8.aString170 = "Divine sigil";
				            class8.aByteArray178 = "its an Divine sigil".getBytes();
        }
		        if(i == 13750){
				            class8.aStringArray189 = new String[5];
class8.anInt174 = 40917;
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
				            class8.aString170 = "Elysian sigil";
				            class8.aByteArray178 = "its an Elysian sigil".getBytes();
        }
		        if(i == 13752){
				            class8.aStringArray189 = new String[5];
class8.anInt174 = 40918;
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
				            class8.aString170 = "Spectral sigil";
				            class8.aByteArray178 = "its an Spectral sigil".getBytes();
        }

		        if(i == 13754){
				            class8.aStringArray189 = new String[5];
class8.anInt174 = 40949;
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
				            class8.aString170 = "Holy elixir";
				            class8.aByteArray178 = "its an Holy elixir".getBytes();
        }
		        if(i == 13734)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40919;
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
            class8.aString170 = "Spirit shield";
            class8.aByteArray178 = "its an Spirit shield.".getBytes();
        }

        if(i == 13736)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40913;
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
            class8.aString170 = "Blessed spirit shield";
            class8.aByteArray178 = "its an Blessed spirit shield.".getBytes();
        }
        if(i == 1835)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 61;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 61;
            class8.anIntArray160[1] = 1000;
            class8.anInt174 = 5037;
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
            class8.aString170 = "2008 H'ween boots";
            class8.aByteArray178 = "The 2008 Halloween event boots.".getBytes();
        }
       if(i == 1297)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 12;
            class8.anIntArray156[1] = 912;
            class8.anIntArray160[1] = 908;
            class8.anInt174 = 5026;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 5024;
            class8.anInt200 = 5025;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "2008 H'ween legs";
            class8.aByteArray178 = "The 2008 Halloween event platelegs.".getBytes();
        }
        if(i == 15235)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 10266;
            class8.anIntArray160[0] = 12;
            class8.anIntArray156[1] = 3171;
            class8.anIntArray160[1] = 908;
            class8.anInt174 = 8733;
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
            class8.aString170 = "2008 H'ween plate";
            class8.aByteArray178 = "The 2008 Halloween event Platebody...".getBytes();
        }
        if(i == 1573)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 10283;
            class8.anIntArray160[0] = 12;
            class8.anIntArray156[1] = 10270;
            class8.anIntArray160[1] = 908;
            class8.anInt174 = 8700;
            class8.anInt190 = 452;
            class8.anInt198 = 0;
            class8.anInt204 = 0;
            class8.anInt169 = 0;
            class8.anInt194 = 0;
            class8.anInt165 = 8726;
            class8.anInt200 = 8750;
            class8.anInt175 = -1;
            class8.anInt197 = -1;
            class8.aString170 = "2008 H'ween gloves";
            class8.aByteArray178 = "2008 Halloween event gloves.".getBytes();
        }
        if(i == 1801)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[1];
            class8.anIntArray160 = new int[1];
            class8.anIntArray156[0] = 926;
            class8.anIntArray160[0] = 0;
            class8.anInt174 = 2438;
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
            class8.aString170 = "2008 Mask";
            class8.aByteArray178 = "The 2008 Halloween event whip.".getBytes();
        }
        if(i == 13738)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40922;
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
            class8.aString170 = "Arcane spirit shield";
            class8.aByteArray178 = "its an Arcane spirit shield.".getBytes();
        }
        if(i == 13740)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40921;
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
            class8.aString170 = "Divine spirit shield";
            class8.aByteArray178 = "its an Divine spirit shield.".getBytes();
        }
        if(i == 13742)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40915;
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
            class8.aString170 = "Elysian spirit shield";
            class8.aByteArray178 = "its an Elysian spirit shield.".getBytes();
        }
        if(i == 13744)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[0];
            class8.anIntArray160 = new int[0];
class8.anInt174 = 40920;
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
            class8.aString170 = "Spectral spirit shield";
            class8.aByteArray178 = "its an Spectral spirit shield.".getBytes();
        }
		if(i == 19569)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91067;
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
            class8.aString170 = "Dr Cape (Blue)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
				if(i == 19570)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91068;
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
            class8.aString170 = "Dr Cape (Green)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 19571)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91070;
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
            class8.aString170 = "Dr Cape (Light Blue)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 19572)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91072;
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
            class8.aString170 = "Dr Cape (Orange)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 19573)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91074;
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
            class8.aString170 = "Dr Cape (Pink)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 19574)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91076;
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
            class8.aString170 = "Dr Cape (Purple)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 19575)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anInt174 = 91078;
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
            class8.aString170 = "Dr Cape (Red)";
            class8.aByteArray178 = "Trust me im a doctor".getBytes();
        }
		if(i == 12337)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[2];
        class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 7073;  
class8.anIntArray160[0] = 5231;       
class8.anIntArray156[1] = 127;  
class8.anIntArray160[1] = 24;      
class8.anInt174 = 2451;
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
            class8.aString170 = "White cavalier";
            class8.aByteArray178 = "an cavalier from osrs.".getBytes();
        }
		if(i == 12463)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;  
class8.anIntArray160[0] = 5904;       
class8.anIntArray156[1] = 38119;  
class8.anIntArray160[1] = 5652;      
class8.anIntArray156[2] = 38315;
class8.anIntArray160[2] = 4395;
class8.anInt174 = 28739;
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
            class8.aString170 = "Bronze dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12465)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;  
class8.anIntArray160[0] = 20;       
class8.anIntArray156[1] = 38119;  
class8.anIntArray160[1] = 24;      
class8.anIntArray156[2] = 38315;
class8.anIntArray160[2] = 33;
class8.anInt174 = 28739;
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
            class8.aString170 = "Iron dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12467)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;  
class8.anIntArray160[0] = 5161;       
class8.anIntArray156[1] = 38119;  
class8.anIntArray160[1] = 3123;      
class8.anIntArray156[2] = 38315;
class8.anIntArray160[2] = 3148;
class8.anInt174 = 28739;
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
            class8.aString170 = "Steel dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12468)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;       
class8.anIntArray156[1] = 38119;    
class8.anIntArray156[2] = 38315;
class8.anIntArray160 = new int[] { -27364, -27359, -27479 };
class8.anInt174 = 28739;
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
            class8.aString170 = "Mithril dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12471)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
			class8.anIntArray156[0] = 38119;
			class8.anIntArray160[0] = 6072;
			class8.anIntArray156[1] = 40167;
			class8.anIntArray160[1] = 6072;
class8.anInt174 = 28714;
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
            class8.aString170 = "Lava dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12518)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;       
class8.anIntArray156[1] = 38119;        
class8.anIntArray156[2] = 38315;
class8.anIntArray160 = new int[] { 22049, 21910, 25484 };
class8.anInt174 = 28739;
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
            class8.aString170 = "Green dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12520)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;       
class8.anIntArray156[1] = 38119;        
class8.anIntArray156[2] = 38315;
class8.anIntArray160 = new int[] { -27099, -26841, -26845 };
class8.anInt174 = 28739;
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
            class8.aString170 = "Blue dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12522)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;       
class8.anIntArray156[1] = 38119;        
class8.anIntArray156[2] = 38315;
class8.anIntArray160 = new int[] { 935, 941, 716 };
class8.anInt174 = 28739;
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
            class8.aString170 = "Red dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12524)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear"; 
            class8.anIntArray156 = new int[3];
        class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 127;       
class8.anIntArray156[1] = 38119;        
class8.anIntArray156[2] = 38315;
class8.anIntArray160 = new int[] { 0, 30, 26 };
class8.anInt174 = 28739;
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
            class8.aString170 = "Black dragon mask";
            class8.aByteArray178 = "an dragon mask from osrs.".getBytes();
        }
		if(i == 12347)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
	class8.anIntArray160 = new int[] { 109, 11179, 9917, 9771, 8867, 10910 };
	            class8.anIntArray156 = new int[] { 105, -10364, 64, 47, 35, 26 };
	            class8.anInt174 = 10114;            
	            class8.anInt169 = -1;
	            class8.anInt181 = 1373;
	            class8.anInt190 = 452;
	            class8.anInt198 = 0;
	            class8.anInt194 = 7;
	            class8.anInt204 = 2047;
	            class8.anInt165 = 10115;
	            class8.anInt200 = 10117;
	            class8.anInt164 = 10118;
	            class8.anInt188 = 10116;
            class8.aBoolean176 = false;
            class8.aString170 = "Gold ele' shirt";
            class8.aByteArray178 = "A well made elegant shirt.".getBytes();
        }
		if(i == 12489)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
	class8.anIntArray160 = new int[] { 7114 };
	            class8.anIntArray156 = new int[] { 61 };
	            class8.anInt174 = 2373;
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
            class8.aString170 = "Gilded scimitar";
            class8.aByteArray178 = "an Gilded scimitar from osrs".getBytes();
        }
		if(i == 12491)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wield";
	class8.anIntArray160 = new int[] {  7114, 7104  };
	            class8.anIntArray156 = new int[] { 61, 5400 };
	            class8.anInt174 = 5037;
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
            class8.aString170 = "Gilded boots";
            class8.aByteArray178 = "an Gilded boots from osrs".getBytes();
        }
		if(i == 12419)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
	class8.anIntArray160 = new int[] { 107, 7114, 5239, 6253, 7114 };
	            class8.anIntArray156 = new int[] { 695, 55977, 9152, 41920, 17979  };
class8.anInt174 = 10583;
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
            class8.aString170 = "Light infinity hat";
            class8.aByteArray178 = "an Light infinity hat from osrs".getBytes();
        }
		if(i == 12420)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
	class8.anIntArray160 = new int[] { 107, 7114, 6622, 6253, 5239, 7114 };
	            class8.anIntArray156 = new int[] {  695, 55977, 24512, 46016, 9152, 58316 };
class8.anInt174 = 10586;
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
            class8.aString170 = "Light infinity top";
            class8.aByteArray178 = "an Light infinity top from osrs".getBytes();
        }
		if(i == 12421)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
	class8.anIntArray160 = new int[] { 107, 7114, 6622, 6253, 7114 };
	            class8.anIntArray156 = new int[] { 695, 55977, 24512, 46016, 58316  };
class8.anInt174 = 10585;
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
            class8.aString170 = "Light infinity bottoms";
            class8.aByteArray178 = "an Light infinity bottoms from osrs".getBytes();
        }
		if(i == 12457)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[5];
            class8.anIntArray160 = new int[5];
	class8.anIntArray160 = new int[] {  0, -8535, -10344, -7220, -8535 };
	            class8.anIntArray156 = new int[] { 695, 55977, 9152, 41920, 17979  };
class8.anInt174 = 10583;
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
            class8.aString170 = "Dark infinity hat";
            class8.aByteArray178 = "an Dark infinity hat from osrs".getBytes();
        }
		if(i == 12458)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
	class8.anIntArray160 = new int[] { 0, -8535, -10344, 0, 0, -8535 };
	            class8.anIntArray156 = new int[] {  695, 55977, 24512, 46016, 9152, 58316 };
class8.anInt174 = 10586;
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
            class8.aString170 = "Dark infinity top";
            class8.aByteArray178 = "an Dark infinity top from osrs".getBytes();
        }
		if(i == 12459)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
	class8.anIntArray160 = new int[] { 0, -8535, -10344, 0, -8535 };
	            class8.anIntArray156 = new int[] { 695, 55977, 24512, 46016, 58316  };
class8.anInt174 = 10585;
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
            class8.aString170 = "Dark infinity bottoms";
            class8.aByteArray178 = "an Dark infinity bottoms from osrs".getBytes();
        }
        if(i == 10195)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 18105;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 18105;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Lime Green Bunny ears";
            class8.aByteArray178 = "Its A Lime Green Bunny ears".getBytes();
        }
        if(i == 10196)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 45549;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 45549;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Unknowned White Bunny ears";
            class8.aByteArray178 = "Its A Unknowned White Bunny ears".getBytes();
        }
        if(i == 10197)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 50971;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 50971;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Deep Purple Bunny ears";
            class8.aByteArray178 = "Its A Deep Purple Bunny ears".getBytes();
        }
        if(i == 10198)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 60176;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 60176;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Deeper Purple Bunny ears";
            class8.aByteArray178 = "Its A Deeper Purple Bunny ears".getBytes();
        }
        if(i == 10199)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 19213;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 19213;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Deep Green Bunny ears";
            class8.aByteArray178 = "Its A Deep Green Bunny ears".getBytes();
        }
        if(i == 10200)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 3654;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 3654;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Dull Orange Bunny ears";
            class8.aByteArray178 = "Its A Dull Orange Bunny ears".getBytes();
        }
        if(i == 10201)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 12904;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 12904;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bright Yellow Bunny ears";
            class8.aByteArray178 = "Its A Bright Yellow Bunny ears".getBytes();
        }
        if(i == 10202)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 618;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 618;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bright Pink Bunny ears";
            class8.aByteArray178 = "Its A Bright Pink Bunny ears".getBytes();
        }
        if(i == 10203)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 46440;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 46440;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bright Blue Bunny ears";
            class8.aByteArray178 = "Its A Bright Blue Bunny ears".getBytes();
        }
        if(i == 10204)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 11378;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 11378;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bright Gray Bunny ears";
            class8.aByteArray178 = "Its A Bright Gray Bunny ears".getBytes();
        }
        if(i == 10205)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 36207;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 36207;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Bright Sky Blue Bunny ears";
            class8.aByteArray178 = "Its A Bright Sky Blue Bunny ears".getBytes();
        }
        if(i == 10206)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 32562;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 32562;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Teal Bunny ears";
            class8.aByteArray178 = "Its A Teal Bunny ears".getBytes();
        }
        if(i == 10207)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[2];
            class8.anIntArray160 = new int[2];
            class8.anIntArray156[0] = 933;
            class8.anIntArray160[0] = 8245;
            class8.anIntArray156[1] = 10351;
            class8.anIntArray160[1] = 8245;
	    class8.anInt174 = 2553;
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
            class8.aString170 = "Dark Gray Bunny ears";
            class8.aByteArray178 = "Its A Dark Gray Bunny ears".getBytes();
        }
        if(i == 24711)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 0;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 0;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 0;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 0;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 0;
            class8.anInt174 = 71948;
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
            class8.aString170 = "Depleted pendant";
            class8.aByteArray178 = "It's a Depleted pendant.".getBytes();
        }
        if(i == 24712)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 0;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 0;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 0;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 0;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 0;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 0;
            class8.anInt174 = 71949;
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
            class8.aString170 = "Depleted prized pendant";
            class8.aByteArray178 = "It's a Depleted prized pendant.".getBytes();
        }
        if(i == 24713)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 65408;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 65441;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 65458;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 8086;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 8119;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 8187;
            class8.anInt174 = 71948;
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
            class8.aString170 = "Pendant of Attack";
            class8.aByteArray178 = "It's a Pendant of Attack.".getBytes();
        }
        if(i == 24714)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 65408;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 65441;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 65458;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 8086;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 8119;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 8187;
            class8.anInt174 = 71949;
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
            class8.aString170 = "Prized pendant of Attack";
            class8.aByteArray178 = "It's a Prized pendant of Attack.".getBytes();
        }
        if(i == 24715)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 26505;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 26516;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 26537;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 918;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 951;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 1019;
            class8.anInt174 = 71948;
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
            class8.aString170 = "Pendant of Strength";
            class8.aByteArray178 = "It's a Pendant of Strength.".getBytes();
        }
        if(i == 24716)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 26505;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 26516;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 26537;
            class8.anIntArray156[3] = 20607;
            class8.anIntArray160[3] = 918;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 951;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 1019;
            class8.anInt174 = 71949;
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
            class8.aString170 = "Prized pendant of Strength";
            class8.aByteArray178 = "It's a Prized pendant of Strength.".getBytes();
        }
        if(i == 24717)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 37780;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 37793;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 26537;
            class8.anIntArray156[3] = 37838;
            class8.anIntArray160[3] = 20607;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 64601;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 64639;
            class8.anInt174 = 71948;
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
            class8.aString170 = "Pendant of Defence";
            class8.aByteArray178 = "It's a Pendant of Defence.".getBytes();
        }
        if(i == 24718)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.aStringArray189[2] = "Check";
            class8.anIntArray156 = new int[6];
            class8.anIntArray160 = new int[6];
            class8.anIntArray156[0] = 32779;
            class8.anIntArray160[0] = 37780;
            class8.anIntArray156[1] = 33754;
            class8.anIntArray160[1] = 37793;
            class8.anIntArray156[2] = 54245;
            class8.anIntArray160[2] = 26537;
            class8.anIntArray156[3] = 37838;
            class8.anIntArray160[3] = 20607;
            class8.anIntArray156[4] = 21466;
            class8.anIntArray160[4] = 64601;
            class8.anIntArray156[5] = 54245;
            class8.anIntArray160[5] = 64639;
            class8.anInt174 = 71949;
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
            class8.aString170 = "Prized pendant of Defence";
            class8.aByteArray178 = "It's a Prized pendant of Defence.".getBytes();
        }
    	if(i == 20786)
        {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 79221;
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
class8.aString170 = "Gilded dragon pickaxe";
class8.aByteArray178 = "Used for mining.".getBytes();
}
    	if(i == 20108)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";    
class8.anInt174 =  65412;
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
            class8.aString170 = "Easter Whip";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
    	if(i == 20109)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";    
class8.anInt174 = 65413;
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
            class8.aString170 = "Easter maul";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
    	if(i == 20110)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";    
class8.anInt174 =  65412;
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
            class8.aString170 = "Easter Whip ( 3D )";
            class8.aByteArray178 = "Happy Easter 2015! =)".getBytes();
        }
    	if(i == 12809)
        {
            class8.aStringArray189 = new String[5];
            class8.aStringArray189[1] = "Wear";
            class8.anIntArray160 = new int[] { 7097, 7114, 7114 };
            class8.anIntArray156 = new int[] { 43086, 43111, 43098 };
            class8.anInt174 = 28045;
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
            class8.aString170 = "Saradomin's blessed sword";
            class8.aByteArray178 = "The blade of an Icyene, blessed with a tear from Saradomin himself.".getBytes();
        }
		if(i == 15624)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 528;  
class8.anIntArray160[0] = 22443;       
class8.anInt174 =  5412;
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
    class8.aString170 = "Emerald Whip";
    class8.aByteArray178 = "a Emerald Whip".getBytes();
}


if(i == 15625)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 33;  
class8.anIntArray160[0] = 22443;   
class8.anIntArray156[1] = 49;  
class8.anIntArray160[1] = 22443; 
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 22443;    
class8.anInt174 = 2558;
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
    class8.aString170 = "Emerald chainbody";
    class8.aByteArray178 = "a Emerald chainbody".getBytes();
}

if(i == 15626)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 24;  
class8.anIntArray160[0] = 22443;   
class8.anIntArray156[1] = 61;  
class8.anIntArray160[1] = 22443; 
class8.anIntArray156[2] = 41;  
class8.anIntArray160[2] = 22443;    
class8.anInt174 = 2605;
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
    class8.aString170 = "Emerald Platebody";
    class8.aByteArray178 = "a Emerald Platebody".getBytes();
}

if(i == 15627)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[1];
class8.anIntArray160 = new int[1];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 22443;   
class8.anInt174 = 2833;
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
    class8.aString170 = "Emerald Med Helm";
    class8.aByteArray178 = "a Emerald Med Helm".getBytes();
}

if(i == 15628)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[2];
class8.anIntArray160 = new int[2];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 22443;   
class8.anIntArray156[1] = 926;  
class8.anIntArray160[1] = 48030;   
class8.anInt174 = 2813;
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
    class8.aString170 = "Emerald full Helm";
    class8.aByteArray178 = "a Emerald full Helm".getBytes();
}

if(i == 15629)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
    class8.anIntArray156 = new int[3];
class8.anIntArray160 = new int[3];
class8.anIntArray156[0] = 61;  
class8.anIntArray160[0] = 22443;   
class8.anIntArray156[1] = 41;  
class8.anIntArray160[1] = 22443;   
class8.anIntArray156[2] = 57;  
class8.anIntArray160[2] = 22443;  
class8.anInt174 = 2582;
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
    class8.aString170 = "Emerald Platelegs";
    class8.aByteArray178 = "a Emerald platelegs".getBytes();
}
if(i == 18353)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
class8.anInt174 = 54286;
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
    class8.aString170 = "Chaotic maul";
    class8.aByteArray178 = "A maul used to claim life from those who don't deserve it.".getBytes();
}
if(i == 18349)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
class8.anInt174 = 54197;
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
    class8.aString170 = "Chaotic rapier";
    class8.aByteArray178 = "A razor-sharp rapier.".getBytes();
}
if(i == 18351)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
class8.anInt174 = 54204;
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
    class8.aString170 = "Chaotic longsword";
    class8.aByteArray178 = "A razor-sharp longsword.".getBytes();
}
if(i == 18355)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear"; 
class8.anInt174 = 54367;
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
    class8.aString170 = "Chaotic staff";
    class8.aByteArray178 = "This staff makes destructive spells more powerful.".getBytes();
}
if(i == 20745)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 65261;
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
    class8.aString170 = "Veteran cape";
    class8.aByteArray178 = "Its A Veteran cape.".getBytes();
}
if(i == 20744)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
    class8.anInt174 = 65271;
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
    class8.aString170 = "Veteran hood";
    class8.aByteArray178 = "Its A Veteran hood.".getBytes();
}
if(i == 13108)
{
    class8.aStringArray189 = new String[] { null, "Wield", null, null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
        class8.anInt174 = 29121;
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
    class8.aString170 = "Wilderness sword 1";
    class8.aByteArray178 = "an Wilderness sword 1 from osrs".getBytes();
}
if(i == 13109)
{
    class8.aStringArray189 = new String[] { null, "Wield", null, null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
        class8.anInt174 = 29128;
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
    class8.aString170 = "Wilderness sword 2";
    class8.aByteArray178 = "an Wilderness sword 2 from osrs".getBytes();
}
if(i == 13110)
{
    class8.aStringArray189 = new String[] { null, "Wield", "Teleport", null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
        class8.anInt174 = 29160;
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
    class8.aString170 = "Wilderness sword 3";
    class8.aByteArray178 = "an Wilderness sword 3 from osrs".getBytes();
}
if(i == 13111)
{
    class8.aStringArray189 = new String[] { null, "Wield", "Teleport", null, "Destroy" };
//class8.anIntArray160 = new int[] {  7114, 7104  };
//          class8.anIntArray156 = new int[] { 61, 5400 };
        class8.anInt174 = 29157;
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
    class8.aString170 = "Wilderness sword 4";
    class8.aByteArray178 = "an Wilderness sword 4 from osrs".getBytes();
}
if(i == 29536)
{
    class8.aStringArray189 = new String[5];
    class8.aStringArray189[1] = "Wear";
  class8.anIntArray156 = new int[] { 50111, 43468 };
  class8.anIntArray160 = new int[] { -23903, -23903 };
    class8.anInt165 = 96500;
    class8.anInt181 = 2200;
    class8.anInt190 = 572;
    class8.anInt198 = 0;
    class8.anInt204 = 0;
    class8.anInt169 = 0;
    class8.anInt194 = 1;
    class8.anInt200 = 96500;
    class8.anInt174 = 96501;
    class8.anInt188 = -1;
    class8.anInt164 = -1;
    class8.anInt175 = -1;
    class8.anInt197 = -1;
    class8.aString170 = "Veteran Cape (Navy)";
    class8.aByteArray178 = "SwocScape vet".getBytes();
}
if(i == 13680) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14125; //Inv & Ground
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
class8.aString170 = "Ex-Moderator cape";
class8.aByteArray178 = "Its A Ex-moderator Cape".getBytes();
}
if(i == 13681) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14127; //Inv & Ground
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
class8.aString170 = "Ex-Administrator cape";
class8.aByteArray178 = "Its an Ex-administrator cape".getBytes();
}
if(i == 13682) {
class8.aStringArray189 = new String[5];
class8.aStringArray189[1] = "Wear";
class8.anInt174 = 14129; //Inv & Ground
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
class8.aString170 = "Ex-Owner cape";
class8.aByteArray178 = "Its an Ex-owner cape".getBytes();
        }
	    return class8;
	}


 public static void Models(int Ground, int Male, int Female)
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.anInt174 = Ground;
 class8.anInt165 = Male;
 class8.anInt200 = Female;
 }
 
 public static void NewColor(int Old, int New, int Num)
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.anIntArray156[Num] = Old;
 class8.anIntArray160[Num] = New;
 }

 public static void NEO(String Name, String Examine, String Option)// NEO = Name Examine Option
 {
 Class8 class8 = aClass8Array172[anInt180];
 class8.aStringArray189 = new String[5];
 class8.aStringArray189[1] = Option;
 class8.aString170 = Name;
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
     class8.anIntArray156[num] = old;
     class8.anIntArray160[num] = neww;
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
     class8.aString170 = name;
     class8.aByteArray178 = examine.getBytes();
 }
 public static void JukkyModels(int male, int malearms, int female, int femalearms, int dropmdl) {
     Class8 class8 = aClass8Array172[anInt180];
     class8.anInt165 = male;
     class8.anInt188 = malearms;
     class8.anInt200 = female;
     class8.anInt164 = femalearms;
     class8.anInt174 = dropmdl;
 }
    public void method199(byte byte0)
    {
        Class8 class8 = method198(anInt163);
        anInt174 = class8.anInt174;
        anInt181 = class8.anInt181;
        anInt190 = class8.anInt190;
        anInt198 = class8.anInt198;
        anInt204 = class8.anInt204;
        anInt169 = class8.anInt169;
        anInt194 = class8.anInt194;
        if(byte0 != 61)
            aBoolean186 = !aBoolean186;
        anIntArray156 = class8.anIntArray156;
        anIntArray160 = class8.anIntArray160;
        Class8 class8_1 = method198(anInt179);
        aString170 = class8_1.aString170;
        aBoolean161 = class8_1.aBoolean161;
        anInt155 = class8_1.anInt155;
        String s = "a";
        char c = class8_1.aString170.charAt(0);
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            s = "an";
        aByteArray178 = ("Swap this note at any bank for " + s + " " + class8_1.aString170 + ".").getBytes();
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
        class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, anInt174);
        if(class30_sub2_sub4_sub6 == null)
            return null;
        if(anInt167 != 128 || anInt192 != 128 || anInt191 != 128)
            class30_sub2_sub4_sub6.method478(anInt167, anInt191, anInt177, anInt192);
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
                class30_sub2_sub4_sub6.method476(anIntArray156[l], anIntArray160[l]);

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
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt171, anInt174);
        if(!flag)
            throw new NullPointerException();
        if(class30_sub2_sub4_sub6 == null)
            return null;
        if(anIntArray156 != null)
        {
            for(int l = 0; l < anIntArray156.length; l++)
                class30_sub2_sub4_sub6.method476(anIntArray156[l], anIntArray160[l]);

        }
        return class30_sub2_sub4_sub6;
    }

    public final void method203(boolean flag, Class30_Sub2_Sub2 class30_sub2_sub2)
    {
        if(!flag)
            throw new NullPointerException();
        do
        {
            int i = class30_sub2_sub2.method408();
            if(i == 0)
                return;
            if(i == 1)
                anInt174 = class30_sub2_sub2.method410();
            else
            if(i == 2)
                aString170 = class30_sub2_sub2.method415();
            else
            if(i == 3)
                aByteArray178 = class30_sub2_sub2.method416((byte)30);
            else
            if(i == 4)
                anInt181 = class30_sub2_sub2.method410();
            else
            if(i == 5)
                anInt190 = class30_sub2_sub2.method410();
            else
            if(i == 6)
                anInt198 = class30_sub2_sub2.method410();
            else
            if(i == 7)
            {
                anInt169 = class30_sub2_sub2.method410();
                if(anInt169 > 32767)
                    anInt169 -= 0x10000;
            } else
            if(i == 8)
            {
                anInt194 = class30_sub2_sub2.method410();
                if(anInt194 > 32767)
                    anInt194 -= 0x10000;
            } else
            if(i == 10)
                anInt199 = class30_sub2_sub2.method410();
            else
            if(i == 11)
                aBoolean176 = true;
            else
            if(i == 12)
                anInt155 = class30_sub2_sub2.method413();
            else
            if(i == 16)
                aBoolean161 = true;
            else
            if(i == 23)
            {
                anInt165 = class30_sub2_sub2.method410();
                aByte205 = class30_sub2_sub2.method409();
            } else
            if(i == 24)
                anInt188 = class30_sub2_sub2.method410();
            else
            if(i == 25)
            {
                anInt200 = class30_sub2_sub2.method410();
                aByte154 = class30_sub2_sub2.method409();
            } else
            if(i == 26)
                anInt164 = class30_sub2_sub2.method410();
            else
            if(i >= 30 && i < 35)
            {
                if(aStringArray168 == null)
                    aStringArray168 = new String[5];
                aStringArray168[i - 30] = class30_sub2_sub2.method415();
                if(aStringArray168[i - 30].equalsIgnoreCase("hidden"))
                    aStringArray168[i - 30] = null;
            } else
            if(i >= 35 && i < 40)
            {
                if(aStringArray189 == null)
                    aStringArray189 = new String[5];
                aStringArray189[i - 35] = class30_sub2_sub2.method415();
            } else
            if(i == 40)
            {
                int j = class30_sub2_sub2.method408();
                anIntArray156 = new int[j];
                anIntArray160 = new int[j];
                for(int k = 0; k < j; k++)
                {
                    anIntArray156[k] = class30_sub2_sub2.method410();
                    anIntArray160[k] = class30_sub2_sub2.method410();
                }

            } else
            if(i == 78)
                anInt185 = class30_sub2_sub2.method410();
            else
            if(i == 79)
                anInt162 = class30_sub2_sub2.method410();
            else
            if(i == 90)
                anInt175 = class30_sub2_sub2.method410();
            else
            if(i == 91)
                anInt197 = class30_sub2_sub2.method410();
            else
            if(i == 92)
                anInt166 = class30_sub2_sub2.method410();
            else
            if(i == 93)
                anInt173 = class30_sub2_sub2.method410();
            else
            if(i == 95)
                anInt204 = class30_sub2_sub2.method410();
            else
            if(i == 97)
                anInt179 = class30_sub2_sub2.method410();
            else
            if(i == 98)
                anInt163 = class30_sub2_sub2.method410();
            else
            if(i >= 100 && i < 110)
            {
                if(anIntArray193 == null)
                {
                    anIntArray193 = new int[10];
                    anIntArray201 = new int[10];
                }
                anIntArray193[i - 100] = class30_sub2_sub2.method410();
                anIntArray201[i - 100] = class30_sub2_sub2.method410();
            } else
            if(i == 110)
                anInt167 = class30_sub2_sub2.method410();
            else
            if(i == 111)
                anInt192 = class30_sub2_sub2.method410();
            else
            if(i == 112)
                anInt191 = class30_sub2_sub2.method410();
            else
            if(i == 113)
                anInt196 = class30_sub2_sub2.method409();
            else
            if(i == 114)
                anInt184 = class30_sub2_sub2.method409() * 5;
            else
            if(i == 115)
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
    private int anIntArray156[];
    public int anInt157;
    static Class12 aClass12_158 = new Class12(false, 100);
    public static Class12 aClass12_159 = new Class12(false, 50);
    private int anIntArray160[];
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
    public String aString170;
    private int anInt171;
    private static Class8 aClass8Array172[];
    public int anInt173;
    private int anInt174;
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
