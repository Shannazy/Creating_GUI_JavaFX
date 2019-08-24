package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene page1, page2;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label title1 = new Label("Welcome to the page");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(page2));

        VBox layout1 = new VBox(0);    //VBox stacks the objects on each other with a space of 20
        layout1.getChildren().addAll(title1, button1);
        page1 = new Scene(layout1, 200, 200);

        Button button2 = new Button("Go to Scene 1");
        button2.setOnAction(e -> window.setScene(page1));

        VBox layout2 = new VBox(20);
        layout2.getChildren().add(button2);
        page2 = new Scene(layout2, 500, 500);

        window.setScene(page1);
        window.setTitle("Testing GUI");
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
