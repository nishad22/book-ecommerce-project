package com.example.springboot.bookcart.controller;

import com.example.springboot.bookcart.dto.UserBean;
import com.example.springboot.bookcart.service.serviceinterface.IUserInfo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private IUserInfo userInfo;

    @PostMapping(path="/registeruser",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String registerUser(@RequestBody UserBean bean){
        if(bean!=null){
            return userInfo.registerUser(bean);
        }
        return "failure";
    }

    @PostMapping(path="/loginuser", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public UserBean loginUser(@RequestParam("id")int id, @RequestParam("password")String password){
            UserBean bean = userInfo.loginUser(id,password);
            //System.out.println("Hello world");
            return bean;
        }
}
