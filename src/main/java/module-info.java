module com.example.motivation_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires java.sql;
    exports mtuci.programm.mtuci_position;
    opens mtuci.programm.mtuci_position to javafx.fxml;

}