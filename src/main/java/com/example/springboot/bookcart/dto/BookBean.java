package com.example.springboot.bookcart.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;

import java.util.Date;

@Data
@Entity
@Table(name = "book_info")
public class BookBean {
    @Column
    @Id
    @Generated
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
