package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public void ErrorBox(String Message){
        Stage popUp = new Stage();
        popUp.initModality(Modality.APPLICATION_MODAL);
        popUp.setTitle("ERROR");
        popUp.setMinWidth(200);
        popUp.setMinHeight(200);

        Label label1 = new Label();
        label1.setText(Message);

        VBox layoutPop = new VBox(20);
        Button closeButt = new Button("Close Window");
        closeButt.setOnAction(e -> popUp.close());
        layoutPop.getChildren().addAll(label1, closeButt);
        layoutPop.setAlignment(Pos.CENTER);

        Scene poper = new Scene(layoutPop);
        popUp.setScene(poper);
        popUp.showAndWait();
    }
}
