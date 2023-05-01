package mtuci.programm.mtuci_position;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.*;

public class ControllerGraphix {
    @FXML
    private Button exit;
    @FXML
    private TableView<Model> table;
    @FXML
    private TableColumn<Model, String> indicator;
    @FXML
    private TableColumn<Model, Double> year2018;
    @FXML
    private TableColumn<Model, Double> year2019;
    @FXML
    private TableColumn<Model, Double> year2020;
    @FXML
    private TableColumn<Model, Double> year2021;
    @FXML
    private TableColumn<Model, Double> year2022;
    @FXML
    private TableColumn<Model, Double> medialValueRF;
    @FXML
    private TableColumn<Model, Double> medialSubject;
    @FXML
    private TableColumn<Model, Double> medialDepartment;

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/position";
    private static final String user = "root";
    private static final String password = "465231";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;

    public void initialize() {
        indicator.setCellValueFactory(new PropertyValueFactory<>("indicator"));
        year2018.setCellValueFactory(new PropertyValueFactory<>("year2018"));
        year2019.setCellValueFactory(new PropertyValueFactory<>("year2019"));
        year2020.setCellValueFactory(new PropertyValueFactory<>("year2020"));
        year2021.setCellValueFactory(new PropertyValueFactory<>("year2021"));
        year2022.setCellValueFactory(new PropertyValueFactory<>("year2022"));
        medialValueRF.setCellValueFactory(new PropertyValueFactory<>("medialValueRF"));
        medialSubject.setCellValueFactory(new PropertyValueFactory<>("medialSubject"));
        medialDepartment.setCellValueFactory(new PropertyValueFactory<>("medialDepartment"));


        // Connect to database and load data into table
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            String query ="SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e1 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e2 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e3 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e4 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT t.nameIndicator, t.year2018, t.year2019, t.year2020, t.year2021, t.year2022, t.medialValueRF, t.medialSubject, t.medialDepartment FROM glossary g JOIN table_e5 t ON g.idglossary = t.idTable_E WHERE g.idglossary = 3 UNION SELECT table_e8.nameIndicator, table_e8.year2018, table_e8.year2019, table_e8.year2020, table_e8.year2021, table_e8.year2022, table_e8.medialValueRF, table_e8.medialSubject, table_e8.medialDepartment FROM glossary g JOIN table_e8  ON g.idglossary = table_e8.idTable_E WHERE g.idglossary = 3;";
            rs = stmt.executeQuery(query);

            while (rs.next()) {

                ModelTablePosition model = new ModelTablePosition(
                        rs.getString("nameIndicator"),
                        rs.getString("year2018"),
                        rs.getString("year2019"),
                        rs.getString("year2020"),
                        rs.getString("year2021"),
                        rs.getString("year2022"),
                        rs.getString("medialValueRF"),
                        rs.getString("medialSubject"),
                        rs.getString("medialDepartment")
                );
                table.getItems().add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                    stmt.close();
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    @FXML
    private void setExit(){


        // Обработчик нажатия кнопки "Выход"
        exit.setOnAction(event -> {
            System.exit(0);
        });
    }
    @FXML
    public void switchToAddInfo()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Addinfo.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){}

    }
    @FXML
    public void switchToTopUniverse()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){}

    }
}
