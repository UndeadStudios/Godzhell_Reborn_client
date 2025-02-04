class BZip2FileEntry
{

    BZip2FileEntry()
    {
        unzftab = new int[256];
        cftab = new int[257];
        inUse = new boolean[256];
        inUse16 = new boolean[16];
        seqToUnseq = new byte[256];
        mtfa = new byte[4096];
        mtfbase = new int[16];
        selector = new byte[18002];
        selectorMtf = new byte[18002];
        len = new byte[6][258];
        limitt = new int[6][258];
        base = new int[6][258];
        perm = new int[6][258];
        minLens = new int[6];
    }

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
    int blockSize100k;
    int currBlockNo;
    int origPtr;
    int tPos;
    int k0;
    int unzftab[];
    int nblock_used;
    int cftab[];
    public static int tt[];
    int nInUse;
    boolean inUse[];
    boolean inUse16[];
    byte seqToUnseq[];
    byte mtfa[];
    int mtfbase[];
    byte selector[];
    byte selectorMtf[];
    byte len[][];
    int limitt[][];
    int base[][];
    int perm[][];
    int minLens[];
    int save_nblock;
}
