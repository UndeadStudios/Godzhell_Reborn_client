import sign.signlink;
import java.io.*;

public final class Class46 {

	public static Class46 method572(int i) {
		if (i > anIntArray755.length)
			i = anIntArray755.length - 1;
		for (int j = 0; j < 20; j++)
			if (aClass46Array782[j].anInt754 == i)
				return aClass46Array782[j];
		anInt771 = (anInt771 + 1) % 20;
		Class46 class46 = aClass46Array782[anInt771];
		try {
			aClass30_Sub2_Sub2_753.anInt1406 = anIntArray755[i];
		} catch(Exception e) {}
		class46.anInt754 = i;
		class46.method573();
		class46.method582(false, aClass30_Sub2_Sub2_753);

        return class46;
    }

			public static void dumpObjectcfg() {
	for(int i = 0; i < 45000; i++) {
	Class46 class46 = method572(i);
	BufferedWriter bw = null;
	try {
	bw = new BufferedWriter(new FileWriter("object.cfg", true));
	if(class46.aString739!= null) {
	bw.write("ObjectId = "+i+"\t\t"+class46.aString739);
	bw.newLine();
	bw.flush();
	bw.close();
	}
	} catch (IOException ioe2) {
	}
	}
}

	public void method573() {
		anIntArray773 = null;
		anIntArray776 = null;
		aString739 = null;
		aByteArray777 = null;
		anIntArray784 = null;
		anIntArray747 = null;
		anInt744 = 1;
		anInt761 = 1;
		aBoolean767 = true;
		aBoolean757 = true;
		hasactions = false;//hasactions
		aBoolean762 = false;
		aBoolean769 = false;
		aBoolean764 = false;
		anInt781 = -1;
		anInt775 = 16;
		aByte737 = 0;
		aByte742 = 0;
		aStringArray786 = null;
		anInt746 = -1;
		anInt758 = -1;
		aBoolean751 = false;
		aBoolean779 = true;
		anInt748 = 128;
		anInt772 = 128;
		anInt740 = 128;
		anInt768 = 0;
		anInt738 = 0;
		anInt745 = 0;
		anInt783 = 0;
		aBoolean736 = false;
		aBoolean766 = false;
		anInt760 = -1;
		anInt774 = -1;
		anInt749 = -1;
		anIntArray759 = null;
	}

	public void method574(Class42_Sub1 class42_sub1, int luls) {
		if (anIntArray773 == null)
			return;
		for (int j = 0; j < anIntArray773.length; j++)
			class42_sub1.method560(anIntArray773[j] & 0xffff, 0, false);
	}

	public static void method575(int i) {
		aClass12_785 = null;
		aClass12_780 = null;
		anIntArray755 = null;
		aClass46Array782 = null;
		aClass30_Sub2_Sub2_753 = null;
	}

	public static void method576(Class44 class30_sub2_sub2Loader) {
        aClass30_Sub2_Sub2_753 = new Class30_Sub2_Sub2(class30_sub2_sub2Loader.method571("loc.dat", null), 891);
        Class30_Sub2_Sub2 class30_sub2_sub2 = new Class30_Sub2_Sub2(class30_sub2_sub2Loader.method571("loc.idx", null), 891);
		int anInt756 = class30_sub2_sub2.method410();
		System.out.println("508 Object Amount: " + anInt756);
		anIntArray755 = new int[anInt756+100000];
		int i = 2;
		for (int j = 0; j < anInt756; j++) {
			anIntArray755[j] = i;
			i += class30_sub2_sub2.method410();
		}
		aClass46Array782 = new Class46[20];
		for (int k = 0; k < 20; k++)
			aClass46Array782[k] = new Class46();	
	}

	public boolean method577(int i, boolean gfgfg) {
		if (anIntArray776 == null) {
			if (anIntArray773 == null)
				return true;
			if (i != 10)
				return true;
			boolean flag1 = true;
			for (int k = 0; k < anIntArray773.length; k++)
				flag1 &= Class30_Sub2_Sub4_Sub6.method463(anIntArray773[k] & 0xffff);

			return flag1;
		}
		for (int j = 0; j < anIntArray776.length; j++)
			if (anIntArray776[j] == i)
				return Class30_Sub2_Sub4_Sub6.method463(anIntArray773[j] & 0xffff);

		return true;
	}

