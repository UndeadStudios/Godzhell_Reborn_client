public class Widget
{

    public Sprite aSprite_207;
    public int anInt208;
    public Sprite aSpriteArray209[];
    public static Widget interfaceCache[];
    public int anInt211;
    public int anIntArray212[];
    private int anInt213;
    public int contentType;
    public int anIntArray215[];
    public int anInt216;
    public int anInt217;
    public String aString218;
    public int anInt219;
    public int anInt220;
    public String aString221;
    public String aString222;
    public boolean aBoolean223;
    public int scrollPosition;
    public String aStringArray225[];
    public int anIntArrayArray226[][];
    public boolean aBoolean227;
    public String aString228;
    private int anInt229;
    public int anInt230;
    public int anInt231;
    public int anInt232;
    public int anInt233;
    public int anInt234;
    public boolean aBoolean235;
    public int parentID;
    public int anInt237;
    private static Class12 aClass12_238;
    static Class44 aClass44;
    public int anInt239;
    public int anIntArray240[];
    public int anIntArray241[];
    public boolean aBoolean242;
    public TextDrawingArea aTextDrawingArea_243;
    public int anInt244;
    public int anIntArray245[];
    public int anInt246;
    public int anIntArray247[];
    public String aString248;
    public boolean aBoolean249;
    public int anInt250;
    public boolean aBoolean251;
    public int anIntArray252[];
    public int anIntArray253[];
    public byte aByte254;
    public int anInt255;
    public int anInt256;
    public int anInt257;
    public int anInt258;
    public boolean aBoolean259;
    public Sprite aSprite_260;
    public int anInt261;
    public int anInt262;
    public int anInt263;
    static Class12 aClass12_264 = new Class12(false, 30);
    public int anInt265;
    public boolean aBoolean266;
    public int anInt267;
    public boolean aBoolean268;
    public int anInt269;
    public int anInt270;
    public int anInt271;
    public int anIntArray272[];

    public void method204(int i, byte byte0, int j)
    {
        int k = anIntArray253[i];
        anIntArray253[i] = anIntArray253[j];
        if(byte0 == 9)
        {
            byte0 = 0;
        } else
        {
            anInt229 = -76;
        }
        anIntArray253[j] = k;
        k = anIntArray252[i];
        anIntArray252[i] = anIntArray252[j];
        anIntArray252[j] = k;
    }

    public static void method205(Class44 class44, TextDrawingArea aclass30_sub2_sub1_sub4[], byte byte0, Class44 class44_1)
    {
        aClass12_238 = new Class12(false, 50000);
        Stream stream = new Stream(class44.method571("data", null), 891);
        int i = -1;
        int j = stream.readUnsignedShort();
        interfaceCache = new Widget[50000];
        do
        {
            if(stream.anInt1406 >= stream.aByteArray1405.length)
            {
                break;
            }
            int k = stream.readUnsignedShort();
            if(k == 65535)
            {
                i = stream.readUnsignedShort();
                k = stream.readUnsignedShort();
            }
            Widget class9 = interfaceCache[k] = new Widget();
            class9.anInt250 = k;
            class9.parentID = i;
            class9.anInt262 = stream.readUnsignedByte();
            class9.anInt217 = stream.readUnsignedByte();
            class9.contentType = stream.readUnsignedShort();
            class9.anInt220 = stream.readUnsignedShort();
            class9.anInt267 = stream.readUnsignedShort();
            class9.aByte254 = (byte) stream.readUnsignedByte();
            class9.anInt230 = stream.readUnsignedByte();
            if(class9.anInt230 != 0)
            {
                class9.anInt230 = (class9.anInt230 - 1 << 8) + stream.readUnsignedByte();
            } else
            {
                class9.anInt230 = -1;
            }
            int l = stream.readUnsignedByte();
            if(l > 0)
            {
                class9.anIntArray245 = new int[l];
                class9.anIntArray212 = new int[l];
                for(int i1 = 0; i1 < l; i1++)
                {
                    class9.anIntArray245[i1] = stream.readUnsignedByte();
                    class9.anIntArray212[i1] = stream.readUnsignedShort();
                }

            }
            int j1 = stream.readUnsignedByte();
            if(j1 > 0)
            {
                class9.anIntArrayArray226 = new int[j1][];
                for(int k1 = 0; k1 < j1; k1++)
                {
                    int j3 = stream.readUnsignedShort();
                    class9.anIntArrayArray226[k1] = new int[j3];
                    for(int l4 = 0; l4 < j3; l4++)
                    {
                        class9.anIntArrayArray226[k1][l4] = stream.readUnsignedShort();
                    }

                }

            }
            if(class9.anInt262 == 0)
            {
                class9.anInt261 = stream.readUnsignedShort();
                class9.aBoolean266 = stream.readUnsignedByte() == 1;
                int l1 = stream.readUnsignedShort();
                class9.anIntArray240 = new int[l1];
                class9.anIntArray241 = new int[l1];
                class9.anIntArray272 = new int[l1];
                for(int k3 = 0; k3 < l1; k3++)
                {
                    class9.anIntArray240[k3] = stream.readUnsignedShort();
                    class9.anIntArray241[k3] = stream.method411();
                    class9.anIntArray272[k3] = stream.method411();
                }

            }
            if(class9.anInt262 == 1)
            {
                class9.anInt211 = stream.readUnsignedShort();
                class9.aBoolean251 = stream.readUnsignedByte() == 1;
            }
            if(class9.anInt262 == 2)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean259 = stream.readUnsignedByte() == 1;
                class9.aBoolean249 = stream.readUnsignedByte() == 1;
                class9.aBoolean242 = stream.readUnsignedByte() == 1;
                class9.aBoolean235 = stream.readUnsignedByte() == 1;
                class9.anInt231 = stream.readUnsignedByte();
                class9.anInt244 = stream.readUnsignedByte();
                class9.anIntArray215 = new int[20];
                class9.anIntArray247 = new int[20];
                class9.aSpriteArray209 = new Sprite[20];
                for(int i2 = 0; i2 < 20; i2++)
                {
                    int l3 = stream.readUnsignedByte();
                    if(l3 != 1)
                    {
                        continue;
                    }
                    class9.anIntArray215[i2] = stream.method411();
                    class9.anIntArray247[i2] = stream.method411();
                    String s1 = stream.method415();
                    if(class44_1 != null && s1.length() > 0)
                    {
                        int i5 = s1.lastIndexOf(",");
                        class9.aSpriteArray209[i2] = method207(Integer.parseInt(s1.substring(i5 + 1)), false, class44_1, s1.substring(0, i5));
                    }
                }

                class9.aStringArray225 = new String[5];
                for(int j2 = 0; j2 < 5; j2++)
                {
                    class9.aStringArray225[j2] = stream.method415();
                    if(class9.parentID == 3824)
                        class9.aStringArray225[4] = "Buy X";
                    if(class9.aStringArray225[j2].length() == 0)
                    {
                        class9.aStringArray225[j2] = null;
                    }
                }

            }
            if(class9.anInt262 == 3)
            {
                class9.aBoolean227 = stream.readUnsignedByte() == 1;
            }
            if(class9.anInt262 == 4 || class9.anInt262 == 1)
            {
                class9.aBoolean223 = stream.readUnsignedByte() == 1;
                int k2 = stream.readUnsignedByte();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.aTextDrawingArea_243 = aclass30_sub2_sub1_sub4[k2];
                }
                class9.aBoolean268 = stream.readUnsignedByte() == 1;
            }
            if(class9.anInt262 == 4)
            {
                class9.aString248 = stream.method415();
                class9.aString228 = stream.method415();
            }
            if(class9.anInt262 == 1 || class9.anInt262 == 3 || class9.anInt262 == 4)
            {
                class9.anInt232 = stream.method413();
            }
            if(class9.anInt262 == 3 || class9.anInt262 == 4)
            {
                class9.anInt219 = stream.method413();
                class9.anInt216 = stream.method413();
                class9.anInt239 = stream.method413();
            }
            if(class9.anInt262 == 5)
            {
                String s = stream.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int i4 = s.lastIndexOf(",");
                    class9.aSprite_207 = method207(Integer.parseInt(s.substring(i4 + 1)), false, class44_1, s.substring(0, i4));
                }
                s = stream.method415();
                if(class44_1 != null && s.length() > 0)
                {
                    int j4 = s.lastIndexOf(",");
                    class9.aSprite_260 = method207(Integer.parseInt(s.substring(j4 + 1)), false, class44_1, s.substring(0, j4));
                }
            }
            if(class9.anInt262 == 6)
            {
                int l2 = stream.readUnsignedByte();
                if(l2 != 0)
                {
                    class9.anInt233 = 1;
                    class9.anInt234 = (l2 - 1 << 8) + stream.readUnsignedByte();
                }
                l2 = stream.readUnsignedByte();
                if(l2 != 0)
                {
                    class9.anInt255 = 1;
                    class9.anInt256 = (l2 - 1 << 8) + stream.readUnsignedByte();
                }
                l2 = stream.readUnsignedByte();
                if(l2 != 0)
                {
                    class9.anInt257 = (l2 - 1 << 8) + stream.readUnsignedByte();
                } else
                {
                    class9.anInt257 = -1;
                }
                l2 = stream.readUnsignedByte();
                if(l2 != 0)
                {
                    class9.anInt258 = (l2 - 1 << 8) + stream.readUnsignedByte();
                } else
                {
                    class9.anInt258 = -1;
                }
                class9.anInt269 = stream.readUnsignedShort();
                class9.anInt270 = stream.readUnsignedShort();
                class9.anInt271 = stream.readUnsignedShort();
            }
            if(class9.anInt262 == 7)
            {
                class9.anIntArray253 = new int[class9.anInt220 * class9.anInt267];
                class9.anIntArray252 = new int[class9.anInt220 * class9.anInt267];
                class9.aBoolean223 = stream.readUnsignedByte() == 1;
                int i3 = stream.readUnsignedByte();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.aTextDrawingArea_243 = aclass30_sub2_sub1_sub4[i3];
                }
                class9.aBoolean268 = stream.readUnsignedByte() == 1;
                class9.anInt232 = stream.method413();
                class9.anInt231 = stream.method411();
                class9.anInt244 = stream.method411();
                class9.aBoolean249 = stream.readUnsignedByte() == 1;
                class9.aStringArray225 = new String[5];
                for(int k4 = 0; k4 < 5; k4++)
                {
                    class9.aStringArray225[k4] = stream.method415();
                    if(class9.aStringArray225[k4].length() == 0)
                    {
                        class9.aStringArray225[k4] = null;
                    }
                }

            }
            if(class9.anInt217 == 2 || class9.anInt262 == 2)
            {
                class9.aString222 = stream.method415();
                class9.aString218 = stream.method415();
                class9.anInt237 = stream.readUnsignedShort();
            }
			if(class9.anInt262 == 8) {	//	Loads new .dat files
			class9.aString248 = stream.method415();
			}

            if(class9.anInt217 == 1 || class9.anInt217 == 4 || class9.anInt217 == 5 || class9.anInt217 == 6)
            {
                class9.aString221 = stream.method415();
                if(class9.aString221.length() == 0)
                {
                    if(class9.anInt217 == 1)
                    {
                        class9.aString221 = "Ok";
                    }
                    if(class9.anInt217 == 4)
                    {
                        class9.aString221 = "Select";
                    }
                    if(class9.anInt217 == 5)
                    {
                        class9.aString221 = "Select";
                    }
                    if(class9.anInt217 == 6)
                    {
                        class9.aString221 = "Continue";
                    }
                }
            }
        } while(true);
	aClass44 = class44;
        aClass12_238 = null;
        if(byte0 != -84);
    }

    
    private Class30_Sub2_Sub4_Sub6 method206(int i, int j)
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = (Class30_Sub2_Sub4_Sub6)aClass12_264.method222((i << 16) + j);
        if(class30_sub2_sub4_sub6 != null)
        {
            return class30_sub2_sub4_sub6;
        }
        if(i == 1)
        {
            class30_sub2_sub4_sub6 = Class30_Sub2_Sub4_Sub6.method462(anInt213, j);
        }
        if(i == 2)
        {
            class30_sub2_sub4_sub6 = Class5.method159(j).method160(true);
        }
        if(i == 3)
        {
            class30_sub2_sub4_sub6 = client.aPlayer_1126.method453((byte)-41);
        }
        if(i == 4)
        {
            class30_sub2_sub4_sub6 = Class8.method198(j).method202(50, true);
        }
        if(i == 5)
        {
            class30_sub2_sub4_sub6 = null;
        }
        if(class30_sub2_sub4_sub6 != null)
        {
            aClass12_264.method223(class30_sub2_sub4_sub6, (i << 16) + j, (byte)2);
        }
        return class30_sub2_sub4_sub6;
    }

    private static Sprite method207(int i, boolean flag, Class44 class44, String s)
    {
        long l = (TextClass.method585((byte)1, s) << 8) + (long)i;
        if(flag)
        {
            throw new NullPointerException();
        }
        Sprite sprite = (Sprite)aClass12_238.method222(l);
        if(sprite != null)
        {
            return sprite;
        }
        try
        {
            sprite = new Sprite(class44, s, i);
            aClass12_238.method223(sprite, l, (byte)2);
        }
        catch(Exception exception)
        {
            return null;
        }
        return sprite;
    }

    public static void method208(int i, boolean flag, int j, Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6)
    {
        if(flag)
        {
            return;
        }
        aClass12_264.method224();
        if(class30_sub2_sub4_sub6 != null && j != 4)
        {
            aClass12_264.method223(class30_sub2_sub4_sub6, (j << 16) + i, (byte)2);
        }
    }

    public Class30_Sub2_Sub4_Sub6 method209(int i, int j, int k, boolean flag)
    {
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
        if(flag)
        {
            class30_sub2_sub4_sub6 = method206(anInt255, anInt256);
        } else
        {
            class30_sub2_sub4_sub6 = method206(anInt233, anInt234);
        }
        if(class30_sub2_sub4_sub6 == null)
        {
            return null;
        }
        if(k == -1 && j == -1 && class30_sub2_sub4_sub6.anIntArray1640 == null)
        {
            return class30_sub2_sub4_sub6;
        }
        Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6_1 = new Class30_Sub2_Sub4_Sub6(9, true, Class36.method532(k, false) & Class36.method532(j, false), false, class30_sub2_sub4_sub6);
        if(k != -1 || j != -1)
        {
            class30_sub2_sub4_sub6_1.method469((byte)-71);
        }
        if(k != -1)
        {
            class30_sub2_sub4_sub6_1.method470(k, 40542);
        }
        if(j != -1)
        {
            class30_sub2_sub4_sub6_1.method470(j, 40542);
        }
        class30_sub2_sub4_sub6_1.method479(64, 768, -50, -10, -50, true);
        if(i != 0)
        {
            throw new NullPointerException();
        } else
        {
            return class30_sub2_sub4_sub6_1;
        }
    }

    public Widget()
    {
        anInt213 = 9;
        anInt229 = 891;
    }

}
