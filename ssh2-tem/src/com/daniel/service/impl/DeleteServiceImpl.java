package com.daniel.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.daniel.model.User;
import com.daniel.service.DeleteService;
import com.daniel.util.HibernateUtil;

public class DeleteServiceImpl implements DeleteService{

	@Override
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		String hql = "SELECT id FROM User WHERE username = '" + username + "'";
		List list = session.createQuery(hql).list();
		if(!list.isEmpty()){
			hql = "DELETE FROM User WHERE username = '" + username + "'";
			session.createQuery(hql).executeUpdate();
			tx.commit();
			return true;
		}
		return false;
	}
	
	
    public List<User> getUser(){
		List<User> userList =new ArrayList<User>();
		
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		String hql = "SELECT id,username,username FROM User ";
		List list = session.createQuery(hql).list();
		
		//System.out.println(list);
		
	    Iterator it1 = list.iterator();
        while(it1.hasNext()){
        	User userInfo=new User();
        	Object[]  objects =(Object[]) it1.next();
        	userInfo.setId(Integer.parseInt(objects[0].toString()));
        	userInfo.setPassword(objects[1].toString());
        	userInfo.setUsername(objects[2].toString());
        	userList.add(userInfo);
        }
        
		tx.commit();  
		return userList;
	}

}
