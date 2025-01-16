package com.journal.japp.Services;

import com.journal.japp.Repository.JournalEntryRepository;
import com.journal.japp.entity.JournalEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JournalEntryService {

    @Autowired
    private JournalEntryRepository journalEntryRepository;
    //journalentryrepository hum isme inject kr rhe hain

    public  void saveEntry(JournalEntry journalEntry){

        journalEntryRepository.save(journalEntry);
    }
}
