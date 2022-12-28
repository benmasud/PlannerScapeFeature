module r.masud.plannerscapefeature {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens r.masud.plannerscapefeature to javafx.fxml;
    exports r.masud.plannerscapefeature;
}