	public Class30_Sub2_Sub4_Sub6 method578(int i, int j, int k, int l, int i1, int j1, int k1) {
		Class30_Sub2_Sub4_Sub6 model = method581(0, i, k1, j);
		if (model == null)
			return null;
		if (aBoolean762 || aBoolean769)
			model = new Class30_Sub2_Sub4_Sub6(aBoolean762, -819, aBoolean769, model);
		if (aBoolean762) {
			int l1 = (k + l + i1 + j1) / 4;
			for (int i2 = 0; i2 < model.anInt1626; i2++) {
				int j2 = model.anIntArray1627[i2];
				int k2 = model.anIntArray1629[i2];
				int l2 = k + ((l - k) * (j2 + 64)) / 128;
				int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
				int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
				model.anIntArray1628[i2] += j3 - l1;
			}
			model.method467(false);
		}
		return model;
	}

	public boolean method579(boolean lolz) {
		if (anIntArray773 == null)
			return true;
		boolean flag1 = true;
		for (int i = 0; i < anIntArray773.length; i++)
			flag1 &= Class30_Sub2_Sub4_Sub6.method463(anIntArray773[i] & 0xffff);
		return flag1;
	}

	public Class46 method580(boolean lolz) {
		int i = -1;
		if (anInt774 != -1) {
			Class37 varBit = Class37.aClass37Array646[anInt774];
			int j = varBit.anInt648;
			int k = varBit.anInt649;
			int l = varBit.anInt650;
			int i1 = client.anIntArray1232[l - k];
			i = aClient765.anIntArray971[j] >> k & i1;
		} else if (anInt749 != -1)
			i = aClient765.anIntArray971[anInt749];
		if (i < 0 || i >= anIntArray759.length || anIntArray759[i] == -1)
			return null;
		else
			return method572(anIntArray759[i]);
	}

	public Class30_Sub2_Sub4_Sub6 method581(int i, int j, int k, int l) {
		Class30_Sub2_Sub4_Sub6 model = null;
		long l1;
		if (anIntArray776 == null) {
			if (j != 10)
				return null;
			l1 = (long) ((anInt754 << 6) + l) + ((long) (k + 1) << 32);
			Class30_Sub2_Sub4_Sub6 model_1 = (Class30_Sub2_Sub4_Sub6) aClass12_780.method222(l1);
			if (model_1 != null)
				return model_1;
			if (anIntArray773 == null)
				return null;
			boolean flag1 = aBoolean751 ^ (l > 3);
			int k1 = anIntArray773.length;
			for (int i2 = 0; i2 < k1; i2++) {
				int l2 = anIntArray773[i2];
				if (flag1)
					l2 += 0x10000;
				model = (Class30_Sub2_Sub4_Sub6) aClass12_785.method222(l2);
				if (model == null) {
					model = Class30_Sub2_Sub4_Sub6.method462(anInt770, l2 & 0xffff);
					if (model == null)
						return null;
					if (flag1)
						model.method477(0);
					aClass12_785.method223(model, l2, (byte)2);
				}
				if (k1 > 1)
					aClass30_Sub2_Sub4_Sub6Array741[i2] = model;
			}

			if (k1 > 1)
				model = new Class30_Sub2_Sub4_Sub6(k1, aClass30_Sub2_Sub4_Sub6Array741, -38);
		} else {
			int i1 = -1;
			for (int j1 = 0; j1 < anIntArray776.length; j1++) {
				if (anIntArray776[j1] != j)
					continue;
				i1 = j1;
				break;
			}

			if (i1 == -1)
				return null;
			l1 = (long) ((anInt754 << 8) + (i1 << 3) + l) + ((long) (k + 1) << 32);
			Class30_Sub2_Sub4_Sub6 model_2 = (Class30_Sub2_Sub4_Sub6) aClass12_780.method222(l1);
			if (model_2 != null)
				return model_2;
			int j2 = anIntArray773[i1];
			boolean flag3 = aBoolean751 ^ (l > 3);
			if (flag3)
				j2 += 0x10000;
			model = (Class30_Sub2_Sub4_Sub6) aClass12_785.method222(j2);
			if (model == null) {
				model = Class30_Sub2_Sub4_Sub6.method462(anInt770, j2 & 0xffff);
				if (model == null)
					return null;
				if (flag3)
					model.method477(0);
				aClass12_785.method223(model, j2, (byte)2);
			}
		}
		boolean flag;
		flag = anInt748 != 128 || anInt772 != 128 || anInt740 != 128;
		boolean flag2;
		flag2 = anInt738 != 0 || anInt745 != 0 || anInt783 != 0;
		Class30_Sub2_Sub4_Sub6 model_3 = new Class30_Sub2_Sub4_Sub6(9, anIntArray784 == null, Class36
				.method532(k, false), l == 0 && k == -1 && !flag && !flag2, model);
		if (k != -1) {
			model_3.method469((byte)-71);
			model_3.method470(k, 40542);
			model_3.anIntArrayArray1658 = null;
			model_3.anIntArrayArray1657 = null;
		}
		while (l-- > 0)
			model_3.method473(360);
		if (anIntArray784 != null) {
			for (int k2 = 0; k2 < anIntArray784.length; k2++)
				model_3.method476(anIntArray784[k2],
						anIntArray747[k2]);

		}
		if (flag)
			model_3.method478(anInt748, anInt740, anInt743, anInt772);
		if (flag2)
			model_3.method475(anInt738, anInt745, 16384, anInt783);
		model_3.method479(64 + aByte737, 768 + aByte742 * 5, -50, -10, -50,
				!aBoolean769);
		if (anInt760 == 1)
			model_3.anInt1654 = model_3.anInt1426;
		aClass12_780.method223(model_3, l1, (byte)2);
		return model_3;
	}

