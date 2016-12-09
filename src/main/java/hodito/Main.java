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
        buildPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void buildPrimaryStage() throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/layout.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Hodito");
        primaryStage.setScene(new Scene(root, 1024, 600));
        primaryStage.show();
    }
}
