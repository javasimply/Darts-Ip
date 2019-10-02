package com.dartsip.test.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Book {
	
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String title;
    private String author;
    private String publishedDate;
    private String isbn;
    

    @Embedded
    private Reviews reviews;


    public Book() {}

}
