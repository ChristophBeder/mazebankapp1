package org.example.mazebank.Models;

import org.example.mazebank.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private final Client client;

    private Model(){
        this.viewFactory = new ViewFactory();
        this.client = new Client();
    }

    public static synchronized Model getInstance(){
        if(model == null){
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public Client getClient() {
        return client;
    }
}
