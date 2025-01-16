/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.Bookdao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Book;
import service.BookInterface;
import service.UsersInterface;

/**
 *
 * @author ZIPTECH LTD
 */
public class BookImplementation extends UnicastRemoteObject implements BookInterface {
   
     public BookImplementation() throws RemoteException{
    super();
     }
     public Bookdao dao = new Bookdao();
    @Override
    public String registerBook(Book book) throws RemoteException {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.registerBook(book);
    }

    @Override
    public String updateBook(Book book) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.updateBook(book);
    }

    @Override
    public String deleteBook(String bookId) throws RemoteException {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.deleteBook(bookId);
    }

    @Override
    public List<Book> getAllBook() throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.allBook();
    }

    @Override
    public  Book getBookById(String bookId) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return dao.getBookById(bookId);
    }
    
}
