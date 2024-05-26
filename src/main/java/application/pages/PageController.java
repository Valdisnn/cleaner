package application.pages;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PageController {

    /**
     * Метод загружает страницу в BorderPane
     * @param workspace используется для размещения в нем объекта fxml
     * @param path указывается в формате "/application/PageToFXML/object.fxml"
     */

    public void loadPage(BorderPane workspace, String path) {
        if (workspace == null) throw new NullPointerException(
                "workspace is not defined (PageController.java)"
        );

        try {
            AnchorPane loader = FXMLLoader.load(getClass().getResource(path));
            workspace.setCenter(loader);
        } catch (IOException e) {
            Logger.getLogger(PageController.class.getName()).log(
                    Level.SEVERE,
                    null,
                    e
            );
        }
    }
}
