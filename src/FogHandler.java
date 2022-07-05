public class FogHandler {    
    /**
     * Grabs distance from player.
     */
    private float fogDistance;
    
    /**
     * Sets the fog color.
     */
    public static int setColor = 0x959698;
    
    /**
     * 
     * @param fogStartDistance
     * @param fogEndDistance
     * @param fogIntensity
     */
    public void renderFog(boolean belowGround, int fogStartDistance, int fogEndDistance, int fogIntensity) {
        getColor(setColor);
        int pos = Class30_Sub2_Sub1_Sub3.anIntArray1472[0];
        int src, dst, alpha;
        int fogBegin = (int) (fogStartDistance + fogDistance);
        int fogEnd = (int) (fogEndDistance + fogDistance);
        for (int y = 0; y < Class30_Sub2_Sub1.anInt1382; y++) {
            for (int x = 0; x < Class30_Sub2_Sub1.anInt1385; x++) {
                //if (Class30_Sub2_Sub1.depthBuffer[pos] >= fogEnd) {
                   // Class30_Sub2_Sub1.anIntArray1378[pos] = setColor;
                //} else if (Class30_Sub2_Sub1.depthBuffer[pos] >= fogBegin) {
                    alpha = (int)(Class30_Sub2_Sub1.depthBuffer[pos] - fogBegin) / fogIntensity;
                    src = ((setColor & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((setColor & 0xff00) * alpha >> 8 & 0xff00);
                    alpha = 256 - alpha;
                    dst = Class30_Sub2_Sub1.anIntArray1378[pos];
                    dst = ((dst & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((dst & 0xff00) * alpha >> 8 & 0xff00);
                    Class30_Sub2_Sub1.anIntArray1378[pos] = src + dst;
                }
                pos++;
            }
            pos += Class30_Sub2_Sub1.anInt1379 - Class30_Sub2_Sub1.anInt1385;
        }
   // }
    
    /**
     * 
     * @param fogDistance
     */
    public void setFogDistance(float fogDistance) {
        this.fogDistance = fogDistance;
    }
    
    /**
     * 
     * @param fogColor
     */
    public void getColor(int fogColor) {
        setColor = fogColor;
    }
}