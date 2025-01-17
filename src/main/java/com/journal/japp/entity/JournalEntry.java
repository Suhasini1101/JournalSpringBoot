package com.journal.japp.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "journal_entries")
public class JournalEntry {
        @Id
        private String id;

        private String title;

        private String content;

        private Date date;

    //content
    public String getContent() {return content;}
    public void setContent(String content) {
        this.content = content;
    }


    //title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }


    //id
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
