module com.example.triviasladder {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires eu.hansolo.tilesfx;
    requires org.junit.jupiter.api;

    opens com.example.triviasladder to javafx.fxml;
    exports com.example.triviasladder;
    exports com.example.triviasladder.controller;
    opens com.example.triviasladder.controller to javafx.fxml;
}