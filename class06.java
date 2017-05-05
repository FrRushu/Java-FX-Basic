import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;




/**
 * Created by Rushu on 5/5/2017.
 * How to switch from one scene to other
 */
public class class06 extends Application{

    Stage stage;
    Scene mango,banana;

    public static void main(String args[]){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        stage =primaryStage;
        Label mangoLabel = new Label();
        Button mangoButton = new Button();
        mangoButton.setText("Switch to banana");
        mangoButton.setOnAction(event -> stage.setScene(banana));

        StackPane stackPane =new StackPane();
        stackPane.getChildren().addAll(mangoLabel,mangoButton);
        mango = new Scene(stackPane,400,400);



        Label bananaLabel = new Label();
        Button bananaButton = new Button("Switch to mango");
        bananaButton.setOnAction(event -> stage.setScene(mango));

        StackPane stackPane1 =new StackPane();
        stackPane1.getChildren().addAll(bananaLabel,bananaButton);
        banana = new Scene(stackPane1,600,600);

        stage.setScene(mango);
        stage.show();


    }
}
