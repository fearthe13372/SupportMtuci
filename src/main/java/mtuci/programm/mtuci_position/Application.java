package mtuci.programm.mtuci_position;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

public class Application extends javafx.application.Application {
   // @FXML
    //private ListView<String> succsessView;
    //private ObservableList<String> succsessList =FXCollections.observableArrayList("test");
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("Main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(getClass().getResourceAsStream("/style.css").toString());
        stage.setTitle("Поддержка позиционирования МТУСИ");

        InputStream iconStream =  getClass().getResourceAsStream("/Mot.png");
        Image image = new Image(iconStream);


       // succsessView.setItems(succsessList);
        stage.getIcons().add(image);
        stage.setScene(scene);
        stage.setWidth(1170);
        stage.setHeight(642);
        stage.show();

    }
    public void exit(){
        try {
            stop();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        launch();

    }
}