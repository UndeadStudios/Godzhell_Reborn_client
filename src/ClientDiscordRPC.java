import net.arikia.dev.drpc.DiscordEventHandlers;
import net.arikia.dev.drpc.DiscordRPC;
import net.arikia.dev.drpc.DiscordRichPresence;

public class ClientDiscordRPC {

    public static DiscordRichPresence presence = new DiscordRichPresence.Builder("").build();
    private static final String applicationID = "571533481809674250";

    public static void initialize() {
        DiscordEventHandlers handlers = new DiscordEventHandlers.Builder().build();
        DiscordRPC.discordInitialize(applicationID, handlers, false);
        DiscordRPC.discordRegister(applicationID, "");
        setTopText("Play Godzhell Reborn at GodzHell.net.");
        setSmallImage("logo", "GodzHell Reborn and Remastered");
        setLargeImage("logo", "GodzHell Reborn and Remastered");
    }

    public static void setTopText(String text) {
        presence.details = text;
        DiscordRPC.discordUpdatePresence(presence);
    }

    public static void setBottomText(String text) {
        presence.state = text;
        DiscordRPC.discordUpdatePresence(presence);
    }

    public static void setLargeImage(String key, String... tooltip) {
        presence.largeImageKey = key;
        if(tooltip[0] != null) {
            presence.largeImageText = tooltip[0];
        }
        DiscordRPC.discordUpdatePresence(presence);
    }

    public static void setSmallImage(String key,String... tooltip) {
        presence.smallImageKey = key;
        if(tooltip[0] != null) {
            presence.smallImageText = tooltip[0];
        }
        DiscordRPC.discordUpdatePresence(presence);
    }

}
