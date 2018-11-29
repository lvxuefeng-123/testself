package com.example.service;

import java.util.List;

import com.example.bean.UserBean;

public interface IUserService {
     public List<UserBean> findall();
     public int insertUs(UserBean user);
}
