import java.awt.*;
import java.awt.image.PixelGrabber;

import sign.signlink;
import java.io.*;
import javax.swing.ImageIcon;

public final class Sprite extends DrawingArea
{
    public String location = signlink.findcachedir() + "Sprites/";
	public void drawTransparent(int i, int j, int k)
	{
		i += drawOffsetX;
		j += drawOffsetY;
		int i1 = i + j * DrawingArea.width;
		int j1 = 0;
		int k1 = myHeight;
		int l1 = myWidth;
		int i2 = DrawingArea.width - l1;
		int j2 = 0;
		if(j < DrawingArea.topY)
		{
			int k2 = DrawingArea.topY - j;
			k1 -= k2;
			j = DrawingArea.topY;
			j1 += k2 * l1;
			i1 += k2 * DrawingArea.width;
		}
		if(j + k1 > DrawingArea.bottomY)
			k1 -= (j + k1) - DrawingArea.bottomY;
		if(i < DrawingArea.leftX)
		{
			int l2 = DrawingArea.leftX - i;
			l1 -= l2;
			i = DrawingArea.leftX;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if(i + l1 > DrawingArea.bottomX)
		{
			int i3 = (i + l1) - DrawingArea.bottomX;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if(!(l1 <= 0 || k1 <= 0))
		{
			method351(j1, l1, DrawingArea.pixels, 0, myPixels, j2, k1, i2, k, i1, 8);
		}
	}
public Sprite(String s)
    {
        try
        {
            Image image = Toolkit.getDefaultToolkit().getImage(this.location + s + ".png");
            ImageIcon sprite = new ImageIcon(image);
            myWidth = sprite.getIconWidth();
            myHeight = sprite.getIconHeight();
            anInt1444 = myWidth;
            anInt1445 = myHeight;
            drawOffsetX = 0;
            drawOffsetY = 0;
            myPixels = new int[myWidth * myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
            pixelgrabber.grabPixels();
            setTransparency(255, 0, 255);
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }
    public Sprite(String s, int width, int height){
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(FileOperations.ReadFile(s));
            myWidth = width;
            myHeight = height;
            anInt1444 = myWidth;
            anInt1445 = myHeight;
            drawOffsetX = 0;
            drawOffsetY = 0;
            myPixels = new int[myWidth * myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
            pixelgrabber.grabPixels();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
    public Sprite(int i, int j)
    {
        aBoolean1428 = false;
        anInt1429 = 24869;
        anInt1431 = -32357;
        aByte1432 = 3;
        aBoolean1433 = false;
        anInt1434 = -388;
        aBoolean1436 = true;
        aBoolean1435 = false;
        aBoolean1437 = true;
        aBoolean1438 = false;
        myPixels = new int[i * j];
        myWidth = anInt1444 = i;
        myHeight = anInt1445 = j;
        drawOffsetX = drawOffsetY = 0;
    }
    public void setTransparency(int transRed, int transGreen, int transBlue) {
        for (int index = 0; index < myPixels.length; index++)
            if (((myPixels[index] >> 16) & 255) == transRed
                    && ((myPixels[index] >> 8) & 255) == transGreen
                    && (myPixels[index] & 255) == transBlue)
                myPixels[index] = 0;
    }

   public Sprite(byte abyte0[], Component component)
    {
        aBoolean1428 = false;
        anInt1429 = 24869;
        anInt1431 = -32357;
        aByte1432 = 3;
        aBoolean1433 = false;
        anInt1434 = -388;
        aBoolean1435 = false;
        aBoolean1436 = true;
        aBoolean1437 = true;
        aBoolean1438 = false;
        try
        {
            Image image = Toolkit.getDefaultToolkit().createImage(signlink.findcachedir()+"/SPRITES/OLDKOSCAPE.PNG");
            MediaTracker mediatracker = new MediaTracker(component);
            mediatracker.addImage(image, 0);
            mediatracker.waitForAll();
            myWidth = image.getWidth(component);
            myHeight = image.getHeight(component);
            anInt1444 = myWidth;
            anInt1445 = myHeight;
            drawOffsetX = 0;
            drawOffsetY = 0;
            myPixels = new int[myWidth * myHeight];
            PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
            pixelgrabber.grabPixels();
            return;
        }
        catch(Exception exception)
        {
            System.out.println("Error converting jpg");
        }
    }

    public Sprite(Class44 class44, String s, int i)
    {
		aBoolean1428 = false;
		anInt1429 = 24869;
		anInt1431 = -32357;
		aByte1432 = 3;
		aBoolean1433 = false;
		anInt1434 = -388;
		aBoolean1435 = false;
		aBoolean1436 = true;
		aBoolean1437 = true;
		aBoolean1438 = false;
		Stream stream = new Stream(class44.method571((new StringBuilder()).append(s).append(".dat").toString(), ((byte []) (null))), 891);
		Stream stream_1 = new Stream(class44.method571("index.dat", ((byte []) (null))), 891);
		stream_1.currentPosition = stream.readUnsignedShort();
		anInt1444 = stream_1.readUnsignedShort();
		anInt1445 = stream_1.readUnsignedShort();
		int j = stream_1.readUnsignedByte();
		int ai[] = new int[j];
		for (int k = 0; k < j - 1; k++)
		{
			ai[k + 1] = stream_1.method412();
			if (ai[k + 1] == 0)
				ai[k + 1] = 1;
		}

		for (int l = 0; l < i; l++)
		{
			stream_1.currentPosition += 2;
			stream.currentPosition += stream_1.readUnsignedShort() * stream_1.readUnsignedShort();
			stream_1.currentPosition++;
		}

		drawOffsetX = stream_1.readUnsignedByte();
		drawOffsetY = stream_1.readUnsignedByte();
		myWidth = stream_1.readUnsignedShort();
		myHeight = stream_1.readUnsignedShort();
		int i1 = stream_1.readUnsignedByte();
		int j1 = myWidth * myHeight;
		myPixels = new int[j1];
		//writeTemp(""+s+" "+i+"", "Sprite_Dump.txt");
	if (s.startsWith("back"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/SPRITES/"+s+" "+i+".png"));
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
    	else if (s.startsWith("mapback"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/"+s+" "+i+".png"));
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}		
		    /*	else if (s.startsWith("headicons_prayer"))
	{
		try
		{
	//	System.out.println("Width: "+anInt1440+" Height: "+anInt1441);
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/"+s+" "+i+".png");
				anIntArray1439 = new int[anInt1440 * anInt1441];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, anInt1440, anInt1441, anIntArray1439, 0, anInt1440);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}	*/

	else if (s.startsWith("staticons"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/"+s+" "+i+".png"));
				myWidth = 28;
				myHeight = 28;
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
	else if (s.startsWith("chat"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/CHATBACK 0.png"));
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
		
	else if (s.startsWith("redstone2"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/REDSTONE2 0.png"));
				myWidth = 33;
				myHeight = 37;
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
                pixelgrabber.grabPixels();
            setTransparency(255, 0, 255);
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
	else if (s.startsWith("redstone1"))
	{
		try
		{
				myWidth = 38;
				myHeight = 37;
				myPixels = new int[myWidth * myHeight];
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/REDSTONE1 0.png"));
				if(client.flip) { image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/REDSTONE1 1.png")); }
				if(client.flip_s) { image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/REDSTONE1 2.png")); }
				if(client.flip_r) { image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/REDSTONE1 3.png")); }
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
                pixelgrabber.grabPixels();
            setTransparency(255, 0, 255);
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
	else if (s.startsWith("scroll"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/"+s+" "+i+".png"));
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}
	else if (s.equalsIgnoreCase("invback"))
	{
		try
		{
				Image image = Toolkit.getDefaultToolkit().getImage(signlink.findcachedir() + ("/Sprites/"+s+" "+i+".png"));
				myPixels = new int[myWidth * myHeight];
				PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, myWidth, myHeight, myPixels, 0, myWidth);
				pixelgrabber.grabPixels();
				
			}
			catch (Exception exception)
			{
				System.out.println(((Object) (exception)));
			}
		}

else {
        if(i1 == 0)
        {
            for(int k1 = 0; k1 < j1; k1++)
                myPixels[k1] = ai[stream.readUnsignedByte()];

            return;
        }
        if(i1 == 1)
        {
            for(int l1 = 0; l1 < myWidth; l1++)
            {
                for(int i2 = 0; i2 < myHeight; i2++)
                    myPixels[l1 + i2 * myWidth] = ai[stream.readUnsignedByte()];

            }
           }
        }
    }
    public static void writeTemp(String tempData, String tempFile) {
     try {
        BufferedWriter LV = new BufferedWriter(new FileWriter(tempFile, true));
	LV.write(tempData); LV.newLine();
	LV.flush();
          } catch(IOException IOE) {}
    }
    public void method343(int i)
    {
        if(i != 0)
            aBoolean1438 = !aBoolean1438;
        DrawingArea.method331(myHeight, myWidth, myPixels, null);
    }

    public void method344(int i, int j, int k, int l)
    {
        if(l != 0)
            anInt1430 = 314;
        for(int i1 = 0; i1 < myPixels.length; i1++)
        {
            int j1 = myPixels[i1];
            if(j1 != 0)
            {
                int k1 = j1 >> 16 & 0xff;
                k1 += i;
                if(k1 < 1)
                    k1 = 1;
                else
                if(k1 > 255)
                    k1 = 255;
                int l1 = j1 >> 8 & 0xff;
                l1 += j;
                if(l1 < 1)
                    l1 = 1;
                else
                if(l1 > 255)
                    l1 = 255;
                int i2 = j1 & 0xff;
                i2 += k;
                if(i2 < 1)
                    i2 = 1;
                else
                if(i2 > 255)
                    i2 = 255;
                myPixels[i1] = (k1 << 16) + (l1 << 8) + i2;
            }
        }

    }

    public void method345(int i)
    {
        int ai[] = new int[anInt1444 * anInt1445];
        if(i != 5059)
            anInt1429 = -247;
        for(int j = 0; j < myHeight; j++)
        {
            for(int k = 0; k < myWidth; k++)
                ai[(j + drawOffsetY) * anInt1444 + (k + drawOffsetX)] = myPixels[j * myWidth + k];

        }

        myPixels = ai;
        myWidth = anInt1444;
        myHeight = anInt1445;
        drawOffsetX = 0;
        drawOffsetY = 0;
    }

    public void method346(int i, int j, int k)
    {
        i += drawOffsetX;
        j += drawOffsetY;
        int l = i + j * DrawingArea.width;
        int i1 = 0;
        int j1 = myHeight;
        int k1 = myWidth;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if(k != anInt1431)
            aBoolean1438 = !aBoolean1438;
        if(j < DrawingArea.topY)
        {
            int j2 = DrawingArea.topY - j;
            j1 -= j2;
            j = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if(j + j1 > DrawingArea.bottomY)
            j1 -= (j + j1) - DrawingArea.bottomY;
        if(i < DrawingArea.leftX)
        {
            int k2 = DrawingArea.leftX - i;
            k1 -= k2;
            i = DrawingArea.leftX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(i + k1 > DrawingArea.bottomX)
        {
            int l2 = (i + k1) - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method347(l, k1, j1, i2, i1, 28339, l1, myPixels, DrawingArea.pixels);
            return;
        }
    }

    private void method347(int i, int j, int k, int l, int i1, int j1, int k1,
            int ai[], int ai1[])
    {
        int l1 = -(j >> 2);
        j = -(j & 3);
        for(int i2 = -k; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
                ai1[i++] = ai[i1++];
            }

            for(int k2 = j; k2 < 0; k2++)
                ai1[i++] = ai[i1++];

            i += k1;
            i1 += l;
        }

        if(j1 != 28339)
            anInt1431 = 90;
    }
    public void drawARGBSprite(int xPos, int yPos, int alpha) {
        xPos += this.drawOffsetX;
        yPos += this.drawOffsetY;
        int i1 = xPos + yPos * DrawingArea.width;
        int j1 = 0;
        int spriteHeight = this.myHeight;
        int spriteWidth = this.myWidth;
        int i2 = DrawingArea.width - spriteWidth;
        int j2 = 0;
        int i3;
        if(yPos < DrawingArea.topY) {
            i3 = DrawingArea.topY - yPos;
            spriteHeight -= i3;
            yPos = DrawingArea.topY;
            j1 += i3 * spriteWidth;
            i1 += i3 * DrawingArea.width;
        }

        if(yPos + spriteHeight > DrawingArea.bottomY) {
            spriteHeight -= yPos + spriteHeight - DrawingArea.bottomY;
        }

        if(xPos < DrawingArea.leftX) {
            i3 = DrawingArea.leftX - xPos;
            spriteWidth -= i3;
            xPos = DrawingArea.leftX;
            j1 += i3;
            i1 += i3;
            j2 += i3;
            i2 += i3;
        }

        if(xPos + spriteWidth > DrawingArea.bottomX) {
            i3 = xPos + spriteWidth - DrawingArea.bottomX;
            spriteWidth -= i3;
            j2 += i3;
            i2 += i3;
        }

        if(spriteWidth > 0 && spriteHeight > 0) {
            this.renderARGBPixels(spriteWidth, spriteHeight, this.myPixels, DrawingArea.pixels, i1, alpha, j1, j2, i2);
        }

    }

    private void renderARGBPixels(int spriteWidth, int spriteHeight, int[] spritePixels, int[] renderAreaPixels, int pixel, int alphaValue, int i, int l, int j1) {
        int alpha = alphaValue;

        for(int height = -spriteHeight; height < 0; ++height) {
            for(int width = -spriteWidth; width < 0; ++width) {
                alphaValue = this.myPixels[i] >> 24 & alpha - 1;
                int alphaLevel = 256 - alphaValue;
                if(alphaLevel > 256) {
                    alphaValue = 0;
                }

                if(alpha == 0) {
                    alphaLevel = 256;
                    alphaValue = 0;
                }

                int pixelColor = spritePixels[i++];
                if(pixelColor != 0) {
                    int pixelValue = renderAreaPixels[pixel];
                    renderAreaPixels[pixel++] = ((pixelColor & 16711935) * alphaValue + (pixelValue & 16711935) * alphaLevel & -16711936) + ((pixelColor & '\uff00') * alphaValue + (pixelValue & '\uff00') * alphaLevel & 16711680) >> 8;
                } else {
                    ++pixel;
                }
            }

            pixel += j1;
            i += l;
        }

    }
    public void drawSprite(int i, int k)
    {
        i += drawOffsetX;
        k += drawOffsetY;
        int l = i + k * DrawingArea.width;
        int i1 = 0;
        int j1 = myHeight;
        int k1 = myWidth;
        int l1 = DrawingArea.width - k1;
        int i2 = 0;
        if(k < DrawingArea.topY)
        {
            int j2 = DrawingArea.topY - k;
            j1 -= j2;
            k = DrawingArea.topY;
            i1 += j2 * k1;
            l += j2 * DrawingArea.width;
        }
        if(k + j1 > DrawingArea.bottomY)
            j1 -= (k + j1) - DrawingArea.bottomY;
        if(i < DrawingArea.leftX)
        {
            int k2 = DrawingArea.leftX - i;
            k1 -= k2;
            i = DrawingArea.leftX;
            i1 += k2;
            l += k2;
            i2 += k2;
            l1 += k2;
        }
        if(i + k1 > DrawingArea.bottomX)
        {
            int l2 = (i + k1) - DrawingArea.bottomX;
            k1 -= l2;
            i2 += l2;
            l1 += l2;
        }
        if(k1 <= 0 || j1 <= 0)
        {
            return;
        } else
        {
            method349(DrawingArea.pixels, myPixels, 0, i1, l, k1, j1, l1, i2);
            return;
        }
    }

    private void method349(int ai[], int ai1[], int i, int j, int k, int l, int i1,
            int j1, int k1)
    {
        int l1 = -(l >> 2);
        l = -(l & 3);
        for(int i2 = -i1; i2 < 0; i2++)
        {
            for(int j2 = l1; j2 < 0; j2++)
            {
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            for(int k2 = l; k2 < 0; k2++)
            {
                i = ai1[j++];
                if(i != 0)
                    ai[k++] = i;
                else
                    k++;
            }

            k += j1;
            j += k1;
        }

    }

    public void method350(int i, int j, int k, boolean flag)
    {
        i += drawOffsetX;
        if(flag)
        {
            for(int l = 1; l > 0; l++);
        }
        j += drawOffsetY;
        int i1 = i + j * DrawingArea.width;
        int j1 = 0;
        int k1 = myHeight;
        int l1 = myWidth;
        int i2 = DrawingArea.width - l1;
        int j2 = 0;
        if(j < DrawingArea.topY)
        {
            int k2 = DrawingArea.topY - j;
            k1 -= k2;
            j = DrawingArea.topY;
            j1 += k2 * l1;
            i1 += k2 * DrawingArea.width;
        }
        if(j + k1 > DrawingArea.bottomY)
            k1 -= (j + k1) - DrawingArea.bottomY;
        if(i < DrawingArea.leftX)
        {
            int l2 = DrawingArea.leftX - i;
            l1 -= l2;
            i = DrawingArea.leftX;
            j1 += l2;
            i1 += l2;
            j2 += l2;
            i2 += l2;
        }
        if(i + l1 > DrawingArea.bottomX)
        {
            int i3 = (i + l1) - DrawingArea.bottomX;
            l1 -= i3;
            j2 += i3;
            i2 += i3;
        }
        if(l1 <= 0 || k1 <= 0)
        {
            return;
        } else
        {
            method351(j1, l1, DrawingArea.pixels, 0, myPixels, j2, k1, i2, k, i1, 8);
            return;
        }
    }

    private void method351(int i, int j, int ai[], int k, int ai1[], int l, int i1,
            int j1, int k1, int l1, int i2)
    {
        int j2 = 256 - k1;
        for(int k2 = -i1; k2 < 0; k2++)
        {
            for(int l2 = -j; l2 < 0; l2++)
            {
                k = ai1[i++];
                if(k != 0)
                {
                    int i3 = ai[l1];
                    ai[l1++] = ((k & 0xff00ff) * k1 + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((k & 0xff00) * k1 + (i3 & 0xff00) * j2 & 0xff0000) >> 8;
                } else
                {
                    l1++;
                }
            }

            l1 += j1;
            i += l;
        }

        if(i2 < 8 || i2 > 8)
            aBoolean1428 = !aBoolean1428;
    }

    public void method352(int i, int j, int[] ai, int k, int[] ai1, int l, int i1, int j1, int k1, int l1, int i2) {
        while(l >= 0) {
            this.anInt1434 = 362;
        }

        try {
            int _ex = -l1 / 2;
            int k2 = -i / 2;
            int l2 = (int)(Math.sin((double)j / 326.11D) * 65536.0D);
            int i3 = (int)(Math.cos((double)j / 326.11D) * 65536.0D);
            l2 = l2 * k >> 8;
            i3 = i3 * k >> 8;
            int j3 = (i2 << 16) + k2 * l2 + _ex * i3;
            int k3 = (i1 << 16) + (k2 * i3 - _ex * l2);
            int l3 = k1 + j1 * DrawingArea.width;

            for(j1 = 0; j1 < i; ++j1) {
                int i4 = ai1[j1];
                int j4 = l3 + i4;
                int k4 = j3 + i3 * i4;
                int l4 = k3 - l2 * i4;

                for(k1 = -ai[j1]; k1 < 0; ++k1) {
                    DrawingArea.pixels[j4++] = this.myPixels[(k4 >> 16) + (l4 >> 16) * this.myWidth];
                    k4 += i3;
                    l4 -= l2;
                }

                j3 += l2;
                k3 += i3;
                l3 += DrawingArea.width;
            }
        } catch (Exception var23) {
            ;
        }

    }

    public void method353(int i, int j, int k, int l, int i1, int j1, int k1,
            double d, int l1)
    {
        if(i1 != 41960)
            return;
        try
        {
            int i2 = -k / 2;
            int j2 = -k1 / 2;
            int k2 = (int)(Math.sin(d) * 65536D);
            int l2 = (int)(Math.cos(d) * 65536D);
            k2 = k2 * j1 >> 8;
            l2 = l2 * j1 >> 8;
            int i3 = (l << 16) + (j2 * k2 + i2 * l2);
            int j3 = (j << 16) + (j2 * l2 - i2 * k2);
            int k3 = l1 + i * DrawingArea.width;
            for(i = 0; i < k1; i++)
            {
                int l3 = k3;
                int i4 = i3;
                int j4 = j3;
                for(l1 = -k; l1 < 0; l1++)
                {
                    int k4 = myPixels[(i4 >> 16) + (j4 >> 16) * myWidth];
                    if(k4 != 0)
                        DrawingArea.pixels[l3++] = k4;
                    else
                        l3++;
                    i4 += l2;
                    j4 -= k2;
                }

                i3 += k2;
                j3 += l2;
                k3 += DrawingArea.width;
            }

            return;
        }
        catch(Exception _ex)
        {
            return;
        }
    }

    public void method354(Background background, boolean flag, int i, int j)
    {
        j += drawOffsetX;
        i += drawOffsetY;
        int k = j + i * DrawingArea.width;
        int l = 0;
        if(flag)
            anInt1429 = -364;
        int i1 = myHeight;
        int j1 = myWidth;
        int k1 = DrawingArea.width - j1;
        int l1 = 0;
        if(i < DrawingArea.topY)
        {
            int i2 = DrawingArea.topY - i;
            i1 -= i2;
            i = DrawingArea.topY;
            l += i2 * j1;
            k += i2 * DrawingArea.width;
        }
        if(i + i1 > DrawingArea.bottomY)
            i1 -= (i + i1) - DrawingArea.bottomY;
        if(j < DrawingArea.leftX)
        {
            int j2 = DrawingArea.leftX - j;
            j1 -= j2;
            j = DrawingArea.leftX;
            l += j2;
            k += j2;
            l1 += j2;
            k1 += j2;
        }
        if(j + j1 > DrawingArea.bottomX)
        {
            int k2 = (j + j1) - DrawingArea.bottomX;
            j1 -= k2;
            l1 += k2;
            k1 += k2;
        }
        if(j1 <= 0 || i1 <= 0)
        {
            return;
        } else
        {
            method355(myPixels, j1, background.aByteArray1450, i1, DrawingArea.pixels, 0, aBoolean1436, k1, k, l1, l);
            return;
        }
    }

    private void method355(int ai[], int i, byte abyte0[], int j, int ai1[], int k, boolean flag,
            int l, int i1, int j1, int k1)
    {
        int l1 = -(i >> 2);
        if(!flag)
        {
            for(int i2 = 1; i2 > 0; i2++);
        }
        i = -(i & 3);
        for(int j2 = -j; j2 < 0; j2++)
        {
            for(int k2 = l1; k2 < 0; k2++)
            {
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
            }

            for(int l2 = i; l2 < 0; l2++)
            {
                k = ai[k1++];
                if(k != 0 && abyte0[i1] == 0)
                    ai1[i1++] = k;
                else
                    i1++;
            }

            i1 += l;
            k1 += j1;
        }

    }

    private boolean aBoolean1428;
    private int anInt1429;
    private int anInt1430;
    private int anInt1431;
    private byte aByte1432;
    private boolean aBoolean1433;
    private int anInt1434;
    private boolean aBoolean1435;
    private boolean aBoolean1436;
    private boolean aBoolean1437;
    private boolean aBoolean1438;
    public int myPixels[];
    public int myWidth;
    public int myHeight;
    public int drawOffsetX;
    public int drawOffsetY;
    public int anInt1444;
    public int anInt1445;

}
