package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CashierLogin extends EmployeesCredentials
{
    @FXML
    public Button SUBMIT;
    @FXML
    public TextField username;
    @FXML
    public PasswordField password;
    @FXML
    public Button CREATE_ACCOUNT;
    @FXML
    public Label Incorrect_Password;
    @FXML
    public Stage stage;
    @FXML
    public void onSubmit() throws IOException
    {
        if(checkLogin())
        {
            {
                HelloApplication m = new HelloApplication();
                m.changeScene("cashierSelect.fxml");
            }
        }
        else
        {
            Incorrect_Password.setText("Incorrect Credentials!");
        }


    }
    public void setUsername(String usernameM, String passwordM)
    {
        super.add(username.getText().toString(), password.getText().toString());
    }



    public boolean checkLogin()
    {

        return  ((eUsername.indexOf(username.getText().toString())==ePassword.indexOf(password.getText().toString())&&eUsername.contains(username.getText().toString())));


    }



    @FXML
    public void setPassword( ActionEvent event)
    {

        String pass = password.getText().toString();
        ePassword.add(pass);

    }
    @FXML
    public void setCREATE_ACCOUNT(ActionEvent event) throws IOException
    {
        HelloApplication p = new HelloApplication();
        p.changeScene("createAccount.fxml");

    }
    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("selectPage.fxml");
    }

    public void setUsername(ActionEvent event)
    {

        String m = username.getText().toString();
        eUsername.add(m);
    }
}
