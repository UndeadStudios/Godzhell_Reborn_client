import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public final class ClientFrame extends Frame {
    private static final long serialVersionUID = 1L;
    public Toolkit toolkit = Toolkit.getDefaultToolkit();
    public Dimension screenSize;
    public int screenWidth;
    public int screenHeight;
    private final Applet_Sub1 applet;
    protected final Insets insets;

    private static JMenuItem menuItem;
    private JFrame frame;

    public ClientFrame(Applet_Sub1 applet, int width, int height, boolean resizable, boolean fullscreen) throws MalformedURLException {
        ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/4vcxosG.jpg"));
        this.screenSize = this.toolkit.getScreenSize();
        this.screenWidth = (int)this.screenSize.getWidth();
        this.screenHeight = (int)this.screenSize.getHeight();
        this.applet = applet;
        this.setTitle("Godzhell Reborn and Remastered.");
        //this.setTitle("Ghreborn LocalHost || 166 data || bringing back memories since 2011 || Custom Pack #6");
        this.setResizable(resizable);
        this.setUndecorated(fullscreen);
        setIconImage(icon.getImage());
        this.setVisible(true);
        this.setFocusTraversalKeysEnabled(false);
        this.insets = this.getInsets();
        if(resizable) {
            this.setMinimumSize(new Dimension(766 + this.insets.left + this.insets.right, 536 + this.insets.top + this.insets.bottom));
        }

        this.setSize(width + this.insets.left + this.insets.right, height + this.insets.top + this.insets.bottom);
        this.setLocationRelativeTo((Component)null);
        this.setBackground(Color.BLACK);
        this.requestFocus();
        this.toFront();
    }

    public Graphics getGraphics() {
        Graphics graphics = super.getGraphics();
        Insets insets = this.getInsets();
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        graphics.translate(insets != null?insets.left:0, insets != null?insets.top:0);
        return graphics;
    }
    client client;
    public int getFrameWidth() {
        Insets insets = this.getInsets();
        return this.getWidth() - (insets.left + insets.right);
    }

    public int getFrameHeight() {
        Insets insets = this.getInsets();
        return this.getHeight() - (insets.top + insets.bottom);
    }
    private int screenshot;

    private boolean takeScreeny = true;

    public void screeny() { // The method for Screenshots.
        try {
            Window window = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusedWindow();
            Point point = window.getLocationOnScreen();
            int x = (int)point.getX();
            int y = (int)point.getY();
            int w = window.getWidth();
            int h = window.getHeight();
            Robot robot = new Robot(window.getGraphicsConfiguration().getDevice());
            Rectangle captureSize = new Rectangle(x, y, w, h);
            java.awt.image.BufferedImage bufferedimage = robot.createScreenCapture(captureSize);
            String fileExtension = "Turmoxi";
            for (int i = 1; i <= 1000; i++) {
                File file = new File("Screenshots/"+ fileExtension +" "+ i +".png");
                if (!file.exists()) {
                    screenshot = i;
                    takeScreeny = true;
                    break;
                }
            }
            File file = new File((new StringBuilder()).append("Screenshots/" + fileExtension + " ").append(screenshot).append(".png").toString());
            if (takeScreeny == true) {
                client.pushMessage("A picture has been saved in your screenshots folder.", 0, "");
                ImageIO.write(bufferedimage, "png", file);
            } else {
                client.pushMessage("@red@Uh oh! Your screeny folder is full!", 0, "");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void update(Graphics graphics) {
        this.applet.update(graphics);
    }

    public void paint(Graphics graphics) {
        this.applet.paint(graphics);
    }
}
