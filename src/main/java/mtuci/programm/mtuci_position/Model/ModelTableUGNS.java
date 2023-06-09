package mtuci.programm.mtuci_position.Model;

public class ModelTableUGNS extends Model{
    private final String nameUgns;
    private final String shareStud;
    private final String shareUgnsFromTotalStud;
    private final String shareFromTotalStud;
    private final String numberUniverImplEducation;
    private final String numberOfBranches;

    public ModelTableUGNS(String nameUgns, String shareStud, String shareUgnsFromTotalStud, String shareFromTotalStud, String numberUniverImplEducation, String numberOfBranches) {
        this.nameUgns = nameUgns;
        this.shareStud = shareStud;
        this.shareUgnsFromTotalStud = shareUgnsFromTotalStud;
        this.shareFromTotalStud = shareFromTotalStud;
        this.numberUniverImplEducation = numberUniverImplEducation;
        this.numberOfBranches = numberOfBranches;
    }

    public String getNameUgns() {
        return nameUgns;
    }

    public String getShareStud() {
        return shareStud;
    }

    public String getShareUgnsFromTotalStud() {
        return shareUgnsFromTotalStud;
    }

    public String getShareFromTotalStud() {
        return shareFromTotalStud;
    }

    public String getNumberUniverImplEducation() {
        return numberUniverImplEducation;
    }

    public String getNumberOfBranches() {
        return numberOfBranches;
    }
}
