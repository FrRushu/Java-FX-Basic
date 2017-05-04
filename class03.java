import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/4/2017.
 * Event Handle with Lambda expression
 */
public class class03 extends Application {

    Button button = new Button();

    public static void main(String args []){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is a title");
        button.setText("click me");
        button.setOnAction(e->System.out.println("Testing Lambda Expression."));

        StackPane stackPane = new StackPane();

        stackPane.getChildren().add(button);
        Scene scene = new Scene(stackPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }



}
