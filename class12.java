import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/5/2017.
 * Drop Down Menu Using ChoiceBox
 */
public class class12 extends Application{

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        ChoiceBox<String> choiceBox =  new ChoiceBox();
        choiceBox.getItems().add("Green");
        choiceBox.getItems().add("Red");
        choiceBox.getItems().add("Blue");
        choiceBox.getItems().addAll("Orange","Pink","Purple");
        //for adding an option by default
        choiceBox.setValue("Green");

        Button button = new Button("Click Here");
        button.setOnAction(event -> buttonClicked(choiceBox));

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().addAll(choiceBox,button);

        Scene scene = new Scene(vBox,200,220);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public void buttonClicked(ChoiceBox<String> choiceBox){
        String message = choiceBox.getValue();
        System.out.println(message);
    }
}
