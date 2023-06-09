package mtuci.programm.mtuci_position.Model;

public class ModelTablePosition extends Model{
    private final String indicator;
    private final Double year2018;
    private final Double year2019;
    private final Double year2020;
    private final Double year2021;
    private final Double year2022;
    private final Double medialValueRF;
    private final Double medialSubject;
    private final Double medialDepartment;

    public ModelTablePosition(String indicator, String year2018, String year2019, String year2020, String year2021, String year2022, String medialValueRF, String medialSubject, String medialDepartment) {

        this.indicator = indicator.substring(0,4);
        this.year2018 = Double.parseDouble(year2018.replace(',','.')) ;
        this.year2019 = Double.parseDouble(year2019.replace(',','.')) ;
        this.year2020 = Double.parseDouble(year2020.replace(',','.')) ;
        this.year2021 = Double.parseDouble(year2021.replace(',','.')) ;
        this.year2022 = Double.parseDouble(year2022.replace(',','.')) ;
        this.medialValueRF = Double.parseDouble(medialValueRF.replace(',','.')) ;
        this.medialSubject = Double.parseDouble(medialSubject.replace(',','.')) ;
        this.medialDepartment = Double.parseDouble(medialDepartment.replace(',','.')) ;
    }
    public String getIndicator() {
        return indicator;
    }

    public Double getYear2018() {
        return year2018;
    }

    public Double getYear2019() {
        return year2019;
    }

    public Double getYear2020() {
        return year2020;
    }

    public Double getYear2021() {
        return year2021;
    }

    public Double getYear2022() {
        return year2022;
    }

    public Double getMedialValueRF() {
        return medialValueRF;
    }

    public Double getMedialSubject() {
        return medialSubject;
    }

    public Double getMedialDepartment() {
        return medialDepartment;
    }

}
