package com.example.springboot.bookcart.repo;


import com.example.springboot.bookcart.dto.BookBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Repository
public interface IBookInfoRepo extends JpaRepository<BookBean,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE BookBean set title=:title,ISBN=:ISBN,publiserName=:publiserName,author=:author,publicationDate=:publicationDate WHERE bookID=:bookID")
    void newUpdateQuery(int bookID, String title, String ISBN, String publiserName, String author, Date publicationDate);

}
