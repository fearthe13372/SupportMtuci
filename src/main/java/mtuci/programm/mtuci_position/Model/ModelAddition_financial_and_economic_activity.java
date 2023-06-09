package mtuci.programm.mtuci_position.Model;

public class ModelAddition_financial_and_economic_activity extends Model{
    private final String UnivАllSources;
    private final String extraBudgetarySources;
    private final String shareextraBudgetarySources;
    private final String federalBudget;
    private final String localBudget;
    private final String incomeEducationalActivities;
    private final String total_income;
    private final String extraBudgetaryFunds;
    private final String extraBudgetaryResearch;

    public ModelAddition_financial_and_economic_activity(String univАllSources, String extraBudgetarySources, String shareextraBudgetarySources, String federalBudget, String localBudget, String incomeEducationalActivities, String total_income, String extraBudgetaryFunds, String extraBudgetaryResearch) {
        UnivАllSources = univАllSources;
        this.extraBudgetarySources = extraBudgetarySources;
        this.shareextraBudgetarySources = shareextraBudgetarySources;
        this.federalBudget = federalBudget;
        this.localBudget = localBudget;
        this.incomeEducationalActivities = incomeEducationalActivities;
        this.total_income = total_income;
        this.extraBudgetaryFunds = extraBudgetaryFunds;
        this.extraBudgetaryResearch = extraBudgetaryResearch;
    }

    public String getUnivАllSources() {
        return UnivАllSources;
    }

    public String getExtraBudgetarySources() {
        return extraBudgetarySources;
    }

    public String getShareextraBudgetarySources() {
        return shareextraBudgetarySources;
    }

    public String getFederalBudget() {
        return federalBudget;
    }

    public String getLocalBudget() {
        return localBudget;
    }

    public String getIncomeEducationalActivities() {
        return incomeEducationalActivities;
    }

    public String getTotal_income() {
        return total_income;
    }

    public String getExtraBudgetaryFunds() {
        return extraBudgetaryFunds;
    }

    public String getExtraBudgetaryResearch() {
        return extraBudgetaryResearch;
    }
}
