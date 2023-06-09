package mtuci.programm.mtuci_position;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.effect.Glow;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class ControllerGraphixImprove {
        @FXML
        private Button exit;
        @FXML
        private BarChart<?, ?> research;
        @FXML
        private CategoryAxis x;

        @FXML
        private NumberAxis y;
        @FXML
        public void initialize(){

        }

        @FXML
        private void drawing_graph_r1(){

            HashMap<String, Double> researchData = DataBase.getDataForResearchR1();

            CategoryAxis x = new CategoryAxis();
            x.setLabel("Параметры");

            NumberAxis y = new NumberAxis();
            y.setLabel("Значения");

            BarChart<String, Number> research = new BarChart<>(x, y);

            XYChart.Series<String, Number> series = new XYChart.Series<>();

            for (Map.Entry<String, Double> entry : researchData.entrySet()) {
                series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
            }

            research.getData().addAll(series);
            for (XYChart.Data<String, Number> data : series.getData()) {
                //+" " + String.valueOf(data.getXValue())
                Text text = new Text(data.getYValue().toString());
                text.setStyle("-fx-font-weight: bold;");
                StackPane.setAlignment(text, Pos.TOP_CENTER);
                data.getNode().setOnMouseEntered(event -> {
                    data.getNode().setEffect(new Glow());
                    data.getNode().setScaleX(1);
                    data.getNode().setScaleY(1);
                    StackPane sp = (StackPane) data.getNode();
                    sp.getChildren().add(text);
                });
                data.getNode().setOnMouseExited(event -> {
                    data.getNode().setEffect(null);
                    data.getNode().setScaleX(1);
                    data.getNode().setScaleY(1);
                    StackPane sp = (StackPane) data.getNode();
                    sp.getChildren().remove(text);
                });
            }
            Stage stage = new Stage();
            Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
            stage.setScene(scene);
// Максимизируем окно на весь экран
            stage.setMaximized(true);
// Отображаем окно сцены
            stage.setTitle("1.Количество цитирований публикаций, изданных за последние 5 лет, индексируемых в Российском индексе научного цитирования (далее - РИНЦ) в расчете на 100 НПР[н]");
            stage.show();

        }
        @FXML
    private void drawing_graph_r2(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR2();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Число публикаций организации, индексируемых в информационно-аналитической системе научного цитирования РИНЦ, в расчете на 100 НПР[н] ");
        stage.show();

    }
    @FXML
    private void drawing_graph_r3(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR3();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+"%");
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Удельный вес доходов от НИОКР в общих доходах образовательной организации ");
        stage.show();

    }

    @FXML
    private void drawing_graph_r4(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR4();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() + "тыс. руб");
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Общий объем научно-исследовательских и опытно-конструкторских работ (далее – НИОКР)");
        stage.show();

    }
    @FXML
    private void drawing_graph_r5(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR5();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() + "%");
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Удельный вес НИОКР, выполненных собственными силами (без привлечения соисполнителей), в общих доходах образовательной организации от НИОКР ");
        stage.show();

    }
    @FXML
    private void drawing_graph_r6(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR6();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() + "тыс. руб.");
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("6.Доходы от НИОКР (за исключением средств бюджетов бюджетной системы Российской Федерации, государственных фондов поддержки науки) в расчете на одного НПР[н] ");
        stage.show();

    }
    @FXML
    private void drawing_graph_r7(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR7();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("7.Количество лицензионных соглашений");
        stage.show();

    }
    @FXML
    private void drawing_graph_r8(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR8();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() +"%");
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("8.Удельный вес средств, полученных образовательной организацией от использования результатов интеллектуальной деятельности, в общих доходах образовательной организации");
        stage.show();

    }
    @FXML
    private void drawing_graph_r9(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR9();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("9.Количество научных журналов, в том числе электронных, издаваемых образовательной организацией");
        stage.show();

    }
    @FXML
    private void drawing_graph_r10(){

        HashMap<String, Double> researchData = DataBase.getDataForResearchR10();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("10.Количество полученных грантов за отчетный год в расчете на 100 НПР[н]");
        stage.show();

    }

    @FXML
    private void drawing_graph_E1(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE1();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() +" балл");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("1.Средний балл ЕГЭ студентов, принятых по результатам ЕГЭ на обучение по очной форме по программам бакалавриата и специалитета за счет средств соответствующих бюджетов бюджетной системы РФ");
        stage.show();

    }
    @FXML
    private void drawing_graph_E2(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE2();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" балл");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Средний балл ЕГЭ студентов университета, принятых по результатам ЕГЭ на обучение по очной форме по программам бакалавриата и специалитета за счет средств соответствующих бюджетов бюджетной системы Российской Федерации, за исключением лиц, поступивших с учетом особых прав и в рамках квоты целевого приема");
        stage.show();

    }
    @FXML
    private void drawing_graph_E3(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE3();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" балл");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Средний балл ЕГЭ студентов, принятых по результатам ЕГЭ на обучение по очной форме по программам бакалавриата и специалитета с оплатой стоимости затрат на обучение физическими и юридическими лицами");
        stage.show();

    }
    @FXML
    private void drawing_graph_E4(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE4();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Численность студентов, принятых по результатам целевого приема на первый курс на очную форму обучения по программам бакалавриата и специалитета");
        stage.show();

    }
    @FXML
    private void drawing_graph_E5(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE5();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString() + " %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Удельный вес численности студентов, обучающихся по направлениям подготовки бакалавриата, специалитета, и магистратуры по областям знаний «Инженерное дело, технологии и технические науки», «Здравоохранение и медицинские науки», «Образование и педагогические науки», с которыми заключены договоры о целевом обучении, в общей численности студентов, обучающихся по указанным областям знаний");
        stage.show();

    }
    @FXML
    private void drawing_graph_E6(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE6();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("6.Общая численность студентов, обучающихся по программам бакалавриата, специалитета, магистратуры в том числе: ");
        stage.show();

    }
    @FXML
    private void drawing_graph_E7(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE7();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("7.по очной форме обучения");
        stage.show();

    }
    @FXML
    private void drawing_graph_E8(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE8();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("8.по очно-заочной (вечерней) форме обучения");
        stage.show();

    }
    @FXML
    private void drawing_graph_E9(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE9();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString());//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("9.по заочной форме обучения");
        stage.show();

    }
    @FXML
    private void drawing_graph_E10(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE10();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("10.Доля обучающихся по программам бакалавриата в общей численности обучающихся по программам бакалавриата, специалитета,магистратуры");
        stage.show();

    }
    @FXML
    private void drawing_graph_E11(){

        HashMap<String, Double> researchData = DataBase.getDataForEducActivE11();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("11.Доля обучающихся по программам магистратуры в общей численности обучающихся по программам бакалавриата,  специалитета,магистратуры");
        stage.show();

    }

    @FXML
    private void drawing_graph_I1(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI1();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("1.Удельный вес численности иностранных студентов (кроме стран Содружества Независимых Государств (далее – СНГ)), обучающихся программам бакалавриата, специалитета, магистратуры, в общей численности студентов (приведенный контингент)");
        stage.show();

    }
    @FXML
    private void drawing_graph_I2(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI2();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Удельный вес численности иностранных студентов из СНГ, обучающихся по программам бакалавриата, специалитета, магистратуры, в общей численности студентов (приведенный контингент)");
        stage.show();

    }
    @FXML
    private void drawing_graph_I3(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI3();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Удельный вес численности иностранных студентов, завершивших освоение образовательных программ бакалавриата, специалитета, магистратуры, в общей численности студентов (приведенный контингент)");
        stage.show();

    }
    @FXML
    private void drawing_graph_I4(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI4();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Удельный вес численности иностранных студентов (кроме стран СНГ), завершивших освоение образовательных программ бакалавриата, программ специалитета, программ магистратуры, в общей численности студентов (приведенный контингент)");
        stage.show();

    }
    @FXML
    private void drawing_graph_I5(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI5();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Удельный вес численности студентов, обучающихся по очной форме обучения по образовательным программам бакалавриата, программам специалитета, программам магистратуры, прошедших обучение за рубежом не менее семестра (триместра), в общей численности студентов, обучающихся по очной форме обучения");
        stage.show();

    }
    @FXML
    private void drawing_graph_I6(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI6();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("6.Численность студентов иностранных образовательных организаций, прошедших обучение в образовательной организации по образовательным по очной форме обучения по образовательным программам бакалавриата, программам специалитета, программам магистратуры, не менее семестра (триместра) в расчете на 100 студентов, обучающихся по очной форме обучения");
        stage.show();

    }
    @FXML
    private void drawing_graph_I7(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI7();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("7.Численность зарубежных ведущих профессоров, преподавателей и исследователей, работающих (работавших) в образовательной организации не менее 1 семестра");
        stage.show();

    }
    @FXML
    private void drawing_graph_I8(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI8();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("8.Удельный вес численности иностранных граждан (кроме стран СНГ) из числа аспирантов (адъюнктов), ординаторов, ассистентов-стажеров образовательной организации в общей численности аспирантов (адъюнктов), ординаторов, ассистентов-стажеров");
        stage.show();

    }
    @FXML
    private void drawing_graph_I9(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI9();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("9.Удельный вес численности иностранных граждан из стран СНГ из числа аспирантов (адъюнктов), ординаторов, ассистентов-стажеров образовательной организации в общей численности аспирантов (адъюнктов), ординаторов, ассистентов-стажеров");
        stage.show();

    }
    @FXML
    private void drawing_graph_I10(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI10();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс.руб.");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("10.Объем средств от образовательной деятельности, полученных образовательной организацией от иностранных граждан и иностранных юридических лиц");
        stage.show();

    }
    @FXML
    private void drawing_graph_I11(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI11();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("11.Общая численность иностранных студентов, обучающихся по программам бакалавриата, специалитета, магистратуры ");
        stage.show();

    }
    @FXML
    private void drawing_graph_I12(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI12();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("12.Доля иностранных студентов в общей численности студентов, обучающихся по программам бакалавриата, специалитета, магистратуры ");
        stage.show();

    }
    @FXML
    private void drawing_graph_I13(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI13();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("13.Общее число образовательных программ высшего образования, реализуемых совместно с зарубежными вузами и ведущих к получению двух дипломов");
        stage.show();

    }
    @FXML
    private void drawing_graph_I14(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI14();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("14.Общая численность обучающихся по очной форме обучения по программам бакалавриата, специалитета, магистратуры, реализуемым совместно с зарубежными вузами и ведущим к получению двух дипломов");
        stage.show();

    }
    @FXML
    private void drawing_graph_I15(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI15();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("15.Число статей, подготовленных совместно с зарубежными организациями");
        stage.show();

    }
    @FXML
    private void drawing_graph_I16(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI16();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс.руб. ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("16.Доходы вуза из иностранных источников на выполнение НИОКР");
        stage.show();

    }
    @FXML
    private void drawing_graph_I17(){

        HashMap<String, Double> researchData = DataBase.getDataForInterActivI17();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс.руб.");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("17.Доходы вуза от образовательной деятельности из иностранных источников");
        stage.show();

    }
    @FXML
    private void drawing_graph_F1(){

        HashMap<String, Double> researchData = DataBase.getDataForAdditEconomActivF1();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс. руб.");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("1.Доходы вуза из всех источников");
        stage.show();

    }
    @FXML
    private void drawing_graph_F2(){

        HashMap<String, Double> researchData = DataBase.getDataForAdditEconomActivF2();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Доля доходов вуза из внебюджетных источников");
        stage.show();

    }
    @FXML
    private void drawing_graph_F3(){

        HashMap<String, Double> researchData = DataBase.getDataForAdditEconomActivF3();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Доля доходов вуза из федерального бюджета");
        stage.show();

    }
    @FXML
    private void drawing_graph_F4(){

        HashMap<String, Double> researchData = DataBase.getDataForAdditEconomActivF4();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Доля доходов вуза из бюджета субъекта РФ и местного бюджета");
        stage.show();

    }
    @FXML
    private void drawing_graph_F5(){

        HashMap<String, Double> researchData = DataBase.getDataForAdditEconomActivF5();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Доля доходов вуза от образовательной деятельности в общих доходах вуза");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf1(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf1();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" м^2");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("1.Общая площадь учебно-лабораторных помещений в расчете на одного студента (приведенного контингента)");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf2(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf2();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Количество персональных компьютеров в расчете на одного студента (приведенного контингента)");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf3(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf3();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Удельный вес стоимости машин и оборудования (не старше 5 лет) в общей стоимости машин и оборудования");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf4(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf4();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Количество экземпляров печатных учебных изданий (включая учебники и учебные пособия) из общего количества единиц хранения библиотечного фонда, состоящих на учете, в расчете на одного студента (приведенного контингента)");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf5(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf5();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" м^2");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Площадь учебно-лабораторных зданий ");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf6(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf6();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" м^2");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("6.Площадь, предназначенная для научно-исследовательских подразделений  ");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf7(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf7();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" м^2");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("7.Площадь общежитий ");
        stage.show();

    }
    @FXML
    private void drawing_graph_Inf8(){

        HashMap<String, Double> researchData = DataBase.getDataForInfrastractInf8();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("8.Доля студентов, не обеспеченных собственным общежитием, в числе студентов, нуждающихся в общежитии  ");
        stage.show();

    }

    @FXML
    private void drawing_graph_P1(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP1();

        CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("1.Удельный вес НПР, имеющих ученую степень кандидата наук, в общей численности НПР ");
        stage.show();

    }
    @FXML
    private void drawing_graph_P2(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP2();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("2.Удельный вес НПР имеющих ученую степень доктора наук, в общей численности НПР");
        stage.show();

    }
    @FXML
    private void drawing_graph_P3(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP3();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("3.Удельный вес НПР, имеющих ученую степень кандидата и доктора наук, в общей численности НПР образовательной организации (без совместителей и работающих по договорам гражданско-правового характера)");
        stage.show();

    }
    @FXML
    private void drawing_graph_P4(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP4();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("4.Число НПР, имеющих ученую степень кандидата и доктора наук, в расчете на 100 студентов");
        stage.show();

    }
    @FXML
    private void drawing_graph_P5(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP5();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" %");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("5.Доля штатных работников ППС в общей численности ППС");
        stage.show();

    }
    @FXML
    private void drawing_graph_P6(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP6();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("6.Общая численность ППС (без внешних совместителей и работающих по договорам ГПХ) ");
        stage.show();

    }
    @FXML
    private void drawing_graph_P7(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP7();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" ");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("7.Общая численность научных работников (без внешних совместителей и работающих по договорам ГПХ) ");
        stage.show();

    }
    @FXML
    private void drawing_graph_P8(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP8();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс. руб.");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("8.Средняя заработная плата ППС (без внешних совместителей и работающих по договорам ГПХ)");
        stage.show();

    }
    @FXML
    private void drawing_graph_P9(){

        HashMap<String, Double> researchData = DataBase.getDataForPersonellP9();

                CategoryAxis x = new CategoryAxis();
        x.setLabel("Параметры");

        NumberAxis y = new NumberAxis();
        y.setLabel("Значения");

        BarChart<String, Number> research = new BarChart<>(x, y);

        XYChart.Series<String, Number> series = new XYChart.Series<>();

        for (Map.Entry<String, Double> entry : researchData.entrySet()) {
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
        }

        research.getData().addAll(series);
        for (XYChart.Data<String, Number> data : series.getData()) {
            //+" " + String.valueOf(data.getXValue())
            Text text = new Text(data.getYValue().toString()+" тыс. руб.");//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            text.setStyle("-fx-font-weight: bold;");
            StackPane.setAlignment(text, Pos.TOP_CENTER);
            data.getNode().setOnMouseEntered(event -> {
                data.getNode().setEffect(new Glow());
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().add(text);
            });
            data.getNode().setOnMouseExited(event -> {
                data.getNode().setEffect(null);
                data.getNode().setScaleX(1);
                data.getNode().setScaleY(1);
                StackPane sp = (StackPane) data.getNode();
                sp.getChildren().remove(text);
            });
        }
        Stage stage = new Stage();
        Scene scene = new Scene(research);
// Устанавливаем свойство сцены на окно Stage
        stage.setScene(scene);
// Максимизируем окно на весь экран
        stage.setMaximized(true);
// Отображаем окно сцены
        stage.setTitle("9.Средняя заработная плата научных работников (без внешних совместителей и работающих по договорам ГПХ) ");
        stage.show();

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
