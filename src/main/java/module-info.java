module r.masud.pageoneplannerscape {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens r.masud.pageoneplannerscape to javafx.fxml;
    exports r.masud.pageoneplannerscape;
}