package com.mkyong.Service;


import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteService {


    @Autowired
    private ExampleRepository exampleRepository;
    //DayDocument dayDocument = new DayDocument();

    public void upload(Date date, String desc){
        exampleRepository.insert(new DayDocument(date,desc));
    }
}

