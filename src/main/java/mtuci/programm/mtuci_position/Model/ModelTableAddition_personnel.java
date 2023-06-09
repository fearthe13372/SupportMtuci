package mtuci.programm.mtuci_position.Model;

public class ModelTableAddition_personnel extends Model{
    private final String totalNumberEmployees;
    private final String TotalNumberTeaching;
    private final String TotalNumberResearchers;
    private final String PercentageTeachingStaff;
    private final String researchersWithAcademic;
    private final String PercentageTeachingStaffThan65Years;
    private final String PercentageTeachingStaffThan40Years;
    private final String AverageSalaryTeaching;
    private final String AverageSalaryResearchers;

    public ModelTableAddition_personnel(String totalNumberEmployees, String totalNumberTeaching, String totalNumberResearchers, String percentageTeachingStaff, String researchersWithAcademic, String percentageTeachingStaffThan65Years, String percentageTeachingStaffThan40Years, String averageSalaryTeaching, String averageSalaryResearchers) {
        this.totalNumberEmployees = totalNumberEmployees;
        TotalNumberTeaching = totalNumberTeaching;
        TotalNumberResearchers = totalNumberResearchers;
        PercentageTeachingStaff = percentageTeachingStaff;
        this.researchersWithAcademic = researchersWithAcademic;
        PercentageTeachingStaffThan65Years = percentageTeachingStaffThan65Years;
        PercentageTeachingStaffThan40Years = percentageTeachingStaffThan40Years;
        AverageSalaryTeaching = averageSalaryTeaching;
        AverageSalaryResearchers = averageSalaryResearchers;
    }

    public String getTotalNumberEmployees() {
        return totalNumberEmployees;
    }

    public String getTotalNumberTeaching() {
        return TotalNumberTeaching;
    }

    public String getTotalNumberResearchers() {
        return TotalNumberResearchers;
    }

    public String getPercentageTeachingStaff() {
        return PercentageTeachingStaff;
    }

    public String getResearchersWithAcademic() {
        return researchersWithAcademic;
    }

    public String getPercentageTeachingStaffThan65Years() {
        return PercentageTeachingStaffThan65Years;
    }

    public String getPercentageTeachingStaffThan40Years() {
        return PercentageTeachingStaffThan40Years;
    }

    public String getAverageSalaryTeaching() {
        return AverageSalaryTeaching;
    }

    public String getAverageSalaryResearchers() {
        return AverageSalaryResearchers;
    }
}
