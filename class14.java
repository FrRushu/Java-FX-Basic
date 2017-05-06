import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Rushu on 5/6/2017.
 * TreeView Example
 */
public class class14 extends Application {

    TreeView<String> tree;

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        TreeItem<String> root,food,drinks;
        ///setting up the root==>(root of the tree)
        root = new TreeItem<>();
        root.setExpanded(true);

        //setting up the food branch

        food = setBranch("Food",root);
        setBranch("Burger",food);
        setBranch("Pizza",food);
        setBranch("Bacon",food);


        //setting up the drinks branch

        drinks = setBranch("Drink",root);
        setBranch("Soda",drinks);
        setBranch("7 UP",drinks);
        setBranch("Pepsi",drinks);


        //creating new tree to add branches
        tree = new TreeView<>(root);
        tree.setShowRoot(false);


        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20,20,20,20));
        vBox.getChildren().add(tree);


        Scene scene = new Scene(vBox,200,200);

        primaryStage.setScene(scene);

        primaryStage.show();

    }

    public TreeItem<String> setBranch(String title , TreeItem<String> parent){

        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return item;
    }


}
