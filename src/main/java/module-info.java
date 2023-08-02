module com.manthan.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.manthan.connect4 to javafx.fxml;
    exports com.manthan.connect4;
}