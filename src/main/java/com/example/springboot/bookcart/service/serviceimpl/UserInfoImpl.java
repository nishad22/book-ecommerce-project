package com.example.springboot.bookcart.service.serviceimpl;

import com.example.springboot.bookcart.dto.UserBean;
import com.example.springboot.bookcart.repo.IUserInfoRepo;
import com.example.springboot.bookcart.service.serviceinterface.IUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoImpl implements IUserInfo{

    @Autowired
    private IUserInfoRepo userInfo;

    @Override
    public String registerUser(UserBean userBean) {
        if(userBean!=null){
            userInfo.save(userBean);
            return "success";
        }
        return "failure";
    }

    @Override
    public UserBean loginUser(int id, String password) {
        UserBean bean = userInfo.findById(id).get();
        //System.out.println("Login user using ID "+bean);
        if(bean!=null && bean.getPassword().equals(password)){
        //    System.out.println("Password "+bean.getPassword());
            return bean;
        }
        return null;
    }
}
