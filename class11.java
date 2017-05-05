import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/5/2017.
 * ComboBox example
 */
public class class11 extends Application {

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        ComboBox<String> comboBox = new ComboBox();
        comboBox.getItems().addAll("Red","Blue","Green","Pink");
        comboBox.setPromptText("Red");
        comboBox.setOnAction(event -> System.out.println(comboBox.getValue()));


        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().addAll(comboBox);

        Scene scene = new Scene(vBox,200,200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
