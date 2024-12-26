package com.journal.japp.controller;
import com.journal.japp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal") //iss poori class par mapping add kr dega
public class JournalEntryController {

    //ab ek table banate hain
    private Map<Long,JournalEntry> journalEntries=new HashMap<>();
    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
            //method inside a controller
            //jese ye method hai getAll inside getMapping so it is
            //made public so that it can be accessed and invoked by the spring framework or external http request

        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        //RequestBody means its like saying "Hey Spring!, please take
        //the data from the request and turn it into a java object
        //that I can use in my code"
        //journalEntry ka ek instance ban gya myEntry
        journalEntries.put(myEntry.getId(),myEntry);
        return true;

    }




}