package mtuci.programm.mtuci_position.Model;

public class ModelTableInfrastract extends Model{
    private final String c1;
    private final String c2;
    private final String c3;
    private final String c4;
    private final String c5;
    private final String c6;
    private final String c7;
    private final String c8;

    public ModelTableInfrastract(String c1, String c2, String c3, String c4, String c5, String c6, String c7, String c8) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.c5 = c5;
        this.c6 = c6;
        this.c7 = c7;
        this.c8 = c8;
    }

    public String getC8() {
        return c8;
    }

    public String getC1() {
        return c1;
    }

    public String getC2() {
        return c2;
    }

    public String getC3() {
        return c3;
    }

    public String getC4() {
        return c4;
    }

    public String getC5() {
        return c5;
    }

    public String getC6() {
        return c6;
    }

    public String getC7() {
        return c7;
    }
}
