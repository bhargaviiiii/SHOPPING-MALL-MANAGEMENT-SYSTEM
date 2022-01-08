package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class UpdateProducts extends products
{
    @FXML
    public TextField product_id;
    public TextField product_name;
    public TextField company;
    public TextField PRICE;
    public TextField product_type;
    public Button ADD;
    public Button delete;
    public Button DISPLAY_ALL;
    public Button back;
    public Label text;
    public Label del;


    @FXML
    public void set_productid(ActionEvent event) 
    {
        ids.add(product_id.getText());
    }

    @FXML
    public void ADD(ActionEvent event) 
    {
        text.setText("Product Added!");
        add(product_id.getText(), product_name.getText().toString(), product_type.getText().toString(), company.getText().toString(), PRICE.getText());
    }

    @FXML
    public void delete(ActionEvent event) 
    {
        delete(product_id.getText(), product_name.getText().toString(), product_type.getText().toString(), company.getText().toString(), PRICE.getText());
        del.setText("DELETED!");
    }

    @FXML
    public void setproduct_name(ActionEvent event) 
    {
        names.add(product_name.getText().toString());
    }

    @FXML
    public void set_company(ActionEvent event) 
    {
        companies.add(company.getText().toString());
    }

    @FXML
    public void display_all(ActionEvent event)
    {

    }

    @FXML
    public void set_producttype(ActionEvent event)
    {
        types.add(product_type.getText().toString());

    }

    @FXML
    public void set_productprice(ActionEvent event)
    {
        prices.add(PRICE.getText().toString());

    }

    @FXML
    public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("adminSelect.fxml");
    }
}
