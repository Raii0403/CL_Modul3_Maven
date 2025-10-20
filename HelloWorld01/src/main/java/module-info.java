module org.example.helloworld01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.helloworld01 to javafx.fxml;
    exports org.example.helloworld01;
}