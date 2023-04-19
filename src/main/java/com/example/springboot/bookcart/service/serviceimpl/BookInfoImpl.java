package com.example.springboot.bookcart.service.serviceimpl;

import com.example.springboot.bookcart.dto.BookBean;
import com.example.springboot.bookcart.repo.IBookInfoRepo;
import com.example.springboot.bookcart.service.serviceinterface.IBookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BookInfoImpl implements IBookInfo {

    @Autowired
    private IBookInfoRepo bookInfoRepo;

    @Override
    public String addBook(BookBean bookbean) {
        if (bookbean != null) {
            bookInfoRepo.save(bookbean);
        } else {
            return "failure";
        }
        return "success";
    }

    @Override
    public BookBean updateBookinfo(BookBean bookBean) {
        if (bookBean != null) {
            BookBean bean = bookInfoRepo.findById(bookBean.getBookID()).get();
            if (bookBean.getISBN() != null) {
                bean.setISBN(bookBean.getISBN());
            }
            if (bookBean.getAuthor() != null) {
                bean.setAuthor(bookBean.getAuthor());
            }
            if (bookBean.getTitle()!=null){
                bean.setTitle(bookBean.getTitle());
            }
            if (bookBean.getPublicationDate() != null) {
                bean.setPublicationDate(bookBean.getPublicationDate());
            }
            if (bookBean.getPubliserName() != null) {
                bean.setPubliserName(bookBean.getPubliserName());
            }
            bookInfoRepo.save(bean);
            return bean;
        }
        return null;
    }

    @Override
    public boolean newUpdateQuery(int id, String title,String isbn,String publisherName, String author, Date publicationDate) {
        bookInfoRepo.newUpdateQuery(id,title,isbn,publisherName,author,publicationDate);
        return true;
    }

    @Override
    public BookBean getBook(int i) {
        return null;
    }

    @Override
    public List<BookBean> getAllBook() {
        return null;
    }
}
