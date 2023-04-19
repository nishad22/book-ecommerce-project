package com.example.springboot.bookcart.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
@Entity
@Table(name = "book_info")
public class BookBean {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookID;
    @Column
    private String title;
    @Column
    private String ISBN;
    @Column
    private String publiserName;
    @Column
    private String author;
    @Column
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date publicationDate;
}
