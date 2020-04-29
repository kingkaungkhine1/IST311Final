/**
 * Sample Skeleton for 'GPACalcView.fxml' Controller Class
 */

package ist311finalproj;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GPACalcController {

    Scene previousScene;
    
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="goHomeButton"
    private Button goHomeButton; // Value injected by FXMLLoader

    @FXML // fx:id="gpaCalcTable"
    private TableView<?> gpaCalcTable; // Value injected by FXMLLoader

    @FXML // fx:id="classCreditCol"
    private TableColumn<?, ?> classCreditCol; // Value injected by FXMLLoader

    @FXML // fx:id="classGradeCol"
    private TableColumn<?, ?> classGradeCol; // Value injected by FXMLLoader

    @FXML // fx:id="classNameCol"
    private TableColumn<?, ?> classNameCol; // Value injected by FXMLLoader

    @FXML // fx:id="classCredittxt"
    private TextField classCredittxt; // Value injected by FXMLLoader

    @FXML // fx:id="classGradetxt"
    private TextField classGradetxt; // Value injected by FXMLLoader

    @FXML // fx:id="classNametxt"
    private TextField classNametxt; // Value injected by FXMLLoader

    @FXML // fx:id="addRowbtn"
    private Button addRowbtn; // Value injected by FXMLLoader

    @FXML // fx:id="removeRowBtn"
    private Button removeRowBtn; // Value injected by FXMLLoader

    @FXML // fx:id="editRow"
    private CheckBox editRow; // Value injected by FXMLLoader

    @FXML // fx:id="calcGPAbtn"
    private Button calcGPAbtn; // Value injected by FXMLLoader

    @FXML
    void clickAddRowBtn(ActionEvent event) {

    }

    @FXML
    void clickEdit(ActionEvent event) {

    }

    @FXML
    void clickGPAbtn(ActionEvent event) {

    }

    @FXML
    void clickHomeButton(ActionEvent event) {
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

    @FXML
    void clickRemRow(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert goHomeButton != null : "fx:id=\"goHomeButton\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert gpaCalcTable != null : "fx:id=\"gpaCalcTable\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classCreditCol != null : "fx:id=\"classCreditCol\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classGradeCol != null : "fx:id=\"classGradeCol\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classNameCol != null : "fx:id=\"classNameCol\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classCredittxt != null : "fx:id=\"classCredittxt\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classGradetxt != null : "fx:id=\"classGradetxt\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert classNametxt != null : "fx:id=\"classNametxt\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert addRowbtn != null : "fx:id=\"addRowbtn\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert removeRowBtn != null : "fx:id=\"removeRowBtn\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert editRow != null : "fx:id=\"editRow\" was not injected: check your FXML file 'GPACalcView.fxml'.";
        assert calcGPAbtn != null : "fx:id=\"calcGPAbtn\" was not injected: check your FXML file 'GPACalcView.fxml'.";

    }
}
