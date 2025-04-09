module frame {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    opens frame to javafx.fxml;
    exports frame;
}