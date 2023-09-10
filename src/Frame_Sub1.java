import java.awt.*;

import sign.signlink;

@SuppressWarnings("unused")
public final class Frame_Sub1 extends Frame
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -1365526174409834249L;

	public Frame_Sub1(Applet_Sub1 applet_sub1, int i, byte byte0, int j)
    {
        aBoolean35 = true;
        anApplet_Sub1_36 = applet_sub1;
        setNormalscreen(i,j);
        //setFullscreen();
        if(byte0 != 5)
            aBoolean35 = !aBoolean35;
        toFront();
        resize(i + 8, j + 28);
    }

	private static DisplayMode modes[] = {
		new DisplayMode(1440,900,32,0),
		new DisplayMode(800,600,32,0),
		new DisplayMode(800,600,24,0),
		new DisplayMode(800,600,16,0),
		new DisplayMode(640,480,32,0),
		new DisplayMode(640,480,24,0),
		new DisplayMode(640,480,16,0),	
	};
	
	protected ScreenManager s;

	public void setFullscreen(){
		try {
			s = new ScreenManager();
			DisplayMode dm = s.findFirstCompatibleMode(modes);
			s.setFullScreen(dm, (Frame)this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setNormalscreen(int i, int j){
		try {
			s = new ScreenManager();
			s.closeFullScreen();
			setTitle("Godzhell Reborn and Remastered.");
			setResizable(false);
			setUndecorated(false);
			setVisible(true);
			toFront();
			setSize(i + 8, j + 28);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
    public Graphics getGraphics()
    {
        Graphics g = super.getGraphics();
        g.translate(4, 24);
        return g;
    }

    public final void update(Graphics g)
    {
        anApplet_Sub1_36.update(g);
    }

    public final void paint(Graphics g)
    {
        anApplet_Sub1_36.paint(g);
    }
    private boolean aBoolean35;
    Applet_Sub1 anApplet_Sub1_36;
}

