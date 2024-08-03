import java.applet.AppletContext;
import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.net.*;
import java.util.Arrays;
import java.util.zip.CRC32;

import sign.signlink;

import java.net.URL;

public class client extends Applet_Sub1 {
    public static int cameraZoom;
    public static boolean controlIsDown;
    private FogHandler fogHandler = new FogHandler();
    public static int cameratoggle;
    public static int zoom;
    static boolean clientData;
    public static final ClientDiscordRPC RICH_PRESENCE = new ClientDiscordRPC();
    public static int lftrit;
    public static int fwdbwd;
    private String clanUsername;
    private String clanMessage;
    private String clanTitle;
    private int channelRights;
    public static int log_view_dist = 9;
    public static boolean flip = false;
    public static boolean newDamage = false;
    public static boolean flip_s = false;
    public static boolean flip_r = false;
    public boolean FogToggle = false;
    public boolean roofsOff = false;
    public boolean skyLoad = true;
    public boolean hp = true;
    public int resizeable = 0;
    public static int MapX;
    public static int MapY;
    public static int mapX;
    public static int mapY;

    public RSFont newSmallFont;
    public RSFont newRegularFont;
    public RSFont newBoldFont;
    public RSFont newFancyFont;
    private static boolean showTabComponents;
    private static boolean changeTabArea;
    private static boolean showChatComponents;
    private boolean transparentTabArea = false;
    private static boolean changeChatArea;
    private int chatTypeView = 0;
    public static client instance;
    private String clanname;
    public PlayerTitles playerTitle = new PlayerTitles();
    private Sprite[] BlackMap;
    private RSImageProducer leftFrame;
    private RSImageProducer topFrame;
    private int setChannel;
    private String[] clanList = new String[100];
    private String[] clanTitles;

    public void appearInChat(String x) {
        pushMessage(" ", 80, x);
        System.out.println("Reached appearInChat for: "+x);
    }

    void sendPacket(int packet)
    {
        if (packet == 103)
        {
            stream.createFrame(103);
            stream.writeByte(inputString.length() - 1);
            stream.writeString(inputString.substring(2));
            inputString = "";
        }
    }

    public void maps() {
        for(int MapIndex = 0; MapIndex < 3736; MapIndex++) {
            byte[] abyte0 = GetMap(MapIndex);
            if(abyte0 != null && abyte0.length > 0) {
                aClass14Array970[4].method234(abyte0.length, abyte0, (byte)2, MapIndex);
            }
        }
    }

    public static final Rectangle MAXIMUM_SCREEN_BOUNDS = GraphicsEnvironment.getLocalGraphicsEnvironment()
            .getMaximumWindowBounds();
    void mouseWheelDragged(int i, int j) {
        if (!mouseWheelDown)
            return;
        this.anInt1186 += i * 3;
        this.anInt1187 += (j << 1);
    }

    public boolean isServerUpdating() {
        return anInt1104 > 0;
    }

    public boolean isResized() {
        return currentScreenMode != ScreenMode.FIXED;
    }

    public enum ScreenMode {

        FIXED(1, 765, 503, false, false),
        RESIZABLE(2, 902, 702, true, false),
        FULLSCREEN(3, (int) client.MAXIMUM_SCREEN_BOUNDS.getWidth(), (int) client.MAXIMUM_SCREEN_BOUNDS.getHeight(), false, true);

        private final int numericalValue;

        private final int width;

        private final int height;

        private final boolean resizable;

        private final boolean undecorated;

        ScreenMode(int numericalValue, int width, int height, boolean resizable, boolean undecorated) {
            this.numericalValue = numericalValue;
            this.width = width;
            this.height = height;
            this.resizable = resizable;
            this.undecorated = undecorated;
        }

        public int getNumericalValue() {
            return numericalValue;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public boolean isResizable() {
            return resizable;
        }

        public boolean isUndecorated() {
            return undecorated;
        }

    }
    public static ScreenMode currentScreenMode;
    public static int currentGameWidth;
    public static int currentGameHeight;
    public static int screenAreaWidth;
    public static int screenAreaHeight;
    private int cButtonHPos = -1;
    private int cButtonCPos = 0;
    public static int IDLE_TIME = 60000; // 1 minute = 3000
    public static void currentScreenMode(client.ScreenMode mode) {
        if (currentScreenMode != mode) {
            currentScreenMode = mode;
            if (mode == ScreenMode.FIXED) {
                currentGameWidth = 765;
                currentGameHeight = 503;
                screenAreaWidth = 516;
                screenAreaHeight = 338;
                changeChatArea = false;
                changeTabArea = false;
                cameraZoom = 600;
                log_view_dist = 9;
                changeChatArea = false;
                changeTabArea = false;
            } else if (mode == ScreenMode.RESIZABLE) {
                currentGameWidth = 766;
                currentGameHeight = 529;
                cameraZoom = 850;
                log_view_dist = 10;
            } else if (mode == ScreenMode.FULLSCREEN) {
                cameraZoom = 600;
                log_view_dist = 10;
                currentGameWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
                currentGameHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
            }

            rebuildFrameSize(mode, currentGameWidth, currentGameHeight);
            setBounds();
            System.out.println("ScreenMode: " + mode.toString());
        }

        showChatComponents = currentScreenMode == ScreenMode.FIXED ? true : showChatComponents;
        showTabComponents = currentScreenMode == ScreenMode.FIXED ? true : showTabComponents;
    }
    public void refreshFrameSize() {
        if (currentScreenMode == ScreenMode.RESIZABLE) {
            if (currentGameWidth != (this.appletClient() ? this.method11(0).getWidth() : this.gameFrame.getFrameWidth())) {
                currentGameWidth = this.appletClient() ? this.method11(0).getWidth() : this.gameFrame.getFrameWidth();
                screenAreaWidth = currentGameWidth;
                setBounds();
            }

            if (currentGameHeight != (this.appletClient() ? this.method11(0).getHeight() : this.gameFrame.getFrameHeight())) {
                currentGameHeight = this.appletClient() ? this.method11(0).getHeight() : this.gameFrame.getFrameHeight();
                screenAreaHeight = currentGameHeight;
                setBounds();
            }
        }

    }
    public static void rebuildFrameSize(ScreenMode screenMode, int screenWidth, int screenHeight) {
        try {
            screenAreaWidth = screenMode == ScreenMode.FIXED ? 516 : screenWidth;
            screenAreaHeight = screenMode == ScreenMode.FIXED ? 338 : screenHeight;
            currentGameWidth = screenWidth;
            currentGameHeight = screenHeight;
            instance.refreshFrameSize(screenMode == ScreenMode.FULLSCREEN, screenWidth, screenHeight,
                    screenMode == ScreenMode.RESIZABLE, screenMode != ScreenMode.FIXED);
            setBounds();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }
    private boolean stackTabs() {
        return !(currentGameWidth >= 1100);
    }

    private boolean checkMainScreenBounds() {
        if (checkBounds(0, currentGameWidth - (stackTabs() ? 231 : 462), currentGameHeight - (stackTabs() ? 73 : 37),
                currentGameWidth, currentGameHeight)) {
            return false;
        }
        if (checkBounds(0, currentGameWidth - 225, 0, currentGameWidth, 170)) {
            return false;
        }
        if (checkBounds(0, currentGameWidth - 204, currentGameHeight - (stackTabs() ? 73 : 37) - 275, currentGameWidth,
                currentGameHeight)) {
            return false;
        }
        return !checkBounds(0, 0, currentGameHeight - 168, 516, currentGameHeight);
    }

    private boolean checkBounds(int type, int x1, int y1, int x2, int y2) {
        if (type == 0)
            return mouseX >= x1 && mouseX <= x2 && mouseY >= y1 && mouseY <= y2;
        else
            return Math.pow((x1 + type - x2), 2) + Math.pow((y1 + type - y2), 2) < Math.pow(type, 2);
    }

    private static void setBounds() {
        Rasterizer.method365(-950,currentGameWidth, currentGameHeight);
        fullScreenTextureArray = Rasterizer.lineOffsets;
        Rasterizer.method365(-950,
                currentScreenMode == ScreenMode.FIXED
                        ? (aRSImageProducer_1166 != null ? aRSImageProducer_1166.anInt316 : 519)
                        : currentGameWidth,
                currentScreenMode == ScreenMode.FIXED
                        ? (aRSImageProducer_1166 != null ? aRSImageProducer_1166.anInt317 : 165)
                        : currentGameHeight);
        anIntArray1180 = Rasterizer.lineOffsets;
        Rasterizer.method365(-950,
                currentScreenMode == ScreenMode.FIXED
                        ? (aRSImageProducer_1163 != null ? aRSImageProducer_1163.anInt316 : 249)
                        : currentGameWidth,
                currentScreenMode == ScreenMode.FIXED
                        ? (aRSImageProducer_1163 != null ? aRSImageProducer_1163.anInt317 : 335)
                        : currentGameHeight);
        anIntArray1181 = Rasterizer.lineOffsets;
        Rasterizer.method365(-950, screenAreaWidth, screenAreaHeight);
        anIntArray1182 = Rasterizer.lineOffsets;
        method456();
    }
    public static void method456() {
        int[] ai = new int[9];
        for (int i8 = 0; i8 < 9; i8++) {
            int k8 = 128 + i8 * 32 + 15;
            int l8 = 600 + k8 * 3;
            int i9 = Rasterizer.anIntArray1470[k8];
            ai[i8] = (l8 * i9 >> 16);
        }
        if (currentScreenMode == ScreenMode.RESIZABLE && currentGameWidth >= 766 && currentGameWidth <= 1025 && currentGameHeight >= 504
                && currentGameHeight <= 850) {
            log_view_dist = 9;
            cameraZoom = 575;
        } else if (currentScreenMode == ScreenMode.FIXED) {
            cameraZoom = 600;

        } else if (currentScreenMode != ScreenMode.FIXED || currentScreenMode == ScreenMode.FULLSCREEN) {
            log_view_dist = 10;
            cameraZoom = 600;
        }
        Class25.method310(500, 800, currentScreenMode == ScreenMode.FIXED ? 516 : screenAreaWidth,
                currentScreenMode == ScreenMode.FIXED ? 335 : screenAreaHeight, ai, aBoolean1231);
         if (aBoolean1157) {
        aRSImageProducer_1165 = new RSImageProducer(screenAreaWidth, screenAreaHeight);
         }
    }
    public byte[] GetMap(int Index) {
        try {
            File Map = new File("./Maps/"+Index+".gz");
            byte[] aByte = new byte[(int)Map.length()];
            FileInputStream Fis = new FileInputStream(Map);
            Fis.read(aByte);
            System.out.println(""+Index+" aByte = ["+aByte+"]!");
            Fis.close();
            return aByte;
        } catch(Exception e) {
            return null;
        }
    }

    public void deletethatobject(int i, int j)
    {
        int k1 = mapX - 6;
        int l1 = mapY - 6;
        int i2 = i - k1 * 8;
        int j2 = j - l1 * 8;
        byte byte0 = 10;
        int k2 = anIntArray1177[byte0];
        if(j2 > 0 && j2 < 103 && i2 > 0 && i2 < 103)
            method130(404, -1, 6951, -1, k2, j2, 10, 0, i2, 0);
    }

    public void makeGlobalObject(int i, int j, int k, int l, int i1, int j1)
    {
        int k1 = mapX - 6;
        int l1 = mapY - 6;
        int i2 = i - k1 * 8;
        int j2 = j - l1 * 8;
        byte byte0 = 10;
        int k2 = anIntArray1177[byte0];
        if(j2 > 0 && j2 < 103 && i2 > 0 && i2 < 103)
            method130(404, -1, k, l, k2, j2, i1, j1, i2, 0);
    }
    public void loadNewObjects() {

        makeGlobalObject(2807, 2787, 2213, 1, 10, 1);
        makeGlobalObject(2807, 2786, 2213, 1, 10, 1);
        makeGlobalObject(2807, 2785, 2213, 1, 10, 1);
        makeGlobalObject(2807, 2784, 2213, 1, 10, 1);
        makeGlobalObject(2807, 2783, 2213, 1, 10, 1);

    }
    private static final String method14(int i, int j) {
        String s = String.valueOf(i);
        for(int k = s.length() - 3; k > 0; k -= 3)
            s = s.substring(0, k) + "," + s.substring(k);

        if(j != 0)
            aBoolean1224 = !aBoolean1224;
        if(s.length() > 8)
            s = "@gre@" + s.substring(0, s.length() - 8) + " million @gre@(" + s + ")";
        else
        if(s.length() > 4)
            s = "@Whi@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
        return " " + s;
    }

    public final void method15(int i) {
        signlink.music.stop();
        signlink.fadeMidi = 0;
        signlink.midi = "stop";
    }
    public void processExtraMenus(){

        boolean fixed = currentScreenMode == ScreenMode.FIXED;
        if (fixed ? super.mouseX >= 542 && super.mouseX <= 579 && super.mouseY >= 2 && super.mouseY <= 38
                : super.mouseX >= currentGameWidth - 180 && super.mouseX <= currentGameWidth - 139 && super.mouseY >= 0
                && super.mouseY <= 40) {

            this.menuActionName[1] = "Look North";
            this.menuActionID[1] = 1150;
            this.menuActionRow = 2;
        }

        if (currentScreenMode != ScreenMode.FIXED && changeTabArea && super.mouseX >= currentGameWidth - 26
                && super.mouseX <= currentGameWidth - 1 && super.mouseY >= 2 && super.mouseY <= 24) {
            this.menuActionName[1] = "Logout";
            this.menuActionID[1] = 700;
            this.menuActionRow = 2;
        }

    }

    public static int TotalRead = 0;
    public static String getFileNameWithoutExtension(String fileName) {
        File tmpFile = new File(fileName);
        tmpFile.getName();
        int whereDot = tmpFile.getName().lastIndexOf('.');
        if (0 < whereDot && whereDot <= tmpFile.getName().length() - 2 ) {
            return tmpFile.getName().substring(0, whereDot);
        }
        return "";
    }
    public void preloadModels() {
        File file = new File((signlink.findcachedir()+"/raw/"));
        File[] fileArray = file.listFiles();
        for(int y = 0; y < fileArray.length; y++)
        {
            String sss = fileArray[y].getName();
            System.out.println("Parsing model file "+sss);
            byte[] buffer = ReadFile((signlink.findcachedir()+"/raw/"+sss));
            Class30_Sub2_Sub4_Sub6.method460(buffer, Integer.parseInt(getFileNameWithoutExtension(sss)));
        }
    }


    public static final byte[] ReadFile(String s)
    {
        try
        {
            byte abyte0[];
            File file = new File(s);
            int i = (int)file.length();
            abyte0 = new byte[i];
            DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
            datainputstream.readFully(abyte0, 0, i);
            datainputstream.close();
            TotalRead++;
            return abyte0;
        }
        catch(Exception e)
        {
            System.out.println((new StringBuilder()).append("Read Error: ").append(s).toString());
            return null;
        }
    }

    public final void method16() {
        int j = 5;
        anIntArray1090[8] = 0;
        int k = 0;
        while(anIntArray1090[8] == 0)
        {
            String s = "Unknown problem";
            method13(20, (byte) 4, "Connecting to Ghreborn web server");
            try
            {
                DataInputStream datainputstream = method132("crc" + (int)(Math.random() * 99999999D) + "-" + 317);
                Stream stream = new Stream(new byte[40], 891);
                datainputstream.readFully(stream.buffer, 0, 40);
                datainputstream.close();
                for(int i1 = 0; i1 < 9; i1++)
                    anIntArray1090[i1] = stream.readDWord();

                int j1 = stream.readDWord();
                int k1 = 1234;
                for(int l1 = 0; l1 < 9; l1++)
                    k1 = (k1 << 1) + anIntArray1090[l1];

                if(j1 != k1)
                {
                    s = "checksum problem";
                    anIntArray1090[8] = 0;
                }
            }
            catch(EOFException _ex)
            {
                s = "EOF problem";
                anIntArray1090[8] = 0;
            }
            catch(IOException _ex)
            {
                s = "connection problem";
                anIntArray1090[8] = 0;
            }
            catch(Exception _ex)
            {
                s = "logic problem";
                anIntArray1090[8] = 0;
                if(!signlink.reporterror)
                    return;
            }
            if(anIntArray1090[8] == 0)
            {
                k++;
                for(int l = j; l > 0; l--)
                {
                    if(k >= 10)
                    {
                        method13(10, (byte) 4, "Game updated - please reload page");
                        l = 10;
                    } else
                    {
                        method13(10, (byte) 4, s + " - Will retry in " + l + " secs.");
                    }
                    try
                    {
                        Thread.sleep(1000L);
                    }
                    catch(Exception _ex) { }
                }

                j *= 2;
                if(j > 60)
                    j = 60;
                aBoolean872 = !aBoolean872;
            }
        }
    }
    public final boolean method17(int i, int j) {
        if(j < 0)
            return false;
        int k = menuActionID[j];
        if(i != 9)
            packet = -1;
        if(k >= 2000)
            k -= 2000;
        return k == 337;
    }

    public final String prefixRank(final int s) {
        switch (s) {
            case 1: return "Lord ";
            case 2: return "Lady ";
            case 3: return "Sir ";
            case 4: return "Dame ";
            case 5: return "Duderino ";
            case 6: return "Dudette ";
            case 7: return "Lionheart ";
            case 8: return "Crusader ";
            case 9: return "Hellraiser ";
            case 10: return "Desperado ";
            case 11: return "Baron ";
            case 12: return "Baroness ";
            case 13: return "Count ";
            case 14: return "Countess ";
            case 15: return "Overlord ";
            case 16: return "Overlordess ";
            case 17: return "Bandito ";
            case 18: return "Duke ";
            case 19: return "Duchess ";
            case 20: return "Big Cheese ";
            case 21: return "Bigwig ";
            case 22: return "King ";
            case 23: return "Queen ";
            case 24: return "Wunderkind ";
            case 592: return "The eternal ";
            default: return "";
        }
    }
    public final String suffixRank(final int s) {
        switch (s) {
            case 1000: return " the Brave";
            case 1001: return " the Warrior";
            case 1002: return " the Mage";
            case 1003: return " the Ranger";
            case 1004: return " the Cow";
            default: return "";
        }
    }
    public final String prefixColor(final int s) {
        switch (s){
            case 1: return "@or2@";
            case 2: return "@or2@";
            case 3: return "@or2@";
            case 4: return "@or2@";
            case 5: return "@or2@";
            case 6: return "@or2@";
            case 7: return "@or2@";
            case 8: return "@or2@";
            case 9: return "@or2@";
            case 10: return "@or2@";
            case 11: return "@or2@";
            case 12: return "@or2@";
            case 13: return "@red@";
            case 14: return "@red@";
            case 15: return "@red@";
            case 16: return "@red@";
            case 17: return "@or2@";
            case 18: return "@or2@";
            case 19: return "@or2@";
            case 20: return "@or2@";
            case 21: return "@or2@";
            case 22: return "@or2@";
            case 23: return "@or2@";
            case 24: return "@or2@";
            case 592: return "@whi@";
            default: return "@or2@";
        }
    }
    public final String suffixColor(final int s) {
        switch (s){
            case 1000: return "@or2@";
            case 1001: return "@or2@";
            case 1002: return "@or2@";
            case 1003: return "@or2@";
            case 1004: return "@whi@";
            default: return "@or2@";
        }
    }
    private boolean chatStateCheck() {
        return this.messagePromptRaised || this.inputDialogState != 0 || this.aString844 != null
                || this.backDialogID != -1 || this.dialogID != -1;
    }
    public final void drawChatArea(int i) {
        int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 165;
        final int yOffset2 = currentScreenMode == ScreenMode.FIXED ? 338 : 0;
        if (currentScreenMode == ScreenMode.FIXED) {
            aRSImageProducer_1166.initDrawingArea();
        }
        Rasterizer.lineOffsets = anIntArray1180;
        if (this.chatStateCheck()) {
            showChatComponents = true;
            this.gameframe[0].drawSprite(0, yOffset);
        }

        if (showChatComponents) {
            if (changeChatArea && !this.chatStateCheck()) {
                DrawingArea.method339(7 + yOffset, 5723991, 506, 7);
                DrawingArea.drawAlphaGradient(7, 7 + yOffset, 506, 135, 0, 16777215, 20);
            } else {
                this.gameframe[0].drawSprite(0,yOffset);
            }
        }

        if (!showChatComponents || changeChatArea) {
            DrawingArea.drawAlphaPixels(7, currentGameHeight - 23, 506, 24, 0, 100);
        }
        this.drawChannelButtons();
        TextDrawingArea textDrawingArea = this.regularText;
        if (messagePromptRaised) {
            this.newBoldFont.drawCenteredString(this.aString1121, 259, 60 + yOffset, 0, -1);
            this.newBoldFont.drawCenteredString(this.promptInput + "*", 259, 80 + yOffset, 128, -1);

        } else if (inputDialogState == 1) {
            this.newBoldFont.drawCenteredString("Enter amount:", 259, yOffset + 60, 0, -1);
            this.newBoldFont.drawCenteredString(this.amountOrNameInput + "*", 259, 80 + yOffset, 128, -1);

        } else if (inputDialogState == 2) {
            this.newBoldFont.drawCenteredString("Enter Name:", 259, 60 + yOffset, 0, -1);
            this.newBoldFont.drawCenteredString(this.amountOrNameInput + "*", 259, 80 + yOffset, 128, -1);
        } else if (aString844 != null) {
            this.newBoldFont.drawCenteredString(this.aString844, 259, 60 + yOffset, 0, -1);
            this.newBoldFont.drawCenteredString("Click to continue", 259, 80 + yOffset, 128, -1);
        } else if (backDialogID != -1)
            drawInterface(0, 20, Widget.interfaceCache[backDialogID], 20 + yOffset);
        else if (dialogID != -1) {
            drawInterface(0, 20, Widget.interfaceCache[dialogID], 20 + yOffset);
        } else if (showChatComponents) {
            int j77 = -3;
            int j = 0;
            int shadow = changeChatArea ? 0 : -1;
            DrawingArea.setDrawingArea(122 + yOffset, 8, 497, 7 + yOffset);

            int xOffset;
            for (int var16 = 0; var16 < 500; ++var16) {
                if (this.chatMessages[var16] != null) {
                    xOffset = this.chatTypes[var16];
                    int yPos = 70 - j77 * 14 + anInt1089 + 5;
                    String s1 = this.chatNames[var16];
                    byte byte0 = 0;
                    if (s1.startsWith("@cr")) {
                        String s2 = s1.substring(3);
                        int index = s2.indexOf("@");
                        if (index != -1) {
                            s2 = s2.substring(0, index);
                            byte0 = Byte.parseByte(s2);
                            s1 = s1.substring(4 + s2.length());
                        }
                    }


                    if (xOffset == 0 && (this.chatTypeView == 5 || this.chatTypeView == 0)) {
                        this.newRegularFont.drawBasicString(this.chatMessages[var16], 11, yPos + yOffset,
                                changeChatArea ? 16777215 : 0, shadow);
                        ++j;
                        ++j77;
                    }

                    int xPos;
                    if ((xOffset == 1 || xOffset == 2)
                            && (xOffset == 1 || this.publicChatMode == 0
                            || this.publicChatMode == 1 && method109(false, s1))
                            && (this.chatTypeView == 1 || this.chatTypeView == 0)) {
                        xPos = 11;
                        switch (byte0) {
                            case 1:
                                this.ModIcons[0].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 2:
                                this.ModIcons[1].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 3:
                                this.ModIcons[2].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 4:
                                this.ModIcons[3].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 5:
                                this.ModIcons[4].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 6:
                                this.ModIcons[5].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 7:
                                this.ModIcons[6].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 8:
                                this.ModIcons[7].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 9:
                                this.ModIcons[8].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 10:
                                this.ModIcons[9].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 11:
                                this.ModIcons[10].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 12:
                                this.ModIcons[11].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 13:
                                this.ModIcons[12].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 14:
                                this.ModIcons[13].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 15:
                                this.ModIcons[14].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 16:
                                this.ModIcons[15].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 17:
                                this.ModIcons[16].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 18:
                                this.ModIcons[17].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 19:
                                this.ModIcons[18].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 20:
                                this.ModIcons[19].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 21:
                                this.ModIcons[20].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 22:
                                this.ModIcons[21].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                                break;
                            case 23:
                                this.ModIcons[22].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                            case 24:
                                this.ModIcons[23].drawSprite(xPos, yPos - 12 + yOffset);
                                xPos += 14;
                            case 25:
                                this.ModIcons[24].drawSprite(xPos,yPos - 12 + yOffset);
                                xPos += 14;
                        }

                        this.newRegularFont.drawBasicString(s1 + ":", xPos, yPos + yOffset,
                                changeChatArea ? 16777215 : 0, shadow);
                        xPos += textDrawingArea.getTextWidth(s1) + 8;
                        this.newRegularFont.drawBasicString(this.chatMessages[var16], xPos, yPos + yOffset,
                                changeChatArea ? 8366591 : 255, shadow);
                        ++j;
                        ++j77;
                    }

                    if ((xOffset == 3 || xOffset == 7) && (this.splitPrivateChat == 0 || this.chatTypeView == 2)
                            && (xOffset == 7 || this.privateChatMode == 0
                            || this.privateChatMode == 1 && this.method109(false,s1))
                            && (this.chatTypeView == 2 || this.chatTypeView == 0)) {
                        byte j2 = 11;
                        this.newRegularFont.drawBasicString("From", j2, yPos + yOffset, changeChatArea ? 0 : 16777215,
                                shadow);
                        xPos = j2 + textDrawingArea.getTextWidth("From ");
                        switch (byte0) {
                            case 1:
                                this.ModIcons[0].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 2:
                                this.ModIcons[1].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 3:
                                this.ModIcons[2].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 4:
                                this.ModIcons[3].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 5:
                                this.ModIcons[4].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 6:
                                this.ModIcons[5].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 7:
                                this.ModIcons[6].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 8:
                                this.ModIcons[7].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 9:
                                this.ModIcons[8].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 10:
                                this.ModIcons[9].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 11:
                                this.ModIcons[10].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 12:
                                this.ModIcons[11].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 13:
                                this.ModIcons[12].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 14:
                                this.ModIcons[13].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 15:
                                this.ModIcons[14].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 16:
                                this.ModIcons[15].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 17:
                                this.ModIcons[16].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 18:
                                this.ModIcons[17].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 19:
                                this.ModIcons[18].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 20:
                                this.ModIcons[19].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 21:
                                this.ModIcons[20].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 22:
                                this.ModIcons[21].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 23:
                                this.ModIcons[22].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                            case 24:
                                this.ModIcons[23].drawSprite(xPos, yPos - 12);
                                xPos += 14;
                                break;
                            case 25:
                                this.ModIcons[24].drawSprite(xPos,yPos - 12);
                                xPos += 14;
                                break;
                        }
                        this.newRegularFont.drawBasicString(s1 + ":", xPos, yPos + yOffset,
                                changeChatArea ? 16777215 : 0, shadow);
                        xPos += textDrawingArea.getTextWidth(s1) + 8;
                        this.newRegularFont.drawBasicString(this.chatMessages[var16], xPos, yPos + yOffset, 8388736,
                                shadow);
                        ++j;
                        ++j77;
                    }

                    if (xOffset == 4 && (this.tradeMode == 0 || this.tradeMode == 1 && this.method109(false,s1))
                            && (this.chatTypeView == 3 || this.chatTypeView == 0)) {
                        this.newRegularFont.drawBasicString(s1 + " " + this.chatMessages[var16], 11, yPos + yOffset,
                                8388736, shadow);
                        ++j;
                        ++j77;
                    }

                    if (xOffset == 5 && this.splitPrivateChat == 0 && this.privateChatMode < 2
                            && (this.chatTypeView == 2 || this.chatTypeView == 0)) {
                        this.newRegularFont.drawBasicString(s1 + " " + this.chatMessages[var16], 11, yPos + yOffset,
                                8388736, shadow);
                        ++j;
                        ++j77;
                    }

                    if (xOffset == 6 && (this.splitPrivateChat == 0 || this.chatTypeView == 2)
                            && this.privateChatMode < 2 && (this.chatTypeView == 2 || this.chatTypeView == 0)) {
                        this.newRegularFont.drawBasicString("To " + s1 + ":", 11, yPos + yOffset,
                                changeChatArea ? 16777215 : 0, shadow);
                        this.newRegularFont.drawBasicString(this.chatMessages[var16],
                                15 + textDrawingArea.getTextWidth("To :" + s1), yPos + yOffset, 8388736, shadow);
                        ++j;
                        ++j77;
                    }

                    if (xOffset == 8 && (this.tradeMode == 0 || this.tradeMode == 1 && this.method109(false,s1))) {
                        if (this.chatTypeView == 3 || this.chatTypeView == 0) {
                            this.newRegularFont.drawBasicString(s1 + " " + this.chatMessages[var16], 11, yPos + yOffset,
                                    8270336, shadow);
                            ++j;
                            ++j77;
                        }

                        if (xOffset == 11 && this.clanChatMode == 0) {
                            if (this.chatTypeView == 11) {
                                this.newRegularFont.drawBasicString(s1 + " " + this.chatMessages[var16], 11,
                                        yPos + yOffset, 8270336, shadow);
                                ++j;
                                ++j77;
                            }

                            if (xOffset == 12) {
                                this.newRegularFont.drawBasicString(this.chatMessages[var16], 11, yPos + yOffset,
                                        8270336, shadow);
                                ++j;
                            }
                        }
                    }

                    if (xOffset == 16) {
                        int j2 = 40 + 11;
                        String clanname = clanList[var16];
                        int clanNameWidth = textDrawingArea
                                .getTextWidth(clanname);
                        if (chatTypeView == 11 || chatTypeView == 0) {
                            if (yPos > 0 && yPos < 110)
                                if (this.chatRights[var16] > 0) {
                                    j2 += clanNameWidth;
                                    this.ModIcons[this.chatRights[var16] - 1].drawSprite(j2 - 18, yPos - 12);
                                    j2 += 15;
                                    if (this.chatRights[var16] == 0) {
                                        j2 += clanNameWidth;
                                        break;
                                    }
                                }
                        }
                        newRegularFont
                                .drawBasicString("[", 19, yPos, changeChatArea ? 0xffffff : 0, shadow);
                        newRegularFont.drawBasicString("]",
                                clanNameWidth + 16 + 11, yPos, changeChatArea ? 0xffffff : 0, shadow);
                        newRegularFont.drawBasicString(""
                                        + capitalize(clanname) + "", 25, yPos, 255,
                                -1);
                        newRegularFont.drawBasicString(
                                capitalize(chatNames[var16]) + ":", j2 - 17,
                                yPos);
                        j2 += newRegularFont.getTextWidth(chatNames[var16]) + 7;
                        newRegularFont.drawBasicString(
                                capitalize(chatMessages[var16]), j2 - 16, yPos,
                                0x800000, -1);

                        j++;
                        j77++;
                    }
                }
            }

            DrawingArea.defaultDrawingAreaSize();
            this.anInt1211 = j * 14 + 7 + 5;
            if (this.anInt1211 < 111) {
                this.anInt1211 = 111;
            }

            //this.method30(114, this.anInt1211 - anInt1089 - 113, 7 + yOffset, 496, this.anInt1211, changeChatArea);
            this.drawScrollbar(114, this.anInt1211 - anInt1089 - 113, 7 + yOffset, 496, this.anInt1211, changeChatArea);
            String s;
            if(localPlayer != null && localPlayer.name != null)
                s = prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723);
            else
                s = TextClass.fixName(myUsername);
            DrawingArea.setDrawingArea(140 + yOffset, 8, 509, 120 + yOffset);
            xOffset = 0;
            if (this.rights > 0) {
                this.ModIcons[this.rights - 1].drawSprite(10,122 + yOffset);
                xOffset += 14;
            }

            this.newRegularFont.drawBasicString(s + ":", xOffset + 11, 133 + yOffset, changeChatArea ? 16777215 : 0,
                    shadow);
            this.newRegularFont.drawBasicString(this.inputString + "*",
                    xOffset + 12 + textDrawingArea.getTextWidth(s + ": "), 133 + yOffset,
                    changeChatArea ? 8366591 : 255, shadow);
            DrawingArea.method339(121 + yOffset, changeChatArea ? 5723991 : 8418912, 506, 7);
            DrawingArea.defaultDrawingAreaSize();
        }
        if (menuOpen) {
            drawMenu(0, currentScreenMode == ScreenMode.FIXED ? 338 : 0);
        }
        if (currentScreenMode == ScreenMode.FIXED) {
        aRSImageProducer_1166.method238(338, 23680, super.aGraphics12, 0);
    }
        aRSImageProducer_1165.initDrawingArea();
        Rasterizer.lineOffsets = anIntArray1182;
        if(i < 6 || i > 6)
            aBoolean991 = !aBoolean991;
    }
    public static String capitalize(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                s = String.format("%s%s", Character.toUpperCase(s.charAt(0)), s.substring(1));
            }
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                if (i + 1 < s.length()) {
                    s = String.format("%s%s%s", s.subSequence(0, i + 1), Character.toUpperCase(s.charAt(i + 1)),
                            s.substring(i + 2));
                }
            }
        }
        return s;
    }

    private int clanChatMode = 0;
    public void drawChannelButtons() {
        int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 165;
        this.gameframe[27].drawSprite(0,143 + yOffset);
        String text[] = { "On", "Friends", "Off", "Hide", "Autochat" };
        int textColor[] = { 65280, 0xffff00, 0xff0000, 65535, 0x0d9ddc };
        switch (this.cButtonCPos) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                this.gameframe[5].drawSprite(this.channelButtonsX[this.cButtonCPos],143 + yOffset);
            default:
                if (this.cButtonHPos == this.cButtonCPos) {
                    switch (this.cButtonHPos) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.gameframe[6].drawSprite(this.channelButtonsX[this.cButtonHPos],143 + yOffset);
                    }
                } else {
                    switch (this.cButtonHPos) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.gameframe[3].drawSprite(this.channelButtonsX[this.cButtonHPos],143 + yOffset);
                            break;
                        case 6:
                            this.gameframe[8].drawSprite(this.channelButtonsX[this.cButtonHPos],143 + yOffset);
                    }
                }

            int[] modes = new int[] { this.publicChatMode, this.privateChatMode, this.clanChatMode, this.tradeMode };

                int i;
                for (i = 0; i < this.modeNamesX.length; ++i) {
                    this.smallText.method389(true, true, this.modeNamesX[i], 16777215, this.modeNames[i],
                            this.modeNamesY[i] + yOffset);
                }

                for (i = 0; i < this.modeX.length; ++i) {
                    this.smallText.method382(textColor[modes[i]], this.modeX[i], anInt939, text[modes[i]], 164 + yOffset, true);
                }

        }
    }
    public void rightClickChatButtons() {
        if (this.mouseY >= currentGameHeight - 22 && this.mouseY <= currentGameHeight) {
            if (super.mouseX >= 5 && super.mouseX <= 61) {
                this.menuActionName[1] = "View All";
                this.menuActionCmd3[1] = 999;
                this.menuActionRow = 2;
            } else if (super.mouseX >= 71 && super.mouseX <= 127) {
                this.menuActionName[1] = "View Game";
                this.menuActionCmd3[1] = 998;
                this.menuActionRow = 2;
            } else if (super.mouseX >= 137 && super.mouseX <= 193) {
                this.menuActionName[1] = "Hide public";
                this.menuActionCmd3[1] = 997;
                this.menuActionName[2] = "Off public";
                this.menuActionCmd3[2] = 996;
                this.menuActionName[3] = "Friends public";
                this.menuActionCmd3[3] = 995;
                this.menuActionName[4] = "On public";
                this.menuActionCmd3[4] = 994;
                this.menuActionName[5] = "View public";
                this.menuActionCmd3[5] = 993;
                this.menuActionRow = 6;
            } else if (super.mouseX >= 203 && super.mouseX <= 259) {
                this.menuActionName[1] = "Off private";
                this.menuActionCmd3[1] = 992;
                this.menuActionName[2] = "Friends private";
                this.menuActionCmd3[2] = 991;
                this.menuActionName[3] = "On private";
                this.menuActionCmd3[3] = 990;
                this.menuActionName[4] = "View private";
                this.menuActionCmd3[4] = 989;
                this.menuActionRow = 5;
            } else if (super.mouseX >= 269 && super.mouseX <= 325) {
                this.menuActionName[1] = "Off clan chat";
                this.menuActionCmd3[1] = 1003;
                this.menuActionName[2] = "Friends clan chat";
                this.menuActionCmd3[2] = 1002;
                this.menuActionName[3] = "On clan chat";
                this.menuActionCmd3[3] = 1001;
                this.menuActionName[4] = "View clan chat";
                this.menuActionCmd3[4] = 1000;
                this.menuActionRow = 5;
            } else if (super.mouseX >= 335 && super.mouseX <= 391) {
                this.menuActionName[1] = "Off trade";
                this.menuActionCmd3[1] = 987;
                this.menuActionName[2] = "Friends trade";
                this.menuActionCmd3[2] = 986;
                this.menuActionName[3] = "On trade";
                this.menuActionCmd3[3] = 985;
                this.menuActionName[4] = "View trade";
                this.menuActionCmd3[4] = 984;
                this.menuActionRow = 5;
            } else if (super.mouseX >= 404 && super.mouseX <= 515) {
                this.menuActionName[1] = "Report Abuse";
                this.menuActionCmd3[1] = 606;
                this.menuActionRow = 2;
            }
        }

    }
    public final void init()
    {
        try
        {

            anInt957 = 0;
            ondemand_offset = 0;
            method52(true);
            aBoolean959 = true;
            signlink.storeid = 32;
            signlink.startpriv(InetAddress.getLocalHost());
            server = Configuration.SERVER_ADDRESS;
            method2(currentGameWidth, false, currentGameWidth);
            instance = this;
        }
        catch (Exception exception)
        {
            return;
        }
    }
    public final void method12(Runnable runnable, int i) {
        if(i > 10)
            i = 10;
        if(signlink.mainapp != null) {
            signlink.startthread(runnable, i);
            return;
        } else {
            super.method12(runnable, i);
            return;
        }
    }

    public final Socket method19(int i)
            throws IOException {
        if(signlink.mainapp != null)
            return signlink.opensocket(i);
        else
            return new Socket(InetAddress.getByName(getCodeBase().getHost()), i);
    }

    public final void method20(int i) {
        if(i != 4)
            packet = in.readUnsignedByte();
        if(anInt1086 != 0)
            return;
        int j = super.clickMode3;
        if(anInt1136 == 1 && super.saveClickX >= 516 && super.saveClickY >= 160 && super.saveClickX <= 765 && super.saveClickY <= 205)
            j = 0;
        if(menuOpen) {
            if(j != 1) {
                int k = super.mouseX;
                int j1 = super.mouseY;
                if (menuScreenArea == 0) {
                    k -= 0;
                    j1 -= 0;
                }
                if (menuScreenArea == 1) {
                    k -= 519;
                    j1 -= 168;
                }
                if (menuScreenArea == 2) {
                    k -= 17;
                    j1 -= 338;
                }
                if (menuScreenArea == 3) {
                    k -= 519;
                    j1 -= 0;
                }
                if(k < anInt949 - 10 || k > anInt949 + anInt951 + 10 || j1 < anInt950 - 10 || j1 > anInt950 + anInt952 + 10) {
                    menuOpen = false;
                    if(menuScreenArea == 1) {
                    }
                    if(menuScreenArea == 2)
                        inputTaken = true;
                }
            }
            if(j == 1) {
                int l = anInt949;
                int k1 = anInt950;
                int i2 = anInt951;
                int k2 = super.saveClickX;
                int l2 = super.saveClickY;
                switch (menuScreenArea) {
                    case 0:
                        k2 -= 0;
                        l2 -= 0;
                        break;
                    case 1:
                        k2 -= 519;
                        l2 -= 168;
                        break;
                    case 2:
                        k2 -= 5;
                        l2 -= 338;
                        break;
                    case 3:
                        k2 -= 519;
                        l2 -= 0;
                        break;
                }
                int i3 = -1;
                for(int j3 = 0; j3 < menuActionRow; j3++) {
                    int k3 = k1 + 31 + (menuActionRow - 1 - j3) * 15;
                    if(k2 > l && k2 < l + i2 && l2 > k3 - 13 && l2 < k3 + 3)
                        i3 = j3;
                }

                if(i3 != -1)
                    method69(i3, false);
                menuOpen = false;
                if(menuScreenArea == 1) {
                }
                if(menuScreenArea == 2) {
                    inputTaken = true;
                    return;
                }
            }
        } else {
            if(j == 1 && menuActionRow > 0) {
                int i1 = menuActionID[menuActionRow - 1];
                if(i1 == 632 || i1 == 78 || i1 == 867 || i1 == 431 || i1 == 53 || i1 == 74 || i1 == 454 || i1 == 539 || i1 == 493 || i1 == 847 || i1 == 447 || i1 == 1125) {
                    int l1 = menuActionCmd2[menuActionRow - 1];
                    int j2 = menuActionCmd3[menuActionRow - 1];
                    Widget class9 = Widget.interfaceCache[j2];
                    if(class9.deleteOnDrag2 || class9.dragDeletes) {
                        aBoolean1242 = false;
                        anInt989 = 0;
                        anInt1084 = j2;
                        anInt1085 = l1;
                        anInt1086 = 2;
                        anInt1087 = super.saveClickX;
                        anInt1088 = super.saveClickY;
                        if(Widget.interfaceCache[j2].parentID == openInterfaceID)
                            anInt1086 = 1;
                        if(Widget.interfaceCache[j2].parentID == backDialogID)
                            anInt1086 = 3;
                        return;
                    }
                }
            }
            if(j == 1 && (anInt1253 == 1 || method17(9, menuActionRow - 1)) && menuActionRow > 2)
                j = 2;
            if(j == 1 && menuActionRow > 0)
                method69(menuActionRow - 1, false);
            if(j == 2 && menuActionRow > 0)
                method116(true);
        }
    }
    public String indexLocation(int cacheIndex, int index) {
        return "D:/dump/index" + cacheIndex + "/" + (index != -1 ? index + ".gz" : "");
    }

    public void repackCacheIndex(int cacheIndex) {
        System.out.println("Started repacking index " + cacheIndex + ".");
        int indexLength = new File(indexLocation(cacheIndex, -1)).listFiles().length;
        File[] file = new File(indexLocation(cacheIndex, -1)).listFiles();
        try {
            for (int index = 0; index < indexLength; index++) {
                int fileIndex = Integer.parseInt(getFileNameWithoutExtension(file[index].toString()));
                byte[] data = fileToByteArray(cacheIndex, fileIndex);
                if (data != null && data.length > 0) {
                    aClass14Array970[cacheIndex].method234(data.length, data, (byte) 2, fileIndex);
                    System.out.println("Repacked " + fileIndex + ".");
                } else {
                    System.out.println("Unable to locate index " + fileIndex + ".");
                }
            }
        } catch (Exception e) {
            System.out.println("Error packing cache index " + cacheIndex + ".");
        }
        System.out.println("Finished repacking " + cacheIndex + ".");
    }

    public byte[] fileToByteArray(int cacheIndex, int index) {
        try {
            if (this.indexLocation(cacheIndex, index).length() > 0 && this.indexLocation(cacheIndex, index) != null) {
                File var61 = new File(this.indexLocation(cacheIndex, index));
                byte[] fileData = new byte[(int) var61.length()];
                FileInputStream fis = new FileInputStream(var61);
                fis.read(fileData);
                fis.close();
                return fileData;
            } else {
                return null;
            }
        } catch (Exception var6) {
            return null;
        }
    }

    public final void method21(boolean flag, int i, byte abyte0[]) {
        signlink.fadeMidi = flag ? 1 : 0;
        signlink.midisave(abyte0, abyte0.length);
        if(i != 0)
            packet = in.readUnsignedByte();
    }
    public final void method22(boolean flag)
    {
        try
        {
            anInt985 = -1;
            aClass19_1056.method256();
            aClass19_1013.method256();
            loadNewObjects();
            Rasterizer.method366(anInt846);
            method23(false);
            aClass25_946.method274(619);
            System.gc();
            for(int i = 0; i < 4; i++)
                collisionMaps[i].method210();

            for(int l = 0; l < 4; l++)
            {
                for(int k1 = 0; k1 < 104; k1++)
                {
                    for(int j2 = 0; j2 < 104; j2++)
                        aByteArrayArrayArray1258[l][k1][j2] = 0;

                }

            }

            ObjectManager objectManager = new ObjectManager(aByteArrayArrayArray1258, -60, 104, 104, anIntArrayArrayArray1214);
            int k2 = terrainData.length;

            stream.createFrame(0);
            if(!aBoolean1159)
            {
                for(int i3 = 0; i3 < k2; i3++)
                {
                    int i4 = (mapCoordinates[i3] >> 8) * 64 - baseX;
                    int k5 = (mapCoordinates[i3] & 0xff) * 64 - baseY;
                    byte abyte0[] = terrainData[i3];
                    if(abyte0 != null)
                        objectManager.method180(abyte0, k5, i4, (currentRegionX - 6) * 8, (currentRegionY - 6) * 8, (byte)4, collisionMaps);
                }

                for(int j4 = 0; j4 < k2; j4++)
                {
                    int l5 = (mapCoordinates[j4] >> 8) * 64 - baseX;
                    int k7 = (mapCoordinates[j4] & 0xff) * 64 - baseY;
                    byte abyte2[] = terrainData[j4];
                    if(abyte2 == null && currentRegionY < 800)
                        //class7.method174(k7, 64, 0, 64, l5);
                        objectManager.method174(k7 * 8, 8, 0, 8, l5 * 8);
                }

                anInt1097++;
                if(anInt1097 > 160)
                {
                    anInt1097 = 0;
                    stream.createFrame(238);
                    stream.writeByte(96);
                }
                stream.createFrame(0);
                for(int i6 = 0; i6 < k2; i6++)
                {
                    byte abyte1[] = mapData[i6];
                    if(abyte1 != null)
                    {
                        int l8 = (mapCoordinates[i6] >> 8) * 64 - baseX;
                        int k9 = (mapCoordinates[i6] & 0xff) * 64 - baseY;
                        objectManager.method190(l8, collisionMaps, k9, 7, aClass25_946, abyte1);
                    }
                }

            }
            if(aBoolean1159)
            {
                for(int j3 = 0; j3 < 4; j3++)
                {
                    for(int k4 = 0; k4 < 13; k4++)
                    {
                        for(int j6 = 0; j6 < 13; j6++)
                        {
                            int l7 = anIntArrayArrayArray1129[j3][k4][j6];
                            if(l7 != -1)
                            {
                                int i9 = l7 >> 24 & 3;
                                int l9 = l7 >> 1 & 3;
                                int j10 = l7 >> 14 & 0x3ff;
                                int l10 = l7 >> 3 & 0x7ff;
                                int j11 = (j10 / 8 << 8) + l10 / 8;
                                for(int l11 = 0; l11 < mapCoordinates.length; l11++)
                                {
                                    if(mapCoordinates[l11] != j11 || terrainData[l11] == null)
                                        continue;
                                    objectManager.method179(i9, l9, collisionMaps, 9, k4 * 8, (j10 & 7) * 8, terrainData[l11], (l10 & 7) * 8, j3, j6 * 8);
                                    break;
                                }

                            }
                        }

                    }

                }

                for(int l4 = 0; l4 < 13; l4++)
                {
                    for(int k6 = 0; k6 < 13; k6++)
                    {
                        int i8 = anIntArrayArrayArray1129[0][l4][k6];
                        if(i8 == -1)
                            objectManager.method174(k6 * 8, 8, 0, 8, l4 * 8);
                    }

                }

                stream.createFrame(0);
                for(int l6 = 0; l6 < 4; l6++)
                {
                    for(int j8 = 0; j8 < 13; j8++)
                    {
                        for(int j9 = 0; j9 < 13; j9++)
                        {
                            int i10 = anIntArrayArrayArray1129[l6][j8][j9];
                            if(i10 != -1)
                            {
                                int k10 = i10 >> 24 & 3;
                                int i11 = i10 >> 1 & 3;
                                int k11 = i10 >> 14 & 0x3ff;
                                int i12 = i10 >> 3 & 0x7ff;
                                int j12 = (k11 / 8 << 8) + i12 / 8;
                                for(int k12 = 0; k12 < mapCoordinates.length; k12++)
                                {
                                    if(mapCoordinates[k12] != j12 || mapData[k12] == null)
                                        continue;
                                    objectManager.method183(collisionMaps, aClass25_946, k10, j8 * 8, (i12 & 7) * 8, true, l6, mapData[k12], (k11 & 7) * 8, i11, j9 * 8);
                                    break;
                                }

                            }
                        }

                    }

                }

            }
            stream.createFrame(0);
            objectManager.method171(collisionMaps, aClass25_946, 2);
            aRSImageProducer_1165.initDrawingArea();
            stream.createFrame(0);
            int k3 = ObjectManager.anInt145;
            if(k3 > anInt918)
                k3 = anInt918;
            if(k3 < anInt918 - 1)
                k3 = anInt918 - 1;
            if(lowMemory)
                aClass25_946.method275(ObjectManager.anInt145, -34686);
            else
                aClass25_946.method275(0, -34686);
            for(int i5 = 0; i5 < 104; i5++)
            {
                for(int i7 = 0; i7 < 104; i7++)
                    method25(i5, i7);

            }

            anInt1051++;
            if(anInt1051 > 98)
            {
                anInt1051 = 0;
                stream.createFrame(150);
            }
            method63(-919);
        }
        catch(Exception exception) { }
        Class46.aClass12_785.method224();
        aBoolean1157 &= flag;
        if(super.gameFrame != null)
        {
            stream.createFrame(210);
            stream.writeDWord(0x3f008edd);
        }
        if(lowMemory && signlink.cache_dat != null)
        {
            int j = onDemandFetcher.method555(79, 0);
            for(int i1 = 0; i1 < j; i1++)
            {
                int l1 = onDemandFetcher.method559(i1, -203);
                if((l1 & 0x79) == 0)
                    Class30_Sub2_Sub4_Sub6.method461(116, i1);
            }

        }
        System.gc();
        Rasterizer.method367(20, true);
        onDemandFetcher.method566(0);
        int k = (currentRegionX - 6) / 8 - 1;
        int j1 = (currentRegionX + 6) / 8 + 1;
        int i2 = (currentRegionY - 6) / 8 - 1;
        int l2 = (currentRegionY + 6) / 8 + 1;
        if(aBoolean1141)
        {
            k = 49;
            j1 = 50;
            i2 = 49;
            l2 = 50;
        }
        for(int l3 = k; l3 <= j1; l3++)
        {
            for(int j5 = i2; j5 <= l2; j5++)
                if(l3 == k || l3 == j1 || j5 == i2 || j5 == l2)
                {
                    int j7 = onDemandFetcher.method562(0, 0, j5, l3);
                    if(j7 != -1)
                        onDemandFetcher.method560(j7, 3, false);
                    int k8 = onDemandFetcher.method562(1, 0, j5, l3);
                    if(k8 != -1)
                        onDemandFetcher.method560(k8, 3, false);
                }

        }

    }

    public final void method23(boolean flag)
    {
        Class46.aClass12_785.method224();
        Class46.aClass12_780.method224();
        Class5.aClass12_95.method224();
        Class8.aClass12_159.method224();
        Class8.aClass12_158.method224();
        if(flag)
            packet = -1;
        Player.aClass12_1704.method224();
        Class23.aClass12_415.method224();
    }

    public final void method24(boolean flag, int i)
    {
        int ai[] = minimapImage.myPixels;
        int j = ai.length;
        for(int k = 0; k < j; k++)
            ai[k] = 0;

        for(int l = 1; l < 103; l++)
        {
            int i1 = 24628 + (103 - l) * 512 * 4;
            for(int k1 = 1; k1 < 103; k1++)
            {
                if((aByteArrayArrayArray1258[i][k1][l] & 0x18) == 0)
                    aClass25_946.method309(ai, i1, 512, i, k1, l);
                if(i < 3 && (aByteArrayArrayArray1258[i + 1][k1][l] & 8) != 0)
                    aClass25_946.method309(ai, i1, 512, i + 1, k1, l);
                i1 += 4;
            }

        }

        int j1 = ((238 + (int)(Math.random() * 20D)) - 10 << 16) + ((238 + (int)(Math.random() * 20D)) - 10 << 8) + ((238 + (int)(Math.random() * 20D)) - 10);
        int l1 = (238 + (int)(Math.random() * 20D)) - 10 << 16;
        minimapImage.method343(0);
        for(int i2 = 1; i2 < 103; i2++)
        {
            for(int j2 = 1; j2 < 103; j2++)
            {
                if((aByteArrayArrayArray1258[i][j2][i2] & 0x18) == 0)
                    method50(i2, -960, j1, j2, l1, i);
                if(i < 3 && (aByteArrayArrayArray1258[i + 1][j2][i2] & 8) != 0)
                    method50(i2, -960, j1, j2, l1, i + 1);
            }

        }

        aRSImageProducer_1165.initDrawingArea();
        aBoolean1157 &= flag;
        anInt1071 = 0;
        for(int k2 = 0; k2 < 104; k2++)
        {
            for(int l2 = 0; l2 < 104; l2++)
            {
                long i3 = aClass25_946.method303(anInt918, k2, l2);
                if(i3 != 0)
                {
                    int objId = ObjectKey.getObjectId(i3);
                    int j3 = Class46.forID(objId).anInt746;
                    if(j3 >= 0)
                    {
                        int k3 = k2;
                        int l3 = l2;
                        if(j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48)
                        {
                            byte byte0 = 104;
                            byte byte1 = 104;
                            int ai1[][] = collisionMaps[anInt918].anIntArrayArray294;
                            for(int i4 = 0; i4 < 10; i4++)
                            {
                                int j4 = (int)(Math.random() * 4D);
                                if(j4 == 0 && k3 > 0 && k3 > k2 - 3 && (ai1[k3 - 1][l3] & 0x1280108) == 0)
                                    k3--;
                                if(j4 == 1 && k3 < byte0 - 1 && k3 < k2 + 3 && (ai1[k3 + 1][l3] & 0x1280180) == 0)
                                    k3++;
                                if(j4 == 2 && l3 > 0 && l3 > l2 - 3 && (ai1[k3][l3 - 1] & 0x1280102) == 0)
                                    l3--;
                                if(j4 == 3 && l3 < byte1 - 1 && l3 < l2 + 3 && (ai1[k3][l3 + 1] & 0x1280120) == 0)
                                    l3++;
                            }

                        }
                        aSpriteArray1140[anInt1071] = aSpriteArray1033[j3];
                        anIntArray1072[anInt1071] = k3;
                        anIntArray1073[anInt1071] = l3;
                        anInt1071++;
                    }
                }
            }

        }

    }

    public final void method25(int i, int j)
    {
        Class19 class19 = aClass19ArrayArrayArray827[anInt918][i][j];
        if(class19 == null)
        {
            aClass25_946.method295(anInt918, i, j);
            return;
        }
        int k = 0xfa0a1f01;
        Object obj = null;
        for(Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetFirst(); class30_sub2_sub4_sub2 != null; class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetNext(false))
        {
            Class8 class8 = Class8.method198(class30_sub2_sub4_sub2.anInt1558);
            int l = class8.anInt155;
            if(class8.aBoolean176)
                l *= class30_sub2_sub4_sub2.anInt1559 + 1;
            if(l > k)
            {
                k = l;
                obj = class30_sub2_sub4_sub2;
            }
        }

        class19.method250(-493, ((Class30) (obj)));
        Object obj1 = null;
        Object obj2 = null;
        for(Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2_1 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetFirst(); class30_sub2_sub4_sub2_1 != null; class30_sub2_sub4_sub2_1 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetNext(false))
        {
            if(class30_sub2_sub4_sub2_1.anInt1558 != ((Class30_Sub2_Sub4_Sub2) (obj)).anInt1558 && obj1 == null)
                obj1 = class30_sub2_sub4_sub2_1;
            if(class30_sub2_sub4_sub2_1.anInt1558 != ((Class30_Sub2_Sub4_Sub2) (obj)).anInt1558 && class30_sub2_sub4_sub2_1.anInt1558 != ((Class30_Sub2_Sub4_Sub2) (obj1)).anInt1558 && obj2 == null)
                obj2 = class30_sub2_sub4_sub2_1;
        }

        int i1 = i + (j << 7) + 0x60000000;
        aClass25_946.method281((byte)7, i, i1, ((Class30_Sub2_Sub4) (obj1)), method42(anInt918, j * 128 + 64, true, i * 128 + 64), ((Class30_Sub2_Sub4) (obj2)), ((Class30_Sub2_Sub4) (obj)), anInt918, j);
    }

    public final void method26(boolean flag, int i)
    {
        for(int j = 0; j < npcCount; j++)
        {
            Npc npc = npcs[npcIndices[j]];
            long k = 0x20000000L | (long)  npcIndices[j] << 32;
            if(npc == null || !npc.method449(aBoolean1224) || npc.desc.aBoolean93 != flag)
                continue;
            int l = npc.anInt1550 >> 7;
            int i1 = npc.anInt1551 >> 7;
            if(l < 0 || l >= 104 || i1 < 0 || i1 >= 104)
                continue;
            if(npc.anInt1540 == 1 && (npc.anInt1550 & 0x7f) == 64 && (npc.anInt1551 & 0x7f) == 64)
            {
                if(anIntArrayArray929[l][i1] == anInt1265)
                    continue;
                anIntArrayArray929[l][i1] = anInt1265;
            }
            if(!npc.desc.aBoolean84)
                k |= ~0x7fffffffffffffffL;
            aClass25_946.method285(anInt918, npc.anInt1552, (byte)6, method42(anInt918, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550), k, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551, (((Class30_Sub2_Sub4_Sub1) (npc)).anInt1540 - 1) * 64 + 60, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550, npc, ((Class30_Sub2_Sub4_Sub1) (npc)).aBoolean1541);
        }

        if(i == -30815);
    }

    public final boolean method27(int i) {
        if(i != 11456)
            throw new NullPointerException();
        else
            return signlink.wavereplay();
    }

    private final void method28(String s) {
        System.out.println(s);
        try {
            getAppletContext().showDocument(new URL(getCodeBase(), "loaderror_" + s + ".html"));
        }
        catch(Exception exception) {
            exception.printStackTrace();
        }
        do
            try {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        while(true);
    }

    public final void buildInterfaceMenu(int i, int j, Widget class9, int k, int l, int i1, int j1) {
        if(class9.type != 0 || class9.children == null || class9.isMouseoverTriggered)
            return;
        if(k < i || i1 < l || k > i + class9.width || i1 > l + class9.height)
            return;
        int k1 = class9.children.length;
        if(j != 13037)
            aClass19ArrayArrayArray827 = null;
        for(int l1 = 0; l1 < k1; l1++) {
            int i2 = class9.childX[l1] + i;
            int j2 = (class9.childY[l1] + l) - j1;
            Widget class9_1 = Widget.interfaceCache[class9.children[l1]];
            i2 += class9_1.anInt263;
            j2 += class9_1.anInt265;
            if((class9_1.hoverType >= 0 || class9_1.anInt216 != 0) && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height)
                if(class9_1.hoverType >= 0)
                    anInt886 = class9_1.hoverType;
                else
                    anInt886 = class9_1.id;
            if(class9_1.type == 0) {
                buildInterfaceMenu(i2, 13037, class9_1, k, j2, i1, class9_1.scrollPosition);
                if(class9_1.scrollMax > class9_1.height)
                    method65(i2 + class9_1.width, class9_1.height, k, i1, class9_1, j2, true, class9_1.scrollMax, 0);
            } else {
                if(class9_1.atActionType == 1 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    boolean flag = false;
                    if(class9_1.contentType != 0)
                        flag = method103(class9_1, false);
                    if(!flag) {
                        menuActionName[menuActionRow] = class9_1.tooltip;
                        menuActionID[menuActionRow] = 315;
                        menuActionCmd3[menuActionRow] = class9_1.id;
                        menuActionRow++;
                    }
                }
                if(class9_1.atActionType == 2 && anInt1136 == 0 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    String s = class9_1.selectedActionName;
                    if(s.indexOf(" ") != -1)
                        s = s.substring(0, s.indexOf(" "));
                    menuActionName[menuActionRow] = s + " @gre@" + class9_1.spellName;
                    menuActionID[menuActionRow] = 626;
                    menuActionCmd3[menuActionRow] = class9_1.id;
                    menuActionRow++;
                }
                if(class9_1.atActionType == 3 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    menuActionName[menuActionRow] = "Close";
                    menuActionID[menuActionRow] = 200;
                    menuActionCmd3[menuActionRow] = class9_1.id;
                    menuActionRow++;
                }
                if(class9_1.atActionType == 4 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    menuActionName[menuActionRow] = class9_1.tooltip;
                    menuActionID[menuActionRow] = 169;
                    menuActionCmd3[menuActionRow] = class9_1.id;
                    menuActionRow++;
                }
                if(class9_1.atActionType == 5 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    menuActionName[menuActionRow] = class9_1.tooltip;
                    menuActionID[menuActionRow] = 646;
                    menuActionCmd3[menuActionRow] = class9_1.id;
                    menuActionRow++;
                }
                if(class9_1.atActionType == 6 && !aBoolean1149 && k >= i2 && i1 >= j2 && k < i2 + class9_1.width && i1 < j2 + class9_1.height) {
                    menuActionName[menuActionRow] = class9_1.tooltip;
                    menuActionID[menuActionRow] = 679;
                    menuActionCmd3[menuActionRow] = class9_1.id;
                    menuActionRow++;
                }
                // clan chat
                if (k >= i2 && i1 >= j2
                        && k < i2 + (class9_1.type == 4 ? 100 : class9_1.width)
                        && i1 < j2 + class9_1.height) {
                    if (class9_1.actions != null) {
                        if ((class9_1.type == 4 && class9_1.message.length() > 0)
                                || class9_1.type == 5) {
                            for (int action = class9_1.actions.length - 1; action >= 0; action--) {
                                if (class9_1.actions[action] != null) {
                                    menuActionName[menuActionRow] = class9_1.actions[action]
                                            + (class9_1.type == 4 ? " "
                                            + class9_1.message : "");
                                    menuActionID[menuActionRow] = 647;
                                    menuActionCmd2[menuActionRow] = action;
                                    menuActionCmd3[menuActionRow] = class9_1.id;
                                    menuActionRow++;
                                }
                            }
                        }
                    }
                }
                if(class9_1.type == 2) {
                    int k2 = 0;
                    for(int l2 = 0; l2 < class9_1.height; l2++) {
                        for(int i3 = 0; i3 < class9_1.width; i3++) {
                            int j3 = i2 + i3 * (32 + class9_1.invSpritePadX);
                            int k3 = j2 + l2 * (32 + class9_1.invSpritePadY);
                            if(k2 < 20) {
                                j3 += class9_1.spritesX[k2];
                                k3 += class9_1.spritesY[k2];
                            }
                            if(k >= j3 && i1 >= k3 && k < j3 + 32 && i1 < k3 + 32) {
                                anInt1066 = k2;
                                anInt1067 = class9_1.id;
                                if(class9_1.inv[k2] > 0) {
                                    Class8 class8 = Class8.method198(class9_1.inv[k2] - 1);
                                    if(anInt1282 == 1 && class9_1.isInventoryInterface) {
                                        if(class9_1.id != anInt1284 || k2 != anInt1283) {
                                            menuActionName[menuActionRow] = "Use " + aString1286 + " with @lre@" + class8.name;
                                            menuActionID[menuActionRow] = 870;
                                            menuActionCmd1[menuActionRow] = class8.anInt157;
                                            menuActionCmd2[menuActionRow] = k2;
                                            menuActionCmd3[menuActionRow] = class9_1.id;
                                            menuActionRow++;
                                        }
                                    } else
                                    if(anInt1136 == 1 && class9_1.isInventoryInterface) {
                                        if((anInt1138 & 0x10) == 16) {
                                            menuActionName[menuActionRow] = aString1139 + " @lre@" + class8.name;
                                            menuActionID[menuActionRow] = 543;
                                            menuActionCmd1[menuActionRow] = class8.anInt157;
                                            menuActionCmd2[menuActionRow] = k2;
                                            menuActionCmd3[menuActionRow] = class9_1.id;
                                            menuActionRow++;
                                        }
                                    } else {
                                        if(class9_1.isInventoryInterface) {
                                            for(int l3 = 4; l3 >= 3; l3--)
                                                if(class8.aStringArray189 != null && class8.aStringArray189[l3] != null) {
                                                    menuActionName[menuActionRow] = class8.aStringArray189[l3] + " @lre@" + class8.name;
                                                    if(l3 == 3)
                                                        menuActionID[menuActionRow] = 493;
                                                    if(l3 == 4)
                                                        menuActionID[menuActionRow] = 847;
                                                    menuActionCmd1[menuActionRow] = class8.anInt157;
                                                    menuActionCmd2[menuActionRow] = k2;
                                                    menuActionCmd3[menuActionRow] = class9_1.id;
                                                    menuActionRow++;
                                                } else if(l3 == 4) {
                                                    menuActionName[menuActionRow] = "Drop @lre@" + class8.name;
                                                    menuActionID[menuActionRow] = 847;
                                                    menuActionCmd1[menuActionRow] = class8.anInt157;
                                                    menuActionCmd2[menuActionRow] = k2;
                                                    menuActionCmd3[menuActionRow] = class9_1.id;
                                                    menuActionRow++;
                                                }

                                        }
                                        if(class9_1.usableItemInterface) {
                                            menuActionName[menuActionRow] = "Use @lre@" + class8.name;
                                            menuActionID[menuActionRow] = 447;
                                            menuActionCmd1[menuActionRow] = class8.anInt157;
                                            menuActionCmd2[menuActionRow] = k2;
                                            menuActionCmd3[menuActionRow] = class9_1.id;
                                            menuActionRow++;
                                        }
                                        if(class9_1.isInventoryInterface && class8.aStringArray189 != null) {
                                            for(int i4 = 2; i4 >= 0; i4--)
                                                if(class8.aStringArray189[i4] != null) {
                                                    menuActionName[menuActionRow] = class8.aStringArray189[i4] + " @lre@" + class8.name;
                                                    if(i4 == 0)
                                                        menuActionID[menuActionRow] = 74;
                                                    if(i4 == 1)
                                                        menuActionID[menuActionRow] = 454;
                                                    if(i4 == 2)
                                                        menuActionID[menuActionRow] = 539;
                                                    menuActionCmd1[menuActionRow] = class8.anInt157;
                                                    menuActionCmd2[menuActionRow] = k2;
                                                    menuActionCmd3[menuActionRow] = class9_1.id;
                                                    menuActionRow++;
                                                }

                                        }
                                        if(class9_1.actions != null) {
                                            for(int j4 = 4; j4 >= 0; j4--)
                                                if(class9_1.actions[j4] != null) {
                                                    menuActionName[menuActionRow] = class9_1.actions[j4] + " @lre@" + class8.name;
                                                    if(j4 == 0)
                                                        menuActionID[menuActionRow] = 632;
                                                    if(j4 == 1)
                                                        menuActionID[menuActionRow] = 78;
                                                    if(j4 == 2)
                                                        menuActionID[menuActionRow] = 867;
                                                    if(j4 == 3)
                                                        menuActionID[menuActionRow] = 431;
                                                    if(j4 == 4)
                                                        menuActionID[menuActionRow] = 53;
                                                    menuActionCmd1[menuActionRow] = class8.anInt157;
                                                    menuActionCmd2[menuActionRow] = k2;
                                                    menuActionCmd3[menuActionRow] = class9_1.id;
                                                    menuActionRow++;
                                                }

                                        }
                                        if(rights >= 2)
                                            menuActionName[menuActionRow] = "Examine @lre@"+class8.name +"@gre@(@whi@"+class8.anInt157+"@gre@)";
                                        if(rights <= 1)
                                            menuActionName[menuActionRow] = "Examine @lre@"+class8.name;
                                        menuActionID[menuActionRow] = 1125;
                                        menuActionCmd1[menuActionRow] = class8.anInt157;
                                        menuActionCmd2[menuActionRow] = k2;
                                        menuActionCmd3[menuActionRow] = class9_1.id;
                                        menuActionRow++;
                                    }
                                }
                            }
                            k2++;
                        }
                    }
                }
            }
        }
    }
    public void drawTransparentScrollBar(int x, int y, int height, int maxScroll, int pos) {
        this.gameframe[33].drawARGBSprite(x, y, 120);
        this.gameframe[34].drawARGBSprite(x, y + height - 16, 120);
        DrawingArea.drawVerticalLine(x, y + 16, height - 32, 16777215, 64);
        DrawingArea.drawVerticalLine(x + 15, y + 16, height - 32, 16777215, 64);
        int barHeight = (height - 32) * height / maxScroll;
        if (barHeight < 10) {
            barHeight = 10;
        }

        int barPos = 0;
        if (maxScroll != height) {
            barPos = (height - 32 - barHeight) * pos / (maxScroll - height);
        }

        DrawingArea.drawRectangle(x, y + 16 + barPos, 16, 5 + y + 16 + barPos + barHeight - 5 - (y + 16 + barPos),
                16777215, 32);
    }
    public void playSound(int id, int type, int delay, int volume){
        sound[currentSound] = id;
        soundType[currentSound] = type;
        soundDelay[currentSound] = Sound.anIntArray326[id];
        soundVolume[currentSound] = volume;
        currentSound++;
    }
    public void drawScrollbar(int height, int pos, int y, int x, int maxScroll, boolean transparent) {
        if (transparent) {
            this.drawTransparentScrollBar(x, y, height, maxScroll, pos);
        } else {
            this.aSprite_1024.drawSprite(x, y);
            this.aSprite_1025.drawSprite(x,y + height - 16);
            DrawingArea.drawPixels(height - 32, y + 16, x, 1, 16);
            DrawingArea.drawPixels(height - 32, y + 16, x, 4011046, 15);
            DrawingArea.drawPixels(height - 32, y + 16, x, 3419425, 13);
            DrawingArea.drawPixels(height - 32, y + 16, x, 3024925, 11);
            DrawingArea.drawPixels(height - 32, y + 16, x, 2696219, 10);
            DrawingArea.drawPixels(height - 32, y + 16, x, 2433049, 9);
            DrawingArea.drawPixels(height - 32, y + 16, x, 1, 1);
            int k1 = (height - 32) * height / maxScroll;
            if (k1 < 8) {
                k1 = 8;
            }

            int l1 = (height - 32 - k1) * pos / (maxScroll - height);
            DrawingArea.drawPixels(k1, y + 16 + l1, x, this.anInt1063, 16);
            DrawingArea.method341(y + 16 + l1, 1, k1, x);
            DrawingArea.method341(y + 16 + l1, 0x314c31, k1, x + 1);
            DrawingArea.method341(y + 16 + l1, 0x375437, k1, x + 2);
            DrawingArea.method341(y + 16 + l1, 0x3c5c3d, k1, x + 3);
            DrawingArea.method341(y + 16 + l1, 0x3c5c3d, k1, x + 4);
            DrawingArea.method341(y + 16 + l1, 0x3e603e, k1, x + 5);
            DrawingArea.method341(y + 16 + l1, 0x3e603e, k1, x + 6);
            DrawingArea.method341(y + 16 + l1, 0x426541, k1, x + 7);
            DrawingArea.method341(y + 16 + l1, 0x426541, k1, x + 8);
            DrawingArea.method341(y + 16 + l1, 0x3e603e, k1, x + 9);
            DrawingArea.method341(y + 16 + l1, 0x3e603e, k1, x + 10);
            DrawingArea.method341(y + 16 + l1, 0x3d5d3d, k1, x + 11);
            DrawingArea.method341(y + 16 + l1, 0x3d5d3d, k1, x + 12);
            DrawingArea.method341(y + 16 + l1, 0x3e603e, k1, x + 13);
            DrawingArea.method341(y + 16 + l1, 0x375437, k1, x + 14);
            DrawingArea.method339(y + 16 + l1, 1, 15, x);
            DrawingArea.method339(y + 17 + l1, 1, 15, x);
            DrawingArea.method339(y + 17 + l1, 0x3e603e, 14, x);
            DrawingArea.method339(y + 17 + l1, 0x3c5c3d, 13, x);
            DrawingArea.method339(y + 17 + l1, 0x466f46, 11, x);
            DrawingArea.method339(y + 17 + l1, 0x375437, 10, x);
            DrawingArea.method339(y + 17 + l1, 0x3c5c3d, 7, x);
            DrawingArea.method339(y + 17 + l1, 0x375437, 5, x);
            DrawingArea.method339(y + 17 + l1, 0x3c5c3d, 4, x);
            DrawingArea.method339(y + 17 + l1, 0x314c31, 3, x);
            DrawingArea.method339(y + 17 + l1, 1, 2, x);
            DrawingArea.method339(y + 18 + l1, 1, 16, x);
            DrawingArea.method339(y + 18 + l1, 5655352, 15, x);
            DrawingArea.method339(y + 18 + l1, 0x3e603e, 14, x);
            DrawingArea.method339(y + 18 + l1, 6444608, 11, x);
            DrawingArea.method339(y + 18 + l1, 0x3e603e, 10, x);
            DrawingArea.method339(y + 18 + l1, 0x3c5c3d, 7, x);
            DrawingArea.method339(y + 18 + l1, 7233606, 5, x);
            DrawingArea.method339(y + 18 + l1, 7430727, 4, x);
            DrawingArea.method339(y + 18 + l1, 8088141, 3, x);
            DrawingArea.method339(y + 18 + l1, 0x314c31, 2, x);
            DrawingArea.method339(y + 18 + l1, 1, 1, x);
            DrawingArea.method339(y + 19 + l1, 1, 16, x);
            DrawingArea.method339(y + 19 + l1, 0x3e603e, 15, x);
            DrawingArea.method339(y + 19 + l1, 5655352, 14, x);
            DrawingArea.method339(y + 19 + l1, 0x3e603e, 11, x);
            DrawingArea.method339(y + 19 + l1, 0x426541, 9, x);
            DrawingArea.method339(y + 19 + l1, 0x3e603e, 7, x);
            DrawingArea.method339(y + 19 + l1, 0x3c5c3d, 5, x);
            DrawingArea.method339(y + 19 + l1, 7233606, 4, x);
            DrawingArea.method339(y + 19 + l1, 0x375437, 3, x);
            DrawingArea.method339(y + 19 + l1, 0x314c31, 2, x);
            DrawingArea.method339(y + 19 + l1, 1, 1, x);
            DrawingArea.method339(y + 20 + l1, 1, 16, x);
            DrawingArea.method339(y + 20 + l1, 0x375437, 15, x);
            DrawingArea.method339(y + 20 + l1, 5523766, 14, x);
            DrawingArea.method339(y + 20 + l1, 0x3d5d3d, 13, x);
            DrawingArea.method339(y + 20 + l1, 0x3e603e, 10, x);
            DrawingArea.method339(y + 20 + l1, 0x426541, 8, x);
            DrawingArea.method339(y + 20 + l1, 0x3e603e, 6, x);
            DrawingArea.method339(y + 20 + l1, 0x3c5c3d, 4, x);
            DrawingArea.method339(y + 20 + l1, 0x375437, 3, x);
            DrawingArea.method339(y + 20 + l1, 0x314c31, 2, x);
            DrawingArea.method339(y + 20 + l1, 1, 1, x);
            DrawingArea.method341(y + 16 + l1, 1, k1, x + 15);
            DrawingArea.method339(y + 15 + l1 + k1, 1, 16, x);
            DrawingArea.method339(y + 14 + l1 + k1, 1, 15, x);
            DrawingArea.method339(y + 14 + l1 + k1, 4142890, 14, x);
            DrawingArea.method339(y + 14 + l1 + k1, 4471853, 10, x);
            DrawingArea.method339(y + 14 + l1 + k1, 4734511, 9, x);
            DrawingArea.method339(y + 14 + l1 + k1, 4866095, 7, x);
            DrawingArea.method339(y + 14 + l1 + k1, 0x375437, 4, x);
            DrawingArea.method339(y + 14 + l1 + k1, 5655352, 3, x);
            DrawingArea.method339(y + 14 + l1 + k1, 1, 2, x);
            DrawingArea.method339(y + 13 + l1 + k1, 1, 16, x);
            DrawingArea.method339(y + 13 + l1 + k1, 4471853, 15, x);
            DrawingArea.method339(y + 13 + l1 + k1, 0x375437, 11, x);
            DrawingArea.method339(y + 13 + l1 + k1, 0x3e603e, 9, x);
            DrawingArea.method339(y + 13 + l1 + k1, 5523766, 7, x);
            DrawingArea.method339(y + 13 + l1 + k1, 5655352, 6, x);
            DrawingArea.method339(y + 13 + l1 + k1, 0x3d5d3d, 4, x);
            DrawingArea.method339(y + 13 + l1 + k1, 6444608, 3, x);
            DrawingArea.method339(y + 13 + l1 + k1, 0x3c5c3d, 2, x);
            DrawingArea.method339(y + 13 + l1 + k1, 1, 1, x);
            DrawingArea.method339(y + 12 + l1 + k1, 1, 16, x);
            DrawingArea.method339(y + 12 + l1 + k1, 4471853, 15, x);
            DrawingArea.method339(y + 12 + l1 + k1, 0x375437, 14, x);
            DrawingArea.method339(y + 12 + l1 + k1, 5523766, 12, x);
            DrawingArea.method339(y + 12 + l1 + k1, 5655352, 11, x);
            DrawingArea.method339(y + 12 + l1 + k1, 0x3d5d3d, 10, x);
            DrawingArea.method339(y + 12 + l1 + k1, 0x3e603e, 7, x);
            DrawingArea.method339(y + 12 + l1 + k1, 0x426541, 4, x);
            DrawingArea.method339(y + 12 + l1 + k1, 7233606, 3, x);
            DrawingArea.method339(y + 12 + l1 + k1, 8088141, 2, x);
            DrawingArea.method339(y + 12 + l1 + k1, 1, 1, x);
            DrawingArea.method339(y + 11 + l1 + k1, 1, 16, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x375437, 15, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x3e603e, 14, x);
            DrawingArea.method339(y + 11 + l1 + k1, 5655352, 13, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x3d5d3d, 11, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x3e603e, 9, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x426541, 7, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x3e603e, 5, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x3c5c3d, 4, x);
            DrawingArea.method339(y + 11 + l1 + k1, 0x375437, 3, x);
            DrawingArea.method339(y + 11 + l1 + k1, 8088141, 2, x);
            DrawingArea.method339(y + 11 + l1 + k1, 1, 1, x);
        }

    }


    private final void method31(Stream stream, int i, int j)
    {
        anInt839 = 0;
        anInt893 = 0;
        method139(stream, -45, i);
        method46(i, stream, (byte)2);
        updateNpcState(i, stream, true);
        for(int k = 0; k < anInt839; k++)
        {
            int l = anIntArray840[k];
            if(npcs[l].anInt1537 != loopCycle)
            {
                npcs[l].desc = null;
                npcs[l] = null;
            }
        }

        for(int i1 = 0; i1 < npcCount; i1++)
            if(npcs[npcIndices[i1]] == null)
            {
                signlink.reporterror(myUsername + " null entry in npc list - pos:" + i1 + " size:" + npcCount);
                throw new RuntimeException("eek");
            }

    }
    public final void method32(boolean flag) {
        aBoolean1157 &= flag;
        if(super.clickMode3 == 1) {
            if(super.saveClickX >= 6 && super.saveClickX <= 106 && super.saveClickY >= 467 && super.saveClickY <= 499) {
                publicChatMode = (publicChatMode + 1) % 4;
                aBoolean1233 = true;
                inputTaken = true;
                stream.createFrame(95);
                stream.writeByte(publicChatMode);
                stream.writeByte(privateChatMode);
                stream.writeByte(tradeMode);
            }
            if(super.saveClickX >= 135 && super.saveClickX <= 235 && super.saveClickY >= 467 && super.saveClickY <= 499) {
                privateChatMode = (privateChatMode + 1) % 3;
                aBoolean1233 = true;
                inputTaken = true;
                stream.createFrame(95);
                stream.writeByte(publicChatMode);
                stream.writeByte(privateChatMode);
                stream.writeByte(tradeMode);
            }
            if(super.saveClickX >= 273 && super.saveClickX <= 373 && super.saveClickY >= 467 && super.saveClickY <= 499) {
                tradeMode = (tradeMode + 1) % 3;
                aBoolean1233 = true;
                inputTaken = true;
                stream.createFrame(95);
                stream.writeByte(publicChatMode);
                stream.writeByte(privateChatMode);
                stream.writeByte(tradeMode);
            }
            if(super.saveClickX >= 412 && super.saveClickX <= 512 && super.saveClickY >= 467 && super.saveClickY <= 499)
                if(openInterfaceID == -1) {
                    clearTopInterfaces(537);
                    reportAbuseInput = "";
                    canMute = false;
                    for(int i = 0; i < Widget.interfaceCache.length; i++) {
                        if(Widget.interfaceCache[i] == null || Widget.interfaceCache[i].contentType != 600)
                            continue;
                        reportAbuseInterfaceID = openInterfaceID = Widget.interfaceCache[i].parentID;
                        break;
                    }
                } else {
                    pushMessage("Please close the interface you have open before using 'report abuse'", 0, "");
                }
            anInt940++;
            if(anInt940 > 1386)
            {
                anInt940 = 0;
                stream.createFrame(165);
                stream.writeByte(0);
                int j = stream.currentPosition;
                stream.writeByte(139);
                stream.writeByte(150);
                stream.writeWord(32131);
                stream.writeByte((int)(Math.random() * 256D));
                stream.writeWord(3250);
                stream.writeByte(177);
                stream.writeWord(24859);
                stream.writeByte(119);
                if((int)(Math.random() * 2D) == 0)
                    stream.writeWord(47234);
                if((int)(Math.random() * 2D) == 0)
                    stream.writeByte(21);
                stream.method407(stream.currentPosition - j, (byte)0);
            }
        }
    }

    public final void method33(boolean flag, int i)
    {
        int j = Class41.aClass41Array701[i].anInt709;
        if(j == 0)
            return;
        int k = variousSettings[i];
        if(flag)
            anInt961 = aISAACRandomGen_1000.getNextKey();
        if(j == 1)
        {
            if(k == 1)
                Rasterizer.method372(0.90000000000000002D, aByte1200);
            if(k == 2)
                Rasterizer.method372(0.80000000000000004D, aByte1200);
            if(k == 3)
                Rasterizer.method372(0.69999999999999996D, aByte1200);
            if(k == 4)
                Rasterizer.method372(0.59999999999999998D, aByte1200);
            Class8.aClass12_158.method224();
            aBoolean1255 = true;
        }
        if(j == 3)
        {
            boolean flag1 = musicEnabled;
            if(k == 0)
            {
                adjustVolume(musicEnabled, 500);
                musicEnabled = true;
            }
            if(k == 1)
            {
                adjustVolume(musicEnabled, 300);
                musicEnabled = true;
            }
            if(k == 2)
            {
                musicEnabled = false;
                musicEnabled = true;
            }
            if(k == 3)
            {
                method123((byte)0, musicEnabled, -1200);
                musicEnabled = true;
            }
            if(k == 4)
                musicEnabled = false;
            if(musicEnabled != flag1)
            {
                if(musicEnabled)
                {
                    nextSong = currentSong;
                    songChanging = true;
                    onDemandFetcher.method558(2, nextSong);
                } else
                {
                    stopMidi();
                }
                previousSong = 0;
            }
        }
        if(j == 4)
        {
            SoundPlayer.setVolume(k);
            if(k == 0)
            {
                aBoolean848 = true;
                method111((byte)2, 0);
            }
            if(k == 1)
            {
                aBoolean848 = true;
                method111((byte)2, -400);
            }
            if(k == 2)
            {
                aBoolean848 = true;
                method111((byte)2, -800);
            }
            if(k == 3)
            {
                aBoolean848 = true;
                method111((byte)2, -1200);
            }
            if(k == 4)
                aBoolean848 = false;
        }
        if(j == 5)
            anInt1253 = k;
        if(j == 6)
            anInt1249 = k;
        if(j == 8)
        {
            splitPrivateChat = k;
            inputTaken = true;
        }
        if(j == 9)
            anInt913 = k;
    }

    public final void method34(int var1) {
        this.anInt974 = 0;

        int var2;
        int var6;
        int var14;
        for(var2 = -1; var2 < this.anInt891 + this.npcCount; ++var2) {
            Class30_Sub2_Sub4_Sub1 var3;
            if(var2 == -1) {
                var3 = localPlayer;
            } else if(var2 < this.anInt891) {
                var3 = this.aPlayerArray890[this.anIntArray892[var2]];
            } else {
                var3 = this.npcs[this.npcIndices[var2 - this.anInt891]];
            }

            if(var3 != null && ((Class30_Sub2_Sub4_Sub1) var3).method449(aBoolean1224)) {
                Class5 var4;
                if(var3 instanceof Npc) {
                    var4 = ((Npc)var3).desc;
                    if(var4.anIntArray88 != null) {
                        var4 = var4.method161();
                    }

                    if(var4 == null) {
                        continue;
                    }
                }

                if(var2 < this.anInt891) {
                    var14 = 30;
                    Player var5 = (Player)var3;
                    if(var5.anInt1706 != 0) {
                        this.method127(true, (Class30_Sub2_Sub4_Sub1) var3, ((Class30_Sub2_Sub4_Sub1) var3).anInt1507 + 15);
                        if(this.anInt963 > -1) {
                            for(var6 = 0; var6 < 8; ++var6) {
                                if((var5.anInt1706 & 1 << var6) != 0) {
                                    this.aSpriteArray1095[var6].drawSprite(this.anInt963 - 12, this.anInt964 - var14);
                                    var14 -= 25;
                                }
                            }
                        }
                    }

                    if(var2 >= 0 && this.anInt855 == 10 && this.anInt933 == this.anIntArray892[var2]) {
                        this.method127(true, (Class30_Sub2_Sub4_Sub1) var3, ((Class30_Sub2_Sub4_Sub1) var3).anInt1507 + 15);
                        if(this.anInt963 > -1) {
                            this.aSpriteArray1095[7].drawSprite(this.anInt963 - 12, this.anInt964 - var14);
                        }
                    }
                } else {
                    var4 = ((Npc)var3).desc;
                    if(var4.anInt75 >= 0 && var4.anInt75 < this.aSpriteArray1095.length) {
                        this.method127(true, (Class30_Sub2_Sub4_Sub1) var3, ((Class30_Sub2_Sub4_Sub1) var3).anInt1507 + 15);
                        if(this.anInt963 > -1) {
                            this.aSpriteArray1095[var4.anInt75].drawSprite(this.anInt963 - 12, this.anInt964 - 30);
                        }
                    }

                    if(this.anInt855 == 1 && this.anInt1222 == this.npcIndices[var2 - this.anInt891] && loopCycle % 20 < 10) {
                        this.method127(true, (Class30_Sub2_Sub4_Sub1) var3, ((Class30_Sub2_Sub4_Sub1) var3).anInt1507 + 15);
                        if(this.anInt963 > -1) {
                            this.aSpriteArray1095[2].drawSprite(this.anInt963 - 12, this.anInt964 - 28);
                        }
                    }
                }

                if(((Class30_Sub2_Sub4_Sub1) var3).aString1506 != null && (var2 >= this.anInt891 || this.publicChatMode == 0 || this.publicChatMode == 3 || this.publicChatMode == 1 && this.method109(false, ((Player)var3).name))) {
                    this.method127(true, (Class30_Sub2_Sub4_Sub1) var3, ((Class30_Sub2_Sub4_Sub1) var3).anInt1507);
                    if(this.anInt963 > -1 && this.anInt974 < this.anInt975) {
                        this.anIntArray979[this.anInt974] = this.boldText.method384(((Class30_Sub2_Sub4_Sub1) var3).aString1506, true) / 2;
                        this.anIntArray978[this.anInt974] = this.boldText.anInt1497;
                        this.anIntArray976[this.anInt974] = this.anInt963;
                        this.anIntArray977[this.anInt974] = this.anInt964;
                        this.anIntArray980[this.anInt974] = ((Class30_Sub2_Sub4_Sub1) var3).anInt1513;
                        this.anIntArray981[this.anInt974] = ((Class30_Sub2_Sub4_Sub1) var3).anInt1531;
                        this.anIntArray982[this.anInt974] = ((Class30_Sub2_Sub4_Sub1) var3).textCycle;
                        this.aStringArray983[this.anInt974++] = ((Class30_Sub2_Sub4_Sub1) var3).aString1506;
                        if(this.anInt1249 == 0 && ((Class30_Sub2_Sub4_Sub1) var3).anInt1531 >= 1 && ((Class30_Sub2_Sub4_Sub1) var3).anInt1531 <= 3) {
                            this.anIntArray978[this.anInt974] += 10;
                            this.anIntArray977[this.anInt974] += 5;
                        }

                        if(this.anInt1249 == 0 && ((Class30_Sub2_Sub4_Sub1) var3).anInt1531 == 4) {
                            this.anIntArray979[this.anInt974] = 60;
                        }

                        if(this.anInt1249 == 0 && ((Class30_Sub2_Sub4_Sub1) var3).anInt1531 == 5) {
                            this.anIntArray978[this.anInt974] += 5;
                        }

                    }
                }

                if(var3.anInt1532 > loopCycle) {
                    this.method127(true, var3, var3.anInt1507 + 15);
                    if(this.anInt963 > -1) {
                        var14 = var3.anInt1533 * 30 / var3.anInt1534;
                        if(var14 > 30) {
                            var14 = 30;
                        }

                        if(this.hp) {
                            this.boldText.method382(16711680, this.anInt963, -918, var3.anInt1533 + "/" + var3.anInt1534, this.anInt964 - 9, true);
                        }

                        DrawingArea.drawPixels(5, this.anInt964 - 3, this.anInt963 - 15, '\uff00', var14);
                        DrawingArea.drawPixels(5, this.anInt964 - 3, this.anInt963 - 15 + var14, 16711680, 30 - var14);
                    }
                }

                for(var14 = 0; var14 < 4; ++var14) {
                    if(var3.anIntArray1516[var14] > loopCycle) {
                        this.method127(true, var3, var3.anInt1507 / 2);
                        if(this.anInt963 > -1) {
                            if(var14 == 1) {
                                this.anInt964 -= 20;
                            }

                            if(var14 == 2) {
                                this.anInt963 -= 15;
                                this.anInt964 -= 10;
                            }

                            if(var14 == 3) {
                                this.anInt963 += 15;
                                this.anInt964 -= 10;
                            }
                            try {
                                this.aSpriteArray987[var3.anIntArray1515[var14]].drawSprite(this.anInt963 - 12, this.anInt964 - 12);
                                this.smallText.method381(0, String.valueOf(var3.anIntArray1514[var14]), 23693, this.anInt964 + 4, this.anInt963);
                                this.smallText.method381(16777215, String.valueOf(var3.anIntArray1514[var14]), 23693, this.anInt964 + 3, this.anInt963 - 1);

                            }catch (ArrayIndexOutOfBoundsException e){
                            } catch(NullPointerException e){

                            }
                        }
                    }
                }
            }
        }

        if(var1 != 0) {
            this.method6();
        }

        for(var2 = 0; var2 < this.anInt974; ++var2) {
            int var12 = this.anIntArray976[var2];
            var14 = this.anIntArray977[var2];
            int var13 = this.anIntArray979[var2];
            var6 = this.anIntArray978[var2];
            boolean var7 = true;

            while(var7) {
                var7 = false;

                for(int var8 = 0; var8 < var2; ++var8) {
                    if(var14 + 2 > this.anIntArray977[var8] - this.anIntArray978[var8] && var14 - var6 < this.anIntArray977[var8] + 2 && var12 - var13 < this.anIntArray976[var8] + this.anIntArray979[var8] && var12 + var13 > this.anIntArray976[var8] - this.anIntArray979[var8] && this.anIntArray977[var8] - this.anIntArray978[var8] < var14) {
                        var14 = this.anIntArray977[var8] - this.anIntArray978[var8];
                        var7 = true;
                    }
                }
            }

            this.anInt963 = this.anIntArray976[var2];
            this.anInt964 = this.anIntArray977[var2] = var14;
            String var15 = this.aStringArray983[var2];
            if(this.anInt1249 == 0) {
                int var9 = 16776960;
                if(this.anIntArray980[var2] < 6) {
                    var9 = this.anIntArray965[this.anIntArray980[var2]];
                }

                if(this.anIntArray980[var2] == 6) {
                    var9 = this.anInt1265 % 20 >= 10?16776960:16711680;
                }

                if(this.anIntArray980[var2] == 7) {
                    var9 = this.anInt1265 % 20 >= 10?'\uffff':255;
                }

                if(this.anIntArray980[var2] == 8) {
                    var9 = this.anInt1265 % 20 >= 10?8454016:'\ub000';
                }

                int var10;
                if(this.anIntArray980[var2] == 9) {
                    var10 = 150 - this.anIntArray982[var2];
                    if(var10 < 50) {
                        var9 = 16711680 + 1280 * var10;
                    } else if(var10 < 100) {
                        var9 = 16776960 - 327680 * (var10 - 50);
                    } else if(var10 < 150) {
                        var9 = '\uff00' + 5 * (var10 - 100);
                    }
                }

                if(this.anIntArray980[var2] == 10) {
                    var10 = 150 - this.anIntArray982[var2];
                    if(var10 < 50) {
                        var9 = 16711680 + 5 * var10;
                    } else if(var10 < 100) {
                        var9 = 16711935 - 327680 * (var10 - 50);
                    } else if(var10 < 150) {
                        var9 = 255 + 327680 * (var10 - 100) - 5 * (var10 - 100);
                    }
                }

                if(this.anIntArray980[var2] == 11) {
                    var10 = 150 - this.anIntArray982[var2];
                    if(var10 < 50) {
                        var9 = 16777215 - 327685 * var10;
                    } else if(var10 < 100) {
                        var9 = '\uff00' + 327685 * (var10 - 50);
                    } else if(var10 < 150) {
                        var9 = 16777215 - 327680 * (var10 - 100);
                    }
                }

                if(this.anIntArray981[var2] == 0) {
                    this.boldText.method381(0, var15, 23693, this.anInt964 + 1, this.anInt963);
                    this.boldText.method381(var9, var15, 23693, this.anInt964, this.anInt963);
                }

                if(this.anIntArray981[var2] == 1) {
                    this.boldText.method386(0, true, var15, this.anInt963, this.anInt1265, this.anInt964 + 1);
                    this.boldText.method386(var9, true, var15, this.anInt963, this.anInt1265, this.anInt964);
                }

                if(this.anIntArray981[var2] == 2) {
                    this.boldText.method387(this.anInt963, var15, this.anInt1265, this.anInt964 + 1, this.aByte1194, 0);
                    this.boldText.method387(this.anInt963, var15, this.anInt1265, this.anInt964, this.aByte1194, var9);
                }

                if(this.anIntArray981[var2] == 3) {
                    this.boldText.method388(150 - this.anIntArray982[var2], var15, true, this.anInt1265, this.anInt964 + 1, this.anInt963, 0);
                    this.boldText.method388(150 - this.anIntArray982[var2], var15, true, this.anInt1265, this.anInt964, this.anInt963, var9);
                }

                int var11;
                if(this.anIntArray981[var2] == 4) {
                    var10 = this.boldText.method384(var15, true);
                    var11 = (150 - this.anIntArray982[var2]) * (var10 + 100) / 150;
                    DrawingArea.setDrawingArea(334, this.anInt963 - 50, this.anInt963 + 50, 0);
                    this.boldText.method385(0, var15, this.anInt964 + 1, 822, this.anInt963 + 50 - var11);
                    this.boldText.method385(var9, var15, this.anInt964, 822, this.anInt963 + 50 - var11);
                    DrawingArea.method332(4);
                }

                if(this.anIntArray981[var2] == 5) {
                    var10 = 150 - this.anIntArray982[var2];
                    var11 = 0;
                    if(var10 < 25) {
                        var11 = var10 - 25;
                    } else if(var10 > 125) {
                        var11 = var10 - 125;
                    }

                    DrawingArea.setDrawingArea(this.anInt964 + 5, 0,  512, this.anInt964 - this.boldText.anInt1497 - 1);
                    this.boldText.method381(0, var15, 23693, this.anInt964 + 1 + var11, this.anInt963);
                    this.boldText.method381(var9, var15, 23693, this.anInt964 + var11, this.anInt963);
                    DrawingArea.method332(4);
                }
            } else {
                this.boldText.method381(0, var15, 23693, this.anInt964 + 1, this.anInt963);
                this.boldText.method381(16776960, var15, 23693, this.anInt964, this.anInt963);
            }
        }

    }
    public final void method35(boolean flag, long l) {
        try {
            if(l == 0L)
                return;
            for(int i = 0; i < anInt899; i++) {
                if(aLongArray955[i] != l)
                    continue;
                anInt899--;
                tabAreaAltered = true;
                for(int j = i; j < anInt899; j++) {
                    aStringArray1082[j] = aStringArray1082[j + 1];
                    anIntArray826[j] = anIntArray826[j + 1];
                    aLongArray955[j] = aLongArray955[j + 1];
                }

                stream.createFrame(215);
                stream.method404(5, l);
                break;
            }

            if(flag)
                return;
        } catch(RuntimeException runtimeexception) {
            signlink.reporterror("18622, " + flag + ", " + l + ", " + runtimeexception.toString());
            throw new RuntimeException();
        }
    }

    public final void drawTabArea(byte byte0) {
        int xOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameWidth - 241;
        int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 336;
        if(currentScreenMode == ScreenMode.FIXED) {
            aRSImageProducer_1163.initDrawingArea();
        }
        Rasterizer.lineOffsets = anIntArray1181;
        int x;
        int y;
        if(byte0 != -81)
            return;
        if (currentScreenMode == ScreenMode.FIXED) {
            this.gameframe[14].drawSprite(0, 0);
        } else if (currentScreenMode != ScreenMode.FIXED && !changeTabArea) {
            DrawingArea.method335(4076841, currentGameHeight - 304, 195, 270, transparentTabArea ? 80 : 256, 0,
                    currentGameWidth - 217);
            this.gameframe[25].drawSprite(xOffset, yOffset);
        } else {
            int index;
            if (currentGameWidth >= 1000) {
                if (showTabComponents) {
                    DrawingArea.method335(4076841, currentGameHeight - 304, 197, 265, transparentTabArea ? 80 : 256,0,
                            currentGameWidth - 197);
                    this.gameframe[28].drawSprite(currentGameWidth - 204, currentGameHeight - 311);
                }

                x = currentGameWidth - 417;
                y = currentGameHeight - 37;

                for (index = 0; x <= currentGameWidth - 30 && index < 13; ++index) {
                    this.gameframe[24].drawSprite(x, y);
                    x += 32;
                }
            } else if (currentGameWidth < 1000) {
                if (showTabComponents) {
                    DrawingArea.method335(4076841, currentGameHeight - 341, 195, 265, transparentTabArea ? 80 : 256,0,
                            currentGameWidth - 197);
                    this.gameframe[28].drawSprite(currentGameWidth - 204,currentGameHeight - 348);
                }

                x = currentGameWidth - 226;
                y = currentGameHeight - 73;

                for (index = 0; x <= currentGameWidth - 32 && index < 7; ++index) {
                    this.gameframe[24].drawSprite(x, y);
                    x += 32;
                }

                x = currentGameWidth - 226;
                y = currentGameHeight - 37;

                for (index = 0; x <= currentGameWidth - 32 && index < 7; ++index) {
                    this.gameframe[24].drawSprite(x, y);
                    x += 32;
                }
            }
        }
        if (this.invOverlayInterfaceID == -1) {
            this.drawRedStones();
            this.drawSideIcons();
        }

        if (showTabComponents) {
            x = currentScreenMode == ScreenMode.FIXED ? 31 : currentGameWidth - 215;
            y = currentScreenMode ==ScreenMode.FIXED ? 37 : currentGameHeight - 299;
            if (changeTabArea) {
                x = currentGameWidth - 197;
                y = currentGameWidth >= 1000 ? currentGameHeight - 303 : currentGameHeight - 340;
            }
            if (this.invOverlayInterfaceID != -1) {
                this.drawInterface(0, x, Widget.interfaceCache[this.invOverlayInterfaceID], y);
            } else if (tabInterfaceIDs[tabID] != -1) {
                this.drawInterface(0, x, Widget.interfaceCache[tabInterfaceIDs[tabID]], y);
            }
        }
        if(menuOpen) {
            drawMenu(currentScreenMode == ScreenMode.FIXED ? 516 : 0, currentScreenMode == ScreenMode.FIXED ? 168 : 0);
        }
        if(currentScreenMode == ScreenMode.FIXED) {
            aRSImageProducer_1163.method238(168, 23680, super.aGraphics12, 516);
            aRSImageProducer_1165.initDrawingArea();
        }
        Rasterizer.lineOffsets = anIntArray1182;
    }
    public void drawSideIcons() {
        int xOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameWidth - 247;
        int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 336;
        if (currentScreenMode != ScreenMode.FIXED && (currentScreenMode == ScreenMode.FIXED || changeTabArea)) {
            int i;
            if (changeTabArea && currentGameWidth < 1000) {
                int[] iconId = { 0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13 };
                int[] iconX = { 219, 189, 156, 126, 93, 62, 30, 219, 189, 156, 124, 92, 59, 28 };
                int[] iconY = { 67, 69, 67, 69, 72, 72, 69, 32, 29, 29, 32, 30, 33, 31, 32 };

                for (i = 0; i < this.sideIconsTab.length; ++i) {
                    if (tabInterfaceIDs[this.sideIconsTab[i]] != -1 && iconId[i] != -1) {
                        this.sideIcons[iconId[i]].drawSprite(currentGameWidth - iconX[i],currentGameHeight - iconY[i]);
                    }
                }
            } else if (changeTabArea && currentGameWidth >= 1000) {
                int[] iconId = { 0, 1, 2, 3, 4, 5, 6, -1, 8, 9, 7, 11, 12, 13 };
                int[] iconX = { 50, 80, 114, 143, 176, 208, 240, 242, 273, 306, 338, 370, 404, 433 };
                int[] iconY = { 30, 32, 30, 32, 34, 34, 32, 32, 29, 29, 32, 31, 32, 32, 32 };

                for (i = 0; i < this.sideIconsTab.length; ++i) {
                    if (tabInterfaceIDs[this.sideIconsTab[i]] != -1 && iconId[i] != -1) {
                        this.sideIcons[iconId[i]].drawSprite(currentGameWidth - 461 + iconX[i], currentGameHeight - iconY[i]);
                    }
                }
            }
        } else {
            for (int iconId = 0; iconId < this.sideIconsTab.length; ++iconId) {
                if (tabInterfaceIDs[this.sideIconsTab[iconId]] != -1 && this.sideIconsId[iconId] != -1) {
                    this.sideIcons[this.sideIconsId[iconId]].drawSprite(this.sideIconsX[iconId] + xOffset,
                            this.sideIconsY[iconId] + yOffset);
                }
            }
        }

    }

    private void drawRedStones() {
        int xOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameWidth - 247;
        int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 336;
        if (currentScreenMode != ScreenMode.FIXED && (currentScreenMode == ScreenMode.FIXED || changeTabArea)) {
            int[] stoneX;
            if (changeTabArea && currentGameWidth < 1000) {
                stoneX = new int[] { 226, 194, 162, 130, 99, 65, 34, 219, 195, 161, 130, 98, 65, 33 };
                int[] stoneY = new int[] { 73, 73, 73, 73, 73, 73, 73, -1, 37, 37, 37, 37, 37, 37, 37 };
                if (tabInterfaceIDs[tabID] != -1 && tabID != 10 && showTabComponents) {
                    if (tabID == 7) {
                        this.gameframe[13].drawSprite(currentGameWidth - 130, currentGameHeight - 37);
                    }

                    this.gameframe[13].drawSprite(currentGameWidth - stoneX[tabID], currentGameHeight - stoneY[tabID]);
                }
            } else if (changeTabArea && currentGameWidth >= 1000) {
                stoneX = new int[] { 417, 385, 353, 321, 289, 256, 224, 129, 193, 161, 130, 98, 65, 33 };
                if (tabInterfaceIDs[tabID] != -1 && tabID != 10 && showTabComponents) {
                    this.gameframe[13].drawSprite(currentGameWidth - stoneX[tabID], currentGameHeight - 37);
                }
            }
        } else if (tabInterfaceIDs[tabID] != -1 && tabID != 15) {
            this.gameframe[this.redStonesId[tabID]].drawSprite(this.redStonesX[tabID] + xOffset,
                    this.redStonesY[tabID] + yOffset);
        }

    }
    public final void method37(int i, int j)
    {
        if(i <= 0)
            packet = -1;
        if(!lowMemory)
        {
            if(Rasterizer.anIntArray1480[24] >= j) {
                Background class30_sub2_sub1_sub2_2 = Rasterizer.aBackgroundArray1474[24];
                int l = class30_sub2_sub1_sub2_2.anInt1452 * class30_sub2_sub1_sub2_2.anInt1453 - 1;
                int k1 = class30_sub2_sub1_sub2_2.anInt1452 * anInt945 * 2;
                byte abyte1[] = class30_sub2_sub1_sub2_2.aByteArray1450;
                byte abyte4[] = aByteArray912;
                for(int j2 = 0; j2 <= l; j2++)
                    abyte4[j2] = abyte1[j2 - k1 & l];

                class30_sub2_sub1_sub2_2.aByteArray1450 = abyte4;
                aByteArray912 = abyte1;
                Rasterizer.method370(24, -477);
            }
            if(Rasterizer.anIntArray1480[17] >= j)
            {
                Background background = Rasterizer.aBackgroundArray1474[17];
                int k = background.anInt1452 * background.anInt1453 - 1;
                int j1 = background.anInt1452 * anInt945 * 2;
                byte abyte0[] = background.aByteArray1450;
                byte abyte3[] = aByteArray912;
                for(int i2 = 0; i2 <= k; i2++)
                    abyte3[i2] = abyte0[i2 - j1 & k];

                background.aByteArray1450 = abyte3;
                aByteArray912 = abyte0;
                Rasterizer.method370(17, -477);
                anInt854++;
                if(anInt854 > 1235)
                {
                    anInt854 = 0;
                    stream.createFrame(226);
                    stream.writeByte(0);
                    int l2 = stream.currentPosition;
                    stream.writeWord(58722);
                    stream.writeByte(240);
                    stream.writeWord((int)(Math.random() * 65536D));
                    stream.writeByte((int)(Math.random() * 256D));
                    if((int)(Math.random() * 2D) == 0)
                        stream.writeWord(51825);
                    stream.writeByte((int)(Math.random() * 256D));
                    stream.writeWord((int)(Math.random() * 65536D));
                    stream.writeWord(7130);
                    stream.writeWord((int)(Math.random() * 65536D));
                    stream.writeWord(61657);
                    stream.method407(stream.currentPosition - l2, (byte)0);
                }
            }
            if(Rasterizer.anIntArray1480[24] >= j)
            {
                Background class30_sub2_sub1_sub2_1 = Rasterizer.aBackgroundArray1474[24];
                int l = class30_sub2_sub1_sub2_1.anInt1452 * class30_sub2_sub1_sub2_1.anInt1453 - 1;
                int k1 = class30_sub2_sub1_sub2_1.anInt1452 * anInt945 * 2;
                byte abyte1[] = class30_sub2_sub1_sub2_1.aByteArray1450;
                byte abyte4[] = aByteArray912;
                for(int j2 = 0; j2 <= l; j2++)
                    abyte4[j2] = abyte1[j2 - k1 & l];

                class30_sub2_sub1_sub2_1.aByteArray1450 = abyte4;
                aByteArray912 = abyte1;
                Rasterizer.method370(24, -477);
            }
            if(Rasterizer.anIntArray1480[40] >= j)
            {
                Background class30_sub2_sub1_sub2_1 = Rasterizer.aBackgroundArray1474[40];
                int l = class30_sub2_sub1_sub2_1.anInt1452 * class30_sub2_sub1_sub2_1.anInt1453 - 1;
                int k1 = class30_sub2_sub1_sub2_1.anInt1452 * anInt945 * 2;
                byte abyte1[] = class30_sub2_sub1_sub2_1.aByteArray1450;
                byte abyte4[] = aByteArray912;
                for(int j2 = 0; j2 <= l; j2++)
                    abyte4[j2] = abyte1[j2 - k1 & l];

                class30_sub2_sub1_sub2_1.aByteArray1450 = abyte4;
                aByteArray912 = abyte1;
                Rasterizer.method370(40, -477);
            }
            if(Rasterizer.anIntArray1480[34] >= j)
            {
                Background class30_sub2_sub1_sub2_2 = Rasterizer.aBackgroundArray1474[34];
                int i1 = class30_sub2_sub1_sub2_2.anInt1452 * class30_sub2_sub1_sub2_2.anInt1453 - 1;
                int l1 = class30_sub2_sub1_sub2_2.anInt1452 * anInt945 * 2;
                byte abyte2[] = class30_sub2_sub1_sub2_2.aByteArray1450;
                byte abyte5[] = aByteArray912;
                for(int k2 = 0; k2 <= i1; k2++)
                    abyte5[k2] = abyte2[k2 - l1 & i1];

                class30_sub2_sub1_sub2_2.aByteArray1450 = abyte5;
                aByteArray912 = abyte2;
                Rasterizer.method370(34, -477);
            }
        }
    }

    public final void method38(byte byte0)
    {
        if(byte0 != -92)
            stream.writeByte(214);
        for(int i = -1; i < anInt891; i++)
        {
            int j;
            if(i == -1)
                j = anInt889;
            else
                j = anIntArray892[i];
            Player player = aPlayerArray890[j];
            if(player != null && ((Class30_Sub2_Sub4_Sub1) (player)).textCycle > 0)
            {
                player.textCycle--;
                if(((Class30_Sub2_Sub4_Sub1) (player)).textCycle == 0)
                    player.aString1506 = null;
            }
        }

        for(int k = 0; k < npcCount; k++)
        {
            int l = npcIndices[k];
            Npc npc = npcs[l];
            if(npc != null && ((Class30_Sub2_Sub4_Sub1) (npc)).textCycle > 0)
            {
                npc.textCycle--;
                if(((Class30_Sub2_Sub4_Sub1) (npc)).textCycle == 0)
                    npc.aString1506 = null;
            }
        }

    }

    public final void method39(byte byte0)
    {
        int i = anInt1098 * 128 + 64;
        int j = anInt1099 * 128 + 64;
        int k = method42(anInt918, j, true, i) - anInt1100;
        if(xCameraPos < i)
        {
            xCameraPos += anInt1101 + ((i - xCameraPos) * anInt1102) / 1000;
            if(xCameraPos > i)
                xCameraPos = i;
        }
        if(xCameraPos > i)
        {
            xCameraPos -= anInt1101 + ((xCameraPos - i) * anInt1102) / 1000;
            if(xCameraPos < i)
                xCameraPos = i;
        }
        if(zCameraPos < k)
        {
            zCameraPos += anInt1101 + ((k - zCameraPos) * anInt1102) / 1000;
            if(zCameraPos > k)
                zCameraPos = k;
        }
        if(zCameraPos > k)
        {
            zCameraPos -= anInt1101 + ((zCameraPos - k) * anInt1102) / 1000;
            if(zCameraPos < k)
                zCameraPos = k;
        }
        if(yCameraPos < j)
        {
            yCameraPos += anInt1101 + ((j - yCameraPos) * anInt1102) / 1000;
            if(yCameraPos > j)
                yCameraPos = j;
        }
        if(yCameraPos > j)
        {
            yCameraPos -= anInt1101 + ((yCameraPos - j) * anInt1102) / 1000;
            if(yCameraPos < j)
                yCameraPos = j;
        }
        i = anInt995 * 128 + 64;
        j = anInt996 * 128 + 64;
        k = method42(anInt918, j, true, i) - anInt997;
        int l = i - xCameraPos;
        int i1 = k - zCameraPos;
        int j1 = j - yCameraPos;
        int k1 = (int)Math.sqrt(l * l + j1 * j1);
        int l1 = (int)(Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
        if(byte0 == 5)
            byte0 = 0;
        else
            aBoolean919 = !aBoolean919;
        int i2 = (int)(Math.atan2(l, j1) * -325.94900000000001D) & 0x7ff;
        if(l1 < 128)
            l1 = 128;
        if(l1 > 383)
            l1 = 383;
        if(yCameraCurve < l1)
        {
            yCameraCurve += anInt998 + ((l1 - yCameraCurve) * anInt999) / 1000;
            if(yCameraCurve > l1)
                yCameraCurve = l1;
        }
        if(yCameraCurve > l1)
        {
            yCameraCurve -= anInt998 + ((yCameraCurve - l1) * anInt999) / 1000;
            if(yCameraCurve < l1)
                yCameraCurve = l1;
        }
        int j2 = i2 - xCameraCurve;
        if(j2 > 1024)
            j2 -= 2048;
        if(j2 < -1024)
            j2 += 2048;
        if(j2 > 0)
        {
            xCameraCurve += anInt998 + (j2 * anInt999) / 1000;
            xCameraCurve &= 0x7ff;
        }
        if(j2 < 0)
        {
            xCameraCurve -= anInt998 + (-j2 * anInt999) / 1000;
            xCameraCurve &= 0x7ff;
        }
        int k2 = i2 - xCameraCurve;
        if(k2 > 1024)
            k2 -= 2048;
        if(k2 < -1024)
            k2 += 2048;
        if(k2 < 0 && j2 > 0 || k2 > 0 && j2 < 0)
            xCameraCurve = i2;
    }

    public final void drawMenu(int x, int y)
    {
        int xPos = anInt949- (x);
        int yPos = -y + anInt950;
        int k = anInt951;
        int l = anInt952 + 1;
       // needDrawTabArea = true;
        inputTaken = true;
        tabAreaAltered = true;
        int i1 = 0x5d5447;
        DrawingArea.drawPixels(l, yPos, xPos, i1, k);
        DrawingArea.drawPixels(16, yPos + 1, xPos + 1, 0, k - 2);
        DrawingArea.fillPixels(xPos + 1, k - 2, l - 19, 0, yPos + 18, true);
        boldText.method385(i1, "Choose Option", yPos + 14, 822, xPos + 3);
        int j1 = super.mouseX - x;
        int k1 = -y + super.mouseY;
        for(int l1 = 0; l1 < menuActionRow; l1++)
        {
            int i2 = yPos + 31 + (menuActionRow - 1 - l1) * 15;
            int j2 = 0xffffff;
            if(j1 > xPos && j1 < xPos + k && k1 > i2 - 13 && k1 < i2 + 3)
                j2 = 0xffff00;
            boldText.method389(false, true, xPos + 3, j2, menuActionName[l1], i2);
        }

    }

    public final void method41(byte byte0, long l)
    {
        try
        {
            if(l == 0L)
                return;
            if(anInt899 >= 100 && anInt1046 != 1)
            {
                pushMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
                return;
            }
            if(anInt899 >= 200)
            {
                pushMessage("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
                return;
            }
            String s = TextClass.fixName(TextClass.nameForLong(l));
            for(int i = 0; i < anInt899; i++)
                if(aLongArray955[i] == l)
                {
                    pushMessage(s + " is already on your friend list", 0, "");
                    return;
                }

            if(byte0 != 68)
                packet = -1;
            for(int j = 0; j < anInt822; j++)
                if(aLongArray925[j] == l)
                {
                    pushMessage("Please remove " + s + " from your ignore list first", 0, "");
                    return;
                }

            if(s.equals(localPlayer.name))
            {
                return;
            } else
            {
                aStringArray1082[anInt899] = s;
                aLongArray955[anInt899] = l;
                anIntArray826[anInt899] = 0;
                anInt899++;
                tabAreaAltered = true;
                stream.createFrame(188);
                stream.method404(5, l);
                return;
            }
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("15283, " + byte0 + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public final int method42(int i, int j, boolean flag, int k)
    {
        aBoolean1157 &= flag;
        int l = k >> 7;
        int i1 = j >> 7;
        if(l < 0 || i1 < 0 || l > 103 || i1 > 103)
            return 0;
        int j1 = i;
        if(j1 < 3 && (aByteArrayArrayArray1258[1][l][i1] & 2) == 2)
            j1++;
        int k1 = k & 0x7f;
        int l1 = j & 0x7f;
        int i2 = anIntArrayArrayArray1214[j1][l][i1] * (128 - k1) + anIntArrayArrayArray1214[j1][l + 1][i1] * k1 >> 7;
        int j2 = anIntArrayArrayArray1214[j1][l][i1 + 1] * (128 - k1) + anIntArrayArrayArray1214[j1][l + 1][i1 + 1] * k1 >> 7;
        return i2 * (128 - l1) + j2 * l1 >> 7;
    }

    private static final String method43(int i, int j)
    {
        if(i != -33245)
            anInt846 = -65;
        if(j < 0x186a0)
            return String.valueOf(j);
        if(j < 0x989680)
            return j / 1000 + "K";
        else
            return j / 0xf4240 + "M";
    }

    public final void method44(boolean flag)
    {
        try
        {
            if(socketStream != null)
                socketStream.method267();
        }
        catch(Exception _ex) { }
        socketStream = null;
        if(!flag)
            return;
        aBoolean1157 = false;
        anInt833 = 0;
        method23(false);
        aClass25_946.method274(619);
        for(int i = 0; i < 4; i++)
            collisionMaps[i].method210();

        System.gc();
        method15(860);
        currentSong = -1;
        BroadcastManager.broadcasts = new Broadcast[1000];
        nextSong = -1;
        previousSong = 0;
        currentScreenMode(ScreenMode.FIXED);
    }

    public final void method45(int i)
    {
        if(i != 0)
            packet = -1;
        aBoolean1031 = true;
        for(int j = 0; j < 7; j++)
        {
            anIntArray1065[j] = -1;
            for(int k = 0; k < Class38.anInt655; k++)
            {
                if(Class38.aClass38Array656[k].aBoolean662 || Class38.aClass38Array656[k].anInt657 != j + (aBoolean1047 ? 0 : 7))
                    continue;
                anIntArray1065[j] = k;
                break;
            }

        }

    }

    private final void method46(int i, Stream stream, byte byte0)
    {
        if(byte0 != 2)
        {
            for(int j = 1; j > 0; j++);
        }
        while(stream.anInt1407 + 21 < i * 8)
        {
            int k = stream.readBits(14);
            if(k == 16383)
                break;
            if(npcs[k] == null)
                npcs[k] = new Npc();
            Npc npc = npcs[k];
            npcIndices[npcCount++] = k;
            npc.anInt1537 = loopCycle;
            int l = stream.readBits(5);
            if(l > 15)
                l -= 32;
            int i1 = stream.readBits(5);
            if(i1 > 15)
                i1 -= 32;
            int j1 = stream.readBits(1);
            int npcId = stream.readBits(14);
            npc.desc = Class5.method159(npcId);
            int k1 = stream.readBits(1);
            if(k1 == 1)
                anIntArray894[anInt893++] = k;
            npc.anInt1540 = npc.desc.aByte68;
            npc.anInt1504 = npc.desc.anInt79;
            npc.anInt1554 = npc.desc.anInt67;
            npc.anInt1555 = npc.desc.anInt58;
            npc.anInt1556 = npc.desc.anInt83;
            npc.anInt1557 = npc.desc.anInt55;
            npc.anInt1511 = npc.desc.anInt77;
            npc.method445(localPlayer.anIntArray1500[0] + i1, localPlayer.anIntArray1501[0] + l, j1 == 1, false);
        }
        stream.method420(true);
    }

    public final void method7(int i)
    {
        if(aBoolean1252 || aBoolean926 || aBoolean1176)
            return;
        loopCycle++;
        if(!aBoolean1157)
            method140(true);
        else
            method62(anInt1218);
        method57(false);
        if(i != anInt1058)
            aBoolean919 = !aBoolean919;
    }

    public final void method47(int i, boolean flag)
    {
        if(((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 >> 7 == anInt1261 && ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 >> 7 == anInt1262)
            anInt1261 = 0;
        int j = anInt891;
        if(i != 0)
        {
            for(int k = 1; k > 0; k++);
        }
        if(flag)
            j = 1;
        for(int l = 0; l < j; l++)
        {
            Player player;
            long i1;
            if(flag)
            {
                player = localPlayer;
                i1 = (long) anInt889 << 32;
            } else
            {
                player = aPlayerArray890[anIntArray892[l]];
                i1 = (long) anIntArray892[l] << 32;
            }
            if(player == null || !player.method449(aBoolean1224))
                continue;
            player.aBoolean1699 = false;
            if((lowMemory && anInt891 > 50 || anInt891 > 200) && !flag && ((Class30_Sub2_Sub4_Sub1) (player)).anInt1517 == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1511)
                player.aBoolean1699 = true;
            int j1 = ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 >> 7;
            int k1 = ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 >> 7;
            if(j1 < 0 || j1 >= 104 || k1 < 0 || k1 >= 104)
                continue;
            if(player.aClass30_Sub2_Sub4_Sub6_1714 != null && loopCycle >= player.anInt1707 && loopCycle < player.anInt1708)
            {
                player.aBoolean1699 = false;
                player.anInt1709 = method42(anInt918, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550);
                aClass25_946.method286(60, anInt918, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, player, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1552, player.anInt1722, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550, player.anInt1709, player.anInt1719, player.anInt1721, i1, player.anInt1720, (byte)35);
                continue;
            }
            if((((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 & 0x7f) == 64 && (((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 & 0x7f) == 64)
            {
                if(anIntArrayArray929[j1][k1] == anInt1265)
                    continue;
                anIntArrayArray929[j1][k1] = anInt1265;
            }
            player.anInt1709 = method42(anInt918, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550);
            aClass25_946.method285(anInt918, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1552, (byte)6, player.anInt1709, i1, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, 60, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550, player, ((Class30_Sub2_Sub4_Sub1) (player)).aBoolean1541);
        }

    }

    public final boolean method48(int i, Widget class9)
    {
        if(i <= 0)
            packet = -1;
        int j = class9.contentType;
        if(anInt900 == 2)
        {
            if(j == 201)
            {
                inputTaken = true;
                inputDialogState = 0;
                messagePromptRaised = true;
                promptInput = "";
                friendsListAction = 1;
                aString1121 = "Enter name of friend to add to list";
            }
            if(j == 202)
            {
                inputTaken = true;
                inputDialogState = 0;
                messagePromptRaised = true;
                promptInput = "";
                friendsListAction = 2;
                aString1121 = "Enter name of friend to delete from list";
            }
        }
        if(j == 205)
        {
            anInt1011 = 250;
            return true;
        }
        if(j == 501)
        {
            inputTaken = true;
            inputDialogState = 0;
            messagePromptRaised = true;
            promptInput = "";
            friendsListAction = 4;
            aString1121 = "Enter name of player to add to list";
        }
        if(j == 502)
        {
            inputTaken = true;
            inputDialogState = 0;
            messagePromptRaised = true;
            promptInput = "";
            friendsListAction = 5;
            aString1121 = "Enter name of player to delete from list";
        }
        if (j == 550) {
            inputTaken = true;
            inputDialogState = 0;
            messagePromptRaised = true;
            promptInput = "";
            friendsListAction = 6;
            aString1121 = "Enter the name of the chat you wish to join";
        }
        if(j >= 300 && j <= 313)
        {
            int k = (j - 300) / 2;
            int j1 = j & 1;
            int i2 = anIntArray1065[k];
            if(i2 != -1)
            {
                do
                {
                    if(j1 == 0 && --i2 < 0)
                        i2 = Class38.anInt655 - 1;
                    if(j1 == 1 && ++i2 >= Class38.anInt655)
                        i2 = 0;
                } while(Class38.aClass38Array656[i2].aBoolean662 || Class38.aClass38Array656[i2].anInt657 != k + (aBoolean1047 ? 0 : 7));
                anIntArray1065[k] = i2;
                aBoolean1031 = true;
            }
        }
        if(j >= 314 && j <= 323)
        {
            int l = (j - 314) / 2;
            int k1 = j & 1;
            int j2 = anIntArray990[l];
            if(k1 == 0 && --j2 < 0)
                j2 = anIntArrayArray1003[l].length - 1;
            if(k1 == 1 && ++j2 >= anIntArrayArray1003[l].length)
                j2 = 0;
            anIntArray990[l] = j2;
            aBoolean1031 = true;
        }
        if(j == 324 && !aBoolean1047)
        {
            aBoolean1047 = true;
            method45(0);
        }
        if(j == 325 && aBoolean1047)
        {
            aBoolean1047 = false;
            method45(0);
        }
        if(j == 326)
        {
            stream.createFrame(101);
            stream.writeByte(aBoolean1047 ? 0 : 1);
            for(int i1 = 0; i1 < 7; i1++)
                stream.writeByte(anIntArray1065[i1]);

            for(int l1 = 0; l1 < 5; l1++)
                stream.writeByte(anIntArray990[l1]);

            return true;
        }
        if(j == 620)
        {
            canMute = !canMute;
            if(rights >= 1)
            {
                if(canMute)
                {
                    class9.message = "Moderator option: Mute player for 48 hours: <ON>";
                } else
                {
                    class9.message = "Moderator option: Mute player for 48 hours: <OFF>";
                }
            }
        }
        if(j >= 601 && j <= 613)
        {
            clearTopInterfaces(537);
            if(reportAbuseInput.length() > 0)
            {
                stream.createFrame(218);
                stream.method404(5, TextClass.longForName(reportAbuseInput));
                stream.writeByte(j - 601);
                stream.writeByte(canMute ? 1 : 0);
            }
        }
        return false;
    }

    private final void method49(int i, byte byte0, Stream stream)
    {
        if(byte0 == 2)
            byte0 = 0;
        else
            return;
        for(int j = 0; j < anInt893; j++)
        {
            int k = anIntArray894[j];
            Player player = aPlayerArray890[k];
            int l = stream.readUnsignedByte();
            if((l & 0x40) != 0)
                l += stream.readUnsignedByte() << 8;
            method107(l, k, stream, aByte923, player);
        }

    }

    public final void method50(int i, int j, int k, int l, int i1, int j1)
    {
        long k1 = aClass25_946.method300(j1, l, i);
        if(j >= 0)
            return;
        if(k1 != 0)
        {
            int l1 = aClass25_946.method304(j1, l, i, k1);
            int k2 = l1 >> 6 & 3;
            int i3 = l1 & 0x1f;
            int k3 = k;
            if(k1 > 0)
                k3 = i1;
            int ai[] = minimapImage.myPixels;
            int k4 = 24624 + l * 4 + (103 - i) * 512 * 4;
            int i5 = ObjectKey.getObjectId(k1);
            Class46 class46_2 = Class46.forID(i5);
            if(class46_2.anInt758 != -1)
            {
                try {
                Background class30_sub2_sub1_sub2_2 = aBackgroundArray1060[class46_2.anInt758];
                if(class30_sub2_sub1_sub2_2 != null) {
                    int i6 = (class46_2.anInt744 * 4 - class30_sub2_sub1_sub2_2.anInt1452) / 2;
                    int j6 = (class46_2.anInt761 * 4 - class30_sub2_sub1_sub2_2.anInt1453) / 2;
                    class30_sub2_sub1_sub2_2.method361(48 + l * 4 + i6, 48 + (104 - i - class46_2.anInt761) * 4 + j6);
                }
                } catch(Exception e){
                        e.printStackTrace();
                    }
            } else
            {
                if(i3 == 0 || i3 == 2)
                    if(k2 == 0)
                    {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else
                    if(k2 == 1)
                    {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else
                    if(k2 == 2)
                    {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else
                    if(k2 == 3)
                    {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
                if(i3 == 3)
                    if(k2 == 0)
                        ai[k4] = k3;
                    else
                    if(k2 == 1)
                        ai[k4 + 3] = k3;
                    else
                    if(k2 == 2)
                        ai[k4 + 3 + 1536] = k3;
                    else
                    if(k2 == 3)
                        ai[k4 + 1536] = k3;
                if(i3 == 2)
                    if(k2 == 3)
                    {
                        ai[k4] = k3;
                        ai[k4 + 512] = k3;
                        ai[k4 + 1024] = k3;
                        ai[k4 + 1536] = k3;
                    } else
                    if(k2 == 0)
                    {
                        ai[k4] = k3;
                        ai[k4 + 1] = k3;
                        ai[k4 + 2] = k3;
                        ai[k4 + 3] = k3;
                    } else
                    if(k2 == 1)
                    {
                        ai[k4 + 3] = k3;
                        ai[k4 + 3 + 512] = k3;
                        ai[k4 + 3 + 1024] = k3;
                        ai[k4 + 3 + 1536] = k3;
                    } else
                    if(k2 == 2)
                    {
                        ai[k4 + 1536] = k3;
                        ai[k4 + 1536 + 1] = k3;
                        ai[k4 + 1536 + 2] = k3;
                        ai[k4 + 1536 + 3] = k3;
                    }
            }
        }
        k1 = aClass25_946.method302(j1, l, i);
        if(k1 != 0)
        {
            int i2 = aClass25_946.method304(j1, l, i, k1);
            int l2 = i2 >> 6 & 3;
            int j3 = i2 & 0x1f;
            int l3 = ObjectKey.getObjectId(k1);
            Class46 class46_1 = Class46.forID(l3);
            if(class46_1.anInt758 != -1)
            {
                try {
                Background class30_sub2_sub1_sub2_1 = aBackgroundArray1060[class46_1.anInt758];
                if(class30_sub2_sub1_sub2_1 != null)
                {
                    int j5 = (class46_1.anInt744 * 4 - class30_sub2_sub1_sub2_1.anInt1452) / 2;
                    int k5 = (class46_1.anInt761 * 4 - class30_sub2_sub1_sub2_1.anInt1453) / 2;
                    class30_sub2_sub1_sub2_1.method361(48 + l * 4 + j5, 48 + (104 - i - class46_1.anInt761) * 4 + k5);
                }
                } catch(Exception e){
                    e.printStackTrace();
                }
            } else
            if(j3 == 9)
            {
                int l4 = 0xeeeeee;
                if(k1 > 0)
                    l4 = 0xee0000;
                int ai1[] = minimapImage.myPixels;
                int l5 = 24624 + l * 4 + (103 - i) * 512 * 4;
                if(l2 == 0 || l2 == 2)
                {
                    ai1[l5 + 1536] = l4;
                    ai1[l5 + 1024 + 1] = l4;
                    ai1[l5 + 512 + 2] = l4;
                    ai1[l5 + 3] = l4;
                } else
                {
                    ai1[l5] = l4;
                    ai1[l5 + 512 + 1] = l4;
                    ai1[l5 + 1024 + 2] = l4;
                    ai1[l5 + 1536 + 3] = l4;
                }
            }
        }
        k1 = aClass25_946.method303(j1, l, i);
        if(k1 != 0) {
            int j2 = ObjectKey.getObjectId(k1);
            Class46 class46 = Class46.forID(j2);
            if (class46.anInt758 != -1) {
                try {
                    Background background = aBackgroundArray1060[class46.anInt758];
                    if (background != null) {
                        int i4 = (class46.anInt744 * 4 - background.anInt1452) / 2;
                        int j4 = (class46.anInt761 * 4 - background.anInt1453) / 2;
                        background.method361(48 + l * 4 + i4, 48 + (104 - i - class46.anInt761) * 4 + j4);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public final void loadTitleScreen(int i)
    {
        aBackground_966 = new Background(titleStreamLoader, "titlebox", 0);
        if(i <= 0)
            aBoolean1231 = !aBoolean1231;
        aBackground_967 = new Background(titleStreamLoader, "titlebutton", 0);
        aBackgroundArray1152 = new Background[12];
        int j = 0;
        try
        {
            j = Integer.parseInt(getParameter("fl_icon"));
        }
        catch(Exception _ex) { }
        if(j == 0)
        {
            for(int k = 0; k < 12; k++);
//               aClass30_Sub2_Sub1_Sub2Array1152[k] = new Class30_Sub2_Sub1_Sub2(aClass44_1053, "runes", k);

        } else
        {
            for(int l = 0; l < 12; l++);
//               aClass30_Sub2_Sub1_Sub2Array1152[l] = new Class30_Sub2_Sub1_Sub2(aClass44_1053, "runes", 12 + (l & 3));

        }
        aSprite_1201 = new Sprite(128, 265);
        aSprite_1202 = new Sprite(128, 265);
        for(int i1 = 0; i1 < 33920; i1++)
            aSprite_1201.myPixels[i1] = aRSImageProducer_1110.anIntArray315[i1];

        for(int j1 = 0; j1 < 33920; j1++)
            aSprite_1202.myPixels[j1] = aRSImageProducer_1111.anIntArray315[j1];

        anIntArray851 = new int[256];
        for(int k1 = 0; k1 < 64; k1++)
            anIntArray851[k1] = k1 * 0x40000;

        for(int l1 = 0; l1 < 64; l1++)
            anIntArray851[l1 + 64] = 0x660000 + 1024 * l1;

        for(int i2 = 0; i2 < 64; i2++)
            anIntArray851[i2 + 128] = 0x66600 + 4 * i2;

        for(int j2 = 0; j2 < 64; j2++)
            anIntArray851[j2 + 192] = 0x666666;

        anIntArray852 = new int[256];
        for(int k2 = 0; k2 < 64; k2++)
            anIntArray852[k2] = k2 * 1024;

        for(int l2 = 0; l2 < 64; l2++)
            anIntArray852[l2 + 64] = 65280 + 4 * l2;

        for(int i3 = 0; i3 < 64; i3++)
            anIntArray852[i3 + 128] = 65535 + 0x40000 * i3;

        for(int j3 = 0; j3 < 64; j3++)
            anIntArray852[j3 + 192] = 0x666666;

        anIntArray853 = new int[256];
        for(int k3 = 0; k3 < 64; k3++)
            anIntArray853[k3] = k3 * 4;

        for(int l3 = 0; l3 < 64; l3++)
            anIntArray853[l3 + 64] = 255 + 0x60000 * l3;

        for(int i4 = 0; i4 < 64; i4++)
            anIntArray853[i4 + 128] = 0x660066 + 1024 * i4;

        for(int j4 = 0; j4 < 64; j4++)
            anIntArray853[j4 + 192] = 0x666666;

        anIntArray850 = new int[256];
        anIntArray1190 = new int[32768];
        anIntArray1191 = new int[32768];
        method106(null, -135);
        anIntArray828 = new int[32768];
        anIntArray829 = new int[32768];
        method13(10, (byte)4, "Connecting To Fileserver");
        if(!aBoolean831)
        {
            aBoolean880 = true;
            aBoolean831 = true;
            method12(this, 2);
        }
    }

    public static final void method52(boolean flag)
    {
        Class25.aBoolean436 = false;
        Rasterizer.aBoolean1461 = false;
        lowMemory = false;
        ObjectManager.aBoolean151 = false;
        if(flag)
            aBoolean919 = !aBoolean919;
        Class46.aBoolean752 = false;
    }

    public static final void main(String args[])
    {
        try {
            anInt957 = 0;
            ondemand_offset = 0;
            method52(false);//highmem
            aBoolean959 = true;//members
            signlink.storeid = 32;
            signlink.startpriv(InetAddress.getLocalHost());
            instance = new client();
        currentScreenMode(ScreenMode.FIXED);
            //setserver("ghreborn.ddns.net", "59999");
            server = Configuration.SERVER_ADDRESS;
            System.out.println("Connecting to "+Configuration.SERVER_ADDRESS);
            instance.method1(currentGameHeight, currentGameWidth);
            RICH_PRESENCE.initialize();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
    public static void setserver(String s)
    {
        server = s;
    }
    public final void method53(int i)
    {
        if(i != -48877)
            return;
        if(lowMemory && anInt1023 == 2 && ObjectManager.anInt131 != anInt918)
        {
            aRSImageProducer_1165.initDrawingArea();
            regularText.method381(0, "Loading - please wait.", 23693, 151, 257);
            regularText.method381(0xffffff, "Loading - please wait.", 23693, 150, 256);
            aRSImageProducer_1165.method238(currentScreenMode == ScreenMode.FIXED ? 0 : 0, 23680, super.aGraphics12, currentScreenMode == ScreenMode.FIXED ? 0 : 0);
            anInt1023 = 1;
            aLong824 = System.currentTimeMillis();
        }
        if(anInt1023 == 1)
        {
            int j = method54((byte)-95);
            if(j != 0 && System.currentTimeMillis() - aLong824 > 0x57e40L)
            {
                signlink.reporterror(myUsername + " glcfb " + aLong1215 + "," + j + "," + lowMemory + "," + aClass14Array970[0] + "," + onDemandFetcher.method552() + "," + anInt918 + "," + currentRegionX + "," + currentRegionY);
                aLong824 = System.currentTimeMillis();
            }
        }
        if(anInt1023 == 2 && anInt918 != anInt985)
        {
            anInt985 = anInt918;
            method24(true, anInt918);
        }
    }

    public final int method54(byte byte0) {
        try {
        for(int i = 0; i < terrainData.length; i++) {
                if (terrainData[i] == null && terrainIndices[i] != -1)
                    return -1;
                System.out.println("FloorMap:" + terrainIndices[i]);
                if (mapData[i] == null && objectIndices[i] != -1)
                    return -2;
                System.out.println("ObjectMaps:" + objectIndices[i]);
        }

        boolean flag = true;
        if(byte0 != -95)
            return 0;
        for(int j = 0; j < terrainData.length; j++) {
            byte abyte0[] = mapData[j];
            if(abyte0 != null) {
                int k = (mapCoordinates[j] >> 8) * 64 - baseX;
                int l = (mapCoordinates[j] & 0xff) * 64 - baseY;
                if(aBoolean1159)
                {
                    k = 10;
                    l = 10;
                }
                flag &= ObjectManager.method189(k, abyte0, l, 6);
            }
        }
        if(!flag)
            return -3;
        if(aBoolean1080) {
            return -4;
        } else {
            anInt1023 = 2;
            ObjectManager.anInt131 = anInt918;
            method22(true);
            stream.createFrame(121);
            return 0;
        }
        } catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public final void method55(int i)
    {
        while(i >= 0)
            method6();
        for(Class30_Sub2_Sub4_Sub4 class30_sub2_sub4_sub4 = (Class30_Sub2_Sub4_Sub4)aClass19_1013.reverseGetFirst(); class30_sub2_sub4_sub4 != null; class30_sub2_sub4_sub4 = (Class30_Sub2_Sub4_Sub4)aClass19_1013.reverseGetNext(false))
            if(class30_sub2_sub4_sub4.anInt1597 != anInt918 || loopCycle > class30_sub2_sub4_sub4.anInt1572)
                class30_sub2_sub4_sub4.unlink();
            else
            if(loopCycle >= class30_sub2_sub4_sub4.anInt1571)
            {
                if(class30_sub2_sub4_sub4.anInt1590 > 0)
                {
                    Npc npc = npcs[class30_sub2_sub4_sub4.anInt1590 - 1];
                    if(npc != null && ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 >= 0 && ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 < 13312 && ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551 >= 0 && ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551 < 13312)
                        class30_sub2_sub4_sub4.method455(loopCycle, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551, method42(class30_sub2_sub4_sub4.anInt1597, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550) - class30_sub2_sub4_sub4.anInt1583, ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550, (byte)-83);
                }
                if(class30_sub2_sub4_sub4.anInt1590 < 0)
                {
                    int j = -class30_sub2_sub4_sub4.anInt1590 - 1;
                    Player player;
                    if(j == anInt884)
                        player = localPlayer;
                    else
                        player = aPlayerArray890[j];
                    if(player != null && ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 >= 0 && ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 < 13312 && ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 >= 0 && ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 < 13312)
                        class30_sub2_sub4_sub4.method455(loopCycle, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, method42(class30_sub2_sub4_sub4.anInt1597, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550) - class30_sub2_sub4_sub4.anInt1583, ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550, (byte)-83);
                }
                class30_sub2_sub4_sub4.method456(anInt945, anInt1020);
                aClass25_946.method285(anInt918, class30_sub2_sub4_sub4.anInt1595, (byte)6, (int)class30_sub2_sub4_sub4.aDouble1587, -1, (int)class30_sub2_sub4_sub4.aDouble1586, 60, (int)class30_sub2_sub4_sub4.aDouble1585, class30_sub2_sub4_sub4, false);
            }

    }

    public final AppletContext getAppletContext() {
        if(signlink.mainapp != null)
            return signlink.mainapp.getAppletContext();
        else
            return super.getAppletContext();
    }

    public final void method56(int i) {
        byte abyte0[] = titleStreamLoader.method571("title.dat");
        Sprite sprite = new Sprite(abyte0, this);
        aRSImageProducer_1110.initDrawingArea();
        sprite.method346(0, 0, -32357);
        aRSImageProducer_1111.initDrawingArea();
        sprite.method346(-637, 0, -32357);
        aRSImageProducer_1107.initDrawingArea();
        sprite.method346(-128, 0, -32357);
        aRSImageProducer_1108.initDrawingArea();
        sprite.method346(-202, -371, -32357);
        aRSImageProducer_1109.initDrawingArea();
        sprite.method346(-202, -171, -32357);
        aRSImageProducer_1112.initDrawingArea();
        sprite.method346(0, -265, -32357);
        aRSImageProducer_1113.initDrawingArea();
        sprite.method346(-562, -265, -32357);
        aRSImageProducer_1114.initDrawingArea();
        sprite.method346(-128, -171, -32357);
        aRSImageProducer_1115.initDrawingArea();
        sprite.method346(-562, -171, -32357);
        int ai[] = new int[sprite.myWidth];
        for(int j = 0; j < sprite.myHeight; j++)
        {
            for(int k = 0; k < sprite.myWidth; k++)
                ai[k] = sprite.myPixels[(sprite.myWidth - k - 1) + sprite.myWidth * j];

            for(int l = 0; l < sprite.myWidth; l++)
                sprite.myPixels[l + sprite.myWidth * j] = ai[l];
        }
        if(i != 0)
        {
            return;
        } else
        {
            sprite = null;
            Object obj = null;
            Object obj1 = null;
            System.gc();
            return;
        }
    }

    public final void method57(boolean flag)
    {
        if(flag)
            anInt883 = -72;
        do
        {
            OnDemandData onDemandData;
            do
            {
                onDemandData = onDemandFetcher.method561();
                if(onDemandData == null)
                    return;
                if(onDemandData.dataType == 0)
                {
                    Class30_Sub2_Sub4_Sub6.method460(onDemandData.buffer, onDemandData.ID);
                    if((onDemandFetcher.method559(onDemandData.ID, -203) & 0x62) != 0)
                    {
                        tabAreaAltered = true;
                        if(backDialogID != -1)
                            inputTaken = true;
                    }
                }
                if(onDemandData.dataType == 2 && onDemandData.ID == nextSong && onDemandData.buffer != null)
                    method21(songChanging, 0, onDemandData.buffer);
                if(onDemandData.dataType == 3 && anInt1023 == 1)
                {
                    for(int i = 0; i < terrainData.length; i++)
                    {
                        if(terrainIndices[i] == onDemandData.ID)
                        {
                            terrainData[i] = onDemandData.buffer;
                            if(onDemandData.buffer == null)
                                terrainIndices[i] = -1;
                            break;
                        }
                        if(objectIndices[i] != onDemandData.ID)
                            continue;
                        mapData[i] = onDemandData.buffer;
                        if(onDemandData.buffer == null)
                            objectIndices[i] = -1;
                        break;
                    }

                }
            } while(onDemandData.dataType != 93 || !onDemandFetcher.method564(onDemandData.ID, -520));
            ObjectManager.method173((byte)-107, new Stream(onDemandData.buffer, 891), onDemandFetcher);
        } while(true);
    }

    /*  public final void method58(int i)
      {
          char c = '\u0100';
          for(int j = 10; j < 117; j++)
          {
              int k = (int)(Math.random() * 100D);
              if(k < 50)
                  anIntArray828[j + (c - 2 << 7)] = 255;
          }

          if(i != 25106)
              method6();
          for(int l = 0; l < 100; l++)
          {
              int i1 = (int)(Math.random() * 124D) + 2;
              int k1 = (int)(Math.random() * 128D) + 128;
              int k2 = i1 + (k1 << 7);
              anIntArray828[k2] = 192;
          }

          for(int j1 = 1; j1 < c - 1; j1++)
          {
              for(int l1 = 1; l1 < 127; l1++)
              {
                  int l2 = l1 + (j1 << 7);
                  anIntArray829[l2] = (anIntArray828[l2 - 1] + anIntArray828[l2 + 1] + anIntArray828[l2 - 128] + anIntArray828[l2 + 128]) / 4;
              }

          }

          anInt1275 += 128;
          if(anInt1275 > anIntArray1190.length)
          {
              anInt1275 -= anIntArray1190.length;
              int i2 = (int)(Math.random() * 12D);
              method106(aClass30_Sub2_Sub1_Sub2Array1152[i2], -135);
          }
          for(int j2 = 1; j2 < c - 1; j2++)
          {
              for(int i3 = 1; i3 < 127; i3++)
              {
                  int k3 = i3 + (j2 << 7);
                  int i4 = anIntArray829[k3 + 128] - anIntArray1190[k3 + anInt1275 & anIntArray1190.length - 1] / 5;
                  if(i4 < 0)
                      i4 = 0;
                  anIntArray828[k3] = i4;
              }

          }

          for(int j3 = 0; j3 < c - 1; j3++)
              anIntArray969[j3] = anIntArray969[j3 + 1];

          anIntArray969[c - 1] = (int)(Math.sin((double)anInt1161 / 14D) * 16D + Math.sin((double)anInt1161 / 15D) * 14D + Math.sin((double)anInt1161 / 16D) * 12D);
          if(anInt1040 > 0)
              anInt1040 -= 4;
          if(anInt1041 > 0)
              anInt1041 -= 4;
          if(anInt1040 == 0 && anInt1041 == 0)
          {
              int l3 = (int)(Math.random() * 2000D);
              if(l3 == 0)
                  anInt1040 = 1024;
              if(l3 == 1)
                  anInt1041 = 1024;
          }
      }
  */
    public final boolean method59(byte abyte0[], byte byte0, int i)
    {
        if(byte0 != 116)
            throw new NullPointerException();
        if(abyte0 == null)
            return true;
        else
            return signlink.wavesave(abyte0, i);
    }

    public final void method60(int i, byte byte0)
    {
        Widget class9 = Widget.interfaceCache[i];
        for(int j = 0; j < class9.children.length; j++)
        {
            if(class9.children[j] == -1)
                break;
            Widget class9_1 = Widget.interfaceCache[class9.children[j]];
            if(class9_1.type == 1)
                method60(class9_1.id, (byte)6);
            class9_1.anInt246 = 0;
            class9_1.anInt208 = 0;
        }

        if(byte0 == 6)
            byte0 = 0;
    }

    public final void method61(int i)
    {
        if(anInt855 != 2)
            return;
        method128((anInt934 - baseX << 7) + anInt937, anInt936 * 2, anInt875, (anInt935 - baseY << 7) + anInt938);
        if(i >= 0)
            aBoolean1224 = !aBoolean1224;
        if(anInt963 > -1 && loopCycle % 20 < 10)
            aSpriteArray1095[2].drawSprite(anInt963 - 12, anInt964 - 28);
    }

    public final void method62(int i)
    {
        this.refreshFrameSize();
        if(anInt1104 > 1)
            anInt1104--;
        if(anInt1011 > 0)
            anInt1011--;
        for(int j = 0; j < 100; j++)
            if(!method145(true))
                break;

        if(!aBoolean1157)
            return;
        synchronized(aMouseDetection_879.syncObject)
        {
            if(aBoolean1205)
            {
                if(super.clickMode3 != 0 || aMouseDetection_879.coordsIndex >= 40)
                {
                    stream.createFrame(45);
                    stream.writeByte(0);
                    int j2 = stream.currentPosition;
                    int j3 = 0;
                    for(int j4 = 0; j4 < aMouseDetection_879.coordsIndex; j4++)
                    {
                        if(j2 - stream.currentPosition >= 240)
                            break;
                        j3++;
                        int l4 = aMouseDetection_879.coordsY[j4];
                        if(l4 < 0)
                            l4 = 0;
                        else
                        if(l4 > 502)
                            l4 = 502;
                        int k5 = aMouseDetection_879.coordsX[j4];
                        if(k5 < 0)
                            k5 = 0;
                        else
                        if(k5 > 764)
                            k5 = 764;
                        int i6 = l4 * 765 + k5;
                        if(aMouseDetection_879.coordsY[j4] == -1 && aMouseDetection_879.coordsX[j4] == -1)
                        {
                            k5 = -1;
                            l4 = -1;
                            i6 = 0x7ffff;
                        }
                        if(k5 == anInt1237 && l4 == anInt1238)
                        {
                            if(anInt1022 < 2047)
                                anInt1022++;
                        } else
                        {
                            int j6 = k5 - anInt1237;
                            anInt1237 = k5;
                            int k6 = l4 - anInt1238;
                            anInt1238 = l4;
                            if(anInt1022 < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31)
                            {
                                j6 += 32;
                                k6 += 32;
                                stream.writeWord((anInt1022 << 12) + (j6 << 6) + k6);
                                anInt1022 = 0;
                            } else
                            if(anInt1022 < 8)
                            {
                                stream.method401(0x800000 + (anInt1022 << 19) + i6);
                                anInt1022 = 0;
                            } else
                            {
                                stream.writeDWord(0xc0000000 + (anInt1022 << 19) + i6);
                                anInt1022 = 0;
                            }
                        }
                    }

                    stream.method407(stream.currentPosition - j2, (byte)0);
                    if(j3 >= aMouseDetection_879.coordsIndex)
                    {
                        aMouseDetection_879.coordsIndex = 0;
                    } else
                    {
                        aMouseDetection_879.coordsIndex -= j3;
                        for(int i5 = 0; i5 < aMouseDetection_879.coordsIndex; i5++)
                        {
                            aMouseDetection_879.coordsX[i5] = aMouseDetection_879.coordsX[i5 + j3];
                            aMouseDetection_879.coordsY[i5] = aMouseDetection_879.coordsY[i5 + j3];
                        }

                    }
                }
            } else
            {
                aMouseDetection_879.coordsIndex = 0;
            }
        }
        if(super.clickMode3 != 0)
        {
            long l = (super.aLong29 - aLong1220) / 50L;
            if(l > 4095L)
                l = 4095L;
            aLong1220 = super.aLong29;
            int k2 = super.saveClickY;
            if(k2 < 0)
                k2 = 0;
            else
            if(k2 > 502)
                k2 = 502;
            int k3 = super.saveClickX;
            if(k3 < 0)
                k3 = 0;
            else
            if(k3 > 764)
                k3 = 764;
            int k4 = k2 * 765 + k3;
            int j5 = 0;
            if(super.clickMode3 == 2)
                j5 = 1;
            int l5 = (int)l;
            stream.createFrame(241);
            stream.writeDWord((l5 << 20) + (j5 << 19) + k4);
        }
        if(anInt1016 > 0)
            anInt1016--;
        if(super.anIntArray30[1] == 1 || super.anIntArray30[2] == 1 || super.anIntArray30[3] == 1 || super.anIntArray30[4] == 1)
            aBoolean1017 = true;
        if(aBoolean1017 && anInt1016 <= 0)
        {
            anInt1016 = 20;
            aBoolean1017 = false;
            stream.createFrame(86);
            stream.writeWord(anInt1184);
            stream.method432(-431, anInt1185);
        }
        if(super.aBoolean17 && !aBoolean954)
        {
            aBoolean954 = true;
            stream.createFrame(3);
            stream.writeByte(1);
        }
        if(!super.aBoolean17 && aBoolean954)
        {
            aBoolean954 = false;
            stream.createFrame(3);
            stream.writeByte(0);
        }
        method53(-48877);
        method115((byte)8);
        method90(false);
        anInt1009++;
        if(anInt1009 > 750)
            method68(-670);
        method114((byte)-74);
        method95(-8066);
        method38((byte)-92);
        anInt945++;
        if(crossType != 0)
        {
            anInt916 += 20;
            if(anInt916 >= 400)
                crossType = 0;
        }
        if(anInt1246 != 0)
        {
            anInt1243++;
            if(anInt1243 >= 15)
            {
                if(anInt1246 == 2)
                    tabAreaAltered = true;
                if(anInt1246 == 3)
                    inputTaken = true;
                anInt1246 = 0;
            }
        }
        if(anInt1086 != 0)
        {
            anInt989++;
            if(super.mouseX > anInt1087 + 5 || super.mouseX < anInt1087 - 5 || super.mouseY > anInt1088 + 5 || super.mouseY < anInt1088 - 5)
                aBoolean1242 = true;
            if(super.anInt19 == 0)
            {
                if(anInt1086 == 2)
                    tabAreaAltered = true;
                if(anInt1086 == 3)
                    inputTaken = true;
                anInt1086 = 0;
                if(aBoolean1242 && anInt989 >= 10)
                {
                    anInt1067 = -1;
                    processRightClick(0);
                    if(anInt1067 == anInt1084 && anInt1066 != anInt1085)
                    {
                        Widget class9 = Widget.interfaceCache[anInt1084];
                        int j1 = 0;
                        if(anInt913 == 1 && class9.contentType == 206)
                            j1 = 1;
                        if(class9.inv[anInt1066] <= 0)
                            j1 = 0;
                        if(class9.dragDeletes)
                        {
                            int l2 = anInt1085;
                            int l3 = anInt1066;
                            class9.inv[l3] = class9.inv[l2];
                            class9.invStackSizes[l3] = class9.invStackSizes[l2];
                            class9.inv[l2] = -1;
                            class9.invStackSizes[l2] = 0;
                        } else
                        if(j1 == 1)
                        {
                            int i3 = anInt1085;
                            for(int i4 = anInt1066; i3 != i4;)
                                if(i3 > i4)
                                {
                                    class9.method204(i3, (byte)9, i3 - 1);
                                    i3--;
                                } else
                                if(i3 < i4)
                                {
                                    class9.method204(i3, (byte)9, i3 + 1);
                                    i3++;
                                }

                        } else
                        {
                            class9.method204(anInt1085, (byte)9, anInt1066);
                        }
                        stream.createFrame(214);
                        stream.method433(0, anInt1084);
                        stream.method424(j1, 0);
                        stream.method433(0, anInt1085);
                        stream.method431(true, anInt1066);
                    }
                } else
                if((anInt1253 == 1 || method17(9, menuActionRow - 1)) && menuActionRow > 2)
                    method116(true);
                else
                if(menuActionRow > 0)
                    method69(menuActionRow - 1, false);
                anInt1243 = 10;
                super.clickMode3 = 0;
            }
        }
        if(Class25.anInt470 != -1)
        {
            int k = Class25.anInt470;
            int k1 = Class25.anInt471;
            boolean flag = false;
            if (rights >= 2 && controlIsDown) {
                teleport(baseX + k, baseY + k1);
            } else {
                 flag = doWalkTo(0, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k1, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], true, k);
            }
            Class25.anInt470 = -1;
            if(flag)
            {
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 1;
                anInt916 = 0;
            }
        }
        if(super.clickMode3 == 1 && aString844 != null)
        {
            aString844 = null;
            inputTaken = true;
            super.clickMode3 = 0;
        }
        method20(4);
        method92(true);
        method78();
        processChatModeClick();
        if(super.anInt19 == 1 || super.clickMode3 == 1)
            anInt1213++;
        if(anInt1023 == 2)
            method108(3);
        if(anInt1023 == 2 && aBoolean1160)
            method39((byte)5);
        for(int i1 = 0; i1 < 5; i1++)
            anIntArray1030[i1]++;

        method73(732);
        super.anInt18++;
        if(super.anInt18 > IDLE_TIME)
        {
            anInt1011 = 250;
            super.anInt18 -= 500;
            stream.createFrame(202);
        }
        anInt988++;
        if(i >= 0)
            aClass19ArrayArrayArray827 = null;
        if(anInt988 > 500)
        {
            anInt988 = 0;
            int l1 = (int)(Math.random() * 8D);
            if((l1 & 1) == 1)
                anInt1278 += anInt1279;
            if((l1 & 2) == 2)
                anInt1131 += anInt1132;
            if((l1 & 4) == 4)
                anInt896 += anInt897;
        }
        if(anInt1278 < -50)
            anInt1279 = 2;
        if(anInt1278 > 50)
            anInt1279 = -2;
        if(anInt1131 < -55)
            anInt1132 = 2;
        if(anInt1131 > 55)
            anInt1132 = -2;
        if(anInt896 < -40)
            anInt897 = 1;
        if(anInt896 > 40)
            anInt897 = -1;
        anInt1254++;
        if(anInt1254 > 500)
        {
            anInt1254 = 0;
            int i2 = (int)(Math.random() * 8D);
            if((i2 & 1) == 1)
                anInt1209 += anInt1210;
            if((i2 & 2) == 2)
                anInt1170 += anInt1171;
        }
        if(anInt1209 < -60)
            anInt1210 = 2;
        if(anInt1209 > 60)
            anInt1210 = -2;
        if(anInt1170 < -20)
            anInt1171 = 1;
        if(anInt1170 > 10)
            anInt1171 = -1;
        anInt1010++;
        if(anInt1010 > 50)
            stream.createFrame(0);
        try
        {
            if(socketStream != null && stream.currentPosition > 0)
            {
                socketStream.queueBytes(stream.currentPosition, 0, stream.buffer, 0);
                stream.currentPosition = 0;
                anInt1010 = 0;
                return;
            }
        }
        catch(IOException _ex)
        {
            method68(-670);
            return;
        }
        catch(Exception exception)
        {
            method44(true);
        }
    }
    public void processChatModeClick() {
        final int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 503;
        if (super.mouseX >= 5 && super.mouseX <= 61 && super.mouseY >= yOffset + 482 && super.mouseY <= yOffset + 503) {
            cButtonHPos = 0;
            inputTaken = true;
        } else if (super.mouseX >= 71 && super.mouseX <= 127 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 1;
            inputTaken = true;
        } else if (super.mouseX >= 137 && super.mouseX <= 193 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 2;
            inputTaken = true;
        } else if (super.mouseX >= 203 && super.mouseX <= 259 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 3;
            inputTaken = true;
        } else if (super.mouseX >= 269 && super.mouseX <= 325 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 4;
            inputTaken = true;
        } else if (super.mouseX >= 335 && super.mouseX <= 391 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 5;
            inputTaken = true;
        } else if (super.mouseX >= 404 && super.mouseX <= 515 && super.mouseY >= yOffset + 482
                && super.mouseY <= yOffset + 503) {
            cButtonHPos = 6;
            inputTaken = true;
        } else {
            cButtonHPos = -1;
            inputTaken = true;
        }
        if (super.clickMode3 == 1) {
            if (super.saveClickX >= 5 && super.saveClickX <= 61 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 0) {
                        cButtonCPos = 0;
                        chatTypeView = 0;
                        inputTaken = true;
                        setChannel = 0;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 0;
                    chatTypeView = 0;
                    inputTaken = true;
                    setChannel = 0;
                }
            } else if (super.saveClickX >= 71 && super.saveClickX <= 127 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 1 && currentScreenMode != ScreenMode.FIXED) {
                        cButtonCPos = 1;
                        chatTypeView = 5;
                        inputTaken = true;
                        setChannel = 1;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 1;
                    chatTypeView = 5;
                    inputTaken = true;
                    setChannel = 1;
                }
            } else if (super.saveClickX >= 137 && super.saveClickX <= 193 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 2 && currentScreenMode != ScreenMode.FIXED) {
                        cButtonCPos = 2;
                        chatTypeView = 1;
                        inputTaken = true;
                        setChannel = 2;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 2;
                    chatTypeView = 1;
                    inputTaken = true;
                    setChannel = 2;
                }
            } else if (super.saveClickX >= 203 && super.saveClickX <= 259 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 3 && currentScreenMode != ScreenMode.FIXED) {
                        cButtonCPos = 3;
                        chatTypeView = 2;
                        inputTaken = true;
                        setChannel = 3;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 3;
                    chatTypeView = 2;
                    inputTaken = true;
                    setChannel = 3;
                }
            } else if (super.saveClickX >= 269 && super.saveClickX <= 325 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 4 && currentScreenMode != ScreenMode.FIXED) {
                        cButtonCPos = 4;
                        chatTypeView = 11;
                        inputTaken = true;
                        setChannel = 4;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 4;
                    chatTypeView = 11;
                    inputTaken = true;
                    setChannel = 4;
                }
            } else if (super.saveClickX >= 335 && super.saveClickX <= 391 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (currentScreenMode != ScreenMode.FIXED) {
                    if (setChannel != 5 && currentScreenMode != ScreenMode.FIXED) {
                        cButtonCPos = 5;
                        chatTypeView = 3;
                        inputTaken = true;
                        setChannel = 5;
                    } else {
                        showChatComponents = showChatComponents ? false : true;
                    }
                } else {
                    cButtonCPos = 5;
                    chatTypeView = 3;
                    inputTaken = true;
                    setChannel = 5;
                }
            } else if (super.saveClickX >= 404 && super.saveClickX <= 515 && super.saveClickY >= yOffset + 482
                    && super.saveClickY <= yOffset + 505) {
                if (openInterfaceID == -1) {
                    clearTopInterfaces(537);
                    reportAbuseInput = "";
                    canMute = false;
                    for (int i = 0; i < Widget.interfaceCache.length; i++) {
                        if (Widget.interfaceCache[i] == null || Widget.interfaceCache[i].contentType != 600) {
                            continue;
                        }
                        reportAbuseInterfaceID = openInterfaceID = Widget.interfaceCache[i].parentID;
                        break;
                    }
                } else {
                    pushMessage("Please close the interface you have open before using 'report abuse'", 0, "");
                }
            }
        }
    }
    private final void method63(int i)
    {
        Class30_Sub1 class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetFirst();
        while(i >= 0)
        {
            for(int j = 1; j > 0; j++);
        }
        for(; class30_sub1 != null; class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetNext(false))
            if(class30_sub1.anInt1294 == -1)
            {
                class30_sub1.anInt1302 = 0;
                method89(false, class30_sub1);
            } else
            {
                class30_sub1.unlink();
            }

    }

    public final void resetImageProducers(int i)
    {
        if(aRSImageProducer_1107 != null)
            return;
        super.aRSImageProducer_13 = null;
        aRSImageProducer_1166 = null;
        aRSImageProducer_1164 = null;
        aRSImageProducer_1163 = null;
        aRSImageProducer_1165 = null;
        aRSImageProducer_1125 = null;
        aRSImageProducer_1110 = new RSImageProducer(128, 265);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1111 = new RSImageProducer(128, 265);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1107 = new RSImageProducer(509, 171);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1108 = new RSImageProducer(360, 132);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1109 = new RSImageProducer(360, 200);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1112 = new RSImageProducer(202, 238);
        if(i < 0 || i > 0)
            aClass19ArrayArrayArray827 = null;
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1113 = new RSImageProducer(203, 238);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1114 = new RSImageProducer(74, 94);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1115 = new RSImageProducer(75, 94);
        DrawingArea.setAllPixelsToZero();
        if(titleStreamLoader != null)
        {
            method56(0);
            loadTitleScreen(215);
        }
        aBoolean1255 = true;
    }

    public final void method13(int i, byte byte0, String s)
    {
        anInt1079 = i;
        aString1049 = s;
        resetImageProducers(0);
        if(titleStreamLoader == null)
        {
            super.method13(i, (byte)4, s);
            return;
        }
        aRSImageProducer_1109.initDrawingArea();
        char c = '\u0168';
        char c1 = '\310';
        byte byte1 = 20;
        boldText.method381(0xffffff, "Godzhell Reborn is Loading...", 23693, c1 / 2 - 26 - byte1, c / 2);
        int j = c1 / 2 - 18 - byte1;
        DrawingArea.fillPixels(c / 2 - 152, 304/*width*/, 18/*height*/, 0xCCCCCC, j, true); //OUTLINE
        DrawingArea.fillPixels(c / 2 - 151, 302/*width*/, 16/*height*/, 0xA5A5A5, j + 1, true); //INLINE
        DrawingArea.drawPixels(14/*height*/, j + 2, c / 2 - 150, 0x707070, i * 3); //MAIN BAR
        DrawingArea.drawPixels(14/*height*/, j + 2, (c / 2 - 150) + i * 3, 0, 300 - i * 3);
        smallText.method381(0xffffff, s, 23693, (c1 / 2 - 5) - byte1, c / 2); //TEXT
        aRSImageProducer_1109.method238(171, 23680, super.aGraphics12, 202);
        if(byte0 != 4) {
            for(int k = 1; k > 0; k++);
        }
        if(aBoolean1255) {
            aBoolean1255 = false;
            if(!aBoolean831) {
                aRSImageProducer_1110.method238(0, 23680, super.aGraphics12, 0);
                aRSImageProducer_1111.method238(0, 23680, super.aGraphics12, 637);
            }
            // worldswitch.method361(0, 23680, 0);
            aRSImageProducer_1107.method238(0, 23680, super.aGraphics12, 128);
            aRSImageProducer_1108.method238(371, 23680, super.aGraphics12, 202);
            aRSImageProducer_1112.method238(265, 23680, super.aGraphics12, 0);
            aRSImageProducer_1113.method238(265, 23680, super.aGraphics12, 562);
            aRSImageProducer_1114.method238(171, 23680, super.aGraphics12, 128);
            aRSImageProducer_1115.method238(171, 23680, super.aGraphics12, 562);
        }
    }


    public final void method65(int i, int j, int k, int l, Widget class9, int i1, boolean flag,
                               int j1, int k1)
    {
        if(aBoolean972)
            anInt992 = 32;
        else
            anInt992 = 0;
        aBoolean972 = false;
        anInt1007 += k1;
        if(k >= i && k < i + 16 && l >= i1 && l < i1 + 16)
        {
            class9.scrollPosition -= anInt1213 * 4;
            if(flag)
            {
                tabAreaAltered = true;
                return;
            }
        } else
        if(k >= i && k < i + 16 && l >= (i1 + j) - 16 && l < i1 + j)
        {
            class9.scrollPosition += anInt1213 * 4;
            if(flag)
            {
                tabAreaAltered = true;
                return;
            }
        } else
        if(k >= i - anInt992 && k < i + 16 + anInt992 && l >= i1 + 16 && l < (i1 + j) - 16 && anInt1213 > 0)
        {
            int l1 = ((j - 32) * j) / j1;
            if(l1 < 8)
                l1 = 8;
            int i2 = l - i1 - 16 - l1 / 2;
            int j2 = j - 32 - l1;
            class9.scrollPosition = ((j1 - j) * i2) / j2;
            if(flag)
                tabAreaAltered = true;
            aBoolean972 = true;
        }
    }

    public final boolean method66(long i, int j, int k, int l)
    {
        int i1 = ObjectKey.getObjectId(i);
        int j1 = aClass25_946.method304(anInt918, k, j, i);
        if(l >= 0)
            throw new NullPointerException();
        if(j1 == -1)
            return false;
        int k1 = j1 & 0x1f;
        int l1 = j1 >> 6 & 3;
        if(k1 == 10 || k1 == 11 || k1 == 22)
        {
            Class46 class46 = Class46.forID(i1);
            int i2;
            int j2;
            if(l1 == 0 || l1 == 2)
            {
                i2 = class46.anInt744;
                j2 = class46.anInt761;
            } else
            {
                i2 = class46.anInt761;
                j2 = class46.anInt744;
            }
            int k2 = class46.anInt768;
            if(l1 != 0)
                k2 = (k2 << l1 & 0xf) + (k2 >> 4 - l1);
            doWalkTo(2, 0, j2, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], i2, k2, j, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, k);
        } else
        {
            doWalkTo(2, l1, 0, -11308, k1 + 1, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, j, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, k);
        }
        anInt914 = super.saveClickX;
        anInt915 = super.saveClickY;
        crossType = 2;
        anInt916 = 0;
        return true;
    }


    public final FileArchive method67(int i, String s, String s1, int j, byte byte0, int k) {
        byte abyte0[] = null;
        int l = 5;
        try {
            if (aClass14Array970[0] != null)
                abyte0 = aClass14Array970[0].method233(i);
        } catch (Exception _ex) {
        }
        if(Configuration.Enable_JagGrab) {
            if (abyte0 != null) {
                aCRC32_930.reset();
                aCRC32_930.update(abyte0);
                int i1 = (int) aCRC32_930.getValue();
                if (i1 != j)
                    abyte0 = null;
            }
        }
        if (abyte0 != null) {
            FileArchive fileArchive = new FileArchive(abyte0);
            return fileArchive;
        }
        int j1 = 0;
        while (abyte0 == null) {
            String s2 = "Unknown error";
            method13(k, (byte) 4, "Requesting " + s);
            Object obj = null;
            try {
                int k1 = 0;
                DataInputStream datainputstream = method132(s1 + j);
                byte abyte1[] = new byte[6];
                datainputstream.readFully(abyte1, 0, 6);
                Stream stream = new Stream(abyte1, 891);
                stream.currentPosition = 3;
                int i2 = stream.read3Bytes() + 6;
                int j2 = 6;
                abyte0 = new byte[i2];
                for (int k2 = 0; k2 < 6; k2++)
                    abyte0[k2] = abyte1[k2];

                while (j2 < i2) {
                    int l2 = i2 - j2;
                    if (l2 > 1000)
                        l2 = 1000;
                    int j3 = datainputstream.read(abyte0, j2, l2);
                    if (j3 < 0) {
                        s2 = "Length error: " + j2 + "/" + i2;
                        throw new IOException("EOF");
                    }
                    j2 += j3;
                    int k3 = (j2 * 100) / i2;
                    if (k3 != k1)
                        method13(k, (byte) 4, "Loading " + s + " - " + k3 + "%");
                    k1 = k3;
                }
                datainputstream.close();
                try {
                    if (aClass14Array970[0] != null)
                        aClass14Array970[0].method234(abyte0.length, abyte0, (byte) 2, i);
                } catch (Exception _ex) {
                    aClass14Array970[0] = null;
                }
                if(Configuration.Enable_JagGrab) {
                    if (abyte0 != null) {
                        aCRC32_930.reset();
                        aCRC32_930.update(abyte0);
                        int i3 = (int) aCRC32_930.getValue();
                        if (i3 != j) {
                            abyte0 = null;
                            j1++;
                            s2 = "Checksum error: " + i3;
                        }
                    }
                }
            } catch (IOException ioexception) {
                if (s2.equals("Unknown error"))
                    s2 = "Connection error";
                abyte0 = null;
            } catch (NullPointerException _ex) {
                s2 = "Null error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            } catch (ArrayIndexOutOfBoundsException _ex) {
                s2 = "Bounds error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            } catch (Exception _ex) {
                s2 = "Unexpected error";
                abyte0 = null;
                if (!signlink.reporterror)
                    return null;
            }
            if (abyte0 == null) {
                for (int l1 = l; l1 > 0; l1--) {
                    if (j1 >= 3) {
                        method13(k, (byte) 4, "Game updated - please reload page");
                        l1 = 10;
                    } else {
                        method13(k, (byte) 4, s2 + " - Retrying in " + l1);
                    }
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception _ex) {
                    }
                }

                l *= 2;
                if (l > 60)
                    l = 60;
                aBoolean872 = !aBoolean872;
            }
        }
        FileArchive fileArchive_1 = new FileArchive(abyte0);
        if (byte0 != -41)
            throw new NullPointerException();
        else
            return fileArchive_1;
    }

    public final void method68(int i)
    {
        if(anInt1011 > 0)
        {
            method44(true);
            return;
        }
        aRSImageProducer_1165.initDrawingArea();
        DrawingArea.fillPixels(2, 229, 39, 0xffffff, 2, true);
        DrawingArea.drawPixels(37, 3, 3, 0, 227);
        regularText.method381(0, "Connection lost", 23693, 19, 120);
        regularText.method381(0xffffff, "Connection lost", 23693, 18, 119);
        regularText.method381(0, "Ghreborn is attempting to reestablish", 23693, 34, 117);
        regularText.method381(0xffffff, "Ghreborn is attempting to reestablish", 23693, 34, 116);
        while(i >= 0)
            stream.writeByte(164);
        aRSImageProducer_1165.method238(currentScreenMode == ScreenMode.FIXED ? 4 : 0, 23680, super.aGraphics12, currentScreenMode == ScreenMode.FIXED ? 4 : 0);
        anInt1021 = 0;
        anInt1261 = 0;
        Class24 class24 = socketStream;
        aBoolean1157 = false;
        anInt1038 = 0;
        method84(myUsername, myPassword, true);
        if(!aBoolean1157)
            method44(true);
        try
        {
            class24.method267();
            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public final void method69(int i, boolean flag)
    {
        if(i < 0)
            return;
        if(inputDialogState != 0)
        {
            inputDialogState = 0;
            inputTaken = true;
        }
        int j = menuActionCmd2[i];
        int k = menuActionCmd3[i];
        int l = menuActionID[i];
        int i1 = (int) menuActionCmd1[i];
        long keyLong = menuActionCmd1[i];
        switch (k) {
            case 19166:
                if (currentScreenMode != ScreenMode.FIXED) {
                    currentScreenMode(ScreenMode.FIXED);
                } else {
                    pushMessage("You are already in that screen mode.", 0, "");
                }
                break;

            case 19167:
				/*if (currentScreenMode == ScreenMode.RESIZABLE) {
					setConfigButton(i, true);
					setConfigButton(23001, false);
					setConfigButton(23005, false);
					setGameMode(ScreenMode.FULLSCREEN);
					return;
				}*/
                if (currentScreenMode != ScreenMode.RESIZABLE) {

                    currentScreenMode(ScreenMode.RESIZABLE);
                } else {
                    pushMessage("You are already in that screen mode.", 0, "");
                }
                break;
        }
        if(l >= 2000)
            l -= 2000;

        if(l == 1150) { //face north
            anInt1184 = 140;
            anInt1185 = 0;
        }
        if (l == 700 && tabInterfaceIDs[10] != -1) {
            if (tabID == 10) {
                showTabComponents = !showTabComponents;
            } else {
                showTabComponents = true;
            }

            tabID = 10;
            tabAreaAltered = true;
        }
        if (l == 1003) {
            this.clanChatMode = 2;
            this.inputTaken = true;
        }

        if (l == 1002) {
            this.clanChatMode = 1;
            this.inputTaken = true;
        }

        if (l == 1001) {
            this.clanChatMode = 0;
            this.inputTaken = true;
        }

        if (l == 1000) {
            this.cButtonCPos = 4;
            this.chatTypeView = 11;
            this.inputTaken = true;
        }

        if (l == 999) {
            this.cButtonCPos = 0;
            this.chatTypeView = 0;
            this.inputTaken = true;
        }

        if (l == 998) {
            this.cButtonCPos = 1;
            this.chatTypeView = 5;
            this.inputTaken = true;
        }

        if (l == 997) {
            this.publicChatMode = 3;
            this.inputTaken = true;
        }

        if (l == 996) {
            this.publicChatMode = 2;
            this.inputTaken = true;
        }

        if (l == 995) {
            this.publicChatMode = 1;
            this.inputTaken = true;
        }

        if (l == 994) {
            this.publicChatMode = 0;
            this.inputTaken = true;
        }

        if (l == 993) {
            this.cButtonCPos = 2;
            this.chatTypeView = 1;
            this.inputTaken = true;
        }

        if (l == 992) {
            this.privateChatMode = 2;
            this.inputTaken = true;
        }

        if (l == 991) {
            this.privateChatMode = 1;
            this.inputTaken = true;
        }

        if (l == 990) {
            this.privateChatMode = 0;
            this.inputTaken = true;
        }

        if (l == 989) {
            this.cButtonCPos = 3;
            this.chatTypeView = 2;
            this.inputTaken = true;
        }

        if (l == 987) {
            this.tradeMode = 2;
            this.inputTaken = true;
        }

        if (l == 986) {
            this.tradeMode = 1;
            this.inputTaken = true;
        }

        if (l == 985) {
            this.tradeMode = 0;
            this.inputTaken = true;
        }

        if (l == 984) {
            this.cButtonCPos = 5;
            this.chatTypeView = 3;
            this.inputTaken = true;
        }

        if (l == 980) {
            this.cButtonCPos = 6;
            this.chatTypeView = 4;
            this.inputTaken = true;
        }

        if(showpackets == 1)
        {
            System.out.println("packet: " + l);
            System.out.println("packet1: " + j);
        }
        if(l == 582)
        {
            Npc npc = npcs[i1];
            if(npc != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (npc)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (npc)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(57);
                stream.method432(-431, anInt1285);
                stream.method432(-431, i1);
                stream.method431(true, anInt1283);
                stream.method432(-431, anInt1284);
            }
        }
        if(l == 234)
        {
            boolean flag1 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag1)
                flag1 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(236);
            stream.method431(true, k + baseY);
            stream.writeWord(i1);
            stream.method431(true, j + baseX);
        }
        if(l == 62 && method66(keyLong, k, j, -770))
        {
            stream.createFrame(192);
            stream.writeWord(anInt1284);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
            stream.method433(0, k + baseY);
            stream.method431(true, anInt1283);
            stream.method433(0, j + baseX);
            stream.writeWord(anInt1285);
        }
        if(l == 511)
        {
            boolean flag2 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag2)
                flag2 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(25);
            stream.method431(true, anInt1284);
            stream.method432(-431, anInt1285);
            stream.writeWord(i1);
            stream.method432(-431, k + baseY);
            stream.method433(0, anInt1283);
            stream.writeWord(j + baseX);
        }
        if(l == 74)
        {
            stream.createFrame(122);
            stream.method433(0, k);
            stream.method432(-431, j);
            stream.method431(true, i1);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 315)
        {
            Widget class9 = Widget.interfaceCache[k];
            boolean flag8 = true;
            if(class9.contentType > 0)
                flag8 = method48(505, class9);
            if (flag8) {
                System.out.println("Action Botton : " + k);
                switch (k) {

                }
            }
            if(flag8)
            {
                stream.createFrame(185);
                stream.writeWord(k);
            }
        }
        if(l == 561)
        {
            Player player = aPlayerArray890[i1];
            if(player != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (player)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (player)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                anInt1188 += i1;
                if(anInt1188 >= 90)
                {
                    stream.createFrame(136);
                    anInt1188 = 0;
                }
                stream.createFrame(128);
                stream.writeWord(i1);
            }
        }
        if(l == 20)
        {
            Npc class30_sub2_sub4_sub1_sub1_1 = npcs[i1];
            if(class30_sub2_sub4_sub1_sub1_1 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(155);
                stream.method431(true, i1);
            }
        }
        if(l == 779)
        {
            Player class30_sub2_sub4_sub1_sub2_1 = aPlayerArray890[i1];
            if(class30_sub2_sub4_sub1_sub2_1 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(153);
                stream.method431(true, i1);
            }
        }
        if(l == 516)
            if(!menuOpen)
                aClass25_946.method312(false, super.saveClickY - 0, super.saveClickX - 0);
            else
                aClass25_946.method312(false, k - 0, j - 0);
        if(l == 1062)
        {
            anInt924 += baseX;
            if(anInt924 >= 113)
            {
                stream.createFrame(183);
                stream.method401(0xe63271);
                anInt924 = 0;
            }
            method66(keyLong, k, j, -770);
            stream.createFrame(228);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
            stream.method432(-431, k + baseY);
            stream.writeWord(j + baseX);
        }
        if(l == 679 && !aBoolean1149)
        {
            stream.createFrame(40);
            stream.writeWord(k);
            aBoolean1149 = true;
        }
        if(l == 431)
        {
            stream.createFrame(129);
            stream.method432(-431, j);
            stream.writeWord(k);
            stream.method432(-431, i1);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 337 || l == 42 || l == 792 || l == 322)
        {
            String s = menuActionName[i];
            int k1 = s.indexOf("@whi@");
            if(k1 != -1)
            {
                long l3 = TextClass.longForName(s.substring(k1 + 5).trim());
                if(l == 337)
                    method41((byte)68, l3);
                if(l == 42)
                    method113(l3, 4);
                if(l == 792)
                    method35(false, l3);
                if(l == 322)
                    method122(3, l3);
            }
        }
        if(l == 53)
        {
            stream.createFrame(135);
            stream.method431(true, j);
            stream.method432(-431, k);
            stream.method431(true, i1);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 539)
        {
            stream.createFrame(16);
            stream.method432(-431, i1);
            stream.method433(0, j);
            stream.method433(0, k);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if (l == 9111 || l == 9112 || l == 9115) {

            Broadcast bc = BroadcastManager.getCurrentBroadcast();

            if (bc == null) {
                System.err.println("No broadcast found for this msg..");
                return;
            }
            if (l == 9115) {
                BroadcastManager.removeIndex(bc.index);
                return;
            }
            stream.createFrame(199);
            stream.writeByte(bc.index);
            return;
        }
        if(l == 484 || l == 6)
        {
            String s1 = menuActionName[i];
            int l1 = s1.indexOf("@whi@");
            if(l1 != -1)
            {
                s1 = s1.substring(l1 + 5).trim();
                String s7 = TextClass.fixName(TextClass.nameForLong(TextClass.longForName(s1)));
                boolean flag9 = false;
                for(int j3 = 0; j3 < anInt891; j3++)
                {
                    Player player_7 = aPlayerArray890[anIntArray892[j3]];
                    if(player_7 == null || player_7.name == null || !player_7.name.equalsIgnoreCase(s7))
                        continue;
                    doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (player_7)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (player_7)).anIntArray1500[0]);
                    if(l == 484)
                    {
                        stream.createFrame(139);
                        stream.method431(true, anIntArray892[j3]);
                    }
                    if(l == 6)
                    {
                        anInt1188 += i1;
                        if(anInt1188 >= 90)
                        {
                            stream.createFrame(136);
                            anInt1188 = 0;
                        }
                        stream.createFrame(128);
                        stream.writeWord(anIntArray892[j3]);
                    }
                    flag9 = true;
                    break;
                }

                if(!flag9)
                    pushMessage("Unable to find " + s7, 0, "");
            }
        }
        if(l == 870)
        {
            stream.createFrame(53);
            stream.writeWord(j);
            stream.method432(-431, anInt1283);
            stream.method433(0, i1);
            stream.writeWord(anInt1284);
            stream.method431(true, anInt1285);
            stream.writeWord(k);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 847) // drop
        {
            System.out.println("Dropped Item: " + i1);
            stream.createFrame(87);
            stream.method432(-431, i1);
            stream.writeWord(k);
            stream.method432(-431, j);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 626)
        {
            Widget class9_1 = Widget.interfaceCache[k];
            anInt1136 = 1;
            anInt1137 = k;
            anInt1138 = class9_1.spellUsableOn;
            anInt1282 = 0;
            tabAreaAltered = true;
            String s4 = class9_1.selectedActionName;
            if(s4.indexOf(" ") != -1)
                s4 = s4.substring(0, s4.indexOf(" "));
            String s8 = class9_1.selectedActionName;
            if(s8.indexOf(" ") != -1)
                s8 = s8.substring(s8.indexOf(" ") + 1);
            aString1139 = s4 + " " + class9_1.spellName + " " + s8;
            if(anInt1138 == 16)
            {
                tabAreaAltered = true;
                tabID = 3;
                aBoolean1103 = true;
            }
            return;
        }
        if(l == 78)
        {
            stream.createFrame(117);
            stream.method433(0, k);
            stream.method433(0, i1);
            stream.method431(true, j);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 27)
        {
            Player class30_sub2_sub4_sub1_sub2_2 = aPlayerArray890[i1];
            if(class30_sub2_sub4_sub1_sub2_2 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_2)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_2)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                anInt986 += i1;
                if(anInt986 >= 54)
                {
                    stream.createFrame(189);
                    stream.writeByte(234);
                    anInt986 = 0;
                }
                stream.createFrame(73);
                stream.method431(true, i1);
            }
        }
        if(l == 213)
        {
            boolean flag3 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag3)
                flag3 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(79);
            stream.method431(true, k + baseY);
            stream.writeWord(i1);
            stream.method432(-431, j + baseX);
        }
        if(l == 632)
        {
            stream.createFrame(145);
            stream.method432(-431, k);
            stream.method432(-431, j);
            stream.method432(-431, i1);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 493)
        {
            stream.createFrame(75);
            stream.method433(0, k);
            stream.method431(true, j);
            stream.method432(-431, i1);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 652)
        {
            boolean flag4 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag4)
                flag4 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(156);
            stream.method432(-431, j + baseX);
            stream.method431(true, k + baseY);
            stream.method433(0, i1);
        }
        if(l == 94)
        {
            boolean flag5 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag5)
                flag5 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(181);
            stream.method431(true, k + baseY);
            stream.writeWord(i1);
            stream.method431(true, j + baseX);
            stream.method432(-431, anInt1137);
        }
        if (l == 647) {
            stream.createFrame(213);
            stream.writeWord(k);
            stream.writeWord(j);

            switch (k) {

                case 18304:
                    if (j == 0) {
                        inputTaken = true;
                        inputDialogState = 0;
                        messagePromptRaised = true;
                        promptInput = "";
                        friendsListAction = 8;
                        aString1121 = "Enter your clan chat title";
                    }
                    break;

                case 18144:
                case 18145:
                case 18146:
                case 18147:
                case 18148:
                case 18149:
                case 18150:
                case 18151:
                case 18152:
                case 18153:
                case 18154:
                case 18155:
                case 18156:
                case 18157:
                case 18158:
                case 18159:
                case 18160:
                case 18161:
                case 18162:
                case 18163:
                case 18164:
                case 18165:
                case 18166:
                case 18167:
                case 18168:
                case 18169:
                case 18170:
                case 18171:
                case 18172:
                case 18173:
                case 18174:
                case 18175:
                case 18176:
                case 18177:
                case 18178:
                case 18179:
                case 18180:
                case 18181:
                case 18182:
                case 18183:
                case 18184:
                case 18185:
                case 18186:
                case 18187:
                case 18188:
                case 18189:
                case 18190:
                case 18191:
                case 18192:
                case 18193:
                case 18194:
                case 18195:
                case 18196:
                case 18197:
                case 18198:
                case 18199:
                case 18200:
                case 18201:
                case 18202:
                case 18203:
                case 18204:
                case 18205:
                case 18206:
                case 18207:
                case 18208:
                case 18209:
                case 18210:
                case 18211:
                case 18212:
                case 18213:
                case 18214:
                case 18215:
                case 18216:
                case 18217:
                case 18218:
                case 18219:
                case 18220:
                case 18221:
                case 18222:
                case 18223:
                case 18224:
                case 18225:
                case 18226:
                case 18227:
                case 18228:
                case 18229:
                case 18230:
                case 18231:
                case 18232:
                case 18233:
                case 18234:
                case 18235:
                case 18236:
                case 18237:
                case 18238:
                case 18239:
                case 18240:
                case 18241:
                case 18243:
                    String s = menuActionName[i];
                    int k1 = s.indexOf("@whi@Clan 1");
                    int k2 = s.indexOf("@whi@Clan 1");
                    if (k1 != -1 || k1 != 0) {
                        long l3 = TextClass.longForName(s.substring(k1 + 14).trim());
                        if (j == 3)
                            method41((byte) 68, l3);
                    }
                    if (k2 != -1 || k2 != 0) {
                        long l4 = TextClass.longForName(s.substring(k2 + 16).trim());
                        if (j == 4)
                            method113(l4, 4);
                    }
                    break;
            }
            stream.createFrame(213);
            stream.writeWord(k);
            stream.writeWord(j);
        }
        if(l == 646)
        {
            stream.createFrame(185);
            stream.writeWord(k);
            Widget class9_2 = Widget.interfaceCache[k];
            if(class9_2.valueIndexArray != null && class9_2.valueIndexArray[0][0] == 5)
            {
                int i2 = class9_2.valueIndexArray[0][1];
                if(variousSettings[i2] != class9_2.anIntArray212[0])
                {
                    variousSettings[i2] = class9_2.anIntArray212[0];
                    method33(false, i2);
                    tabAreaAltered = true;
                }
            }
            switch (k) {
                // clan chat
                case 18129:
                    if (Widget.interfaceCache[18135].message.toLowerCase().contains("join")) {
                        inputTaken = true;
                        inputDialogState = 0;
                        messagePromptRaised = true;
                        promptInput = "";
                        friendsListAction = 6;
                        aString1121 = "Enter the name of the chat you wish to join";
                    } else {
                        sendString(0, "");
                    }
                    break;
                case 18132:
                    openInterfaceID = 18300;
                    break;
                case 18526:
                    inputTaken = true;
                    inputDialogState = 0;
                    messagePromptRaised = true;
                    promptInput = "";
                    friendsListAction = 9;
                    aString1121 = "Enter a name to add";
                    break;
                case 18527:
                    inputTaken = true;
                    inputDialogState = 0;
                    messagePromptRaised = true;
                    promptInput = "";
                    friendsListAction = 10;
                    aString1121 = "Enter a name to add";
                    break;
            }
        }
        if(l == 225)
        {
            Npc class30_sub2_sub4_sub1_sub1_2 = npcs[i1];
            if(class30_sub2_sub4_sub1_sub1_2 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_2)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_2)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                anInt1226 += i1;
                System.out.println(i1);
                if(anInt1226 >= 85)
                {
                    stream.createFrame(230);
                    stream.writeByte(239);
                    anInt1226 = 0;
                }
                stream.createFrame(17);
                stream.method433(0, i1);
            }
        }
        if(l == 965)
        {
            Npc npc_3 = npcs[i1];
            if(npc_3 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (npc_3)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (npc_3)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                anInt1134++;
                if(anInt1134 >= 96)
                {
                    stream.createFrame(152);
                    stream.writeByte(88);
                    anInt1134 = 0;
                }
                stream.createFrame(21);
                stream.writeWord(i1);
            }
        }
        if(l == 413)
        {
            Npc class30_sub2_sub4_sub1_sub1_4 = npcs[i1];
            if(class30_sub2_sub4_sub1_sub1_4 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_4)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_4)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(131);
                stream.method433(0, i1);
                stream.method432(-431, anInt1137);
            }
        }
        if(l == 200)
            clearTopInterfaces(537);
        if(l == 1025)
        {
            Npc npc_5 = npcs[i1];
            if(npc_5 != null)
            {
                Class5 class5 = npc_5.desc;
                if(class5.anIntArray88 != null)
                    class5 = class5.method161();
                if(class5 != null)
                {
                    String s9;
                    if(class5.aByteArray89 != null)
                        s9 = new String(class5.aByteArray89);
                    else
                        s9 = "It's a " + class5.aString65 + ".";
                    pushMessage(s9, 0, "");
                }
            }
        }
        if(l == 900)
        {
            method66(keyLong, k, j, -770);
            stream.createFrame(252);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
            stream.method431(true, k + baseY);
            stream.method432(-431, j + baseX);
        }
        if(l == 412)
        {
            Npc npc_6 = npcs[i1];
            if(npc_6 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (npc_6)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (npc_6)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(72);
                stream.method432(-431, i1);
            }
        }
        if(l == 365)
        {
            Player player_3 = aPlayerArray890[i1];
            if(player_3 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (player_3)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (player_3)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(249);
                stream.method432(-431, i1);
                stream.method431(true, anInt1137);
            }
        }
        if(l == 729)
        {
            Player class30_sub2_sub4_sub1_sub2_4 = aPlayerArray890[i1];
            if(class30_sub2_sub4_sub1_sub2_4 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_4)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_4)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(39);
                stream.method431(true, i1);
            }
        }
        if(l == 577)
        {
            Player player_5 = aPlayerArray890[i1];
            if(player_5 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (player_5)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (player_5)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(139);
                stream.method431(true, i1);
            }
        }
        if(l == 956 && method66(keyLong, k, j, -770))
        {
            stream.createFrame(35);
            stream.method431(true, j + baseX);
            stream.method432(-431, anInt1137);
            stream.method432(-431, k + baseY);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
        }
        if(l == 567)
        {
            boolean flag6 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag6)
                flag6 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(23);
            stream.method431(true, k + baseY);
            stream.method431(true, i1);
            stream.method431(true, j + baseX);
        }
        if(l == 867)
        {
            if((i1 & 3) == 0)
                anInt1175++;
            if(anInt1175 >= 59)
            {
                stream.createFrame(200);
                stream.writeWord(25501);
                anInt1175 = 0;
            }
            stream.createFrame(43);
            stream.method431(true, k);
            stream.method432(-431, i1);
            stream.method432(-431, j);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 543)
        {
            stream.createFrame(237);
            stream.writeWord(j);
            stream.method432(-431, i1);
            stream.writeWord(k);
            stream.method432(-431, anInt1137);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 606)
        {
            String s2 = menuActionName[i];
            int j2 = s2.indexOf("@whi@");
            if(j2 != -1)
                if(openInterfaceID == -1)
                {
                    clearTopInterfaces(537);
                    reportAbuseInput = s2.substring(j2 + 5).trim();
                    canMute = false;
                    for(int i3 = 0; i3 < Widget.interfaceCache.length; i3++)
                    {
                        if(Widget.interfaceCache[i3] == null || Widget.interfaceCache[i3].contentType != 600)
                            continue;
                        reportAbuseInterfaceID = openInterfaceID = Widget.interfaceCache[i3].parentID;
                        break;
                    }

                } else
                {
                    pushMessage("Please close the interface you have open before using 'report abuse'", 0, "");
                }
        }
        if(l == 491)
        {
            Player player_6 = aPlayerArray890[i1];
            if(player_6 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (player_6)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (player_6)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                stream.createFrame(14);
                stream.method432(-431, anInt1284);
                stream.writeWord(i1);
                stream.writeWord(anInt1285);
                stream.method431(true, anInt1283);
            }
        }
        if(l == 639)
        {
            String s3 = menuActionName[i];
            int k2 = s3.indexOf("@whi@");
            if(k2 != -1)
            {
                long l4 = TextClass.longForName(s3.substring(k2 + 5).trim());
                int k3 = -1;
                for(int i4 = 0; i4 < anInt899; i4++)
                {
                    if(aLongArray955[i4] != l4)
                        continue;
                    k3 = i4;
                    break;
                }

                if(k3 != -1 && anIntArray826[k3] > 0)
                {
                    inputTaken = true;
                    inputDialogState = 0;
                    messagePromptRaised = true;
                    promptInput = "";
                    friendsListAction = 3;
                    aLong953 = aLongArray955[k3];
                    aString1121 = "Enter message to send to " + aStringArray1082[k3];
                }
            }
        }
        if(l == 454)
        {
            stream.createFrame(41);
            stream.writeWord(i1);
            stream.method432(-431, j);
            stream.method432(-431, k);
            anInt1243 = 0;
            anInt1244 = k;
            anInt1245 = j;
            anInt1246 = 2;
            if(Widget.interfaceCache[k].parentID == openInterfaceID)
                anInt1246 = 1;
            if(Widget.interfaceCache[k].parentID == backDialogID)
                anInt1246 = 3;
        }
        if(l == 478)
        {
            Npc npc_7 = npcs[i1];
            if(npc_7 != null)
            {
                doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, ((Class30_Sub2_Sub4_Sub1) (npc_7)).anIntArray1501[0], ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, ((Class30_Sub2_Sub4_Sub1) (npc_7)).anIntArray1500[0]);
                anInt914 = super.saveClickX;
                anInt915 = super.saveClickY;
                crossType = 2;
                anInt916 = 0;
                if((i1 & 3) == 0)
                    anInt1155++;
                if(anInt1155 >= 53)
                {
                    stream.createFrame(85);
                    stream.writeByte(66);
                    anInt1155 = 0;
                }
                stream.createFrame(18);
                stream.method431(true, i1);
            }
        }
        if(l == 113)
        {
            method66(keyLong, k, j, -770);
            stream.createFrame(70);
            stream.method431(true, j + baseX);
            stream.writeWord(k + baseY);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
        }
        if(l == 872)
        {
            method66(keyLong, k, j, -770);
            stream.createFrame(234);
            stream.method433(0, j + baseX);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
            stream.method433(0, k + baseY);
        }
        if(l == 502)
        {
            method66(keyLong, k, j, -770);
            stream.createFrame(132);
            stream.method433(0, j + baseX);
            stream.writeDWord(ObjectKey.getObjectId(keyLong));
            stream.method432(-431, k + baseY);
        }
        if(l == 1125)
        {
            Class8 class8 = Class8.method198(i1);
            Widget class9_4 = Widget.interfaceCache[k];
            String s5;
            if(class9_4 != null && class9_4.invStackSizes[j] >= 0x186a0)
                s5 = class9_4.invStackSizes[j] + " x " + class8.name;
            else
            if(class8.aByteArray178 != null)
                s5 = new String(class8.aByteArray178);
            else
                s5 = "It's a " + class8.name + ".";
            pushMessage(s5, 0, "");
        }
        if(l == 169)
        {
            stream.createFrame(185);
            stream.writeWord(k);
            Widget class9_3 = Widget.interfaceCache[k];
            if(class9_3.valueIndexArray != null && class9_3.valueIndexArray[0][0] == 5)
            {
                int l2 = class9_3.valueIndexArray[0][1];
                variousSettings[l2] = 1 - variousSettings[l2];
                method33(false, l2);
                tabAreaAltered = true;
            }
        }
        if(l == 447)
        {
            anInt1282 = 1;
            anInt1283 = j;
            anInt1284 = k;
            anInt1285 = i1;
            aString1286 = Class8.method198(i1).name;
            anInt1136 = 0;
            tabAreaAltered = true;
            return;
        }
        if(l == 1226)
        {
            int j1 = ObjectKey.getObjectId(keyLong);
            Class46 class46 = Class46.forID(j1);
            String s10;
            if(class46.aByteArray777 != null)
                s10 = new String(class46.aByteArray777);
            else
                s10 = "It's a " + class46.aString739 + ".";
            pushMessage(s10, 0, "");
        }
        if(l == 244)
        {
            boolean flag7 = doWalkTo(2, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            if(!flag7)
                flag7 = doWalkTo(2, 0, 1, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 1, 0, k, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], false, j);
            anInt914 = super.saveClickX;
            anInt915 = super.saveClickY;
            crossType = 2;
            anInt916 = 0;
            stream.createFrame(253);
            stream.method431(true, j + baseX);
            stream.method433(0, k + baseY);
            stream.method432(-431, i1);
        }
        if(l == 1448)
        {
            Class8 class8_1 = Class8.method198(i1);
            String s6;
            if(class8_1.aByteArray178 != null)
                s6 = new String(class8_1.aByteArray178);
            else
                s6 = "It's a " + class8_1.name + ".";
            pushMessage(s6, 0, "");
        }
        anInt1282 = 0;
        if(flag)
        {
            return;
        } else
        {
            anInt1136 = 0;
            tabAreaAltered = true;
            return;
        }
    }

    public void sendString(int identifier, String text) {
        text = identifier + "," + text;
        stream.createFrame(127);
        stream.writeByte(text.length() + 1);
        stream.writeString(text);
    }

    public final void method70(int i)
    {
        anInt1251 = 0;
        int j = (((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 >> 7) + baseX;
        int k = (((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 >> 7) + baseY;
        i = 58 / i;
        if(j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136)
            anInt1251 = 1;
        if(j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535)
            anInt1251 = 1;
        if(anInt1251 == 1 && j >= 3139 && j <= 3199 && k >= 3008 && k <= 3062)
            anInt1251 = 0;
    }

    public final void run()
    {
        if(aBoolean880)
        {
            method136((byte)59);
            return;
        } else
        {
            super.run();
            return;
        }
    }

    public final void build3dScreenMenu(int i)
    {
        if(anInt1282 == 0 && anInt1136 == 0)
        {
            menuActionName[menuActionRow] = "Walk Here";
            menuActionID[menuActionRow] = 516;
            menuActionCmd2[menuActionRow] = super.mouseX;
            menuActionCmd3[menuActionRow] = super.mouseY;
            menuActionRow++;
        }
        long j = -1;
        for(int k = 0; k < Class30_Sub2_Sub4_Sub6.anInt1687; k++)
        {
            Long l = Class30_Sub2_Sub4_Sub6.anIntArray1688[k];
            int i1 = ObjectKey.getObjectX(l);
            int j1 = ObjectKey.getObjectY(l);
            int k1 = ObjectKey.getObjectOpcode(l);
            int l1 = ObjectKey.getObjectId(l);
            if(l == j)
                continue;
            j = l;
            if(k1 == 2 && aClass25_946.method304(anInt918, i1, j1, l) >= 0)
            {
                Class46 class46 = Class46.forID(l1);
                if(class46.childrenIDs != null)
                    class46 = class46.method580(true);
                if(class46 == null)
                    continue;
                if(anInt1282 == 1)
                {
                    menuActionName[menuActionRow] = "Use " + aString1286 + " with @cya@" + class46.aString739;
                    menuActionID[menuActionRow] = 62;
                    menuActionCmd1[menuActionRow] = l;
                    menuActionCmd2[menuActionRow] = i1;
                    menuActionCmd3[menuActionRow] = j1;
                    menuActionRow++;
                } else
                if(anInt1136 == 1)
                {
                    if((anInt1138 & 4) == 4)
                    {
                        menuActionName[menuActionRow] = aString1139 + " @cya@" + class46.aString739;
                        menuActionID[menuActionRow] = 956;
                        menuActionCmd1[menuActionRow] = l;
                        menuActionCmd2[menuActionRow] = i1;
                        menuActionCmd3[menuActionRow] = j1;
                        menuActionRow++;
                    }
                } else
                {
                    if(class46.aStringArray786 != null)
                    {
                        for(int i2 = 4; i2 >= 0; i2--)
                            if(class46.aStringArray786[i2] != null)
                            {
                                menuActionName[menuActionRow] = class46.aStringArray786[i2] + " @cya@" + class46.aString739;
                                if(i2 == 0)
                                    menuActionID[menuActionRow] = 502;
                                if(i2 == 1)
                                    menuActionID[menuActionRow] = 900;
                                if(i2 == 2)
                                    menuActionID[menuActionRow] = 113;
                                if(i2 == 3)
                                    menuActionID[menuActionRow] = 872;
                                if(i2 == 4)
                                    menuActionID[menuActionRow] = 1062;
                                menuActionCmd1[menuActionRow] = l;
                                menuActionCmd2[menuActionRow] = i1;
                                menuActionCmd3[menuActionRow] = j1;
                                menuActionRow++;
                            }

                    }
                    if(rights >= 2)
                        menuActionName[menuActionRow] = "Examine @cya@"+class46.aString739+"@blu@(@whi@Object Id: "+class46.type +"@blu@)(@whi@Model id: "+class46.anIntArray773[0]+"@blu@)(@whi@VarBit: "+class46.anInt749+"@blu@)";
                    if(rights <= 1)
                        menuActionName[menuActionRow] = "Examine @cya@"+class46.aString739+"@blu@(@whi@"+class46.type +"@blu@)";
                    menuActionID[menuActionRow] = 1226;
                    menuActionCmd1[menuActionRow] = l;
                    menuActionCmd2[menuActionRow] = i1;
                    menuActionCmd3[menuActionRow] = j1;
                    menuActionRow++;
                }
            }
            if(k1 == 1)
            {
                Npc npc = npcs[l1];
                if(npc.desc.aByte68 == 1 && (((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 & 0x7f) == 64 && (((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551 & 0x7f) == 64)
                {
                    for(int j2 = 0; j2 < npcCount; j2++)
                    {
                        Npc class30_sub2_sub4_sub1_sub1_1 = npcs[npcIndices[j2]];
                        if(class30_sub2_sub4_sub1_sub1_1 != null && class30_sub2_sub4_sub1_sub1_1 != npc && class30_sub2_sub4_sub1_sub1_1.desc.aByte68 == 1 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anInt1550 == ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anInt1551 == ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551)
                            method87(class30_sub2_sub4_sub1_sub1_1.desc, npcIndices[j2], false, j1, i1);
                    }

                    for(int l2 = 0; l2 < anInt891; l2++)
                    {
                        Player class30_sub2_sub4_sub1_sub2_1 = aPlayerArray890[anIntArray892[l2]];
                        if(class30_sub2_sub4_sub1_sub2_1 != null && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anInt1550 == ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anInt1551 == ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551)
                            method88(i1, anIntArray892[l2], class30_sub2_sub4_sub1_sub2_1, false, j1);
                    }

                }
                method87(npc.desc, l1, false, j1, i1);
            }
            if(k1 == 0)
            {
                Player player = aPlayerArray890[l1];
                if((((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 & 0x7f) == 64 && (((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 & 0x7f) == 64)
                {
                    for(int k2 = 0; k2 < npcCount; k2++)
                    {
                        Npc class30_sub2_sub4_sub1_sub1_2 = npcs[npcIndices[k2]];
                        if(class30_sub2_sub4_sub1_sub1_2 != null && class30_sub2_sub4_sub1_sub1_2.desc.aByte68 == 1 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_2)).anInt1550 == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_2)).anInt1551 == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551)
                            method87(class30_sub2_sub4_sub1_sub1_2.desc, npcIndices[k2], false, j1, i1);
                    }

                    for(int i3 = 0; i3 < anInt891; i3++)
                    {
                        Player class30_sub2_sub4_sub1_sub2_2 = aPlayerArray890[anIntArray892[i3]];
                        if(class30_sub2_sub4_sub1_sub2_2 != null && class30_sub2_sub4_sub1_sub2_2 != player && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_2)).anInt1550 == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 && ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_2)).anInt1551 == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551)
                            method88(i1, anIntArray892[i3], class30_sub2_sub4_sub1_sub2_2, false, j1);
                    }

                }
                method88(i1, l1, player, false, j1);
            }
            if(k1 == 3)
            {
                Class19 class19 = aClass19ArrayArrayArray827[anInt918][i1][j1];
                if(class19 != null)
                {
                    for(Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.method253(5); class30_sub2_sub4_sub2 != null; class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.method255(8))
                    {
                        Class8 class8 = Class8.method198(class30_sub2_sub4_sub2.anInt1558);
                        if(anInt1282 == 1)
                        {
                            menuActionName[menuActionRow] = "Use " + aString1286 + " with @lre@" + class8.name;
                            menuActionID[menuActionRow] = 511;
                            menuActionCmd1[menuActionRow] = class30_sub2_sub4_sub2.anInt1558;
                            menuActionCmd2[menuActionRow] = i1;
                            menuActionCmd3[menuActionRow] = j1;
                            menuActionRow++;
                        } else
                        if(anInt1136 == 1)
                        {
                            if((anInt1138 & 1) == 1)
                            {
                                menuActionName[menuActionRow] = aString1139 + " @lre@" + class8.name;
                                menuActionID[menuActionRow] = 94;
                                menuActionCmd1[menuActionRow] = class30_sub2_sub4_sub2.anInt1558;
                                menuActionCmd2[menuActionRow] = i1;
                                menuActionCmd3[menuActionRow] = j1;
                                menuActionRow++;
                            }
                        } else
                        {
                            for(int j3 = 4; j3 >= 0; j3--)
                                if(j3 == 2)
                                {
                                    menuActionName[menuActionRow] = "Take @lre@" + class8.name;
                                    menuActionID[menuActionRow] = 234;
                                    menuActionCmd1[menuActionRow] = class30_sub2_sub4_sub2.anInt1558;
                                    menuActionCmd2[menuActionRow] = i1;
                                    menuActionCmd3[menuActionRow] = j1;
                                    menuActionRow++;
                                }
                            if(rights >= 2)
                                menuActionName[menuActionRow] = "Examine @lre@"+class8.name +"@gre@(@whi@"+class8.anInt157+"@gre@)";
                            if(rights <= 1)
                                menuActionName[menuActionRow] = "Examine @lre@"+class8.name;
                            menuActionID[menuActionRow] = 1448;
                            menuActionCmd1[menuActionRow] = class30_sub2_sub4_sub2.anInt1558;
                            menuActionCmd2[menuActionRow] = i1;
                            menuActionCmd3[menuActionRow] = j1;
                            menuActionRow++;
                        }
                    }

                }
            }
        }

        if(i != 33660)
            packet = in.readUnsignedByte();
    }
    public final void method8(int i)
    {
        signlink.reporterror = false;
        try
        {
            if(socketStream != null)
                socketStream.method267();
        }
        catch(Exception _ex) { }
        socketStream = null;
        method15(860);
        if(aMouseDetection_879 != null)
            aMouseDetection_879.running = false;
        aMouseDetection_879 = null;
        onDemandFetcher.method553();
        onDemandFetcher = null;
        aStream_834 = null;
        stream = null;
        aStream_847 = null;
        in = null;
        mapCoordinates = null;
        terrainData = null;
        mapData = null;
        terrainIndices = null;
        objectIndices = null;
        anIntArrayArrayArray1214 = null;
        BlackMap = null;
        aByteArrayArrayArray1258 = null;
        aClass25_946 = null;
        collisionMaps = null;
        anIntArrayArray901 = null;
        anIntArrayArray825 = null;
        anIntArray1280 = null;
        anIntArray1281 = null;
        aByteArray912 = null;
        leftFrame = null;
        topFrame = null;
        aRSImageProducer_1163 = null;
        aRSImageProducer_1164 = null;
        aRSImageProducer_1165 = null;
        aRSImageProducer_1166 = null;
        aRSImageProducer_1125 = null;
        aSprite_1196 = null;
        aBackground_1197 = null;
        worldswitch = null;
        aSprite_1198 = null;
        Mapicon = null;
        aSprite_1027 = null;
        aSprite_1028 = null;
        aSprite_1029 = null;
        sideIcons = null;
        aSprite_1143 = null;
        aSprite_1144 = null;
        aBackground_1145 = null;
        aSprite_1146 = null;
        aSprite_1147 = null;
        aSprite_865 = null;
        aSprite_866 = null;
        aBackground_867 = null;
        aSprite_868 = null;
        aBackground_869 = null;
        compassImage = null;
        aSpriteArray987 = null;
        aSpriteArray1095 = null;
        this.skullIcons = null;
        aSpriteArray1150 = null;
        aSprite_1074 = null;
        aSprite_1075 = null;
        aSprite_1076 = null;
        aSprite_1077 = null;
        aSprite_1078 = null;
        aBackgroundArray1060 = null;
        aSpriteArray1033 = null;
        anIntArrayArray929 = null;
        aPlayerArray890 = null;
        anIntArray892 = null;
        anIntArray894 = null;
        aStreamArray895 = null;
        anIntArray840 = null;
        npcs = null;
        npcIndices = null;
        aClass19ArrayArrayArray827 = null;
        aClass19_1179 = null;
        i = 55 / i;
        aClass19_1013 = null;
        aClass19_1056 = null;
        menuActionCmd2 = null;
        menuActionCmd3 = null;
        menuActionID = null;
        menuActionCmd1 = null;
        menuActionName = null;
        variousSettings = null;
        anIntArray1072 = null;
        anIntArray1073 = null;
        aSpriteArray1140 = null;
        minimapImage = null;
        aStringArray1082 = null;
        aLongArray955 = null;
        anIntArray826 = null;
        aRSImageProducer_1110 = null;
        aRSImageProducer_1111 = null;
        aRSImageProducer_1107 = null;
        aRSImageProducer_1108 = null;
        aRSImageProducer_1109 = null;
        aRSImageProducer_1112 = null;
        aRSImageProducer_1113 = null;
        aRSImageProducer_1114 = null;
        aRSImageProducer_1115 = null;
        method118(3);
        Class46.method575(-501);
        Class5.method163(-501);
        Class8.method191(-501);
        Class22.aClass22Array388 = null;
        Class38.aClass38Array656 = null;
        Widget.interfaceCache = null;
        Class27.aClass27Array507 = null;
        Class20.aClass20Array351 = null;
        Class23.aClass23Array403 = null;
        Class23.aClass12_415 = null;
        Class41.aClass41Array701 = null;
        super.aRSImageProducer_13 = null;
        Player.aClass12_1704 = null;
        Rasterizer.method363(-501);
        Class25.method273(-501);
        Class30_Sub2_Sub4_Sub6.method458(-501);
        Class36.method530(-501);
        System.gc();
    }

    public void method72(byte byte0)
    {
        System.out.println("============");
        System.out.println("flame-cycle:" + anInt1208);
        if(onDemandFetcher != null)
            System.out.println("Od-cycle:" + onDemandFetcher.anInt1341);
        System.out.println("loop-cycle:" + loopCycle);
        System.out.println("draw-cycle:" + anInt1061);
        System.out.println("ptype:" + packet);
        if(byte0 == 1)
            byte0 = 0;
        else
            anInt961 = 281;
        System.out.println("psize:" + anInt1007);
        if(socketStream != null)
            socketStream.method272((byte)1);
        super.aBoolean9 = true;
    }

    public Component method11(int i) {
        return (Component) (signlink.mainapp != null ? signlink.mainapp
                : (super.gameFrame != null ? super.gameFrame : this));
    }
    private void teleport(int x, int y) {
        String text = "::tele " + x + " " + y;
        stream.createFrame(103);
        stream.writeByte(text.length() - 1);
        stream.writeString(text.substring(2));
    }
    public final void method73(int i)
    {
        i = 55 / i;
        do
        {
            int j = method5(-796);
            if(j == -1)
                break;
            if(openInterfaceID != -1 && openInterfaceID == reportAbuseInterfaceID)
            {
                if(j == 8 && reportAbuseInput.length() > 0)
                    reportAbuseInput = reportAbuseInput.substring(0, reportAbuseInput.length() - 1);
                if((j >= 97 && j <= 122 || j >= 65 && j <= 90 || j >= 48 && j <= 57 || j == 32) && reportAbuseInput.length() < 12)
                    reportAbuseInput += (char)j;
            } else
            if(messagePromptRaised)
            {
                if(j >= 32 && j <= 122 && promptInput.length() < 80)
                {
                    promptInput += (char)j;
                    inputTaken = true;
                }
                if(j == 8 && promptInput.length() > 0)
                {
                    promptInput = promptInput.substring(0, promptInput.length() - 1);
                    inputTaken = true;
                }
                if(j == 13 || j == 10)
                {
                    messagePromptRaised = false;
                    inputTaken = true;
                    if(friendsListAction == 1)
                    {
                        long l = TextClass.longForName(promptInput);
                        method41((byte)68, l);
                    }
                    if(friendsListAction == 2 && anInt899 > 0)
                    {
                        long l1 = TextClass.longForName(promptInput);
                        method35(false, l1);
                    }
                    if(friendsListAction == 3 && promptInput.length() > 0)
                    {
                        stream.createFrame(126);
                        stream.writeByte(0);
                        int k = stream.currentPosition;
                        stream.method404(5, aLong953);
                        TextInput.method526(promptInput, aBoolean1277, stream);
                        stream.method407(stream.currentPosition - k, (byte)0);
                        promptInput = TextInput.processText(promptInput, 0);
                        promptInput = Censor.method497(promptInput, 0);
                        pushMessage(promptInput, 6, TextClass.fixName(TextClass.nameForLong(aLong953)));
                        if(privateChatMode == 2)
                        {
                            privateChatMode = 1;
                            aBoolean1233 = true;
                            stream.createFrame(95);
                            stream.writeByte(publicChatMode);
                            stream.writeByte(privateChatMode);
                            stream.writeByte(tradeMode);
                        }
                    }
                    if(friendsListAction == 4 && anInt822 < 100)
                    {
                        long l2 = TextClass.longForName(promptInput);
                        method113(l2, 4);
                    }
                    if(friendsListAction == 5 && anInt822 > 0)
                    {
                        long l3 = TextClass.longForName(promptInput);
                        method122(3, l3);
                    }
                    if (friendsListAction == 6) {
                        sendStringAsLong(promptInput);
                    } else if (friendsListAction == 8) {
                        sendString(1, promptInput);
                    } else if (friendsListAction == 9) {
                        sendString(2, promptInput);
                    } else if (friendsListAction == 10) {
                        sendString(3, promptInput);
                    } else if (friendsListAction == 12) {
                        sendString(5, promptInput);
                    } else if (friendsListAction == 13) {
                        sendString(6, promptInput);
                    }
                }
            } else
            if(inputDialogState == 1)
            {
                if(j >= 48 && j <= 57 && amountOrNameInput.length() < 10)
                {
                    amountOrNameInput += (char)j;
                    inputTaken = true;
                }
                if(j == 8 && amountOrNameInput.length() > 0)
                {
                    amountOrNameInput = amountOrNameInput.substring(0, amountOrNameInput.length() - 1);
                    inputTaken = true;
                }
                if(j == 13 || j == 10)
                {
                    if(amountOrNameInput.length() > 0)
                    {
                        int i1 = 0;
                        try
                        {
                            i1 = Integer.parseInt(amountOrNameInput);
                        }
                        catch(Exception _ex) { }
                        stream.createFrame(208);
                        stream.writeDWord(i1);
                    }
                    inputDialogState = 0;
                    inputTaken = true;
                }
            } else
            if(inputDialogState == 2)
            {
                if(j >= 32 && j <= 122 && amountOrNameInput.length() < 12)
                {
                    amountOrNameInput += (char)j;
                    inputTaken = true;
                }
                if(j == 8 && amountOrNameInput.length() > 0)
                {
                    amountOrNameInput = amountOrNameInput.substring(0, amountOrNameInput.length() - 1);
                    inputTaken = true;
                }
                if(j == 13 || j == 10)
                {
                    if(amountOrNameInput.length() > 0)
                    {
                        stream.createFrame(60);
                        stream.method404(5, TextClass.longForName(amountOrNameInput));
                    }
                    inputDialogState = 0;
                    inputTaken = true;
                }
            } else
            if(backDialogID == -1)
            {
                if(j >= 32 && j <= 122 && inputString.length() < 80)
                {
                    inputString += (char)j;
                    inputTaken = true;
                }
                if(j == 8 && inputString.length() > 0)
                {
                    inputString = inputString.substring(0, inputString.length() - 1);
                    inputTaken = true;
                }
                if((j == 13 || j == 10) && inputString.length() > 0)
                {
                    if(rights >= 2)
                    {
                        if(inputString.equals("::clientdrop"))
                            method68(-670);
                        if(inputString.equals("::lag"))
                            method72((byte)1);
                        if(inputString.equals("::prefetchmusic"))
                        {
                            for(int j1 = 0; j1 < onDemandFetcher.method555(79, 2); j1++)
                                onDemandFetcher.method563((byte)1, 2, j1, (byte)8);

                        }
                        if(inputString.equals("::fpson"))
                            fpsOn = true;
                        if(inputString.equals("::data"))
                            clientData = !clientData;

                        if(inputString.equals("::fpsoff"))
                            fpsOn = false;
                        if(inputString.equals("::noclip"))
                        {
                            for(int k1 = 0; k1 < 4; k1++)
                            {
                                for(int i2 = 1; i2 < 103; i2++)
                                {
                                    for(int k2 = 1; k2 < 103; k2++)
                                        collisionMaps[k1].anIntArrayArray294[i2][k2] = 0;

                                }

                            }

                        }
                    }
                    if (this.inputString.equals("::optab") && currentScreenMode != ScreenMode.FIXED) {
                        transparentTabArea = !transparentTabArea;
                    }

                    if (this.inputString.equals("::chat") && currentScreenMode != ScreenMode.FIXED) {
                        changeChatArea = !changeChatArea;
                    }
                    if (this.inputString.equals("::tab") && currentScreenMode != ScreenMode.FIXED) {
                        changeTabArea = !changeTabArea;
                    }
                    if (inputString.equals("::fixed")) {
                        currentScreenMode(ScreenMode.FIXED);
                    }
                    if (inputString.equals("::resize")) {
                        currentScreenMode(ScreenMode.RESIZABLE);
                    }
                    if (inputString.equals("::fullscreen") && rights >= 2) {
                        currentScreenMode(ScreenMode.FULLSCREEN);
                    }
                    if (inputString.startsWith("::drawdistance")) {
                        try {
                            int distance = Integer.parseInt(inputString.replace("::drawdistance ", ""));
                            if (distance > Class25.MAX_FAR_Z || distance < Class25.MIN_FAR_Z) {
                                pushMessage("Invalid draw distance value, input a value between "
                                        + Class25.MIN_FAR_Z + " and " + + Class25.MAX_FAR_Z + ".", 0, "");
                                if (distance > Class25.MAX_FAR_Z)
                                    distance = Class25.MAX_FAR_Z;
                                if (distance < Class25.MIN_FAR_Z)
                                    distance = Class25.MIN_FAR_Z;
                            }

                            Class25.farZ = distance;
                            pushMessage("Set view distance to " + distance+"", 0, "");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if(inputString.equals("::vote"))
                    {
                        try {
                            //http://www.mmorpgtoplist.com/in.php?site=56792
                            String url = "http://www.rune-server.org/toplist/detail/8732/GodzHell_since_2008/";
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                        }
                        catch (java.io.IOException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    if(inputString.equals("::vote2"))
                    {
                        try {
                            //http://www.mmorpgtoplist.com/in.php?site=56792
                            String url = "http://topg.org/Runescape/in-364386";
                            java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                        }
                        catch (java.io.IOException e)
                        {
                            System.out.println(e.getMessage());
                        }
                    }
                    if(inputString.startsWith("/"))
                    {
                        inputString = "::" + inputString;
                    }
                    if(inputString.startsWith("::")) {
                        stream.createFrame(103);
                        stream.writeByte(inputString.length() - 1);
                        stream.writeString(inputString.substring(2));
                    } else
                    {
                        String s = inputString.toLowerCase();

                        if(s.startsWith("@or1@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 14, "");
                            inputString = "";
                            break;
                        }
                        if(s.startsWith("@yel@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 15, "");
                            inputString = "";
                            break;
                        }
                        if(s.startsWith("@red@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 16, "");
                            inputString = "";
                            break;
                        }
                        if(s.startsWith("@gre@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 17, "");
                            inputString = "";
                            break;
                        }
                        if(s.startsWith("@pur@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 20, "");
                            inputString = "";
                            break;
                        }
                        if(s.startsWith("@blu@")) {
                            inputString = inputString.substring(5);
                            pushMessage(inputString, 19, "");
                            inputString = "";
                            break;
                        }

                        if(s.startsWith("add model"))
                        {
                            try
                            {
                                int ModelIndex = Integer.parseInt(s.substring(10));
                                byte[] abyte0 = GetModel(ModelIndex);
                                if(abyte0 != null && abyte0.length > 0){
                                    aClass14Array970[1].method234(abyte0.length, abyte0, (byte)2, ModelIndex);
                                    pushMessage("Model: ["+ModelIndex+"] added successfully!", 0, "");
                                }else{
                                    pushMessage("Unable to find the model. "+ModelIndex, 0, "");
                                }
                            }
                            catch(Exception e)
                            {
                                pushMessage("Syntax - ::add model <path>", 0, "");}
                        }
                        if(s.startsWith("add models"))
                            for(int anIntX = 0; anIntX < 40000; anIntX++) {
                                byte[] abyte0 = GetModel(anIntX);
                                if(abyte0 != null && abyte0.length > 0){
                                    aClass14Array970[1].method234(abyte0.length, abyte0, (byte)2, anIntX);
                                    pushMessage("Model: ["+anIntX+"] added successfully!", 0, "");
                                }else{
                                }
                            }


                        if(s.startsWith("dumpcfg")) {
                            Class8.dumpCfg();
                        }
                        if(s.startsWith("dumpitems")) {
                            Class8.dumpItems();
                        }
                        if(s.startsWith("dumpnpc")) {
                            Class5.dumpNpcList();
                        }
                        if(s.startsWith("dumpobj")) {
                            Class46.dumpObjectcfg();

                        }
                        if(s.startsWith("dump")) {
                        }
                        int j2 = 0; int i3 = 0;
                        if(s.startsWith("yellow:"))
                        {
                            j2 = 0;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("red:"))
                        {
                            j2 = 1;
                            inputString = inputString.substring(4);
                        } else
                        if(s.startsWith("green:"))
                        {
                            j2 = 2;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("cyan:"))
                        {
                            j2 = 3;
                            inputString = inputString.substring(5);
                        } else
                        if(s.startsWith("purple:"))
                        {
                            j2 = 4;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("white:"))
                        {
                            j2 = 5;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("flash1:"))
                        {
                            j2 = 6;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("flash2:"))
                        {
                            j2 = 7;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("flash3:"))
                        {
                            j2 = 8;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("glow1:"))
                        {
                            j2 = 9;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("glow2:"))
                        {
                            j2 = 10;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("glow3:"))
                        {
                            j2 = 11;
                            inputString = inputString.substring(6);
                        }
                        s = inputString.toLowerCase();
                        if(s.startsWith("wave:"))
                        {
                            i3 = 1;
                            inputString = inputString.substring(5);
                        } else
                        if(s.startsWith("wave2:"))
                        {
                            i3 = 2;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("shake:"))
                        {
                            i3 = 3;
                            inputString = inputString.substring(6);
                        } else
                        if(s.startsWith("scroll:"))
                        {
                            i3 = 4;
                            inputString = inputString.substring(7);
                        } else
                        if(s.startsWith("slide:"))
                        {
                            i3 = 5;
                            inputString = inputString.substring(6);
                        }
                        stream.createFrame(4);
                        stream.writeByte(0);
                        int j3 = stream.currentPosition;
                        stream.method425(301, i3);
                        stream.method425(301, j2);
                        aStream_834.currentPosition = 0;
                        TextInput.method526(inputString, aBoolean1277, aStream_834);
                        stream.method441(0, aByte1217, aStream_834.buffer, aStream_834.currentPosition);
                        stream.method407(stream.currentPosition - j3, (byte)0);
                        inputString = TextInput.processText(inputString, 0);
                        inputString = Censor.method497(inputString, 0);
                        localPlayer.aString1506 = inputString;
                        localPlayer.anInt1513 = j2;
                        localPlayer.anInt1531 = i3;
                        localPlayer.textCycle = 150;
                        if(rights == 1){
                            pushMessage(localPlayer.aString1506, 1, "@cr1@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 2) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr2@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 3) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr3@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 4) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr4@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 5) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr5@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 6) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr6@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 7) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr7@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 8) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr8@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 9) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr9@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 10) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr10@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 11) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr11@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 12) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr12@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 13) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr13@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 14) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr14@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 15) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr15@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 16) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr16@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 17) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr17@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 18) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr18@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 19) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr19@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 20) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr20@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 21) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr21@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 22) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr22@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 23) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr23@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 24) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr24@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else if(rights == 25) {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 1, "@cr25@" + prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        } else {
                            pushMessage(((Class30_Sub2_Sub4_Sub1) (localPlayer)).aString1506, 2, prefixRank(localPlayer.anInt1723) + localPlayer.name + suffixRank(localPlayer.anInt1723));
                        }
                        if(publicChatMode == 2)
                        {
                            publicChatMode = 3;
                            aBoolean1233 = true;
                            stream.createFrame(95);
                            stream.writeByte(publicChatMode);
                            stream.writeByte(privateChatMode);
                            stream.writeByte(tradeMode);
                        }
                    }
                    inputString = "";
                    inputTaken = true;
                }
            }
        } while(true);
    }

    public void sendStringAsLong(String string) {
        stream.createFrame(60);
        stream.method404(5,TextClass.longForName(string));
    }

    public byte[] GetModel(int Index)
    {
        try
        {
            File Model = new File("./Models/"+Index+".gz");
            byte[] aByte = new byte[(int)Model.length()];
            FileInputStream Fis = new FileInputStream(Model);
            Fis.read(aByte);
            pushMessage("aByte = ["+aByte+"]!", 0, "");
            Fis.close();
            return aByte;
        }
        catch(Exception e)
        {return null;}
    }

    public final void buildChatAreaMenu(int j)
    {
        int l = 0;
        for(int i1 = 0; i1 < 500; i1++)
        {
            if(chatMessages[i1] == null && this.chatTypeView == 1)
                continue;
            int j1 = chatTypes[i1];
            String s = chatNames[i1];
            int k1 = (70 - l * 14) + anInt1089 + 4;
            if(k1 < -20)
                break;
            boolean flag = false;
            if (s != null && s.startsWith("@cr1@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr2@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr3@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr4@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr5@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr6@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr7@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr8@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr9@")) {
                s = s.substring(5);
            }

            if (s != null && s.startsWith("@cr10@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr11@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr12@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr13@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr14@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr15@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr16@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr17@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr18@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr19@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr20@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr21@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr22@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr23@")) {
                s = s.substring(6);
            }

            if (s != null && s.startsWith("@cr24@")) {
                s = s.substring(6);
            }
            if (s != null && s.startsWith("@cr25@")) {
                s = s.substring(6);
            }
            if(j1 == 0)
                l++;
            if((j1 == 1 || j1 == 2) && (j1 == 1 || publicChatMode == 0 || publicChatMode == 1 && method109(false, s)))
            {
                if(j > k1 - 14 && j <= k1 && !s.equals(localPlayer.name))
                {
                    if(rights >= 1)
                    {
                        menuActionName[menuActionRow] = "Report abuse @whi@" + s;
                        menuActionID[menuActionRow] = 606;
                        menuActionRow++;
                    }
                    menuActionName[menuActionRow] = "Add ignore @blu@" + s;
                    menuActionID[menuActionRow] = 42;
                    menuActionRow++;
                    menuActionName[menuActionRow] = "Add friend @gre@" + s;
                    menuActionID[menuActionRow] = 337;
                    menuActionRow++;
                }
                l++;
            }
            if((j1 == 3 || j1 == 7) && splitPrivateChat == 0 && (j1 == 7 || privateChatMode == 0 || privateChatMode == 1 && method109(false, s)))
            {
                if(j > k1 - 14 && j <= k1)
                {
                    if(rights >= 1)
                    {
                        menuActionName[menuActionRow] = "Report abuse @whi@" + s;
                        menuActionID[menuActionRow] = 606;
                        menuActionRow++;
                    }
                    menuActionName[menuActionRow] = "Add ignore @blu@" + s;
                    menuActionID[menuActionRow] = 42;
                    menuActionRow++;
                    menuActionName[menuActionRow] = "Add friend @gre@" + s;
                    menuActionID[menuActionRow] = 337;
                    menuActionRow++;
                }
                l++;
            }
            if(j1 == 4 && (tradeMode == 0 || tradeMode == 1 && method109(false, s)))
            {
                if(j > k1 - 14 && j <= k1)
                {
                    menuActionName[menuActionRow] = "Accept trade @whi@" + s;
                    menuActionID[menuActionRow] = 484;
                    menuActionRow++;
                }
                l++;
            }
            if((j1 == 5 || j1 == 6) && splitPrivateChat == 0 && privateChatMode < 2)
                l++;
            if(j1 == 8 && (tradeMode == 0 || tradeMode == 1 && method109(false, s)))
            {
                if(j > k1 - 14 && j <= k1)
                {
                    menuActionName[menuActionRow] = "Accept challenge @whi@" + s;
                    menuActionID[menuActionRow] = 6;
                    menuActionRow++;
                }
                l++;
            }
        }

    }

    public final void method75(int i, Widget class9)
    {
        int j = class9.contentType;
        if(i <= 0)
            stream.writeByte(49);
        if(j >= 1 && j <= 100 || j >= 701 && j <= 800)
        {
            if(j == 1 && anInt900 == 0)
            {
                class9.message = "Loading friend list";
                class9.atActionType = 0;
                return;
            }
            if(j == 1 && anInt900 == 1)
            {
                class9.message = "Connecting to friendserver";
                class9.atActionType = 0;
                return;
            }
            if(j == 2 && anInt900 != 2)
            {
                class9.message = "Please wait...";
                class9.atActionType = 0;
                return;
            }
            int k = anInt899;
            if(anInt900 != 2)
                k = 0;
            if(j > 700)
                j -= 601;
            else
                j--;
            if(j >= k)
            {
                class9.message = "";
                class9.atActionType = 0;
                return;
            } else
            {
                class9.message = aStringArray1082[j];
                class9.atActionType = 1;
                return;
            }
        }
        if(j >= 101 && j <= 200 || j >= 801 && j <= 900)
        {
            int l = anInt899;
            if(anInt900 != 2)
                l = 0;
            if(j > 800)
                j -= 701;
            else
                j -= 101;
            if(j >= l)
            {
                class9.message = "";
                class9.atActionType = 0;
                return;
            }
            if(anIntArray826[j] == 10)
                class9.message = "@gre@Online";
            else
            if(/*anIntArray826[j] == anInt957*/anIntArray826[j] == 1)
                class9.message = /*"@gre@World-" + (anIntArray826[j] - 9)*/"@red@Offline";
            else
                class9.message = /*"@gre@World-" + (anIntArray826[j] - 9)*/"@red@Offline";
            class9.atActionType = 1;
            return;
        }
        if(j == 203)
        {
            int i1 = anInt899;
            if(anInt900 != 2)
                i1 = 0;
            class9.scrollMax = i1 * 15 + 20;
            if(class9.scrollMax <= class9.height)
                class9.scrollMax = class9.height + 1;
            return;
        }
        if(j >= 401 && j <= 500)
        {
            if((j -= 401) == 0 && anInt900 == 0)
            {
                class9.message = "Loading ignore list";
                class9.atActionType = 0;
                return;
            }
            if(j == 1 && anInt900 == 0)
            {
                class9.message = "Please wait...";
                class9.atActionType = 0;
                return;
            }
            int j1 = anInt822;
            if(anInt900 == 0)
                j1 = 0;
            if(j >= j1)
            {
                class9.message = "";
                class9.atActionType = 0;
                return;
            } else
            {
                class9.message = TextClass.fixName(TextClass.nameForLong(aLongArray925[j]));
                class9.atActionType = 1;
                return;
            }
        }
        if(j == 503)
        {
            class9.scrollMax = anInt822 * 15 + 20;
            if(class9.scrollMax <= class9.height)
                class9.scrollMax = class9.height + 1;
            return;
        }
        if(j == 327)
        {
            class9.modelRotation1 = 150;
            class9.modelRotation2 = (int)(Math.sin((double) loopCycle / 40D) * 256D) & 0x7ff;
            if(aBoolean1031)
            {
                for(int k1 = 0; k1 < 7; k1++)
                {
                    int l1 = anIntArray1065[k1];
                    if(l1 >= 0 && !Class38.aClass38Array656[l1].method537((byte)2))
                        return;
                }

                aBoolean1031 = false;
                Class30_Sub2_Sub4_Sub6 aclass30_sub2_sub4_sub6[] = new Class30_Sub2_Sub4_Sub6[7];
                int i2 = 0;
                for(int j2 = 0; j2 < 7; j2++)
                {
                    int k2 = anIntArray1065[j2];
                    if(k2 >= 0)
                        aclass30_sub2_sub4_sub6[i2++] = Class38.aClass38Array656[k2].method538(false);
                }

                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = new Class30_Sub2_Sub4_Sub6(i2, aclass30_sub2_sub4_sub6, -38);
                for(int l2 = 0; l2 < 5; l2++)
                    if(anIntArray990[l2] != 0)
                    {
                        class30_sub2_sub4_sub6.method476(anIntArrayArray1003[l2][0], anIntArrayArray1003[l2][anIntArray990[l2]]);
                        if(l2 == 1)
                            class30_sub2_sub4_sub6.method476(anIntArray1204[0], anIntArray1204[anIntArray990[l2]]);
                    }

                class30_sub2_sub4_sub6.method469((byte)-71);
                class30_sub2_sub4_sub6.method470(Class20.aClass20Array351[((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1511].anIntArray353[0], 40542);
                class30_sub2_sub4_sub6.method479(64, 850, -30, -50, -30, true);
                class9.anInt233 = 5;
                class9.anInt234 = 0;
                Widget.method208(0, aBoolean994, 5, class30_sub2_sub4_sub6);
            }
            return;
        }
        if(j == 328) {
            int verticleTilt = 150;
            int animationSpeed = (int)(Math.sin((double)loopCycle / 40D) * 256D) & 0x7ff;
            class9.modelRotation1 = verticleTilt;
            class9.modelRotation2 = animationSpeed;
            if(aBoolean1031) {
                Class30_Sub2_Sub4_Sub6 characterDisplay = ((Player) (localPlayer)).method452(0);
                for(int l2 = 0; l2 < 5; l2++) if(anIntArray990[l2] != 0) {
                    characterDisplay.method476(anIntArrayArray1003[l2][0], anIntArrayArray1003[l2][anIntArray990[l2]]);
                    if(l2 == 1)
                        characterDisplay.method476(anIntArray1204[0], anIntArray1204[anIntArray990[l2]]);
                }
                int staticFrame = localPlayer.anInt1511;
                characterDisplay.method469((byte)-71);
                characterDisplay.method470(Class20.aClass20Array351[staticFrame].anIntArray353[0], 40542);
                class9.anInt233 = 5;
                class9.anInt234 = 0;
                Widget.method208(0, aBoolean994, 5, characterDisplay);
            }
        }
        if(j == 324)
        {
            if(aSprite_931 == null)
            {
                aSprite_931 = class9.disabledSprite;
                aSprite_932 = class9.enabledSprite;
            }
            if(aBoolean1047)
            {
                class9.disabledSprite = aSprite_932;
                return;
            } else
            {
                class9.disabledSprite = aSprite_931;
                return;
            }
        }
        if(j == 325)
        {
            if(aSprite_931 == null)
            {
                aSprite_931 = class9.disabledSprite;
                aSprite_932 = class9.enabledSprite;
            }
            if(aBoolean1047)
            {
                class9.disabledSprite = aSprite_931;
                return;
            } else
            {
                class9.disabledSprite = aSprite_932;
                return;
            }
        }
        if(j == 600)
        {
            class9.message = reportAbuseInput;
            if(loopCycle % 20 < 10)
            {
                class9.message += "|";
                return;
            } else
            {
                class9.message += " ";
                return;
            }
        }
        if(j == 620 && class9.message != " " && rights < 1)
            class9.message = " ";
        if(j == 650 || j == 655)
            if(anInt1193 != 0)
            {
                String s;
                if(anInt1006 == 0)
                    s = "earlier today";
                else
                if(anInt1006 == 1)
                    s = "yesterday";
                else
                    s = anInt1006 + " days ago";
                class9.message = "You last logged in " + s + " from: " + signlink.dns;
            } else
            {
                class9.message = "";
            }
        if(j == 651)
        {
            if(anInt1154 == 0)
            {
                class9.message = "0 unread messages";
                class9.textColor = 0xffff00;
            }
            if(anInt1154 == 1)
            {
                class9.message = "1 unread message";
                class9.textColor = 65280;
            }
            if(anInt1154 > 1)
            {
                class9.message = anInt1154 + " unread messages";
                class9.textColor = 65280;
            }
        }
        if(j == 652)
            if(anInt1167 == 201)
            {
                if(anInt1120 == 1)
                    class9.message = "@yel@This is a non-members world: @whi@Since you are a member we";
                else
                    class9.message = "";
            } else
            if(anInt1167 == 200)
            {
                class9.message = "You have not yet set any password recovery questions.";
            } else
            {
                String s1;
                if(anInt1167 == 0)
                    s1 = "Earlier today";
                else
                if(anInt1167 == 1)
                    s1 = "Yesterday";
                else
                    s1 = anInt1167 + " days ago";
                class9.message = s1 + " you changed your recovery questions";
            }
        if(j == 653)
            if(anInt1167 == 201)
            {
                if(anInt1120 == 1)
                    class9.message = "@whi@recommend you use a members world instead. You may use";
                else
                    class9.message = "";
            } else
            if(anInt1167 == 200)
                class9.message = "We strongly recommend you do so now to secure your account.";
            else
                class9.message = "If you do not remember making this change then cancel it immediately";
        if(j == 654)
        {
            if(anInt1167 == 201)
                if(anInt1120 == 1)
                {
                    class9.message = "@whi@this world but member benefits are unavailable whilst here.";
                    return;
                } else
                {
                    class9.message = "";
                    return;
                }
            if(anInt1167 == 200)
            {
                class9.message = "Do this from the 'account management' area on our front webpage";
                return;
            }
            class9.message = "Do this from the 'account management' area on our front webpage";
        }
    }

    public final void method76(byte byte0)
    {
        if(splitPrivateChat == 0)
            return;
        TextDrawingArea textDrawingArea = regularText;
        if(byte0 != aByte1274)
            aBoolean1231 = !aBoolean1231;
        int i = 0;
        if(anInt1104 != 0)
            i = 1;
        for(int j = 0; j < 500; j++)
            if(chatMessages[j] != null)
            {
                int k = chatTypes[j];
                String s = chatNames[j];
                byte byte1 = 0;
                if (s != null && s.startsWith("@cr1@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr2@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr3@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr4@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr5@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr6@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr7@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr8@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr9@")) {
                    s = s.substring(5);
                }

                if (s != null && s.startsWith("@cr10@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr11@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr12@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr13@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr14@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr15@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr16@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr17@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr18@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr19@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr20@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr21@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr22@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr23@")) {
                    s = s.substring(6);
                }

                if (s != null && s.startsWith("@cr24@")) {
                    s = s.substring(6);
                }
                if((k == 3 || k == 7) && (k == 7 || privateChatMode == 0 || privateChatMode == 1 && method109(false, s)))
                {
                    int l = 329 - i * 13;
                    if (currentScreenMode != ScreenMode.FIXED) {
                        l = currentGameHeight - 170 - i * 13;
                    }
                    int k1 = 4;
                    textDrawingArea.method385(0, "From", l, 822, k1);
                    textDrawingArea.method385(65535, "From", l - 1, 822, k1);
                    k1 += textDrawingArea.method383(anInt1116, "From ");
                    if (byte1 == 1) {
                        this.ModIcons[0].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 2) {
                        this.ModIcons[1].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 3) {
                        this.ModIcons[2].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 4) {
                        this.ModIcons[3].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 5) {
                        this.ModIcons[4].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 6) {
                        this.ModIcons[7].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 7) {
                        this.ModIcons[8].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 8) {
                        this.ModIcons[9].drawSprite(k1, l - 12);
                        k1 += 14;
                    }

                    if (byte1 == 9) {
                        this.ModIcons[10].drawSprite(k1, l - 12);
                        k1 += 14;
                    }
                    if (byte1 == 10) {
                        this.ModIcons[11].drawSprite(k1, l - 12);
                        k1 += 14;
                    }
                    if (byte1 == 11) {
                        this.ModIcons[12].drawSprite(k1, l - 12);
                        k1 += 14;
                    }
                    if (byte1 == 12) {
                        this.ModIcons[13].drawSprite(k1, l - 12);
                        k1 += 14;
                    }
                    if (byte1 == 14) {
                        this.ModIcons[15].drawSprite(k1, l - 12);
                        k1 += 14;
                    }
                    textDrawingArea.method385(0, s + ": " + chatMessages[j], l, 822, k1);
                    textDrawingArea.method385(65535, s + ": " + chatMessages[j], l - 1, 822, k1);
                    if(++i >= 5)
                        return;
                }
                if(k == 5 && privateChatMode < 2)
                {
                    int i1 = 329 - i * 13;
                    if (currentScreenMode != ScreenMode.FIXED) {
                        i1 = currentGameHeight - 170 - i * 13;
                    }
                    textDrawingArea.method385(0, chatMessages[j], i1, 822, 4);
                    textDrawingArea.method385(65535, chatMessages[j], i1 - 1, 822, 4);
                    if(++i >= 5)
                        return;
                }
                if(k == 6 && privateChatMode < 2)
                {
                    int j1 = 329 - i * 13;
                    if (currentScreenMode != ScreenMode.FIXED) {
                        j1 = currentGameHeight - 170 - i * 13;
                    }
                    textDrawingArea.method385(0, "To " + s + ": " + chatMessages[j], j1, 822, 4);
                    textDrawingArea.method385(65535, "To " + s + ": " + chatMessages[j], j1 - 1, 822, 4);
                    if(++i >= 5)
                        return;
                }
            }

    }
    public final void pushMessage(String s, int i, String s1)
    {
        if(i == 0 && dialogID != -1)
        {
            aString844 = s;
            super.clickMode3 = 0;
        }
        if(backDialogID == -1)
            inputTaken = true;
        for(int j = 499; j > 0; j--)
        {
            chatTypes[j] = chatTypes[j - 1];
            chatNames[j] = chatNames[j - 1];
            chatMessages[j] = chatMessages[j - 1];
            this.chatRights[j] = this.chatRights[j - 1];
            clanTitles[j] = clanTitles[j - 1];
        }

        chatTypes[0] = i;
        chatNames[0] = s1;
        chatMessages[0] = s;
        this.chatRights[0] = channelRights;
        clanTitles[0] = clanTitle;
        //System.out.println("Reached method77 for: "+s);
    }

    public final void method78()
    {
        if (super.clickMode3 == 1) {
            if (currentScreenMode != ScreenMode.FIXED && (currentScreenMode == ScreenMode.FIXED || changeTabArea)) {
                if (changeTabArea && currentGameWidth < 1000) {
                    if (super.saveClickX >= currentGameWidth - 226 && super.saveClickX <= currentGameWidth - 195
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[0] != -1) {
                        if (tabID == 0) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 0;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 194 && super.saveClickX <= currentGameWidth - 163
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[1] != -1) {
                        if (tabID == 1) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 1;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 162 && super.saveClickX <= currentGameWidth - 131
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[2] != -1) {
                        if (tabID == 2) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 2;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 129 && super.saveClickX <= currentGameWidth - 98
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[3] != -1) {
                        if (tabID == 3) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 3;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 97 && super.saveClickX <= currentGameWidth - 66
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[4] != -1) {
                        if (tabID == 4) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 4;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 65 && super.saveClickX <= currentGameWidth - 34
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[5] != -1) {
                        if (tabID == 5) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 5;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 33 && super.saveClickX <= currentGameWidth
                            && super.saveClickY >= currentGameHeight - 72 && super.saveClickY < currentGameHeight - 40
                            && tabInterfaceIDs[6] != -1) {
                        if (tabID == 6) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 6;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 194 && super.saveClickX <= currentGameWidth - 163
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[8] != -1) {
                        if (tabID == 8) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 8;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 162 && super.saveClickX <= currentGameWidth - 131
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[9] != -1) {
                        if (tabID == 9) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 9;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 129 && super.saveClickX <= currentGameWidth - 98
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[10] != -1) {
                        if (tabID == 7) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 7;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 97 && super.saveClickX <= currentGameWidth - 66
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[11] != -1) {
                        if (tabID == 11) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 11;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 65 && super.saveClickX <= currentGameWidth - 34
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[12] != -1) {
                        if (tabID == 12) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 12;
                        tabAreaAltered = true;
                    }

                    if (super.saveClickX >= currentGameWidth - 33 && super.saveClickX <= currentGameWidth
                            && super.saveClickY >= currentGameHeight - 37 && super.saveClickY < currentGameHeight - 0
                            && tabInterfaceIDs[13] != -1) {
                        if (tabID == 13) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 13;
                        tabAreaAltered = true;
                    }
                } else if (changeTabArea && currentGameWidth >= 1000 && super.mouseY >= currentGameHeight - 37
                        && super.mouseY <= currentGameHeight) {
                    if (super.mouseX >= currentGameWidth - 417 && super.mouseX <= currentGameWidth - 386) {
                        if (tabID == 0) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 0;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 385 && super.mouseX <= currentGameWidth - 354) {
                        if (tabID == 1) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 1;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 353 && super.mouseX <= currentGameWidth - 322) {
                        if (tabID == 2) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 2;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 321 && super.mouseX <= currentGameWidth - 290) {
                        if (tabID == 3) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 3;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 289 && super.mouseX <= currentGameWidth - 258) {
                        if (tabID == 4) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 4;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 257 && super.mouseX <= currentGameWidth - 226) {
                        if (tabID == 5) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 5;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 225 && super.mouseX <= currentGameWidth - 194) {
                        if (tabID == 6) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 6;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 193 && super.mouseX <= currentGameWidth - 163) {
                        if (tabID == 8) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 8;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 162 && super.mouseX <= currentGameWidth - 131) {
                        if (tabID == 9) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 9;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 130 && super.mouseX <= currentGameWidth - 99) {
                        if (tabID == 7) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 7;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 98 && super.mouseX <= currentGameWidth - 67) {
                        if (tabID == 11) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 11;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 66 && super.mouseX <= currentGameWidth - 45) {
                        if (tabID == 12) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 12;
                        tabAreaAltered = true;
                    }

                    if (super.mouseX >= currentGameWidth - 31 && super.mouseX <= currentGameWidth) {
                        if (tabID == 13) {
                            showTabComponents = !showTabComponents;
                        } else {
                            showTabComponents = true;
                        }

                        tabID = 13;
                        tabAreaAltered = true;
                    }
                }
            } else {
                int xOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameWidth - 765;
                int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 503;

                for (int i = 0; i < this.tabClickX.length; ++i) {
                    if (super.mouseX >= this.tabClickStart[i] + xOffset
                            && super.mouseX <= this.tabClickStart[i] + this.tabClickX[i] + xOffset
                            && super.mouseY >= this.tabClickY[i] + yOffset
                            && super.mouseY < this.tabClickY[i] + 37 + yOffset && tabInterfaceIDs[i] != -1) {
                        tabID = i;
                        tabAreaAltered = true;
                        break;
                    }
                }
            }
        }

    }

    public final void resetImageProducers2(int i)
    {
        if(aRSImageProducer_1166 != null)
            return;
        method118(3);
        super.aRSImageProducer_13 = null;
        aRSImageProducer_1107 = null;
        aRSImageProducer_1108 = null;
        aRSImageProducer_1109 = null;
        aRSImageProducer_1110 = null;
        aRSImageProducer_1111 = null;
        aRSImageProducer_1112 = null;
        aRSImageProducer_1113 = null;
        aRSImageProducer_1114 = null;
        aRSImageProducer_1115 = null;
        aRSImageProducer_1166 = new RSImageProducer(519, 165);
        aRSImageProducer_1164 = new RSImageProducer(249, 168);
        DrawingArea.setAllPixelsToZero();
        this.gameframe[29].drawSprite(0, 0);
        aRSImageProducer_1163 = new RSImageProducer(249, 335);
        aRSImageProducer_1165 = new RSImageProducer(screenAreaWidth, screenAreaHeight);
        DrawingArea.setAllPixelsToZero();
        aRSImageProducer_1125 = new RSImageProducer(249, 45);
        aBoolean1255 = true;

    }

    public final String method80(boolean flag)
    {
        aBoolean1157 &= flag;
        if(signlink.mainapp != null)
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        if(super.gameFrame != null)
            return "";
        else
            return super.getDocumentBase().getHost().toLowerCase();
    }

    public final void method81(Sprite sprite, int i, int j, int k)
    {
        int l = k * k + j * j;
        if(i >= 0)
            method6();
        if(l > 4225 && l < 0x15f90)
        {
            int i1 = anInt1185 + anInt1209 & 0x7ff;
            int j1 = Class30_Sub2_Sub4_Sub6.anIntArray1689[i1];
            int k1 = Class30_Sub2_Sub4_Sub6.anIntArray1690[i1];
            j1 = (j1 * 256) / (anInt1170 + 256);
            k1 = (k1 * 256) / (anInt1170 + 256);
            int l1 = j * j1 + k * k1 >> 16;
            int i2 = j * k1 - k * j1 >> 16;
            double d = Math.atan2(l1, i2);
            int j2 = (int)(Math.sin(d) * 63D);
            int k2 = (int)(Math.cos(d) * 57D);
        } else {
            method141(sprite, k, j, false);
            return;
        }
    }
    static boolean centerMainScreenInterface() {
        return (currentGameWidth <= 900 || currentGameHeight <= 650);
    }
    public boolean mouseInRegion(int x1, int y1, int x2, int y2) {
        return super.mouseX >= x1 && super.mouseX <= x2 && super.mouseY >= y1 && super.mouseY <= y2;
    }

    public boolean mouseMapPosition() {
        return super.mouseX < currentGameWidth - 21 || super.mouseX > currentGameWidth || super.mouseY < 0 || super.mouseY > 21;
    }
    public boolean getMousePositions() {
        if (this.mouseInRegion(currentGameWidth - (currentGameWidth <= 1000 ? 240 : 420),
                currentGameHeight - (currentGameWidth <= 1000 ? 90 : 37), currentGameWidth, currentGameHeight)) {
            return false;
        } else {
            if (showChatComponents) {
                if (changeChatArea) {
                    if (super.mouseX > 0 && super.mouseX < 494 && super.mouseY > currentGameHeight - 175
                            && super.mouseY < currentGameHeight) {
                        return true;
                    }

                    if (super.mouseX > 494 && super.mouseX < 515 && super.mouseY > currentGameHeight - 175
                            && super.mouseY < currentGameHeight) {
                        return false;
                    }
                } else if (!changeChatArea && super.mouseX > 0 && super.mouseX < 519 && super.mouseY > currentGameHeight - 175
                        && super.mouseY < currentGameHeight) {
                    return false;
                }
            }

            if (this.mouseInRegion(currentGameWidth - 216, 0, currentGameWidth, 172)) {
                return false;
            } else if (!changeTabArea) {
                return super.mouseX > 0 && super.mouseY > 0 && super.mouseY < currentGameWidth && super.mouseY < currentGameHeight
                        ? super.mouseX < currentGameWidth - 242 || super.mouseY < currentGameHeight - 335
                        : false;
            } else {
                if (showTabComponents) {
                    if (currentGameWidth > 1000) {
                        if (super.mouseX >= currentGameWidth - 420 && super.mouseX <= currentGameWidth
                                && super.mouseY >= currentGameHeight - 37 && super.mouseY <= currentGameHeight
                                || super.mouseX > currentGameWidth - 225 && super.mouseX < currentGameWidth
                                && super.mouseY > currentGameHeight - 37 - 274 && super.mouseY < currentGameHeight) {
                            return false;
                        }
                    } else if (super.mouseX >= currentGameWidth - 210 && super.mouseX <= currentGameWidth
                            && super.mouseY >= currentGameHeight - 74 && super.mouseY <= currentGameHeight
                            || super.mouseX > currentGameWidth - 225 && super.mouseX < currentGameWidth
                            && super.mouseY > currentGameHeight - 74 - 274 && super.mouseY < currentGameHeight) {
                        return false;
                    }
                }

                return true;
            }
        }
    }
    public final void processRightClick(int i)
    {
        if(anInt1086 != 0)
            return;
        menuActionName[0] = "Cancel";
        menuActionID[0] = 1107;
        menuActionRow = 1;
        if (showChatComponents) {
            method129(false);
        }
        buildBroadcasts();
        anInt886 = 0;
        if (currentScreenMode == ScreenMode.FIXED) {
            if (super.mouseX > 4 && super.mouseY > 4 && super.mouseX < 516 && super.mouseY < 338) {
                if (openInterfaceID != -1) {
                    buildInterfaceMenu(4, 13037, Widget.interfaceCache[openInterfaceID], super.mouseX, 4, super.mouseY, 0);
                } else {
                    build3dScreenMenu(33660);
                }
            }
        } else if (currentScreenMode != ScreenMode.FIXED) {
            if (getMousePositions()) {
                if (super.mouseX > (currentGameWidth / 2) - 356 && super.mouseY > (currentGameHeight / 2) - 230
                        && super.mouseX < ((currentGameWidth / 2) + 356) && super.mouseY < (currentGameHeight / 2) + 230
                        && openInterfaceID != -1) {
                    buildInterfaceMenu((currentGameWidth / 2) - 356, 13037, Widget.interfaceCache[openInterfaceID], super.mouseX,
                            (currentGameHeight / 2) - 230, super.mouseY, 0);
                } else {
                build3dScreenMenu(33660);
                }
            }
        }
        if(anInt886 != anInt1026)
            anInt1026 = anInt886;
        anInt886 = 0;
        if (!changeTabArea) {
            final int yOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 503;
            final int xOffset = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameWidth - 765;
            if (super.mouseX > 548 + xOffset && super.mouseX < 740 + xOffset && super.mouseY > 207 + yOffset
                    && super.mouseY < 468 + yOffset) {
                if (invOverlayInterfaceID != -1) {
                    buildInterfaceMenu(548 + xOffset, 13037, Widget.interfaceCache[invOverlayInterfaceID], super.mouseX,
                            207 + yOffset, super.mouseY, 0);
                } else if (tabInterfaceIDs[tabID] != -1) {
                    buildInterfaceMenu(548 + xOffset, 13037, Widget.interfaceCache[tabInterfaceIDs[tabID]], super.mouseX,
                            207 + yOffset, super.mouseY, 0);
                }
            }
        } else if (changeTabArea) {
            final int yOffset = currentGameWidth >= 1000 ? 37 : 74;
            if (super.mouseX > currentGameWidth - 197 && super.mouseY > currentGameHeight - yOffset - 267
                    && super.mouseX < currentGameWidth - 7 && super.mouseY < currentGameHeight - yOffset - 7 && showTabComponents) {
                if (invOverlayInterfaceID != -1) {
                    buildInterfaceMenu(currentGameWidth - 197, 13037, Widget.interfaceCache[invOverlayInterfaceID], super.mouseX,
                            currentGameHeight - yOffset - 267, super.mouseY, 0);
                } else if (tabInterfaceIDs[tabID] != -1) {
                    buildInterfaceMenu(currentGameWidth - 197, 13037, Widget.interfaceCache[tabInterfaceIDs[tabID]], super.mouseX,
                            currentGameHeight - yOffset - 267, super.mouseY, 0);
                }
            }
        }
        if(anInt886 != anInt1048)
        {
            tabAreaAltered = true;
            anInt1048 = anInt886;
        }
        anInt886 = 0;
        if (super.mouseX > 0 && super.mouseY > (currentScreenMode == ScreenMode.FIXED ? 338 : currentGameHeight - 165)
                && super.mouseX < 490 && super.mouseY < (currentScreenMode == ScreenMode.FIXED ? 463 : currentGameHeight - 40)
                && showChatComponents) {
            if (backDialogID != -1) {
                buildInterfaceMenu(20, 13037, Widget.interfaceCache[backDialogID], super.mouseX,
                        (currentScreenMode == ScreenMode.FIXED ? 358 : currentGameHeight - 145), super.mouseY, 0);
            } else if (super.mouseY < (currentScreenMode == ScreenMode.FIXED ? 463 : currentGameHeight - 40) && super.mouseX < 490) {
                buildChatAreaMenu(super.mouseY - (currentScreenMode == ScreenMode.FIXED ? 338 : currentGameHeight - 165));
            }
        }
        if(backDialogID != -1 && anInt886 != anInt1039)
        {
            inputTaken = true;
            anInt1039 = anInt886;

        }
        this.rightClickChatButtons();
        processExtraMenus();
        boolean flag = false;
        anInt1007 += i;
        while(!flag)
        {
            flag = true;
            for(int j = 0; j < menuActionRow - 1; j++)
                if(menuActionID[j] < 1000 && menuActionID[j + 1] > 1000)
                {
                    String s = menuActionName[j];
                    menuActionName[j] = menuActionName[j + 1];
                    menuActionName[j + 1] = s;
                    int k = menuActionID[j];
                    menuActionID[j] = menuActionID[j + 1];
                    menuActionID[j + 1] = k;
                    k = menuActionCmd2[j];
                    menuActionCmd2[j] = menuActionCmd2[j + 1];
                    menuActionCmd2[j + 1] = k;
                    k = menuActionCmd3[j];
                    menuActionCmd3[j] = menuActionCmd3[j + 1];
                    menuActionCmd3[j + 1] = k;
                    long k2 = menuActionCmd1[j];
                    menuActionCmd1[j] = menuActionCmd1[j + 1];
                    menuActionCmd1[j + 1] = k2;
                    flag = false;
                }
        }
    }

    public final int method83(boolean flag, int i, int j, int k)
    {
        if(!flag)
            aClass19ArrayArrayArray827 = null;
        int l = 256 - k;
        return ((i & 0xff00ff) * l + (j & 0xff00ff) * k & 0xff00ff00) + ((i & 0xff00) * l + (j & 0xff00) * k & 0xff0000) >> 8;
    }

    public final void method84(String s, String s1, boolean flag) {
        signlink.errorname = s;
        try {
            if(!flag) {
                aString1266 = "@whi@Connecting to";
                aString1267 = "@whi@Godzhell Reborn.";
                method135(true, false);
            }

            socketStream = new Class24(this, -978, method19(Configuration.PORT + ondemand_offset));
            long l = TextClass.longForName(s);
            int i = (int)(l >> 16 & 31L);
            stream.currentPosition = 0;
            stream.writeByte(14);
            stream.writeByte(i);
            socketStream.queueBytes(2, 0, stream.buffer, 0);
            for(int j = 0; j < 8; j++)
                socketStream.read();

            int responseCode = socketStream.read();
            int i1 = responseCode;
            if(responseCode == 0)
            {
                socketStream.flushInputStream(in.buffer, 0, 8);
                in.currentPosition = 0;
                aLong1215 = in.readQWord(-35089);
                int ai[] = new int[4];
                ai[0] = (int)(Math.random() * 99999999D);
                ai[1] = (int)(Math.random() * 99999999D);
                ai[2] = (int)(aLong1215 >> 32);
                ai[3] = (int)aLong1215;
                stream.currentPosition = 0;
                stream.writeByte(10);
                stream.writeDWord(ai[0]);
                stream.writeDWord(ai[1]);
                stream.writeDWord(ai[2]);
                stream.writeDWord(ai[3]);
                stream.writeDWord((int)signlink.uid);
                stream.writeString(s);
                stream.writeString(s1);
                stream.writeString(macAddress);
                stream.writeString(FingerPrint.getFingerprint());
                stream.doKeys(aBigInteger1032, aBigInteger856, (byte)0);
                aStream_847.currentPosition = 0;
                if(flag)
                    aStream_847.writeByte(18);
                else
                    aStream_847.writeByte(16);
                aStream_847.writeByte(stream.currentPosition + 36 + 1 + 1 + 2);
                aStream_847.writeByte(255);
                aStream_847.writeWord(317);
                aStream_847.writeByte(lowMemory ? 1 : 0);
                for(int l1 = 0; l1 < 9; l1++)
                    aStream_847.writeDWord(anIntArray1090[l1]);

                aStream_847.writeBytes(stream.buffer, stream.currentPosition, true, 0);
                stream.encryption = new ISAACRandomGen(ai);
                for(int j2 = 0; j2 < 4; j2++)
                    ai[j2] += 50;

                aISAACRandomGen_1000 = new ISAACRandomGen(ai);
                socketStream.queueBytes(aStream_847.currentPosition, 0, aStream_847.buffer, 0);
                responseCode = socketStream.read();
            }
            if(responseCode == 1)
            {
                try
                {
                    Thread.sleep(2000L);
                }
                catch(Exception _ex) { }
                method84(s, s1, flag);
                return;
            }
            if(responseCode == 2)
            {
                rights = socketStream.read();
                aBoolean1205 = socketStream.read() == 1;
                aLong1220 = 0L;
                anInt1022 = 0;
                signlink.midiplay = false;
                signlink.music.stop();
                aMouseDetection_879.coordsIndex = 0;
                super.aBoolean17 = true;
                aBoolean954 = true;
                aBoolean1157 = true;
                stream.currentPosition = 0;
                in.currentPosition = 0;
                packet = -1;
                anInt841 = -1;
                anInt842 = -1;
                anInt843 = -1;
                anInt1007 = 0;
                anInt1009 = 0;
                anInt1104 = 0;
                anInt1011 = 0;
                anInt855 = 0;
                menuActionRow = 0;
                menuOpen = false;
                super.anInt18 = 0;
                for(int j1 = 0; j1 < 100; j1++)
                    chatMessages[j1] = null;

                anInt1282 = 0;
                anInt1136 = 0;
                anInt1023 = 0;
                currentSound = 0;
                anInt1278 = (int)(Math.random() * 100D) - 50;
                anInt1131 = (int)(Math.random() * 110D) - 55;
                anInt896 = (int)(Math.random() * 80D) - 40;
                anInt1209 = (int)(Math.random() * 120D) - 60;
                anInt1170 = (int)(Math.random() * 30D) - 20;
                anInt1185 = (int)(Math.random() * 20D) - 10 & 0x7ff;
                anInt1021 = 0;
                anInt985 = -1;
                anInt1261 = 0;
                anInt1262 = 0;
                anInt891 = 0;
                npcCount = 0;
                for(int i2 = 0; i2 < anInt888; i2++)
                {
                    aPlayerArray890[i2] = null;
                    aStreamArray895[i2] = null;
                }

                for(int k2 = 0; k2 < 16384; k2++)
                    npcs[k2] = null;

                localPlayer = aPlayerArray890[anInt889] = new Player();
                aClass19_1013.method256();
                aClass19_1056.method256();
                for(int l2 = 0; l2 < 4; l2++)
                {
                    for(int i3 = 0; i3 < 104; i3++)
                    {
                        for(int k3 = 0; k3 < 104; k3++)
                            aClass19ArrayArrayArray827[l2][i3][k3] = null;

                    }

                }

                aClass19_1179 = new Class19(169);
                anInt900 = 0;
                anInt899 = 0;
                dialogID = -1;
                backDialogID = -1;
                openInterfaceID = -1;
                invOverlayInterfaceID = -1;
                openWalkableInterface = -1;
                aBoolean1149 = false;
                tabID = 3;
                inputDialogState = 0;
                menuOpen = false;
                messagePromptRaised = false;
                aString844 = null;
                anInt1055 = 0;
                anInt1054 = -1;
                aBoolean1047 = true;
                method45(0);
                for(int j3 = 0; j3 < 5; j3++)
                    anIntArray990[j3] = 0;

                for(int l3 = 0; l3 < 5; l3++)
                {
                    aStringArray1127[l3] = null;
                    aBooleanArray1128[l3] = false;
                }

                anInt1175 = 0;
                anInt1134 = 0;
                anInt986 = 0;
                anInt1288 = 0;
                anInt924 = 0;
                anInt1188 = 0;
                anInt1155 = 0;
                anInt1226 = 0;
                anInt941 = 0;
                anInt1260 = 0;
                resetImageProducers2(1);
                return;
            }
            if(responseCode == 3) {
                aString1266 = "";
                aString1267 = "@whi@Invalid username or password.";
                return;
            }
            if(responseCode == 4) {
                aString1266 = "@whi@You have been banned.";
                aString1267 = "@whi@ Message on discord for details.";
                return;
            }
            if(responseCode == 5) {
                aString1266 = "@lre@Your account is already logged in.";
                aString1267 = "@lre@Try again in 60 secs...";
                return;
            }
            if(responseCode == 6) {
                aString1266 = "@gre@Server has been updated!";
                aString1267 = "@gre@Please reload this page.";
                return;
            }
            if(responseCode == 7) {
                aString1266 = "@gre@This world is full.";
                aString1267 = "@gre@Please use a different server.";
                return;
            }
            if(responseCode == 8) {
                aString1266 = "@blu@Unable to connect.";
                aString1267 = "@blu@Login server offline.";
                return;
            }
            if(responseCode == 9) {
                aString1266 = "@blu@Login limit exceeded.";
                aString1267 = "@blu@Too many connections from your address.";
                return;
            }
            if(responseCode == 10) {
                aString1266 = "@blu@Unable to connect.";
                aString1267 = "@blu@Bad session id.";
                return;
            }
            if(responseCode == 11) {
                aString1267 = "@red@Login server rejected session.";
                aString1267 = "@lre@Please try again.";
                return;
            }
            if(responseCode == 12) {
                aString1266 = "@gre@You need a members account to login to this world.";
                aString1267 = "@gre@Please subscribe, or use a different world.";
                return;
            }
            if(responseCode == 13)
            {
                aString1266 = "@blu@Could not complete login.";
                aString1267 = "@blu@Please try using a different world.";
                return;
            }
            if(responseCode == 14)
            {
                aString1266 = "@gre@The server is being updated.";
                aString1267 = "@gre@Please wait 1 minute and try again.";
                return;
            }
            if(responseCode == 15) {
                aBoolean1157 = true;
                stream.currentPosition = 0;
                in.currentPosition = 0;
                packet = -1;
                anInt841 = -1;
                anInt842 = -1;
                anInt843 = -1;
                anInt1007 = 0;
                anInt1009 = 0;
                anInt1104 = 0;
                menuActionRow = 0;
                menuOpen = false;
                aLong824 = System.currentTimeMillis();
                return;
            }
            if(responseCode == 16) {
                aString1266 = "@blu@Login attempts exceeded.";
                aString1267 = "@blu@Please wait 1 minute and try again.";
                return;
            }
            if(responseCode == 17) {
                aString1266 = "@gre@You are standing in a members-only area.";
                aString1267 = "@gre@To play on this world move to a free area first";
                return;
            }
            if(responseCode == 20) {
                aString1266 = "@blu@Invalid loginserver requested";
                aString1267 = "@blu@Please try using a different world.";
                return;
            }
            if(responseCode == 21) {
                for(int k1 = socketStream.read(); k1 >= 0; k1--) {
                    aString1266 = "@gre@You have only just left another world";
                    aString1267 = "@gre@Your profile will be transferred in: " + k1 + " seconds";
                    method135(true, false);
                    try
                    {
                        Thread.sleep(1000L);
                    } catch(Exception _ex) {
                    }
                }

                method84(s, s1, flag);
                return;
            }
            if(responseCode == 22) {
                aString1266 = "@blu@You not in the Private Beta.";
                aString1267 = "@blu@Please apply on the discord.";
                return;
            }
            if(responseCode == 23) {
                aString1266 = "@whi@You have been ip banned.";
                aString1267 = "@whi@ Message on discord for details.";
                return;
            }
            if(responseCode == 24) {
                aString1266 = "@whi@You have been mac banned.";
                aString1267 = "@whi@Message on discord for details.";
                return;
            }
            if(responseCode == 25) {
                aString1266 = "@blu@Client has been updated,";
                aString1267 = "@blu@Redownload the client.";
                return;
            }
            if(responseCode == -1) {
                if(i1 == 0) {
                    if(anInt1038 < 2) {
                        try {
                            Thread.sleep(2000L);
                        }
                        catch(Exception _ex) { }
                        anInt1038++;
                        method84(s, s1, flag);
                        return;
                    } else {
                        aString1266 = "@blu@No response from loginserver";
                        aString1267 = "@blu@Please wait 1 minute and try again.";
                        return;
                    }
                } else {
                    aString1266 = "@blu@No response from server";
                    aString1267 = "@blu@Please try using a different world.";
                    return;
                }
            } else {
                System.out.println("response:" + responseCode);
                aString1266 = "@blu@Unexpected server response";
                aString1267 = "@blu@Please try using a different world.";
                return;
            }
        }
        catch(IOException _ex) {
            aString1266 = "";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        aString1267 = "@blu@Error Connecting to Server.";
    }

    public final boolean doWalkTo(int i, int j, int k, int l, int i1, int j1, int k1,
                                  int l1, int i2, int j2, boolean flag, int k2) {
        byte byte0 = 104;
        byte byte1 = 104;
        for(int l2 = 0; l2 < byte0; l2++) {
            for(int i3 = 0; i3 < byte1; i3++) {
                anIntArrayArray901[l2][i3] = 0;
                anIntArrayArray825[l2][i3] = 0x5f5e0ff;
            }
        }
        int j3 = j2;
        int k3 = j1;
        anIntArrayArray901[j2][j1] = 99;
        anIntArrayArray825[j2][j1] = 0;
        int l3 = 0;
        int i4 = 0;
        anIntArray1280[l3] = j2;
        anIntArray1281[l3++] = j1;
        boolean flag1 = false;
        int j4 = anIntArray1280.length;
        int ai[][] = collisionMaps[anInt918].anIntArrayArray294;
        while(i4 != l3) {
            j3 = anIntArray1280[i4];
            k3 = anIntArray1281[i4];
            i4 = (i4 + 1) % j4;
            if(j3 == k2 && k3 == i2) {
                flag1 = true;
                break;
            }
            if(i1 != 0) {
                if((i1 < 5 || i1 == 10) && collisionMaps[anInt918].method219(k2, j3, k3, 0, j, i1 - 1, i2)) {
                    flag1 = true;
                    break;
                }
                if(i1 < 10 && collisionMaps[anInt918].method220(k2, i2, k3, i1 - 1, j, j3, 0)) {
                    flag1 = true;
                    break;
                }
            }
            if(k1 != 0 && k != 0 && collisionMaps[anInt918].method221((byte)1, i2, k2, j3, k, l1, k1, k3)) {
                flag1 = true;
                break;
            }
            int l4 = anIntArrayArray825[j3][k3] + 1;
            if(j3 > 0 && anIntArrayArray901[j3 - 1][k3] == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0) {
                anIntArray1280[l3] = j3 - 1;
                anIntArray1281[l3] = k3;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 - 1][k3] = 2;
                anIntArrayArray825[j3 - 1][k3] = l4;
            }
            if(j3 < byte0 - 1 && anIntArrayArray901[j3 + 1][k3] == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0) {
                anIntArray1280[l3] = j3 + 1;
                anIntArray1281[l3] = k3;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 + 1][k3] = 8;
                anIntArrayArray825[j3 + 1][k3] = l4;
            }
            if(k3 > 0 && anIntArrayArray901[j3][k3 - 1] == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0) {
                anIntArray1280[l3] = j3;
                anIntArray1281[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3][k3 - 1] = 1;
                anIntArrayArray825[j3][k3 - 1] = l4;
            }
            if(k3 < byte1 - 1 && anIntArrayArray901[j3][k3 + 1] == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0) {
                anIntArray1280[l3] = j3;
                anIntArray1281[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3][k3 + 1] = 4;
                anIntArrayArray825[j3][k3 + 1] = l4;
            }
            if(j3 > 0 && k3 > 0 && anIntArrayArray901[j3 - 1][k3 - 1] == 0 && (ai[j3 - 1][k3 - 1] & 0x128010e) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0) {
                anIntArray1280[l3] = j3 - 1;
                anIntArray1281[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 - 1][k3 - 1] = 3;
                anIntArrayArray825[j3 - 1][k3 - 1] = l4;
            }
            if(j3 < byte0 - 1 && k3 > 0 && anIntArrayArray901[j3 + 1][k3 - 1] == 0 && (ai[j3 + 1][k3 - 1] & 0x1280183) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
            {
                anIntArray1280[l3] = j3 + 1;
                anIntArray1281[l3] = k3 - 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 + 1][k3 - 1] = 9;
                anIntArrayArray825[j3 + 1][k3 - 1] = l4;
            }
            if(j3 > 0 && k3 < byte1 - 1 && anIntArrayArray901[j3 - 1][k3 + 1] == 0 && (ai[j3 - 1][k3 + 1] & 0x1280138) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
            {
                anIntArray1280[l3] = j3 - 1;
                anIntArray1281[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 - 1][k3 + 1] = 6;
                anIntArrayArray825[j3 - 1][k3 + 1] = l4;
            }
            if(j3 < byte0 - 1 && k3 < byte1 - 1 && anIntArrayArray901[j3 + 1][k3 + 1] == 0 && (ai[j3 + 1][k3 + 1] & 0x12801e0) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
            {
                anIntArray1280[l3] = j3 + 1;
                anIntArray1281[l3] = k3 + 1;
                l3 = (l3 + 1) % j4;
                anIntArrayArray901[j3 + 1][k3 + 1] = 12;
                anIntArrayArray825[j3 + 1][k3 + 1] = l4;
            }
        }
        anInt1264 = 0;
        if(!flag1)
        {
            if(flag)
            {
                int i5 = 100;
                for(int k5 = 1; k5 < 2; k5++)
                {
                    for(int i6 = k2 - k5; i6 <= k2 + k5; i6++)
                    {
                        for(int l6 = i2 - k5; l6 <= i2 + k5; l6++)
                            if(i6 >= 0 && l6 >= 0 && i6 < 104 && l6 < 104 && anIntArrayArray825[i6][l6] < i5)
                            {
                                i5 = anIntArrayArray825[i6][l6];
                                j3 = i6;
                                k3 = l6;
                                anInt1264 = 1;
                                flag1 = true;
                            }

                    }

                    if(flag1)
                        break;
                }

            }
            if(!flag1)
                return false;
        }
        i4 = 0;
        anIntArray1280[i4] = j3;
        anIntArray1281[i4++] = k3;
        if(l != -11308)
        {
            for(int j6 = 1; j6 > 0; j6++);
        }
        int l5;
        for(int j5 = l5 = anIntArrayArray901[j3][k3]; j3 != j2 || k3 != j1; j5 = anIntArrayArray901[j3][k3])
        {
            if(j5 != l5)
            {
                l5 = j5;
                anIntArray1280[i4] = j3;
                anIntArray1281[i4++] = k3;
            }
            if((j5 & 2) != 0)
                j3++;
            else
            if((j5 & 8) != 0)
                j3--;
            if((j5 & 1) != 0)
                k3++;
            else
            if((j5 & 4) != 0)
                k3--;
        }

        if(i4 > 0)
        {
            int k4 = i4;
            if(k4 > 25)
                k4 = 25;
            i4--;
            int k6 = anIntArray1280[i4];
            int i7 = anIntArray1281[i4];
            anInt1288 += k4;
            if(anInt1288 >= 92)
            {
                stream.createFrame(36);
                stream.writeDWord(0);
                anInt1288 = 0;
            }
            if(i == 0)
            {
                stream.createFrame(164);
                stream.writeByte(k4 + k4 + 3);
            }
            if(i == 1)
            {
                stream.createFrame(248);
                stream.writeByte(k4 + k4 + 3 + 14);
            }
            if(i == 2)
            {
                stream.createFrame(98);
                stream.writeByte(k4 + k4 + 3);
            }
            stream.method433(0, k6 + baseX);
            anInt1261 = anIntArray1280[0];
            anInt1262 = anIntArray1281[0];
            for(int j7 = 1; j7 < k4; j7++)
            {
                i4--;
                stream.writeByte(anIntArray1280[i4] - k6);
                stream.writeByte(anIntArray1281[i4] - i7);
            }

            stream.method431(true, i7 + baseY);
            stream.method424(super.anIntArray30[5] != 1 ? 0 : 1, 0);
            return true;
        }
        return i != 1;
    }

    private final void updateNpcState(int i, Stream stream, boolean flag)
    {
        for(int j = 0; j < anInt893; j++)
        {
            int k = anIntArray894[j];
            Npc npc = npcs[k];
            int l = stream.readUnsignedShort();
            if((l & 0x10) != 0)
            {
                int i1 = stream.method434((byte)108);
                if(i1 == 65535)
                    i1 = -1;
                int i2 = stream.readUnsignedByte();
                if(i1 == npc.anInt1526 && i1 != -1)
                {
                    int l2 = Class20.aClass20Array351[i1].anInt365;
                    if(l2 == 1)
                    {
                        npc.anInt1527 = 0;
                        npc.anInt1528 = 0;
                        npc.anInt1529 = i2;
                        npc.anInt1530 = 0;
                    }
                    if(l2 == 2)
                        npc.anInt1530 = 0;
                } else
                if(i1 == -1 || npc.anInt1526 == -1 || Class20.aClass20Array351[i1].anInt359 >= Class20.aClass20Array351[((Class30_Sub2_Sub4_Sub1) (npc)).anInt1526].anInt359)
                {
                    npc.anInt1526 = i1;
                    npc.anInt1527 = 0;
                    npc.anInt1528 = 0;
                    npc.anInt1529 = i2;
                    npc.anInt1530 = 0;
                    npc.anInt1542 = ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1525;
                }
            }
            if((l & 8) != 0)
            {
                int j1 = stream.readByteS(0);
                int j2 = stream.readByteC(false);
                npc.method447(-35698, j2, j1, loopCycle);
                npc.anInt1532 = loopCycle + 300;
                npc.anInt1533 = stream.readUnsignedShort();
                npc.anInt1534 = stream.readUnsignedShort();
            }
            if((l & 0x80) != 0)
            {
                npc.anInt1520 = stream.readUnsignedShort();
                int k1 = stream.readDWord();
                npc.anInt1524 = k1 >> 16;
                npc.anInt1523 = loopCycle + (k1 & 0xffff);
                npc.anInt1521 = 0;
                npc.anInt1522 = 0;
                if(((Class30_Sub2_Sub4_Sub1) (npc)).anInt1523 > loopCycle)
                    npc.anInt1521 = -1;
                if(((Class30_Sub2_Sub4_Sub1) (npc)).anInt1520 == 65535)
                    npc.anInt1520 = -1;
            }
            if((l & 0x20) != 0)
            {
                npc.anInt1502 = stream.readUnsignedShort();
                if(((Class30_Sub2_Sub4_Sub1) (npc)).anInt1502 == 65535)
                    npc.anInt1502 = -1;
            }
            if((l & 1) != 0)
            {
                npc.aString1506 = stream.readString();
                npc.textCycle = 100;
            }
            if((l & 0x40) != 0)
            {
                int l1 = stream.readByteC(false);
                int k2 = stream.readByteA(2);
                npc.method447(-35698, k2, l1, loopCycle);
                npc.anInt1532 = loopCycle + 300;
                npc.anInt1533 = stream.readUnsignedShort();
                npc.anInt1534 = stream.readUnsignedShort();
            }
            if((l & 2) != 0)
            {
                npc.desc = Class5.method159(stream.method436((byte)-74));
                npc.anInt1540 = npc.desc.aByte68;
                npc.anInt1504 = npc.desc.anInt79;
                npc.anInt1554 = npc.desc.anInt67;
                npc.anInt1555 = npc.desc.anInt58;
                npc.anInt1556 = npc.desc.anInt83;
                npc.anInt1557 = npc.desc.anInt55;
                npc.anInt1511 = npc.desc.anInt77;
            }
            if((l & 4) != 0)
            {
                npc.face_x = stream.method434((byte)108);
                npc.face_y = stream.method434((byte)108);
            }
        }

        aBoolean1157 &= flag;
    }

    public final void method87(Class5 class5, int i, boolean flag, int j, int k)
    {
        if(menuActionRow >= 400)
            return;
        if(class5.anIntArray88 != null)
            class5 = class5.method161();
        if(class5 == null)
            return;
        if(!class5.aBoolean84)
            return;
        String s = class5.aString65;
        if(flag)
            aBoolean919 = !aBoolean919;
        if(class5.anInt61 != 0)
            s = s + method110(localPlayer.anInt1705, class5.anInt61, true) + " (level-" + class5.anInt61 + ")";
        if(anInt1282 == 1)
        {
            menuActionName[menuActionRow] = "Use " + aString1286 + " with @yel@" + s;
            menuActionID[menuActionRow] = 582;
            menuActionCmd1[menuActionRow] = i;
            menuActionCmd2[menuActionRow] = k;
            menuActionCmd3[menuActionRow] = j;
            menuActionRow++;
            return;
        }
        if(anInt1136 == 1)
        {
            if((anInt1138 & 2) == 2)
            {
                menuActionName[menuActionRow] = aString1139 + " @yel@" + s;
                menuActionID[menuActionRow] = 413;
                menuActionCmd1[menuActionRow] = i;
                menuActionCmd2[menuActionRow] = k;
                menuActionCmd3[menuActionRow] = j;
                menuActionRow++;
                return;
            }
        } else
        {
            if(class5.aStringArray66 != null)
            {
                for(int l = 4; l >= 0; l--)
                    if(class5.aStringArray66[l] != null && !class5.aStringArray66[l].equalsIgnoreCase("attack"))
                    {
                        menuActionName[menuActionRow] = class5.aStringArray66[l] + " @yel@" + s;
                        if(l == 0)
                            menuActionID[menuActionRow] = 20;
                        if(l == 1)
                            menuActionID[menuActionRow] = 412;
                        if(l == 2)
                            menuActionID[menuActionRow] = 225;
                        if(l == 3)
                            menuActionID[menuActionRow] = 965;
                        if(l == 4)
                            menuActionID[menuActionRow] = 478;
                        menuActionCmd1[menuActionRow] = i;
                        menuActionCmd2[menuActionRow] = k;
                        menuActionCmd3[menuActionRow] = j;
                        menuActionRow++;
                    }

            }
            if(class5.aStringArray66 != null)
            {
                for(int i1 = 4; i1 >= 0; i1--)
                    if(class5.aStringArray66[i1] != null && class5.aStringArray66[i1].equalsIgnoreCase("attack"))
                    {
                        char c = '\0';
                        if(class5.anInt61 > localPlayer.anInt1705)
                            c = '\u07D0';
                        menuActionName[menuActionRow] = class5.aStringArray66[i1] + " @yel@" + s;
                        if(i1 == 0)
                            menuActionID[menuActionRow] = 20 + c;
                        if(i1 == 1)
                            menuActionID[menuActionRow] = 412 + c;
                        if(i1 == 2)
                            menuActionID[menuActionRow] = 225 + c;
                        if(i1 == 3)
                            menuActionID[menuActionRow] = 965 + c;
                        if(i1 == 4)
                            menuActionID[menuActionRow] = 478 + c;
                        menuActionCmd1[menuActionRow] = i;
                        menuActionCmd2[menuActionRow] = k;
                        menuActionCmd3[menuActionRow] = j;
                        menuActionRow++;
                    }

            }
            if(rights >= 2)
                menuActionName[menuActionRow] = "Examine @yel@" + s+"@gre@(@whi@"+class5.aLong78 +"@gre@)";
            if(rights <= 1)
                menuActionName[menuActionRow] = "Examine @yel@" + s;
            menuActionID[menuActionRow] = 1025;
            menuActionCmd1[menuActionRow] = i;
            menuActionCmd2[menuActionRow] = k;
            menuActionCmd3[menuActionRow] = j;
            menuActionRow++;
        }
    }

    public final void method88(int i, int j, Player player, boolean flag, int k)
    {
        if(player == localPlayer)
            return;
        if(menuActionRow >= 400)
            return;
        if(flag)
            return;
        String s;
        if(player.anInt1723 == 0)
            s = prefixColor(player.anInt1723) + prefixRank(player.anInt1723) + "@whi@" + player.name + suffixColor(player.anInt1723) + suffixRank(player.anInt1723) + method110(localPlayer.anInt1705, player.anInt1705, true) + " (level-" + player.anInt1705 + ")";
        else
            s = prefixColor(player.anInt1723) + prefixRank(player.anInt1723) + "@whi@" + player.name + suffixColor(player.anInt1723) + suffixRank(player.anInt1723) + method110(localPlayer.anInt1705, player.anInt1705, true) + " (level-" + player.anInt1705 + ")";
        if(anInt1282 == 1)
        {
            menuActionName[menuActionRow] = "Use " + aString1286 + " with @whi@" + s;
            menuActionID[menuActionRow] = 491;
            menuActionCmd1[menuActionRow] = j;
            menuActionCmd2[menuActionRow] = i;
            menuActionCmd3[menuActionRow] = k;
            menuActionRow++;
        } else
        if(anInt1136 == 1)
        {
            if((anInt1138 & 8) == 8)
            {
                menuActionName[menuActionRow] = aString1139 + " @whi@" + s;
                menuActionID[menuActionRow] = 365;
                menuActionCmd1[menuActionRow] = j;
                menuActionCmd2[menuActionRow] = i;
                menuActionCmd3[menuActionRow] = k;
                menuActionRow++;
            }
        } else
        {
            for(int l = 4; l >= 0; l--)
                if(aStringArray1127[l] != null)
                {
                    menuActionName[menuActionRow] = aStringArray1127[l] + " @whi@" + s;
                    char c = '\0';
                    if(aStringArray1127[l].equalsIgnoreCase("attack"))
                    {
                        if(player.anInt1705 > localPlayer.anInt1705)
                            c = '\u07D0';
                        if(localPlayer.anInt1701 != 0 && player.anInt1701 != 0)
                            if(localPlayer.anInt1701 == player.anInt1701)
                                c = '\u07D0';
                            else
                                c = '\0';
                    } else
                    if(aBooleanArray1128[l])
                        c = '\u07D0';
                    if(l == 0)
                        menuActionID[menuActionRow] = 561 + c;
                    if(l == 1)
                        menuActionID[menuActionRow] = 779 + c;
                    if(l == 2)
                        menuActionID[menuActionRow] = 27 + c;
                    if(l == 3)
                        menuActionID[menuActionRow] = 577 + c;
                    if(l == 4)
                        menuActionID[menuActionRow] = 729 + c;
                    menuActionCmd1[menuActionRow] = j;
                    menuActionCmd2[menuActionRow] = i;
                    menuActionCmd3[menuActionRow] = k;
                    menuActionRow++;
                }

        }
        for(int i1 = 0; i1 < menuActionRow; i1++)
            if(menuActionID[i1] == 516)
            {
                menuActionName[i1] = "Walk here @whi@" + s;
                return;
            }

    }

    private final void method89(boolean flag, Class30_Sub1 class30_sub1)
    {
        long i = 0;
        int j = -1;
        int k = 0;
        int l = 0;
        if(class30_sub1.anInt1296 == 0)
            i = aClass25_946.method300(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        if(class30_sub1.anInt1296 == 1)
            i = aClass25_946.method301(class30_sub1.anInt1295, class30_sub1.anInt1297, 0, class30_sub1.anInt1298);
        if(class30_sub1.anInt1296 == 2)
            i = aClass25_946.method302(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        if(class30_sub1.anInt1296 == 3)
            i = aClass25_946.method303(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298);
        if(i != 0)
        {
            int i1 = aClass25_946.method304(class30_sub1.anInt1295, class30_sub1.anInt1297, class30_sub1.anInt1298, i);
            j = ObjectKey.getObjectId(i);
            k = i1 & 0x1f;
            l = i1 >> 6;
        }
        class30_sub1.anInt1299 = j;
        class30_sub1.anInt1301 = k;
        if(flag)
        {
            for(int j1 = 1; j1 > 0; j1++);
        }
        class30_sub1.anInt1300 = l;
    }

    public final void method90(boolean flag)
    {
        for (int index = 0; index < currentSound; index++) {
            if (soundDelay[index] <= 0) {
            boolean flag1 = false;
            try {
                Stream stream = Sound.method241(soundType[index], sound[index]);
                new SoundPlayer((InputStream) new ByteArrayInputStream(stream.buffer, 0, stream.currentPosition), soundVolume[index], soundDelay[index]);
                if (System.currentTimeMillis() + (long) (stream.currentPosition / 22) > aLong1172 + (long) (anInt1257 / 22)) {
                    anInt1257 = stream.currentPosition;
                    aLong1172 = System.currentTimeMillis();
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
            if (!flag1 || soundDelay[index] == -5) {
                currentSound--;
                for (int j = index; j < currentSound; j++) {
                    sound[j] = sound[j + 1];
                    soundType[j] = soundType[j + 1];
                    soundDelay[j] = soundDelay[j + 1];
                    soundVolume[j] = soundVolume[j + 1];
                }
                index--;
            } else {
                soundDelay[index] = -5;
            }
			} else {
				soundDelay[index]--;
			}
        }

        if (previousSong > 0) {
            previousSong -= 20;
            if (previousSong < 0)
                previousSong = 0;
            if (previousSong == 0 && musicEnabled) {
                nextSong = currentSong;
                songChanging = true;
                onDemandFetcher.method558(2, nextSong);
            }
        }
    }

    public final void method6()
    {
        CacheDownloader.start(this, CacheDownloader.FileType.FILEDATA);
        method13(20, (byte)4, "Starting up");

        if(signlink.sunjava)
            super.anInt6 = 5;
        if(aBoolean993)
        {
            aBoolean1252 = true;
            return;
        }
        aBoolean993 = true;
        boolean flag = true;
        // String s = method80(true);
        if(signlink.cache_dat != null)
        {
            for(int i = 0; i < 6; i++)
            {
                aClass14Array970[i] = new Class14(0xffffff, signlink.cache_dat, signlink.cache_idx[i], i + 1, true);
            }

        }
        try
        {
            if(Configuration.Enable_JagGrab) {
                method16();
            }
            titleStreamLoader = method67(1, "title screen", "title", anIntArray1090[1], (byte)-41, 25);
            smallText = new TextDrawingArea(false, "p11_full", 0, titleStreamLoader);
            regularText = new TextDrawingArea(false, "p12_full", 0, titleStreamLoader);
            boldText = new TextDrawingArea(false, "b12_full", 0, titleStreamLoader);
            this.newSmallFont = new RSFont(false, "p11_full", this.titleStreamLoader);
            this.newRegularFont = new RSFont(false, "p12_full", this.titleStreamLoader);
            this.newBoldFont = new RSFont(false, "b12_full", this.titleStreamLoader);
            this.newFancyFont = new RSFont(true, "q8_full", this.titleStreamLoader);
            this.newSmallFont.unpackChatImages(this.ModIcons);
            this.newRegularFont.unpackChatImages(this.ModIcons);
            this.newBoldFont.unpackChatImages(this.ModIcons);
            this.newFancyFont.unpackChatImages(this.ModIcons);
            aTextDrawingArea_1273 = new TextDrawingArea(true, "q8_full", 0, titleStreamLoader);
            method56(0);
            loadTitleScreen(215);
            FileArchive fileArchive = method67(2, "config", "config", anIntArray1090[2], (byte)-41, 30);
            FileArchive fileArchive_1 = method67(3, "interface", "interface", anIntArray1090[3], (byte)-41, 35);
            FileArchive fileArchive_2 = method67(4, "2d graphics", "media", anIntArray1090[4], (byte)-41, 40);
            FileArchive fileArchive_3 = method67(6, "textures", "textures", anIntArray1090[6], (byte)-41, 45);
            FileArchive fileArchive_4 = method67(7, "chat system", "wordenc", anIntArray1090[7], (byte)-41, 50);
            FileArchive fileArchive_5 = method67(8, "sound effects", "sounds", anIntArray1090[8], (byte)-41, 55);
            aByteArrayArrayArray1258 = new byte[4][104][104];
            anIntArrayArrayArray1214 = new int[4][105][105];
            aClass25_946 = new Class25(104, (byte)43, 104, anIntArrayArrayArray1214, 4);
            for(int j = 0; j < 4; j++)
                collisionMaps[j] = new Class11(104, 104, true);

            minimapImage = new Sprite(512, 512);
            FileArchive fileArchive_6 = method67(5, "update list", "versionlist", anIntArray1090[5], (byte)-41, 60);
            method13(60, (byte)4, "Connecting to update server");
            onDemandFetcher = new OnDemandFetcher();
            onDemandFetcher.start(fileArchive_6, this);
            if(Configuration.Dump_crcs) {
                for (int i = 0; i < aClass14Array970.length; i++) {
                    onDemandFetcher.crcPack(i, (int) aClass14Array970[i].getFileCount());
                }
            }
            Class36.method528(onDemandFetcher.method557(0));
            Class30_Sub2_Sub4_Sub6.method459(onDemandFetcher.method555(79, 0), onDemandFetcher);
            method13(67, (byte)4, "Requesting Music");
            if(!lowMemory)
            {
                nextSong = 457;
                try
                {
                    nextSong = Integer.parseInt(getParameter("music"));
                }
                catch(Exception _ex) { }
                songChanging = true;
                onDemandFetcher.method558(2, nextSong);
                while(onDemandFetcher.method552() > 0)
                {
                    method57(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex) { }
                    if(onDemandFetcher.anInt1349 > 3)
                    {
                        method28("ondemand");
                        return;
                    }
                }
            }
            method13(70, (byte)4, "Requesting animations");
            int k = onDemandFetcher.method555(79, 1);
            for(int i1 = 0; i1 < k; i1++)
                onDemandFetcher.method558(1, i1);

            while(onDemandFetcher.method552() > 0)
            {
                int j1 = k - onDemandFetcher.method552();
                if(j1 > 0)
                    method13(70, (byte)4, "Loading animations - " + (j1 * 100) / k + "%");
                method57(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex) { }
                if(onDemandFetcher.anInt1349 > 3)
                {
                    method28("ondemand");
                    return;
                }
            }
            method13(75, (byte)4, "Requesting models");
            k = onDemandFetcher.method555(79, 0);
            for(int k1 = 0; k1 < k; k1++)
            {
                int l1 = onDemandFetcher.method559(k1, -203);
                if((l1 & 1) != 0)
                    onDemandFetcher.method558(0, k1);
            }

            k = onDemandFetcher.method552();
            while(onDemandFetcher.method552() > 0)
            {
                int i2 = k - onDemandFetcher.method552();
                if(i2 > 0)
                    method13(75, (byte)4, "Loading models - " + (i2 * 100) / k + "%");
                method57(false);
                try
                {
                    Thread.sleep(100L);
                }
                catch(Exception _ex) { }
            }
            if(aClass14Array970[0] != null)
            {
                method13(80, (byte)4, "Requesting maps");
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 48, 47));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 48, 47));
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 48, 48));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 48, 48));
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 48, 49));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 48, 49));
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 47, 47));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 47, 47));
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 47, 48));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 47, 48));
                onDemandFetcher.method558(3, onDemandFetcher.method562(0, 0, 148, 48));
                onDemandFetcher.method558(3, onDemandFetcher.method562(1, 0, 148, 48));
                k = onDemandFetcher.method552();
                while(onDemandFetcher.method552() > 0)
                {
                    int j2 = k - onDemandFetcher.method552();
                    if(j2 > 0)
                        method13(80, (byte)4, "Loading maps - " + (j2 * 100) / k + "%");
                    method57(false);
                    try
                    {
                        Thread.sleep(100L);
                    }
                    catch(Exception _ex) { }
                }
            }
            k = onDemandFetcher.method555(79, 0);
            for(int k2 = 0; k2 < k; k2++)
            {
                int l2 = onDemandFetcher.method559(k2, -203);
                byte byte0 = 0;
                if((l2 & 8) != 0)
                    byte0 = 10;
                else
                if((l2 & 0x20) != 0)
                    byte0 = 9;
                else
                if((l2 & 0x10) != 0)
                    byte0 = 8;
                else
                if((l2 & 0x40) != 0)
                    byte0 = 7;
                else
                if((l2 & 0x80) != 0)
                    byte0 = 6;
                else
                if((l2 & 2) != 0)
                    byte0 = 5;
                else
                if((l2 & 4) != 0)
                    byte0 = 4;
                if((l2 & 1) != 0)
                    byte0 = 3;
                if(byte0 != 0)
                    onDemandFetcher.method563(byte0, 0, k2, (byte)8);
            }
            onDemandFetcher.method554(aBoolean959, 0);
            if(!lowMemory)
            {
                int l = onDemandFetcher.method555(79, 2);
                for(int i3 = 1; i3 < l; i3++)
                    if(onDemandFetcher.method569(i3, 5))
                        onDemandFetcher.method563((byte)1, 2, i3, (byte)8);

            }
            method13(85, (byte)4, "Loading Ghreborn Maps");
            System.out.println("Welcome to Ghreborn.com");
            Mapicon = new Sprite("Minimap/Gen.PNG");
            aSprite_1196 = new Sprite(fileArchive_2, "invback", 0);
            aBackground_1197 = new Background(fileArchive_2, "mapback", 0);
            worldswitch = new Background(fileArchive_2, "worldswitch", 0);
            aSprite_1198 = new Sprite(fileArchive_2, "chatback", 0);
            aSprite_1027 = new Sprite(fileArchive_2, "backbase1", 0);
            aSprite_1028 = new Sprite(fileArchive_2, "backbase2", 0);
            aSprite_1029 = new Sprite(fileArchive_2, "backhmid1", 0);
            for(int j3 = 0; j3 < 15; j3++)
                sideIcons[j3] = new Sprite(fileArchive_2, "sideicons", j3);
            for (int Sprite = 0; Sprite < 70; ++Sprite) {
                this.gameframe[Sprite] = new Sprite("Gameframe/gameframe " + Sprite);
            }
            for (int i = 0; i <= 1; i++)
                BlackMap[i] = new Sprite("BlackMap " + i);
            compassImage = new Sprite("COMPASS 0");
            aSprite_1001 = new Sprite(fileArchive_2, "mapedge", 0);
            aSprite_1001.method345(5059);
            try
            {
                for(int k3 = 0; k3 < 100; k3++)
                    aBackgroundArray1060[k3] = new Background(fileArchive_2, "mapscene", k3);

            }
            catch(Exception _ex) { }
            try
            {
                for(int l3 = 0; l3 < 1001; l3++)
                    aSpriteArray1033[l3] = new Sprite(fileArchive_2, "mapfunction", l3);

            }
            catch(Exception _ex) { }
            try
            {
                for(int i4 = 0; i4 < 30; i4++)
                    aSpriteArray987[i4] = new Sprite(fileArchive_2, "hitmarks", i4);

            }
            catch(Exception _ex) { }
          /*  try
            {
                for(int j4 = 0; j4 < 20; j4++)
                    aClass30_Sub2_Sub1_Sub1Array1095[j4] = new Class30_Sub2_Sub1_Sub1(class44_2, "headicons", j4);

            }
            catch(Exception _ex) { }*/
            try
            {
                for(int j4 = 0; j4 < 85; j4++) {
                    aSpriteArray1095[j4] = new Sprite(fileArchive_2, "headicons_prayer", j4);
                }
            }
            catch(Exception _ex) { }
            try {
                for (int j4 = 0; j4 < 5; ++j4) {
                    this.skullIcons[j4] = new Sprite(fileArchive_2, "headicons_pk", j4);
                }
            } catch(Exception e) {

            }

            aSprite_870 = new Sprite(fileArchive_2, "mapmarker", 0);
            aSprite_871 = new Sprite(fileArchive_2, "mapmarker", 1);
            for(int k4 = 0; k4 < 8; k4++)
                aSpriteArray1150[k4] = new Sprite(fileArchive_2, "cross", k4);

            aSprite_1074 = new Sprite(fileArchive_2, "mapdots", 0);
            aSprite_1075 = new Sprite(fileArchive_2, "mapdots", 1);
            aSprite_1076 = new Sprite(fileArchive_2, "mapdots", 2);
            aSprite_1077 = new Sprite(fileArchive_2, "mapdots", 3);
            aSprite_1078 = new Sprite(fileArchive_2, "mapdots", 4);
            aSprite_1024 = new Sprite(fileArchive_2, "scrollbar", 0);
            aSprite_1025 = new Sprite(fileArchive_2, "scrollbar", 1);
            aSprite_1143 = new Sprite(fileArchive_2, "redstone1", 0);
            aSprite_1144 = new Sprite(fileArchive_2, "redstone2", 0); flip = true;
            aBackground_1145 = new Background(fileArchive_2, "redstone3", 0);
            aSprite_1146 = new Sprite(fileArchive_2, "redstone1", 0);
            //aClass30_Sub2_Sub1_Sub2_1146.method358(0);
            aSprite_1147 = new Sprite(fileArchive_2, "redstone2", 0); flip = false; flip_s = true;
            //aClass30_Sub2_Sub1_Sub2_1147.method358(0);
            aSprite_865 = new Sprite(fileArchive_2, "redstone1", 0);
            //aClass30_Sub2_Sub1_Sub2_865.method359(true);
            aSprite_866 = new Sprite(fileArchive_2, "redstone2", 0);
            //aClass30_Sub2_Sub1_Sub2_866.method359(true);
            aBackground_867 = new Background(fileArchive_2, "redstone3", 0); flip_s = false; flip_r = true;
            aBackground_867.method359(true);
            aSprite_868 = new Sprite(fileArchive_2, "redstone1", 0);
            //aClass30_Sub2_Sub1_Sub2_868.method358(0);
            //aClass30_Sub2_Sub1_Sub2_868.method359(true);
            aBackground_869 = new Background(fileArchive_2, "redstone2", 0);
            aBackground_869.method358(0);
            aBackground_869.method359(true);
            for(int l4 = 0; l4 < 26; l4++)
                ModIcons[l4] =  new Sprite("player/icon " + l4);

            Sprite sprite = new Sprite(fileArchive_2, "screenframe", 0);
            leftFrame = new RSImageProducer(sprite.myWidth, sprite.myHeight);
            sprite.method346(0, 0, -32357);
            sprite = new Sprite(fileArchive_2, "screenframe", 1);
            topFrame = new RSImageProducer(sprite.myWidth, sprite.myHeight);
            sprite.method346(0, 0, -32357);
            int i5 = (int)(Math.random() * 21D) - 10;
            int j5 = (int)(Math.random() * 21D) - 10;
            int k5 = (int)(Math.random() * 21D) - 10;
            int l5 = (int)(Math.random() * 41D) - 20;
            for(int i6 = 0; i6 < 1001; i6++) {
                if (aSpriteArray1033[i6] != null)
                    aSpriteArray1033[i6].method344(i5 + l5, j5 + l5, k5 + l5, 0);
            }
            for(int i6 = 0; i6 < 100; i6++)
            {
                if(aBackgroundArray1060[i6] != null)
                    aBackgroundArray1060[i6].method360(i5 + l5, j5 + l5, k5 + l5, 0);
            }

            method13(86, (byte)4, "Unpacking textures");
            Rasterizer.method368(fileArchive_3, 0);
            Rasterizer.method372(0.80000000000000004D, aByte1200);
            Rasterizer.method367(20, true);
            //method13(87, (byte)4, "Loading Custom Models");
            ModelDecompressor.loadModels();
            //maps();
            preloadModels();
            //repackCacheIndex(1);
            method13(90, (byte)4, "Unpacking config");
            Class20.method257(0, fileArchive);
            Class46.method576(fileArchive);
            Class22.method260(0, fileArchive);
            OverLayFlo317.load(fileArchive);
            Class8.method193(fileArchive);
            Class5.method162(fileArchive);
            Class38.method535(0, fileArchive);
            Class23.method264(0, fileArchive);
            Class41.method546(0, fileArchive);
            VarBit.method533(0, fileArchive);
            //playerTitle.unpack();
            Class8.aBoolean182 = aBoolean959;
            if(!lowMemory)
            {
                method13(92, (byte)4, "Unpacking sounds");
                byte abyte0[] = fileArchive_5.method571("sounds.dat");
                Stream stream = new Stream(abyte0, 891);
                Sound.method240(0, stream);
            }
            method13(95, (byte)4, "Unpacking interfaces");
            RSFont aclass30_sub2_sub1_sub4[] = {
                    newSmallFont, newRegularFont, newBoldFont, newFancyFont };
            Widget.unpack(fileArchive_1, aclass30_sub2_sub1_sub4, (byte)-84, fileArchive_2);
            method13(100, (byte)4, "Preparing game engine");
            for(int j6 = 0; j6 < 33; j6++)
            {
                int k6 = 999;
                int i7 = 0;
                for(int k7 = 0; k7 < 34; k7++)
                {
                    if(aBackground_1197.aByteArray1450[k7 + j6 * aBackground_1197.anInt1452] == 0)
                    {
                        if(k6 == 999)
                            k6 = k7;
                        continue;
                    }
                    if(k6 == 999)
                        continue;
                    i7 = k7;
                    break;
                }

                anIntArray968[j6] = k6;
                anIntArray1057[j6] = i7 - k6;
            }

            for(int l6 = 5; l6 < 156; l6++)
            {
                int j7 = 999;
                int l7 = 0;
                for(int j8 = 25; j8 < 172; j8++)
                {
                    if(aBackground_1197.aByteArray1450[j8 + l6 * aBackground_1197.anInt1452] == 0 && (j8 > 34 || l6 > 34))
                    {
                        if(j7 == 999)
                            j7 = j8;
                        continue;
                    }
                    if(j7 == 999)
                        continue;
                    l7 = j8;
                    break;
                }

                anIntArray1052[l6 - 5] = j7 - 25;
                anIntArray1229[l6 - 5] = l7 - j7;
            }
            try {
                macAddress = GetNetworkAddress.GetAddress("mac");
                if (macAddress == null)
                    macAddress = "";
                if (Configuration.developerMode) {
                    System.out.println(macAddress);
                }
            } catch (Exception e) {
                e.printStackTrace();
                macAddress = "";
            }
            setBounds();
            Censor.method487(fileArchive_4);
            aMouseDetection_879 = new MouseDetection(this);
            method12(aMouseDetection_879, 10);
            Class30_Sub2_Sub4_Sub5.aClient1609 = this;
            Class46.clientInstance = this;
            Class5.aClient82 = this;
            return;
        }
        catch(Exception exception)
        {
            signlink.reporterror("loaderror " + aString1049 + " " + anInt1079);
            exception.printStackTrace();
        }
        aBoolean926 = true;
    }


    private final void method91(Stream stream, int i, byte byte0)
    {
        if(byte0 == 8)
            byte0 = 0;
        else
            anInt1119 = -50;
        while(stream.anInt1407 + 10 < i * 8)
        {
            int j = stream.readBits(11);
            if(j == 2047)
                break;
            if(aPlayerArray890[j] == null)
            {
                aPlayerArray890[j] = new Player();
                if(aStreamArray895[j] != null)
                    aPlayerArray890[j].method451(0, aStreamArray895[j]);
            }
            anIntArray892[anInt891++] = j;
            Player player = aPlayerArray890[j];
            player.anInt1537 = loopCycle;
            int k = stream.readBits(1);
            if(k == 1)
                anIntArray894[anInt893++] = j;
            int l = stream.readBits(1);
            int i1 = stream.readBits(5);
            if(i1 > 15)
                i1 -= 32;
            int j1 = stream.readBits(5);
            if(j1 > 15)
                j1 -= 32;
            player.method445(((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0] + j1, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0] + i1, l == 1, false);
        }
        stream.method420(true);
    }
    public boolean inCircle(int circleX, int circleY, int clickX, int clickY, int radius) {
        return Math.pow((double) (circleX + radius - clickX), 2.0D)
                + Math.pow((double) (circleY + radius - clickY), 2.0D) < Math.pow((double) radius, 2.0D);
    }

    public final void method92(boolean flag)
    {
        aBoolean1157 &= flag;
        if(anInt1021 != 0)
            return;
        if(super.clickMode3 == 1)
        {
            int i = super.saveClickX - 25 - 547;
            int j = super.saveClickY - 5 - 3;
            if (currentScreenMode != ScreenMode.FIXED) {
                i = super.saveClickX - (currentGameWidth - 182 + 24);
                j = super.saveClickY - 8;
            }
            if(this.inCircle(0, 0, i, j, 76) && this.mouseMapPosition())
            {
                i -= 73;
                j -= 75;
                int k = anInt1185 + anInt1209 & 0x7ff;
                int i1 = Rasterizer.anIntArray1470[k];
                int j1 = Rasterizer.anIntArray1471[k];
                i1 = i1 * (anInt1170 + 256) >> 8;
                j1 = j1 * (anInt1170 + 256) >> 8;
                int k1 = j * i1 + i * j1 >> 11;
                int l1 = j * j1 - i * i1 >> 11;
                int i2 = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 + k1 >> 7;
                int j2 = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 - l1 >> 7;
                boolean flag1 = false;
                if (rights >= 2 && controlIsDown) {
                    teleport(baseX + i2, baseY + j2);
                } else {
                    flag1 = doWalkTo(1, 0, 0, -11308, 0, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0], 0, 0, j2, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0], true, i2);
                }
                if(flag1)
                {
                    stream.writeByte(i);
                    stream.writeByte(j);
                    stream.writeWord(anInt1185);
                    stream.writeByte(57);
                    stream.writeByte(anInt1209);
                    stream.writeByte(anInt1170);
                    stream.writeByte(89);
                    stream.writeWord(((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550);
                    stream.writeWord(((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551);
                    stream.writeByte(anInt1264);
                    stream.writeByte(63);
                }
            }
            anInt1117++;
            if(anInt1117 > 1151)
            {
                anInt1117 = 0;
                stream.createFrame(246);
                stream.writeByte(0);
                int l = stream.currentPosition;
                if((int)(Math.random() * 2D) == 0)
                    stream.writeByte(101);
                stream.writeByte(197);
                stream.writeWord((int)(Math.random() * 65536D));
                stream.writeByte((int)(Math.random() * 256D));
                stream.writeByte(67);
                stream.writeWord(14214);
                if((int)(Math.random() * 2D) == 0)
                    stream.writeWord(29487);
                stream.writeWord((int)(Math.random() * 65536D));
                if((int)(Math.random() * 2D) == 0)
                    stream.writeByte(220);
                stream.writeByte(180);
                stream.method407(stream.currentPosition - l, (byte)0);
            }
        }
    }

    public final String method93(int i, int j)
    {
        if(i <= 0)
            packet = in.readUnsignedByte();
        if(j < 0x3b9ac9ff)
            return String.valueOf(j);
        else
            return "?";
    }

    public final void method94(int i)
    {
        if(i != -13873)
        {
            for(int j = 1; j > 0; j++);
        }
        Graphics g = method11(0).getGraphics();
        g.setColor(Color.black);
        g.fillRect(0, 0, 765, 503);
        method4(false, 1);
        if(aBoolean926)
        {
            aBoolean831 = false;
            g.setFont(new Font("Helvetica", 1, 16));
            g.setColor(Color.yellow);
            int k = 35;
            g.drawString("Sorry, an error has occured whilst loading GodzHell Reborn and Remastered", 30, k);
            k += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, k);
            k += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, k);
            k += 30;
            g.drawString("2: Try clearing your web-browsers cache from tools->internet options", 30, k);
            k += 30;
            g.drawString("3: Try using a different game-world", 30, k);
            k += 30;
            g.drawString("4: Try rebooting your computer", 30, k);
            k += 30;
            g.drawString("5: Try selecting a different version of Java from the play-game menu", 30, k);
        }
        if(aBoolean1176)
        {
            aBoolean831 = false;
            g.setFont(new Font("Helvetica", 1, 20));
            g.setColor(Color.white);
            g.drawString("Error - unable to load game!", 50, 50);
            g.drawString("", 50, 100);
            g.drawString("", 50, 150);
        }
        if(aBoolean1252)
        {
            aBoolean831 = false;
            g.setColor(Color.yellow);
            int l = 35;
            g.drawString("Error a copy of Demolishscape already appears to be loaded", 30, l);
            l += 50;
            g.setColor(Color.white);
            g.drawString("To fix this try the following (in order):", 30, l);
            l += 50;
            g.setColor(Color.white);
            g.setFont(new Font("Helvetica", 1, 12));
            g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, l);
            l += 30;
            g.drawString("2: Try rebooting your computer, and reloading", 30, l);
            l += 30;
        }
    }

    public URL getCodeBase(){
        try
        {
            return new URL("http://"+server+":" + (29435 + ondemand_offset));
        }
        catch(Exception _ex) { }
        return super.getCodeBase();
    }

    public final void method95(int i)
    {
        for(int j = 0; j < npcCount; j++)
        {
            int k = npcIndices[j];
            Npc npc = npcs[k];
            if(npc != null)
                method96(46988, npc.desc.aByte68, npc);
        }

        if(i != -8066)
            anInt1218 = 148;
    }

    public final void method96(int i, int j, Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1)
    {
        if(i != 46988)
            packet = -1;
        if(class30_sub2_sub4_sub1.anInt1550 < 128 || class30_sub2_sub4_sub1.anInt1551 < 128 || class30_sub2_sub4_sub1.anInt1550 >= 13184 || class30_sub2_sub4_sub1.anInt1551 >= 13184)
        {
            class30_sub2_sub4_sub1.anInt1526 = -1;
            class30_sub2_sub4_sub1.anInt1520 = -1;
            class30_sub2_sub4_sub1.anInt1547 = 0;
            class30_sub2_sub4_sub1.anInt1548 = 0;
            class30_sub2_sub4_sub1.anInt1550 = class30_sub2_sub4_sub1.anIntArray1500[0] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            class30_sub2_sub4_sub1.anInt1551 = class30_sub2_sub4_sub1.anIntArray1501[0] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            class30_sub2_sub4_sub1.method446(true);
        }
        if(class30_sub2_sub4_sub1 == localPlayer && (class30_sub2_sub4_sub1.anInt1550 < 1536 || class30_sub2_sub4_sub1.anInt1551 < 1536 || class30_sub2_sub4_sub1.anInt1550 >= 11776 || class30_sub2_sub4_sub1.anInt1551 >= 11776))
        {
            class30_sub2_sub4_sub1.anInt1526 = -1;
            class30_sub2_sub4_sub1.anInt1520 = -1;
            class30_sub2_sub4_sub1.anInt1547 = 0;
            class30_sub2_sub4_sub1.anInt1548 = 0;
            class30_sub2_sub4_sub1.anInt1550 = class30_sub2_sub4_sub1.anIntArray1500[0] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            class30_sub2_sub4_sub1.anInt1551 = class30_sub2_sub4_sub1.anIntArray1501[0] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            class30_sub2_sub4_sub1.method446(true);
        }
        if(class30_sub2_sub4_sub1.anInt1547 > loopCycle)
            method97(class30_sub2_sub4_sub1, true);
        else
        if(class30_sub2_sub4_sub1.anInt1548 >= loopCycle)
            method98(class30_sub2_sub4_sub1, aByte1012);
        else
            method99((byte)34, class30_sub2_sub4_sub1);
        try {
        method100(class30_sub2_sub4_sub1, -843);
        method101(class30_sub2_sub4_sub1, -805);
        } catch(ArrayIndexOutOfBoundsException e){

        }
    }

    public final void method97(Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1, boolean flag)
    {
        int i = class30_sub2_sub4_sub1.anInt1547 - loopCycle;
        int j = class30_sub2_sub4_sub1.anInt1543 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
        int k = class30_sub2_sub4_sub1.anInt1545 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
        class30_sub2_sub4_sub1.anInt1550 += (j - class30_sub2_sub4_sub1.anInt1550) / i;
        if(!flag)
            return;
        class30_sub2_sub4_sub1.anInt1551 += (k - class30_sub2_sub4_sub1.anInt1551) / i;
        class30_sub2_sub4_sub1.anInt1503 = 0;
        if(class30_sub2_sub4_sub1.anInt1549 == 0)
            class30_sub2_sub4_sub1.anInt1510 = 1024;
        if(class30_sub2_sub4_sub1.anInt1549 == 1)
            class30_sub2_sub4_sub1.anInt1510 = 1536;
        if(class30_sub2_sub4_sub1.anInt1549 == 2)
            class30_sub2_sub4_sub1.anInt1510 = 0;
        if(class30_sub2_sub4_sub1.anInt1549 == 3)
            class30_sub2_sub4_sub1.anInt1510 = 512;
    }

    public final void method98(Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1, byte byte0)
    {
        if(class30_sub2_sub4_sub1.anInt1548 == loopCycle || class30_sub2_sub4_sub1.anInt1526 == -1 || class30_sub2_sub4_sub1.anInt1529 != 0 || class30_sub2_sub4_sub1.anInt1528 + 1 > Class20.aClass20Array351[class30_sub2_sub4_sub1.anInt1526].method258(class30_sub2_sub4_sub1.anInt1527, (byte)-39))
        {
            int i = class30_sub2_sub4_sub1.anInt1548 - class30_sub2_sub4_sub1.anInt1547;
            int j = loopCycle - class30_sub2_sub4_sub1.anInt1547;
            int k = class30_sub2_sub4_sub1.anInt1543 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            int l = class30_sub2_sub4_sub1.anInt1545 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            int i1 = class30_sub2_sub4_sub1.anInt1544 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            int j1 = class30_sub2_sub4_sub1.anInt1546 * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
            class30_sub2_sub4_sub1.anInt1550 = (k * (i - j) + i1 * j) / i;
            class30_sub2_sub4_sub1.anInt1551 = (l * (i - j) + j1 * j) / i;
        }
        class30_sub2_sub4_sub1.anInt1503 = 0;
        if(class30_sub2_sub4_sub1.anInt1549 == 0)
            class30_sub2_sub4_sub1.anInt1510 = 1024;
        if(class30_sub2_sub4_sub1.anInt1549 == 1)
            class30_sub2_sub4_sub1.anInt1510 = 1536;
        if(class30_sub2_sub4_sub1.anInt1549 == 2)
            class30_sub2_sub4_sub1.anInt1510 = 0;
        if(class30_sub2_sub4_sub1.anInt1549 == 3)
            class30_sub2_sub4_sub1.anInt1510 = 512;
        class30_sub2_sub4_sub1.anInt1552 = class30_sub2_sub4_sub1.anInt1510;
        if(byte0 != aByte1012)
            anInt1096 = -383;
    }

    public final void method99(byte byte0, Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1)
    {
        class30_sub2_sub4_sub1.anInt1517 = class30_sub2_sub4_sub1.anInt1511;
        if(class30_sub2_sub4_sub1.anInt1525 == 0)
        {
            class30_sub2_sub4_sub1.anInt1503 = 0;
            return;
        }
        if(class30_sub2_sub4_sub1.anInt1526 != -1 && class30_sub2_sub4_sub1.anInt1529 == 0)
        {
            Class20 class20 = Class20.aClass20Array351[class30_sub2_sub4_sub1.anInt1526];
            if(class30_sub2_sub4_sub1.anInt1542 > 0 && class20.anInt363 == 0)
            {
                class30_sub2_sub4_sub1.anInt1503++;
                return;
            }
            if(class30_sub2_sub4_sub1.anInt1542 <= 0 && class20.anInt364 == 0)
            {
                class30_sub2_sub4_sub1.anInt1503++;
                return;
            }
        }
        int i = class30_sub2_sub4_sub1.anInt1550;
        int j = class30_sub2_sub4_sub1.anInt1551;
        int k = class30_sub2_sub4_sub1.anIntArray1500[class30_sub2_sub4_sub1.anInt1525 - 1] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
        int l = class30_sub2_sub4_sub1.anIntArray1501[class30_sub2_sub4_sub1.anInt1525 - 1] * 128 + class30_sub2_sub4_sub1.anInt1540 * 64;
        if(k - i > 256 || k - i < -256 || l - j > 256 || l - j < -256)
        {
            class30_sub2_sub4_sub1.anInt1550 = k;
            class30_sub2_sub4_sub1.anInt1551 = l;
            return;
        }
        if(i < k)
        {
            if(j < l)
                class30_sub2_sub4_sub1.anInt1510 = 1280;
            else
            if(j > l)
                class30_sub2_sub4_sub1.anInt1510 = 1792;
            else
                class30_sub2_sub4_sub1.anInt1510 = 1536;
        } else
        if(i > k)
        {
            if(j < l)
                class30_sub2_sub4_sub1.anInt1510 = 768;
            else
            if(j > l)
                class30_sub2_sub4_sub1.anInt1510 = 256;
            else
                class30_sub2_sub4_sub1.anInt1510 = 512;
        } else
        if(j < l)
            class30_sub2_sub4_sub1.anInt1510 = 1024;
        else
            class30_sub2_sub4_sub1.anInt1510 = 0;
        int i1 = class30_sub2_sub4_sub1.anInt1510 - class30_sub2_sub4_sub1.anInt1552 & 0x7ff;
        if(i1 > 1024)
            i1 -= 2048;
        int j1 = class30_sub2_sub4_sub1.anInt1555;
        if(i1 >= -256 && i1 <= 256)
            j1 = class30_sub2_sub4_sub1.anInt1554;
        else
        if(i1 >= 256 && i1 < 768)
            j1 = class30_sub2_sub4_sub1.anInt1557;
        else
        if(i1 >= -768 && i1 <= -256)
            j1 = class30_sub2_sub4_sub1.anInt1556;
        if(j1 == -1)
            j1 = class30_sub2_sub4_sub1.anInt1554;
        class30_sub2_sub4_sub1.anInt1517 = j1;
        int k1 = 4;
        if(byte0 != 34)
            anInt1096 = 285;
        if(class30_sub2_sub4_sub1.anInt1552 != class30_sub2_sub4_sub1.anInt1510 && class30_sub2_sub4_sub1.anInt1502 == -1 && class30_sub2_sub4_sub1.anInt1504 != 0)
            k1 = 2;
        if(class30_sub2_sub4_sub1.anInt1525 > 2)
            k1 = 6;
        if(class30_sub2_sub4_sub1.anInt1525 > 3)
            k1 = 8;
        if(class30_sub2_sub4_sub1.anInt1503 > 0 && class30_sub2_sub4_sub1.anInt1525 > 1)
        {
            k1 = 8;
            class30_sub2_sub4_sub1.anInt1503--;
        }
        if(class30_sub2_sub4_sub1.aBooleanArray1553[class30_sub2_sub4_sub1.anInt1525 - 1])
            k1 <<= 1;
        if(k1 >= 8 && class30_sub2_sub4_sub1.anInt1517 == class30_sub2_sub4_sub1.anInt1554 && class30_sub2_sub4_sub1.anInt1505 != -1)
            class30_sub2_sub4_sub1.anInt1517 = class30_sub2_sub4_sub1.anInt1505;
        if(i < k)
        {
            class30_sub2_sub4_sub1.anInt1550 += k1;
            if(class30_sub2_sub4_sub1.anInt1550 > k)
                class30_sub2_sub4_sub1.anInt1550 = k;
        } else
        if(i > k)
        {
            class30_sub2_sub4_sub1.anInt1550 -= k1;
            if(class30_sub2_sub4_sub1.anInt1550 < k)
                class30_sub2_sub4_sub1.anInt1550 = k;
        }
        if(j < l)
        {
            class30_sub2_sub4_sub1.anInt1551 += k1;
            if(class30_sub2_sub4_sub1.anInt1551 > l)
                class30_sub2_sub4_sub1.anInt1551 = l;
        } else
        if(j > l)
        {
            class30_sub2_sub4_sub1.anInt1551 -= k1;
            if(class30_sub2_sub4_sub1.anInt1551 < l)
                class30_sub2_sub4_sub1.anInt1551 = l;
        }
        if(class30_sub2_sub4_sub1.anInt1550 == k && class30_sub2_sub4_sub1.anInt1551 == l)
        {
            class30_sub2_sub4_sub1.anInt1525--;
            if(class30_sub2_sub4_sub1.anInt1542 > 0)
                class30_sub2_sub4_sub1.anInt1542--;
        }
    }

    public final void method100(Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1, int i)
    {
        if(i >= 0)
            return;
        if(class30_sub2_sub4_sub1.anInt1504 == 0)
            return;
        if(class30_sub2_sub4_sub1.anInt1502 != -1 && class30_sub2_sub4_sub1.anInt1502 < 32768)
        {
            Npc npc = npcs[class30_sub2_sub4_sub1.anInt1502];
            if(npc != null)
            {
                int i1 = class30_sub2_sub4_sub1.anInt1550 - ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550;
                int k1 = class30_sub2_sub4_sub1.anInt1551 - ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551;
                if(i1 != 0 || k1 != 0)
                    class30_sub2_sub4_sub1.anInt1510 = (int)(Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
            }
        }
        if(class30_sub2_sub4_sub1.anInt1502 >= 32768)
        {
            int j = class30_sub2_sub4_sub1.anInt1502 - 32768;
            if(j == anInt884)
                j = anInt889;
            Player player = aPlayerArray890[j];
            if(player != null)
            {
                int l1 = class30_sub2_sub4_sub1.anInt1550 - ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550;
                int i2 = class30_sub2_sub4_sub1.anInt1551 - ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551;
                if(l1 != 0 || i2 != 0)
                    class30_sub2_sub4_sub1.anInt1510 = (int)(Math.atan2(l1, i2) * 325.94900000000001D) & 0x7ff;
            }
        }
        if((class30_sub2_sub4_sub1.face_x != 0 || class30_sub2_sub4_sub1.face_y != 0) && (class30_sub2_sub4_sub1.anInt1525 == 0 || class30_sub2_sub4_sub1.anInt1503 > 0))
        {
            int k = class30_sub2_sub4_sub1.anInt1550 - (class30_sub2_sub4_sub1.face_x - baseX - baseX) * 64;
            int j1 = class30_sub2_sub4_sub1.anInt1551 - (class30_sub2_sub4_sub1.face_y - baseY - baseY) * 64;
            if(k != 0 || j1 != 0)
                class30_sub2_sub4_sub1.anInt1510 = (int)(Math.atan2(k, j1) * 325.94900000000001D) & 0x7ff;
            class30_sub2_sub4_sub1.face_x = 0;
            class30_sub2_sub4_sub1.face_y = 0;
        }
        int l = class30_sub2_sub4_sub1.anInt1510 - class30_sub2_sub4_sub1.anInt1552 & 0x7ff;
        if(l != 0)
        {
            if(l < class30_sub2_sub4_sub1.anInt1504 || l > 2048 - class30_sub2_sub4_sub1.anInt1504)
                class30_sub2_sub4_sub1.anInt1552 = class30_sub2_sub4_sub1.anInt1510;
            else
            if(l > 1024)
                class30_sub2_sub4_sub1.anInt1552 -= class30_sub2_sub4_sub1.anInt1504;
            else
                class30_sub2_sub4_sub1.anInt1552 += class30_sub2_sub4_sub1.anInt1504;
            class30_sub2_sub4_sub1.anInt1552 &= 0x7ff;
            if(class30_sub2_sub4_sub1.anInt1517 == class30_sub2_sub4_sub1.anInt1511 && class30_sub2_sub4_sub1.anInt1552 != class30_sub2_sub4_sub1.anInt1510)
            {
                if(class30_sub2_sub4_sub1.anInt1512 != -1)
                {
                    class30_sub2_sub4_sub1.anInt1517 = class30_sub2_sub4_sub1.anInt1512;
                    return;
                }
                class30_sub2_sub4_sub1.anInt1517 = class30_sub2_sub4_sub1.anInt1554;
            }
        }
    }

    public final void method101(Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1, int i)
    {
        if(i >= 0)
            aBoolean919 = !aBoolean919;
        class30_sub2_sub4_sub1.aBoolean1541 = false;
        if(class30_sub2_sub4_sub1.anInt1517 != -1)
        {
            Class20 class20 = Class20.aClass20Array351[class30_sub2_sub4_sub1.anInt1517];
            class30_sub2_sub4_sub1.anInt1519++;
            if(class30_sub2_sub4_sub1.anInt1518 < class20.anInt352 && class30_sub2_sub4_sub1.anInt1519 > class20.method258(class30_sub2_sub4_sub1.anInt1518, (byte)-39))
            {
                class30_sub2_sub4_sub1.anInt1519 = 1;
                class30_sub2_sub4_sub1.anInt1518++;
            }
            if(class30_sub2_sub4_sub1.anInt1518 >= class20.anInt352)
            {
                class30_sub2_sub4_sub1.anInt1519 = 1;
                class30_sub2_sub4_sub1.anInt1518 = 0;
            }
        }
        if(class30_sub2_sub4_sub1.anInt1520 != -1 && loopCycle >= class30_sub2_sub4_sub1.anInt1523)
        {
            if(class30_sub2_sub4_sub1.anInt1521 < 0)
                class30_sub2_sub4_sub1.anInt1521 = 0;
            Class20 class20_1 = Class23.aClass23Array403[class30_sub2_sub4_sub1.anInt1520].aClass20_407;
            for(class30_sub2_sub4_sub1.anInt1522++; class30_sub2_sub4_sub1.anInt1521 < class20_1.anInt352 && class30_sub2_sub4_sub1.anInt1522 > class20_1.method258(class30_sub2_sub4_sub1.anInt1521, (byte)-39); class30_sub2_sub4_sub1.anInt1521++)
                class30_sub2_sub4_sub1.anInt1522 -= class20_1.method258(class30_sub2_sub4_sub1.anInt1521, (byte)-39);

            if(class30_sub2_sub4_sub1.anInt1521 >= class20_1.anInt352 && (class30_sub2_sub4_sub1.anInt1521 < 0 || class30_sub2_sub4_sub1.anInt1521 >= class20_1.anInt352))
                class30_sub2_sub4_sub1.anInt1520 = -1;
        }
        if(class30_sub2_sub4_sub1.anInt1526 != -1 && class30_sub2_sub4_sub1.anInt1529 <= 1)
        {
            Class20 class20_2 = Class20.aClass20Array351[class30_sub2_sub4_sub1.anInt1526];
            if(class20_2.anInt363 == 1 && class30_sub2_sub4_sub1.anInt1542 > 0 && class30_sub2_sub4_sub1.anInt1547 <= loopCycle && class30_sub2_sub4_sub1.anInt1548 < loopCycle)
            {
                class30_sub2_sub4_sub1.anInt1529 = 1;
                return;
            }
        }
        if(class30_sub2_sub4_sub1.anInt1526 != -1 && class30_sub2_sub4_sub1.anInt1529 == 0)
        {
            Class20 class20_3 = Class20.aClass20Array351[class30_sub2_sub4_sub1.anInt1526];
            for(class30_sub2_sub4_sub1.anInt1528++; class30_sub2_sub4_sub1.anInt1527 < class20_3.anInt352 && class30_sub2_sub4_sub1.anInt1528 > class20_3.method258(class30_sub2_sub4_sub1.anInt1527, (byte)-39); class30_sub2_sub4_sub1.anInt1527++)
                class30_sub2_sub4_sub1.anInt1528 -= class20_3.method258(class30_sub2_sub4_sub1.anInt1527, (byte)-39);

            if(class30_sub2_sub4_sub1.anInt1527 >= class20_3.anInt352)
            {
                class30_sub2_sub4_sub1.anInt1527 -= class20_3.anInt356;
                class30_sub2_sub4_sub1.anInt1530++;
                if(class30_sub2_sub4_sub1.anInt1530 >= class20_3.anInt362)
                    class30_sub2_sub4_sub1.anInt1526 = -1;
                if(class30_sub2_sub4_sub1.anInt1527 < 0 || class30_sub2_sub4_sub1.anInt1527 >= class20_3.anInt352)
                    class30_sub2_sub4_sub1.anInt1526 = -1;
            }
            class30_sub2_sub4_sub1.aBoolean1541 = class20_3.aBoolean358;
        }
        if(class30_sub2_sub4_sub1.anInt1529 > 0)
            class30_sub2_sub4_sub1.anInt1529--;
    }
    public static boolean nearby = true;
    public final void method102(boolean flag)
    {
        if(!flag)
            anInt939 = aISAACRandomGen_1000.getNextKey();
        if(aBoolean1255)
        {
            aBoolean1255 = false;
            tabAreaAltered = true;
            inputTaken = true;
            aBoolean1103 = true;
            aBoolean1233 = true;
            if(anInt1023 != 2 && currentScreenMode == ScreenMode.FIXED)
            {
                aRSImageProducer_1165.method238(currentScreenMode == ScreenMode.FIXED ? 0 : 0, 23680, super.aGraphics12, currentScreenMode == ScreenMode.FIXED ? 0 : 0);
                aRSImageProducer_1164.method238(0, 23680, super.aGraphics12, 516);
            }
        }
        if(menuOpen)
            tabAreaAltered = true;
        if(invOverlayInterfaceID != -1)
        {
            boolean flag1 = method119(anInt945, false, invOverlayInterfaceID);
            if(flag1)
                tabAreaAltered = true;
        }
        if(anInt1246 == 2)
            tabAreaAltered = true;
        if(anInt1086 == 2)
            tabAreaAltered = true;
        if(tabAreaAltered)
        {
            drawTabArea((byte)-81);
            tabAreaAltered = false;
        }
        if(backDialogID == -1)
        {
            aClass9_1059.scrollPosition = anInt1211 - anInt1089 - 110;
            if (super.mouseX > 496 && super.mouseX < 511
                    && super.mouseY > (currentScreenMode == ScreenMode.FIXED ? 345 : currentGameHeight - 158)) {
                this.method65(494, 110, super.mouseX,
                        super.mouseY - (currentScreenMode == ScreenMode.FIXED ? 345 : currentGameHeight - 158),
                        this.aClass9_1059, 0, false, this.anInt1211, 0);
            }
            int i = anInt1211 - 110 - aClass9_1059.scrollPosition;
            if(i < 0)
                i = 0;
            if(i > anInt1211 - 110)
                i = anInt1211 - 110;
            if(anInt1089 != i)
            {
                anInt1089 = i;
                inputTaken = true;
            }
        }
        if(backDialogID != -1)
        {
            boolean flag2 = method119(anInt945, false, backDialogID);
            if(flag2)
                inputTaken = true;
        }
        if(anInt1246 == 3)
            inputTaken = true;
        if(anInt1086 == 3)
            inputTaken = true;
        if(aString844 != null)
            inputTaken = true;
        if(menuOpen && menuScreenArea == 2)
            inputTaken = true;
        if(inputTaken)
        {
            drawChatArea(6);
            inputTaken = false;
        }
        if (this.anInt1023 == 2) {
            this.method146((byte)1);
        }
        if(anInt1023 == 2 && currentScreenMode == ScreenMode.FIXED)
        {
            drawMinimap(false);
            aRSImageProducer_1164.method238(0, 23680, super.aGraphics12, 516);
        }
        if(anInt1054 != -1)
            aBoolean1103 = true;
        if(aBoolean1103) {
            if (anInt1054 != -1 && anInt1054 == tabID) {
                anInt1054 = -1;
                stream.createFrame(120);
                stream.writeByte(tabID);
            }
            aBoolean1103 = false;
            aRSImageProducer_1125.initDrawingArea();
            aRSImageProducer_1165.initDrawingArea();
        }
        this.anInt945 = 0;
    }

    public final boolean method103(Widget class9, boolean flag)
    {
        int i = class9.contentType;
        if(flag)
            method6();
        if(i >= 1 && i <= 200 || i >= 701 && i <= 900)
        {
            if(i >= 801)
                i -= 701;
            else
            if(i >= 701)
                i -= 601;
            else
            if(i >= 101)
                i -= 101;
            else
                i--;
            menuActionName[menuActionRow] = "Remove @whi@" + aStringArray1082[i];
            menuActionID[menuActionRow] = 792;
            menuActionRow++;
            menuActionName[menuActionRow] = "Message @whi@" + aStringArray1082[i];
            menuActionID[menuActionRow] = 639;
            menuActionRow++;
            if(rights >= 2){
                menuActionName[menuActionRow] = "TeleToMe @whi@" + aStringArray1082[i];
                menuActionID[menuActionRow] = 638;
                menuActionRow++;
                menuActionName[menuActionRow] = "TeleTo @whi@" + aStringArray1082[i];
                menuActionID[menuActionRow] = 637;
                menuActionRow++;
            }
            return true;
        }
        if(i >= 401 && i <= 500)
        {
            menuActionName[menuActionRow] = "Remove @whi@" + class9.message;
            menuActionID[menuActionRow] = 322;
            menuActionRow++;
            return true;
        } else
        {
            return false;
        }
    }

    public final void method104(boolean flag)
    {
        Class30_Sub2_Sub4_Sub3 class30_sub2_sub4_sub3 = (Class30_Sub2_Sub4_Sub3)aClass19_1056.reverseGetFirst();
        aBoolean1157 &= flag;
        for(; class30_sub2_sub4_sub3 != null; class30_sub2_sub4_sub3 = (Class30_Sub2_Sub4_Sub3)aClass19_1056.reverseGetNext(false))
            if(class30_sub2_sub4_sub3.anInt1560 != anInt918 || class30_sub2_sub4_sub3.aBoolean1567)
                class30_sub2_sub4_sub3.unlink();
            else
            if(loopCycle >= class30_sub2_sub4_sub3.anInt1564)
            {
                class30_sub2_sub4_sub3.method454(anInt945, true);
                if(class30_sub2_sub4_sub3.aBoolean1567)
                    class30_sub2_sub4_sub3.unlink();
                else
                    aClass25_946.method285(class30_sub2_sub4_sub3.anInt1560, 0, (byte)6, class30_sub2_sub4_sub3.anInt1563, -1, class30_sub2_sub4_sub3.anInt1562, 60, class30_sub2_sub4_sub3.anInt1561, class30_sub2_sub4_sub3, false);
            }

    }

    public final void drawInterface(int j, int k, Widget class9, int l)
    {
        if(class9.type != 0 || class9.children == null)
            return;
        if(class9.isMouseoverTriggered && anInt1026 != class9.id && anInt1048 != class9.id && anInt1039 != class9.id)
            return;
        int i1 = DrawingArea.leftX;
        int j1 = DrawingArea.topY;
        int k1 = DrawingArea.bottomX;
        int l1 = DrawingArea.bottomY;
        DrawingArea.setDrawingArea(l + class9.height, k,  k + class9.width, l);
        int i2 = class9.children.length;
        for(int j2 = 0; j2 < i2; j2++)
        {
            int k2 = class9.childX[j2] + k;
            int l2 = (class9.childY[j2] + l) - j;
            Widget class9_1 = Widget.interfaceCache[class9.children[j2]];
            k2 += class9_1.anInt263;
            l2 += class9_1.anInt265;
            if(class9_1.contentType > 0)
                method75(950, class9_1);
            if(class9_1.type == 0)
            {
                if(class9_1.scrollPosition > class9_1.scrollMax - class9_1.height)
                    class9_1.scrollPosition = class9_1.scrollMax - class9_1.height;
                if(class9_1.scrollPosition < 0)
                    class9_1.scrollPosition = 0;
                drawInterface(class9_1.scrollPosition, k2, class9_1, l2);
                if(class9_1.scrollMax > class9_1.height)
                    drawScrollbar(class9_1.height, class9_1.scrollPosition, l2,k2 + class9_1.width, class9_1.scrollMax, false);
            } else
            if(class9_1.type != 1)
                if(class9_1.type == 2)
                {
                    int i3 = 0;
                    for(int l3 = 0; l3 < class9_1.height; l3++)
                    {
                        for(int l4 = 0; l4 < class9_1.width; l4++)
                        {
                            int k5 = k2 + l4 * (32 + class9_1.invSpritePadX);
                            int j6 = l2 + l3 * (32 + class9_1.invSpritePadY);
                            if(i3 < 20)
                            {
                                k5 += class9_1.spritesX[i3];
                                j6 += class9_1.spritesY[i3];
                            }
                            if(class9_1.inv[i3] > 0)
                            {
                                int k6 = 0;
                                int j7 = 0;
                                int j9 = class9_1.inv[i3] - 1;
                                if(k5 > DrawingArea.leftX - 32 && k5 < DrawingArea.bottomX && j6 > DrawingArea.topY - 32 && j6 < DrawingArea.bottomY || anInt1086 != 0 && anInt1085 == i3)
                                {
                                    int l9 = 0;
                                    if(anInt1282 == 1 && anInt1283 == i3 && anInt1284 == class9_1.id)
                                        l9 = 0xffffff;
                                    Sprite class30_sub2_sub1_sub1_2 = Class8.method200(j9, class9_1.invStackSizes[i3], l9, 9);
                                    if(class30_sub2_sub1_sub1_2 != null)
                                    {
                                        if(anInt1086 != 0 && anInt1085 == i3 && anInt1084 == class9_1.id)
                                        {
                                            k6 = super.mouseX - anInt1087;
                                            j7 = super.mouseY - anInt1088;
                                            if(k6 < 5 && k6 > -5)
                                                k6 = 0;
                                            if(j7 < 5 && j7 > -5)
                                                j7 = 0;
                                            if(anInt989 < 5)
                                            {
                                                k6 = 0;
                                                j7 = 0;
                                            }
                                            class30_sub2_sub1_sub1_2.method350(k5 + k6, j6 + j7, 128, aBoolean1043);
                                            if(j6 + j7 < DrawingArea.topY && class9.scrollPosition > 0)
                                            {
                                                int i10 = (anInt945 * (DrawingArea.topY - j6 - j7)) / 3;
                                                if(i10 > anInt945 * 10)
                                                    i10 = anInt945 * 10;
                                                if(i10 > class9.scrollPosition)
                                                    i10 = class9.scrollPosition;
                                                class9.scrollPosition -= i10;
                                                anInt1088 += i10;
                                            }
                                            if(j6 + j7 + 32 > DrawingArea.bottomY && class9.scrollPosition < class9.scrollMax - class9.height)
                                            {
                                                int j10 = (anInt945 * ((j6 + j7 + 32) - DrawingArea.bottomY)) / 3;
                                                if(j10 > anInt945 * 10)
                                                    j10 = anInt945 * 10;
                                                if(j10 > class9.scrollMax - class9.height - class9.scrollPosition)
                                                    j10 = class9.scrollMax - class9.height - class9.scrollPosition;
                                                class9.scrollPosition += j10;
                                                anInt1088 -= j10;
                                            }
                                        } else
                                        if(anInt1246 != 0 && anInt1245 == i3 && anInt1244 == class9_1.id)
                                            class30_sub2_sub1_sub1_2.method350(k5, j6, 128, aBoolean1043);
                                        else
                                            class30_sub2_sub1_sub1_2.drawSprite(k5, j6);
                                        if(class30_sub2_sub1_sub1_2.anInt1444 == 33 || class9_1.invStackSizes[i3] != 1)
                                        {
                                            int k10 = class9_1.invStackSizes[i3];
                                            {
                                                smallText.method385(0, method43(-33245, k10), j6 + 10 + j7, 822, k5 + 1 + k6);
                                                smallText.method385(0x00ff80, method43(-33245, k10), j6 + 9 + j7, 822, k5 + k6);
                                            }
                                            smallText.method385(0x00ff80, method43(-33245, k10), j6 + 9 + j7, 822, k5 + k6);
                                        }
                                    }
                                }
                            } else
                            if(class9_1.sprites != null && i3 < 20)
                            {
                                Sprite class30_sub2_sub1_sub1_1 = class9_1.sprites[i3];
                                if(class30_sub2_sub1_sub1_1 != null)
                                    class30_sub2_sub1_sub1_1.drawSprite(k5, j6);
                            }
                            i3++;
                        }

                    }

                } else
                if(class9_1.type == 3)
                {
                    boolean flag = false;
                    if(anInt1039 == class9_1.id || anInt1048 == class9_1.id || anInt1026 == class9_1.id)
                        flag = true;
                    int j3;
                    if(method131(class9_1, false))
                    {
                        j3 = class9_1.anInt219;
                        if(flag && class9_1.anInt239 != 0)
                            j3 = class9_1.anInt239;
                    } else
                    {
                        j3 = class9_1.textColor;
                        if(flag && class9_1.anInt216 != 0)
                            j3 = class9_1.anInt216;
                    }
                    if(class9_1.opacity == 0)
                    {
                        if(class9_1.aBoolean227)
                            DrawingArea.drawPixels(class9_1.height, l2, k2, j3, class9_1.width);
                        else
                            DrawingArea.fillPixels(k2, class9_1.width, class9_1.height, j3, l2, true);
                    } else
                    if(class9_1.aBoolean227)
                        DrawingArea.method335(j3, l2, class9_1.width, class9_1.height, 256 - (class9_1.opacity & 0xff), 0, k2);
                    else
                        DrawingArea.method338(l2, class9_1.height, 256 - (class9_1.opacity & 0xff), j3, class9_1.width, k2, -17319);
                } else
                if(class9_1.type == 4)
                {
                    RSFont textDrawingArea = class9_1.textDrawingAreas;
                    String s = class9_1.message;
                    boolean flag1 = false;
                    if(anInt1039 == class9_1.id || anInt1048 == class9_1.id || anInt1026 == class9_1.id)
                        flag1 = true;
                    int i4;
                    if(method131(class9_1, false))
                    {
                        i4 = class9_1.anInt219;
                        if(flag1 && class9_1.anInt239 != 0)
                            i4 = class9_1.anInt239;
                        if(class9_1.aString228.length() > 0)
                            s = class9_1.aString228;
                    } else
                    {
                        i4 = class9_1.textColor;
                        if(flag1 && class9_1.anInt216 != 0)
                            i4 = class9_1.anInt216;
                    }
                    if(class9_1.atActionType == 6 && aBoolean1149)
                    {
                        s = "Please wait...";
                        i4 = class9_1.textColor;
                    }
                    if(DrawingArea.width == 479)
                    {
                        if(i4 == 0xffff00)
                            i4 = 255;
                        if(i4 == 49152)
                            i4 = 0xffffff;
                    }
                    for(int l6 = l2 + textDrawingArea.baseCharacterHeight; s.length() > 0; l6 += textDrawingArea.baseCharacterHeight)
                    {
                        if(s.indexOf("%") != -1)
                        {
                            do
                            {
                                int k7 = s.indexOf("%1");
                                if(k7 == -1)
                                    break;
                                s = s.substring(0, k7) + method93(369, method124(341, class9_1, 0)) + s.substring(k7 + 2);
                            } while(true);
                            do
                            {
                                int l7 = s.indexOf("%2");
                                if(l7 == -1)
                                    break;
                                s = s.substring(0, l7) + method93(369, method124(341, class9_1, 1)) + s.substring(l7 + 2);
                            } while(true);
                            do
                            {
                                int i8 = s.indexOf("%3");
                                if(i8 == -1)
                                    break;
                                s = s.substring(0, i8) + method93(369, method124(341, class9_1, 2)) + s.substring(i8 + 2);
                            } while(true);
                            do
                            {
                                int j8 = s.indexOf("%4");
                                if(j8 == -1)
                                    break;
                                s = s.substring(0, j8) + method93(369, method124(341, class9_1, 3)) + s.substring(j8 + 2);
                            } while(true);
                            do
                            {
                                int k8 = s.indexOf("%5");
                                if(k8 == -1)
                                    break;
                                s = s.substring(0, k8) + method93(369, method124(341, class9_1, 4)) + s.substring(k8 + 2);
                            } while(true);
                        }
                        int l8 = s.indexOf("\\n");
                        String s1;
                        if(l8 != -1)
                        {
                            s1 = s.substring(0, l8);
                            s = s.substring(l8 + 2);
                        } else
                        {
                            s1 = s;
                            s = "";
                        }
                        if(class9_1.centerText)
                            textDrawingArea.drawCenteredString(s1, k2 + class9_1.width / 2, l6, i4,
                                    class9_1.textShadow ? 0 : -1);
                        else
                            textDrawingArea.drawBasicString(s1, k2, l6, i4, class9_1.textShadow ? 0 : -1);
                    }

                } else
                if(class9_1.type == 5)
                {
                    Sprite sprite;
                    if(method131(class9_1, false))
                        sprite = class9_1.enabledSprite;
                    else
                        sprite = class9_1.disabledSprite;
                    if(sprite != null)
                        sprite.drawSprite(k2, l2);
                } else
                if(class9_1.type == 6)
                {
                    int k3 = Rasterizer.anInt1466;
                    int j4 = Rasterizer.anInt1467;
                    Rasterizer.anInt1466 = k2 + class9_1.width / 2;
                    Rasterizer.anInt1467 = l2 + class9_1.height / 2;
                    int i5 = Rasterizer.anIntArray1470[class9_1.modelRotation1] * class9_1.modelZoom >> 16;
                    int l5 = Rasterizer.anIntArray1471[class9_1.modelRotation1] * class9_1.modelZoom >> 16;
                    boolean flag2 = method131(class9_1, false);
                    int i7;
                    if(flag2)
                        i7 = class9_1.anInt258;
                    else
                        i7 = class9_1.anInt257;
                    Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6;
                    if(i7 == -1)
                    {
                        class30_sub2_sub4_sub6 = class9_1.method209(0, -1, -1, flag2);
                    } else
                    {
                        Class20 class20 = Class20.aClass20Array351[i7];
                        class30_sub2_sub4_sub6 = class9_1.method209(0, class20.anIntArray354[class9_1.anInt246], class20.anIntArray353[class9_1.anInt246], flag2);
                    }
                    if(class30_sub2_sub4_sub6 != null)
                        class30_sub2_sub4_sub6.method482(0, class9_1.modelRotation2, 0, class9_1.modelRotation1, 0, i5, l5);
                    Rasterizer.anInt1466 = k3;
                    Rasterizer.anInt1467 = j4;
                } else
                if(class9_1.type == 7)
                {
                    RSFont class30_sub2_sub1_sub4_1 = class9_1.textDrawingAreas;
                    int k4 = 0;
                    for(int j5 = 0; j5 < class9_1.height; j5++)
                    {
                        for(int i6 = 0; i6 < class9_1.width; i6++)
                        {
                            if(class9_1.inv[k4] > 0)
                            {
                                Class8 class8 = Class8.method198(class9_1.inv[k4] - 1);
                                String s2 = class8.name;
                                if(class8.aBoolean176 || class9_1.invStackSizes[k4] != 1)
                                    s2 = s2 + " x" + method14(class9_1.invStackSizes[k4], 0);
                                int i9 = k2 + i6 * (115 + class9_1.invSpritePadX);
                                int k9 = l2 + j5 * (12 + class9_1.invSpritePadY);
                                if(class9_1.centerText)
                                    class30_sub2_sub1_sub4_1.drawCenteredString(s2, i9 + class9_1.width / 2, k9,
                                            class9_1.textColor, class9_1.textShadow ? 0 : -1);
                                else
                                    class30_sub2_sub1_sub4_1.drawBasicString(s2, i9, k9, class9_1.textColor,
                                            class9_1.textShadow ? 0 : -1);
                            }
                            k4++;
                        }

                    }

                }
        }

        DrawingArea.setDrawingArea(l1, i1,  k1, j1);
    }

    public final void method106(Background background, int i)
    {
        int j = 256;
        if(i >= 0)
            stream.writeByte(126);
        for(int k = 0; k < anIntArray1190.length; k++)
            anIntArray1190[k] = 0;

        for(int l = 0; l < 5000; l++)
        {
            int i1 = (int)(Math.random() * 128D * (double)j);
            anIntArray1190[i1] = (int)(Math.random() * 256D);
        }

        for(int j1 = 0; j1 < 20; j1++)
        {
            for(int k1 = 1; k1 < j - 1; k1++)
            {
                for(int i2 = 1; i2 < 127; i2++)
                {
                    int k2 = i2 + (k1 << 7);
                    anIntArray1191[k2] = (anIntArray1190[k2 - 1] + anIntArray1190[k2 + 1] + anIntArray1190[k2 - 128] + anIntArray1190[k2 + 128]) / 4;
                }

            }

            int ai[] = anIntArray1190;
            anIntArray1190 = anIntArray1191;
            anIntArray1191 = ai;
        }

        if(background != null)
        {
            int l1 = 0;
            for(int j2 = 0; j2 < background.anInt1453; j2++)
            {
                for(int l2 = 0; l2 < background.anInt1452; l2++)
                    if(background.aByteArray1450[l1++] != 0)
                    {
                        int i3 = l2 + 16 + background.anInt1454;
                        int j3 = j2 + 16 + background.anInt1455;
                        int k3 = i3 + (j3 << 7);
                        anIntArray1190[k3] = 0;
                    }

            }

        }
    }

    private final void method107(int i, int j, Stream stream, byte byte0, Player player)
    {
        if(byte0 != 25)
            aClass19ArrayArrayArray827 = null;
        if((i & 0x400) != 0)
        {
            player.anInt1543 = stream.readByteA(2);
            player.anInt1545 = stream.readByteA(2);
            player.anInt1544 = stream.readByteA(2);
            player.anInt1546 = stream.readByteA(2);
            player.anInt1547 = stream.method436((byte)-74) + loopCycle;
            player.anInt1548 = stream.method435(true) + loopCycle;
            player.anInt1549 = stream.readByteA(2);
            player.method446(true);
        }
        if((i & 0x100) != 0)
        {
            player.anInt1520 = stream.method434((byte)108);
            int k = stream.readDWord();
            player.anInt1524 = k >> 16;
            player.anInt1523 = loopCycle + (k & 0xffff);
            player.anInt1521 = 0;
            player.anInt1522 = 0;
            if(((Class30_Sub2_Sub4_Sub1) (player)).anInt1523 > loopCycle)
                player.anInt1521 = -1;
            if(((Class30_Sub2_Sub4_Sub1) (player)).anInt1520 == 65535)
                player.anInt1520 = -1;
        }
        if((i & 8) != 0)
        {
            int l = stream.method434((byte)108);
            if(l == 65535)
                l = -1;
            int i2 = stream.readByteC(false);
            if(l == ((Class30_Sub2_Sub4_Sub1) (player)).anInt1526 && l != -1)
            {
                int i3 = Class20.aClass20Array351[l].anInt365;
                if(i3 == 1)
                {
                    player.anInt1527 = 0;
                    player.anInt1528 = 0;
                    player.anInt1529 = i2;
                    player.anInt1530 = 0;
                }
                if(i3 == 2)
                    player.anInt1530 = 0;
            } else
            if(l == -1 || ((Class30_Sub2_Sub4_Sub1) (player)).anInt1526 == -1 || Class20.aClass20Array351[l].anInt359 >= Class20.aClass20Array351[((Class30_Sub2_Sub4_Sub1) (player)).anInt1526].anInt359)
            {
                player.anInt1526 = l;
                player.anInt1527 = 0;
                player.anInt1528 = 0;
                player.anInt1529 = i2;
                player.anInt1530 = 0;
                player.anInt1542 = ((Class30_Sub2_Sub4_Sub1) (player)).anInt1525;
            }
        }
        if((i & 4) != 0)
        {
            player.aString1506 = stream.readString();
            if(((Class30_Sub2_Sub4_Sub1) (player)).aString1506.charAt(0) == '~')
            {
                player.aString1506 = ((Class30_Sub2_Sub4_Sub1) (player)).aString1506.substring(1);
                pushMessage(((Class30_Sub2_Sub4_Sub1) (player)).aString1506, 2, player.name);
            } else
            if(player == localPlayer)
                pushMessage(((Class30_Sub2_Sub4_Sub1) (player)).aString1506, 2, player.name);
            player.anInt1513 = 0;
            player.anInt1531 = 0;
            player.textCycle = 150;
        }
        if((i & 0x80) != 0)
        {
            int i1 = stream.method434((byte)108);
            int j2 = stream.readUnsignedByte();
            int j3 = stream.readByteC(false);
            int k3 = stream.currentPosition;
            if(player.name != null && player.aBoolean1710)
            {
                long l3 = TextClass.longForName(player.name);
                boolean flag = false;
                if(j2 <= 1)
                {
                    for(int i4 = 0; i4 < anInt822; i4++)
                    {
                        if(aLongArray925[i4] != l3)
                            continue;
                        flag = true;
                        break;
                    }

                }
                if(!flag && anInt1251 == 0)
                    try
                    {
                        aStream_834.currentPosition = 0;
                        stream.method442(j3, 0, true, aStream_834.buffer);
                        aStream_834.currentPosition = 0;
                        String s = TextInput.method525(j3, true, aStream_834);
                        s = Censor.method497(s, 0);
                        player.aString1506 = s;
                        player.anInt1513 = i1 >> 8;
                        player.anInt1531 = i1 & 0xff;
                        player.textCycle = 150;
                        switch(j2){
                            case 1:
                                pushMessage(s, 1, "@cr1@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 2:
                                pushMessage(s, 1, "@cr2@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 3:
                                pushMessage(s, 1, "@cr3@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 4:
                                pushMessage(s, 1, "@cr4@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 5:
                                pushMessage(s, 1, "@cr5@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 6:
                                pushMessage(s, 1, "@cr6@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 7:
                                pushMessage(s, 1, "@cr7@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 8:
                                pushMessage(s, 1, "@cr8@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 9:
                                pushMessage(s, 1, "@cr9@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 10:
                                pushMessage(s, 1, "@cr10@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 11:
                                pushMessage(s, 1, "@cr11@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 12:
                                pushMessage(s, 1, "@cr12@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 13:
                                pushMessage(s, 1, "@cr13@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 14:
                                pushMessage(s, 1, "@cr14@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 15:
                                pushMessage(s, 1, "@cr15@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 16:
                                pushMessage(s, 1, "@cr16@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 17:
                                pushMessage(s, 1, "@cr17@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 18:
                                pushMessage(s, 1, "@cr18@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 19:
                                pushMessage(s, 1, "@cr19@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 20:
                                pushMessage(s, 1, "@cr20@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 21:
                                pushMessage(s, 1, "@cr21@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 22:
                                pushMessage(s, 1, "@cr22@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 23:
                                pushMessage(s, 1, "@cr23@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 24:
                                pushMessage(s, 1, "@cr24@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            case 25:
                                pushMessage(s, 1, "@cr25@" + prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                                break;
                            default:
                                pushMessage(s, 2,  prefixRank(player.anInt1723) + player.name + suffixRank(player.anInt1723));
                        }
                        
                    }
                    catch(Exception exception)
                    {
                        signlink.reporterror("cde2");
                    }
            }
            stream.currentPosition = k3 + j3;
        }
        if((i & 1) != 0)
        {
            player.anInt1502 = stream.method434((byte)108);
            if(((Class30_Sub2_Sub4_Sub1) (player)).anInt1502 == 65535)
                player.anInt1502 = -1;
        }
        if((i & 0x10) != 0)
        {
            int j1 = stream.readByteC(false);
            byte abyte0[] = new byte[j1];
            Stream stream_1 = new Stream(abyte0, 891);
            stream.method417(j1, aByte920, 0, abyte0);
            aStreamArray895[j] = stream_1;
            player.method451(0, stream_1);
        }
        if((i & 2) != 0)
        {
            player.face_x = stream.method436((byte)-74);
            player.face_y = stream.method434((byte)108);
        }
        if((i & 0x20) != 0)
        {
            int k1 = stream.readUnsignedByte();
            int k2 = stream.readByteS(0);
            player.method447(-35698, k2, k1, loopCycle);
            player.anInt1532 = loopCycle + 300;
            player.anInt1533 = stream.readByteC(false);
            player.anInt1534 = stream.readUnsignedByte();
        }
        if((i & 0x200) != 0)
        {
            int l1 = stream.readUnsignedByte();
            int l2 = stream.readByteA(2);
            player.method447(-35698, l2, l1, loopCycle);
            player.anInt1532 = loopCycle + 300;
            player.anInt1533 = stream.readUnsignedByte();
            player.anInt1534 = stream.readByteC(false);
        }
    }
    public final void method108(int i)
    {
        if(i != 3)
            packet = -1;
        try
        {
            int j = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 + anInt1278;
            int k = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 + anInt1131;
            if(anInt1014 - j < -500 || anInt1014 - j > 500 || anInt1015 - k < -500 || anInt1015 - k > 500)
            {
                anInt1014 = j;
                anInt1015 = k;
            }
            if(anInt1014 != j)
                anInt1014 += (j - anInt1014) / 16;
            if(anInt1015 != k)
                anInt1015 += (k - anInt1015) / 16;
            if(super.anIntArray30[1] == 1)
                anInt1186 += (-24 - anInt1186) / 2;
            else
            if(super.anIntArray30[2] == 1)
                anInt1186 += (24 - anInt1186) / 2;
            else
                anInt1186 /= 2;
            if(super.anIntArray30[3] == 1)
                anInt1187 += (12 - anInt1187) / 2;
            else
            if(super.anIntArray30[4] == 1)
                anInt1187 += (-12 - anInt1187) / 2;
            else
                anInt1187 /= 2;
            anInt1185 = anInt1185 + anInt1186 / 2 & 0x7ff;
            anInt1184 += anInt1187 / 2;
            if(anInt1184 < 128)
                anInt1184 = 128;
            if(anInt1184 > 383)
                anInt1184 = 383;
            int l = anInt1014 >> 7;
            int i1 = anInt1015 >> 7;
            int j1 = method42(anInt918, anInt1015, true, anInt1014);
            int k1 = 0;
            if(l > 3 && i1 > 3 && l < 100 && i1 < 100)
            {
                for(int l1 = l - 4; l1 <= l + 4; l1++)
                {
                    for(int k2 = i1 - 4; k2 <= i1 + 4; k2++)
                    {
                        int l2 = anInt918;
                        if(l2 < 3 && (aByteArrayArrayArray1258[1][l1][k2] & 2) == 2)
                            l2++;
                        int i3 = j1 - anIntArrayArrayArray1214[l2][l1][k2];
                        if(i3 > k1)
                            k1 = i3;
                    }

                }

            }
            anInt1005++;
            if(anInt1005 > 1512)
            {
                anInt1005 = 0;
                stream.createFrame(77);
                stream.writeByte(0);
                int i2 = stream.currentPosition;
                stream.writeByte((int)(Math.random() * 256D));
                stream.writeByte(101);
                stream.writeByte(233);
                stream.writeWord(45092);
                if((int)(Math.random() * 2D) == 0)
                    stream.writeWord(35784);
                stream.writeByte((int)(Math.random() * 256D));
                stream.writeByte(64);
                stream.writeByte(38);
                stream.writeWord((int)(Math.random() * 65536D));
                stream.writeWord((int)(Math.random() * 65536D));
                stream.method407(stream.currentPosition - i2, (byte)0);
            }
            int j2 = k1 * 192;
            if(j2 > 0x17f00)
                j2 = 0x17f00;
            if(j2 < 32768)
                j2 = 32768;
            if(j2 > anInt984)
            {
                anInt984 += (j2 - anInt984) / 24;
                return;
            }
            if(j2 < anInt984)
            {
                anInt984 += (j2 - anInt984) / 80;
                return;
            }
        }
        catch(Exception _ex)
        {
            signlink.reporterror("glfc_ex " + ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 + "," + ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 + "," + anInt1014 + "," + anInt1015 + "," + currentRegionX + "," + currentRegionY + "," + baseX + "," + baseY);
            throw new RuntimeException("eek");
        }
    }

    public final void method9(int i)
    {
        if(aBoolean1252 || aBoolean926 || aBoolean1176)
        {
            method94(-13873);
            return;
        }
        anInt1061++;
        if(i != 0)
            packet = -1;
        if(!aBoolean1157)
            method135(false, false);
        else
            method102(true);
        anInt1213 = 0;
    }

    public final boolean method109(boolean flag, String s)
    {
        if(s == null)
            return false;
        for(int i = 0; i < anInt899; i++)
            if(s.equalsIgnoreCase(aStringArray1082[i]))
                return true;

        if(flag)
            stream.writeByte(138);
        return s.equalsIgnoreCase(localPlayer.name);
    }

    public static final String method110(int i, int j, boolean flag)
    {
        if(!flag)
            throw new NullPointerException();
        int k = i - j;
        if(k < -9)
            return "@red@";
        if(k < -6)
            return "@or3@";
        if(k < -3)
            return "@or2@";
        if(k < 0)
            return "@or1@";
        if(k > 9)
            return "@gre@";
        if(k > 6)
            return "@gr3@";
        if(k > 3)
            return "@gr2@";
        if(k > 0)
            return "@gr1@";
        else
            return "@yel@";
    }

    public final void method111(byte byte0, int i)
    {
        if(byte0 == 2)
            byte0 = 0;
        else
            method6();
        signlink.wavevol = i;
    }
    public int chattab = 0;
    private void buildBroadcasts() {

        int i = 0;

        if (BroadcastManager.isDisplayed()) {

            Broadcast bc = BroadcastManager.getCurrentBroadcast();

            if (bc == null)
                return;

            boolean update = isServerUpdating();

            int yPosition = (!isResized() ? 330 : currentGameHeight - 173) - i * 13;
            yPosition -= update ? 13 : 0;
            int messageLength = newRegularFont.getTextWidth(bc.getDecoratedMessage());
            if (openInterfaceID <= 0 && super.mouseX >= 0 && super.mouseX <= messageLength) {
                if (super.mouseY >= yPosition - 10 && super.mouseY <= yPosition) {
                    menuActionName[menuActionRow] = "Dismiss";
                    menuActionID[menuActionRow] = 11_115;
                    menuActionRow++;
                    if (bc.type != 0) {
                        menuActionName[menuActionRow] = bc.type == 1 ? "Open URL" : bc.type == 2 ? "Teleport To Location" : null;
                        menuActionID[menuActionRow] = bc.type == 1 ? 11_111 : 11_112;
                        menuActionRow++;
                    }
                }
            }
            if (++i >= 1) {
            }
        }
    }
    public final void draw3dScreen(int i) {

        if (i != 8)
            anInt939 = 130;

        method76((byte) -13);
        int y2;
        if (crossType == 1) {
            y2 = currentScreenMode == ScreenMode.FIXED ? 4 : 0;
            aSpriteArray1150[anInt916 / 100].drawSprite(anInt914 - 8 - y2, anInt915 - 8 - y2);
            anInt1142++;
            if (anInt1142 > 67) {
                anInt1142 = 0;
                stream.createFrame(78);
            }
        }
        if (crossType == 2) {
            y2 = currentScreenMode == ScreenMode.FIXED ? 4 : 0;
            aSpriteArray1150[4 + anInt916 / 100].drawSprite(anInt914 - 8 - y2, anInt915 - 8 - y2);
        }
        if (currentScreenMode == ScreenMode.FIXED) {
            gameframe[63].drawSprite(516, 0);
            gameframe[62].drawSprite(0, 0);
        }
        if (openWalkableInterface != -1) {
            method119(anInt945, false, openWalkableInterface);
            if (openWalkableInterface == 197 && currentScreenMode != ScreenMode.FIXED) {
                skullIcons[0].drawSprite(currentGameWidth - 157, 168);
                String text = Widget.interfaceCache[199].message.replace("@yel@", "");
                regularText.drawChatInput(0xE1981D, currentGameWidth - 165, text, 207, true);
        } else if (openWalkableInterface == 201 && currentScreenMode != ScreenMode.FIXED) {
            drawInterface(0, currentGameWidth - 560, Widget.interfaceCache[openWalkableInterface], -109);
        } else {
            drawInterface(0, currentScreenMode == ScreenMode.FIXED ? 0 : (currentGameWidth / 2) - 356,
                    Widget.interfaceCache[openWalkableInterface],
                    currentScreenMode == ScreenMode.FIXED ? 0 : (currentGameHeight / 2) - 230);
        }
        }
        if(openInterfaceID != -1)
        {
            method119(anInt945, false, openInterfaceID);
            if (currentScreenMode == ScreenMode.FIXED)
                drawInterface(0, 0, Widget.interfaceCache[openInterfaceID], 0);
            else
            drawInterface( 0, (currentGameWidth / 2) - 356, Widget.interfaceCache[openInterfaceID], currentScreenMode == ScreenMode.FIXED ? 0 : (currentGameHeight / 2) - 230);
        }
        //method70(184);
        if(!menuOpen)
        {
            processRightClick(0);
            method125(45706);
        } else
        if(menuScreenArea == 0)
            drawMenu(currentScreenMode == ScreenMode.FIXED ? 0 : 0, currentScreenMode == ScreenMode.FIXED ? 0 : 0);
        BroadcastManager.display(this);
        if(anInt1055 == 1)
            aSpriteArray1095[1].drawSprite(currentScreenMode == ScreenMode.FIXED ? 472 : currentGameWidth - 85, currentScreenMode == ScreenMode.FIXED ? 296 : 186);
        if(fpsOn)
        {
            char c = '\u01FB';
            int yPosition = 20;
            int xPosition = currentScreenMode == ScreenMode.FIXED ? 515 : currentGameWidth - 222;
            int i1 = 0xffff00;
            if(super.anInt8 < 15)
                i1 = 0xff0000;
            regularText.method380("Fps:" + super.anInt8, xPosition, i1, (byte)-80, yPosition);
            yPosition += 15;
            Runtime runtime = Runtime.getRuntime();
            int j1 = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            i1 = 0xffff00;
            if(j1 > 0x2000000 && lowMemory)
                i1 = 0xff0000;
            regularText.method380("Mem:" + j1 + "k", xPosition, 0xffff00, (byte)-80, yPosition);
            yPosition += 15;
        }
        int x = baseX + (localPlayer.anInt1550 - 6 >> 7);
        int y = baseY + (localPlayer.anInt1551 - 6 >> 7);
        int var131 = x >> 6;
        int var12 = y >> 6;
        int chunkX = x >> 3;
        int var141 = y >> 3;
        int regionid = var131 * 256 + var12;
        int mapx = currentRegionX; // map region x
        int mapy = currentRegionY; // map region y
        if (clientData) {
            Runtime runtime = Runtime.getRuntime();
            int j1 = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
            regularText.method385(0x00FF00, "Players Nearby: " + anInt891, 27, (byte)-80, 5);
            regularText.method385(0x00FF00, "Npcs Nearby: " + npcCount, 41, (byte)-80, 5);

            if (mapx > 1000 || mapy > 1000) {
                regularText.method385(0xffff00, "Current Region: " + mapx + ", " + mapy + ", Region ID: " + regionid, 55, (byte)-80, 5);
            } else {
                regularText.method385(0xffff00, "Current Region: 0" + mapx + ", 0" + mapy + ", Region ID: " + regionid, 55, (byte)-80, 5);
            }
            for (int num = 0; num < terrainIndices.length; num++) {
                int[] flo = terrainIndices;
                regularText.method385(0xffff00, "Floor map: " + Arrays.toString(flo), 69, (byte)-80, 5);
            }
            for (int num = 0; num < objectIndices.length; num++) {
                int[] obj = objectIndices;
                regularText.method385(0xffff00, "Object map: " + Arrays.toString(obj), 83, (byte)-80, 5);
                // output: "Object map: "[1, 3, 5, 7, 9]"
            }

            regularText.method385(0xffff00, "Map Data: " + terrainIndices[0] + ".dat", 97, (byte)-80, 5);
            regularText.method385(0xffff00, "Fps: " + super.anInt8, 111, (byte)-80, 5);
            regularText.method385(0xffff00, "Memory Used: " + j1/1024 + "MB", 125, (byte)-80, 5);
            //aClass30_Sub2_Sub1_Sub4_1271.method385(0xffff00,
            //      "Mouse: [" + super.getMouseX() + ", " + super.getMouseY() + "] [" + super.getRawMouseX() + ", " + super.getRawMouseY() + "]", 139, (byte)-80, 5);
            regularText.method385(0xffff00, "Coordinates: X: " + x + ", Y: " + y, 153, (byte)-80, 5);

            regularText.method385(0xffff00,
                    "Camera Position: X: " + xCameraPos + ", Y: " + yCameraPos + ", Z: " + zCameraPos, 167, (byte)-80, 5);
            regularText.method385(0xffff00, "Camera Curve: X: " + xCameraCurve + ", Y: " + yCameraCurve, (byte)-80, 181,
                    5);
            y = 181;
            y += 15;
        }

        if(anInt1104 != 0)
        {
            int j = anInt1104 / 50;
            int l = j / 60;
            int var16 = currentScreenMode == ScreenMode.FIXED ? 0 : currentGameHeight - 498;
            j %= 60;
            if(j < 10)
                regularText.method385(0xffff00, "System update in: " + l + ":0" + j, 329 + var16, 822, 4);
            else
                regularText.method385(0xffff00, "System update in: " + l + ":" + j, 329 + var16, 822, 4);
            anInt849++;
            if(anInt849 > 75)
            {
                anInt849 = 0;
                stream.createFrame(148);
            }
        }
    }

    public final void method113(long l, int i)
    {
        try
        {
            if(l == 0L)
                return;
            if(anInt822 >= 100)
            {
                pushMessage("Your ignore list is full. Max of 100 hit", 0, "");
                return;
            }
            String s = TextClass.fixName(TextClass.nameForLong(l));
            for(int j = 0; j < anInt822; j++)
                if(aLongArray925[j] == l)
                {
                    pushMessage(s + " is already on your ignore list", 0, "");
                    return;
                }

            if(i < 4 || i > 4)
                return;
            for(int k = 0; k < anInt899; k++)
                if(aLongArray955[k] == l)
                {
                    pushMessage("Please remove " + s + " from your friend list first", 0, "");
                    return;
                }

            aLongArray925[anInt822++] = l;
            tabAreaAltered = true;
            stream.createFrame(133);
            stream.method404(5, l);
            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("45688, " + l + ", " + i + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public final void method114(byte byte0)
    {
        if(byte0 != aByte973)
            return;
        for(int i = -1; i < anInt891; i++)
        {
            int j;
            if(i == -1)
                j = anInt889;
            else
                j = anIntArray892[i];
            Player player = aPlayerArray890[j];
            if(player != null)
                method96(46988, 1, player);
        }

    }

    private final void method115(byte byte0)
    {
        if(byte0 == 8)
            byte0 = 0;
        else
            stream.writeByte(101);
        if(anInt1023 == 2)
        {
            for(Class30_Sub1 class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetFirst(); class30_sub1 != null; class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetNext(false))
            {
                if(class30_sub1.anInt1294 > 0)
                    class30_sub1.anInt1294--;
                if(class30_sub1.anInt1294 == 0)
                {
                    if(class30_sub1.anInt1299 < 0 || ObjectManager.method178(class30_sub1.anInt1299, class30_sub1.anInt1301, 8))
                    {
                        method142(class30_sub1.anInt1298, class30_sub1.anInt1295, class30_sub1.anInt1300, class30_sub1.anInt1301, class30_sub1.anInt1297, class30_sub1.anInt1296, class30_sub1.anInt1299, 4);
                        class30_sub1.unlink();
                    }
                } else
                {
                    if(class30_sub1.anInt1302 > 0)
                        class30_sub1.anInt1302--;
                    if(class30_sub1.anInt1302 == 0 && class30_sub1.anInt1297 >= 1 && class30_sub1.anInt1298 >= 1 && class30_sub1.anInt1297 <= 102 && class30_sub1.anInt1298 <= 102 && (class30_sub1.anInt1291 < 0 || ObjectManager.method178(class30_sub1.anInt1291, class30_sub1.anInt1293, 8)))
                    {
                        method142(class30_sub1.anInt1298, class30_sub1.anInt1295, class30_sub1.anInt1292, class30_sub1.anInt1293, class30_sub1.anInt1297, class30_sub1.anInt1296, class30_sub1.anInt1291, 4);
                        class30_sub1.anInt1302 = -1;
                        if(class30_sub1.anInt1291 == class30_sub1.anInt1299 && class30_sub1.anInt1299 == -1)
                            class30_sub1.unlink();
                        else
                        if(class30_sub1.anInt1291 == class30_sub1.anInt1299 && class30_sub1.anInt1292 == class30_sub1.anInt1300 && class30_sub1.anInt1293 == class30_sub1.anInt1301)
                            class30_sub1.unlink();
                    }
                }
            }

        }
    }

    public final void method116(boolean flag)
    {
        int i = boldText.method383(anInt1116, "Choose Option");
        aBoolean1157 &= flag;
        for(int j = 0; j < menuActionRow; j++)
        {
            int k = boldText.method383(anInt1116, menuActionName[j]);
            if(k > i)
                i = k;
        }

        i += 8;
        int l = 15 * menuActionRow + 21;
        if(super.saveClickX > 0 && super.saveClickY > 0 && super.saveClickX < currentGameWidth && super.saveClickY < currentGameHeight)
        {
            int i1 = super.saveClickX  - i / 2;
            if(i1 + i > currentGameWidth - 4)
                i1 = currentGameWidth - 4- i;
            if(i1 < 0)
                i1 = 0;
            int l1 = super.saveClickY - 0;
            if(l1 + l > currentGameHeight- 2)
                l1 = currentGameHeight - 2 - l;
            if(l1 < 0)
                l1 = 0;
            menuOpen = true;
            anInt949 = i1;
            anInt950 = l1;
            anInt951 = i;
            anInt952 = 15 * menuActionRow + 22;
        }
    }

    private final void method117(Stream stream, int i, byte byte0)
    {
        stream.method418(anInt1118);
        if(byte0 == 5)
            byte0 = 0;
        else
            packet = stream.readUnsignedByte();
        int j = stream.readBits(1);
        if(j == 0)
            return;
        int k = stream.readBits(2);
        if(k == 0)
        {
            anIntArray894[anInt893++] = anInt889;
            return;
        }
        if(k == 1)
        {
            int l = stream.readBits(3);
            localPlayer.method448(false, (byte)20, l);
            int k1 = stream.readBits(1);
            if(k1 == 1)
                anIntArray894[anInt893++] = anInt889;
            return;
        }
        if(k == 2)
        {
            int i1 = stream.readBits(3);
            localPlayer.method448(true, (byte)20, i1);
            int l1 = stream.readBits(3);
            localPlayer.method448(true, (byte)20, l1);
            int j2 = stream.readBits(1);
            if(j2 == 1)
                anIntArray894[anInt893++] = anInt889;
            return;
        }
        if(k == 3)
        {
            anInt918 = stream.readBits(2);
            int j1 = stream.readBits(1);
            int i2 = stream.readBits(1);
            if(i2 == 1)
                anIntArray894[anInt893++] = anInt889;
            int k2 = stream.readBits(7);
            int l2 = stream.readBits(7);
            localPlayer.method445(l2, k2, j1 == 1, false);
        }
    }

    public final void method118(int i)
    {
        aBoolean831 = false;
        while(aBoolean962)
        {
            aBoolean831 = false;
            try
            {
                Thread.sleep(50L);
            }
            catch(Exception _ex) { }
        }
        aBackground_966 = null;
        aBackground_967 = null;
        aBackgroundArray1152 = null;
        anIntArray850 = null;
        anIntArray851 = null;
        anIntArray852 = null;
        anIntArray853 = null;
        anIntArray1190 = null;
        anIntArray1191 = null;
        anIntArray828 = null;
        anIntArray829 = null;
        aSprite_1201 = null;
        aSprite_1202 = null;
        if(i < 3 || i > 3)
            aClass19ArrayArrayArray827 = null;
    }

    public final boolean method119(int i, boolean flag, int j)
    {
        boolean flag1 = false;
        if(flag)
            throw new NullPointerException();
        Widget class9 = Widget.interfaceCache[j];
        for(int k = 0; k < class9.children.length; k++)
        {
            if(class9.children[k] == -1)
                break;
            Widget class9_1 = Widget.interfaceCache[class9.children[k]];
            if(class9_1.type == 1)
                flag1 |= method119(i, false, class9_1.id);
            if(class9_1.type == 6 && (class9_1.anInt257 != -1 || class9_1.anInt258 != -1))
            {
                boolean flag2 = method131(class9_1, false);
                int l;
                if(flag2)
                    l = class9_1.anInt258;
                else
                    l = class9_1.anInt257;
                if(l != -1)
                {
                    Class20 class20 = Class20.aClass20Array351[l];
                    for(class9_1.anInt208 += i; class9_1.anInt208 > class20.method258(class9_1.anInt246, (byte)-39);)
                    {
                        class9_1.anInt208 -= class20.method258(class9_1.anInt246, (byte)-39) + 1;
                        class9_1.anInt246++;
                        if(class9_1.anInt246 >= class20.anInt352)
                        {
                            class9_1.anInt246 -= class20.anInt356;
                            if(class9_1.anInt246 < 0 || class9_1.anInt246 >= class20.anInt352)
                                class9_1.anInt246 = 0;
                        }
                        flag1 = true;
                    }

                }
            }
        }

        return flag1;
    }

    public final int method120(int i)
    {
        if(i <= 0)
            aBoolean1224 = !aBoolean1224;
        if (roofsOff) {
            return anInt918;
        }
        int j = 3;
        if(yCameraCurve < 310)
        {
            int k = xCameraPos >> 7;
            int l = yCameraPos >> 7;
            int i1 = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 >> 7;
            int j1 = ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 >> 7;
            if((aByteArrayArrayArray1258[anInt918][k][l] & 4) != 0)
                j = anInt918;
            int k1;
            if(i1 > k)
                k1 = i1 - k;
            else
                k1 = k - i1;
            int l1;
            if(j1 > l)
                l1 = j1 - l;
            else
                l1 = l - j1;
            if(k1 > l1)
            {
                int i2 = (l1 * 0x10000) / k1;
                int k2 = 32768;
                while(k != i1)
                {
                    if(k < i1)
                        k++;
                    else
                    if(k > i1)
                        k--;
                    if((aByteArrayArrayArray1258[anInt918][k][l] & 4) != 0)
                        j = anInt918;
                    k2 += i2;
                    if(k2 >= 0x10000)
                    {
                        k2 -= 0x10000;
                        if(l < j1)
                            l++;
                        else
                        if(l > j1)
                            l--;
                        if((aByteArrayArrayArray1258[anInt918][k][l] & 4) != 0)
                            j = anInt918;
                    }
                }
            } else
            {
                int j2 = (k1 * 0x10000) / l1;
                int l2 = 32768;
                while(l != j1)
                {
                    if(l < j1)
                        l++;
                    else
                    if(l > j1)
                        l--;
                    if((aByteArrayArrayArray1258[anInt918][k][l] & 4) != 0)
                        j = anInt918;
                    l2 += j2;
                    if(l2 >= 0x10000)
                    {
                        l2 -= 0x10000;
                        if(k < i1)
                            k++;
                        else
                        if(k > i1)
                            k--;
                        if((aByteArrayArrayArray1258[anInt918][k][l] & 4) != 0)
                            j = anInt918;
                    }
                }
            }
        }
        if((aByteArrayArrayArray1258[anInt918][((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 >> 7][((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 >> 7] & 4) != 0)
            j = anInt918;
        return j;
    }

    public final int method121(int i)
    {
        if (roofsOff) {
            return anInt918;
        }
        int j = method42(anInt918, yCameraPos, true, xCameraPos);
        if(j - zCameraPos < 800 && (aByteArrayArrayArray1258[anInt918][xCameraPos >> 7][yCameraPos >> 7] & 4) != 0)
            return anInt918;
        else
            return 3;
    }

    public final void method122(int i, long l)
    {
        try
        {
            if(i != 3)
                method6();
            if(l == 0L)
                return;
            for(int j = 0; j < anInt822; j++)
                if(aLongArray925[j] == l)
                {
                    anInt822--;
                    tabAreaAltered = true;
                    for(int k = j; k < anInt822; k++)
                        aLongArray925[k] = aLongArray925[k + 1];

                    stream.createFrame(74);
                    stream.method404(5, l);
                    return;
                }

            return;
        }
        catch(RuntimeException runtimeexception)
        {
            signlink.reporterror("47229, " + i + ", " + l + ", " + runtimeexception.toString());
        }
        throw new RuntimeException();
    }

    public String getParameter(String s)
    {
        if(signlink.mainapp != null)
            return signlink.mainapp.getParameter(s);
        else
            return super.getParameter(s);
    }
    public void playSong(int id) {
        if (currentSong != id) {
            nextSong = id;
            songChanging = true;
            onDemandFetcher.method558(2, nextSong);
            currentSong = id;
        }
    }
    public final void method123(byte byte0, boolean flag, int i)
    {
        if(byte0 == 0)
            byte0 = 0;
        else
            aClass19ArrayArrayArray827 = null;
        signlink.setVolume(i);
        if(flag)
            signlink.midi = "voladjust";
    }
    public void stopMidi() {
        signlink.music.stop();
        signlink.fadeMidi = 0;
        signlink.midi = "stop";
    }

    private void adjustVolume(boolean updateMidi, int volume) {
        signlink.setVolume(volume);
        if (updateMidi) {
            signlink.midi = "voladjust";
        }
    }
    public final int method124(int i, Widget class9, int j)
    {
        i = 91 / i;
        if(class9.valueIndexArray == null || j >= class9.valueIndexArray.length)
            return -2;
        try
        {
            int ai[] = class9.valueIndexArray[j];
            int k = 0;
            int l = 0;
            int i1 = 0;
            do
            {
                int j1 = ai[l++];
                int k1 = 0;
                byte byte0 = 0;
                if(j1 == 0)
                    return k;
                if(j1 == 1)
                    k1 = anIntArray922[ai[l++]];
                if(j1 == 2)
                    k1 = anIntArray1044[ai[l++]];
                if(j1 == 3)
                    k1 = anIntArray864[ai[l++]];
                if(j1 == 4)
                {
                    Widget class9_1 = Widget.interfaceCache[ai[l++]];
                    int k2 = ai[l++];
                    if(k2 >= 0 && k2 < Class8.anInt203 && (!Class8.method198(k2).aBoolean161 || aBoolean959))
                    {
                        for(int j3 = 0; j3 < class9_1.inv.length; j3++)
                            if(class9_1.inv[j3] == k2 + 1)
                                k1 += class9_1.invStackSizes[j3];

                    }
                }
                if(j1 == 5)
                    k1 = variousSettings[ai[l++]];
                if(j1 == 6)
                    k1 = anIntArray1019[anIntArray1044[ai[l++]] - 1];
                if(j1 == 7)
                    k1 = (variousSettings[ai[l++]] * 100) / 46875;
                if(j1 == 8)
                    k1 = localPlayer.anInt1705;
                if(j1 == 9)
                {
                    for(int l1 = 0; l1 < Skills.SKILLS_COUNT; l1++)
                        if(Skills.SKILLS_ENABLED[l1])
                            k1 += anIntArray1044[l1];

                }
                if(j1 == 10)
                {
                    Widget class9_2 = Widget.interfaceCache[ai[l++]];
                    int l2 = ai[l++] + 1;
                    if(l2 >= 0 && l2 < Class8.anInt203 && (!Class8.method198(l2).aBoolean161 || aBoolean959))
                    {
                        for(int k3 = 0; k3 < class9_2.inv.length; k3++)
                        {
                            if(class9_2.inv[k3] != l2)
                                continue;
                            k1 = 0x3b9ac9ff;
                            break;
                        }

                    }
                }
                if(j1 == 11)
                    k1 = anInt1148;
                if(j1 == 12)
                    k1 = anInt878;
                if(j1 == 13)
                {
                    int i2 = variousSettings[ai[l++]];
                    int i3 = ai[l++];
                    k1 = (i2 & 1 << i3) == 0 ? 0 : 1;
                }
                if(j1 == 14)
                {
                    int j2 = ai[l++];
                    VarBit varBit = VarBit.cache[j2];
                    int l3 = varBit.anInt648;
                    int i4 = varBit.anInt649;
                    int j4 = varBit.anInt650;
                    int k4 = anIntArray1232[j4 - i4];
                    k1 = variousSettings[l3] >> i4 & k4;
                }
                if(j1 == 15)
                    byte0 = 1;
                if(j1 == 16)
                    byte0 = 2;
                if(j1 == 17)
                    byte0 = 3;
                if(j1 == 18)
                    k1 = (((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 >> 7) + baseX;
                if(j1 == 19)
                    k1 = (((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 >> 7) + baseY;
                if(j1 == 20)
                    k1 = ai[l++];
                if(byte0 == 0)
                {
                    if(i1 == 0)
                        k += k1;
                    if(i1 == 1)
                        k -= k1;
                    if(i1 == 2 && k1 != 0)
                        k /= k1;
                    if(i1 == 3)
                        k *= k1;
                    i1 = 0;
                } else
                {
                    i1 = byte0;
                }
            } while(true);
        }
        catch(Exception _ex)
        {
            return -1;
        }
    }

    public final void method125(int i)
    {
        if(menuActionRow < 2 && anInt1282 == 0 && anInt1136 == 0)
            return;
        String s;
        if(anInt1282 == 1 && menuActionRow < 2)
            s = "Use " + aString1286 + " on...";
        else
            //if(anInt1136 == 1 && anInt1133 < 2)
            //s = aString1139 + "...";
            //else
            s = menuActionName[menuActionRow - 1];
        if(menuActionRow > 2)
            s = s + "@whi@ / " + (menuActionRow - 2) + " more options";
        boldText.method390(true, 4, 0xffffff, s, loopCycle / 1000, 973, 15);
        if(i != 45706)
        {
            for(int j = 1; j > 0; j++);
        }
    }

    public final void drawMinimap(boolean flag) {
        if (currentScreenMode == ScreenMode.FIXED) {
            aRSImageProducer_1164.initDrawingArea();
        }
        if (anInt1021 == 2) {
            if (currentScreenMode == ScreenMode.FIXED) {
                BlackMap[0].drawSprite(0, 0);
            } else {
                this.gameframe[22].drawSprite(currentGameWidth - 181, 0);
                this.gameframe[23].drawSprite(currentGameWidth - 158,7);
            }

            if (currentScreenMode != ScreenMode.FIXED && changeTabArea) {
                if ((super.mouseX < currentGameWidth - 26 || super.mouseX > currentGameWidth - 1 || super.mouseY < 2
                        || super.mouseY > 24) && tabID != 10) {
                    this.gameframe[31].drawARGBSprite(currentGameWidth - 25, 2, 165);
                } else {
                    this.gameframe[31].drawSprite(currentGameWidth - 25,2);
                }
            }


            this.compassImage.method352(33, this.anInt1185, this.anIntArray1057, 256, this.anIntArray968, -236,
                    currentScreenMode == ScreenMode.FIXED ? 25 : 24, 4,
                    currentScreenMode == ScreenMode.FIXED ? 29 : currentGameWidth - 176, 33, 25);
            if (this.menuOpen) {
                this.drawMenu(currentScreenMode == ScreenMode.FIXED ? 516 : 0, 0);
            }

            if (currentScreenMode == ScreenMode.FIXED) {
                aRSImageProducer_1165.initDrawingArea();
            }
        } else {
        int i = anInt1185 + anInt1209 & 0x7ff;
        int j = 48 + ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
        int l2 = 464 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
            this.minimapImage.method352(151, i, this.anIntArray1229, 256 + this.anInt1170, this.anIntArray1052, -236,
                    l2, currentScreenMode == ScreenMode.FIXED ? 9 : 7,
                    currentScreenMode == ScreenMode.FIXED ? 54 : currentGameWidth - 158, 146, j);
        for (int j5 = 0; j5 < anInt1071; j5++) {
            int k = (anIntArray1072[j5] * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
            int i3 = (anIntArray1073[j5] * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
            method141(aSpriteArray1140[j5], k, i3, false);
            method141(Mapicon, ((3255 - baseX) * 4 + 2) - localPlayer.anInt1550 / 32, ((3290 - baseY) * 4 + 2) - localPlayer.anInt1551 / 32, true);
        }

        for (int k5 = 0; k5 < 104; k5++) {
            for (int l5 = 0; l5 < 104; l5++) {
                Class19 class19 = aClass19ArrayArrayArray827[anInt918][k5][l5];
                if (class19 != null) {
                    int l = (k5 * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                    int j3 = (l5 * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                    method141(aSprite_1074, l, j3, false);
                }
            }

        }

        for (int i6 = 0; i6 < npcCount; i6++) {
            Npc npc = npcs[npcIndices[i6]];
            if (npc != null && npc.method449(aBoolean1224)) {
                Class5 class5 = npc.desc;
                if (class5.anIntArray88 != null)
                    class5 = class5.method161();
                if (class5 != null && class5.aBoolean87 && class5.aBoolean84) {
                    int i1 = ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1550 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                    int k3 = ((Class30_Sub2_Sub4_Sub1) (npc)).anInt1551 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                    method141(aSprite_1075, i1, k3, false);
                }
            }
        }

        for (int j6 = 0; j6 < anInt891; j6++) {
            Player player = aPlayerArray890[anIntArray892[j6]];
            if (player != null && player.method449(aBoolean1224)) {
                int j1 = ((Class30_Sub2_Sub4_Sub1) (player)).anInt1550 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                int l3 = ((Class30_Sub2_Sub4_Sub1) (player)).anInt1551 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                boolean flag1 = false;
                boolean flag3 = false;
                String clanname;
                for (int j3 = 0; j3 < clanList.length; j3++) {
                    if (clanList[j3] == null)
                        continue;
                    clanname = clanList[j3];
                    if (clanname.startsWith("<clan"))
                        clanname = clanname.substring(clanname.indexOf(">") + 1);
                    if (!clanname.equalsIgnoreCase(player.name))
                        continue;
                    flag3 = true;
                    break;
                }
                long l6 = TextClass.longForName(player.name);
                for (int k6 = 0; k6 < anInt899; k6++) {
                    if (l6 != aLongArray955[k6] || anIntArray826[k6] == 0)
                        continue;
                    flag1 = true;
                    break;
                }

                boolean flag2 = false;
                if (localPlayer.anInt1701 != 0 && player.anInt1701 != 0 && localPlayer.anInt1701 == player.anInt1701)
                    flag2 = true;
                if (flag1)
                    method141(aSprite_1077, j1, l3, false);
                else if (flag2)
                    method141(aSprite_1078, j1, l3, false);
                else
                    method141(aSprite_1076, j1, l3, false);
            }
        }

        if (anInt855 != 0 && loopCycle % 20 < 10) {
            if (anInt855 == 1 && anInt1222 >= 0 && anInt1222 < npcs.length) {
                Npc class30_sub2_sub4_sub1_sub1_1 = npcs[anInt1222];
                if (class30_sub2_sub4_sub1_sub1_1 != null) {
                    int k1 = ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anInt1550 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                    int i4 = ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub1_1)).anInt1551 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                    method81(aSprite_871, -760, i4, k1);
                }
            }
            if (anInt855 == 2) {
                int l1 = ((anInt934 - baseX) * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                int j4 = ((anInt935 - baseY) * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                method81(aSprite_871, -760, j4, l1);
            }
            if (anInt855 == 10 && anInt933 >= 0 && anInt933 < aPlayerArray890.length) {
                Player class30_sub2_sub4_sub1_sub2_1 = aPlayerArray890[anInt933];
                if (class30_sub2_sub4_sub1_sub2_1 != null) {
                    int i2 = ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anInt1550 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
                    int k4 = ((Class30_Sub2_Sub4_Sub1) (class30_sub2_sub4_sub1_sub2_1)).anInt1551 / 32 - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
                    method81(aSprite_871, -760, k4, i2);
                }
            }
        }
        if (anInt1261 != 0) {
            int j2 = (anInt1261 * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550 / 32;
            int l4 = (anInt1262 * 4 + 2) - ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551 / 32;
            method141(aSprite_870, j2, l4, false);
        }
        DrawingArea.drawPixels(3, currentScreenMode == ScreenMode.FIXED ? 83 : 80, currentScreenMode == ScreenMode.FIXED ? 127 : currentGameWidth - 88, 0xffffff, 3);
            if (currentScreenMode == ScreenMode.FIXED) {
                this.gameframe[29].drawSprite(0, 0);
            } else {
                this.gameframe[22].drawSprite(currentGameWidth - 181, 0);
            }

            this.compassImage.method352(33, this.anInt1185, this.anIntArray1057, 256, this.anIntArray968, -236,
                    currentScreenMode == ScreenMode.FIXED ? 25 : 24, 4,
                    currentScreenMode == ScreenMode.FIXED ? 29 : currentGameWidth - 176, 33, 25);
            if (currentScreenMode != ScreenMode.FIXED && changeTabArea) {
                if ((super.mouseX < currentGameWidth - 26 || super.mouseX > currentGameWidth - 1 || super.mouseY < 2
                        || super.mouseY > 24) && tabID != 10) {
                    this.gameframe[31].drawSprite(currentGameWidth - 25, 165);
                } else {
                    this.gameframe[31].drawSprite(currentGameWidth - 25, 2);
                }
            }
        if (this.menuOpen) {
            this.drawMenu(currentScreenMode == ScreenMode.FIXED ? 516 : 0, 0);
        }
        if (currentScreenMode == ScreenMode.FIXED) {
            aRSImageProducer_1165.initDrawingArea();
        }
    }
    }

    public final void method127(boolean flag, Class30_Sub2_Sub4_Sub1 class30_sub2_sub4_sub1, int i)
    {
        method128(class30_sub2_sub4_sub1.anInt1550, i, anInt875, class30_sub2_sub4_sub1.anInt1551);
    }

    public final void method128(int i, int j, int k, int l)
    {
        if(i < 128 || l < 128 || i > 13056 || l > 13056)
        {
            anInt963 = -1;
            anInt964 = -1;
            return;
        }
        int i1 = method42(anInt918, l, true, i) - j;
        i -= xCameraPos;
        i1 -= zCameraPos;
        l -= yCameraPos;
        int j1 = Class30_Sub2_Sub4_Sub6.anIntArray1689[yCameraCurve];
        int k1 = Class30_Sub2_Sub4_Sub6.anIntArray1690[yCameraCurve];
        int l1 = Class30_Sub2_Sub4_Sub6.anIntArray1689[xCameraCurve];
        int i2 = Class30_Sub2_Sub4_Sub6.anIntArray1690[xCameraCurve];
        int j2 = l * l1 + i * i2 >> 16;
        l = l * i2 - i * l1 >> 16;
        i = j2;
        j2 = i1 * k1 - l * j1 >> 16;
        l = i1 * j1 + l * k1 >> 16;
        i1 = j2;
        if(l >= 50)
        {
            anInt963 = Rasterizer.anInt1466 + (i << client.log_view_dist) / l;
            anInt964 = Rasterizer.anInt1467 + (i1 << client.log_view_dist) / l;
        } else {
            anInt963 = -1;
            anInt964 = -1;
        }
    }

    public final void method129(boolean flag)
    {
        if(splitPrivateChat == 0)
            return;
        int i = 0;
        if(flag)
            packet = -1;
        int listPosition = 0;
        boolean update = anInt1104 != 0;
        boolean broadcast = BroadcastManager.isDisplayed();
         listPosition = update && broadcast ? 2 : broadcast || update ? 1 : 0;
        for(int j = 0; j < 500; j++)
            if(chatMessages[j] != null)
            {
                int k = chatTypes[j];
                String s = chatNames[j];
                boolean flag1 = false;
                if (s != null && s.startsWith("@cr1@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr2@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr3@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr4@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr5@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr6@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr7@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr8@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr9@"))
                    s = s.substring(5);
                if (s != null && s.startsWith("@cr10@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr11@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr12@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr13@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr14@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr15@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr16@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr17@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr18@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr19@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr20@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr21@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr22@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr23@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr24@"))
                    s = s.substring(6);
                if (s != null && s.startsWith("@cr25@"))
                    s = s.substring(6);
                if((k == 3 || k == 7) && (k == 7 || privateChatMode == 0 || privateChatMode == 1 && method109(false, s)))
                {
                    int l = (!isResized() ? 330 : currentGameHeight - 173) - listPosition * 13;
                    if(super.mouseX > 4 && super.mouseY - 4 > l - 10 && super.mouseY - (!isResized() ? 5 : 0) <= l + 3)
                    {
                        int i1 = regularText.method383(anInt1116, "From:  " + s + chatMessages[j]) + 25;
                        if(i1 > 450)
                            i1 = 450;
                        if(super.mouseX < 4 + i1)
                        {
                            if(rights >= 1)
                            {
                                menuActionName[menuActionRow] = "Report @whi@" + s;
                                menuActionID[menuActionRow] = 2606;
                                menuActionRow++;
                            }
                            menuActionName[menuActionRow] = "Add ignore @red@" + s;
                            menuActionID[menuActionRow] = 2042;
                            menuActionRow++;
                            menuActionName[menuActionRow] = "Add friend @whi@" + s;
                            menuActionID[menuActionRow] = 2337;
                            menuActionRow++;
                        }
                    }
                    if(++i >= 5)
                        return;
                }
                if((k == 5 || k == 6) && privateChatMode < 2 && ++i >= 5)
                    return;
            }

    }

    private final void method130(int i, int j, int k, int l, int i1, int j1, int k1,
                                 int l1, int i2, int j2)
    {
        Class30_Sub1 class30_sub1 = null;
        for(Class30_Sub1 class30_sub1_1 = (Class30_Sub1)aClass19_1179.reverseGetFirst(); class30_sub1_1 != null; class30_sub1_1 = (Class30_Sub1)aClass19_1179.reverseGetNext(false))
        {
            if(class30_sub1_1.anInt1295 != l1 || class30_sub1_1.anInt1297 != i2 || class30_sub1_1.anInt1298 != j1 || class30_sub1_1.anInt1296 != i1)
                continue;
            class30_sub1 = class30_sub1_1;
            break;
        }

        if(class30_sub1 == null)
        {
            class30_sub1 = new Class30_Sub1();
            class30_sub1.anInt1295 = l1;
            class30_sub1.anInt1296 = i1;
            class30_sub1.anInt1297 = i2;
            class30_sub1.anInt1298 = j1;
            method89(false, class30_sub1);
            aClass19_1179.insertHead(class30_sub1);
        }
        class30_sub1.anInt1291 = k;
        class30_sub1.anInt1293 = k1;
        class30_sub1.anInt1292 = l;
        class30_sub1.anInt1302 = j2;
        class30_sub1.anInt1294 = j;
        if(i > 0);
    }

    public final boolean method131(Widget class9, boolean flag)
    {
        if(flag)
            anInt883 = -211;
        if(class9.anIntArray245 == null)
            return false;
        for(int i = 0; i < class9.anIntArray245.length; i++)
        {
            int j = method124(341, class9, i);
            int k = class9.anIntArray212[i];
            if(class9.anIntArray245[i] == 2)
            {
                if(j >= k)
                    return false;
            } else
            if(class9.anIntArray245[i] == 3)
            {
                if(j <= k)
                    return false;
            } else
            if(class9.anIntArray245[i] == 4)
            {
                if(j == k)
                    return false;
            } else
            if(j != k)
                return false;
        }

        return true;
    }

    public final DataInputStream method132(String s)
            throws IOException
    {
        //if(!aBoolean872)
        //    if(signlink.mainapp != null)
        //        return signlink.openurl(s);
        //    else
        //        return new DataInputStream((new URL(getCodeBase(), s)).openStream());
        if(aSocket832 != null)
        {
            try
            {
                aSocket832.close();
            }
            catch(Exception _ex) { }
            aSocket832 = null;
        }
        aSocket832 = method19(29433);
        aSocket832.setSoTimeout(10000);
        java.io.InputStream inputstream = aSocket832.getInputStream();
        OutputStream outputstream = aSocket832.getOutputStream();
        outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
        return new DataInputStream(inputstream);
    }

    public final void method133(byte byte0)
    {
        char c = '\u0100';
        if(anInt1040 > 0)
        {
            for(int i = 0; i < 256; i++)
                if(anInt1040 > 768)
                    anIntArray850[i] = method83(true, anIntArray851[i], anIntArray852[i], 1024 - anInt1040);
                else
                if(anInt1040 > 256)
                    anIntArray850[i] = anIntArray852[i];
                else
                    anIntArray850[i] = method83(true, anIntArray852[i], anIntArray851[i], 256 - anInt1040);

        } else
        if(anInt1041 > 0)
        {
            for(int j = 0; j < 256; j++)
                if(anInt1041 > 768)
                    anIntArray850[j] = method83(true, anIntArray851[j], anIntArray853[j], 1024 - anInt1041);
                else
                if(anInt1041 > 256)
                    anIntArray850[j] = anIntArray853[j];
                else
                    anIntArray850[j] = method83(true, anIntArray853[j], anIntArray851[j], 256 - anInt1041);

        } else
        {
            for(int k = 0; k < 256; k++)
                anIntArray850[k] = anIntArray851[k];

        }
        for(int l = 0; l < 33920; l++)
            aRSImageProducer_1110.anIntArray315[l] = aSprite_1201.myPixels[l];

        int i1 = 0;
        int j1 = 1152;
        for(int k1 = 1; k1 < c - 1; k1++)
        {
            int l1 = (anIntArray969[k1] * (c - k1)) / c;
            int j2 = 22 + l1;
            if(j2 < 0)
                j2 = 0;
            i1 += j2;
            for(int l2 = j2; l2 < 128; l2++)
            {
                int j3 = anIntArray828[i1++];
                if(j3 != 0)
                {
                    int l3 = j3;
                    int j4 = 256 - j3;
                    j3 = anIntArray850[j3];
                    int l4 = aRSImageProducer_1110.anIntArray315[j1];
                    aRSImageProducer_1110.anIntArray315[j1++] = ((j3 & 0xff00ff) * l3 + (l4 & 0xff00ff) * j4 & 0xff00ff00) + ((j3 & 0xff00) * l3 + (l4 & 0xff00) * j4 & 0xff0000) >> 8;
                } else
                {
                    j1++;
                }
            }

            j1 += j2;
        }

        aRSImageProducer_1110.method238(0, 23680, super.aGraphics12, 0);
        for(int i2 = 0; i2 < 33920; i2++)
            aRSImageProducer_1111.anIntArray315[i2] = aSprite_1202.myPixels[i2];

        i1 = 0;
        j1 = 1176;
        for(int k2 = 1; k2 < c - 1; k2++)
        {
            int i3 = (anIntArray969[k2] * (c - k2)) / c;
            int k3 = 103 - i3;
            j1 += i3;
            for(int i4 = 0; i4 < k3; i4++)
            {
                int k4 = anIntArray828[i1++];
                if(k4 != 0)
                {
                    int i5 = k4;
                    int j5 = 256 - k4;
                    k4 = anIntArray850[k4];
                    int k5 = aRSImageProducer_1111.anIntArray315[j1];
                    aRSImageProducer_1111.anIntArray315[j1++] = ((k4 & 0xff00ff) * i5 + (k5 & 0xff00ff) * j5 & 0xff00ff00) + ((k4 & 0xff00) * i5 + (k5 & 0xff00) * j5 & 0xff0000) >> 8;
                } else
                {
                    j1++;
                }
            }

            i1 += 128 - k3;
            j1 += 128 - k3 - i3;
        }

        aRSImageProducer_1111.method238(0, 23680, super.aGraphics12, 637);
        if(byte0 != 9)
            packet = in.readUnsignedByte();
    }

    private final void method134(byte byte0, int i, Stream stream)
    {
        int j = stream.readBits(8);
        if(j < anInt891)
        {
            for(int k = j; k < anInt891; k++)
                anIntArray840[anInt839++] = anIntArray892[k];

        }
        if(j > anInt891)
        {
            signlink.reporterror(myUsername + " Too many players");
            throw new RuntimeException("eek");
        }
        anInt891 = 0;
        for(int l = 0; l < j; l++)
        {
            int i1 = anIntArray892[l];
            Player player = aPlayerArray890[i1];
            int j1 = stream.readBits(1);
            if(j1 == 0)
            {
                anIntArray892[anInt891++] = i1;
                player.anInt1537 = loopCycle;
            } else
            {
                int k1 = stream.readBits(2);
                if(k1 == 0)
                {
                    anIntArray892[anInt891++] = i1;
                    player.anInt1537 = loopCycle;
                    anIntArray894[anInt893++] = i1;
                } else
                if(k1 == 1)
                {
                    anIntArray892[anInt891++] = i1;
                    player.anInt1537 = loopCycle;
                    int l1 = stream.readBits(3);
                    player.method448(false, (byte)20, l1);
                    int j2 = stream.readBits(1);
                    if(j2 == 1)
                        anIntArray894[anInt893++] = i1;
                } else
                if(k1 == 2)
                {
                    anIntArray892[anInt891++] = i1;
                    player.anInt1537 = loopCycle;
                    int i2 = stream.readBits(3);
                    player.method448(true, (byte)20, i2);
                    int k2 = stream.readBits(3);
                    player.method448(true, (byte)20, k2);
                    int l2 = stream.readBits(1);
                    if(l2 == 1)
                        anIntArray894[anInt893++] = i1;
                } else
                if(k1 == 3)
                    anIntArray840[anInt839++] = i1;
            }
        }

        if(byte0 != 2)
            anInt939 = -80;
    }

    public final void method135(boolean flag, boolean flag1) {
        resetImageProducers(0);
        aRSImageProducer_1109.initDrawingArea();
        aBackground_966.method361(0, 0);
        char c = '\u0168';
        char c1 = '\310';
        if(flag1)
            return;
        if(anInt833 == 0) {
            int i = c1 / 2 + 80;
            smallText.method382(0x75a9a9, c / 2, anInt939, onDemandFetcher.aString1333, i, true);
            i = c1 / 2 - 70;
            boldText.method382(0xffff00, c / 2, anInt939, "@whi@Welcome to GodzHell Reborn and Remastered", i, true);
            i = c1 / 2 - 50;
            boldText.method382(0xffff00, c / 2, anInt939, "@whi@@ By Undead Games", i, true);
            i = c1 / 2 - 20;
            boldText.method382(0xff0000, c / 2, anInt939, "@whi@New and Existing players click Enter to play", i, true);
            i += 30;
            int l = c / 2 - 80;
            int k1 = c1 / 2 + 20;
            aBackground_967.method361(l - 73, k1 - 20);
            boldText.method382(0xffffff, l, anInt939, "@whi@  About", k1 + 5, true);
            l = c / 2 + 80;
            aBackground_967.method361(l - 73, k1 - 20);
            boldText.method382(0xffffff, l, anInt939, "@whi@Enter", k1 + 5, true);
        }
        if(anInt833 == 2) {
            int j = c1 / 2 - 40;
            if(aString1266.length() > 0) {
                boldText.method382(0xffff00, c / 2, anInt939, aString1266, j - 15, true);
                boldText.method382(0xffff00, c / 2, anInt939, aString1267, j, true);
                j += 15;
            } else {
                boldText.method382(0xffff00, c / 2, anInt939, aString1267, j - 7, true);
                j += 15;
            }
            boldText.method389(false, true, c / 2 - 90, 0xffffff, (new StringBuilder()).append("@whi@Login: ").append(myUsername).append((anInt1216 == 0) & (loopCycle % 40 < 20) ? "@xxx@|" : "").toString(), j);
            j += 15;
            boldText.method389(false, true, c / 2 - 90, 0xffffff, (new StringBuilder()).append("@whi@Password: ").append(TextClass.method588(myPassword, 0)).append((anInt1216 == 1) & (anInt1105 % 40 < 20) ? "|" : "").toString(), j);
            j += 30;
            boldText.method389(false, true, c / 2 - 160, 0xfff00, "@whi@New users enter a name and password to begin", j);
            j += 70;
            j += 15;
            if(!flag) {
                int i1 = c / 2 - 80;
                int l1 = c1 / 2 + 50;
                aBackground_967.method361(i1 - 73, l1 - 20);
                boldText.method382(0xffffff, i1, anInt939, "@whi@Log in", l1 + 5, true);
                i1 = c / 2 + 80;
                aBackground_967.method361(i1 - 73, l1 - 20);
                boldText.method382(0xffffff, i1, anInt939, "@whi@Cancel", l1 + 5, true);
            }
        }
        if(anInt833 == 3) {
            boldText.method382(0xffffff, c / 2, anInt939, "Ghreborn", c1 / 2 - 60, true);
            int k = c1 / 2 - 35;
            boldText.method382(0xffffff, c / 2, anInt939, "GodzHell.net", k, true);
            k += 15;
            boldText.method382(0xffffff, c / 2, anInt939, "Enjoy!", k, true);
            k += 15;
            boldText.method382(0xffffff, c / 2, anInt939, "Created by Traxxas!", k, true);
            k += 15;
            boldText.method382(0xffffff, c / 2, anInt939, " ", k, true);
            k += 15;
            boldText.method382(0xfffffF, c / 2, anInt939, "", k, true);
            k += 15;

            boldText.method382(0x0099FF, c / 2, anInt939, "", k, true);
            k += 15;
            int j1 = c / 2;
            int i2 = c1 / 2 + 50;
            aBackground_967.method361(j1 - 73, i2 - 20);
            boldText.method382(0x33CCFF, j1, anInt939, "@whi@Back", i2 + 5, true);
        }
        aRSImageProducer_1109.method238(171, 23680, super.aGraphics12, 202);
        if(aBoolean1255) {
            aBoolean1255 = false;
            aRSImageProducer_1107.method238(0, 23680, super.aGraphics12, 128);
            aRSImageProducer_1108.method238(371, 23680, super.aGraphics12, 202);
            aRSImageProducer_1112.method238(265, 23680, super.aGraphics12, 0);
            aRSImageProducer_1113.method238(265, 23680, super.aGraphics12, 562);
            aRSImageProducer_1114.method238(171, 23680, super.aGraphics12, 128);
            aRSImageProducer_1115.method238(171, 23680, super.aGraphics12, 562);
        }
    }

    public final void method136(byte byte0) {
        aBoolean962 = true;
        if(byte0 != 59)
            anInt1058 = -186;
        try
        {
            long l = System.currentTimeMillis();
            int i = 0;
            int j = 20;
            while(aBoolean831)
            {
                anInt1208++;
                //               method58(25106);
//                method58(25106);
                method133((byte)9);
                if(++i > 10)
                {
                    long l1 = System.currentTimeMillis();
                    int k = (int)(l1 - l) / 10 - j;
                    j = 40 - k;
                    if(j < 5)
                        j = 5;
                    i = 0;
                    l = l1;
                }
                try
                {
                    Thread.sleep(j);
                }
                catch(Exception _ex) { }
            }
        }
        catch(Exception _ex) { }
        aBoolean962 = false;
    }

    public final void method10(byte byte0)
    {
        aBoolean1255 = true;
        if(byte0 == 1)
        {
            byte0 = 0;
            return;
        } else
        {
            anInt1218 = aISAACRandomGen_1000.getNextKey();
            return;
        }
    }

    public final void method137(int i, Stream stream, int j)
    {
        while(i >= 0)
            j = -1;
        if(j == 84)
        {
            int k = stream.readUnsignedByte();
            int j3 = anInt1268 + (k >> 4 & 7);
            int i6 = anInt1269 + (k & 7);
            int l8 = stream.readUnsignedShort();
            int k11 = stream.readUnsignedShort();
            int l13 = stream.readUnsignedShort();
            if(j3 >= 0 && i6 >= 0 && j3 < 104 && i6 < 104)
            {
                Class19 class19_1 = aClass19ArrayArrayArray827[anInt918][j3][i6];
                if(class19_1 != null)
                {
                    for(Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2_3 = (Class30_Sub2_Sub4_Sub2)class19_1.reverseGetFirst(); class30_sub2_sub4_sub2_3 != null; class30_sub2_sub4_sub2_3 = (Class30_Sub2_Sub4_Sub2)class19_1.reverseGetNext(false))
                    {
                        if(class30_sub2_sub4_sub2_3.anInt1558 != (l8 & 0x7fff) || class30_sub2_sub4_sub2_3.anInt1559 != k11)
                            continue;
                        class30_sub2_sub4_sub2_3.anInt1559 = l13;
                        break;
                    }

                    method25(j3, i6);
                }
            }
            return;
        }
        if(j == 105)
        {
            int l = stream.readUnsignedByte();
            int k3 = anInt1268 + (l >> 4 & 7);
            int j6 = anInt1269 + (l & 7);
            int i9 = stream.readUnsignedShort();
            int l11 = stream.readUnsignedByte();
            int i14 = l11 >> 4 & 0xf;
            int i16 = l11 & 7;
            if(localPlayer.anIntArray1500[0] >= k3 - i14 && localPlayer.anIntArray1500[0] <= k3 + i14 && localPlayer.anIntArray1501[0] >= j6 - i14 && localPlayer.anIntArray1501[0] <= j6 + i14 && aBoolean848 && !lowMemory && currentSound < 50)
            {
                sound[currentSound] = i9;
                soundType[currentSound] = i16;
                soundDelay[currentSound] = Sound.anIntArray326[i9];
                currentSound++;
            }
        }
        if(j == 215)
        {
            int i1 = stream.method435(true);
            int l3 = stream.readByteA(2);
            int k6 = anInt1268 + (l3 >> 4 & 7);
            int j9 = anInt1269 + (l3 & 7);
            int i12 = stream.method435(true);
            int j14 = stream.readUnsignedShort();
            if(k6 >= 0 && j9 >= 0 && k6 < 104 && j9 < 104 && i12 != anInt884)
            {
                Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2_2 = new Class30_Sub2_Sub4_Sub2();
                class30_sub2_sub4_sub2_2.anInt1558 = i1;
                class30_sub2_sub4_sub2_2.anInt1559 = j14;
                if(aClass19ArrayArrayArray827[anInt918][k6][j9] == null)
                    aClass19ArrayArrayArray827[anInt918][k6][j9] = new Class19(169);
                aClass19ArrayArrayArray827[anInt918][k6][j9].insertHead(class30_sub2_sub4_sub2_2);
                method25(k6, j9);
            }
            return;
        }
        if(j == 156)
        {
            int j1 = stream.readByteS(0);
            int i4 = anInt1268 + (j1 >> 4 & 7);
            int l6 = anInt1269 + (j1 & 7);
            int k9 = stream.readUnsignedShort();
            if(i4 >= 0 && l6 >= 0 && i4 < 104 && l6 < 104)
            {
                Class19 class19 = aClass19ArrayArrayArray827[anInt918][i4][l6];
                if(class19 != null)
                {
                    for(Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetFirst(); class30_sub2_sub4_sub2 != null; class30_sub2_sub4_sub2 = (Class30_Sub2_Sub4_Sub2)class19.reverseGetNext(false))
                    {
                        if(class30_sub2_sub4_sub2.anInt1558 != (k9 & 0x7fff))
                            continue;
                        class30_sub2_sub4_sub2.unlink();
                        break;
                    }

                    if(class19.reverseGetFirst() == null)
                        aClass19ArrayArrayArray827[anInt918][i4][l6] = null;
                    method25(i4, l6);
                }
            }
            return;
        }
        if(j == 160)
        {
            int k1 = stream.readByteA(2);
            int j4 = anInt1268 + (k1 >> 4 & 7);
            int i7 = anInt1269 + (k1 & 7);
            int l9 = stream.readByteA(2);
            int j12 = l9 >> 2;
            int k14 = l9 & 3;
            int j16 = anIntArray1177[j12];
            int j17 = stream.method435(true);
            if(j4 >= 0 && i7 >= 0 && j4 < 103 && i7 < 103)
            {
                int j18 = anIntArrayArrayArray1214[anInt918][j4][i7];
                int i19 = anIntArrayArrayArray1214[anInt918][j4 + 1][i7];
                int l19 = anIntArrayArrayArray1214[anInt918][j4 + 1][i7 + 1];
                int k20 = anIntArrayArrayArray1214[anInt918][j4][i7 + 1];
                if(j16 == 0)
                {
                    Class10 class10 = aClass25_946.method296(anInt918, j4, i7, false);
                    if(class10 != null)
                    {
                        int k21 = ObjectKey.getObjectId(class10.anInt280);
                        if(j12 == 2)
                        {
                            class10.aClass30_Sub2_Sub4_278 = new Class30_Sub2_Sub4_Sub5(k21, 4 + k14, 2, i19, (byte)7, l19, j18, k20, j17, false);
                            class10.aClass30_Sub2_Sub4_279 = new Class30_Sub2_Sub4_Sub5(k21, k14 + 1 & 3, 2, i19, (byte)7, l19, j18, k20, j17, false);
                        } else
                        {
                            class10.aClass30_Sub2_Sub4_278 = new Class30_Sub2_Sub4_Sub5(k21, k14, j12, i19, (byte)7, l19, j18, k20, j17, false);
                        }
                    }
                }
                if(j16 == 1)
                {
                    Class26 class26 = aClass25_946.method297(j4, 866, i7, anInt918);
                    if(class26 != null)
                        class26.aClass30_Sub2_Sub4_504 = new Class30_Sub2_Sub4_Sub5(ObjectKey.getObjectId(class26.anInt505), 0, 4, i19, (byte)7, l19, j18, k20, j17, false);
                }
                if(j16 == 2)
                {
                    Class28 class28 = aClass25_946.method298(j4, i7, (byte)4, anInt918);
                    if(j12 == 11)
                        j12 = 10;
                    if(class28 != null)
                        class28.aClass30_Sub2_Sub4_521 = new Class30_Sub2_Sub4_Sub5(ObjectKey.getObjectId(class28.anInt529), k14, j12, i19, (byte)7, l19, j18, k20, j17, false);
                }
                if(j16 == 3)
                {
                    Class49 class49 = aClass25_946.method299(i7, j4, anInt918, 0);
                    if(class49 != null)
                        class49.aClass30_Sub2_Sub4_814 = new Class30_Sub2_Sub4_Sub5(ObjectKey.getObjectId(class49.anInt815), k14, 22, i19, (byte)7, l19, j18, k20, j17, false);
                }
            }
            return;
        }
        if(j == 147)
        {
            int l1 = stream.readByteA(2);
            int k4 = anInt1268 + (l1 >> 4 & 7);
            int j7 = anInt1269 + (l1 & 7);
            int i10 = stream.readUnsignedShort();
            byte byte0 = stream.method430(0);
            int l14 = stream.method434((byte)108);
            byte byte1 = stream.method429((byte)-57);
            int k17 = stream.readUnsignedShort();
            int k18 = stream.readByteA(2);
            int j19 = k18 >> 2;
            int i20 = k18 & 3;
            int l20 = anIntArray1177[j19];
            byte byte2 = stream.readSignedByte();
            int l21 = stream.readUnsignedShort();
            byte byte3 = stream.method429((byte)-57);
            Player player;
            if(i10 == anInt884)
                player = localPlayer;
            else
                player = aPlayerArray890[i10];
            if(player != null)
            {
                Class46 class46 = Class46.forID(l21);
                int i22 = anIntArrayArrayArray1214[anInt918][k4][j7];
                int j22 = anIntArrayArrayArray1214[anInt918][k4 + 1][j7];
                int k22 = anIntArrayArrayArray1214[anInt918][k4 + 1][j7 + 1];
                int l22 = anIntArrayArrayArray1214[anInt918][k4][j7 + 1];
                Class30_Sub2_Sub4_Sub6 class30_sub2_sub4_sub6 = class46.method578(j19, i20, i22, j22, k22, l22, -1);
                if(class30_sub2_sub4_sub6 != null)
                {
                    method130(404, k17 + 1, -1, 0, l20, j7, 0, anInt918, k4, l14 + 1);
                    player.anInt1707 = l14 + loopCycle;
                    player.anInt1708 = k17 + loopCycle;
                    player.aClass30_Sub2_Sub4_Sub6_1714 = class30_sub2_sub4_sub6;
                    int i23 = class46.anInt744;
                    int j23 = class46.anInt761;
                    if(i20 == 1 || i20 == 3)
                    {
                        i23 = class46.anInt761;
                        j23 = class46.anInt744;
                    }
                    player.anInt1711 = k4 * 128 + i23 * 64;
                    player.anInt1713 = j7 * 128 + j23 * 64;
                    player.anInt1712 = method42(anInt918, player.anInt1713, true, player.anInt1711);
                    if(byte2 > byte0)
                    {
                        byte byte4 = byte2;
                        byte2 = byte0;
                        byte0 = byte4;
                    }
                    if(byte3 > byte1)
                    {
                        byte byte5 = byte3;
                        byte3 = byte1;
                        byte1 = byte5;
                    }
                    player.anInt1719 = k4 + byte2;
                    player.anInt1721 = k4 + byte0;
                    player.anInt1720 = j7 + byte3;
                    player.anInt1722 = j7 + byte1;
                }
            }
        }
        if(j == 151)
        {
            int i2 = stream.readByteS(0);
            int l4 = anInt1268 + (i2 >> 4 & 7);
            int k7 = anInt1269 + (i2 & 7);
            int j10 = stream.method434((byte)108);
            int k12 = stream.readByteA(2);
            int i15 = k12 >> 2;
            int k16 = k12 & 3;
            int l17 = anIntArray1177[i15];
            if(l4 >= 0 && k7 >= 0 && l4 < 104 && k7 < 104)
                method130(404, -1, j10, k16, l17, k7, i15, anInt918, l4, 0);
            return;
        }
        if(j == 4)
        {
            int j2 = stream.readUnsignedByte();
            int i5 = anInt1268 + (j2 >> 4 & 7);
            int l7 = anInt1269 + (j2 & 7);
            int k10 = stream.readUnsignedShort();
            int l12 = stream.readUnsignedByte();
            int j15 = stream.readUnsignedShort();
            if(i5 >= 0 && l7 >= 0 && i5 < 104 && l7 < 104)
            {
                i5 = i5 * 128 + 64;
                l7 = l7 * 128 + 64;
                Class30_Sub2_Sub4_Sub3 class30_sub2_sub4_sub3 = new Class30_Sub2_Sub4_Sub3(anInt918, loopCycle, 6, j15, k10, method42(anInt918, l7, true, i5) - l12, l7, i5);
                aClass19_1056.insertHead(class30_sub2_sub4_sub3);
            }
            return;
        }
        if(j == 44)
        {
            int k2 = stream.method436((byte)-74);
            int j5 = stream.readUnsignedShort();
            int i8 = stream.readUnsignedByte();
            int l10 = anInt1268 + (i8 >> 4 & 7);
            int i13 = anInt1269 + (i8 & 7);
            if(l10 >= 0 && i13 >= 0 && l10 < 104 && i13 < 104)
            {
                Class30_Sub2_Sub4_Sub2 class30_sub2_sub4_sub2_1 = new Class30_Sub2_Sub4_Sub2();
                class30_sub2_sub4_sub2_1.anInt1558 = k2;
                class30_sub2_sub4_sub2_1.anInt1559 = j5;
                if(aClass19ArrayArrayArray827[anInt918][l10][i13] == null)
                    aClass19ArrayArrayArray827[anInt918][l10][i13] = new Class19(169);
                aClass19ArrayArrayArray827[anInt918][l10][i13].insertHead(class30_sub2_sub4_sub2_1);
                method25(l10, i13);
            }
            return;
        }
        if(j == 101)
        {
            int l2 = stream.readByteC(false);
            int k5 = l2 >> 2;
            int j8 = l2 & 3;
            int i11 = anIntArray1177[k5];
            int j13 = stream.readUnsignedByte();
            int k15 = anInt1268 + (j13 >> 4 & 7);
            int l16 = anInt1269 + (j13 & 7);
            if(k15 >= 0 && l16 >= 0 && k15 < 104 && l16 < 104)
                method130(404, -1, -1, j8, i11, l16, k5, anInt918, k15, 0);
            return;
        }
        if(j == 117)
        {
            int i3 = stream.readUnsignedByte();
            int l5 = anInt1268 + (i3 >> 4 & 7);
            int k8 = anInt1269 + (i3 & 7);
            int j11 = l5 + stream.readSignedByte();
            int k13 = k8 + stream.readSignedByte();
            int l15 = stream.method411();
            int i17 = stream.readUnsignedShort();
            int i18 = stream.readUnsignedByte() * 4;
            int l18 = stream.readUnsignedByte() * 4;
            int k19 = stream.readUnsignedShort();
            int j20 = stream.readUnsignedShort();
            int i21 = stream.readUnsignedByte();
            int j21 = stream.readUnsignedByte();
            if(l5 >= 0 && k8 >= 0 && l5 < 104 && k8 < 104 && j11 >= 0 && k13 >= 0 && j11 < 104 && k13 < 104 && i17 != 65535)
            {
                l5 = l5 * 128 + 64;
                k8 = k8 * 128 + 64;
                j11 = j11 * 128 + 64;
                k13 = k13 * 128 + 64;
                Class30_Sub2_Sub4_Sub4 class30_sub2_sub4_sub4 = new Class30_Sub2_Sub4_Sub4(i21, l18, 46883, k19 + loopCycle, j20 + loopCycle, j21, anInt918, method42(anInt918, k8, true, l5) - i18, k8, l5, l15, i17);
                class30_sub2_sub4_sub4.method455(k19 + loopCycle, k13, method42(anInt918, k13, true, j11) - l18, j11, (byte)-83);
                aClass19_1013.insertHead(class30_sub2_sub4_sub4);
            }
        }
    }

    public static final void method138(byte byte0) {
        Class25.aBoolean436 = true;
        if(byte0 != aByte823)
        {
            for(int i = 1; i > 0; i++);
        }
        Rasterizer.aBoolean1461 = true;
        lowMemory = true;
        ObjectManager.aBoolean151 = true;
        Class46.aBoolean752 = true;
    }

    private final void method139(Stream stream, int i, int j)//find
    {
        if(i >= 0)
            anInt1118 = -7;
        try {
        stream.method418(anInt1118);
        int k = stream.readBits(8);
        //System.out.println("NPC: " + k);
        if(k < npcCount)
        {
            for(int l = k; l < npcCount; l++)
                anIntArray840[anInt839++] = npcIndices[l];

        }
        if(k > npcCount)
        {
            signlink.reporterror(myUsername + " Too many npcs");
            throw new RuntimeException("eek");
        }
        npcCount = 0;
        for(int i1 = 0; i1 < k; i1++)
        {
            int j1 = npcIndices[i1];
            Npc npc = npcs[j1];
            int k1 = stream.readBits(1);
            if(k1 == 0)
            {
                npcIndices[npcCount++] = j1;
                npc.anInt1537 = loopCycle;
            } else
            {
                int l1 = stream.readBits(2);
                if(l1 == 0)
                {
                    npcIndices[npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    anIntArray894[anInt893++] = j1;
                } else
                if(l1 == 1)
                {
                    npcIndices[npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    int i2 = stream.readBits(3);
                    npc.method448(false, (byte)20, i2);
                    int k2 = stream.readBits(1);
                    if(k2 == 1)
                        anIntArray894[anInt893++] = j1;
                } else
                if(l1 == 2) {
                    npcIndices[npcCount++] = j1;
                    npc.anInt1537 = loopCycle;
                    int j2 = stream.readBits(3);
                    npc.method448(true, (byte)20, j2);
                    int l2 = stream.readBits(3);
                    npc.method448(true, (byte)20, l2);
                    int i3 = stream.readBits(1);
                    if(i3 == 1)
                        anIntArray894[anInt893++] = j1;
                } else
                if(l1 == 3)
                    anIntArray840[anInt839++] = j1;
            }
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public final void method140(boolean flag)
    {
        if(!flag)
            aClass19ArrayArrayArray827 = null;
        if(anInt833 == 0)
        {
            int i = super.myWidth / 2 - 80;
            int l = super.myHeight / 2 + 20;
            l += 20;
            i = super.myWidth / 2 + 80;
            if(super.clickMode3 == 1 && super.saveClickX >= i - 75 && super.saveClickX <= i + 75 && super.saveClickY >= l - 20 && super.saveClickY <= l + 20)
            {
                aString1266 = "@whi@Enter your username and password.";
                aString1267 = "";
                anInt833 = 2;
                anInt1216 = 0;
                return;
            }
        } else {
            if(anInt833 == 2)
            {
                int j = super.myHeight / 2 - 40;
                j += 30;
                j += 25;
                if(super.clickMode3 == 1 && super.saveClickY >= j - 15 && super.saveClickY < j)
                    anInt1216 = 0;
                j += 15;
                if(super.clickMode3 == 1 && super.saveClickY >= j - 15 && super.saveClickY < j)
                    anInt1216 = 1;
                j += 15;
                int i1 = super.myWidth / 2 - 80;
                int k1 = super.myHeight / 2 + 50;
                k1 += 20;
                if(super.clickMode3 == 1 && super.saveClickX >= i1 - 75 && super.saveClickX <= i1 + 75 && super.saveClickY >= k1 - 20 && super.saveClickY <= k1 + 20)
                {
                    anInt1038 = 0;
                    method84(myUsername, myPassword, false);
                    if(aBoolean1157)
                        return;
                }
                i1 = super.myWidth / 2 + 80;
                if(super.clickMode3 == 1 && super.saveClickX >= i1 - 75 && super.saveClickX <= i1 + 75 && super.saveClickY >= k1 - 20 && super.saveClickY <= k1 + 20)
                {
                    anInt833 = 0;
                }
                do
                {
                    int l1 = method5(-796);
                    if(l1 == -1)
                        break;
                    boolean flag1 = false;
                    for(int i2 = 0; i2 < aString1162.length(); i2++)
                    {
                        if(l1 != aString1162.charAt(i2))
                            continue;
                        flag1 = true;
                        break;
                    }

                    if(anInt1216 == 0)
                    {
                        if(l1 == 8 && myUsername.length() > 0)
                            myUsername = myUsername.substring(0, myUsername.length() - 1);
                        if(l1 == 9 || l1 == 10 || l1 == 13)
                            anInt1216 = 1;
                        if(flag1)
                            myUsername += (char)l1;
                        if(myUsername.length() > 12)
                            myUsername = myUsername.substring(0, 12);
                    } else
                    if(anInt1216 == 1)
                    {
                        if(l1 == 8 && myPassword.length() > 0)
                            myPassword = myPassword.substring(0, myPassword.length() - 1);
                        if(l1 == 9 || l1 == 10 || l1 == 13)
                            anInt1216 = 0;
                        if(flag1)
                            myPassword += (char)l1;
                        if(myPassword.length() > 20)
                            myPassword = myPassword.substring(0, 20);
                    } 
                } while(true);
                return;
            }
            if(anInt833 == 3)
            {
                int k = super.myWidth / 2;
                int j1 = super.myHeight / 2 + 50;
                j1 += 20;
                if(super.clickMode3 == 1 && super.saveClickX >= k - 75 && super.saveClickX <= k + 75 && super.saveClickY >= j1 - 20 && super.saveClickY <= j1 + 20)
                    anInt833 = 0;
            }
        }
    }

    public final void method141(Sprite sprite, int i, int j, boolean flag)
    {
        if (sprite != null) {
            int k = anInt1185 + anInt1209 & 0x7ff;
            int l = i * i + j * j;
            if (flag)
                return;
            if (l <= 6400) {
                int i1 = Class30_Sub2_Sub4_Sub6.anIntArray1689[k];
                int j1 = Class30_Sub2_Sub4_Sub6.anIntArray1690[k];
                i1 = (i1 * 256) / (anInt1170 + 256);
                j1 = (j1 * 256) / (anInt1170 + 256);
                int k1 = j * i1 + i * j1 >> 16;
                int l1 = j * j1 - i * i1 >> 16;
                if (currentScreenMode == ScreenMode.FIXED) {
                    sprite.drawSprite(((97 + k1) - sprite.anInt1444 / 2)  + 30, 83 - l1 - sprite.anInt1445 / 2 - 4 + 5);
                } else {
                    sprite.drawSprite(((77 + k1) - sprite.anInt1444 / 2) + 4 + (currentGameWidth - 167), 85 - l1 - sprite.anInt1445 / 2 - 4);
                }
            }
        }
    }

    private final void method142(int i, int j, int k, int l, int i1, int j1, int k1,
                                 int l1)
    {
        if(l1 < 4 || l1 > 4)
            packet = in.readUnsignedByte();
        if(i1 >= 1 && i >= 1 && i1 <= 102 && i <= 102)
        {
            if(lowMemory && j != anInt918)
                return;
            long i2 = 0;
            byte byte0 = -1;
            boolean flag = false;
            boolean flag1 = false;
            if(j1 == 0)
                i2 = aClass25_946.method300(j, i1, i);
            if(j1 == 1)
                i2 = aClass25_946.method301(j, i1, 0, i);
            if(j1 == 2)
                i2 = aClass25_946.method302(j, i1, i);
            if(j1 == 3)
                i2 = aClass25_946.method303(j, i1, i);
            if(i2 != 0)
            {
                int i3 = aClass25_946.method304(j, i1, i, i2);
                int j2 = ObjectKey.getObjectId(i2);
                int k2 = i3 & 0x1f;
                int l2 = i3 >> 6;
                if(j1 == 0)
                {
                    aClass25_946.method291(i1, j, i, (byte)-119);
                    Class46 class46 = Class46.forID(j2);
                    if(class46.aBoolean767)
                        collisionMaps[j].method215(l2, k2, class46.aBoolean757, true, i1, i);
                }
                if(j1 == 1)
                    aClass25_946.method292(0, i, j, i1);
                if(j1 == 2)
                {
                    aClass25_946.method293(j, -978, i1, i);
                    Class46 class46_1 = Class46.forID(j2);
                    if(i1 + class46_1.anInt744 > 103 || i + class46_1.anInt744 > 103 || i1 + class46_1.anInt761 > 103 || i + class46_1.anInt761 > 103)
                        return;
                    if(class46_1.aBoolean767)
                        collisionMaps[j].method216(l2, class46_1.anInt744, i1, i, (byte)6, class46_1.anInt761, class46_1.aBoolean757);
                }
                if(j1 == 3)
                {
                    aClass25_946.method294((byte)9, j, i, i1);
                    Class46 class46_2 = Class46.forID(j2);
                    if(class46_2.aBoolean767 && class46_2.hasactions)
                        collisionMaps[j].method218(360, i, i1);
                }
            }
            if(k1 >= 0)
            {
                int j3 = j;
                if(j3 < 3 && (aByteArrayArrayArray1258[1][i1][i] & 2) == 2)
                    j3++;
                ObjectManager.method188(aClass25_946, k, i, l, j3, collisionMaps[j], anIntArrayArrayArray1214, i1, k1, j, (byte)93);
            }
        }
    }

    private final void method143(int i, Stream stream, int j)
    {
        anInt839 = 0;
        if(j != 9759)
            packet = stream.readUnsignedShort();
        anInt893 = 0;
        method117(stream, i, (byte)5);
        method134((byte)2, i, stream);
        method91(stream, i, (byte)8);
        method49(i, (byte)2, stream);
        for(int k = 0; k < anInt839; k++)
        {
            int l = anIntArray840[k];
            if(((Class30_Sub2_Sub4_Sub1) (aPlayerArray890[l])).anInt1537 != loopCycle)
                aPlayerArray890[l] = null;
        }

        for(int i1 = 0; i1 < anInt891; i1++)
            if(aPlayerArray890[anIntArray892[i1]] == null)
            {
                signlink.reporterror(myUsername + " null entry in pl list - pos:" + i1 + " size:" + anInt891);
                throw new RuntimeException("eek");
            }

    }

    public final void method144(int i, int j, int k, int l, int i1, int j1, int k1)
    {
        int l1 = 2048 - k & 0x7ff;
        int i2 = 2048 - j1 & 0x7ff;
        int j2 = 0;
        int k2 = 0;
        int l2 = j;
        if(i != 0)
            method6();
        if(l1 != 0)
        {
            int i3 = Class30_Sub2_Sub4_Sub6.anIntArray1689[l1];
            int k3 = Class30_Sub2_Sub4_Sub6.anIntArray1690[l1];
            int i4 = k2 * k3 - l2 * i3 >> 16;
            l2 = k2 * i3 + l2 * k3 >> 16;
            k2 = i4;
        }
        if(i2 != 0)
        {
            if(cameratoggle == 1){
                if(zoom == 0)
                    zoom = k2;
                if(lftrit == 0)
                    lftrit = j2;
                if(fwdbwd == 0)
                    fwdbwd = l2;
                k2 = zoom;
                j2 = lftrit;
                l2 = fwdbwd;
            }
            int j3 = Class30_Sub2_Sub4_Sub6.anIntArray1689[i2];
            int l3 = Class30_Sub2_Sub4_Sub6.anIntArray1690[i2];
            int j4 = l2 * j3 + j2 * l3 >> 16;
            l2 = l2 * l3 - j2 * j3 >> 16;
            j2 = j4;
        }
        xCameraPos = l - j2;
        zCameraPos = i1 - k2;
        yCameraPos = k1 - l2;
        yCameraCurve = k;
        xCameraCurve = j1;
    }

    public final boolean method145(boolean flag)
    {
        if(!flag)
            aClass19ArrayArrayArray827 = null;
        if(socketStream == null)
            return false;
        try
        {
            int i = socketStream.method269();
            if(i == 0)
                return false;
            if(packet == -1)
            {
                socketStream.flushInputStream(in.buffer, 0, 1);
                packet = in.buffer[0] & 0xff;
                if(aISAACRandomGen_1000 != null)
                    packet = packet - aISAACRandomGen_1000.getNextKey() & 0xff;
                anInt1007 = Class31.packetSizes[packet];
                i--;
            }
            if(anInt1007 == -1)
                if(i > 0)
                {
                    socketStream.flushInputStream(in.buffer, 0, 1);
                    anInt1007 = in.buffer[0] & 0xff;
                    i--;
                } else
                {
                    return false;
                }
            if(anInt1007 == -2)
                if(i > 1)
                {
                    socketStream.flushInputStream(in.buffer, 0, 2);
                    in.currentPosition = 0;
                    anInt1007 = in.readUnsignedShort();
                    i -= 2;
                } else
                {
                    return false;
                }
            if(i < anInt1007)
                return false;
            in.currentPosition = 0;
            socketStream.flushInputStream(in.buffer, 0, anInt1007);
            anInt1009 = 0;
            anInt843 = anInt842;
            anInt842 = anInt841;
            anInt841 = packet;
            if(packet == 81)
            {
                method143(anInt1007, in, 9759);
                aBoolean1080 = false;
                packet = -1;
                return true;
            }
            if(packet == -1)
            {
            }
            else
            {
                if(showframeids == 1)
                {
                    System.out.println("Frameid:" + packet);
                }
               // System.out.println("Byte:" + Class9.aClass9Array210);
            }
            if(packet == 176)
            {
                anInt1167 = in.readByteC(false);
                anInt1154 = in.method435(true);
                anInt1120 = in.readUnsignedByte();
                anInt1193 = in.method440(true);
                anInt1006 = in.readUnsignedShort();
                if(anInt1193 != 0 && openInterfaceID == -1)
                {
                    signlink.dnslookup(TextClass.method586(anInt1193, true));
                    clearTopInterfaces(537);
                    char c = '\u028A';
                    if(anInt1167 != 201 || anInt1120 == 1)
                        c = '\u028F';
                    reportAbuseInput = "";
                    canMute = false;
                    for(int k9 = 0; k9 < Widget.interfaceCache.length; k9++)
                    {
                        if(Widget.interfaceCache[k9] == null || Widget.interfaceCache[k9].contentType != c)
                            continue;
                        openInterfaceID = Widget.interfaceCache[k9].parentID;
                        break;
                    }

                }
                packet = -1;
                return true;
            }
            if(packet == 64)
            {
                anInt1268 = in.readByteC(false);
                anInt1269 = in.readByteA(2);
                for(int j = anInt1268; j < anInt1268 + 8; j++)
                {
                    for(int l9 = anInt1269; l9 < anInt1269 + 8; l9++)
                        if(aClass19ArrayArrayArray827[anInt918][j][l9] != null)
                        {
                            aClass19ArrayArrayArray827[anInt918][j][l9] = null;
                            method25(j, l9);
                        }

                }

                for(Class30_Sub1 class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetFirst(); class30_sub1 != null; class30_sub1 = (Class30_Sub1)aClass19_1179.reverseGetNext(false))
                    if(class30_sub1.anInt1297 >= anInt1268 && class30_sub1.anInt1297 < anInt1268 + 8 && class30_sub1.anInt1298 >= anInt1269 && class30_sub1.anInt1298 < anInt1269 + 8 && class30_sub1.anInt1295 == anInt918)
                        class30_sub1.anInt1294 = 0;

                packet = -1;
                return true;
            }
            if (this.packet == 217) {
                try {
                    clanUsername = in.readString();
                    clanMessage = TextInput.processText(in.readString(), 0);
                    clanTitle = in.readString();
                    channelRights = in.readUnsignedShort();
                    pushMessage(clanMessage, 12, clanUsername);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }

                this.packet = -1;
                return true;
            }
            if(packet == 185)
            {
                int k = in.method436((byte)-74);
                Widget.interfaceCache[k].anInt233 = 3;
                if(localPlayer.aClass5_1698 == null)
                    Widget.interfaceCache[k].anInt234 = (localPlayer.anIntArray1700[0] << 25) + (localPlayer.anIntArray1700[4] << 20) + (localPlayer.anIntArray1717[0] << 15) + (localPlayer.anIntArray1717[8] << 10) + (localPlayer.anIntArray1717[11] << 5) + localPlayer.anIntArray1717[1];
                else
                    Widget.interfaceCache[k].anInt234 = (int)(0x12345678L + localPlayer.aClass5_1698.aLong78);
                packet = -1;
                return true;
            }
            if(packet == 107)
            {
                aBoolean1160 = false;
                for(int l = 0; l < 5; l++)
                    aBooleanArray876[l] = false;

                packet = -1;
                return true;
            }
            if(packet == 72)
            {
                int i1 = in.method434((byte)108);
                Widget class9 = Widget.interfaceCache[i1];
                for(int k15 = 0; k15 < class9.inv.length; k15++)
                {
                    class9.inv[k15] = -1;
                    class9.inv[k15] = 0;
                }

                packet = -1;
                return true;
            }
            if(packet == 214)
            {
                anInt822 = anInt1007 / 8;
                for(int j1 = 0; j1 < anInt822; j1++)
                    aLongArray925[j1] = in.readQWord(-35089);

                packet = -1;
                return true;
            }
            if(packet == 166)
            {
                aBoolean1160 = true;
                anInt1098 = in.readUnsignedByte();
                anInt1099 = in.readUnsignedByte();
                anInt1100 = in.readUnsignedShort();
                anInt1101 = in.readUnsignedByte();
                anInt1102 = in.readUnsignedByte();
                if(anInt1102 >= 100)
                {
                    xCameraPos = anInt1098 * 128 + 64;
                    yCameraPos = anInt1099 * 128 + 64;
                    zCameraPos = method42(anInt918, yCameraPos, true, xCameraPos) - anInt1100;
                }
                packet = -1;
                return true;
            }
            if(packet == 134)
            {
                tabAreaAltered = true;
                int k1 = in.readUnsignedByte();
                int i10 = in.method439((byte)41);
                int l15 = in.readUnsignedByte();
                anIntArray864[k1] = i10;
                anIntArray922[k1] = l15;
                anIntArray1044[k1] = 1;
                for(int k20 = 0; k20 < 98; k20++)
                    if(i10 >= anIntArray1019[k20])
                        anIntArray1044[k1] = k20 + 2;

                packet = -1;
                return true;
            }
            if(packet == 71)
            {
                int l1 = in.readUnsignedShort();
                int j10 = in.readByteS(0);
                if(l1 == 65535)
                    l1 = -1;
                tabInterfaceIDs[j10] = l1;
                tabAreaAltered = true;
                aBoolean1103 = true;
                packet = -1;
                return true;
            }
            if(packet == 74)
            {
                int i2 = in.method434((byte)108);
                if(i2 == 65535)
                    i2 = -1;
                if(i2 != currentSong && musicEnabled && previousSong == 0)
                {
                    nextSong = i2;
                    songChanging = true;
                    onDemandFetcher.method558(2, nextSong);
                }
                currentSong = i2;
                packet = -1;
                return true;
            }
            if(packet == 121)
            {
                int j2 = in.method436((byte)-74);
                int k10 = in.method435(true);
                if(musicEnabled && !lowMemory)
                {
                    nextSong = j2;
                    songChanging = false;
                    onDemandFetcher.method558(2, nextSong);
                    previousSong = k10;
                }
                packet = -1;
                return true;
            }
            if(packet == 109)
            {
                method44(true);
                packet = -1;
                return false;
            }
            if(packet == 70)
            {
                int k2 = in.method411();
                int l10 = in.method437(-665);
                int i16 = in.method434((byte)108);
                Widget class9_5 = Widget.interfaceCache[i16];
                class9_5.anInt263 = k2;
                class9_5.anInt265 = l10;
                packet = -1;
                return true;
            }
            if(packet == 73 || packet == 241)
            {
                int l2 = currentRegionX;
                int i11 = currentRegionY;
                if(packet == 73)
                {
                    l2 = mapX = MapX = in.method435(true);
                    i11 = mapY = MapY = in.readUnsignedShort();

                    aBoolean1159 = false;
                }
                if(packet == 241)
                {
                    i11 = in.method435(true);
                    in.method418(anInt1118);
                    for(int j16 = 0; j16 < 4; j16++)
                    {
                        for(int l20 = 0; l20 < 13; l20++)
                        {
                            for(int j23 = 0; j23 < 13; j23++)
                            {
                                int i26 = in.readBits(1);
                                if(i26 == 1)
                                    anIntArrayArrayArray1129[j16][l20][j23] = in.readBits(26);
                                else
                                    anIntArrayArrayArray1129[j16][l20][j23] = -1;
                            }

                        }

                    }

                    in.method420(true);
                    l2 = in.readUnsignedShort();
                    aBoolean1159 = true;
                }
                if(currentRegionX == l2 && currentRegionY == i11 && anInt1023 == 2)
                {
                    packet = -1;
                    return true;
                }
                currentRegionX = l2;
                currentRegionY = i11;
                baseX = (currentRegionX - 6) * 8;
                baseY = (currentRegionY - 6) * 8;
                aBoolean1141 = false;
                if((currentRegionX / 8 == 48 || currentRegionX / 8 == 49) && currentRegionY / 8 == 48)
                    aBoolean1141 = true;
                if(currentRegionX / 8 == 48 && currentRegionY / 8 == 148)
                    aBoolean1141 = true;
                anInt1023 = 1;
                aLong824 = System.currentTimeMillis();
                aRSImageProducer_1165.initDrawingArea();
                DrawingArea.fillPixels(2, 210, 22, 0xffffff, 2, true);
                DrawingArea.drawPixels(20, 3, 3, 0, 208);
                regularText.method381(0, "Ghreborn is Loading - Please wait....", 23693, 18, 108);
                regularText.method381(0xffffff, "Ghreborn is Loading - Please wait....", 23693, 17, 107);
                aRSImageProducer_1165.method238(currentScreenMode == ScreenMode.FIXED ? 0 : 0, 23680, super.aGraphics12, currentScreenMode == ScreenMode.FIXED ? 0 : 0);
                if(packet == 73)
                {
                    int k16 = 0;
                    for(int i21 = (currentRegionX - 6) / 8; i21 <= (currentRegionX + 6) / 8; i21++)
                    {
                        for(int k23 = (currentRegionY - 6) / 8; k23 <= (currentRegionY + 6) / 8; k23++)
                            k16++;

                    }

                    terrainData = new byte[k16][];
                    mapData = new byte[k16][];
                    mapCoordinates = new int[k16];
                    terrainIndices = new int[k16];
                    objectIndices = new int[k16];
                    k16 = 0;
                    for(int l23 = (currentRegionX - 6) / 8; l23 <= (currentRegionX + 6) / 8; l23++)
                    {
                        for(int j26 = (currentRegionY - 6) / 8; j26 <= (currentRegionY + 6) / 8; j26++)
                        {
                            mapCoordinates[k16] = (l23 << 8) + j26;
                            if(aBoolean1141 && (j26 == 49 || j26 == 149 || j26 == 147 || l23 == 50 || l23 == 49 && j26 == 47))
                            {
                                terrainIndices[k16] = -1;
                                objectIndices[k16] = -1;
                                k16++;
                            } else
                            {
                                int k28 = terrainIndices[k16] = onDemandFetcher.method562(0, 0, j26, l23);
                                if(k28 != -1)
                                    onDemandFetcher.method558(3, k28);
                                int j30 = objectIndices[k16] = onDemandFetcher.method562(1, 0, j26, l23);
                                if(j30 != -1)
                                    onDemandFetcher.method558(3, j30);
                                k16++;
                            }
                        }

                    }

                }
                if(packet == 241)
                {
                    int l16 = 0;
                    int ai[] = new int[676];
                    for(int i24 = 0; i24 < 4; i24++)
                    {
                        for(int k26 = 0; k26 < 13; k26++)
                        {
                            for(int l28 = 0; l28 < 13; l28++)
                            {
                                int k30 = anIntArrayArrayArray1129[i24][k26][l28];
                                if(k30 != -1)
                                {
                                    int k31 = k30 >> 14 & 0x3ff;
                                    int i32 = k30 >> 3 & 0x7ff;
                                    int k32 = (k31 / 8 << 8) + i32 / 8;
                                    for(int j33 = 0; j33 < l16; j33++)
                                    {
                                        if(ai[j33] != k32)
                                            continue;
                                        k32 = -1;
                                        break;
                                    }

                                    if(k32 != -1)
                                        ai[l16++] = k32;
                                }
                            }

                        }

                    }

                    terrainData = new byte[l16][];
                    mapData = new byte[l16][];
                    mapCoordinates = new int[l16];
                    terrainIndices = new int[l16];
                    objectIndices = new int[l16];
                    for(int l26 = 0; l26 < l16; l26++)
                    {
                        int i29 = mapCoordinates[l26] = ai[l26];
                        int l30 = i29 >> 8 & 0xff;
                        int l31 = i29 & 0xff;
                        int j32 = terrainIndices[l26] = onDemandFetcher.method562(0, 0, l31, l30);
                        if(j32 != -1)
                            onDemandFetcher.method558(3, j32);
                        int i33 = objectIndices[l26] = onDemandFetcher.method562(1, 0, l31, l30);
                        if(i33 != -1)
                            onDemandFetcher.method558(3, i33);
                    }

                }
                int i17 = baseX - anInt1036;
                int j21 = baseY - anInt1037;
                anInt1036 = baseX;
                anInt1037 = baseY;
                for(int j24 = 0; j24 < 16384; j24++)
                {
                    Npc npc = npcs[j24];
                    if(npc != null)
                    {
                        for(int j29 = 0; j29 < 10; j29++)
                        {
                            ((Class30_Sub2_Sub4_Sub1) (npc)).anIntArray1500[j29] -= i17;
                            ((Class30_Sub2_Sub4_Sub1) (npc)).anIntArray1501[j29] -= j21;
                        }

                        npc.anInt1550 -= i17 * 128;
                        npc.anInt1551 -= j21 * 128;
                    }
                }

                for(int i27 = 0; i27 < anInt888; i27++)
                {
                    Player player = aPlayerArray890[i27];
                    if(player != null)
                    {
                        for(int i31 = 0; i31 < 10; i31++)
                        {
                            ((Class30_Sub2_Sub4_Sub1) (player)).anIntArray1500[i31] -= i17;
                            ((Class30_Sub2_Sub4_Sub1) (player)).anIntArray1501[i31] -= j21;
                        }

                        player.anInt1550 -= i17 * 128;
                        player.anInt1551 -= j21 * 128;
                    }
                }

                aBoolean1080 = true;
                byte byte1 = 0;
                byte byte2 = 104;
                byte byte3 = 1;
                if(i17 < 0)
                {
                    byte1 = 103;
                    byte2 = -1;
                    byte3 = -1;
                }
                byte byte4 = 0;
                byte byte5 = 104;
                byte byte6 = 1;
                if(j21 < 0)
                {
                    byte4 = 103;
                    byte5 = -1;
                    byte6 = -1;
                }
                for(int k33 = byte1; k33 != byte2; k33 += byte3)
                {
                    for(int l33 = byte4; l33 != byte5; l33 += byte6)
                    {
                        int i34 = k33 + i17;
                        int j34 = l33 + j21;
                        for(int k34 = 0; k34 < 4; k34++)
                            if(i34 >= 0 && j34 >= 0 && i34 < 104 && j34 < 104)
                                aClass19ArrayArrayArray827[k34][k33][l33] = aClass19ArrayArrayArray827[k34][i34][j34];
                            else
                                aClass19ArrayArrayArray827[k34][k33][l33] = null;

                    }

                }

                for(Class30_Sub1 class30_sub1_1 = (Class30_Sub1)aClass19_1179.reverseGetFirst(); class30_sub1_1 != null; class30_sub1_1 = (Class30_Sub1)aClass19_1179.reverseGetNext(false))
                {
                    class30_sub1_1.anInt1297 -= i17;
                    class30_sub1_1.anInt1298 -= j21;
                    if(class30_sub1_1.anInt1297 < 0 || class30_sub1_1.anInt1298 < 0 || class30_sub1_1.anInt1297 >= 104 || class30_sub1_1.anInt1298 >= 104)
                        class30_sub1_1.unlink();
                }

                if(anInt1261 != 0)
                {
                    anInt1261 -= i17;
                    anInt1262 -= j21;
                }
                aBoolean1160 = false;
                packet = -1;
                return true;
            }
            if(packet == 208)
            {
                int i3 = in.method437(-665);
                //System.out.println("i3: " + i3);
                if(i3 >= 0)
                    method60(i3, (byte)6);
                openWalkableInterface = i3;
                packet = -1;
                return true;
            }
            if(packet == 99)
            {
                anInt1021 = in.readUnsignedByte();
                packet = -1;
                return true;
            }
            if(packet == 75)
            {
                int j3 = in.method436((byte)-74);
                int j11 = in.method436((byte)-74);
                Widget.interfaceCache[j11].anInt233 = 2;
                Widget.interfaceCache[j11].anInt234 = j3;
                packet = -1;
                return true;
            }
            if(packet == 114)
            {
                anInt1104 = in.method434((byte)108) * 30;
                broadcastTimer = 0;
                packet = -1;
                return true;
            }
            if(packet == 60)
            {
                anInt1269 = in.readUnsignedByte();
                anInt1268 = in.readByteC(false);
                while(in.currentPosition < anInt1007)
                {
                    int k3 = in.readUnsignedByte();
                    method137(anInt1119, in, k3);
                }
                packet = -1;
                return true;
            }
            if(packet == 35)
            {
                int l3 = in.readUnsignedByte();
                int k11 = in.readUnsignedByte();
                int j17 = in.readUnsignedByte();
                int k21 = in.readUnsignedByte();
                aBooleanArray876[l3] = true;
                anIntArray873[l3] = k11;
                anIntArray1203[l3] = j17;
                anIntArray928[l3] = k21;
                anIntArray1030[l3] = 0;
                packet = -1;
                return true;
            }
            if(packet == 174)
            {
                int i4 = in.readUnsignedShort();
                int l11 = 1;
                int k17 = in.readUnsignedShort();
                int volume = in.readUnsignedByte();
                    sound[currentSound] = i4;
                    soundType[currentSound] = l11;
                    soundDelay[currentSound] = k17 + Sound.anIntArray326[i4];
                    soundVolume[currentSound] = volume;
                    currentSound++;
                packet = -1;
                return true;
            }
            if(packet == 104) //death
            {
                int j4 = in.readByteC(false);
                int i12 = in.readByteS(0);
                String s6 = in.readString();
                if(j4 >= 1 && j4 <= 5)
                {
                    if(s6.equalsIgnoreCase("null"))
                        s6 = null;
                    aStringArray1127[j4 - 1] = s6;
                    aBooleanArray1128[j4 - 1] = i12 == 0;
                }
                packet = -1;
                return true;
            }
            if(packet == 78)
            {
                anInt1261 = 0;
                packet = -1;
                return true;
            }
            if(packet == 253)
            {
                String s = in.readString();
                if(s.endsWith(":test:"))
                {
                    String s3 = s.substring(0, s.indexOf(":"));
                    System.out.println("s3: " + s3);
                } else
                if(s.endsWith(":tradereq:"))
                {
                    String s3 = s.substring(0, s.indexOf(":"));
                    long l17 = TextClass.longForName(s3);
                    boolean flag2 = false;
                    for(int j27 = 0; j27 < anInt822; j27++)
                    {
                        if(aLongArray925[j27] != l17)
                            continue;
                        flag2 = true;
                        break;
                    }

                    if(!flag2 && anInt1251 == 0)
                        pushMessage("wishes to trade with you.", 4, s3);
                } else if (s.endsWith(":clan:")) {
                    String var43 = s.substring(0, s.indexOf(":"));
                    TextClass.longForName(var43);
                    this.pushMessage("Clan: ", 8, var43);
                } else
                if(s.endsWith(":duelreq:"))
                {
                    String s4 = s.substring(0, s.indexOf(":"));
                    long l18 = TextClass.longForName(s4);
                    boolean flag3 = false;
                    for(int k27 = 0; k27 < anInt822; k27++)
                    {
                        if(aLongArray925[k27] != l18)
                            continue;
                        flag3 = true;
                        break;
                    }

                    if(!flag3 && anInt1251 == 0)
                        pushMessage("wishes to duel with you.", 8, s4);
                } else
                if(s.endsWith(":chalreq:"))
                {
                    String s5 = s.substring(0, s.indexOf(":"));
                    long l19 = TextClass.longForName(s5);
                    boolean flag4 = false;
                    for(int l27 = 0; l27 < anInt822; l27++)
                    {
                        if(aLongArray925[l27] != l19)
                            continue;
                        flag4 = true;
                        break;
                    }

                    if(!flag4 && anInt1251 == 0)
                    {
                        String s8 = s.substring(s.indexOf(":") + 1, s.length() - 9);
                        pushMessage(s8, 8, s5);
                    }
                } else
                {
                    pushMessage(s, 0, "");
                }
                packet = -1;
                return true;
            }
            if(packet == 1)
            {
                for(int k4 = 0; k4 < aPlayerArray890.length; k4++)
                    if(aPlayerArray890[k4] != null)
                        aPlayerArray890[k4].anInt1526 = -1;

                for(int j12 = 0; j12 < npcs.length; j12++)
                    if(npcs[j12] != null)
                        npcs[j12].anInt1526 = -1;

                packet = -1;
                return true;
            }
            //FRAMES
            //Private chat" ..has logged in."
            if(packet == 50)
            {
                long l4 = in.readQWord(-35089);
                int i18 = in.readUnsignedByte();
                String s7 = TextClass.fixName(TextClass.nameForLong(l4));
                for(int k24 = 0; k24 < anInt899; k24++)
                {
                    if(l4 != aLongArray955[k24])
                        continue;
                    if(anIntArray826[k24] != i18)
                    {
                        anIntArray826[k24] = i18;
                        tabAreaAltered = true;
                        if(i18 > 1)
                            pushMessage(s7 + " has logged in.", 5, "");
                        if(i18 == 1)
                            pushMessage(s7 + " has logged out.", 5, "");
                    }
                    s7 = null;
                    break;
                }

                if(s7 != null && anInt899 < 200)
                {
                    aLongArray955[anInt899] = l4;
                    aStringArray1082[anInt899] = s7;
                    anIntArray826[anInt899] = i18;
                    anInt899++;
                    tabAreaAltered = true;
                }
                for(boolean flag6 = false; !flag6;)
                {
                    flag6 = true;
                    for(int k29 = 0; k29 < anInt899 - 1; k29++)
                        if(anIntArray826[k29] != anInt957 && anIntArray826[k29 + 1] == anInt957 || anIntArray826[k29] == 0 && anIntArray826[k29 + 1] != 0)
                        {
                            int j31 = anIntArray826[k29];
                            anIntArray826[k29] = anIntArray826[k29 + 1];
                            anIntArray826[k29 + 1] = j31;
                            String s10 = aStringArray1082[k29];
                            aStringArray1082[k29] = aStringArray1082[k29 + 1];
                            aStringArray1082[k29 + 1] = s10;
                            long l32 = aLongArray955[k29];
                            aLongArray955[k29] = aLongArray955[k29 + 1];
                            aLongArray955[k29 + 1] = l32;
                            tabAreaAltered = true;
                            flag6 = false;
                        }

                }

                packet = -1;
                return true;
            }
            if(packet == 110)
            {
                if(tabID == 12)
                    tabAreaAltered = true;
                anInt1148 = in.readUnsignedByte();
                packet = -1;
                return true;
            }
            if(packet == 254)
            {
                anInt855 = in.readUnsignedByte();
                if(anInt855 == 1)
                    anInt1222 = in.readUnsignedShort();
                if(anInt855 >= 2 && anInt855 <= 6)
                {
                    if(anInt855 == 2)
                    {
                        anInt937 = 64;
                        anInt938 = 64;
                    }
                    if(anInt855 == 3)
                    {
                        anInt937 = 0;
                        anInt938 = 64;
                    }
                    if(anInt855 == 4)
                    {
                        anInt937 = 128;
                        anInt938 = 64;
                    }
                    if(anInt855 == 5)
                    {
                        anInt937 = 64;
                        anInt938 = 0;
                    }
                    if(anInt855 == 6)
                    {
                        anInt937 = 64;
                        anInt938 = 128;
                    }
                    anInt855 = 2;
                    anInt934 = in.readUnsignedShort();
                    anInt935 = in.readUnsignedShort();
                    anInt936 = in.readUnsignedByte();
                }
                if(anInt855 == 10)
                    anInt933 = in.readUnsignedShort();
                packet = -1;
                return true;
            }
            if(packet == 248)
            {
                int i5 = in.method435(true);
                int k12 = in.readUnsignedShort();
                if(backDialogID != -1)
                {
                    backDialogID = -1;
                    inputTaken = true;
                }
                if(inputDialogState != 0)
                {
                    inputDialogState = 0;
                    inputTaken = true;
                }
                openInterfaceID = i5;
                invOverlayInterfaceID = k12;
                tabAreaAltered = true;
                aBoolean1103 = true;
                aBoolean1149 = false;
                packet = -1;
                return true;
            }
            if(packet == 79)
            {
                int j5 = in.method434((byte)108);
                int l12 = in.method435(true);
                Widget class9_3 = Widget.interfaceCache[j5];
                if(class9_3 != null && class9_3.type == 0)
                {
                    if(l12 < 0)
                        l12 = 0;
                    if(l12 > class9_3.scrollMax - class9_3.height)
                        l12 = class9_3.scrollMax - class9_3.height;
                    class9_3.scrollPosition = l12;
                }
                packet = -1;
                return true;
            }
            if(packet == 68)
            {
                for(int k5 = 0; k5 < variousSettings.length; k5++)
                    if(variousSettings[k5] != anIntArray1045[k5])
                    {
                        variousSettings[k5] = anIntArray1045[k5];
                        method33(false, k5);
                        tabAreaAltered = true;
                    }

                packet = -1;
                return true;
            }
            if(packet == 196)
            {
                long l5 = in.readQWord(-35089);
                int j18 = in.readDWord();
                int l21 = in.readUnsignedByte();
                boolean flag5 = false;
                for(int i28 = 0; i28 < 100; i28++)
                {
                    if(anIntArray1240[i28] != j18)
                        continue;
                    flag5 = true;
                    break;
                }

                if(l21 <= 1)
                {
                    for(int l29 = 0; l29 < anInt822; l29++)
                    {
                        if(aLongArray925[l29] != l5)
                            continue;
                        flag5 = true;
                        break;
                    }

                }
                if(!flag5 && anInt1251 == 0)
                    try
                    {
                        anIntArray1240[anInt1169] = j18;
                        anInt1169 = (anInt1169 + 1) % 100;
                        String s9 = TextInput.method525(anInt1007 - 13, true, in);
                        if(l21 != 3)
                            s9 = Censor.method497(s9, 0);
                        switch (l21) {
                            case 1:
                                this.pushMessage(s9, 7, "@cr1@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 2:
                                this.pushMessage(s9, 7, "@cr2@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 3:
                                this.pushMessage(s9, 7, "@cr3@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 4:
                                this.pushMessage(s9, 7, "@cr4@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 5:
                                this.pushMessage(s9, 7, "@cr5@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 6:
                                this.pushMessage(s9, 7, "@cr6@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 7:
                                this.pushMessage(s9, 7, "@cr7@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 8:
                                this.pushMessage(s9, 7, "@cr8@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 9:
                                this.pushMessage(s9, 7, "@cr9@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 10:
                                this.pushMessage(s9, 7, "@cr10@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 11:
                                this.pushMessage(s9, 7, "@cr11@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 12:
                                this.pushMessage(s9, 7, "@cr12@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 13:
                                this.pushMessage(s9, 7, "@cr13@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 14:
                                this.pushMessage(s9, 7, "@cr14@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 15:
                                this.pushMessage(s9, 7, "@cr15@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 16:
                                this.pushMessage(s9, 7, "@cr16@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 17:
                                this.pushMessage(s9, 7, "@cr17@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 18:
                                this.pushMessage(s9, 7, "@cr18@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 19:
                                this.pushMessage(s9, 7, "@cr19@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 20:
                                this.pushMessage(s9, 7, "@cr20@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 21:
                                this.pushMessage(s9, 7, "@cr21@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            case 22:
                                this.pushMessage(s9, 7, "@cr22@" + TextClass.fixName(TextClass.nameForLong(l5)));
                                break;
                            /*
                             * case 23: this.pushMessage(var34, 7, "@cr23@" +
                             * TextClass.fixName(TextClass.nameForLong(var30))); break; case 24:
                             * this.pushMessage(var34, 7, "@cr24@" +
                             * TextClass.fixName(TextClass.nameForLong(var30))); break;
                             */
                            default:
                                this.pushMessage(s9, 3, TextClass.fixName(TextClass.nameForLong(l5)));
                        }
                    }
                    catch(Exception exception1)
                    {
                        signlink.reporterror("cde1");
                    }
                packet = -1;
                return true;
            }
            if(packet == 85)
            {
                anInt1269 = in.readByteC(false);
                anInt1268 = in.readByteC(false);
                packet = -1;
                return true;
            }
            if(packet == 24)
            {
                anInt1054 = in.readByteA(2);
                if(anInt1054 == tabID)
                {
                    if(anInt1054 == 3)
                        tabID = 1;
                    else
                        tabID = 3;
                    tabAreaAltered = true;
                }
                packet = -1;
                return true;
            }
            if(packet == 246)
            {
                int i6 = in.method434((byte)108);
                int i13 = in.readUnsignedShort();
                int k18 = in.readUnsignedShort();
                if(k18 == 65535)
                {
                    Widget.interfaceCache[i6].anInt233 = 0;
                    packet = -1;
                    return true;
                } else
                {
                    Class8 class8 = Class8.method198(k18);
                    Widget.interfaceCache[i6].anInt233 = 4;
                    Widget.interfaceCache[i6].anInt234 = k18;
                    Widget.interfaceCache[i6].modelRotation1 = class8.anInt190;
                    Widget.interfaceCache[i6].modelRotation2 = class8.anInt198;
                    Widget.interfaceCache[i6].modelZoom = (class8.anInt181 * 100) / i13;
                    packet = -1;
                    return true;
                }
            }
            if(packet == 171)
            {
                boolean flag1 = in.readUnsignedByte() == 1;
                int j13 = in.readUnsignedShort();
                Widget.interfaceCache[j13].isMouseoverTriggered = flag1;
                packet = -1;
                return true;
            }
            if(packet == 142)
            {
                int j6 = in.method434((byte)108);
                method60(j6, (byte)6);
                if(backDialogID != -1)
                {
                    backDialogID = -1;
                    inputTaken = true;
                }
                if(inputDialogState != 0)
                {
                    inputDialogState = 0;
                    inputTaken = true;
                }
                invOverlayInterfaceID = j6;
                tabAreaAltered = true;
                aBoolean1103 = true;
                openInterfaceID = -1;
                aBoolean1149 = false;
                packet = -1;
                return true;
            }
            if(packet == 126)
            {
                String s1 = in.readString();
                int k13 = in.method435(true);
                if (k13 >= 18144 && k13 <= 18244) {
                    this.clanList[k13 - 18144] = s1;
                }
                Widget.interfaceCache[k13].message = s1;
                if(Widget.interfaceCache[k13].parentID == tabInterfaceIDs[tabID])
                    tabAreaAltered = true;
                packet = -1;
                return true;
            }
            if(packet == 170) {
                try {
                    String text = in.readString();
                    // broadcastActive = true;
                    // broadcastMessage = text;
                    // broadcastTimer = System.currentTimeMillis();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                packet = -1;
                return true;
            }
            if(packet == 179) {
                try {
                    int broadcastType = in.readUnsignedByte();

                    int broadcastIndex = in.readUnsignedByte();

                    if (broadcastType == -1) {
                        BroadcastManager.removeIndex(broadcastIndex);
                        return true;
                    }

                    Broadcast broadcast = new Broadcast();

                    broadcast.type = broadcastType;

                    broadcast.index = broadcastIndex;

                    broadcast.message = in.readString();

                    if (broadcastType == 1) {
                        broadcast.url = in.readString();
                    } else if (broadcastType == 2) {
                        broadcast.x = in.readDWord();
                        broadcast.y = in.readDWord();
                        broadcast.z = in.readUnsignedByte();
                    }
                    broadcast.setExpireDelay();
                    BroadcastManager.addBoradcast(broadcast);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                packet = -1;
                return true;
            }
            if(packet == 206)
            {
                publicChatMode = in.readUnsignedByte();
                privateChatMode = in.readUnsignedByte();
                tradeMode = in.readUnsignedByte();
                aBoolean1233 = true;
                inputTaken = true;
                packet = -1;
                return true;
            }
            if(packet == 240)
            {
                if(tabID == 12)
                    tabAreaAltered = true;
                anInt878 = in.method411();
                packet = -1;
                return true;
            }
            if(packet == 8)
            {
                int k6 = in.method436((byte)-74);
                int l13 = in.readUnsignedShort();
                Widget.interfaceCache[k6].anInt233 = 1;
                Widget.interfaceCache[k6].anInt234 = l13;
                packet = -1;
                return true;
            }
            if(packet == 122)
            {
                int l6 = in.method436((byte)-74);
                int i14 = in.method436((byte)-74);
                int i19 = i14 >> 10 & 0x1f;
                int i22 = i14 >> 5 & 0x1f;
                int l24 = i14 & 0x1f;
                Widget.interfaceCache[l6].textColor = (i19 << 19) + (i22 << 11) + (l24 << 3);
                packet = -1;
                return true;
            }
            if(packet == 53)
            {
                tabAreaAltered = true;
                int i7 = in.readUnsignedShort();
                Widget class9_1 = Widget.interfaceCache[i7];
                int j19 = in.readUnsignedShort();
                for(int j22 = 0; j22 < j19; j22++)
                {
                    int i25 = in.readUnsignedByte();
                    if(i25 == 255)
                        i25 = in.method440(true);
                    class9_1.inv[j22] = in.method436((byte)-74);
                    class9_1.invStackSizes[j22] = i25;
                }

                for(int j25 = j19; j25 < class9_1.inv.length; j25++)
                {
                    class9_1.inv[j25] = 0;
                    class9_1.invStackSizes[j25] = 0;
                }

                packet = -1;
                return true;
            }
            if(packet == 230)
            {
                int j7 = in.method435(true);
                int j14 = in.readUnsignedShort();
                int k19 = in.readUnsignedShort();
                int k22 = in.method436((byte)-74);
                Widget.interfaceCache[j14].modelRotation1 = k19;
                Widget.interfaceCache[j14].modelRotation2 = k22;
                Widget.interfaceCache[j14].modelZoom = j7;
                packet = -1;
                return true;
            }
            if(packet == 221)
            {
                anInt900 = in.readUnsignedByte();
                tabAreaAltered = true;
                packet = -1;
                return true;
            }
            if(packet == 177)
            {
                aBoolean1160 = true;
                anInt995 = in.readUnsignedByte();
                anInt996 = in.readUnsignedByte();
                anInt997 = in.readUnsignedShort();
                anInt998 = in.readUnsignedByte();
                anInt999 = in.readUnsignedByte();
                if(anInt999 >= 100)
                {
                    int k7 = anInt995 * 128 + 64;
                    int k14 = anInt996 * 128 + 64;
                    int i20 = method42(anInt918, k14, true, k7) - anInt997;
                    int l22 = k7 - xCameraPos;
                    int k25 = i20 - zCameraPos;
                    int j28 = k14 - yCameraPos;
                    int i30 = (int)Math.sqrt(l22 * l22 + j28 * j28);
                    yCameraCurve = (int)(Math.atan2(k25, i30) * 325.94900000000001D) & 0x7ff;
                    xCameraCurve = (int)(Math.atan2(l22, j28) * -325.94900000000001D) & 0x7ff;
                    if(yCameraCurve < 128)
                        yCameraCurve = 128;
                    if(yCameraCurve > 383)
                        yCameraCurve = 383;
                }
                packet = -1;
                return true;
            }
            if(packet == 249)
            {
                anInt1046 = in.readByteS(0);
                anInt884 = in.method436((byte)-74);
                packet = -1;
                return true;
            }
            if(packet == 65)
            {
                method31(in, anInt1007, 973);
                packet = -1;
                return true;
            }
            if(packet == 27)
            {
                messagePromptRaised = false;
                inputDialogState = 1;
                amountOrNameInput = "";
                inputTaken = true;
                packet = -1;
                return true;
            }
            if(packet == 187)
            {
                messagePromptRaised = false;
                inputDialogState = 2;
                amountOrNameInput = "";
                inputTaken = true;
                packet = -1;
                return true;
            }
            if(packet == 97)
            {
                int l7 = in.readUnsignedShort();
                method60(l7, (byte)6);
                if(invOverlayInterfaceID != -1)
                {
                    invOverlayInterfaceID = -1;
                    tabAreaAltered = true;
                    aBoolean1103 = true;
                }
                if(backDialogID != -1)
                {
                    backDialogID = -1;
                    inputTaken = true;
                }
                if(inputDialogState != 0)
                {
                    inputDialogState = 0;
                    inputTaken = true;
                }
                openInterfaceID = l7;
                aBoolean1149 = false;
                packet = -1;
                return true;
            }
            if(packet == 218)
            {
                int i8 = in.method438(false);
                dialogID = i8;
                inputTaken = true;
                packet = -1;
                return true;
            }
            if(packet == 87)
            {
                int j8 = in.method434((byte)108);
                int l14 = in.method439((byte)41);
                anIntArray1045[j8] = l14;
                if(variousSettings[j8] != l14)
                {
                    variousSettings[j8] = l14;
                    method33(false, j8);
                    tabAreaAltered = true;
                    if(dialogID != -1)
                        inputTaken = true;
                }
                packet = -1;
                return true;
            }
            if(packet == 36)
            {
                int k8 = in.method434((byte)108);
                byte byte0 = in.readSignedByte();
                anIntArray1045[k8] = byte0;
                if(variousSettings[k8] != byte0)
                {
                    variousSettings[k8] = byte0;
                    method33(false, k8);
                    tabAreaAltered = true;
                    if(dialogID != -1)
                        inputTaken = true;
                }
                packet = -1;
                return true;
            }
            if(packet == 61)
            {
                anInt1055 = in.readUnsignedByte();
                packet = -1;
                return true;
            }
            if(packet == 200)
            {
                int l8 = in.readUnsignedShort();
                int i15 = in.method411();
                Widget class9_4 = Widget.interfaceCache[l8];
                class9_4.anInt257 = i15;
                class9_4.modelZoom = 1600;
                if(i15 == -1)
                {
                    class9_4.anInt246 = 0;
                    class9_4.anInt208 = 0;
                }
                packet = -1;
                return true;
            }
            if(packet == 219)
            {
                if(invOverlayInterfaceID != -1)
                {
                    invOverlayInterfaceID = -1;
                    tabAreaAltered = true;
                    aBoolean1103 = true;
                }
                if(backDialogID != -1)
                {
                    backDialogID = -1;
                    inputTaken = true;
                }
                if(inputDialogState != 0)
                {
                    inputDialogState = 0;
                    inputTaken = true;
                }
                openInterfaceID = -1;
                aBoolean1149 = false;
                packet = -1;
                return true;
            }
            if(packet == 34)
            {
                tabAreaAltered = true;
                int i9 = in.readUnsignedShort();
                Widget class9_2 = Widget.interfaceCache[i9];
                while(in.currentPosition < anInt1007)
                {
                    int j20 = in.readUSmart();
                    int i23 = in.readUnsignedShort();
                    int l25 = in.readUnsignedByte();
                    if(l25 == 255)
                        l25 = in.readDWord();
                    if(j20 >= 0 && j20 < class9_2.inv.length)
                    {
                        class9_2.inv[j20] = i23;
                        class9_2.invStackSizes[j20] = l25;
                    }
                }
                packet = -1;
                return true;
            }
            if(packet == 105 || packet == 84 || packet == 147 || packet == 215 || packet == 4 || packet == 117 || packet == 156 || packet == 44 || packet == 160 || packet == 101 || packet == 151)
            {
                method137(anInt1119, in, packet);
                packet = -1;
                return true;
            }
            if(packet == 106)
            {
                tabID = in.readByteC(false);
                tabAreaAltered = true;
                aBoolean1103 = true;
                packet = -1;
                return true;
            }
            if(packet == 164)
            {
                int j9 = in.method434((byte)108);
                method60(j9, (byte)6);
                if(invOverlayInterfaceID != -1)
                {
                    invOverlayInterfaceID = -1;
                    tabAreaAltered = true;
                    aBoolean1103 = true;
                }
                backDialogID = j9;
                inputTaken = true;
                openInterfaceID = -1;
                aBoolean1149 = false;
                packet = -1;
                return true;
            }
            signlink.reporterror("T1 - " + packet + "," + anInt1007 + " - " + anInt842 + "," + anInt843);
            method44(true);
        }
        catch(IOException _ex)
        {
            method68(-670);
        }
        catch(Exception exception)
        {
            String s2 = "T2 - " + packet + "," + anInt842 + "," + anInt843 + " - " + anInt1007 + "," + (baseX + ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1500[0]) + "," + (baseY + ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anIntArray1501[0]) + " - ";
            for(int j15 = 0; j15 < anInt1007 && j15 < 50; j15++)
                s2 = s2 + in.buffer[j15] + ",";

            signlink.reporterror(s2);
            method44(true);
        }
        return true;
    }

    public final void method146(byte byte0)
    {
        anInt1265++;
        method47(0, true);
        method26(true, anInt882);
        method47(0, false);
        method26(false, anInt882);
        method55(-948);
        method104(true);
        if(!aBoolean1160)
        {
            int i = anInt1184;
            if(anInt984 / 256 > i)
                i = anInt984 / 256;
            if(aBooleanArray876[4] && anIntArray1203[4] + 128 > i)
                i = anIntArray1203[4] + 128;
            int k = anInt1185 + anInt896 & 0x7ff;
           // method144(0, clientZoom + i * 3, i, anInt1014, method42(anInt918, ((Class30_Sub2_Sub4_Sub1) (aClass30_Sub2_Sub4_Sub1_Sub2_1126)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (aClass30_Sub2_Sub4_Sub1_Sub2_1126)).anInt1550) - 50, k, anInt1015);
            method144(0, cameraZoom + i * (log_view_dist == 9 && currentScreenMode == ScreenMode.RESIZABLE ? 2
                    : (log_view_dist == 10 ? 5 : 3)), i, anInt1014, method42(anInt918, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1551, true, ((Class30_Sub2_Sub4_Sub1) (localPlayer)).anInt1550) - 50, k, anInt1015);

        }
        int j;
        if(!aBoolean1160)
            j = method120(111);
        else
            j = method121(anInt1081);
        int l = xCameraPos;
        int i1 = zCameraPos;
        int j1 = yCameraPos;
        int k1 = yCameraCurve;
        int l1 = xCameraCurve;
        for(int i2 = 0; i2 < 5; i2++)
            if(aBooleanArray876[i2])
            {
                int j2 = (int)((Math.random() * (double)(anIntArray873[i2] * 2 + 1) - (double)anIntArray873[i2]) + Math.sin((double)anIntArray1030[i2] * ((double)anIntArray928[i2] / 100D)) * (double)anIntArray1203[i2]);
                if(i2 == 0)
                    xCameraPos += j2;
                if(i2 == 1)
                    zCameraPos += j2;
                if(i2 == 2)
                    yCameraPos += j2;
                if(i2 == 3)
                    xCameraCurve = xCameraCurve + j2 & 0x7ff;
                if(i2 == 4)
                {
                    yCameraCurve += j2;
                    if(yCameraCurve < 128)
                        yCameraCurve = 128;
                    if(yCameraCurve > 383)
                        yCameraCurve = 383;
                }
            }

        int k2 = Rasterizer.anInt1481;
        Class30_Sub2_Sub4_Sub6.aBoolean1684 = true;
            Class30_Sub2_Sub4_Sub6.anInt1687 = 0;
            Class30_Sub2_Sub4_Sub6.anInt1685 = super.mouseX - (currentScreenMode == ScreenMode.FIXED ? 0 : 0);
            Class30_Sub2_Sub4_Sub6.anInt1686 = super.mouseY - (currentScreenMode == ScreenMode.FIXED ? 0 : 0);
            DrawingArea.setAllPixelsToZero();
            if(skyLoad){
                DrawingArea.drawPixels(screenAreaHeight, 0, 0, 0xC8C0A8, screenAreaWidth );
            }
            try {
                aClass25_946.method313(xCameraPos, yCameraPos, xCameraCurve, zCameraPos, j, yCameraCurve, false);
                if (FogToggle) {
                    double fogDistance = Math.sqrt(Math.pow(zCameraPos, 2));
                    int fogStartDistance = 1430;
                    int fogEndDistance = 2100;
                    fogHandler.setFogDistance((float) fogDistance);
                    fogHandler.renderFog(false, fogStartDistance, fogEndDistance, 3);
                }
                aClass25_946.method288((byte) 104);
            } catch(Exception e){
                e.printStackTrace();
            }
            method34(anInt898);
                method61(-252);
                method37(854, k2);
            if (currentScreenMode != ScreenMode.FIXED) {
                drawChatArea(6);
                drawMinimap(false);
                drawTabArea((byte)-81);
            }
            draw3dScreen(8);
            aRSImageProducer_1165.method238(currentScreenMode == ScreenMode.FIXED ? 0 : 0, 23680, super.aGraphics12, currentScreenMode == ScreenMode.FIXED ? 0 : 0);
            xCameraPos = l;
            zCameraPos = i1;
            yCameraPos = j1;
            yCameraCurve = k1;
            xCameraCurve = l1;
            return;
    }

    public final void clearTopInterfaces(int i)
    {
        stream.createFrame(130);
        if(invOverlayInterfaceID != -1)
        {
            invOverlayInterfaceID = -1;
            tabAreaAltered = true;
            aBoolean1149 = false;
            aBoolean1103 = true;
        }
        if(backDialogID != -1)
        {
            backDialogID = -1;
            inputTaken = true;
            aBoolean1149 = false;
        }
        openInterfaceID = -1;
        if(i <= 0)
            stream.writeByte(13);
    }

    public client()
    {
        instance = this;
        anIntArrayArray825 = new int[104][104];
        anIntArray826 = new int[200];
        aClass19ArrayArrayArray827 = new Class19[4][104][104];
        aBoolean830 = true;
        aBoolean831 = false;
        aStream_834 = new Stream(new byte[5000], 891);
        npcs = new Npc[16384];
        npcIndices = new int[16384];
        anInt838 = 9;
        anIntArray840 = new int[1000];
        aStream_847 = Stream.method396(1, 9);
        aBoolean848 = true;
        openInterfaceID = -1;
        clanTitles = new String[500];
        anIntArray864 = new int[Skills.SKILLS_COUNT];
        aBoolean872 = false;
        anIntArray873 = new int[5];
        BlackMap = new Sprite[2];
        anInt874 = -1;
        anInt875 = -680;
        aBooleanArray876 = new boolean[5];
        anInt877 = 1834;
        aBoolean880 = false;
        reportAbuseInput = "";
        anInt882 = -30815;
        anInt883 = 533;
        anInt884 = -1;
        menuOpen = false;
        inputString = "";
        anInt888 = 2048;
        anInt889 = 2047;
        aPlayerArray890 = new Player[anInt888];
        anIntArray892 = new int[anInt888];
        anIntArray894 = new int[anInt888];
        aStreamArray895 = new Stream[anInt888];
        anInt897 = 1;
        anIntArrayArray901 = new int[104][104];
        anInt902 = 0x766654;
        aByteArray912 = new byte[16384];
        aByte920 = 14;
        anInt921 = 732;
        anIntArray922 = new int[Skills.SKILLS_COUNT];
        aByte923 = 25;
        aLongArray925 = new long[100];
        aBoolean926 = false;
        anInt927 = 0x332d25;
        anIntArray928 = new int[5];
        anIntArrayArray929 = new int[104][104];
        aCRC32_930 = new CRC32();
        anInt939 = 748;
        chatTypes = new int[500];
        chatNames = new String[500];
        chatMessages = new String[500];
        sideIcons = new Sprite[15];
        aBoolean954 = true;
        aLongArray955 = new long[200];
        currentSong = -1;
        aBoolean962 = false;
        anInt963 = -1;
        anInt964 = -1;
        anIntArray968 = new int[33];
        anIntArray969 = new int[256];
        aClass14Array970 = new Class14[6];
        variousSettings = new int[10000];
        aBoolean972 = false;
        aByte973 = -74;
        anInt975 = 50;
        anIntArray976 = new int[anInt975];
        anIntArray977 = new int[anInt975];
        anIntArray978 = new int[anInt975];
        anIntArray979 = new int[anInt975];
        anIntArray980 = new int[anInt975];
        anIntArray981 = new int[anInt975];
        anIntArray982 = new int[anInt975];
        aStringArray983 = new String[anInt975];
        anInt985 = -1;
        aSpriteArray987 = new Sprite[30];
        anIntArray990 = new int[5];
        aBoolean991 = false;
        aBoolean994 = false;
        anInt1002 = 0xbaab8c;
        amountOrNameInput = "";
        aByte1012 = 24;
        aClass19_1013 = new Class19(169);
        aBoolean1017 = false;
        openWalkableInterface = -1;
        anIntArray1030 = new int[5];
        aBoolean1031 = false;
        aSpriteArray1033 = new Sprite[1001];
        dialogID = -1;
        aBoolean1043 = false;
        anIntArray1044 = new int[Skills.SKILLS_COUNT];
        anIntArray1045 = new int[2000];
        aBoolean1047 = true;
        anInt1050 = 111;
        anIntArray1052 = new int[151];
        anInt1054 = -1;
        aClass19_1056 = new Class19(169);
        anIntArray1057 = new int[33];
        anInt1058 = 24869;
        aClass9_1059 = new Widget();
        aBackgroundArray1060 = new Background[100];
        this.gameframe = new Sprite[70];
        anInt1063 = 0x4d4233;
        anIntArray1065 = new int[7];
        anIntArray1072 = new int[1000];
        anIntArray1073 = new int[1000];
        aBoolean1080 = false;
        anInt1081 = -733;
        aStringArray1082 = new String[200];
        in = Stream.method396(1, 9);
        anIntArray1090 = new int[9];
        menuActionCmd2 = new int[500];
        menuActionCmd3 = new int[500];
        menuActionID = new int[500];
        menuActionCmd1 = new long[500];
        aSpriteArray1095 = new Sprite[20];
        this.skullIcons = new Sprite[20];
        aBoolean1103 = false;
        anInt1105 = 519;
        aBoolean1106 = false;
        anInt1116 = 445;
        anInt1118 = -29508;
        anInt1119 = -77;
        aString1121 = "";
        aStringArray1127 = new String[5];
        aBooleanArray1128 = new boolean[5];
        anIntArrayArrayArray1129 = new int[4][13][13];
        anInt1132 = 2;
        anInt1135 = -12499;
        aSpriteArray1140 = new Sprite[2000];
        aBoolean1141 = false;
        aBoolean1149 = false;
        aSpriteArray1150 = new Sprite[8];
        musicEnabled = true;
        tabAreaAltered = false;
        aBoolean1157 = false;
        canMute = false;
        aBoolean1159 = false;
        aBoolean1160 = false;
        anInt1171 = 1;
        myUsername = "";
        myPassword = "";
        this.cButtonHPos = -1;
        this.cButtonCPos = 0;
        server = Configuration.SERVER_ADDRESS;
        port = Configuration.PORT;
        aBoolean1176 = false;
        reportAbuseInterfaceID = -1;
        aClass19_1179 = new Class19(169);
        anInt1184 = 128;
        invOverlayInterfaceID = -1;
        stream = Stream.method396(1, 9);
        aByte1194 = 5;
        menuActionName = new String[500];
        anIntArray1203 = new int[5];
        aBoolean1206 = true;
        sound = new int[50];
        anInt1210 = 2;
        anInt1211 = 78;
        promptInput = "";
        aByte1217 = 6;
        anInt1218 = -589;
        ModIcons = new Sprite[26];
        tabID = 3;
        inputTaken = false;
        songChanging = true;
        anIntArray1229 = new int[151];
        collisionMaps = new Class11[4];
        aBoolean1233 = false;
        anIntArray1240 = new int[100];
        soundType = new int[50];
        aBoolean1242 = false;
        soundDelay = new int[50];
        soundVolume = new int[50];
        aBoolean1252 = false;
        aBoolean1255 = false;
        messagePromptRaised = false;
        aString1266 = "";
        aString1267 = "";
        aByte1274 = -13;
        backDialogID = -1;
        aBoolean1277 = true;
        anInt1279 = 2;
        anIntArray1280 = new int[4000];
        anIntArray1281 = new int[4000];
        anInt1289 = -1;

    }
    private int anInt822;
    private static byte aByte823 = 77;
    private long aLong824;
    private int anIntArrayArray825[][];
    private int anIntArray826[];
    private Class19 aClass19ArrayArrayArray827[][][];
    private int anIntArray828[];
    private int anIntArray829[];
    private boolean aBoolean830;
    private volatile boolean aBoolean831;
    private Socket aSocket832;
    private int anInt833;
    private Stream aStream_834;
    private Sprite[] gameframe;
    private Npc npcs[];
    private int npcCount;
    int npcIndices[];
    private int anInt838;
    private int anInt839;
    int anIntArray840[];
    private int anInt841;
    private int anInt842;
    private int anInt843;
    private String aString844;
    private int privateChatMode;
    private static int anInt846;
    private Stream aStream_847;
    private boolean aBoolean848;
    private static int anInt849;
    private int anIntArray850[];
    private int anIntArray851[];
    private int anIntArray852[];
    private int anIntArray853[];
    private static int anInt854;
    private int anInt855;
    private static BigInteger aBigInteger856 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
    static int openInterfaceID;
    private int xCameraPos;
    private int zCameraPos;
    private int yCameraPos;
    private int yCameraCurve;
    private int xCameraCurve;
    private int rights;
    private int anIntArray864[];
    private Sprite aSprite_865;
    private Sprite aSprite_866;
    private Background aBackground_867;
    private Sprite aSprite_868;
    private Background aBackground_869;
    private Sprite aSprite_870;
    private Sprite aSprite_871;
    private boolean aBoolean872;
    private int anIntArray873[];
    private int anInt874;
    private int anInt875;
    private boolean aBooleanArray876[];
    private int anInt877;
    private int anInt878;
    MouseDetection aMouseDetection_879;
    private volatile boolean aBoolean880;
    private String reportAbuseInput;
    private int anInt882;
    private int anInt883;
    private int anInt884;
    private boolean menuOpen;
    private int anInt886;
    private String inputString;
    private int anInt888;
    private int anInt889;
    private Player aPlayerArray890[];
    private int anInt891;
    int anIntArray892[];
    private int anInt893;
    private int anIntArray894[];
    private Stream aStreamArray895[];
    private int anInt896;
    private int anInt897;
    private int anInt898;
    private int anInt899;
    private int anInt900;
    private int anIntArrayArray901[][];
    private int anInt902;
    private String macAddress;
    private byte aByteArray912[];
    private int anInt913;
    private int anInt914;
    private int anInt915;
    private int anInt916;
    private int crossType;
    private int anInt918;
    private static boolean aBoolean919 = true;
    private byte aByte920;
    private int anInt921;
    private int anIntArray922[];
    private byte aByte923;
    private static int anInt924;
    private long aLongArray925[];
    private boolean aBoolean926;
    private int anInt927;
    private int anIntArray928[];
    private int anIntArrayArray929[][];
    private CRC32 aCRC32_930;
    private Sprite aSprite_931;
    private Sprite aSprite_932;
    private int anInt933;
    private int anInt934;
    private int anInt935;
    private int anInt936;
    private int anInt937;
    private int anInt938;
    private int anInt939;
    private static int anInt940;
    private static int anInt941;
    private int chatTypes[];
    private final int[] chatRights = new int[500];
    public String[] playerTitles;
    private String chatNames[];
    private String chatMessages[];
    private int anInt945;
    private Class25 aClass25_946;
    private Sprite sideIcons[];
    private int menuScreenArea;
    private int anInt949;
    private int anInt950;
    private int anInt951;
    private int anInt952;
    private long aLong953;
    boolean aBoolean954;
    private long aLongArray955[];
    private int currentSong;
    private static int anInt957 = 10;
    static int ondemand_offset;
    private static boolean aBoolean959 = true;
    private static boolean lowMemory;
    private int anInt961;
    private volatile boolean aBoolean962;
    private int anInt963;
    private int anInt964;
    private int anIntArray965[] = {
            0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff
    };
    private Background aBackground_966;
    private Background aBackground_967;
    private int anIntArray968[];
    private int anIntArray969[];
    Class14 aClass14Array970[];
    public int variousSettings[];
    private boolean aBoolean972;
    private byte aByte973;
    private int anInt974;
    private int anInt975;
    private int anIntArray976[];
    private int anIntArray977[];
    private int anIntArray978[];
    private int anIntArray979[];
    private int anIntArray980[];
    private int anIntArray981[];
    private int anIntArray982[];
    private String aStringArray983[];
    private int anInt984;
    private int anInt985;
    private static int anInt986;
    private Sprite aSpriteArray987[];
    private int anInt988;
    private int anInt989;
    private int anIntArray990[];
    private boolean aBoolean991;
    private int anInt992;
    private static boolean aBoolean993;
    private boolean aBoolean994;
    private int anInt995;
    private int anInt996;
    private int anInt997;
    private int anInt998;
    private int anInt999;
    private ISAACRandomGen aISAACRandomGen_1000;
    private Sprite aSprite_1001;
    private int anInt1002;
    static final int anIntArrayArray1003[][] = {
            {
                    6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010
            }, {
            8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153,
            56621, 4783, 1341, 16578, 35003, 25239
    }, {
            25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094,
            10153, 56621, 4783, 1341, 16578, 35003
    }, {
            4626, 11146, 6439, 12, 4758, 10270
    }, {
            4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574
    }
    };
    private String amountOrNameInput;
    private static int anInt1005;
    private int anInt1006;
    private int anInt1007;
    private int packet;
    private int anInt1009;
    private int anInt1010;
    private int anInt1011;
    private byte aByte1012;
    private Class19 aClass19_1013;
    private int anInt1014;
    private int anInt1015;
    private int anInt1016;
    private boolean aBoolean1017;
    private int openWalkableInterface;
    private static int anIntArray1019[];
    private int anInt1020;
    private int anInt1021;
    int anInt1022;
    private int anInt1023;
    private Sprite aSprite_1024;
    private Sprite aSprite_1025;
    private int anInt1026;
    private Sprite aSprite_1027;
    private Sprite aSprite_1028;
    private Sprite aSprite_1029;
    private int anIntArray1030[];
    private boolean aBoolean1031;
    private static BigInteger aBigInteger1032 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
    private Sprite aSpriteArray1033[];
    private int baseX;
    private int baseY;
    private int anInt1036;
    private int anInt1037;
    private int anInt1038;
    private int anInt1039;
    private int anInt1040;
    private int anInt1041;
    private int dialogID;
    private boolean aBoolean1043;
    private int anIntArray1044[];
    private int anIntArray1045[];
    private int anInt1046;
    private boolean aBoolean1047;
    private int anInt1048;
    private String aString1049;
    private int anInt1050;
    private static int anInt1051;
    private int anIntArray1052[];
    private FileArchive titleStreamLoader;
    private int anInt1054;
    private int anInt1055;
    private Class19 aClass19_1056;
    private int anIntArray1057[];
    private int anInt1058;
    private Widget aClass9_1059;
    private Background aBackgroundArray1060[];
    static int anInt1061;
    private int currentSound;
    private final int[] soundVolume;
    private int anInt1063;
    private int friendsListAction;
    private int anIntArray1065[];
    private int anInt1066;
    private int anInt1067;
    private OnDemandFetcher onDemandFetcher;
    private int currentRegionX;
    private int currentRegionY;
    private int anInt1071;
    private int anIntArray1072[];
    private int anIntArray1073[];
    private Sprite aSprite_1074;
    private Sprite aSprite_1075;
    private Sprite aSprite_1076;
    private Sprite aSprite_1077;
    private Sprite aSprite_1078;
    private int anInt1079;
    private boolean aBoolean1080;
    private int anInt1081;
    private String aStringArray1082[];
    private Stream in;
    private int anInt1084;
    private int anInt1085;
    private int anInt1086;
    private int anInt1087;
    private int anInt1088;
    static int anInt1089;
    private int anIntArray1090[];
    private int menuActionCmd2[];
    private int menuActionCmd3[];
    private int menuActionID[];
    private long menuActionCmd1[];
    private Sprite aSpriteArray1095[];
    private Sprite[] skullIcons;
    private static int anInt1096 = -192;
    private static int anInt1097;
    private int anInt1098;
    private int anInt1099;
    private int anInt1100;
    private int anInt1101;
    private int anInt1102;
    private boolean aBoolean1103;
    private int anInt1104;
    private int anInt1105;
    private boolean aBoolean1106;
    private RSImageProducer aRSImageProducer_1107;
    private RSImageProducer aRSImageProducer_1108;
    private RSImageProducer aRSImageProducer_1109;
    private RSImageProducer aRSImageProducer_1110;
    private RSImageProducer aRSImageProducer_1111;
    private RSImageProducer aRSImageProducer_1112;
    private RSImageProducer aRSImageProducer_1113;
    private RSImageProducer aRSImageProducer_1114;
    private RSImageProducer aRSImageProducer_1115;
    private int anInt1116;
    private static int anInt1117;
    private int anInt1118;
    private int anInt1119;
    private int anInt1120;
    private String aString1121;
    private Sprite compassImage;
    private RSImageProducer aRSImageProducer_1125;
    static Player localPlayer;
    public boolean broadcastActive;
    public long broadcastTimer;
    public String broadcastMessage;
    private String aStringArray1127[];
    private boolean aBooleanArray1128[];
    private int anIntArrayArrayArray1129[][][];
    static int tabInterfaceIDs[] = {
            -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
            -1, -1, -1, -1, -1
    };
    private final int[] modeX = new int[] { 164, 230, 296, 362 };
    private final int[] modeNamesX = new int[] { 26, 86, 150, 212, 286, 349, 427 };
    private final int[] modeNamesY = new int[] { 158, 158, 153, 153, 153, 153, 158 };
    private final int[] channelButtonsX = new int[] { 5, 71, 137, 203, 269, 335, 404 };
    private final String[] modeNames = new String[] { "All", "Game", "Public", "Private", "Clan", "Trade",
            "Report Abuse" };
    final int[] sideIconsX = { 17, 49, 81, 114, 146, 180, 214, 16, 49, 82, 116, 148, 184, 217 },
            sideIconsY = { 9, 7, 5, 5, 2, 3, 7, 303, 306, 306, 302, 305, 303, 304, 303 },
            sideIconsId = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 },
            sideIconsTab = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
    private final int[] redStonesX = new int[] { 6, 44, 77, 110, 143, 176, 209, 6, 44, 77, 110, 143, 176, 209 };
    private final int[] redStonesY = new int[] { 0, 0, 0, 0, 0, 0, 0, 298, 298, 298, 298, 298, 298, 298 };
    private final int[] redStonesId = new int[] { 9, 13, 13, 13, 13, 13, 10, 11, 13, 13, 13, 13, 13, 12 };
    private final int[] tabClickX = new int[] { 38, 33, 33, 33, 33, 33, 38, 38, 33, 33, 33, 33, 33, 38 };
    private final int[] tabClickStart = new int[] { 522, 560, 593, 625, 659, 692, 724, 522, 560, 593, 625, 659, 692,
            724 };
    private final int[] tabClickY = new int[] { 169, 169, 169, 169, 169, 169, 169, 466, 466, 466, 466, 466, 466, 466 };

    private int anInt1131;
    private int anInt1132;
    private int menuActionRow;
    private static int anInt1134;
    private int anInt1135;
    private int anInt1136;
    private int anInt1137;
    private int anInt1138;
    String aString1139;
    private Sprite aSpriteArray1140[];
    private boolean aBoolean1141;
    private static int anInt1142;
    private Sprite aSprite_1143;
    private Sprite aSprite_1144;
    private Background aBackground_1145;
    private Sprite aSprite_1146;
    private Sprite aSprite_1147;
    private int anInt1148;
    private boolean aBoolean1149;
    private Sprite aSpriteArray1150[];
    private boolean musicEnabled;
    private Background aBackgroundArray1152[];
    private boolean tabAreaAltered;
    private int anInt1154;
    private static int anInt1155;
    static boolean fpsOn;
    public static int[] fullScreenTextureArray;
    public static boolean aBoolean1157;
    private boolean canMute;
    private boolean aBoolean1159;
    private boolean aBoolean1160;
    static int loopCycle;
    private static String aString1162 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
    private static RSImageProducer aRSImageProducer_1163;
    private RSImageProducer aRSImageProducer_1164;
    private static RSImageProducer aRSImageProducer_1165;
    private static RSImageProducer aRSImageProducer_1166;
    private int anInt1167;
    private Class24 socketStream;
    private int anInt1169;
    private int anInt1170;
    private int anInt1171;
    private long aLong1172;
    private String myUsername;
    private String myPassword;
    public static String server;
    public static int port = Configuration.PORT;
    private static int aPort;
    private static int anInt1175;
    private boolean aBoolean1176;
    private final int anIntArray1177[] = {
            0, 0, 0, 0, 1, 1, 1, 1, 1, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 3
    };
    private int reportAbuseInterfaceID;
    private Class19 aClass19_1179;
    private static int[] anIntArray1180;
    private static int[] anIntArray1181;
    private static int[] anIntArray1182;
    private byte terrainData[][];
    private int anInt1184;
    private int anInt1185;
    private int anInt1186;
    private int anInt1187;
    private static int anInt1188;
    private int invOverlayInterfaceID;
    private int anIntArray1190[];
    private int anIntArray1191[];
    private Stream stream;
    private int anInt1193;
    private byte aByte1194;
    private int splitPrivateChat;
    private Sprite aSprite_1196;
    private Background aBackground_1197;
    private Background worldswitch;
    private Sprite Mapicon;
    private Sprite aSprite_1198;
    private String menuActionName[];
    private static final byte aByte1200 = 9;
    private Sprite aSprite_1201;
    private Sprite aSprite_1202;
    private final int[] anIntArray1203;
    static final int[] anIntArray1204 = {
            9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145,
            58654, 5027, 1457, 16565, 34991, 25486
    };
    public static boolean aBoolean1205;
    private boolean aBoolean1206;
    private final int[] sound;
    private int anInt1208;
    private int anInt1209;
    private int anInt1210;
    private int anInt1211;
    private String promptInput;
    private int anInt1213;
    private int[][][] anIntArrayArrayArray1214;
    private long aLong1215;
    private int anInt1216;
    private final byte aByte1217;
    private int anInt1218;
    private final Sprite[] ModIcons;
    long aLong1220;
    static int tabID;
    private int anInt1222;
    private boolean inputTaken;
    private static boolean aBoolean1224 = true;
    private int inputDialogState;
    private static int anInt1226;
    private int nextSong;
    private boolean songChanging;
    private int anIntArray1229[];
    private Class11 collisionMaps[];
    private static boolean aBoolean1231;
    public static int anIntArray1232[];
    private boolean aBoolean1233;
    private int mapCoordinates[];
    private int terrainIndices[];
    private int objectIndices[];
    int anInt1237;
    int anInt1238;
    private final int anInt1239 = 100;
    private int anIntArray1240[];
    private int soundType[];
    private boolean aBoolean1242;
    private int anInt1243;
    private int anInt1244;
    private int anInt1245;
    private int anInt1246;
    private byte mapData[][];
    private int tradeMode;
    private int anInt1249;
    private int soundDelay[];
    private int anInt1251;
    private boolean aBoolean1252;
    private int anInt1253;
    private int anInt1254;
    private boolean aBoolean1255;
    private boolean messagePromptRaised;
    private int anInt1257;
    private byte aByteArrayArrayArray1258[][][];
    private int previousSong;
    private static int anInt1260;
    private int anInt1261;
    private int anInt1262;
    private Sprite minimapImage;
    private int anInt1264;
    private int anInt1265;
    private String aString1266;
    private String aString1267;
    private int anInt1268;
    private int anInt1269;
    private TextDrawingArea smallText;
    private TextDrawingArea regularText;
    private TextDrawingArea boldText;
    private TextDrawingArea aTextDrawingArea_1273;
    private byte aByte1274;
    private int anInt1275;
    private int backDialogID;
    private boolean aBoolean1277;
    private int anInt1278;
    private int anInt1279;
    private int anIntArray1280[];
    private int anIntArray1281[];
    private int anInt1282;
    private int anInt1283;
    private int anInt1284;
    private int anInt1285;
    String aString1286;
    private int publicChatMode;
    private static int anInt1288;
    private int anInt1289;
    public static int anInt1290;
    public static int showpackets;
    public static int showframeids;
    static {
        currentScreenMode = ScreenMode.FIXED;
        currentGameWidth = 765;
        currentGameHeight = 503;
        screenAreaWidth = 516;
        screenAreaHeight = 338;
        cameraZoom = 600;
        showChatComponents = true;
        showTabComponents = true;
        changeChatArea = currentScreenMode != ScreenMode.FIXED;
        changeTabArea = currentScreenMode != ScreenMode.FIXED;
        //transparentTabArea = false;
        anIntArray1019 = new int[1000];
        int i = 0;
        for(int j = 0; j < 1000; j++)
        {
            int l = j + 1;
            int i1 = (int)((double)l + 300D * Math.pow(2D, (double)l / 7D));
            i += i1;
            anIntArray1019[j] = i / 4;
        }

        anIntArray1232 = new int[32];
        i = 2;
        for(int k = 0; k < 32; k++)
        {
            anIntArray1232[k] = i - 1;
            i += i;
        }

    }
}