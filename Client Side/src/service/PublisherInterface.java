/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Publisher;

/**
 *
 * @author ZIPTECH LTD
 */
public interface PublisherInterface extends Remote {
    public String registerPublisher(Publisher  publish) throws RemoteException;
    public String updatePublisher(Publisher  publish) throws RemoteException;
    public String deletePublisher(Publisher  publish) throws RemoteException;
    public List<Publisher> allPublisher() throws RemoteException;
    public Publisher getPublisherById(Publisher  publish) throws RemoteException;
}
