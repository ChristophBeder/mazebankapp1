package org.example.mazebank.Controllers.Client;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import org.example.mazebank.Models.Transaction;

public class TransactionsCellFactory extends ListCell<Transaction> {
    @Override
    protected void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if(empty){
            setText(null);
            setGraphic(null);
        }
        else{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/TransactionCell.fxml"));
            TransactionCellController controller = new TransactionCellController(transaction);
            loader.setController(controller);
            setText(null);
            try {
                setGraphic(loader.load());
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
