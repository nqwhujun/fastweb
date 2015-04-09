package com.nxnsoft.fastweb.dao;

import java.util.List;

import com.nxnsoft.fastweb.domain.BaseDomain;

public interface BaseDao<T extends BaseDomain> {
	
	/**
	 * 
	 * @return
	 */
	List<T> list();
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	T getById(Long id);
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	T save(T t);
	
	/**
	 * 
	 * @param t
	 */
	void updateById(T t);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	boolean deleteById(Long id);
}
