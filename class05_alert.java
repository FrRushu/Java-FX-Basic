import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/4/2017.
 */
public class class05_alert {


    public static void display(String title, String message){

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        stage.setTitle("Alert Box");
        stage.setMinWidth(400);

        Label label =new Label();
        label.setText(message);

        Button button = new Button("Click to close ");
        button.setOnAction(event -> stage.close());

        VBox dummy = new VBox();
        dummy.getChildren().addAll(label,button);
        dummy.setAlignment(Pos.CENTER);

        Scene scene = new Scene(dummy);

        stage.setScene(scene);

        stage.showAndWait();
    }
}
