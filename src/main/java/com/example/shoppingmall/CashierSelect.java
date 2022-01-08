package com.example.shoppingmall;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CashierSelect {


    public void setbilldetails(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("billdetails.fxml");
    }

    public void goBack(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("cashierLogin.fxml");
    }
}
