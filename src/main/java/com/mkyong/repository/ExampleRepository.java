package com.mkyong.repository;

import com.mkyong.Document.DayDocument;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;
import java.util.List;


public interface ExampleRepository extends MongoRepository<DayDocument, String> {

        @Query("{'desc' : ?0 }")
        List<DayDocument> findByAllDocumentLocalDate(String desc); //pobiernaie textu z bazy

         @Query("{'localDate' : ?0 }")
            List<DayDocument> findByDayDocumentLocalDate(LocalDate localDate); //pobiernaie daty z bazy




}
