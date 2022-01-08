package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UpdateCredentials extends EmployeesCredentials
{
    @FXML
    public TextField usernameE;
    public TextField passwordE;
    public PasswordField confirm_passwordE;
    public Label update;
    public Label del;

    @FXML
    public void set_username(ActionEvent event)
    {
        getEUsername();

    }

    @FXML
    public void ADD(ActionEvent event)
    {
        eUsername.add(usernameE.getText().toString());
        ePassword.add(passwordE.getText().toString());
        if (passwordE.getText().toString().equals(confirm_passwordE.getText().toString()))
        {
            update.setText("Credentials Updated!");
        }
        else
        {
            update.setText("Re-Enter Password!");
        }
    }

    @FXML
    public void DELETE(ActionEvent event) {
        delete(passwordE.getText().toString(), passwordE.getText().toString(), confirm_passwordE.getText().toString());
        del.setText("DELETED!");
    }

    @FXML
    public void set_password(ActionEvent event) {
        getEPassword();
    }


    @FXML
    public void DISPLAYALL(ActionEvent event) {
    }

    @FXML
    public void confirm_password(ActionEvent event) {

    }


    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("adminSelect.fxml");
    }
}
