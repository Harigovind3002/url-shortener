 package com.url.urlshortener.models;

import java.time.LocalDateTime;

import org.h2.engine.User;
import org.springframework.data.annotation.CreatedDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@Data 
public class UrlMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String longUrl; 
    private String shortUrl; 
    private int clickCount=0;  
    private LocalDateTime createdDate;  

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
