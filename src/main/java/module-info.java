module org.example.week11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.net.http;

    opens org.example.week11 to javafx.fxml, com.google.gson;
    exports org.example.week11;
}
