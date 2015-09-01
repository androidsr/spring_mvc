package org.sr.work.service;

import java.util.List;

import org.sr.work.entity.AcctUser;

/**
 * userService接口
 */

public interface UserService {
	AcctUser load(int id);

	AcctUser get(int id);

	List<AcctUser> findAll();

	void persist(AcctUser entity);

	Integer save(AcctUser entity);

	void saveOrUpdate(AcctUser entity);

	void delete(int id);

	void flush();
}