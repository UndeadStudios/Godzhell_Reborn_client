class Class30_Sub2_Sub4_Sub1 extends Animable
{

    public final void method445(int i, int j, boolean flag, boolean flag1)
    {
        if(primaryanim != -1 && AnimationDefinition.anims[primaryanim].anInt364 == 1)
            primaryanim = -1;
        if(!flag)
        {
            int k = i - anIntArray1500[0];
            int l = j - anIntArray1501[0];
            if(k >= -8 && k <= 8 && l >= -8 && l <= 8)
            {
                if(waypoint_count < 9)
                    waypoint_count++;
                for(int i1 = waypoint_count; i1 > 0; i1--)
                {
                    anIntArray1500[i1] = anIntArray1500[i1 - 1];
                    anIntArray1501[i1] = anIntArray1501[i1 - 1];
                    aBooleanArray1553[i1] = aBooleanArray1553[i1 - 1];
                }

                anIntArray1500[0] = i;
                anIntArray1501[0] = j;
                aBooleanArray1553[0] = false;
                return;
            }
        }
        waypoint_count = 0;
        anim_delay = 0;
        anInt1503 = 0;
        anIntArray1500[0] = i;
        anIntArray1501[0] = j;
        anInt1550 = anIntArray1500[0] * 128 + anInt1540 * 64;
        if(flag1)
            anInt1536 = 42;
        anInt1551 = anIntArray1501[0] * 128 + anInt1540 * 64;
    }

    public final void method446(boolean flag)
    {
        if(!flag)
        {
            for(int i = 1; i > 0; i++);
        }
        waypoint_count = 0;
        anim_delay = 0;
    }

    public final void method447(int i, int j, int k, int l)
    {
        for(int i1 = 0; i1 < 4; i1++)
            if(anIntArray1516[i1] <= l)
            {
                anIntArray1514[i1] = k;
                anIntArray1515[i1] = j;
                anIntArray1516[i1] = l + 70;
                return;
            }

        if(i != anInt1509)
            aBoolean1508 = !aBoolean1508;
    }

    public final void method448(boolean flag, byte byte0, int i)
    {
        int j = anIntArray1500[0];
        int k = anIntArray1501[0];
        if(i == 0)
        {
            j--;
            k++;
        }
        if(i == 1)
            k++;
        if(i == 2)
        {
            j++;
            k++;
        }
        if(i == 3)
            j--;
        if(i == 4)
            j++;
        if(i == 5)
        {
            j--;
            k--;
        }
        if(i == 6)
            k--;
        if(i == 7)
        {
            j++;
            k--;
        }
        if(primaryanim != -1 && AnimationDefinition.anims[primaryanim].anInt364 == 1)
            primaryanim = -1;
        if(waypoint_count < 9)
            waypoint_count++;
        for(int l = waypoint_count; l > 0; l--)
        {
            anIntArray1500[l] = anIntArray1500[l - 1];
            anIntArray1501[l] = anIntArray1501[l - 1];
            aBooleanArray1553[l] = aBooleanArray1553[l - 1];
        }

        if(byte0 != 20)
        {
            return;
        } else
        {
            anIntArray1500[0] = j;
            anIntArray1501[0] = k;
            aBooleanArray1553[0] = flag;
            return;
        }
    }

    public boolean method449(boolean flag)
    {
        if(!flag)
        {
            for(int i = 1; i > 0; i++);
        }
        return false;
    }

    Class30_Sub2_Sub4_Sub1()
    {
        anIntArray1500 = new int[10];
        anIntArray1501 = new int[10];
        anInt1502 = -1;
        anInt1504 = 32;
        anInt1505 = -1;
        anInt1507 = 200;
        aBoolean1508 = false;
        anInt1509 = -35698;
        anInt1511 = -1;
        anInt1512 = -1;
        anIntArray1514 = new int[4];
        anIntArray1515 = new int[4];
        anIntArray1516 = new int[4];
        anInt1517 = -1;
        anInt1520 = -1;
        primaryanim = -1;
        anInt1532 = -1000;
        textCycle = 100;
        anInt1536 = -895;
        anInt1540 = 1;
        aBoolean1541 = false;
        aBooleanArray1553 = new boolean[10];
        anInt1554 = -1;
        anInt1555 = -1;
        anInt1556 = -1;
        anInt1557 = -1;
    }

    int anIntArray1500[];
    int anIntArray1501[];
    int anInt1502;
    int anInt1503;
    int anInt1504;
    int anInt1505;
    String aString1506;
    int anInt1507;
    private boolean aBoolean1508;
    private int anInt1509;
    int anInt1510;
    int anInt1511;
    int anInt1512;
    int anInt1513;
    int anIntArray1514[];
    int anIntArray1515[];
    int anIntArray1516[];
    int anInt1517;
    int anInt1518;
    int anInt1519;
    int anInt1520;
    int anInt1521;
    int anInt1522;
    int anInt1523;
    int anInt1524;
    int waypoint_count;
    int primaryanim;
    int primaryanim_frameindex;
    int primaryanim_loops_remaining;
    int primaryanim_pause;
    int primaryanim_replaycount;
    int anInt1531;
    int anInt1532;
    int anInt1533;
    int anInt1534;
    int textCycle;
    private int anInt1536;
    int anInt1537;
    int face_x;
    int face_y;
    int anInt1540;
    boolean aBoolean1541;
    int anim_delay;
    int anInt1543;
    int anInt1544;
    int anInt1545;
    int anInt1546;
    int anInt1547;
    int anInt1548;
    int anInt1549;
    int anInt1550;
    int anInt1551;
    int anInt1552;
    boolean aBooleanArray1553[];
    int anInt1554;
    int anInt1555;
    int anInt1556;
    int anInt1557;
}
