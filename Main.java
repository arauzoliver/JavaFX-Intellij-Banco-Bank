package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Digital Bank");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
        primaryStage.centerOnScreen();
        primaryStage.isResizable();

    }

    public static void main(String[] args) throws Exception{
        launch(args);
    }
}
