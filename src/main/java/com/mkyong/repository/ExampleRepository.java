package com.mkyong.repository;

import com.mkyong.Document.DayDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Mroziqella on 23.10.2017.
 */
public interface ExampleRepository extends MongoRepository<DayDocument,String> {

}
