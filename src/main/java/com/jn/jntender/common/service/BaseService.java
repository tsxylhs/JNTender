package com.jn.jntender.common.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.jn.jntender.common.dao.UserDao;
import com.jn.jntender.common.entity.User;
/**
 * 
 * @类名: BaseService
 * @描述:
 * @作者: lhs
 * @日期 2018年2月8日 下午11:16:13
 * @修改人:
 * @修改时间:
 */
@Service
public  class BaseService {
	@Autowired
	private UserDao userdao;
	/**
	 * 
	 * @方法名: savetest
	 * @描述:
	 * @作者:lhs
	 * @param user
	 * @日期 2018年2月8日 下午11:06:53
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
	public void savetest(User user){
		userdao.saveTest(user);
	}
	/**
	 * 
	 * @方法名: findtest
	 * @描述:
	 * @作者:lhs
	 * @日期 2018年2月8日 下午11:06:36
	 * @返回值: void
	 * @修改人:
	 * @修改时间:
	 */
	public void findtest(){
		userdao.find();
	}
/**
 * 
 * @方法名: findfilter
 * @描述:
 * @作者:lhs
 * @日期 2018年2月8日 下午11:04:55
 * @返回值: void
 * @修改人:
 * @修改时间:
 */
	public void findfilter() {
		userdao.findfilter();
		
	}
	public void getpage(){
	   userdao.getPage(2, 4);
	}
	

