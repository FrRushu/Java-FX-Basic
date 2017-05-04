
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/4/2017.
 * created for tutorial purpose
 * this app in class01 just contain a button
 */

//extends Application as to make this project use javafx
public class class01 extends Application{

    Button button = new Button();

    public static void main (String args){

        //launch method is used to launch the window , in this case the which contain a button called "This is a button"
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Window in javafx is called Stage  && the contain inside of it is called scene


        //primaryStage.setTitle(""); is used to set the title
        primaryStage.setTitle("This is a title");


        //button.setText(""); define which text will appear in this button
        button.setText("This is a button");


        //StackPane is just like a layout
        StackPane stackPane = new StackPane();


        //adding a button in the stack pane where stackPane-->Layout
        stackPane.getChildren().add(button);

        //Alt+Enter for auto import
        Scene scene =new  Scene(stackPane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
