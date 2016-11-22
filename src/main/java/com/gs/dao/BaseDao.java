package com.gs.dao;

import java.util.List;
import com.gs.entity.BaseEntity;

public interface BaseDao<T extends BaseEntity> {

	boolean saveOrUpdate(T entity);
	List<T> getAll();
}
