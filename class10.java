import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/5/2017.
 * using checkbox
 */
public class class10 extends Application{

    public static void main(String args []){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        CheckBox checkbox1 = new CheckBox("Red");
        CheckBox checkbox2 = new CheckBox("Green");

        Button button = new Button("Click");
        button.setOnAction(event -> checkAction(checkbox1,checkbox2));

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(checkbox1,checkbox2,button);

        Scene scene = new Scene(vBox,200,200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    private void  checkAction(CheckBox checkBox1,CheckBox checkBox2){
        String message;

        if(checkBox1.isSelected()){
            message="red";
        }
        else {
            message="green";
        }
        System.out.println(message);
    }
}
