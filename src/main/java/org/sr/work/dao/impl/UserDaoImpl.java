package org.sr.work.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.sr.work.dao.UserDao;
import org.sr.work.entity.AcctUser;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}

	@Override
	public AcctUser load(Integer id) {
		return (AcctUser) this.getCurrentSession().load(AcctUser.class, id);
	}

	@Override
	public AcctUser get(Integer id) {
		return (AcctUser) this.getCurrentSession().get(AcctUser.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AcctUser> findAll() {
		List<AcctUser> acctUsers = this.getCurrentSession()
				.createQuery("from AcctUser").setCacheable(true).list();
		return acctUsers;
	}

	@Override
	public void persist(AcctUser entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(AcctUser entity) {
		return (int) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(AcctUser entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		AcctUser entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}