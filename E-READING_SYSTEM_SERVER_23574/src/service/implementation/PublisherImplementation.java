/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.Publisherdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Publisher;
import service.PublisherInterface;

/**
 *
 * @author ZIPTECH LTD
 */
public class PublisherImplementation extends UnicastRemoteObject implements PublisherInterface {

     public PublisherImplementation() throws RemoteException{
    super();
     }
    public Publisherdao dao = new Publisherdao();
    @Override
    public String registerPublisher(Publisher publish) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return dao.registerPublisher(publish);
    }

    @Override
    public String updatePublisher(Publisher publish) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     return dao.updatePublisher(publish);
    }

    @Override
    public String deletePublisher(Publisher publish) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.deletePublisher(publish);
    }

    @Override
    public List<Publisher> allPublisher() throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return dao.allPublisher();
    }

    @Override
    public Publisher getPublisherById(Publisher publish) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return dao.getPublisherById(publish);
    }
    
}
