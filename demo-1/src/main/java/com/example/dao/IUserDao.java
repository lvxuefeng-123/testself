package com.example.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import com.example.bean.UserBean;
@Mapper
public interface IUserDao {
   public List<UserBean>findUser();
   public int insertUser(UserBean user);
}
