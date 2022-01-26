module com.kmsalt.km_salt_production {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.kmsalt.km_salt_production to javafx.fxml;
    exports com.kmsalt.km_salt_production;
}