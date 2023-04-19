package com.example.springboot.bookcart.dto;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "user_info")
public class UserBean {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String emailID;
    @Column
    private String phone_number;
    @Column
    private String gender;
    @Column
    private String password;
}
