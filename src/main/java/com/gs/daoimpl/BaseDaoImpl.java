package com.gs.daoimpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import com.gs.dao.BaseDao;
import com.gs.entity.BaseEntity;

@Transactional
public class BaseDaoImpl<T extends BaseEntity> implements BaseDao<T> {

	@Resource
	private HibernateTemplate hibernateTemplate;
	private Class<T> entityClass;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		Type genType = this.getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
		this.entityClass = (Class<T>) params[0];
	}
	
	public HibernateTemplate getHibernateTemplate(){
		return this.hibernateTemplate;
	}
	
	public boolean saveOrUpdate(T entity) {
		try {
			this.hibernateTemplate.saveOrUpdate(entity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<T> getAll() {
		try {
			List<T> result = this.hibernateTemplate.loadAll(entityClass);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
