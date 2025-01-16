/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.UsersDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Users;
import service.UsersInterface;

/**
 *
 * @author ZIPTECH LTD
 */
public class UsersImplementation  extends UnicastRemoteObject implements UsersInterface {

    
    public UsersImplementation() throws RemoteException{
    super();
     }
    public UsersDao dao = new UsersDao();
    
    @Override
    public String registerUser(Users user) throws RemoteException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.registerUser(user);
    }

    @Override
    public String updateUser(String userId, String role) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.updateUser(userId, role);
    }


    @Override
    public List<Users> getAllUser(String firstname, String Password) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.allUser(firstname, Password);
    }

    @Override
    public Users getUserById(Users user) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.getUserById(user);
    }

  

    @Override
    public List<Users> getAllUsers() throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.allUsers();
    }

    @Override
    public String deleteUser(String UserId) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return dao.deleteUser(UserId);
    }

   



    
}
