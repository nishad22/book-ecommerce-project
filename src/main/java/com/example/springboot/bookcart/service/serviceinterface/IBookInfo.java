package com.example.springboot.bookcart.service.serviceinterface;

import com.example.springboot.bookcart.dto.BookBean;

import java.util.Date;
import java.util.List;

public interface IBookInfo {
    public String addBook(BookBean bookBean);
    public BookBean updateBookinfo(BookBean bean);
    public boolean newUpdateQuery(int id, String title,String isbn,String publisherName, String author, Date publicationDate);
    public BookBean getBook(int i);
    public List<BookBean> getAllBook();
}
