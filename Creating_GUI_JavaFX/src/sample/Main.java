package sample;

import javafx.application.Application;
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
