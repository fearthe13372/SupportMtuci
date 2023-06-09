package mtuci.programm.mtuci_position.Model;

public class ModelTablePersonel extends Model{
    private final String a1;
    private final String a2;
    private final String a3;
    private final String a4;
    private final String a5;

    public ModelTablePersonel(String a1, String a2, String a3, String a4, String a5) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
        this.a5 = a5;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }

    public String getA4() {
        return a4;
    }

    public String getA5() {
        return a5;
    }
}
