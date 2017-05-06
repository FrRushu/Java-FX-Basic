import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/6/2017.
 * Menu Example (How to create and Add menu )
 */
public class class15 extends Application {

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Menu topMenu = new Menu("File");

        topMenu.getItems().add(new MenuItem("New"));
        topMenu.getItems().add(new MenuItem("Open"));
        topMenu.getItems().add(new MenuItem("Recent"));
        topMenu.getItems().add(new MenuItem("Close"));

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(topMenu);



        BorderPane layout  = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout,500,500);

        primaryStage.setScene(scene);

        primaryStage.show();


    }
}
