package Profile;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ProfileController implements Initializable {
    @FXML
    public Button handleProfileButton;
    @FXML
    public Button handleHomeButton;

    public void handleNavButton(ActionEvent event) throws IOException {
        System.out.println("Click");
        Parent newScene = null;
        if (event.getSource()==handleProfileButton){
            newScene = FXMLLoader.load(getClass().getResource("/Profile/ProfileScreen.fxml"));}
        else if(event.getSource()== handleHomeButton){
            newScene = FXMLLoader.load(getClass().getResource("/HomeAndMain/FirstScene.fxml"));

        }
        Scene profileScene= new Scene(newScene);
        Stage appStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        appStage.setScene(profileScene);
        appStage.show();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb){}
}
