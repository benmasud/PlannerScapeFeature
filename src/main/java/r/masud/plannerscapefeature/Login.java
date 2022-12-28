package r.masud.plannerscapefeature;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 750, 450);

        //stage.initStyle(StageStyle.UNDECORATED);
        // to remove the minimizer and name from the top

        stage.setTitle("PlannerScape");
        stage.getIcons().add(new Image("C:\\Users\\Asus\\IdeaProjects\\PlannerScapeFeature\\src\\main\\resources\\r\\masud\\plannerscapefeature\\plannerscape logo format.jpg"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}