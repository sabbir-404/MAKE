module ordertracking.make {
    requires javafx.controls;
    requires javafx.fxml;


    opens ordertracking.make to javafx.fxml;
    exports ordertracking.make;
}