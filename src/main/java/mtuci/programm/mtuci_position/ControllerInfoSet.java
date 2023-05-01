package mtuci.programm.mtuci_position;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.*;
import java.util.ArrayList;


public class ControllerInfoSet  {
        @FXML
        private TextField E1field;
        @FXML
        private TextField E2field;
        @FXML
        private TextField E3field;
        @FXML
        private TextField E4field;
        @FXML
        private TextField E5field;
        @FXML
        private TextField E8field;
        //@FXML
        //private Button upload;

        @FXML
        private Button exit;
        @FXML
        private TableView<Model> table;
        @FXML
        private TableColumn<Model, String> number;
        @FXML
        private TableColumn<Model, String> name;
        @FXML
        private TableColumn<Model, Double> e1;
        @FXML
        private TableColumn<Model, Double> e2;
        @FXML
        private TableColumn<Model, Double> e3;
        @FXML
        private TableColumn<Model, Double> e4;
        @FXML
        private TableColumn<Model, Double> e5;
        @FXML
        private TableColumn<Model, Double> e8;
        private Model instruct ;


        public void initialize() {
            number.setCellValueFactory(new PropertyValueFactory<>("number"));
            number.setCellValueFactory(new PropertyValueFactory<>("number"));
            name.setCellValueFactory(new PropertyValueFactory<>("name"));
            e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
            e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
            e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
            e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
            e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
            e8.setCellValueFactory(new PropertyValueFactory<>("E8"));


            ArrayList<Model> modelMains= DataBase.initMainTable();
            for (Model model: modelMains
            ) {
                table.getItems().add(model);///!!!!!!!!!!!!!
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
    @FXML
    void onReadAddInfo() {
            try {
                // Проверяем, все ли поля заполнены
                boolean allFieldsFilled = !E1field.getText().isEmpty() &&
                        !E2field.getText().isEmpty() &&
                        !E3field.getText().isEmpty() &&
                        !E4field.getText().isEmpty() &&
                        !E5field.getText().isEmpty() &&
                        !E8field.getText().isEmpty();

// Если не все поля заполнены, показываем предупреждение
                if (!allFieldsFilled) {
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Предупреждение");
                    alert.setHeaderText("Не все данные заполнены");
                    alert.setContentText("Заполните, пожалуйста, все поля");
                    alert.showAndWait();
                    throw new Exception();
                }
                Double E1fiel = E1field.getText().contains(",") ? Double.parseDouble(E1field.getText().replace(",", ".")) : Double.parseDouble(E1field.getText());
                Double E2fiel = E2field.getText().contains(",") ? Double.parseDouble(E2field.getText().replace(",", ".")) : Double.parseDouble(E2field.getText());
                Double E3fiel = E3field.getText().contains(",") ? Double.parseDouble(E3field.getText().replace(",", ".")) : Double.parseDouble(E3field.getText());
                Double E4fiel = E3field.getText().contains(",") ? Double.parseDouble(E4field.getText().replace(",", ".")) : Double.parseDouble(E4field.getText());
                Double E5fiel = E3field.getText().contains(",") ? Double.parseDouble(E5field.getText().replace(",", ".")) : Double.parseDouble(E5field.getText());
                Double E8fiel = E8field.getText().contains(",") ? Double.parseDouble(E8field.getText().replace(",", ".")) : Double.parseDouble(E8field.getText());

                number.setCellValueFactory(new PropertyValueFactory<>("number"));
                number.setCellValueFactory(new PropertyValueFactory<>("number"));
                name.setCellValueFactory(new PropertyValueFactory<>("name"));
                e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
                e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
                e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
                e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
                e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
                e8.setCellValueFactory(new PropertyValueFactory<>("E8"));
                instruct=new ModelMain(0,"ВСТАВЛЕННЫЕ ДАННЫЕ",E1fiel.toString(),E2fiel.toString(),E3fiel.toString(),E4fiel.toString(),E5fiel.toString(),E8fiel.toString());
                table.getItems().add(instruct);


            }catch (Exception e){
                showErrorAlert();
            }

    }
    public void showErrorAlert() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка!");
        alert.setHeaderText(null);
        alert.setContentText("Введенные данные некорректны.");

        alert.showAndWait();
    }
    @FXML
    private void resetView(){
            ObservableList<Model> tab = table.getItems();
            tab.remove(instruct);
            table.setItems(tab);

            E1field.clear();
            E2field.clear();
            E3field.clear();
            E4field.clear();
            E5field.clear();
            E8field.clear();
    }
    @FXML
    public void switchToGraphix()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Graphix.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){}

    }
}
