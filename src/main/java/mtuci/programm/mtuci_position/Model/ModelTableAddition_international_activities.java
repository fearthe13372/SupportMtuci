package mtuci.programm.mtuci_position.Model;

public class ModelTableAddition_international_activities extends Model{
    private final String studentsEnrolledBachelor;
    private final String foreignStudents;
    private final String higherEducation;
    private final String obtainingTwoDiplomas;
    private final String foreignGraduateStudents;
    private final String jointlyWithForeignOrganizations;
    private final String IncomeForeignSources;
    private final String activitiesFromForeignSources;
    private final String intellectualActivity;

    public ModelTableAddition_international_activities(String studentsEnrolledBachelor, String foreignStudents, String higherEducation, String obtainingTwoDiplomas, String foreignGraduateStudents, String jointlyWithForeignOrganizations, String incomeForeignSources, String activitiesFromForeignSources, String intellectualActivity) {
        this.studentsEnrolledBachelor = studentsEnrolledBachelor;
        this.foreignStudents = foreignStudents;
        this.higherEducation = higherEducation;
        this.obtainingTwoDiplomas = obtainingTwoDiplomas;
        this.foreignGraduateStudents = foreignGraduateStudents;
        this.jointlyWithForeignOrganizations = jointlyWithForeignOrganizations;
        IncomeForeignSources = incomeForeignSources;
        this.activitiesFromForeignSources = activitiesFromForeignSources;
        this.intellectualActivity = intellectualActivity;
    }

    public String getStudentsEnrolledBachelor() {
        return studentsEnrolledBachelor;
    }

    public String getForeignStudents() {
        return foreignStudents;
    }

    public String getHigherEducation() {
        return higherEducation;
    }

    public String getObtainingTwoDiplomas() {
        return obtainingTwoDiplomas;
    }

    public String getForeignGraduateStudents() {
        return foreignGraduateStudents;
    }

    public String getJointlyWithForeignOrganizations() {
        return jointlyWithForeignOrganizations;
    }

    public String getIncomeForeignSources() {
        return IncomeForeignSources;
    }

    public String getActivitiesFromForeignSources() {
        return activitiesFromForeignSources;
    }

    public String getIntellectualActivity() {
        return intellectualActivity;
    }
}
