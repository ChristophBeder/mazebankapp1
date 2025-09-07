package org.example.mazebank.Controllers.Admin;

import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.example.mazebank.Models.Client;
import org.example.mazebank.Models.Model;
import org.example.mazebank.Views.ClientCellFactory;

import java.net.URL;
import java.util.ResourceBundle;

import java.net.URL;
import java.util.ResourceBundle;

public class ClientsController implements Initializable {
    public ListView<Client> clients_listview;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initClientsList();
        clients_listview.setItems(Model.getInstance().getClients());
        clients_listview.setCellFactory(e -> new ClientCellFactory());
    }

    private void initClientsList() {
        if (Model.getInstance().getClients().isEmpty()){
            Model.getInstance().setClients();
        }
    }
}
