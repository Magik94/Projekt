package com.mkyong.Service;


import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.swing.text.Document;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static java.time.temporal.TemporalAdjusters.*;

@Service
public class NoteService {

   private int temp =1;

    private DayDocument nowLocalDate;
    private LocalDate tempLocalDate =  LocalDate.now();//pobiera aktualną date
    private List<DayDocument> downloadDays;

    @Autowired
    private ExampleRepository exampleRepository;


    public void upload(LocalDate localDate, String desc) {

        exampleRepository.insert(new DayDocument(localDate, desc));
    }

    public void addDay(int value, String desc) {
        LocalDate localDate = LocalDate.now();
        //System.out.println(localDate);

       localDate = LocalDate.now().plusDays(value);
        //System.out.println(localDate+"po");
        exampleRepository.insert(new DayDocument(localDate, desc));

    }
    public List<DayDocument> nextDay(){
        int plusDay =1;
        int size;

        downloadDays = exampleRepository.findByDayDocumentLocalDate(tempLocalDate.plusDays(temp-1)); //sprawdzam czy dzień jest w bazie aktualny
        size = downloadDays.size(); //pobiera rozmiar listy
        nowLocalDate = downloadDays.get(size-1); //pobieranie
        downloadDays = exampleRepository.findByDayDocumentLocalDate(nowLocalDate.getLocalDate().plusDays(plusDay));//sprawdzam czy kolejny dzień jest w bazie
        if(downloadDays.isEmpty()) { //jesli llista jest pusta nie ma dnia spełania warunek
            addDay(temp,"dodałem 3 dzien");
            temp+=1;
        }
        plusDay+=1;
        return  exampleRepository.findByDayDocumentLocalDate(tempLocalDate.plusDays(temp-1)); //sprawdzam czy dzień jest w bazie aktualny

    }
    public List<DayDocument> previusDays(){
        List <DayDocument> tmpDays = exampleRepository.findByDayDocumentLocalDate(tempLocalDate.plusDays(temp-1));

        System.out.println(tmpDays+"szakal");
        System.out.println(exampleRepository.findByDayDocumentLocalDate(tempLocalDate.plusDays(temp-1))+"data ?");
        return exampleRepository.findByDayDocumentLocalDate(tempLocalDate.plusDays(temp-1));
    }

}

