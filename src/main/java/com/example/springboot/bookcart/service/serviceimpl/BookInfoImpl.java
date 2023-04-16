package com.example.springboot.bookcart.service.serviceimpl;

import com.example.springboot.bookcart.dto.BookBean;
import com.example.springboot.bookcart.repo.IBookInfoRepo;
import com.example.springboot.bookcart.service.serviceinterface.IBookInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoImpl implements IBookInfo {

    @Autowired
    private IBookInfoRepo bookInfoRepo;

    @Override
    public String addBook(BookBean bookbean) {
        if (bookbean!=null){
            bookInfoRepo.save(bookbean);
        } else{
            return "failure";
        }
        return "success";
    }
}
