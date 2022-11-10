module uz.bakhromjon.javafxchoicebox {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxchoicebox to javafx.fxml;
    exports uz.bakhromjon.javafxchoicebox;
}