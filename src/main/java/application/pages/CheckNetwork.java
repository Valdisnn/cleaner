package application.pages;

import application.MainPageController;
import application.tools.ExeTools;
import javafx.fxml.FXML;

public class CheckNetwork {

    private PageController pageController = new PageController();

    @FXML
    public void clear() {
        ExeTools.startExeService("check.bat", "/application/ExeServices/check.bat");
        pageController.loadPage(
                MainPageController.getWorkspace(),
                "/application/WorkPages/SubPages/AfterClearingMemory.fxml"
        );
    }

    @FXML
    public void backButton() {
        pageController.loadPage(
                MainPageController.getWorkspace(),
                "/application/WorkPages/CheckNetwork.fxml"
        );
    }
}
