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
import java.util.ArrayList;

import static mtuci.programm.mtuci_position.DataBase.initMainTable;

public class ControllerGraphix {
    @FXML
    private Button exit;
    @FXML
    private TableView<Model> tableEduc_Activ;
    @FXML
    private TableView<Model> tablePosition;
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
    @FXML
    private TableColumn<Model, Double> f1;
    @FXML
    private TableColumn<Model, Double> f2;
    @FXML
    private TableColumn<Model, Double> f3;
    @FXML
    private TableColumn<Model, Double> f4;
    @FXML
    private TableColumn<Model, Double> f5;
    @FXML
    private TableColumn<Model, Double> f6;
    @FXML
    private TableColumn<Model, Double> f7;
    @FXML
    private TableColumn<Model, Double> f8;
    @FXML
    private TableColumn<Model, Double> f9;
    @FXML
    private TableColumn<Model, Double> f10;
    @FXML
    private TableColumn<Model, Double> f11;
    @FXML
    private TableColumn<Model, Double> f12;
    @FXML
    private TableColumn<Model, Double> f13;
    @FXML
    private TableColumn<Model, Double> f14;
    @FXML
    private TableColumn<Model, Double> f15;
    @FXML
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

        ArrayList<Model> modelMains= DataBase.initGraphixPosition();
        for (Model model: modelMains
        ) {
            tablePosition.getItems().add(model);///!!!!!!!!!!!!!
        }

        f1.setCellValueFactory(new PropertyValueFactory<>("f1"));
        f2.setCellValueFactory(new PropertyValueFactory<>("f2"));
        f3.setCellValueFactory(new PropertyValueFactory<>("f3"));
        f4.setCellValueFactory(new PropertyValueFactory<>("f4"));
        f5.setCellValueFactory(new PropertyValueFactory<>("f5"));
        f6.setCellValueFactory(new PropertyValueFactory<>("f6"));
        f7.setCellValueFactory(new PropertyValueFactory<>("f7"));
        f8.setCellValueFactory(new PropertyValueFactory<>("f8"));
        f9.setCellValueFactory(new PropertyValueFactory<>("f9"));
        f10.setCellValueFactory(new PropertyValueFactory<>("f10"));
        f11.setCellValueFactory(new PropertyValueFactory<>("f11"));
        f12.setCellValueFactory(new PropertyValueFactory<>("f12"));
        f13.setCellValueFactory(new PropertyValueFactory<>("f13"));
        f14.setCellValueFactory(new PropertyValueFactory<>("f14"));
        f15.setCellValueFactory(new PropertyValueFactory<>("f15"));
        modelMains= DataBase.initGraphixEducActiv();
        for (Model model: modelMains
        ) {
            tableEduc_Activ.getItems().add(model);///!!!!!!!!!!!!!
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
