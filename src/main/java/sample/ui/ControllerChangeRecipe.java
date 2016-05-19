package sample.ui;

/**
 * @author Tobias Stelter
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.File;

public class ControllerChangeRecipe {


    @FXML
    private TextField textFieldName;

    @FXML
    private TextArea textAreaZubereitungstext;

    @FXML
    private TextField textFieldZubereitungszeit;

    @FXML
    private TextField textFieldErnaehrungsart;

    @FXML
    private TextField textFieldGerichtart;

    @FXML
    private TextField textFieldPortion;

    @FXML
    private TextField textFieldRegion;

    @FXML
    private TextField textFieldCategory;

    @FXML
    private TextField textFieldSource;

    @FXML
    private TextField textFieldSaison;

    @FXML
    private TextField textFieldDaytime;

    @FXML
    private Button fileChooserButton;

    @FXML
    private TextField textFieldPicture;

        @FXML
        private Button closeButton;

    @FXML
    private Button changeButton;

        @FXML
        void closeChangeRecipe(ActionEvent event) {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();

        }

    @FXML
    void changeRecipe(ActionEvent event) {

        ControllerDefault controllerDefault = new ControllerDefault();
        controllerDefault.newWindowNotResizable(Resources.getNoElementsSelectedFXML(), Resources.getErrorWindowText());

        Stage stage = (Stage) changeButton.getScene().getWindow();
        stage.close();

    }

    @FXML
    void openFileChooser(ActionEvent event) {
        FileHandler fileHandler = new FileHandler();
        File file = fileHandler.importFile();
        if(file != null) {
            textFieldPicture.setText(file.getAbsolutePath());
        }


    }


}


