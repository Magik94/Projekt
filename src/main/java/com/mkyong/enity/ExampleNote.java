package com.mkyong.enity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ExampleNote {

    @Id
    private String id;
    private String date;
    private String desc; //descriptions

    public ExampleNote(){

    }

    public ExampleNote(String date, String desc){
        this.date = date;
        this.desc = desc;
    }

    public String getId(){return id;}

    public void setId(String id){this.id = id;}

    public String getDate(){return date;}

    public void setDate(String date){this.date =date;}

    public String setDesc(){return desc;}

    public void setDesc(String desc){this.desc = desc;}
}
