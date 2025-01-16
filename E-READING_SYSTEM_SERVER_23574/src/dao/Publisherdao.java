/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.*;

/**
 *
 * @author ZIPTECH LTD
 */
public class Publisherdao {
    public String registerPublisher(Publisher  publish){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(publish);
        tr.commit();
        ss.close();
        return "Data Saved Successfully";
    }
    
     public String updatePublisher(Publisher  publish){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        Publisher pub = getPublisherById(publish);
        ss.update(pub);
        tr.commit();
        ss.close();
        return "Data Updated Successfully";
    }
     
     public String deletePublisher(Publisher  publish){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        
        ss.delete(publish);
        tr.commit();
        ss.close();
        return "Citizen Deleted Successfully";
    }
     
     public List<Publisher> allPublisher(){
       Session ss = HibernateUtil.getSessionFactory().openSession();
       List<Publisher> publishList = ss.createQuery("select pub from Publisher pub").list();
       ss.close();
       return publishList;
     }
     
     public Publisher getPublisherById(Publisher  publish){
       Session ss = HibernateUtil.getSessionFactory().openSession();
       Publisher pub = (Publisher)ss.get(Publisher.class, publish.getPublisher_id());
       ss.close();
       return pub;
     }
}
