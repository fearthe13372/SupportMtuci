package mtuci.programm.mtuci_position.Model;

public class ModelTableFInance_and_Economic extends Model{
    private final String IncomeEducationalOrganization;
    private final String IncomeGeneratingActivities;
    private final String averageSalaryNPR;
    private final String incomOrganization;

    public ModelTableFInance_and_Economic(String incomeEducationalOrganization, String incomeGeneratingActivities, String averageSalaryNPR, String incomOrganization) {
        IncomeEducationalOrganization = incomeEducationalOrganization;
        IncomeGeneratingActivities = incomeGeneratingActivities;
        this.averageSalaryNPR = averageSalaryNPR;
        this.incomOrganization = incomOrganization;
    }

    public String getIncomeEducationalOrganization() {
        return IncomeEducationalOrganization;
    }

    public String getIncomeGeneratingActivities() {
        return IncomeGeneratingActivities;
    }

    public String getAverageSalaryNPR() {
        return averageSalaryNPR;
    }

    public String getIncomOrganization() {
        return incomOrganization;
    }
}
