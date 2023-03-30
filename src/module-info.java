module MusicRankingSoftware {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    opens HomeAndMain;
    opens Profile;
    exports Profile to javafx.fxml;
    exports HomeAndMain to javafx.fxml;

}