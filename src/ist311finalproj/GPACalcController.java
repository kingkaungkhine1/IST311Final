/**
 * Sample Skeleton for 'GPACalcView.fxml' Controller Class
 */

package ist311finalproj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class GPACalcController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="goHomeButton"
    private Button goHomeButton; // Value injected by FXMLLoader
    
    Scene previousScene;

    @FXML
    void clickHomeButton(ActionEvent event) {
        //System.out.println("it works");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        //Stage stage = (Stage)backButton.getScene().getWindow();
        if (null != previousScene){
            stage.setScene(previousScene);
        }
    }
    
    public void setPreviousScene(Scene scene) {
        previousScene = scene;
        //goBackHome.setDisable(false);
        
    } 

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert goHomeButton != null : "fx:id=\"goHomeButton\" was not injected: check your FXML file 'GPACalcView.fxml'.";

    }
}
