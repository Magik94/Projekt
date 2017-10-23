package com.mkyong;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Mroziqella on 23.10.2017.
 */
@Document
public class ExampleDocument {
    @Id
    private String id;
    private String imie;
    private Long age;

    public ExampleDocument() {
    }

    public ExampleDocument(String imie, Long age) {
        this.imie = imie;
        this.age = age;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
