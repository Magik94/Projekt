package com.mkyong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Mroziqella on 23.10.2017.
 */
@Document
public class ExampleDocument {
    @Id
    private String id;
    private Date date;
    private String desc;

    public ExampleDocument() {
    }

    public ExampleDocument(Date date, String desc) {
        this.date = date;
        this.desc = desc;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   public String getDesc (){return  desc;}

   public  void setDesc(String desc){
       this.desc = desc;
   }

}
