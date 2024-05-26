package application;

import application.appOff.Observer;
import application.pages.PageController;
import application.tools.ButtonTools;
import application.tools.ConverterTools;
import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainPageController implements Initializable {

    @FXML
    private VBox containerButtons;

    @FXML
    private BorderPane workspace;

    private static BorderPane mainWorkspace;
    private List<Observer> observers = new ArrayList<>();
    private List<Button> modeSelections = new ArrayList<>();
    private PageController pageController = new PageController();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ConverterTools.vboxToList(containerButtons, modeSelections);
        mainWorkspace = workspace;
    }

    public static BorderPane getWorkspace() {
        return mainWorkspace;
    }

    /**
     * @param observer используется при завершении работы программы
     */

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @FXML
    private void temp(ActionEvent event) {
        pageController.loadPage(
                workspace,
                "/application/WorkPages/Temp.fxml"
        );
        ButtonTools.buttonBacklight((Button) event.getSource(), modeSelections);
    }

    @FXML
    private void checkNetwork(ActionEvent event) {
        pageController.loadPage(
                workspace,
                "/application/WorkPages/CheckNetwork.fxml"
        );
        ButtonTools.buttonBacklight((Button) event.getSource(), modeSelections);
    }

    @FXML
    private void infoPC(ActionEvent event) {
        pageController.loadPage(
                workspace,
                "/application/WorkPages/InfoPC.fxml"
        );
        ButtonTools.buttonBacklight((Button) event.getSource(), modeSelections);
    }

    @FXML
    private void info(ActionEvent event) {
        pageController.loadPage(
                workspace,
                "/application/WorkPages/Info.fxml"
        );
        ButtonTools.buttonBacklight((Button) event.getSource(), modeSelections);
    }

    /**
     * Уведомляет все слушатели событий о завершении работы
     */

    @FXML
    private void closeProgram() {
        addObserver(Window.getInstance(null, null));

        for (Observer observer : observers) observer.update();
    }
}
