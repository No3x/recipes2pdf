package sample.ui;

/**
 * @author Tobias Stelter
 */


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;

public class ControllerAddCookBook {



    @FXML
    private Button closeButton;

    @FXML
    private Button buttonSortLevel;

    @FXML
    private ListView<?> listViewSortLevel;

    @FXML
    private TextField textFieldPicture;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextArea textAreaVorwort;

    @FXML
    private Button generateButton;

    File file;
    String name;
    String foreword;


    @FXML
    private Button browseButton;

        @FXML
        void closeAddCookBook(ActionEvent event) {
            Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();

        }

    @FXML
    void openFileChooser(ActionEvent event) {
        FileHandler fileHandler = new FileHandler();
        this.file = fileHandler.importPicture();
        if(file != null) {
            textFieldPicture.setText(file.getAbsolutePath());
        }

    }

    private String getForeWord(){
        foreword = textAreaVorwort.getText();
        return foreword;
    }
    private String getName(){
        name = textFieldName.getText();
        return  name;
    }

    @FXML
    void openSortLevel(ActionEvent event) {
        ControllerDefault controllerDefault = new ControllerDefault();
        controllerDefault.newWindow(Resources.getSortLevelFXML(), Resources.getSortLevelWindowText(), 300, 200, Resources.getDefaultIcon());

    }


    @FXML
    void generateCookBook(ActionEvent event) {
        getName();
        getForeWord();
        if(this.textFieldName.getText().trim().isEmpty() == false) {
            System.out.println(name + foreword + "file.getName()");
            //Close Stage
            Stage stage = (Stage) generateButton.getScene().getWindow();
            stage.close();
        }else{
            //Exception
        }

    }

    }


