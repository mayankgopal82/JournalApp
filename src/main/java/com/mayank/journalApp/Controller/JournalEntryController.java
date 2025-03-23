package com.mayank.journalApp.Controller;

import com.mayank.journalApp.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry> journalEntries = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll(){
          return new ArrayList<>(journalEntries.values());
    }

    @PostMapping
    public boolean createEntries(@RequestBody JournalEntry anEntry){
      journalEntries.put(anEntry.getId(),anEntry);
      return true;
    }

}
