package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                Main.class.getResource("MainApplication.fxml")
        );
        Scene scene = new Scene(fxmlLoader.load());
        Platform.setImplicitExit(false);
        Window window = Window.getInstance(stage, scene);
        window.dragging();
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setHeight(530);
        stage.setWidth(825);
        stage.setTitle("JavaFX | Ranepa");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}