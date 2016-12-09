package hodito;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.buildPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    protected void buildPrimaryStage() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Resources/layout.fxml"));
        this.getPrimaryStage().setTitle("Hodito");
        this.getPrimaryStage().setScene(new Scene(root, 1024, 600));
        this.getPrimaryStage().show();
    }

    protected Stage getPrimaryStage(){
        return this.primaryStage;
    }
}
