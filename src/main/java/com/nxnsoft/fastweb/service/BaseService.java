package com.nxnsoft.fastweb.service;

import java.util.List;


import com.nxnsoft.fastweb.domain.BaseDomain;

/**
 * 
 * @author xnnie
 *
 */
public interface BaseService<T extends BaseDomain> {
	
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
	void save(T t);
	
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
