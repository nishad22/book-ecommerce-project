package com.example.springboot.bookcart.controller;

import com.example.springboot.bookcart.dto.BookBean;
import com.example.springboot.bookcart.service.serviceimpl.BookInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookInfoImpl bookInfoImpl;

    @PostMapping(path="/addbook",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String addingBook(@RequestBody BookBean bean){
        if(bean!= null){
            bookInfoImpl.addBook(bean);
        } else{
            return "book info is not added";
        }
        return "success";
    }
}
