/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author ZIPTECH LTD
 */
public class Publisher implements Serializable {
    private String publisher_id;
    private String publishername;
    private String contactinfo;

    public Publisher() {
    }

    public Publisher(String publisher_id, String publishername, String contactinfo) {
        this.publisher_id = publisher_id;
        this.publishername = publishername;
        this.contactinfo = contactinfo;
    }

    public String getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(String publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public String getContactinfo() {
        return contactinfo;
    }

    public void setContactinfo(String contactinfo) {
        this.contactinfo = contactinfo;
    }
    
}
