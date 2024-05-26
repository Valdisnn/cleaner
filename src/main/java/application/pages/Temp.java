package application.pages;

import application.MainPageController;
import application.tools.ExeTools;
import javafx.fxml.FXML;

public class Temp {

    private PageController pageController = new PageController();

    @FXML
    public void clear() {
        pageController.loadPage(
                MainPageController.getWorkspace(),
                "/application/WorkPages/SubPages/ExTemp.fxml"
        );
        ExeTools.startExeService("temp.bat", "/application/ExeServices/temp.bat");
    }

    @FXML
    public void backButton() {
        pageController.loadPage(
                MainPageController.getWorkspace(),
                "/application/WorkPages/Temp.fxml"
        );
    }
}
