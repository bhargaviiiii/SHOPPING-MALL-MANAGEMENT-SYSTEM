package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UpdateEmployee extends employees {
    @FXML
    public Button ADD;
    @FXML
    public Button DELETE;
    @FXML
    public Button DISPLAY_ALL;
    @FXML
    public Button BACK;
    @FXML
    public TextField ADHAAR;
    @FXML
    public TextField name;
    @FXML
    public TextField contact;
    @FXML
    public Label checkcr;
    @FXML
    public Label del;
    @FXML
    public Label details;




    @FXML
    public void set_adhaar(ActionEvent event)
    {
        getAdhaar();
    }
    @FXML

    public void ADD(ActionEvent event)
    {
        details.setText("EMPLOYEE ADDED!");
        adhaar_no.add(ADHAAR.getText().toString());
        employee_name.add(name.getText().toString());
        employee_contact.add(contact.getText().toString());
        checkcr.setText("Employee Updated!");

    }

    @FXML
    public void DELETE(ActionEvent event)
    {
        delete(ADHAAR.getText().toString(), name.getText().toString(), contact.getText().toString());
        del.setText("DELETED!");
    }

    @FXML
    public void set_name(ActionEvent event)
    {
        employee_name.add(name.getText());

    }

    public void set_contact(ActionEvent event)
    {
    }

    @FXML
    public void DISPLAYALL(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("displayEmployees.fxml");

    }

    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("adminSelect.fxml");
    }
}
