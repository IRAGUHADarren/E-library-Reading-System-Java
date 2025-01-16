/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 *
 * @author ZIPTECH LTD
 */

public class Book implements Serializable {
 
   private String bookID;
    private String bookName;
    private Date dateReleased;
    private byte[] bookPdf;
    private String dateCategory;
    private String author;
    private String publishername_fk;

    public Book() {
    }



    public Book(String bookID, String bookName, Date dateReleased, byte[] bookPdf, String dateCategory, String author, String publishername_fk) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.dateReleased = dateReleased;
        this.bookPdf = bookPdf;
        this.dateCategory = dateCategory;
        this.author = author;
        this.publishername_fk = publishername_fk;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getDateReleased() {
        return dateReleased;
    }

    public void setDateReleased(Date dateReleased) {
        this.dateReleased = dateReleased;
    }

    public byte[] getBookPdf() {
        return bookPdf;
    }

    public void setBookPdf(byte[] bookPdf) {
        this.bookPdf = bookPdf;
    }

    public String getDateCategory() {
        return dateCategory;
    }

    public void setDateCategory(String dateCategory) {
        this.dateCategory = dateCategory;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishername_fk() {
        return publishername_fk;
    }

    public void setPublishername_fk(String publishername_fk) {
        this.publishername_fk = publishername_fk;
    }
    

    
}




