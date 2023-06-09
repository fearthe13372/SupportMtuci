package mtuci.programm.mtuci_position.Model;

public class ModelTableAddition_infrastructure extends Model{
    private final String TotalAreaBuildings;
    private final String AreaEducationalLaboratory;
    private final String AreaDesignatedResearch;
    private final String AreaDormitories;
    private final String AreaSports;
    private final String studentsNotProvidedHostel;
    private final String NumberPersonalComputers;
    private final String personalComputersWithInternet;
    private final String electronicLibrary;

    public ModelTableAddition_infrastructure(String totalAreaBuildings, String areaEducationalLaboratory, String areaDesignatedResearch, String areaDormitories, String areaSports, String studentsNotProvidedHostel, String numberPersonalComputers, String personalComputersWithInternet, String electronicLibrary) {
        TotalAreaBuildings = totalAreaBuildings;
        AreaEducationalLaboratory = areaEducationalLaboratory;
        AreaDesignatedResearch = areaDesignatedResearch;
        AreaDormitories = areaDormitories;
        AreaSports = areaSports;
        this.studentsNotProvidedHostel = studentsNotProvidedHostel;
        NumberPersonalComputers = numberPersonalComputers;
        this.personalComputersWithInternet = personalComputersWithInternet;
        this.electronicLibrary = electronicLibrary;
    }

    public String getTotalAreaBuildings() {
        return TotalAreaBuildings;
    }

    public String getAreaEducationalLaboratory() {
        return AreaEducationalLaboratory;
    }

    public String getAreaDesignatedResearch() {
        return AreaDesignatedResearch;
    }

    public String getAreaDormitories() {
        return AreaDormitories;
    }

    public String getAreaSports() {
        return AreaSports;
    }

    public String getStudentsNotProvidedHostel() {
        return studentsNotProvidedHostel;
    }

    public String getNumberPersonalComputers() {
        return NumberPersonalComputers;
    }

    public String getPersonalComputersWithInternet() {
        return personalComputersWithInternet;
    }

    public String getElectronicLibrary() {
        return electronicLibrary;
    }
}
