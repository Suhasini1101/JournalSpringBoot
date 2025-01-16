package com.journal.japp.Repository;

import com.journal.japp.entity.JournalEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,String> {

}


//ye db se query chalata hai