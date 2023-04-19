package com.example.springboot.bookcart.repo;

import com.example.springboot.bookcart.dto.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserInfoRepo extends JpaRepository<UserBean,Integer> {
}
