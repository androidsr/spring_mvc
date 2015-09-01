package org.sr.work.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sr.work.dao.UserDao;
import org.sr.work.entity.AcctUser;
import org.sr.work.service.UserService;

/**
 * UserService 的实现
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public AcctUser load(int id) {
		return userDao.load(id);
	}

	@Override
	public AcctUser get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<AcctUser> findAll() {
		return userDao.findAll();
	}

	@Override
	public void persist(AcctUser entity) {
		userDao.persist(entity);
	}

	@Override
	public Integer save(AcctUser entity) {
		return userDao.save(entity);
	}

	@Override
	public void saveOrUpdate(AcctUser entity) {
		userDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

	@Override
	public void flush() {
		userDao.flush();
	}

}