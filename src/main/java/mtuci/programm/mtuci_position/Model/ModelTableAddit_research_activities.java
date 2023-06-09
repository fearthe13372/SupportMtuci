package mtuci.programm.mtuci_position.Model;

public class ModelTableAddit_research_activities extends Model{
    private final String amountFundsReceived;
    private final String fundsPerformanceWorks;
    private final String totalNumberPublications;
    private final String NumberBusinessIncubators;
    private final String NumberTechnoparks;
    private final String NumberCentersScientific;
    private final String NumberSmallEnterprises;
    private final String NumberGraduateStudents;
    private final String PercentagePostgraduates;
    private final String numberDoctoral;
    private final String NumberDissertation;

    public ModelTableAddit_research_activities(String amountFundsReceived, String fundsPerformanceWorks, String totalNumberPublications, String numberBusinessIncubators, String numberTechnoparks, String numberCentersScientific, String numberSmallEnterprises, String numberGraduateStudents, String percentagePostgraduates, String numberDoctoral, String numberDissertation) {
        this.amountFundsReceived = amountFundsReceived;
        this.fundsPerformanceWorks = fundsPerformanceWorks;
        this.totalNumberPublications = totalNumberPublications;
        NumberBusinessIncubators = numberBusinessIncubators;
        NumberTechnoparks = numberTechnoparks;
        NumberCentersScientific = numberCentersScientific;
        NumberSmallEnterprises = numberSmallEnterprises;
        NumberGraduateStudents = numberGraduateStudents;
        PercentagePostgraduates = percentagePostgraduates;
        this.numberDoctoral = numberDoctoral;
        NumberDissertation = numberDissertation;
    }

    public String getAmountFundsReceived() {
        return amountFundsReceived;
    }

    public String getFundsPerformanceWorks() {
        return fundsPerformanceWorks;
    }

    public String getTotalNumberPublications() {
        return totalNumberPublications;
    }

    public String getNumberBusinessIncubators() {
        return NumberBusinessIncubators;
    }

    public String getNumberTechnoparks() {
        return NumberTechnoparks;
    }

    public String getNumberCentersScientific() {
        return NumberCentersScientific;
    }

    public String getNumberSmallEnterprises() {
        return NumberSmallEnterprises;
    }

    public String getNumberGraduateStudents() {
        return NumberGraduateStudents;
    }

    public String getPercentagePostgraduates() {
        return PercentagePostgraduates;
    }

    public String getNumberDoctoral() {
        return numberDoctoral;
    }

    public String getNumberDissertation() {
        return NumberDissertation;
    }
}
