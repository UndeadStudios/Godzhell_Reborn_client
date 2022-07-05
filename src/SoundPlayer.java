import java.io.File;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

/**
 * Plays a sound.
 * @author Bluurr (Modified by Primadude).
 */
public class SoundPlayer implements Runnable {

        /**
         * The path and name of the custom sound file.
         */
        private String fileName;

        /**
         * If the sound to be played is custom.
         */
        private boolean custom;

        /**
         * The audioInputStream object.
         */
        private AudioInputStream stream;

        /**
         * The Info object.
         */
        private DataLine.Info info;

        /**
         * The Clip object.
         */
        private Clip clip;

        /**
         * The soundInputStream object.
         */
        private InputStream soundInputStream;

        /**
         * The Thread object.
         */
        private Thread thread;

        /**
         * Gets the custom sound file path and name
         * @return The fileName variable.
         */
        public String getFileName() {
                return fileName;
        }

        /**
         * If the sound to be played is custom.
         * @return True or false.
         */
        public boolean isCustom() {
                return custom;
        }

        /**
         * Sets the custom variable to true or false.
         * @param custom True or false.
         */
        public void setCustom(boolean custom) {
                this.custom = custom;
        }

        /**
         * Sets the custom sound file path and name.
         * @param fileName The path and name of the custom sound.
         */
        public void setFileName(String fileName) {
                this.fileName = fileName;
        }

        /**
         * Starts the sound thread and creates a new thread.
         * @param soundInputStream The InputSteam of the sound file to play.
         */
        public void startSoundPlayer(InputStream musicfile) {
                this.soundInputStream = musicfile;
                thread = new Thread(this);
                thread.start();
        }

        @Override
        public void run() {
                try {
                        if (isCustom()) {
                                stream = AudioSystem.getAudioInputStream(new File(fileName));
                                setCustom(false);
                        } else {
                                stream = AudioSystem.getAudioInputStream(soundInputStream);
                        }
                        info = new DataLine.Info(Clip.class, stream.getFormat());
                        clip = (Clip) AudioSystem.getLine(info);
                        clip.open(stream);
                        clip.start();
                        while (clip.isActive()) {
                                Thread.sleep(250);
                        }
                        Thread.sleep(10000);
                        clip.close();
                        stream.close(); 
                        thread.interrupt();
                } catch (Exception e) {
                        System.out.println("Error thrown whilst playing sounds:");
                        thread.interrupt();
                        e.printStackTrace();
                }
        }
}