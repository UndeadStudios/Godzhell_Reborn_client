final class Player extends Class30_Sub2_Sub4_Sub1 {
    int anInt1707;
    int anInt1708;
    int anInt1709;
    int anInt1711;
    int anInt1712;
    int anInt1713;
    int anInt1719;
    int anInt1720;
    int anInt1721;
    int anInt1722;
    private boolean aBoolean1716 = true;
    Model aModel_1714;
    int gender;
    int headIcon;
    int skullIcon;
    Class5 aClass5_1698;
    int team;
    String name;
    int combatLevel;
    int title;
    boolean aBoolean1710 = false;
    long aLong1718;
    long aLong1697 = -1L;
    private int anInt1715 = 9;
    boolean aBoolean1699 = false;
    int[] anIntArray1700 = new int[5];
    int[] anIntArray1717 = new int[12];
    static Class12 aClass12_1704 = new Class12(false, 260);

    public final Model method444(int i) {
        if(i != 4016) {
            this.aBoolean1716 = !this.aBoolean1716;
        }

        if(!this.aBoolean1710) {
            return null;
        } else {
            Model model = this.method452(0);
            if(model == null) {
                return null;
            } else {
                super.anInt1507 = model.anInt1426;
                model.aBoolean1659 = true;
                if(this.aBoolean1699) {
                    return model;
                } else {
                    if(super.anInt1520 != -1 && super.anInt1521 != -1) {
                        Class23 model_1 = Class23.aClass23Array403[super.anInt1520];
                        Model aclass30_sub2_sub4_sub6 = model_1.method266();
                        if(aclass30_sub2_sub4_sub6 != null) {
                            Model model_3 = new Model(9, true, Class36.method532(super.anInt1521, false), false, aclass30_sub2_sub4_sub6);
                            model_3.method475(0, -super.anInt1524, 16384, 0);
                            model_3.method469((byte)-71);
                            model_3.method470(model_1.aClass20_407.anIntArray353[super.anInt1521], '\u9e5e');
                            model_3.anIntArrayArray1658 = (int[][])null;
                            model_3.anIntArrayArray1657 = (int[][])null;
                            if(model_1.anInt410 != 128 || model_1.anInt411 != 128) {
                                model_3.method478(model_1.anInt410, model_1.anInt410, this.anInt1715, model_1.anInt411);
                            }

                            model_3.method479(64 + model_1.anInt413, 850 + model_1.anInt414, -30, -50, -30, true);
                            Model[] aclass30_sub2_sub4_sub6_1 = new Model[]{model, model_3};
                            model = new Model(2, -819, true, aclass30_sub2_sub4_sub6_1);
                        }
                    }

                    if(this.aModel_1714 != null) {
                        if(client.loopCycle >= this.anInt1708) {
                            this.aModel_1714 = null;
                        }

                        if(client.loopCycle >= this.anInt1707 && client.loopCycle < this.anInt1708) {
                            Model model_11 = this.aModel_1714;
                            model_11.method475(this.anInt1711 - super.anInt1550, this.anInt1712 - this.anInt1709, 16384, this.anInt1713 - super.anInt1551);
                            if(super.anInt1510 == 512) {
                                model_11.method473(360);
                                model_11.method473(360);
                                model_11.method473(360);
                            } else if(super.anInt1510 == 1024) {
                                model_11.method473(360);
                                model_11.method473(360);
                            } else if(super.anInt1510 == 1536) {
                                model_11.method473(360);
                            }

                            Model[] aclass30_sub2_sub4_sub61 = new Model[]{model, model_11};
                            model = new Model(2, -819, true, aclass30_sub2_sub4_sub61);
                            if(super.anInt1510 == 512) {
                                model_11.method473(360);
                            } else if(super.anInt1510 == 1024) {
                                model_11.method473(360);
                                model_11.method473(360);
                            } else if(super.anInt1510 == 1536) {
                                model_11.method473(360);
                                model_11.method473(360);
                                model_11.method473(360);
                            }

                            model_11.method475(super.anInt1550 - this.anInt1711, this.anInt1709 - this.anInt1712, 16384, super.anInt1551 - this.anInt1713);
                        }
                    }

                    model.aBoolean1659 = true;
                    return model;
                }
            }
        }
    }

    public final void method451(int i, Stream stream) {
        stream.currentPosition = 0;
        this.gender = stream.readUnsignedByte();
        this.headIcon = stream.readUnsignedByte();
        this.skullIcon = stream.readUnsignedByte();
        if(i == 0) {
            this.aClass5_1698 = null;
            this.team = 0;

            int i2;
            int j1;
            for(i2 = 0; i2 < 12; ++i2) {
                j1 = stream.readUnsignedByte();
                if(j1 == 0) {
                    this.anIntArray1717[i2] = 0;
                } else {
                    int i1 = stream.readUnsignedByte();
                    this.anIntArray1717[i2] = (j1 << 8) + i1;
                    if(i2 == 0 && this.anIntArray1717[0] == '\uffff') {
                        this.aClass5_1698 = Class5.method159(stream.readUnsignedShort());
                        break;
                    }

                    if(this.anIntArray1717[i2] >= '\u8000' && this.anIntArray1717[i2] - '\u8000' < ItemDefinition.anInt203) {
                        int l1 = ItemDefinition.method198(this.anIntArray1717[i2] - '\u8000').anInt202;
                        if(l1 != 0) {
                            this.team = l1;
                        }
                    }
                }
            }

            for(i2 = 0; i2 < 5; ++i2) {
                j1 = stream.readUnsignedShort();
                if(client.anIntArrayArray1003.length < 1 || j1 < 0 || j1 >= client.anIntArrayArray1003[i2].length) {
                    j1 = 0;
                }

                this.anIntArray1700[i2] = j1;
            }

            super.anInt1511 = stream.readUnsignedShort();
            if(super.anInt1511 == '\uffff') {
                super.anInt1511 = -1;
            }

            super.anInt1512 = stream.readUnsignedShort();
            if(super.anInt1512 == '\uffff') {
                super.anInt1512 = -1;
            }

            super.anInt1554 = stream.readUnsignedShort();
            if(super.anInt1554 == '\uffff') {
                super.anInt1554 = -1;
            }

            super.anInt1555 = stream.readUnsignedShort();
            if(super.anInt1555 == '\uffff') {
                super.anInt1555 = -1;
            }

            super.anInt1556 = stream.readUnsignedShort();
            if(super.anInt1556 == '\uffff') {
                super.anInt1556 = -1;
            }

            super.anInt1557 = stream.readUnsignedShort();
            if(super.anInt1557 == '\uffff') {
                super.anInt1557 = -1;
            }

            super.anInt1505 = stream.readUnsignedShort();
            if(super.anInt1505 == '\uffff') {
                super.anInt1505 = -1;
            }

            this.name = TextClass.fixName(TextClass.nameForLong(stream.readQWord(-35089)));
            this.combatLevel = stream.readUnsignedByte();
            this.title = stream.readUnsignedShort();
            this.aBoolean1710 = true;
            this.aLong1718 = 0L;

            for(i2 = 0; i2 < 12; ++i2) {
                this.aLong1718 <<= 4;
                if(this.anIntArray1717[i2] >= 364) {
                    this.aLong1718 += (long)(this.anIntArray1717[i2] - 364);
                }
            }

            if(this.anIntArray1717[0] >= 364) {
                this.aLong1718 += (long)(this.anIntArray1717[0] - 364 >> 4);
            }

            if(this.anIntArray1717[1] >= 364) {
                this.aLong1718 += (long)(this.anIntArray1717[1] - 364 >> 8);
            }

            for(i2 = 0; i2 < 5; ++i2) {
                this.aLong1718 <<= 3;
                this.aLong1718 += (long)this.anIntArray1700[i2];
            }

            this.aLong1718 <<= 1;
            this.aLong1718 += (long)this.gender;
        }
    }

    public final Model method452(int i) {
        if(this.aClass5_1698 != null) {
            int var14 = -1;
            if(super.anInt1526 >= 0 && super.anInt1529 == 0) {
                var14 = Class20.aClass20Array351[super.anInt1526].anIntArray353[super.anInt1527];
            } else if(super.anInt1517 >= 0) {
                var14 = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
            }

            Model model = this.aClass5_1698.method164(0, -1, var14, (int[])null);
            return model;
        } else {
            long l = this.aLong1718;
            int k = -1;
            int i1 = -1;
            int j1 = -1;
            int k1 = -1;
            if(super.anInt1526 >= 0 && super.anInt1529 == 0) {
                Class20 model_1 = Class20.aClass20Array351[super.anInt1526];
                k = model_1.anIntArray353[super.anInt1527];
                if(super.anInt1517 >= 0 && super.anInt1517 != super.anInt1511) {
                    i1 = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
                }

                if(model_1.leftHandItem >= 0) {
                    j1 = model_1.leftHandItem + '\u8000';
                    l += (long)(j1 - (this.anIntArray1717[5] << 8));
                }

                if(model_1.rightHandItem >= 0) {
                    k1 = model_1.rightHandItem + '\u8000';
                    l += (long)(k1 - (this.anIntArray1717[3] << 16));
                }
            } else if(super.anInt1517 >= 0) {
                k = Class20.aClass20Array351[super.anInt1517].anIntArray353[super.anInt1518];
            }

            Model var15 = (Model)aClass12_1704.method222(l);
            if(i != 0) {
                for(int class30_sub2_sub4_sub6_2 = 1; class30_sub2_sub4_sub6_2 > 0; ++class30_sub2_sub4_sub6_2) {
                    ;
                }
            }

            int j2;
            int j3;
            if(var15 == null) {
                boolean var16 = false;

                for(j2 = 0; j2 < 12; ++j2) {
                    j3 = this.anIntArray1717[j2];
                    if(k1 >= 0 && j2 == 3) {
                        j3 = k1;
                    }

                    if(j1 >= 0 && j2 == 5) {
                        j3 = j1;
                    }

                    if(j3 >= 364 && j3 < '\u8000' && !Class38.aClass38Array656[j3 - 364].method537((byte)2)) {
                        var16 = true;
                    }

                    if(j3 >= '\u8000' && !ItemDefinition.method198(j3 - '\u8000').method195('\u9fc7', this.gender)) {
                        var16 = true;
                    }
                }

                if(var16) {
                    if(this.aLong1697 != -1L) {
                        var15 = (Model)aClass12_1704.method222(this.aLong1697);
                    }

                    if(var15 == null) {
                        return null;
                    }
                }
            }

            if(var15 == null) {
                Model[] var17 = new Model[12];
                j2 = 0;

                for(j3 = 0; j3 < 12; ++j3) {
                    int i3 = this.anIntArray1717[j3];
                    if(k1 >= 0 && j3 == 3) {
                        i3 = k1;
                    }

                    if(j1 >= 0 && j3 == 5) {
                        i3 = j1;
                    }

                    Model class30_sub2_sub4_sub6_4;
                    if(i3 >= 364 && i3 < '\u8000') {
                        class30_sub2_sub4_sub6_4 = Class38.aClass38Array656[i3 - 364].method538(false);
                        if(class30_sub2_sub4_sub6_4 != null) {
                            var17[j2++] = class30_sub2_sub4_sub6_4;
                        }
                    }

                    if(i3 >= '\u8000') {
                        class30_sub2_sub4_sub6_4 = ItemDefinition.method198(i3 - '\u8000').method196(false, this.gender);
                        if(class30_sub2_sub4_sub6_4 != null) {
                            var17[j2++] = class30_sub2_sub4_sub6_4;
                        }
                    }
                }

                var15 = new Model(j2, var17, -38);

                for(j3 = 0; j3 < 5; ++j3) {
                    if(this.anIntArray1700[j3] != 0) {
                        var15.method476(client.anIntArrayArray1003[j3][0], client.anIntArrayArray1003[j3][this.anIntArray1700[j3]]);
                        if(j3 == 1) {
                            var15.method476(client.anIntArray1204[0], client.anIntArray1204[this.anIntArray1700[j3]]);
                        }
                    }
                }

                var15.method469((byte)-71);
                var15.method479(64, 850, -30, -50, -30, true);
                aClass12_1704.method223(var15, l, (byte)2);
                this.aLong1697 = l;
            }

            if(this.aBoolean1699) {
                return var15;
            } else {
                Model var18 = Model.aModel_1621;
                var18.method464(7, var15, Class36.method532(k, false) & Class36.method532(i1, false));
                if(k != -1 && i1 != -1) {
                    var18.method471(-20491, Class20.aClass20Array351[super.anInt1526].anIntArray357, i1, k);
                } else if(k != -1) {
                    var18.method470(k, '\u9e5e');
                }

                var18.method466(false);
                var18.anIntArrayArray1658 = (int[][])null;
                var18.anIntArrayArray1657 = (int[][])null;
                return var18;
            }
        }
    }

    public final boolean method449(boolean flag) {
        if(!flag) {
            throw new NullPointerException();
        } else {
            return this.aBoolean1710;
        }
    }

    public final Model method453(byte byte0) {
        if(byte0 != -41) {
            this.anInt1715 = 132;
        }

        if(!this.aBoolean1710) {
            return null;
        } else if(this.aClass5_1698 != null) {
            return this.aClass5_1698.method160(true);
        } else {
            boolean flag = false;

            int k;
            for(int aclass30_sub2_sub4_sub6 = 0; aclass30_sub2_sub4_sub6 < 12; ++aclass30_sub2_sub4_sub6) {
                k = this.anIntArray1717[aclass30_sub2_sub4_sub6];
                if(k >= 364 && k < '\u8000' && !Class38.aClass38Array656[k - 364].method539(false)) {
                    flag = true;
                }

                if(k >= '\u8000' && !ItemDefinition.method198(k - '\u8000').method192(-2836, this.gender)) {
                    flag = true;
                }
            }

            if(flag) {
                return null;
            } else {
                Model[] var8 = new Model[12];
                k = 0;

                int j1;
                for(int model = 0; model < 12; ++model) {
                    j1 = this.anIntArray1717[model];
                    Model class30_sub2_sub4_sub6_2;
                    if(j1 >= 364 && j1 < '\u8000') {
                        class30_sub2_sub4_sub6_2 = Class38.aClass38Array656[j1 - 364].method540(0);
                        if(class30_sub2_sub4_sub6_2 != null) {
                            var8[k++] = class30_sub2_sub4_sub6_2;
                        }
                    }

                    if(j1 >= '\u8000') {
                        class30_sub2_sub4_sub6_2 = ItemDefinition.method198(j1 - '\u8000').method194(-705, this.gender);
                        if(class30_sub2_sub4_sub6_2 != null) {
                            var8[k++] = class30_sub2_sub4_sub6_2;
                        }
                    }
                }

                Model var9 = new Model(k, var8, -38);

                for(j1 = 0; j1 < 5; ++j1) {
                    if(this.anIntArray1700[j1] != 0) {
                        var9.method476(client.anIntArrayArray1003[j1][0], client.anIntArrayArray1003[j1][this.anIntArray1700[j1]]);
                        if(j1 == 1) {
                            var9.method476(client.anIntArray1204[0], client.anIntArray1204[this.anIntArray1700[j1]]);
                        }
                    }
                }

                return var9;
            }
        }
    }
}
