import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

/**
 * Created by Rushu on 5/6/2017.
 * ListView example
 */
public class class13 extends Application {


    ListView<String> listView;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        listView = new ListView();
        listView.getItems().addAll("Item1","Item2","Item3","Item4");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        Button button = new Button("Click");
        button.setOnAction(event -> buttonClicked());


        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().addAll(listView,button);


        Scene scene = new Scene(vBox,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public void buttonClicked(){
        String message ="";
        ObservableList<String> item ;
        item = listView.getSelectionModel().getSelectedItems();

        for (String m:item){
            message+=m+"\n";
        }

        System.out.println(message);
    }
}
