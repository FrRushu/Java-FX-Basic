import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/5/2017.
 * Embedding Layouts
 * BorderPane Layout ===>i) HBox (horizontal)  ii)VBox (vertical)
 */
public class class09 extends Application{

    public static void main(String args []){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox topSectionMenu = new HBox();
        Button button1 = new Button("File");
        Button button2 = new Button("Edit");
        Button button3 = new Button("View");
        Button button4 = new Button("Navigate");
        topSectionMenu.getChildren().addAll(button1,button2,button3,button4);


        VBox leftSectionMenu = new VBox();
        Button button11 = new Button("Home");
        Button button22 = new Button("Contact");
        Button button33 = new Button("Address");
        Button button44 = new Button("Back");
        leftSectionMenu.getChildren().addAll(button11,button22,button33,button44);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(topSectionMenu);
        borderPane.setLeft(leftSectionMenu);



        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
