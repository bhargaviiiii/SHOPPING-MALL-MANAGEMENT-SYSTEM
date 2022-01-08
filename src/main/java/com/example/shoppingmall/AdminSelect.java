package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;


public class AdminSelect
{
    @FXML
    public Button updateProduct;
    @FXML
    public Button updateEmployee;
    @FXML
    public Button updateCredentials;

    @FXML
    public void setUpdateProduct(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("updateProducts.fxml");

    }
    @FXML
    public void setUpdateEmployee(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("updateEmployee.fxml");

    }
    @FXML
    public void setUpdateCredentials(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("UpdateCredentials.fxml");

    }
    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("loginPage.fxml");
    }


}
