package mtuci.programm.mtuci_position.Model;

public class ModelTableAddit_Educ_Act extends Model{
    private final String students_enrolled_in_bachelo;
    private final String includingFullTimeEducation;
    private final String fullTimeEvening;
    private final String correspondence_education;
    private final String AverageScoreExam;
    private final String proportionStudentsBachelor;
    private final String n_the_total;
    private final String share_of_students_enrolled_in_master;
    private final String totalNumberStudentsAdditional;
    private final String totalNumberStudentsEnrolledSecondaryVocational;
    private final String numberEnterprisesContracts;
    private final String numberEnterprisesContractsBasesPractice;

    public ModelTableAddit_Educ_Act(String students_enrolled_in_bachelo, String includingFullTimeEducation, String fullTimeEvening, String correspondence_education, String averageScoreExam, String proportionStudentsBachelor, String n_the_total, String share_of_students_enrolled_in_master, String totalNumberStudentsAdditional, String totalNumberStudentsEnrolledSecondaryVocational, String numberEnterprisesContracts, String numberEnterprisesContractsBasesPractice) {
        this.students_enrolled_in_bachelo = students_enrolled_in_bachelo;
        this.includingFullTimeEducation = includingFullTimeEducation;
        this.fullTimeEvening = fullTimeEvening;
        this.correspondence_education = correspondence_education;
        AverageScoreExam = averageScoreExam;
        this.proportionStudentsBachelor = proportionStudentsBachelor;
        this.n_the_total = n_the_total;
        this.share_of_students_enrolled_in_master = share_of_students_enrolled_in_master;
        this.totalNumberStudentsAdditional = totalNumberStudentsAdditional;
        this.totalNumberStudentsEnrolledSecondaryVocational = totalNumberStudentsEnrolledSecondaryVocational;
        this.numberEnterprisesContracts = numberEnterprisesContracts;
        this.numberEnterprisesContractsBasesPractice = numberEnterprisesContractsBasesPractice;
    }

    public String getStudents_enrolled_in_bachelo() {
        return students_enrolled_in_bachelo;
    }

    public String getIncludingFullTimeEducation() {
        return includingFullTimeEducation;
    }

    public String getFullTimeEvening() {
        return fullTimeEvening;
    }

    public String getCorrespondence_education() {
        return correspondence_education;
    }

    public String getAverageScoreExam() {
        return AverageScoreExam;
    }

    public String getProportionStudentsBachelor() {
        return proportionStudentsBachelor;
    }

    public String getN_the_total() {
        return n_the_total;
    }

    public String getShare_of_students_enrolled_in_master() {
        return share_of_students_enrolled_in_master;
    }

    public String getTotalNumberStudentsAdditional() {
        return totalNumberStudentsAdditional;
    }

    public String getTotalNumberStudentsEnrolledSecondaryVocational() {
        return totalNumberStudentsEnrolledSecondaryVocational;
    }

    public String getNumberEnterprisesContracts() {
        return numberEnterprisesContracts;
    }

    public String getNumberEnterprisesContractsBasesPractice() {
        return numberEnterprisesContractsBasesPractice;
    }
}
