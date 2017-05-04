import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/4/2017.
 * simple javafx application with two button , where each button has different activity
 */
public class class02 extends Application{

    Button button1 = new Button();
    Button button2 = new Button();

    public static void main(String args[]){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is the tile for two button app");
        button1.setText("This is button 1");
        button2.setText("This is button 2");

        Pane layout = new Pane();
        layout.getChildren().add(button1);
        layout.getChildren().add(button2);

        button1.setLayoutX(100);
        button1.setLayoutY(100);
        button2.setLayoutX(100);
        button2.setLayoutY(200);


        Scene scene = new Scene(layout,600,600);
        primaryStage.setScene(scene);

        primaryStage.show();

        button1.setOnAction(e->System.out.println("Button one is clicked Sir"));
        button2.setOnAction(e->System.out.println("Button two is clicked Sir"));


    }
}
