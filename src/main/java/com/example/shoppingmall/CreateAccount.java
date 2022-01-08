package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class CreateAccount extends Credentials {
    @FXML
    public TextField usernameCr;
    @FXML
    public TextField passwordCr;
    @FXML
    public TextField confirmpasswordCr;
    @FXML
    public Label reenter;
    @FXML
    public void onSubmit(ActionEvent event)
    {
        setpassword(event);
        setUsername(event);
        confirmpasswordCr(event);


    }

    public void confirmpasswordCr(ActionEvent event)
    {
        if (!passwordCr.getText().toString().equals(confirmpasswordCr.getText().toString()))
        {
            reenter.setText("RE-ENTER PASSWORD!");

        }
        else
        {
            reenter.setText("ACCOUNT CREATED!");

        }

    }


    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("loginPage.fxml");
    }

    @FXML
    public void setUsername(ActionEvent event)
    {
        String pw = usernameCr.getText().toString();
        usernames.add(pw);

    }
    @FXML
    public void setpassword(ActionEvent event)
    {
        String un = usernameCr.getText().toString();
        passwords.add(un);
    }


    public void confirmPassword(ActionEvent event)
    {
        confirmpasswordCr(event);
    }
}
