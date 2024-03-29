package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Scene page1, page2;
    AlertBox alerter = new AlertBox();

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Label title1 = new Label("Welcome to the page");
        Button button1 = new Button("Go to Scene 2");
        button1.setOnAction(e -> window.setScene(page2));

        VBox layout1 = new VBox(0);    //VBox stacks the objects on each other with a space of 20
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(title1, button1);
        page1 = new Scene(layout1, 250, 250);

        VBox layout2 = new VBox(20);
        layout2.setAlignment(Pos.CENTER);
        page2 = new Scene(layout2, 250, 250);

        Button button2 = new Button("Click Me");
        button2.setOnAction(e -> alerter.ErrorBox("Formatting is always important"));
        layout2.getChildren().add(button2);

        window.setScene(page1);
        window.setTitle("Testing GUI");
        window.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
