package com.mkyong.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Mroziqella on 23.10.2017.
 */
@Document
public class DayDocument {
    @Id
    private String id;
    private Date date;
    private String desc;

    public DayDocument() {
    }

    public DayDocument(Date date, String desc) {
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
