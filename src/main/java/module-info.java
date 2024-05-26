module com.cleaner.main.cleaner {
    requires jdk.management;

    requires java.desktop;
    requires java.logging;
    requires java.security.jgss;

    requires javafx.fxml;
    requires javafx.controls;

    opens application to javafx.fxml;
    opens application.pages to javafx.fxml;

    exports application;
    exports application.pages;
}