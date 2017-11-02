package com.mkyong.Service;

import com.mkyong.Document.DayDocument;
import com.mkyong.repository.ExampleRepository;
import java.util.Optional;
import javax.annotation.PostConstruct;
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


  @Autowired
  private ExampleRepository exampleRepository;

  @PostConstruct
  private void setUpDate() {
    Optional<DayDocument> currentDate =
        exampleRepository.findByDayDocumentLocalDate(LocalDate.now())
            .stream()
            .findFirst();
    if (!currentDate.isPresent()) {
      DayDocument current = exampleRepository.insert(new DayDocument(LocalDate.now(), true));
      currentDate=Optional.of(current);
    }
    DayDocument dayDocument = currentDate.get();
    if (dayDocument.getNextDate() == null) {
      addDay(dayDocument);
    }
  }

  private void addDay(DayDocument dayDocument) {
    LocalDate nextLocalDate = dayDocument.getLocalDate().plusDays(1);
    DayDocument newDate = exampleRepository.insert(new DayDocument(nextLocalDate, true));
    dayDocument.setNextDate(newDate.getId());
    dayDocument.setLastDateInCalendar(false);
    exampleRepository.save(dayDocument);
  }


  public DayDocument nextDay(String nextDayId) {
    DayDocument dayDocument = exampleRepository.findOne(nextDayId);
    if(dayDocument.getNextDate()==null){
      addDay(dayDocument);
    }
    return dayDocument;
  }

  public DayDocument getCurrentDate() {
    return exampleRepository.findByDayDocumentLocalDate(LocalDate.now()).get(0);
  }
}

