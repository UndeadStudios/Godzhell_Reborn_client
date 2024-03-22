public class Widget
{

    public Sprite disabledSprite;
    public int anInt208;
    public Sprite sprites[];
    public static Widget interfaceCache[];
    public int anInt211;
    public int anIntArray212[];
    private int anInt213;
    public int contentType;
    public int spritesX[];
    public int anInt216;
    public int atActionType;
    public String spellName;
    public int anInt219;
    public int width;
    public String tooltip;
    public String selectedActionName;
    public boolean centerText;
    public int scrollPosition;
    public String actions[];
    public int valueIndexArray[][];
    public boolean aBoolean227;
    public String aString228;
    private int anInt229;
    public int hoverType;
    public int invSpritePadX;
    public int textColor;
    public int anInt233;
    public int anInt234;
    public boolean dragDeletes;
    public int parentID;
    public int spellUsableOn;
    private static Class12 aClass12_238;
    static Class44 aClass44;
    public int anInt239;
    public int children[];
    public int childX[];
    public boolean usableItemInterface;
    public RSFont textDrawingAreas;
    public int invSpritePadY;
    public int anIntArray245[];
    public int anInt246;
    public int spritesY[];
    public String message;
    public boolean isInventoryInterface;
    public int id;
    public boolean aBoolean251;
    public int invStackSizes[];
    public int inv[];
    public byte opacity;
    public int anInt255;
    public int anInt256;
    public int anInt257;
    public int anInt258;
    public boolean deleteOnDrag2;
    public Sprite enabledSprite;
    public int scrollMax;
    public int type;
    public int anInt263;
    static Class12 aClass12_264 = new Class12(false, 30);
    public int anInt265;
    public boolean isMouseoverTriggered;
    public int height;
    public boolean textShadow;
    public int modelZoom;
    public int modelRotation1;
    public int modelRotation2;
    public int childY[];

    public void method204(int i, byte byte0, int j)
    {
        int k = inv[i];
        inv[i] = inv[j];
        if(byte0 == 9)
        {
            byte0 = 0;
        } else
        {
            anInt229 = -76;
        }
        inv[j] = k;
        k = invStackSizes[i];
        invStackSizes[i] = invStackSizes[j];
        invStackSizes[j] = k;
    }

    public static void unpack(Class44 class44, RSFont aclass30_sub2_sub1_sub4[], byte byte0, Class44 class44_1)
    {
        aClass12_238 = new Class12(false, 50000);
        Stream stream = new Stream(class44.method571("data", null), 891);
        int i = -1;
        int j = stream.readUnsignedShort();
        interfaceCache = new Widget[50000];
        do
        {
            if(stream.currentPosition >= stream.aByteArray1405.length)
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
            class9.id = k;
            class9.parentID = i;
            class9.type = stream.readUnsignedByte();
            class9.atActionType = stream.readUnsignedByte();
            class9.contentType = stream.readUnsignedShort();
            class9.width = stream.readUnsignedShort();
            class9.height = stream.readUnsignedShort();
            class9.opacity = (byte) stream.readUnsignedByte();
            class9.hoverType = stream.readUnsignedByte();
            if(class9.hoverType != 0)
            {
                class9.hoverType = (class9.hoverType - 1 << 8) + stream.readUnsignedByte();
            } else
            {
                class9.hoverType = -1;
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
                class9.valueIndexArray = new int[j1][];
                for(int k1 = 0; k1 < j1; k1++)
                {
                    int j3 = stream.readUnsignedShort();
                    class9.valueIndexArray[k1] = new int[j3];
                    for(int l4 = 0; l4 < j3; l4++)
                    {
                        class9.valueIndexArray[k1][l4] = stream.readUnsignedShort();
                    }

                }

            }
            if(class9.type == 0)
            {
                class9.scrollMax = stream.readUnsignedShort();
                class9.isMouseoverTriggered = stream.readUnsignedByte() == 1;
                int l1 = stream.readUnsignedShort();
                class9.children = new int[l1];
                class9.childX = new int[l1];
                class9.childY = new int[l1];
                for(int k3 = 0; k3 < l1; k3++)
                {
                    class9.children[k3] = stream.readUnsignedShort();
                    class9.childX[k3] = stream.method411();
                    class9.childY[k3] = stream.method411();
                }

            }
            if(class9.type == 1)
            {
                class9.anInt211 = stream.readUnsignedShort();
                class9.aBoolean251 = stream.readUnsignedByte() == 1;
            }
            if(class9.type == 2)
            {
                class9.inv = new int[class9.width * class9.height];
                class9.invStackSizes = new int[class9.width * class9.height];
                class9.deleteOnDrag2 = stream.readUnsignedByte() == 1;
                class9.isInventoryInterface = stream.readUnsignedByte() == 1;
                class9.usableItemInterface = stream.readUnsignedByte() == 1;
                class9.dragDeletes = stream.readUnsignedByte() == 1;
                class9.invSpritePadX = stream.readUnsignedByte();
                class9.invSpritePadY = stream.readUnsignedByte();
                class9.spritesX = new int[20];
                class9.spritesY = new int[20];
                class9.sprites = new Sprite[20];
                for(int i2 = 0; i2 < 20; i2++)
                {
                    int l3 = stream.readUnsignedByte();
                    if(l3 != 1)
                    {
                        continue;
                    }
                    class9.spritesX[i2] = stream.method411();
                    class9.spritesY[i2] = stream.method411();
                    String s1 = stream.readString();
                    if(class44_1 != null && s1.length() > 0)
                    {
                        int i5 = s1.lastIndexOf(",");
                        class9.sprites[i2] = method207(Integer.parseInt(s1.substring(i5 + 1)), false, class44_1, s1.substring(0, i5));
                    }
                }

                class9.actions = new String[5];
                for(int j2 = 0; j2 < 5; j2++)
                {
                    class9.actions[j2] = stream.readString();
                    if(class9.parentID == 3824)
                        class9.actions[4] = "Buy X";
                    if(class9.actions[j2].length() == 0)
                    {
                        class9.actions[j2] = null;
                    }
                }

            }
            if(class9.type == 3)
            {
                class9.aBoolean227 = stream.readUnsignedByte() == 1;
            }
            if(class9.type == 4 || class9.type == 1)
            {
                class9.centerText = stream.readUnsignedByte() == 1;
                int k2 = stream.readUnsignedByte();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.textDrawingAreas = aclass30_sub2_sub1_sub4[k2];
                }
                class9.textShadow = stream.readUnsignedByte() == 1;
            }
            if(class9.type == 4)
            {
                class9.message = stream.readString();
                class9.aString228 = stream.readString();
            }
            if(class9.type == 1 || class9.type == 3 || class9.type == 4)
            {
                class9.textColor = stream.method413();
            }
            if(class9.type == 3 || class9.type == 4)
            {
                class9.anInt219 = stream.method413();
                class9.anInt216 = stream.method413();
                class9.anInt239 = stream.method413();
            }
            if(class9.type == 5)
            {
                String s = stream.readString();
                if(class44_1 != null && s.length() > 0)
                {
                    int i4 = s.lastIndexOf(",");
                    class9.disabledSprite = method207(Integer.parseInt(s.substring(i4 + 1)), false, class44_1, s.substring(0, i4));
                }
                s = stream.readString();
                if(class44_1 != null && s.length() > 0)
                {
                    int j4 = s.lastIndexOf(",");
                    class9.enabledSprite = method207(Integer.parseInt(s.substring(j4 + 1)), false, class44_1, s.substring(0, j4));
                }
            }
            if(class9.type == 6)
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
                class9.modelZoom = stream.readUnsignedShort();
                class9.modelRotation1 = stream.readUnsignedShort();
                class9.modelRotation2 = stream.readUnsignedShort();
            }
            if(class9.type == 7)
            {
                class9.inv = new int[class9.width * class9.height];
                class9.invStackSizes = new int[class9.width * class9.height];
                class9.centerText = stream.readUnsignedByte() == 1;
                int i3 = stream.readUnsignedByte();
                if(aclass30_sub2_sub1_sub4 != null)
                {
                    class9.textDrawingAreas = aclass30_sub2_sub1_sub4[i3];
                }
                class9.textShadow = stream.readUnsignedByte() == 1;
                class9.textColor = stream.method413();
                class9.invSpritePadX = stream.method411();
                class9.invSpritePadY = stream.method411();
                class9.isInventoryInterface = stream.readUnsignedByte() == 1;
                class9.actions = new String[5];
                for(int k4 = 0; k4 < 5; k4++)
                {
                    class9.actions[k4] = stream.readString();
                    if(class9.actions[k4].length() == 0)
                    {
                        class9.actions[k4] = null;
                    }
                }

            }
            if(class9.atActionType == 2 || class9.type == 2)
            {
                class9.selectedActionName = stream.readString();
                class9.spellName = stream.readString();
                class9.spellUsableOn = stream.readUnsignedShort();
            }
			if(class9.type == 8) {	//	Loads new .dat files
			class9.message = stream.readString();
			}

            if(class9.atActionType == 1 || class9.atActionType == 4 || class9.atActionType == 5 || class9.atActionType == 6)
            {
                class9.tooltip = stream.readString();
                if(class9.tooltip.length() == 0)
                {
                    if(class9.atActionType == 1)
                    {
                        class9.tooltip = "Ok";
                    }
                    if(class9.atActionType == 4)
                    {
                        class9.tooltip = "Select";
                    }
                    if(class9.atActionType == 5)
                    {
                        class9.tooltip = "Select";
                    }
                    if(class9.atActionType == 6)
                    {
                        class9.tooltip = "Continue";
                    }
                }
            }
        } while(true);
	aClass44 = class44;
        clanChatTab(aclass30_sub2_sub1_sub4);
        clanChatSetup(aclass30_sub2_sub1_sub4);
        aClass12_238 = null;
        if(byte0 != -84);
    }
    public static Widget addTabInterface(int id) {
        Widget tab = interfaceCache[id] = new Widget();
        tab.id = id;
        tab.parentID = id;
        tab.type = 0;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 700;
        tab.opacity = 0;
        tab.hoverType = -1;
        return tab;
    }

    public static Widget addInterface(int id) {
        Widget widget = interfaceCache[id] = new Widget();
        widget.id = id;
        widget.parentID = id;
        widget.width = 512;
        widget.height = 334;
        return widget;
    }

    public static void addText(int id, String text, RSFont[] tda, int idx, int color, boolean center, boolean shadow) {
        Widget tab = addTabInterface(id);
        tab.parentID = id;
        tab.id = id;
        tab.type = 4;
        tab.atActionType = 0;
        tab.width = 0;
        tab.height = 11;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.hoverType = -1;
        tab.centerText = center;
        tab.textShadow = shadow;
        tab.textDrawingAreas = tda[idx];
        tab.message = text;
        tab.aString228 = "";
        tab.textColor = color;
        tab.anInt219 = 0;
        tab.anInt216 = 0;
    }
    public static void getext(int id, String text, RSFont[] tda, int idx, int color, boolean center, boolean shadow, int width, int height) {
        Widget tab = addTabInterface(id);
        tab.parentID = id;
        tab.id = id;
        tab.type = 4;
        tab.atActionType = 0;
        tab.width = width;
        tab.height = height;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.hoverType = -1;
        tab.centerText = center;
        tab.textShadow = shadow;
        tab.textDrawingAreas = tda[idx];
        tab.message = text;
        tab.aString228 = "";
        tab.textColor = color;
        tab.anInt219 = 0;
        tab.anInt216 = 0;
    }

    public static void addHoverButton(int i, String imageName, int j, int width, int height, String text, int contentType, int hoverOver, int aT) {
        Widget tab = addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = aT;
        tab.contentType = contentType;
        tab.opacity = 0;
        tab.hoverType = hoverOver;
        tab.disabledSprite = imageLoader(j, imageName);
        tab.enabledSprite = imageLoader(j, imageName);
        tab.width = width;
        tab.height = height;
        tab.tooltip = text;
    }
    public static void addHoverImage(int i, int j, int k, String name) {
        Widget tab = addTabInterface(i);
        tab.id = i;
        tab.parentID = i;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.width = 512;
        tab.height = 334;
        tab.opacity = 0;
        tab.hoverType = 52;
        tab.disabledSprite = imageLoader(j, name);
        tab.enabledSprite = imageLoader(k, name);
    }
    public static void addHoveredButton(int i, String imageName, int j, int w, int h, int IMAGEID) {
        Widget tab = addTabInterface(i);
        tab.parentID = i;
        tab.id = i;
        tab.type = 0;
        tab.atActionType = 0;
        tab.width = w;
        tab.height = h;
        tab.isMouseoverTriggered = true;
        tab.opacity = 0;
        tab.hoverType = -1;
        tab.scrollMax = 0;
        addHoverImage(IMAGEID, j, j, imageName);
        tab.totalChildren(1);
        tab.child(0, IMAGEID, 0, 0);
    }
    public void child(int frame, int id, int x, int y) {
        this.children[frame] = id;
        this.childX[frame] = x;
        this.childY[frame] = y;
    }

    public void totalChildren(int id, int x, int y) {
        this.children = new int[id];
        this.childX = new int[x];
        this.childY = new int[y];
    }
    protected static Sprite imageLoader(int i, String s) {
        long l = (TextClass.method585((byte)1, s) << 8) + (long)i;
        Sprite sprite = (Sprite)aClass12_238.method222(l);
        if(sprite != null) {
            return sprite;
        } else {
            try {
                sprite = new Sprite(s + " " + i);
                aClass12_238.method223(sprite, l, (byte)2);
                return sprite;
            } catch (Exception var6) {
                return null;
            }
        }
    }


    public static void addButton(int i, int j, String name, int W, int H, String S, int AT) {
        Widget Widget = addInterface(i);
        Widget.id = i;
        Widget.parentID = i;
        Widget.type = 5;
        Widget.atActionType = AT;
        Widget.contentType = 0;
        Widget.opacity = 0;
        Widget.hoverType = 52;
        Widget.disabledSprite = imageLoader(j, name);
        Widget.enabledSprite = imageLoader(j, name);
        Widget.width = W;
        Widget.height = H;
        Widget.tooltip = S;
    }

    public static void addButton(int id, int sid, String spriteName, String tooltip) {
        Widget tab = interfaceCache[id] = new Widget();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 1;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.hoverType = 52;
        tab.disabledSprite = imageLoader(sid, spriteName);
        tab.enabledSprite = imageLoader(sid, spriteName);
        tab.width = tab.disabledSprite.myWidth;
        tab.height = tab.enabledSprite.myHeight;
        tab.tooltip = tooltip;
    }
    public static void addSprite(int id, int spriteId, String spriteName) {
        Widget tab = interfaceCache[id] = new Widget();
        tab.id = id;
        tab.parentID = id;
        tab.type = 5;
        tab.atActionType = 0;
        tab.contentType = 0;
        tab.opacity = 0;
        tab.hoverType = 52;
        tab.disabledSprite = imageLoader(spriteId, spriteName);
        tab.enabledSprite = imageLoader(spriteId, spriteName);
        tab.width = 512;
        tab.height = 334;
    }
    public void totalChildren(int t) {
        this.children = new int[t];
        this.childX = new int[t];
        this.childY = new int[t];
    }
    public static void clanChatSetup(RSFont[] tda) {
        Widget rsi = addInterface(18300);
        rsi.totalChildren(12 + 21);
        int count = 0;
        /* Background */
        addSprite(18301, 1, "/Interfaces/Clan Chat/sprite");
        rsi.child(count++, 18301, 14, 17);
        /* Close button */
        addButton(18302, 0, "/Interfaces/Clan Chat/close", "Close");
        interfaceCache[18302].atActionType = 3;
        rsi.child(count++, 18302, 475, 26);
        /* Clan Setup title */
        addText(18303, "Clan Setup", tda, 2, 0xFF981F, true, true);
        rsi.child(count++, 18303, 256, 26);
        String[] titles = { "Clan name:", "Who can enter chat?",
                "Who can talk on chat?", "Who can kick on chat?",
                "Who can ban on chat?" };
        String[] defaults = { "Chat Disabled", "Anyone", "Anyone", "Anyone",
                "Anyone"};
        String[] whoCan = { "Anyone", "Recruit", "Corporal", "Sergeant",
                "Lieutenant", "Captain", "General", "Only Me" };
        for (int index = 0, id = 18304, y = 50; index < titles.length; index++, id += 3, y += 40) {
            addButton(id, 2, "/Interfaces/Clan Chat/sprite", "");
            interfaceCache[id].atActionType = 0;
            if (index > 0) {
                interfaceCache[id].actions = whoCan;
            } else {
                interfaceCache[id].actions = new String[] { "Change title",
                        "Delete clan" };
            }
            addText(id + 1, titles[index], tda, 0, 0xFF981F, true, true);
            addText(id + 2, defaults[index], tda, 1, 0xFFFFFF, true, true);
            rsi.child(count++, id, 25, y);
            rsi.child(count++, id + 1, 100, y + 4);
            rsi.child(count++, id + 2, 100, y + 17);
        }
        /* Table */
        addSprite(18319, 5, "/Interfaces/Clan Chat/sprite");
        rsi.child(count++, 18319, 197, 70);
        /* Labels */
        int id = 18320;
        int y = 74;
        addText(id, "Ranked Members", tda, 2, 0xFF981F, false, true);
        rsi.child(count++, id++, 202, y);
        addText(id, "Banned Members", tda, 2, 0xFF981F, false, true);
        rsi.child(count++, id++, 339, y);
        /* Ranked members list */
        Widget list = addInterface(id++);
        int lines = 100;
        list.totalChildren(lines);
        String[] ranks = { "Demote", "Recruit", "Corporal", "Sergeant",
                "Lieutenant", "Captain", "General", "Owner" };
        list.childY[0] = 2;
        // System.out.println(id);
        for (int index = id; index < id + lines; index++) {
            addText(index, "", tda, 1, 0xffffff, false, true);
            interfaceCache[index].actions = ranks;
            list.children[index - id] = index;
            list.childX[index - id] = 2;
            list.childY[index - id] = (index - id > 0 ? list.childY[index - id
                    - 1] + 14 : 0);
        }
        id += lines;
        list.width = 119;
        list.height = 210;
        list.scrollMax = (lines * 14) + 2;
        rsi.child(count++, list.id, 199, 92);
        /* Banned members list */
        list = addInterface(id++);
        list.totalChildren(lines);
        list.childY[0] = 2;
        // System.out.println(id);
        for (int index = id; index < id + lines; index++) {
            addText(index, "", tda, 1, 0xffffff, false, true);
            interfaceCache[index].actions = new String[] { "Unban" };
            list.children[index - id] = index;
            list.childX[index - id] = 0;
            list.childY[index - id] = (index - id > 0 ? list.childY[index - id
                    - 1] + 14 : 0);
        }
        id += lines;
        list.width = 119;
        list.height = 210;
        list.scrollMax = (lines * 14) + 2;
        rsi.child(count++, list.id, 339, 92);
        /* Table info text */
        y = 47;
        addText(id, "You can manage both ranked and banned members here.", tda,
                0, 0xFF981F, true, true);
        rsi.child(count++, id++, 337, y);
        addText(id, "Right click on a name to edit the member.", tda, 0,
                0xFF981F, true, true);
        rsi.child(count++, id++, 337, y + 11);
        /* Add ranked member button */
        y = 75;
        addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add ranked member");
        interfaceCache[id].atActionType = 5;
        rsi.child(count++, id++, 319, y);
        /* Add banned member button */
        addButton(id, 0, "/Interfaces/Clan Chat/plus", "Add banned member");
        interfaceCache[id].atActionType = 5;
        rsi.child(count++, id++, 459, y);

        //addButton(id, 2, "/Interfaces/Clan Chat/sprite", "Allow Teleports");
        addHoverButton(id, "Interfaces/Clan Chat/sprite", 9, 150, 27, "Allow Teleports", 201, id, 5);
        rsi.child(count++, id++, 25, 248);
        addText(id, "Allow Teleports :", tda, 1,
                0xFFFFFF, true, true);
        rsi.child(count++, id++, 101, 254);
        addText(id, "@red@No", tda, 1,
                0xff0000, true, true);
        rsi.child(count++, id++, 157, 255);

        addHoverButton(id, "Interfaces/Clan Chat/sprite", 12, 150, 27, "Copy-kit", 201, id, 5);
        rsi.child(count++, id++, 25, 278);
        addText(id, "Allow Copy Kit :", tda, 1,
                0xFFFFFF, true, true);
        rsi.child(count++, id++, 101, 284);
        addText(id, "No", tda, 1,
                0xff0000, true, true);
        rsi.child(count++, id++, 157, 285);

        /* Hovers */
        int[] clanSetup = { 18302, 18304, 18307, 18310, 18313, 18316, 18526,
                18527 };
        String[] names = { "close", "sprite", "sprite", "sprite", "sprite",
                "sprite", "plus", "plus" };
        int[] ids = { 1, 3, 3, 3, 3, 3, 1, 1 };
        for (int index = 0; index < clanSetup.length; index++) {
            rsi = interfaceCache[clanSetup[index]];
            rsi.disabledSprite = imageLoader(ids[index],
                    "/Interfaces/Clan Chat/" + names[index]);
        }
    }
    public static void clanChatTab(RSFont[] tda) {
        Widget tab = addTabInterface(18128);
        addHoverButton(18129, "/Clan Chat/SPRITE", 6, 72, 32, "Join Chat", 550, 18130, 1);
        addHoveredButton(18130, "/Clan Chat/SPRITE", 7, 72, 32, 18131);
        addHoverButton(18132, "/Clan Chat/SPRITE", 6, 72, 32, "Leave Chat", -1, 18133, 5);
        addHoveredButton(18133, "/Clan Chat/SPRITE", 7, 72, 32, 18134);
        addButton(18250, 0, "/Clan Chat/Lootshare", "Toggle lootshare");
        addText(18135, "Join Chat", tda, 0, 16751360, true, true);
        addText(18136, "Leave Chat", tda, 0, 16751360, true, true);
        addSprite(18137, 37, "/Clan Chat/SPRITE");
        addText(18138, "Clan Chat", tda, 1, 16751360, true, true);
        addText(18139, "Talking in: Not in chat", tda, 0, 16751360, false, true);
        addText(18140, "Owner: None", tda, 0, 16751360, false, true);
        tab.totalChildren(14);
        tab.child(0, 16126, 0, 221);
        tab.child(1, 16126, 0, 59);
        tab.child(2, 18137, 0, 62);
        tab.child(3, 18143, 0, 62);
        tab.child(4, 18129, 15, 226);
        tab.child(5, 18130, 15, 226);
        tab.child(6, 18132, 103, 226);
        tab.child(7, 18133, 103, 226);
        tab.child(8, 18135, 51, 237);
        tab.child(9, 18136, 139, 237);
        tab.child(10, 18138, 95, 1);
        tab.child(11, 18139, 10, 23);
        tab.child(12, 18140, 25, 38);
        tab.child(13, 18250, 145, 15);
        Widget list = addTabInterface(18143);
        list.totalChildren(100);

        int id;
        for(id = 18144; id <= 18244; ++id) {
            addText(id, "", tda, 0, 16777215, false, true);
        }

        id = 18144;

        for(int i = 0; id <= 18243 && i <= 99; ++i) {
            list.children[i] = id;
            list.childX[i] = 5;
            int id2 = 18144;

            for(int i2 = 1; id2 <= 18243 && i2 <= 99; ++i2) {
                list.childY[0] = 2;
                list.childY[i2] = list.childY[i2 - 1] + 14;
                ++id2;
            }

            ++id;
        }

        list.height = 158;
        list.width = 174;
        list.scrollMax = 1405;
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
