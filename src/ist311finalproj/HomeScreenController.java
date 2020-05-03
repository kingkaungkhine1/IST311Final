/**
 * Sample Skeleton for 'HomeScreenView.fxml' Controller Class
 */
package ist311finalproj;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HomeScreenController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="GPAButton"
    private Button GPAButton; // Value injected by FXMLLoader

    @FXML // fx:id="basicButton"
    private Button basicButton; // Value injected by FXMLLoader

    @FXML // fx:id="financeButton"
    private Button financeButton; // Value injected by FXMLLoader

    @FXML
    void clickBasicButton(ActionEvent event) throws IOException {
        // fxml loader
        FXMLLoader loader = new FXMLLoader(getClass().getResource("BasicCalcView.fxml"));

        // load the ui elements
        Parent basicCalcView = loader.load();
        // load the scene
        Scene basicCalcScene = new Scene(basicCalcView);

        //access the controller and call a method
        BasicCalcController controller = loader.getController();

        // pass currently selected model
//        controller.initData(modelTable.getSelectionModel().getSelectedItem());
        // create a new state
//        Stage stage = new Stage();
//        stage.setScene(tableViewScene);
//        stage.show();
        // pass current scene to return
        controller.setPreviousScene(((Node) event.getSource()).getScene());

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(basicCalcScene);
        window.show();
    }

    @FXML
    void clickFinanceButton(ActionEvent event) throws IOException {
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("FinanceCalcView.fxml"));
      
        // load the ui elements
        Parent financeCalcView = loader2.load();
        
        // load the scene
        Scene financeCalcScene = new Scene(financeCalcView);
        
        //access the controller and call a method
        FinanceCalcController controller = loader2.getController();
        
        // pass current scene to return
        controller.setPreviousScene(((Node) event.getSource()).getScene());
        
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        window.setScene(financeCalcScene);
        window.show();
    }

    @FXML
    void clickGPAButton(ActionEvent event) throws IOException {
        FXMLLoader loader3 = new FXMLLoader(getClass().getResource("GPACalcView.fxml"));

        // load the ui elements
        Parent gpaCalcView = loader3.load();
        // load the scene
        Scene gpaCalcScene = new Scene(gpaCalcView);

        //access the controller and call a method
        GPACalcController controller = loader3.getController();

        // pass currently selected model
//        controller.initData(modelTable.getSelectionModel().getSelectedItem());
        // create a new state
//        Stage stage = new Stage();
//        stage.setScene(tableViewScene);
//        stage.show();
        // pass current scene to return
        controller.setPreviousScene(((Node) event.getSource()).getScene());

        //This line gets the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(gpaCalcScene);
        window.show();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert GPAButton != null : "fx:id=\"GPAButton\" was not injected: check your FXML file 'HomeScreenView.fxml'.";
        assert basicButton != null : "fx:id=\"basicButton\" was not injected: check your FXML file 'HomeScreenView.fxml'.";
        assert financeButton != null : "fx:id=\"financeButton\" was not injected: check your FXML file 'HomeScreenView.fxml'.";

    }
}
