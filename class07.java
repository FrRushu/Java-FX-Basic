import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/5/2017.
 * GridPane Layout Example
 */
public class class07 extends Application{

    public static void main(String args []){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane  gridPane = new GridPane();
        gridPane.setPadding(new Insets(25,8,8,45));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Name");
        GridPane.setConstraints(nameLabel,0,0);

        TextField nameText = new TextField("enter your name ");
        GridPane.setConstraints(nameText,1,0);

        Label contactLabel = new Label("Contact");
        GridPane.setConstraints(contactLabel,0,1);

        TextField contactText = new TextField("enter your contact");
        GridPane.setConstraints(contactText,1,1);

        Label buttonLabel = new Label("Submit");
        GridPane.setConstraints(buttonLabel,0,2);

        Button button =new Button("Update Your Information");
        GridPane.setConstraints(button,1,2);

        gridPane.getChildren().addAll(nameLabel,nameText,contactLabel,contactText,buttonLabel,button);
        Scene scene = new Scene(gridPane,300,150);

        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
