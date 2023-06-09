package mtuci.programm.mtuci_position;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mtuci.programm.mtuci_position.Model.Model;

import java.sql.*;
import java.util.ArrayList;


public class Controller  {

        @FXML
        private Button exit;
        @FXML
        private TableView<Model> table;

        @FXML
         private TableColumn<Model, Double> e_subject;
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
        private ObservableList<Model> tabSave;


        @FXML
        private void sortE1(){

            table.getItems().clear();

            e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
            number.setCellValueFactory(new PropertyValueFactory<>("number"));
            name.setCellValueFactory(new PropertyValueFactory<>("name"));
            e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
            e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
            e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
            e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
            e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
            e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

            ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE1());
            for (Model model: modelMains
            ) {
                table.getItems().add(model);///!!!!!!!!!!!!!
            }
            //tabSave=table.getItems();
        }
        @FXML
        private void sortE2(){
            table.getItems().clear();
        e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
        e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
        e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
        e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
        e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
        e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

        ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE2());
        for (Model model: modelMains
        ) {
            table.getItems().add(model);///!!!!!!!!!!!!!
        }

    }
        @FXML
        private void sortE3(){
            table.getItems().clear();
        e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
        e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
        e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
        e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
        e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
        e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

        ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE3());
        for (Model model: modelMains
        ) {
            table.getItems().add(model);///!!!!!!!!!!!!!
        }

    }
        @FXML
        private void sortE4(){
            table.getItems().clear();
        e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
        e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
        e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
        e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
        e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
        e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

        ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE4());
        for (Model model: modelMains
        ) {
            table.getItems().add(model);///!!!!!!!!!!!!!
        }

    }
        @FXML
        private void sortE5(){
            table.getItems().clear();
        e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
        e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
        e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
        e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
        e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
        e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

        ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE5());
        for (Model model: modelMains
        ) {
            table.getItems().add(model);///!!!!!!!!!!!!!
        }

    }
        @FXML
        private void sortE8(){
            table.getItems().clear();
        e_subject.setCellValueFactory(new PropertyValueFactory<>("e_subject"));
        number.setCellValueFactory(new PropertyValueFactory<>("number"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        e1.setCellValueFactory(new PropertyValueFactory<>("E1"));
        e2.setCellValueFactory(new PropertyValueFactory<>("E2"));
        e3.setCellValueFactory(new PropertyValueFactory<>("E3"));
        e4.setCellValueFactory(new PropertyValueFactory<>("E4"));
        e5.setCellValueFactory(new PropertyValueFactory<>("E5"));
        e8.setCellValueFactory(new PropertyValueFactory<>("E8"));

        ArrayList<Model> modelMains= DataBase.sortModelsByESubject(DataBase.initMainTableSortE8());
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
        }catch (Exception e ){
            //System.out.printf(String.valueOf(e));
            //e.printStackTrace();
        }

    }
    public void switchToGraphixImprove()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GraphixImprove.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){
            //System.out.printf(String.valueOf(e));
            //e.printStackTrace();
        }

    }

    }
