package application.pages;

import com.sun.management.OperatingSystemMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class InfoPC {

    @FXML
    private VBox container;

    private List<Label> parameters = new ArrayList<>();
    private OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
            OperatingSystemMXBean.class
    );

    @FXML
    public void initialize() {
        long totalMemoryGb =
                osBean.getTotalMemorySize() / (1024 * 1024);
        long freeMemoryGb =
                osBean.getFreeMemorySize() / (1024 * 1024);

        parameters.add(new Label("Система"));
        parameters.add(
                new Label("Наименование ОС: " + System.getProperty("os.name") + " (" + System.getProperty("os.version") + ")")
        );
        parameters.add(new Label("Архитектура: " + System.getProperty("os.arch")));
        parameters.add(new Label(""));
        parameters.add(new Label("ЦПУ"));
        parameters.add(
                new Label("Ядра: " + (Runtime.getRuntime().availableProcessors())/2)
        );
        parameters.add(
                new Label("Потоки: " + Runtime.getRuntime().availableProcessors())
        );
        parameters.add(new Label(""));
        parameters.add(new Label("RAM"));
        parameters.add(new Label("Всего памяти: " + totalMemoryGb + " МБ"));
        parameters.add(new Label("Свободно памяти: " + freeMemoryGb + " МБ"));

        for (Label label : parameters) {
            container.getChildren().add(label);
        }
    }
}
