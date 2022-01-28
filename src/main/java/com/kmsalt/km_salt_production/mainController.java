package com.kmsalt.km_salt_production;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class mainController implements Initializable {

    @FXML
    private Circle proFile;
    @FXML
    private Circle proFile1;

    private void proFileLoader(){
        Image img = new Image("D:\\KM_Salt_Production\\src\\main\\resources\\com\\kmsalt\\km_salt_production\\image\\profile.png");
        proFile.setFill(new ImagePattern(img));
    }
    private void companyFileLoader(){
        Image img = new Image("D:\\KM_Salt_Production\\src\\main\\resources\\com\\kmsalt\\km_salt_production\\image\\company_logo.png");
        proFile1.setFill(new ImagePattern(img));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
     proFileLoader();
     companyFileLoader();
    }
}
