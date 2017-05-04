import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/4/2017.
 * simple Button Event Handle
 */
public class class02 extends Application implements EventHandler{

    Button button = new Button();

    public static void main(String args []){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is a title");
        button.setText("This is a button");
        //button.setOnAction(this); define the action when the button is clicked
        button.setOnAction(this);

        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(button);

        Scene scene =new Scene(stackPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @Override
    public void handle(Event event) {

        if(event.getSource() == button){
            System.out.println("The button has been clicked.");
        }

    }
}
