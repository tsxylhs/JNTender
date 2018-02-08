package com.jn.jntender.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jn.jntender.common.dao.UserDao;
import com.jn.jntender.common.entity.User;
@Service
public  class BaseService {
	@Autowired
	private UserDao userdao;
	public void savetest(User user){
		userdao.saveTest(user);
	}
	public void findtest(){
		userdao.find();
	}
	public void findfilter() {
		userdao.findfilter();
		
	}
	

	/*protected abstract IBaseDao<T> getDao();

	*//**
	 * 保存-实体
	 * 
	 * @param entity
	 *//*
	public void save(T entity) {
		getDao().save(entity);
	}

	*//**
	 * 修改实体
	 * 
	 * @param entity
	 *//*
	public void update(T entity) {
		getDao().update(entity);
	}

	*//**
	 * 删除实体[数组]
	 * 
	 * @param ids
	 *//*
	public void delete(Serializable... ids) {
		getDao().delete(ids);
	}

	*//**
	 * 根据ID查询
	 * 
	 * @param id
	 *            实体的主键ID
	 *//*
	public T find(Serializable id) {
		return getDao().find(id);
	}

	*//**
	 * 查询�?有记�?<br>
	 * [不分页]
	 * 
	 * @return 结果集合
	 *//*
	public List<T> findAll() {
		return getDao().findAll();
	}

	*//**
	 * 查询�?有记录并排序<br>
	 * [不分页]
	 * 
	 * @return 结果集合
	 *//*
	public List<T> findAll(String order) {
		return getDao().findAll(order);
	}

	*//**
	 * 根据单一参数查询记录<br>
	 * [不分页]
	 * 
	 * @param propName
	 *            属�?�名称，对应实体类字段名�?
	 * @param propValue
	 *            属�?��??
	 * @return 结果列表 �? null
	 *//*
	public List<T> findByProp(String propName, Object propValue) {
		return getDao().findByProp(propName, propValue);
	}

	*//**
	 * 根据单一参数查询记录并排�?<br>
	 * [不分页]
	 * 
	 * @param propName
	 *            属�?�名称，对应实体类字段名
	 * @param propValue
	 *            属�?��??
	 * @param order
	 *            排序字段（如：id �? id desc�?
	 * @return 结果集合 �? null
	 *//*
	public List<T> findByProp(String propName, Object propValue, String order) {
		return getDao().findByProp(propName, propValue, order);
	}

	*//**
	 * 根据多个参数查询记录<br>
	 * [不分页]
	 * 
	 * @param propName
	 *            参数数组
	 * @param propValue
	 *            参数值数�?
	 * @return 结果集合 �? null
	 *//*
	public List<T> findByProps(String[] propName, Object[] propValue) {
		return getDao().findByProps(propName, propValue);
	}

	*//**
	 * 根据多个参数查询记录 并排�?<br>
	 * [不分页]
	 * 
	 * @param propName
	 *            参数数组
	 * @param propValue
	 *            参数值数�?
	 * @param order
	 *            排序字段
	 * @return 结果集合 �? null
	 *//*
	public List<T> findByProps(String[] propName, Object[] propValue, String order) {
		return getDao().findByProps(propName, propValue, order);
	}

	*//**
	 * 根据单一参数查询唯一结果<br>
	 * [HQL]
	 * 
	 * @param propName
	 *            属�?�名称，对应实体类字段名
	 * @param PropValue
	 *            属�?��??
	 * @return 唯一结果 �? null
	 *//*
	public T uniqueByProp(String propName, Object propValue) {
		return getDao().uniqueByProp(propName, propValue);
	}

	*//**
	 * 根据多个参数查询唯一结果<br>
	 * [HQL]
	 * 
	 * @param propName
	 *            参数数组
	 * @param PropValue
	 *            参数值数�?
	 * @return 唯一结果 �? null
	 *//*
	public T uniqueByProps(String[] propName, Object[] propValue) {
		return getDao().uniqueByProps(propName, propValue);
	}

	*//**
	 * 分页查询�?有结果集�?<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageAll(int pageNo, int pageSize) {
		return getDao().pageAll(pageNo, pageSize);
	}

	*//**
	 * 分页查询�?有结果集�? 并排�?<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @param order
	 *            排序字段
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageAll(int pageNo, int pageSize, String order) {
		return getDao().pageAll(pageNo, pageSize, order);
	}

	*//**
	 * 根据参数分页查询结果集合<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @param param
	 *            参数
	 * @param value
	 *            参数�?
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageByProp(int pageNo, int pageSize, String param, Object value) {
		return getDao().pageByProp(pageNo, pageSize, param, value);
	}

	*//**
	 * 根据参数分页查询结果集合并排�?<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @param param
	 *            参数
	 * @param value
	 *            参数�?
	 * @param order
	 *            排序字段
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageByProp(int pageNo, int pageSize, String param, Object value, String order) {
		return getDao().pageByProp(pageNo, pageSize, param, value, order);
	}

	*//**
	 * 根据参数分页查询结果集合<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @param params
	 *            参数数组
	 * @param values
	 *            参数值数�?
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageByProps(int pageNo, int pageSize, String[] params, Object[] values) {
		return getDao().pageByProps(pageNo, pageSize, params, values);
	}

	*//**
	 * 根据参数分页查询结果集合 并排�?<br>
	 * [分页]
	 * 
	 * @param pageNo
	 *            当前页码
	 * @param pageSize
	 *            页容�?
	 * @param params
	 *            参数数组
	 * @param values
	 *            参数值数�?
	 * @param order
	 *            排序字段
	 * @return 分页模型对象（不会为null�?
	 *//*
	public PageModel<T> pageByProps(int pageNo, int pageSize, String[] params, Object[] values, String order) {
		return getDao().pageByProps(pageNo, pageSize, params, values, order);
	}

	*//**
	 * 根据条件查询总记录数
	 * 
	 * @param params
	 *            参数数组
	 * @param values
	 *            参数值数�?
	 * @return 总记录数
	 *//*
	public int countByCondition(String[] params, Object[] values) {
		return getDao().countByCondition(params, values);
	}*/
}
