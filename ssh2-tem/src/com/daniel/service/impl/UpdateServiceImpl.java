package com.daniel.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.daniel.service.UpdateService;
import com.daniel.util.HibernateUtil;

public class UpdateServiceImpl implements UpdateService{

	@Override
	public boolean update(String username, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		String hql = "SELECT id FROM User WHERE username = '" + username
				+ "' AND password = '" + oldPassword + "'";
		List list = session.createQuery(hql).list();
		if(!list.isEmpty()){
			hql = "UPDATE User SET password = '" + newPassword
					+ "' WHERE username = '" + username + "' AND password = '" + oldPassword + "'";
			session.createQuery(hql).executeUpdate();
			tx.commit();
			return true;
		}
		return false;
	}
	
}
