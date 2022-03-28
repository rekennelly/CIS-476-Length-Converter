package LengthConverter;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kennelra
 */
public class LengthConverterFXMLController implements Initializable {

    @FXML
    private TextField kilometerTextField;
    @FXML
    private TextField convertedValueTextField;
    @FXML
    private ChoiceBox<String> unitChoiceBox;
    @FXML
    private Button convertButton;

    @FXML
    private void handleConvertButton(ActionEvent event) {
        // Set handlers
        Handler mileHandler = new MileHandler();
        Handler yardHandler = new YardHandler();
        Handler footHandler = new FootHandler();
        
        mileHandler.setHandler(yardHandler);
        yardHandler.setHandler(footHandler);
        
        // Get text from input Text Field
        String input = kilometerTextField.getText();
        // Get choice from unitChoice box
        String choice = unitChoiceBox.getSelectionModel().getSelectedItem();
        
        // Process in handlers to get output text
        String output = mileHandler.process(input, choice);
        
        convertedValueTextField.setText(output);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Set choices of choice box
        unitChoiceBox.getItems().add("mile");
        unitChoiceBox.getItems().add("yard");
        unitChoiceBox.getItems().add("foot");
        
        convertedValueTextField.setEditable(false);
    }    

}
