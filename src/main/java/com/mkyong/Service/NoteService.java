package com.mkyong.Service;


import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class NoteService {


    @Autowired
    private ExampleRepository exampleRepository;
    //DayDocument dayDocument = new DayDocument();

    public void upload(LocalDate localDate, String desc) {

        exampleRepository.insert(new DayDocument(localDate, desc));
    }

    public void addDay(int value, String desc) {
        Date date = new Date();
        LocalDate localDate = LocalDate.now().plusDays(value);

        exampleRepository.insert(new DayDocument(localDate, desc));
    }

}

