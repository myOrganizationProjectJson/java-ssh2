package com.daniel.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.daniel.model.User;
import com.daniel.service.MyService;
import com.daniel.util.HibernateUtil;
import com.opensymphony.xwork2.Action;

public class RegisterServiceImpl implements MyService,Action{

	private User user;
	@Override
	public boolean vaild(String username, String password) {
		
		System.out.println(getUser());; 
		System.out.println("test");;
		// TODO Auto-generated method stub
		if(registerUser(username, password)){
			return true;
		}
		return false;
	}

	public boolean registerUser(String username, String password) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		System.out.println("username = " + username);
		//检查是否存在用户
		String hql = "SELECT id FROM User WHERE username='" + username + "'";
		List list = session.createQuery(hql).list();
		if(list.isEmpty()){
			//不存在用户，则可以注册
			//User user = new User();
			
			System.out.println("testDDD1");
			user.setUsername(username);
			user.setPassword(password);
			session.save(user);
			tx.commit();
			return true;
		}
		return false;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("dfdfdf");
		
		this.vaild("test123","456123");
		
		return "success";
	}

}
