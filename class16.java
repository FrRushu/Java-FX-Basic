import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * Created by Rushu on 5/6/2017.
 * Menu Example (Check Menu Items )
 */
public class class16 extends Application {

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
        //checkMenu part start
        CheckMenuItem autoSave = new CheckMenuItem("Auto Save");
        topMenu.getItems().add(autoSave);
        autoSave.setOnAction(event -> {
           if(autoSave.isSelected()){
               System.out.println("AutoSave Enabled");
           }
           else {
               System.out.println("AutoSave Disabled");
           }
        });

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(topMenu);



        BorderPane layout  = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout,500,500);

        primaryStage.setScene(scene);

        primaryStage.show();


    }
}
