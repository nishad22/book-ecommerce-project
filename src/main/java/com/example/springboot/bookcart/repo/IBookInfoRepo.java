package com.example.springboot.bookcart.repo;


import com.example.springboot.bookcart.dto.BookBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookInfoRepo extends JpaRepository<BookBean,Integer> {
}
