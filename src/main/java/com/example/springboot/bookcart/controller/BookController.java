package com.example.springboot.bookcart.controller;

import com.example.springboot.bookcart.dto.BookBean;
import com.example.springboot.bookcart.service.serviceimpl.BookInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class BookController {

    @Autowired
    private BookInfoImpl bookInfoImpl;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        CustomDateEditor editor = new CustomDateEditor(format,true);
        binder.registerCustomEditor(Date.class, editor);

    }

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
    @PutMapping(path="/updatebook",consumes =MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public BookBean updatingbook(@RequestBody BookBean bean){
        if (bean!=null){
            return bookInfoImpl.updateBookinfo(bean);
        }
        return null;
    }
    @PutMapping(path="/newupdatequery",consumes =MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String newUpdateQuery(@RequestParam("bookID")int id, @RequestParam("title")String title, @RequestParam("publiserName")String publiserName,
                                 @RequestParam("author")String author, @RequestParam("publicationDate")Date publicationDate,@RequestParam("isbn")String isbn){
        if(bookInfoImpl.newUpdateQuery(id,title,isbn,publiserName,author,publicationDate)){
            return "success";
        }
        return "failure";
    }

}
