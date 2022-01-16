package com.example.shoppingmall;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class Billdetails extends BILL
{
    @FXML
    public TextField bill_no;
    @FXML
    public TextField customer_name;
    @FXML
    public TextField prod_id;
    @FXML
    public TextField quantity;
    @FXML
    public TextArea completebill;
    @FXML
    public Button PRODUCTINSERTION;
    @FXML
    public void insertProduct()
    {
        add(prod_id.getText().toString(), quantity.getText().toString());
    }


    @FXML
     public void go_back(ActionEvent event) throws IOException {
        HelloApplication m = new HelloApplication();
        m.changeScene("cashierSelect.fxml");
    }

    public void setbill(ActionEvent event)
    {
        setCompletebill();


    }
    public int setPrice()
    {

      return Integer.parseInt(setPrices(Integer.parseInt(String.valueOf(prices.indexOf(prod_id.getText().toString())))*Integer.parseInt(quantity.getText())));


    }
    public void setCompletebill()
    {
        completebill.setText("Product ID"+ "  "+ getProductId() + "  " + "\n" + "Quantity"+ "  "+ Integer.parseInt(setQuantity()) + "" + "\n Price"+ " " +getPrice());

    }

    public String getBillno()
    {
        return bill_no.getText().toString();
    }
    public String getCustomername()
    {
        return customer_name.getText().toString();
    }
    public String setQuantity()
    {
        return this.quantity.getText().toString();
    }
    public String getProductId()
    {
        add(prod_id.getText());
        return prod_id.getText().toString();
    }




    public void insertproduct(ActionEvent event)
    {
        add(prod_id.getText().toString());

    }
}
