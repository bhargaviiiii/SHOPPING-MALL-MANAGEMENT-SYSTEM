package com.example.shoppingmall;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DisplayEmployees  implements Initializable
{

    @FXML
    public TableView<employees> tableView;
    @FXML private TableColumn<employees, String> Name;
    @FXML private TableColumn<employees, String> Number;
    @FXML private TableColumn<employees, String> adhaar;



    @FXML

    final ObservableList<employees> dataList = FXCollections.observableArrayList();





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        employees a=new employees();
        a.add("123","dev", "258" );
        dataList.add(a);

        employees b=new employees();
        b.add("123","desh", "288" );
        dataList.add(b);

        employees c=new employees();
        c.add("123","anil", "268" );
        dataList.add(c);




        Name.setCellValueFactory(new PropertyValueFactory<employees, String>("Name"));

        Number.setCellValueFactory(new PropertyValueFactory<employees, String>("Number"));

        adhaar.setCellValueFactory(new PropertyValueFactory<employees, String>("adhaar"));

        tableView.setItems(dataList);



    }
}
