/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import service.implementation.BookImplementation;
import service.implementation.PublisherImplementation;
import service.implementation.UsersImplementation;


/**
 *
 * @author ZIPTECH LTD
 */
public class Server {
   private UsersImplementation Usersimplementation;
   private BookImplementation Bookimplementation;
   private PublisherImplementation PublisherImplementation;
     public Server() throws RemoteException{
        this.Usersimplementation = new UsersImplementation();
        this.Bookimplementation = new BookImplementation();
        this.PublisherImplementation = new PublisherImplementation();
}
     public static void main(String[] args) {
        try{
    System.setProperty("java.rmi.server.hostname","127.0.0.1");
    Registry registry = LocateRegistry.createRegistry(5000);
    registry.rebind("Users", new UsersImplementation());
    registry.rebind("Book", new BookImplementation());
    registry.rebind("Publisher", new PublisherImplementation());
    System.out.println("Server is running on port 5000");
        }
        catch(Exception ex){
        ex.printStackTrace();
        }
    }
}



