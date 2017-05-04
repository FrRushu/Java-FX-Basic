import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/4/2017.
 * Alert Box example 
 */
public class class05 extends Application{

    Button button = new Button();

    public static void main(String args[]){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        button.setText("Click Here");
        button.setOnAction(e -> class05_alert.display("Alert Box Demo","Hello Sir , This is working "));


        StackPane stackPane =new StackPane();
        stackPane.getChildren().add(button);
        Scene scene =new Scene(stackPane,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
