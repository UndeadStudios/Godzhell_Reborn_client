import java.awt.*;
import java.awt.image.*;

public final class RSImageProducer
    implements ImageProducer, ImageObserver
{

    public RSImageProducer(int i, int j) {
        this.anInt316 = i;
        this.anInt317 = j;
        this.anIntArray315 = new int[i * j];
        this.aColorModel318 = new DirectColorModel(32, 0xff0000, 0xff00, 0xff);
        this.bufferedImage = new BufferedImage(i, j, 1);
        this.anIntArray315 = ((DataBufferInt)this.bufferedImage.getRaster().getDataBuffer()).getData();
        this.initDrawingArea();
    }
    public void initDrawingArea()
    {
        DrawingArea.method331(anInt317, anInt316, anIntArray315, null);
    }

    public void method238(int i, int j, Graphics g, int k)
    {
        method239();
        if(j != 23680)
            anInt313 = -169;
        g.drawImage(bufferedImage, k, i, this);
    }

    public synchronized void addConsumer(ImageConsumer imageconsumer)
    {
        anImageConsumer319 = imageconsumer;
        imageconsumer.setDimensions(anInt316, anInt317);
        imageconsumer.setProperties(null);
        imageconsumer.setColorModel(aColorModel318);
        imageconsumer.setHints(14);
    }

    public synchronized boolean isConsumer(ImageConsumer imageconsumer)
    {
        return anImageConsumer319 == imageconsumer;
    }

    public synchronized void removeConsumer(ImageConsumer imageconsumer)
    {
        if(anImageConsumer319 == imageconsumer)
            anImageConsumer319 = null;
    }

    public void startProduction(ImageConsumer imageconsumer)
    {
        addConsumer(imageconsumer);
    }

    public void requestTopDownLeftRightResend(ImageConsumer imageconsumer)
    {
        System.out.println("TDLR");
    }

    public synchronized void method239()
    {
        if(anImageConsumer319 == null)
        {
            return;
        } else
        {
            anImageConsumer319.setPixels(0, 0, anInt316, anInt317, aColorModel318, anIntArray315, 0, anInt316);
            anImageConsumer319.imageComplete(2);
            return;
        }
    }

    public boolean imageUpdate(Image image, int i, int j, int k, int l, int i1)
    {
        return true;
    }

    private int anInt313;
    private boolean aBoolean314;
    public int anIntArray315[];
    public int anInt316;
    public int anInt317;
    ColorModel aColorModel318;
    ImageConsumer anImageConsumer319;
    private final BufferedImage bufferedImage;
    public Image anImage320;
}
