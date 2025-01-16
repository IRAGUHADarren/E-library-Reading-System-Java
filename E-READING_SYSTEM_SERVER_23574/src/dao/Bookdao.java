/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Book;
import model.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ZIPTECH LTD
 */
public class Bookdao {
    public String registerBook(Book book){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(book);
        tr.commit();
        ss.close();
        return "Book Saved Successfully";
    }
    
     public String updateBook(Book book){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.update(book);
        tr.commit();
        ss.close();
        return "Book Updated Successfully";
    }
     
     public String deleteBook(String bookId) {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = ss.beginTransaction();

    Book book = (Book) ss.get(Book.class, bookId);
    if (book != null) {
        ss.delete(book);
        tr.commit();
        ss.close();
        return "success";
    } else {
        ss.close();
        return "Book not found";
    }
}
     
     public List<Book> allBook(){
       Session ss = HibernateUtil.getSessionFactory().openSession();
       List<Book> bookList = ss.createQuery("select book from Book book").list();
       ss.close();
       return bookList;
     }
     
     public Book getBookById(String bookId) {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Book book = (Book) ss.get(Book.class, bookId);
    ss.close();
    return book;
}
}