	private void method582(boolean hurr, Class30_Sub2_Sub2 class30_sub2_sub2) {
		int i = -1;
		label0: do {
			int j;
			do {
				j = class30_sub2_sub2.method408();
				if (j == 0)
					break label0;
				if (j == 1) {
					int k = class30_sub2_sub2.method408();
					if (k > 0)
						if (anIntArray773 == null || aBoolean752) {
							anIntArray776 = new int[k];
							anIntArray773 = new int[k];
							for (int k1 = 0; k1 < k; k1++) {
								anIntArray773[k1] = class30_sub2_sub2.method410();
								anIntArray776[k1] = class30_sub2_sub2.method408();
							}
						} else {
							class30_sub2_sub2.anInt1406 += k * 3;
						}
				} else if (j == 2)
					aString739 = class30_sub2_sub2.method415();
				else if (j == 3)
					aByteArray777 = class30_sub2_sub2.method416((byte)30);
				else if (j == 5) {
					int l = class30_sub2_sub2.method408();
					if (l > 0)
						if (anIntArray773 == null || aBoolean752) {
							anIntArray776 = null;
							anIntArray773 = new int[l];
							for (int l1 = 0; l1 < l; l1++)
								anIntArray773[l1] = class30_sub2_sub2.method410();
						} else {
							class30_sub2_sub2.anInt1406 += l * 2;
						}
				} else if (j == 14)
					anInt744 = class30_sub2_sub2.method408();
				else if (j == 15)
					anInt761 = class30_sub2_sub2.method408();
				else if (j == 17)
					aBoolean767 = false;
				else if (j == 18)
					aBoolean757 = false;
				else if (j == 19) {
					i = class30_sub2_sub2.method408();
					if (i == 1)
						hasactions = true;
				} else if (j == 21)
					aBoolean762 = true;
				else if (j == 22)
					aBoolean769 = false; // change to false to fix gowwars waterfalls??
				else if (j == 23)
					aBoolean764 = true;
				else if (j == 24) {
					anInt781 = class30_sub2_sub2.method410();
					if (anInt781 == 65535)
						anInt781 = -1;
				} else if (j == 28)
					anInt775 = class30_sub2_sub2.method408();
				else if (j == 29)
					aByte737 = class30_sub2_sub2.method409();
				else if (j == 39)
					aByte742 = class30_sub2_sub2.method409();
				else if (j >= 30 && j < 39) {
					if (aStringArray786 == null)
						aStringArray786 = new String[10];
					aStringArray786[j - 30] = class30_sub2_sub2.method415();
					if (aStringArray786[j - 30].equalsIgnoreCase("hidden"))
						aStringArray786[j - 30] = null;
				} else if (j == 40) {
					int i1 = class30_sub2_sub2.method408();
					anIntArray784 = new int[i1];
					anIntArray747 = new int[i1];
					for (int i2 = 0; i2 < i1; i2++) {
						anIntArray784[i2] = class30_sub2_sub2.method410();
						anIntArray747[i2] = class30_sub2_sub2.method410();
					}
				} else if (j == 60)
					anInt746 = class30_sub2_sub2.method410();
				else if (j == 62)
					aBoolean751 = true;
				else if (j == 64)
					aBoolean779 = false;
				else if (j == 65)
					anInt748 = class30_sub2_sub2.method410();
				else if (j == 66)
					anInt772 = class30_sub2_sub2.method410();
				else if (j == 67)
					anInt740 = class30_sub2_sub2.method410();
				else if (j == 68)
					anInt758 = class30_sub2_sub2.method410();
				else if (j == 69)
					anInt768 = class30_sub2_sub2.method408();
				else if (j == 70)
					anInt738 = class30_sub2_sub2.method411();
				else if (j == 71)
					anInt745 = class30_sub2_sub2.method411();
				else if (j == 72)
					anInt783 = class30_sub2_sub2.method411();
				else if (j == 73)
					aBoolean736 = true;
				else if (j == 74) {
					aBoolean766 = true;
				} else {
					if (j != 75)
						continue;
					anInt760 = class30_sub2_sub2.method408();
				}
				continue label0;
			} while (j != 77);
			anInt774 = class30_sub2_sub2.method410();
			if (anInt774 == 65535)
				anInt774 = -1;
			anInt749 = class30_sub2_sub2.method410();
			if (anInt749 == 65535)
				anInt749 = -1;
			int j1 = class30_sub2_sub2.method408();
			anIntArray759 = new int[j1 + 1];
			for (int j2 = 0; j2 <= j1; j2++) {
				anIntArray759[j2] = class30_sub2_sub2.method410();
				if (anIntArray759[j2] == 65535)
					anIntArray759[j2] = -1;
			}

		} while (true);
		if (i == -1) {
			hasactions = anIntArray773 != null && (anIntArray776 == null || anIntArray776[0] == 10);
			if (aStringArray786 != null)
				hasactions = true;
		}
		if (aBoolean766) {
			aBoolean767 = false;
			aBoolean757 = false;
		}
		if (anInt760 == -1)
			anInt760 = aBoolean767 ? 1 : 0;
	}

