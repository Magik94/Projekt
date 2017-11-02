package com.mkyong.Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Mroziqella on 23.10.2017.
 */
@Document
public class DayDocument {
    @Id
    private String id;
    private LocalDate localDate;
    private String desc;
    private String nextDate;
    private String previousDate;

    public DayDocument() {
    }

    public DayDocument(LocalDate localDate, String desc) {
        this.localDate = localDate;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "DayDocument{" +
                "id='" + id + '\'' +
                ", localDate=" + localDate +
                ", desc='" + desc + '\'' +
                ", nextDate='" + nextDate + '\'' +
                ", previousDate='" + previousDate + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate ;
    }

    public void setLocalDate (LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDesc (){return  desc;}

    public  void setDesc(String desc){
       this.desc = desc;
   }

    public String getNextDate() {return nextDate;}

    public void setNextDate(String nextDate) {this.nextDate = nextDate;}

    public String getPreviousDate() { return previousDate;}

    public void setPreviousDate(String previousDate) { this.previousDate = previousDate; }
}
