package mtuci.programm.mtuci_position.Model;

public class ModelTableEducActiv extends Model{
    private final Double f1;
    private final Double f2;
    private final Double f3;
    private final Double f4;
    private final Double f5;
    private final Double f6;
    private final Double f7;
    private final Double f8;
    private final Double f9;
    private final Double f10;
    private final Double f11;
    private final Double f12;
    private final Double f13;
    private final Double f14;
    private final Double f15;

    public ModelTableEducActiv(String f1, String f2, String f3, String f4, String f5, String f6, String f7, String f8, String f9, String f10, String f11, String f12, String f13, String f14, String f15) {
        this.f1 = Double.parseDouble(f1.replace(',','.')) ;
        this.f2 = Double.parseDouble(f2.replace(',','.')) ;
        this.f3 = Double.parseDouble(f3.replace(',','.')) ;
        this.f4 = Double.parseDouble(f4.replace(',','.')) ;
        this.f5 = Double.parseDouble(f5.replace(',','.')) ;
        this.f6 = Double.parseDouble(f6.replace(',','.')) ;
        this.f7 = Double.parseDouble(f7.replace(',','.')) ;
        this.f8 = Double.parseDouble(f8.replace(',','.')) ;
        this.f9 = Double.parseDouble(f9.replace(',','.')) ;
        this.f10 = Double.parseDouble(f10.replace(',','.')) ;
        this.f11 = Double.parseDouble(f11.replace(',','.')) ;
        this.f12 = Double.parseDouble(f12.replace(',','.')) ;
        this.f13 = Double.parseDouble(f13.replace(',','.')) ;
        this.f14 = Double.parseDouble(f14.replace(',','.')) ;
        this.f15 = Double.parseDouble(f15.replace(',','.')) ;
    }

    public Double getF1() {
        return f1;
    }

    public Double getF2() {
        return f2;
    }

    public Double getF3() {
        return f3;
    }

    public Double getF4() {
        return f4;
    }

    public Double getF5() {
        return f5;
    }

    public Double getF6() {
        return f6;
    }

    public Double getF7() {
        return f7;
    }

    public Double getF8() {
        return f8;
    }

    public Double getF9() {
        return f9;
    }

    public Double getF10() {
        return f10;
    }

    public Double getF11() {
        return f11;
    }

    public Double getF12() {
        return f12;
    }

    public Double getF13() {
        return f13;
    }

    public Double getF14() {
        return f14;
    }

    public Double getF15() {
        return f15;
    }
}
