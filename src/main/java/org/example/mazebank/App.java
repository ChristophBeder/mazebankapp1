package org.example.mazebank;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.mazebank.Models.Model;

/**
 * Hello world!
 *
 */
public class App extends Application
{
    @Override
    public void start(Stage stage){
        System.setProperty("javafx.verbose", "true");
        Model.getInstance().getViewFactory().showLoginWindow();
    }


}