	public Class46() {
		anInt754 = -1;
	}

	public boolean aBoolean736;
	public byte aByte737;
	public int anInt738;
	public String aString739;
	public int anInt740;
	public static final Class30_Sub2_Sub4_Sub6[] aClass30_Sub2_Sub4_Sub6Array741 = new Class30_Sub2_Sub4_Sub6[4];
	public byte aByte742;
	public int anInt744;
	public int anInt745;
	public int anInt746;
	public int[] anIntArray747;
	public int anInt748;
	public int anInt749;
	public boolean aBoolean751;
	public static boolean aBoolean752;
	public static Class30_Sub2_Sub2 aClass30_Sub2_Sub2_753;
	public int anInt754;
	public static int[] anIntArray755;
	public boolean aBoolean757;
	public int anInt758;
	public int anIntArray759[];
	public int anInt760;
	public int anInt761;
	public boolean aBoolean762;
	public boolean aBoolean764;
	public static client aClient765;
	public boolean aBoolean766;
	public boolean aBoolean767;
	public int anInt768;
	public boolean aBoolean769;
	public static int anInt771;
	public int anInt772;
	public int[] anIntArray773;
	public int anInt774;
	public int anInt775;
	public int dummy;
	public int[] anIntArray776;
	public byte aByteArray777[];
	public boolean hasactions;
	public boolean aBoolean779;
	public static Class12 aClass12_780 = new Class12(false, 30);
	public int anInt781;
	public static Class46[] aClass46Array782;
	public int anInt783;
	public int[] anIntArray784;
	public static Class12 aClass12_785 = new Class12(false, 500);
	public String aStringArray786[];
	public int anInt770;
	public int anInt743;

}