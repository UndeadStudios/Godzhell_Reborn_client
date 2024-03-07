import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;

public class Applet_Sub1 extends Applet
    implements Runnable, MouseListener, MouseMotionListener, KeyListener, FocusListener, WindowListener, MouseWheelListener
{
    public int key;
    public boolean isApplet;
    ClientFrame gameFrame;
    public void refreshFrameSize(boolean undecorated, int width, int height, boolean resizable, boolean full) throws MalformedURLException {
        boolean createdByApplet = this.isApplet && !full;
        this.myWidth = width;
        this.myHeight = height;
        if(this.gameFrame != null) {
            this.gameFrame.dispose();
        }

        if(!createdByApplet) {
            this.gameFrame = new ClientFrame(this, width, height, resizable, undecorated);
            this.gameFrame.addWindowListener(this);
        }

        this.aGraphics12 = ((Container)(createdByApplet?this:this.gameFrame)).getGraphics();
        if(!createdByApplet) {
            this.method11(0).addMouseWheelListener(this);
            this.method11(0).addMouseListener(this);
            this.method11(0).addMouseMotionListener(this);
            this.method11(0).addKeyListener(this);
            this.method11(0).addFocusListener(this);
        }

    }
    public boolean appletClient() {
        return this.gameFrame == null && this.isApplet;
    }
    final void method1(int i, int j) throws MalformedURLException {
        this.isApplet = false;
        this.myWidth = j;
        this.myHeight = i;
            this.gameFrame = new ClientFrame(this, this.myWidth, this.myHeight, client.currentScreenMode == client.ScreenMode.RESIZABLE, client.currentScreenMode == client.ScreenMode.FULLSCREEN);
        this.aGraphics12 = this.method11(0).getGraphics();
        this.aRSImageProducer_13 = new RSImageProducer(this.myWidth, this.myHeight);
        this.method12(this, 1);
    }
    public final void method2(int i, boolean flag, int j)
    {
        this.isApplet = true;
        myWidth = j;
        myHeight = i;
        aGraphics12 = method11(0).getGraphics();
        aRSImageProducer_13 = new RSImageProducer(myWidth, myHeight);
        method12(this, 1);
        if(!flag);
    }
    public void mouseWheelMoved(MouseWheelEvent e)
    {
	int notches = e.getWheelRotation();
        /** ZOOMING **/
        boolean zoom = client.currentScreenMode == client.ScreenMode.FIXED ? (mouseX < 512)
                : (mouseX < client.currentGameWidth - 200);
        if (zoom && client.openInterfaceID == -1) {
            client.cameraZoom += notches * 35;

            int max_zoom_1 = (client.currentScreenMode == client.ScreenMode.FIXED ? -150 : -300);
            if (client.cameraZoom < max_zoom_1) {
                client.cameraZoom = max_zoom_1;
            }
            if (client.cameraZoom > 2200) {
                client.cameraZoom = 2200;
            }
            if (client.currentScreenMode == client.ScreenMode.FIXED) {
                if (client.cameraZoom < 70) {
                    client.cameraZoom = 70;
                }
            } else {
                if (client.cameraZoom < 130) {
                    client.cameraZoom = 130;
                }
            }

            int setting = 0;
            if (client.cameraZoom > 1000) {
                setting = 4;
            } else if (client.cameraZoom > 800) {
                setting = 3;
            } else if (client.cameraZoom > 600) {
                setting = 2;
            } else if (client.cameraZoom > 400) {
                setting = 1;
            }

            //RSInterface.interfaceCache[SettingsWidget.ZOOMTOGGLE].active = true;
			
			/*
			//this is commented out because settings[168] is nulling when a value is set to it.
			try {
				client.instance.settings[168] = setting;
			} catch (Exception e) {
				System.out.println("Failed to set settings[168] to: "+setting);
			}
			*/
            //RSInterface.interfaceCache[SettingsWidget.ZOOM_SLIDER].slider.setValue(client.clientZoom);
        }
        if(this.mouseX > client.currentGameWidth / 2 + 0 && this.mouseY > client.currentGameHeight / 2 + 340 && this.mouseX < client.currentGameWidth / 2 - 510 && this.mouseY < client.currentGameHeight / 2 - 500) {
            client.anInt1089 -= notches * 30;
        }

        if(this.mouseY > 210 && this.mouseY < 473 && this.mouseX > 514 && this.mouseX < 762 && client.tabInterfaceIDs[client.tabID] == 638) {
            Widget.interfaceCache[639].scrollPosition += notches * 30;
        }

        if(this.mouseX > (client.currentGameWidth - 765) / 2 && this.mouseY > (client.currentGameHeight - 503) / 2 && this.mouseX < (client.currentGameWidth + 765) / 2 && this.mouseY < (client.currentGameHeight + 503) / 2 && client.openInterfaceID == 5292) {
            Widget.interfaceCache[5385].scrollPosition += notches * 30;
        }
        if(this.mouseX > (client.currentGameWidth - 765) / 2 && this.mouseY > (client.currentGameHeight - 503) / 2 && this.mouseX < (client.currentGameWidth + 765) / 2 && this.mouseY < (client.currentGameHeight + 503) / 2 && client.tabInterfaceIDs[client.tabID] == 962) {
            Widget.interfaceCache[962].scrollPosition += notches * 30;
        }
        if(this.mouseX > (client.currentGameWidth - 765) / 2 && this.mouseY > (client.currentGameHeight - 503) / 2 && this.mouseX < (client.currentGameWidth + 765) / 2 && this.mouseY < (client.currentGameHeight + 503) / 2 && client.tabInterfaceIDs[client.tabID] == 18891) {
            Widget.interfaceCache[18892].scrollPosition += notches * 30;
        }
    }

    public void run()
    {
        method11(0).addMouseListener(this);
        method11(0).addMouseMotionListener(this);
        method11(0).addKeyListener(this);
        method11(0).addFocusListener(this);
        method11(0).addMouseWheelListener(this);
	method11(0).setFocusTraversalKeysEnabled(false);
        if(gameFrame != null)
            gameFrame.addWindowListener(this);
        method13(0, (byte)4, "Loading...");
        method6();
        int i = 0;
        int j = 256;
        int k = 1;
        int i1 = 0;
        int j1 = 0;
        for(int k1 = 0; k1 < 10; k1++)
            aLongArray7[k1] = System.currentTimeMillis();

        long l = System.currentTimeMillis();
        while(anInt4 >= 0) 
        {
            if(anInt4 > 0)
            {
                anInt4--;
                if(anInt4 == 0)
                {
                    method3(4747);
                    return;
                }
            }
            int i2 = j;
            int j2 = k;
            j = 300;
            k = 1;
            long l1 = System.currentTimeMillis();
            if(aLongArray7[i] == 0L)
            {
                j = i2;
                k = j2;
            } else
            if(l1 > aLongArray7[i])
                j = (int)((long)(2560 * anInt5) / (l1 - aLongArray7[i]));
            if(j < 25)
                j = 25;
            if(j > 256)
            {
                j = 256;
                k = (int)((long)anInt5 - (l1 - aLongArray7[i]) / 10L);
            }
            if(k > anInt5)
                k = anInt5;
            aLongArray7[i] = l1;
            i = (i + 1) % 10;
            if(k > 1)
            {
                for(int k2 = 0; k2 < 10; k2++)
                    if(aLongArray7[k2] != 0L)
                        aLongArray7[k2] += k;

            }
            if(k < anInt6)
                k = anInt6;
            try
            {
                Thread.sleep(k);
            }
            catch(InterruptedException _ex)
            {
                j1++;
            }
            for(; i1 < 256; i1 += j)
            {
                clickMode3 = anInt22;
                saveClickX = anInt23;
                saveClickY = anInt24;
                aLong29 = aLong25;
                anInt22 = 0;
                method7(24869);
                anInt32 = anInt33;
            }

            i1 &= 0xff;
            if(anInt5 > 0)
                anInt8 = (1000 * j) / (anInt5 * 256);
            method9(0);
            if(aBoolean9)
            {
                System.out.println("ntime:" + l1);
                for(int l2 = 0; l2 < 10; l2++)
                {
                    int i3 = ((i - l2 - 1) + 20) % 10;
                    System.out.println("otim" + i3 + ":" + aLongArray7[i3]);
                }

                System.out.println("fps:" + anInt8 + " ratio:" + j + " count:" + i1);
                System.out.println("del:" + k + " deltime:" + anInt5 + " mindel:" + anInt6);
                System.out.println("intex:" + j1 + " opos:" + i);
                aBoolean9 = false;
                j1 = 0;
            }
        }
        if(anInt4 == -1)
            method3(4747);
    }

    public final void method3(int i)
    {
        anInt4 = -2;
        method8(493);
        if(i != 4747)
            return;
        if(gameFrame != null)
        {
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
            try
            {
                System.exit(0);
                return;
            }
            catch(Throwable _ex) { }
        }
    }

    public final void method4(boolean flag, int i)
    {
        if(flag)
        {
            return;
        } else
        {
            anInt5 = 1000 / i;
            return;
        }
    }

    public final void start()
    {
        if(anInt4 >= 0)
            anInt4 = 0;
    }

    public final void stop()
    {
        if(anInt4 >= 0)
            anInt4 = 4000 / anInt5;
    }

    public final void destroy()
    {
        anInt4 = -1;
        try
        {
            Thread.sleep(5000L);
        }
        catch(Exception _ex) { }
        if(anInt4 == -1)
            method3(4747);
    }

    public final void update(Graphics g)
    {
        if(aGraphics12 == null)
            aGraphics12 = g;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void paint(Graphics g)
    {
        if(aGraphics12 == null)
            aGraphics12 = g;
        aBoolean16 = true;
        method10((byte)1);
    }

public boolean mouseWheelDown;

    public final void mousePressed(MouseEvent mouseevent)
    {
	int type =  mouseevent.getButton();
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(mouseevent.isControlDown()) {
            client.controlIsDown = true;
        }
        if(gameFrame != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt18 = 0;
        anInt23 = i;
        anInt24 = j;
        aLong25 = System.currentTimeMillis();
        if (SwingUtilities.isMiddleMouseButton(mouseevent)) {
			mouseWheelDown = true;
			mouseWheelX = i;
			mouseWheelY = j;
			return;
		}
        if(SwingUtilities.isRightMouseButton(mouseevent))
        {
            anInt22 = 2;
            anInt19 = 2;
            return;
        } else if(SwingUtilities.isLeftMouseButton(mouseevent)){
            anInt22 = 1;
            anInt19 = 1;
            return;
        }
    }

	public int mouseWheelX;
	public int mouseWheelY;
    public final void mouseDragged(MouseEvent mouseevent)
    {


        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(gameFrame != null)
        {
            i -= 4;
            j -= 22;
        }
		if (mouseWheelDown) {
			j = mouseWheelX - mouseevent.getX();
			int k = mouseWheelY - mouseevent.getY();
			mouseWheelDragged(j, -k);
			mouseWheelX = mouseevent.getX();
			mouseWheelY = mouseevent.getY();
			return;
		}
        anInt18 = 0;
        mouseX = i;
        mouseY = j;
    }

void mouseWheelDragged(int param1, int param2) {

	}

    public final void mouseReleased(MouseEvent mouseevent)
    {
        anInt18 = 0;
        anInt19 = 0;
mouseWheelDown = false;
    }

    public final void mouseClicked(MouseEvent mouseevent)
    {
    }

    public final void mouseEntered(MouseEvent mouseevent)
    {
    }

    public final void mouseExited(MouseEvent mouseevent)
    {
        anInt18 = 0;
        mouseX = -1;
        mouseY = -1;
    }

    public final void mouseMoved(MouseEvent mouseevent)
    {
        int i = mouseevent.getX();
        int j = mouseevent.getY();
        if(gameFrame != null)
        {
            i -= 4;
            j -= 22;
        }
        anInt18 = 0;
        mouseX = i;
        mouseY = j;
    }

     public final void keyPressed(KeyEvent keyevent)
    {
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        int j = keyevent.getKeyChar();
        if (i == KeyEvent.VK_PAGE_UP) {
            if (client.cameraZoom == 150) {
                return;
            }
            client.cameraZoom -= 50;
        }
        if (i == KeyEvent.VK_PAGE_DOWN) {
            if (client.cameraZoom == 1300) {
                return;
            }
            client.cameraZoom += 50;
        }
        if(j < 30)
            j = 0;
        if(i == 37)
            j = 1;
        if(i == 39)
            j = 2;
        if(i == 38)
            j = 3;
        if(i == 40)
            j = 4;
        if(i == 17)
            j = 5;
        if(i == 8)
            j = 8;
        if(i == 127)
            j = 8;
        if(i == 9)
            j = 9;
        if(i == 10)
            j = 10;
        if(i >= 112 && i <= 123)
            j = (1008 + i) - 112;
        if(i == 36)
            j = 1000;
        if(i == 35)
            j = 1001;
        if(i == 33)
            j = 1002;
        if(i == 34)
            j = 1003;
        if(j > 0 && j < 128)
            anIntArray30[j] = 1;
        if(j > 4)
        {
            anIntArray31[anInt33] = j;
            anInt33 = anInt33 + 1 & 0x7f;
        }
    }

    public final void keyReleased(KeyEvent keyevent)
    {
        anInt18 = 0;
        int i = keyevent.getKeyCode();
        char c = keyevent.getKeyChar();
        if(i == 17) {
            client.controlIsDown = false;
        }
        if(c < '\036')
            c = '\0';
        if(i == 37)
            c = '\001';
        if(i == 39)
            c = '\002';
        if(i == 38)
            c = '\003';
        if(i == 40)
            c = '\004';
        if(i == 17)
            c = '\005';
        if(i == 8)
            c = '\b';
        if(i == 127)
            c = '\b';
        if(i == 9)
            c = '\t';
        if(i == 10)
            c = '\n';
        if(c > 0 && c < '\200')
            anIntArray30[c] = 0;
    }

    public final void keyTyped(KeyEvent keyevent)
    {
    }

    public final int method5(int i)
    {
        while(i >= 0) 
        {
            for(int j = 1; j > 0; j++);
        }
        int k = -1;
        if(anInt33 != anInt32)
        {
            k = anIntArray31[anInt32];
            anInt32 = anInt32 + 1 & 0x7f;
        }
        return k;
    }

    public final void focusGained(FocusEvent focusevent)
    {
        aBoolean17 = true;
        aBoolean16 = true;
        method10((byte)1);
    }

    public final void focusLost(FocusEvent focusevent)
    {
        aBoolean17 = false;
        for(int i = 0; i < 128; i++)
            anIntArray30[i] = 0;

    }

    public final void windowActivated(WindowEvent windowevent)
    {
    }

    public final void windowClosed(WindowEvent windowevent)
    {
    }

    public final void windowClosing(WindowEvent windowevent)
    {
        destroy();
    }

    public final void windowDeactivated(WindowEvent windowevent)
    {
    }

    public final void windowDeiconified(WindowEvent windowevent)
    {
    }

    public final void windowIconified(WindowEvent windowevent)
    {
    }

    public final void windowOpened(WindowEvent windowevent)
    {
    }

    public void method6()
    {
    }

    public void method7(int i)
    {
        if(i == anInt2);
    }

    public void method8(int i)
    {
        i = 91 / i;
    }

    public void method9(int i)
    {
        if(i != 0)
        {
            for(int j = 1; j > 0; j++);
        }
    }

    public void method10(byte byte0)
    {
        if(byte0 == 1)
            byte0 = 0;
    }

    public Component method11(int i) {
        if(i != 0) {
            for(int j = 1; j > 0; ++j) {
                ;
            }
        }

        return (Component)(this.gameFrame != null?this.gameFrame:this);
    }


    public void method12(Runnable runnable, int i)
    {
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(i);
    }

    public void method13(int i, byte byte0, String s)
    {
        while(aGraphics12 == null) 
        {
            aGraphics12 = method11(0).getGraphics();
            try
            {
                method11(0).repaint();
            }
            catch(Exception _ex) { }
            try
            {
                Thread.sleep(1000L);
            }
            catch(Exception _ex) { }
        }
        Font font = new Font("Helvetica", 1, 13);
        FontMetrics fontmetrics = method11(0).getFontMetrics(font);
        Font font1 = new Font("Helvetica", 0, 13);
        method11(0).getFontMetrics(font1);
        if(aBoolean16)
        {
            aGraphics12.setColor(Color.black);
            aGraphics12.fillRect(0, 0, client.currentGameWidth, client.currentGameHeight);
            aBoolean16 = false;
        }
        Color color = new Color(140, 17, 17);
        int j = myHeight / 2 - 18;
        aGraphics12.setColor(color);
        aGraphics12.drawRect(client.currentGameWidth / 2 - 152, j, 304, 34);
        aGraphics12.fillRect(client.currentGameWidth / 2 - 150, j + 2, i * 3, 30);
        aGraphics12.setColor(Color.black);
        if(byte0 != 4)
        {
            return;
        } else
        {
            aGraphics12.fillRect((client.currentGameWidth / 2 - 150) + i * 3, j + 2, 300 - i * 3, 30);
            aGraphics12.setFont(font);
            aGraphics12.setColor(Color.white);
            aGraphics12.drawString(s, (client.currentGameWidth - fontmetrics.stringWidth(s)) / 2, j + 22);
            return;
        }
    }

    public Applet_Sub1()
    {
        aBoolean1 = true;
        anInt2 = 24869;
        anInt3 = 748;
        anInt5 = 20;
        anInt6 = 1;
        aLongArray7 = new long[10];
        aBoolean9 = false;
        aSpriteArray14 = new Sprite[6];
        aBoolean16 = true;
        aBoolean17 = true;
        anIntArray30 = new int[128];
        anIntArray31 = new int[128];
    }

    private boolean aBoolean1;
    private int anInt2;
    private int anInt3;
    private int anInt4;
    private int anInt5;
    public int anInt6;
    private long aLongArray7[];
    public int anInt8;
    public boolean aBoolean9;
    public int myWidth;
    public int myHeight;
    public Graphics aGraphics12;
    public RSImageProducer aRSImageProducer_13;
    public Sprite aSpriteArray14[];
    public boolean aBoolean16;
    public boolean aBoolean17;
    public int anInt18;
    public int anInt19;
    public int mouseX;
    public int mouseY;
    public int anInt22;
    public int anInt23;
    public int anInt24;
    public long aLong25;
    public int clickMode3;
    public int saveClickX;
    public int saveClickY;
    public long aLong29;
    public int anIntArray30[];
    private int anIntArray31[];
    private int anInt32;
    private int anInt33;
    public static int anInt34;

    public int getFps() {
        return anInt8;
    }
}
