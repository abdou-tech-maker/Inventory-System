package sample.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;

import javafx.fxml.Initializable;


import javafx.stage.Stage;

public class SignUp_Controller implements Initializable {

    @FXML
    private ImageView Exit;
    @FXML
    private AnchorPane root;
    private double x, y;
    @FXML
    private Button btnSignUp;




    @FXML
    private void Handle () throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("Gui/MainPage.fxml"));
        Stage window = (Stage) btnSignUp.getScene().getWindow();
        window.setScene(new Scene(root));
        window.show();
    }


    @FXML
    void dragged(MouseEvent ev) {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setX(ev.getScreenX() - x);
        stage.setY(ev.getScreenY() - y);
    }
    @FXML
    void pressed(MouseEvent ev) {
        x = ev.getSceneX();
        y = ev.getSceneY();
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Exit.setOnMouseClicked(event -> System.exit(0));


    }


}