	/*protected abstract IBaseDao<T> getDao();

	*//**
	 * 淇濆瓨-瀹炰綋
	 * 
	 * @param entity
	 *//*
	public void save(T entity) {
		getDao().save(entity);
	}

	*//**
	 * 淇敼瀹炰綋
	 * 
	 * @param entity
	 *//*
	public void update(T entity) {
		getDao().update(entity);
	}

	*//**
	 * 鍒犻櫎瀹炰綋[鏁扮粍]
	 * 
	 * @param ids
	 *//*
	public void delete(Serializable... ids) {
		getDao().delete(ids);
	}

	*//**
	 * 鏍规嵁ID鏌ヨ
	 * 
	 * @param id
	 *            瀹炰綋鐨勪富閿甀D
	 *//*
	public T find(Serializable id) {
		return getDao().find(id);
	}

	*//**
	 * 鏌ヨ鎵?鏈夎褰?<br>
	 * [涓嶅垎椤礭
	 * 
	 * @return 缁撴灉闆嗗悎
	 *//*
	public List<T> findAll() {
		return getDao().findAll();
	}

	*//**
	 * 鏌ヨ鎵?鏈夎褰曞苟鎺掑簭<br>
	 * [涓嶅垎椤礭
	 * 
	 * @return 缁撴灉闆嗗悎
	 *//*
	public List<T> findAll(String order) {
		return getDao().findAll(order);
	}

	*//**
	 * 鏍规嵁鍗曚竴鍙傛暟鏌ヨ璁板綍<br>
	 * [涓嶅垎椤礭
	 * 
	 * @param propName
	 *            灞炴?у悕绉帮紝瀵瑰簲瀹炰綋绫诲瓧娈靛悕绉?
	 * @param propValue
	 *            灞炴?у??
	 * @return 缁撴灉鍒楄〃 鎴? null
	 *//*
	public List<T> findByProp(String propName, Object propValue) {
		return getDao().findByProp(propName, propValue);
	}

	*//**
	 * 鏍规嵁鍗曚竴鍙傛暟鏌ヨ璁板綍骞舵帓搴?<br>
	 * [涓嶅垎椤礭
	 * 
	 * @param propName
	 *            灞炴?у悕绉帮紝瀵瑰簲瀹炰綋绫诲瓧娈靛悕
	 * @param propValue
	 *            灞炴?у??
	 * @param order
	 *            鎺掑簭瀛楁锛堝锛歩d 鎴? id desc锛?
	 * @return 缁撴灉闆嗗悎 鎴? null
	 *//*
	public List<T> findByProp(String propName, Object propValue, String order) {
		return getDao().findByProp(propName, propValue, order);
	}

	*//**
	 * 鏍规嵁澶氫釜鍙傛暟鏌ヨ璁板綍<br>
	 * [涓嶅垎椤礭
	 * 
	 * @param propName
	 *            鍙傛暟鏁扮粍
	 * @param propValue
	 *            鍙傛暟鍊兼暟缁?
	 * @return 缁撴灉闆嗗悎 鎴? null
	 *//*
	public List<T> findByProps(String[] propName, Object[] propValue) {
		return getDao().findByProps(propName, propValue);
	}

	*//**
	 * 鏍规嵁澶氫釜鍙傛暟鏌ヨ璁板綍 骞舵帓搴?<br>
	 * [涓嶅垎椤礭
	 * 
	 * @param propName
	 *            鍙傛暟鏁扮粍
	 * @param propValue
	 *            鍙傛暟鍊兼暟缁?
	 * @param order
	 *            鎺掑簭瀛楁
	 * @return 缁撴灉闆嗗悎 鎴? null
	 *//*
	public List<T> findByProps(String[] propName, Object[] propValue, String order) {
		return getDao().findByProps(propName, propValue, order);
	}

	*//**
	 * 鏍规嵁鍗曚竴鍙傛暟鏌ヨ鍞竴缁撴灉<br>
	 * [HQL]
	 * 
	 * @param propName
	 *            灞炴?у悕绉帮紝瀵瑰簲瀹炰綋绫诲瓧娈靛悕
	 * @param PropValue
	 *            灞炴?у??
	 * @return 鍞竴缁撴灉 鎴? null
	 *//*
	public T uniqueByProp(String propName, Object propValue) {
		return getDao().uniqueByProp(propName, propValue);
	}

	*//**
	 * 鏍规嵁澶氫釜鍙傛暟鏌ヨ鍞竴缁撴灉<br>
	 * [HQL]
	 * 
	 * @param propName
	 *            鍙傛暟鏁扮粍
	 * @param PropValue
	 *            鍙傛暟鍊兼暟缁?
	 * @return 鍞竴缁撴灉 鎴? null
	 *//*
	public T uniqueByProps(String[] propName, Object[] propValue) {
		return getDao().uniqueByProps(propName, propValue);
	}

	*//**
	 * 鍒嗛〉鏌ヨ鎵?鏈夌粨鏋滈泦鍚?<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageAll(int pageNo, int pageSize) {
		return getDao().pageAll(pageNo, pageSize);
	}

	*//**
	 * 鍒嗛〉鏌ヨ鎵?鏈夌粨鏋滈泦鍚? 骞舵帓搴?<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @param order
	 *            鎺掑簭瀛楁
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageAll(int pageNo, int pageSize, String order) {
		return getDao().pageAll(pageNo, pageSize, order);
	}

	*//**
	 * 鏍规嵁鍙傛暟鍒嗛〉鏌ヨ缁撴灉闆嗗悎<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @param param
	 *            鍙傛暟
	 * @param value
	 *            鍙傛暟鍊?
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageByProp(int pageNo, int pageSize, String param, Object value) {
		return getDao().pageByProp(pageNo, pageSize, param, value);
	}

	*//**
	 * 鏍规嵁鍙傛暟鍒嗛〉鏌ヨ缁撴灉闆嗗悎骞舵帓搴?<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @param param
	 *            鍙傛暟
	 * @param value
	 *            鍙傛暟鍊?
	 * @param order
	 *            鎺掑簭瀛楁
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageByProp(int pageNo, int pageSize, String param, Object value, String order) {
		return getDao().pageByProp(pageNo, pageSize, param, value, order);
	}

	*//**
	 * 鏍规嵁鍙傛暟鍒嗛〉鏌ヨ缁撴灉闆嗗悎<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @param params
	 *            鍙傛暟鏁扮粍
	 * @param values
	 *            鍙傛暟鍊兼暟缁?
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageByProps(int pageNo, int pageSize, String[] params, Object[] values) {
		return getDao().pageByProps(pageNo, pageSize, params, values);
	}

	*//**
	 * 鏍规嵁鍙傛暟鍒嗛〉鏌ヨ缁撴灉闆嗗悎 骞舵帓搴?<br>
	 * [鍒嗛〉]
	 * 
	 * @param pageNo
	 *            褰撳墠椤电爜
	 * @param pageSize
	 *            椤靛閲?
	 * @param params
	 *            鍙傛暟鏁扮粍
	 * @param values
	 *            鍙傛暟鍊兼暟缁?
	 * @param order
	 *            鎺掑簭瀛楁
	 * @return 鍒嗛〉妯″瀷瀵硅薄锛堜笉浼氫负null锛?
	 *//*
	public PageModel<T> pageByProps(int pageNo, int pageSize, String[] params, Object[] values, String order) {
		return getDao().pageByProps(pageNo, pageSize, params, values, order);
	}

	*//**
	 * 鏍规嵁鏉′欢鏌ヨ鎬昏褰曟暟
	 * 
	 * @param params
	 *            鍙傛暟鏁扮粍
	 * @param values
	 *            鍙傛暟鍊兼暟缁?
	 * @return 鎬昏褰曟暟
	 *//*
	public int countByCondition(String[] params, Object[] values) {
		return getDao().countByCondition(params, values);
	}*/
}
