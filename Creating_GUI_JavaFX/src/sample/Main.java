package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("First GUI");   // Stage is the window and the title is First Gui
        button = new Button();  //Create new button object
        button.setText("Click Me!");    //Label for the button

        button.setOnAction(e -> System.out.println("Testing"));   //this is saying that the handle method is in this class. You can change that to any class

        StackPane layout = new StackPane(); //This is the general simple layout
        layout.getChildren().add(button);

        Scene page = new Scene(layout, 500, 500);
        primaryStage.setScene(page);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
