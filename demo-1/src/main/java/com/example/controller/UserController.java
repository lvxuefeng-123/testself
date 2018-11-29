package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.UserBean;
import com.example.dao.IUserDao;
import com.example.service.UserServiceImpl;

@RestController
public class UserController {
	@Autowired
	private UserServiceImpl usi;
    private IUserDao dao;
   
    
	@RequestMapping("userall")

	public List<UserBean> show() {
		return usi.findall();
	}
	
   @RequestMapping("useradd")
   public String show01() {
	   UserBean bean =new UserBean();
	   bean.setAddress("zj");
	   bean.setAge(12);
	   bean.setName("lv");
	   int i=usi.insertUs(bean);
	   if(i==1) {
		   return "添加成功";
	   }
	   return "false";
   }
}
