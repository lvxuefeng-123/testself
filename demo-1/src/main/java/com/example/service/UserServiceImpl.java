package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.UserBean;
import com.example.dao.IUserDao;
@Service
public class UserServiceImpl implements IUserService{
@Autowired
private IUserDao dao;
	@Override
	public List<UserBean> findall() {
		
		return dao.findUser();
	}
	@Override
	public int insertUs(UserBean user) {
		
		return dao.insertUser(user);
	}
         
}
