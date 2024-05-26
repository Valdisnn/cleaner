package application.pages;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javafx.fxml.FXML;

public class Info {

    @FXML
    private void sendToSite() {
        try {
            Desktop.getDesktop().browse(new URL("https://google.com").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
