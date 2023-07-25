package com.xidian.edu.entity;

import java.util.Objects;

/**
 * @author ljz990305
 * @create 2023-07-24 22:29
 */
public class StaticFeatureEntity {
    private int noBasicBlock;
    private int nobasicBlockSingleSocc;
    private int nobasicBlock2Socc;
    private int noBasicBlockSoccMore;
    private int noBasicBlockPred;
    private int noBasicBlock2Pred;
    private int noBasicBlockPredMore;
    private int ft8;
    private int ft9;
    private int ft10;
    private int ft11;
    private int ft12;
    private int ft13;
    private int ft14;
    private int ft15;
    private int ft16;
    private int ft17;
    private int ft19;
    private int ft20;
    private int ft21;
    private int ft22;
    private int ft23;
    private int ft24;
    private int ft25;
    private int ft26;
    private int ft27;
    private int ft28;
    private int ft29;
    private int ft30;
    private int ft31;
    private int ft33;
    private int ft34;
    private int ft35;
    private int ft36;
    private int ft37;
    private int ft38;
    private int ft39;
    private int ft40;
    private int ft41;
    private int ft42;
    private int ft43;
    private int ft44;
    private int ft45;
    private int ft46;
    private int ft47;
    private int ft48;
    private int ft49;
    private int ft50;
    private int ft51;
    private int ft52;
    private int ft53;
    private int ft54;
    private int ft55;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaticFeatureEntity that = (StaticFeatureEntity) o;
        return noBasicBlock == that.noBasicBlock &&
                nobasicBlockSingleSocc == that.nobasicBlockSingleSocc &&
                nobasicBlock2Socc == that.nobasicBlock2Socc &&
                noBasicBlockSoccMore == that.noBasicBlockSoccMore &&
                noBasicBlockPred == that.noBasicBlockPred &&
                noBasicBlock2Pred == that.noBasicBlock2Pred &&
                noBasicBlockPredMore == that.noBasicBlockPredMore &&
                ft8 == that.ft8 &&
                ft9 == that.ft9 &&
                ft10 == that.ft10 &&
                ft11 == that.ft11 &&
                ft12 == that.ft12 &&
                ft13 == that.ft13 &&
                ft14 == that.ft14 &&
                ft15 == that.ft15 &&
                ft16 == that.ft16 &&
                ft17 == that.ft17 &&
                ft19 == that.ft19 &&
                ft20 == that.ft20 &&
                ft21 == that.ft21 &&
                ft22 == that.ft22 &&
                ft23 == that.ft23 &&
                ft24 == that.ft24 &&
                ft25 == that.ft25 &&
                ft26 == that.ft26 &&
                ft27 == that.ft27 &&
                ft28 == that.ft28 &&
                ft29 == that.ft29 &&
                ft30 == that.ft30 &&
                ft31 == that.ft31 &&
                ft33 == that.ft33 &&
                ft34 == that.ft34 &&
                ft35 == that.ft35 &&
                ft36 == that.ft36 &&
                ft37 == that.ft37 &&
                ft38 == that.ft38 &&
                ft39 == that.ft39 &&
                ft40 == that.ft40 &&
                ft41 == that.ft41 &&
                ft42 == that.ft42 &&
                ft43 == that.ft43 &&
                ft44 == that.ft44 &&
                ft45 == that.ft45 &&
                ft46 == that.ft46 &&
                ft47 == that.ft47 &&
                ft48 == that.ft48 &&
                ft49 == that.ft49 &&
                ft50 == that.ft50 &&
                ft51 == that.ft51 &&
                ft52 == that.ft52 &&
                ft53 == that.ft53 &&
                ft54 == that.ft54 &&
                ft55 == that.ft55;
    }

    @Override
    public int hashCode() {
        return Objects.hash(noBasicBlock, nobasicBlockSingleSocc, nobasicBlock2Socc, noBasicBlockSoccMore, noBasicBlockPred, noBasicBlock2Pred, noBasicBlockPredMore, ft8, ft9, ft10, ft11, ft12, ft13, ft14, ft15, ft16, ft17, ft19, ft20, ft21, ft22, ft23, ft24, ft25, ft26, ft27, ft28, ft29, ft30, ft31, ft33, ft34, ft35, ft36, ft37, ft38, ft39, ft40, ft41, ft42, ft43, ft44, ft45, ft46, ft47, ft48, ft49, ft50, ft51, ft52, ft53, ft54, ft55);
    }

    @Override
    public String toString() {
        return "StaticFeature{" +
                "noBasicBlock=" + noBasicBlock +
                ", nobasicBlockSingleSocc=" + nobasicBlockSingleSocc +
                ", nobasicBlock2Socc=" + nobasicBlock2Socc +
                ", noBasicBlockSoccMore=" + noBasicBlockSoccMore +
                ", noBasicBlockPred=" + noBasicBlockPred +
                ", noBasicBlock2Pred=" + noBasicBlock2Pred +
                ", noBasicBlockPredMore=" + noBasicBlockPredMore +
                ", ft8=" + ft8 +
                ", ft9=" + ft9 +
                ", ft10=" + ft10 +
                ", ft11=" + ft11 +
                ", ft12=" + ft12 +
                ", ft13=" + ft13 +
                ", ft14=" + ft14 +
                ", ft15=" + ft15 +
                ", ft16=" + ft16 +
                ", ft17=" + ft17 +
                ", ft19=" + ft19 +
                ", ft20=" + ft20 +
                ", ft21=" + ft21 +
                ", ft22=" + ft22 +
                ", ft23=" + ft23 +
                ", ft24=" + ft24 +
                ", ft25=" + ft25 +
                ", ft26=" + ft26 +
                ", ft27=" + ft27 +
                ", ft28=" + ft28 +
                ", ft29=" + ft29 +
                ", ft30=" + ft30 +
                ", ft31=" + ft31 +
                ", ft33=" + ft33 +
                ", ft34=" + ft34 +
                ", ft35=" + ft35 +
                ", ft36=" + ft36 +
                ", ft37=" + ft37 +
                ", ft38=" + ft38 +
                ", ft39=" + ft39 +
                ", ft40=" + ft40 +
                ", ft41=" + ft41 +
                ", ft42=" + ft42 +
                ", ft43=" + ft43 +
                ", ft44=" + ft44 +
                ", ft45=" + ft45 +
                ", ft46=" + ft46 +
                ", ft47=" + ft47 +
                ", ft48=" + ft48 +
                ", ft49=" + ft49 +
                ", ft50=" + ft50 +
                ", ft51=" + ft51 +
                ", ft52=" + ft52 +
                ", ft53=" + ft53 +
                ", ft54=" + ft54 +
                ", ft55=" + ft55 +
                '}';
    }

    public int getNoBasicBlock() {
        return noBasicBlock;
    }

    public void setNoBasicBlock(int noBasicBlock) {
        this.noBasicBlock = noBasicBlock;
    }

    public int getNobasicBlockSingleSocc() {
        return nobasicBlockSingleSocc;
    }

    public void setNobasicBlockSingleSocc(int nobasicBlockSingleSocc) {
        this.nobasicBlockSingleSocc = nobasicBlockSingleSocc;
    }

    public int getNobasicBlock2Socc() {
        return nobasicBlock2Socc;
    }

    public void setNobasicBlock2Socc(int nobasicBlock2Socc) {
        this.nobasicBlock2Socc = nobasicBlock2Socc;
    }

    public int getNoBasicBlockSoccMore() {
        return noBasicBlockSoccMore;
    }

    public void setNoBasicBlockSoccMore(int noBasicBlockSoccMore) {
        this.noBasicBlockSoccMore = noBasicBlockSoccMore;
    }

    public int getNoBasicBlockPred() {
        return noBasicBlockPred;
    }

    public void setNoBasicBlockPred(int noBasicBlockPred) {
        this.noBasicBlockPred = noBasicBlockPred;
    }

    public int getNoBasicBlock2Pred() {
        return noBasicBlock2Pred;
    }

    public void setNoBasicBlock2Pred(int noBasicBlock2Pred) {
        this.noBasicBlock2Pred = noBasicBlock2Pred;
    }

    public int getNoBasicBlockPredMore() {
        return noBasicBlockPredMore;
    }

    public void setNoBasicBlockPredMore(int noBasicBlockPredMore) {
        this.noBasicBlockPredMore = noBasicBlockPredMore;
    }

    public int getFt8() {
        return ft8;
    }

    public void setFt8(int ft8) {
        this.ft8 = ft8;
    }

    public int getFt9() {
        return ft9;
    }

    public void setFt9(int ft9) {
        this.ft9 = ft9;
    }

    public int getFt10() {
        return ft10;
    }

    public void setFt10(int ft10) {
        this.ft10 = ft10;
    }

    public int getFt11() {
        return ft11;
    }

    public void setFt11(int ft11) {
        this.ft11 = ft11;
    }

    public int getFt12() {
        return ft12;
    }

    public void setFt12(int ft12) {
        this.ft12 = ft12;
    }

    public int getFt13() {
        return ft13;
    }

    public void setFt13(int ft13) {
        this.ft13 = ft13;
    }

    public int getFt14() {
        return ft14;
    }

    public void setFt14(int ft14) {
        this.ft14 = ft14;
    }

    public int getFt15() {
        return ft15;
    }

    public void setFt15(int ft15) {
        this.ft15 = ft15;
    }

    public int getFt16() {
        return ft16;
    }

    public void setFt16(int ft16) {
        this.ft16 = ft16;
    }

    public int getFt17() {
        return ft17;
    }

    public void setFt17(int ft17) {
        this.ft17 = ft17;
    }

    public int getFt19() {
        return ft19;
    }

    public void setFt19(int ft19) {
        this.ft19 = ft19;
    }

    public int getFt20() {
        return ft20;
    }

    public void setFt20(int ft20) {
        this.ft20 = ft20;
    }

    public int getFt21() {
        return ft21;
    }

    public void setFt21(int ft21) {
        this.ft21 = ft21;
    }

    public int getFt22() {
        return ft22;
    }

    public void setFt22(int ft22) {
        this.ft22 = ft22;
    }

    public int getFt23() {
        return ft23;
    }

    public void setFt23(int ft23) {
        this.ft23 = ft23;
    }

    public int getFt24() {
        return ft24;
    }

    public void setFt24(int ft24) {
        this.ft24 = ft24;
    }

    public int getFt25() {
        return ft25;
    }

    public void setFt25(int ft25) {
        this.ft25 = ft25;
    }

    public int getFt26() {
        return ft26;
    }

    public void setFt26(int ft26) {
        this.ft26 = ft26;
    }

    public int getFt27() {
        return ft27;
    }

    public void setFt27(int ft27) {
        this.ft27 = ft27;
    }

    public int getFt28() {
        return ft28;
    }

    public void setFt28(int ft28) {
        this.ft28 = ft28;
    }

    public int getFt29() {
        return ft29;
    }

    public void setFt29(int ft29) {
        this.ft29 = ft29;
    }

    public int getFt30() {
        return ft30;
    }

    public void setFt30(int ft30) {
        this.ft30 = ft30;
    }

    public int getFt31() {
        return ft31;
    }

    public void setFt31(int ft31) {
        this.ft31 = ft31;
    }

    public int getFt33() {
        return ft33;
    }

    public void setFt33(int ft33) {
        this.ft33 = ft33;
    }

    public int getFt34() {
        return ft34;
    }

    public void setFt34(int ft34) {
        this.ft34 = ft34;
    }

    public int getFt35() {
        return ft35;
    }

    public void setFt35(int ft35) {
        this.ft35 = ft35;
    }

    public int getFt36() {
        return ft36;
    }

    public void setFt36(int ft36) {
        this.ft36 = ft36;
    }

    public int getFt37() {
        return ft37;
    }

    public void setFt37(int ft37) {
        this.ft37 = ft37;
    }

    public int getFt38() {
        return ft38;
    }

    public void setFt38(int ft38) {
        this.ft38 = ft38;
    }

    public int getFt39() {
        return ft39;
    }

    public void setFt39(int ft39) {
        this.ft39 = ft39;
    }

    public int getFt40() {
        return ft40;
    }

    public void setFt40(int ft40) {
        this.ft40 = ft40;
    }

    public int getFt41() {
        return ft41;
    }

    public void setFt41(int ft41) {
        this.ft41 = ft41;
    }

    public int getFt42() {
        return ft42;
    }

    public void setFt42(int ft42) {
        this.ft42 = ft42;
    }

    public int getFt43() {
        return ft43;
    }

    public void setFt43(int ft43) {
        this.ft43 = ft43;
    }

    public int getFt44() {
        return ft44;
    }

    public void setFt44(int ft44) {
        this.ft44 = ft44;
    }

    public int getFt45() {
        return ft45;
    }

    public void setFt45(int ft45) {
        this.ft45 = ft45;
    }

    public int getFt46() {
        return ft46;
    }

    public void setFt46(int ft46) {
        this.ft46 = ft46;
    }

    public int getFt47() {
        return ft47;
    }

    public void setFt47(int ft47) {
        this.ft47 = ft47;
    }

    public int getFt48() {
        return ft48;
    }

    public void setFt48(int ft48) {
        this.ft48 = ft48;
    }

    public int getFt49() {
        return ft49;
    }

    public void setFt49(int ft49) {
        this.ft49 = ft49;
    }

    public int getFt50() {
        return ft50;
    }

    public void setFt50(int ft50) {
        this.ft50 = ft50;
    }

    public int getFt51() {
        return ft51;
    }

    public void setFt51(int ft51) {
        this.ft51 = ft51;
    }

    public int getFt52() {
        return ft52;
    }

    public void setFt52(int ft52) {
        this.ft52 = ft52;
    }

    public int getFt53() {
        return ft53;
    }

    public void setFt53(int ft53) {
        this.ft53 = ft53;
    }

    public int getFt54() {
        return ft54;
    }

    public void setFt54(int ft54) {
        this.ft54 = ft54;
    }

    public int getFt55() {
        return ft55;
    }

    public void setFt55(int ft55) {
        this.ft55 = ft55;
    }
}
