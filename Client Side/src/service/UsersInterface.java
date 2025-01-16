/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Users;

/**
 *
 * @author ZIPTECH LTD
 */
public interface UsersInterface extends Remote {
    public String registerUser(Users user) throws RemoteException;
    public String updateUser(String userId, String role) throws RemoteException;
    public String deleteUser(String UserId) throws RemoteException;
    public List<Users> getAllUser(String firstname, String Password) throws RemoteException;
    public List<Users> getAllUsers() throws RemoteException;
       // public Users getUserById(Users user) throws RemoteException;
    public String getUserByUsernameAndPassword(String username, String password) throws RemoteException;
}
