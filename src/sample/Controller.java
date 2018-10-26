package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button okButton;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void exit() {
        Platform.exit();
    }
    public void aboutUs() {
        // Possible IOException, but load scene anyway
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("aboutus.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("About us");
            stage.getIcons().add(new Image("sample/WesternLogo.png"));
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e) {
            System.out.print("uh oh");
        }
    }
    public void exitAboutUs() {
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }
}
