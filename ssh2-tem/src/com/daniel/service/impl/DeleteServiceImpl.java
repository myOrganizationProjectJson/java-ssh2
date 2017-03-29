package com.daniel.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

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

}
