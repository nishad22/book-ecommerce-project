package com.example.springboot.bookcart.service.serviceinterface;

import com.example.springboot.bookcart.dto.UserBean;

public interface IUserInfo {
    public String registerUser(UserBean userBean);
    public UserBean loginUser(int id, String password);
}
