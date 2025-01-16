/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Users;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ZIPTECH LTD
 */
public class UsersDao {
        public String registerUser(Users users){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
        ss.save(users);
        tr.commit();
        ss.close();
        return "User Saved Successfully";
    }
    
     public String updateUser(String userId, String role) {
    Session ss = HibernateUtil.getSessionFactory().openSession();
    Transaction tr = ss.beginTransaction();
    Users user = (Users) ss.get(Users.class, userId);
    if (user != null) {
        user.setRole(role);
        ss.update(user);
        tr.commit();
        ss.close();
        return "Data Updated Successfully";
    } else {
        // Handle the case when the user with the given ID is not found
        ss.close();
        return "User Not Found";
    }
}
     
     public String deleteUser(String UserId){
        Session ss = HibernateUtil.getSessionFactory().openSession();
        Transaction tr = ss.beginTransaction();
         Users users = (Users) ss.get(Users.class, UserId);
        ss.delete(users);
        tr.commit();
        ss.close();
        return "Citizen Deleted Successfully";
    }
     
     public List<Users> allUser(String firstname, String Password){
       Session ss = HibernateUtil.getSessionFactory().openSession();
       List<Users> usersList = null;
               //ss.createQuery("select users from Users users").list();
               
               try {
                  Query query = ss.createQuery("select users from Users users where users.firstname = :firstname and users.Password = :Password");
                  query.setParameter("firstname", firstname);
                  query.setParameter("Password", Password);
                  usersList = query.list();
               }
               catch(Exception ex){
               ex.printStackTrace();
               }
       ss.close();
       return usersList;
     }
     
     public List<Users> allUsers(){
     Session ss = HibernateUtil.getSessionFactory().openSession();
       List<Users> userList = ss.createQuery("select users from Users users").list();
       ss.close();
       return userList;
     }
     
     public Users getUserById(Users users){
       Session ss = HibernateUtil.getSessionFactory().openSession();
       Users usr = (Users)ss.get(Users.class, users.getUser_id());
       ss.close();
       return usr;
     }
     
//     public Users getUserByUsernameAndPassword(String username, String password) {
//    Session ss = HibernateUtil.getSessionFactory().openSession();
//         Criteria criteria = ss.createCriteria(Users.class);
//    criteria.add(Restrictions.eq("username", username));
//    criteria.add(Restrictions.eq("password", password));
//    Users user = (Users) criteria.uniqueResult();
//    ss.close();
//    return user;
//}
}
