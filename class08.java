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
 * designing login form basic
 */
public class class08 extends Application{

    public static void main(String args []){
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(8,8,8,8));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label nameLabel = new Label("Name");
        GridPane.setConstraints(nameLabel,0,0);

        TextField nameText = new TextField("Enter Your Name");
        GridPane.setConstraints(nameText,1,0);

        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel,0,1);

        TextField password = new TextField("Enter Your Password");
        GridPane.setConstraints(password,1,1);

        Button button = new Button("Login");
        GridPane.setConstraints(button,1,2);
        button.setOnAction(event -> validate(password));


        gridPane.getChildren().addAll(nameLabel,nameText,passwordLabel,password,button);
        Scene scene = new Scene(gridPane,300,500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

     private void validate(TextField pass){
        String newPassword = pass.getText();

        if(newPassword.equals("admin123")){
            System.out.println("Valid User");

        }
        else {
            System.out.println("InValid User");
        }
     }
}
