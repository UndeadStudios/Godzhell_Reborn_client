class BZip2FileEntry
{

    BZip2FileEntry()
    {
        anIntArray583 = new int[256];
        anIntArray585 = new int[257];
        anIntArray586 = new int[257];
        aBooleanArray589 = new boolean[256];
        aBooleanArray590 = new boolean[16];
        aByteArray591 = new byte[256];
        aByteArray592 = new byte[4096];
        anIntArray593 = new int[16];
        aByteArray594 = new byte[18002];
        aByteArray595 = new byte[18002];
        aByteArrayArray596 = new byte[6][258];
        anIntArrayArray597 = new int[6][258];
        anIntArrayArray598 = new int[6][258];
        anIntArrayArray599 = new int[6][258];
        anIntArray600 = new int[6];
    }

    final int anInt554 = 4096;
    final int anInt555 = 16;
    final int anInt556 = 258;
    final int anInt557 = 23;
    final int anInt558 = 1;
    final int anInt559 = 6;
    final int anInt560 = 50;
    final int anInt561 = 4;
    final int anInt562 = 18002;
    byte strm_in[];
    int strm_next_in;
    int strm_avail_in;
    int strm_total_in_lo32;
    int strm_total_in_hi32;
    byte strm_out[];
    int strm_next_out;
    int strm_avail_out;
    int strm_total_out_lo32;
    int strm_total_out_hi32;
    byte state_out_ch;
    int state_out_len;
    boolean blockRandomised;
    int bsBuff;
    int bsLive;
    int anInt578;
    int currBlockNo;
    int anInt580;
    int tPos;
    int k0;
    int anIntArray583[];
    int nblock_used;
    int anIntArray585[];
    int anIntArray586[];
    public static int tt[];
    int anInt588;
    boolean aBooleanArray589[];
    boolean aBooleanArray590[];
    byte aByteArray591[];
    byte aByteArray592[];
    int anIntArray593[];
    byte aByteArray594[];
    byte aByteArray595[];
    byte aByteArrayArray596[][];
    int anIntArrayArray597[][];
    int anIntArrayArray598[][];
    int anIntArrayArray599[][];
    int anIntArray600[];
    int anInt601;
}
