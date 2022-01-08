package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class SelectPage
{
    @FXML
    private Button ADMIN;
    @FXML
    private Button CASHIER;
    @FXML
    protected void selectADMIN(ActionEvent event) throws IOException
    {
        HelloApplication m = new HelloApplication();
        m.changeScene("loginPage.fxml");

    }
    @FXML
    protected void selectCashier(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("cashierLogin.fxml");


    }


}
