package application.tools;

import java.awt.*;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ExeTools {
    /**
     * Метод запускает exe-файл, предварительно распаковывая его в заданную папку
     * @param serviceName должен быть указан в формате "service.exe"
     * @param pathToService должен быть указан в формате "/com/application/pathToExe/program.exe"
     */

    public static void startExeService(String serviceName, String pathToService) {
        Path exe = Path.of(System.getProperty("user.home"), ".Cleaner", serviceName);
        try {
            if (Files.notExists(exe)) {
                try (InputStream in = ExeTools.class.getResourceAsStream(pathToService)) {
                    Files.createDirectories(exe.getParent());
                    Files.copy(in, exe);
                }
            }
            Desktop.getDesktop().open(exe.toFile());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
