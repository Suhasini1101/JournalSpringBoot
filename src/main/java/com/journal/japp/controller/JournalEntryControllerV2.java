package com.journal.japp.controller;
import com.journal.japp.Services.JournalEntryService;
import com.journal.japp.entity.JournalEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){

        return null;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable String myId){

        return null;
    }


    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;

    }
    @DeleteMapping("id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable String myId)
    {
        return null;

    }

    @PutMapping ("id/{myId}")
    public JournalEntry updateEntryById(@PathVariable Long myId,@RequestBody JournalEntry myentry)
    {
        return null;

    }





}
