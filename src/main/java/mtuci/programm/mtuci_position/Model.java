package mtuci.programm.mtuci_position;

public class Model {

    private final String name;
    private final Double e1;
    private final Double e2;
    private final Double e3;
    private final Double e4;
    private final Double e5;
    private final Double e8;
    //private final String count;

    public Model(){
        this.name = null;
        this.e1 = null;
        this.e2 = null;
        this.e3 = null;
        this.e4 = null;
        this.e5 = null;
        this.e8 = null;
    }
    private int number;
    public Model(Integer number,String name, String e1, String e2, String e3, String e4, String e5, String e8) {

        this.number=number;
        this.name = name;
        this.e1 =Double.parseDouble(e1.replace(',','.')) ;
        this.e2 = Double.parseDouble(e2.replace(',','.'));
        this.e3 = Double.parseDouble(e3.replace(',','.'));
        this.e4 = Double.parseDouble(e4.replace(',','.'));
        this.e5 = Double.parseDouble(e5.replace(',','.'));
        this.e8 = Double.parseDouble(e8.replace(',','.'));
    }

    public String getName() {
        return name;
    }
    public Integer getNumber() {
        return number;
    }

    public Double getE1() {
        return e1;
    }

    public Double getE2() {
        return e2;
    }

    public Double getE3() {
        return e3;
    }

    public Double getE4() {
        return e4;
    }

    public Double getE5() {
        return e5;
    }

    public Double getE8() {
        return e8;
    }

}
