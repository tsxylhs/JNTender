package com.jn.jntender.common.config;

import java.util.Map;

import com.google.common.collect.Maps;
import com.jn.jntender.common.utils.PropertiesLoader;
import com.jn.jntender.common.utils.StringUtils;



/**
 * 
 * @类名: Global
 * @描述:全局的配置类
 * @作者: hezw
 * @日期 2018年2月4日 下午5:42:24
 * @修改人:
 * @修改时间:
 */
public class Global {

	/**
	 * 当前对象的实例
	 */
	private static Global global = new Global();
	
	/**
	 * 保存全局属性值
	 */
	private static Map<String, String> map = Maps.newHashMap();
	
	/**
	 * 属性文件加载对象
	 */
	private static PropertiesLoader loader = new PropertiesLoader("jntender.properties");
	
	/**
	 * 显示/隐藏
	 */
	public static final String SHOW = "1";
	public static final String HIDE = "0";

	/**
	 * 是/否
	 */
	public static final String YES = "1";
	public static final String NO = "0";
	
	/**
	 * 对/错
	 */
	public static final String TRUE = "true";
	public static final String FALSE = "false";

	
	/**
	 * 获取当前对象实例
	 */
	public static Global getInstance() {
		return global;
	}
	
	/**
	 * 获取配置
	 * @see ${fns:getConfig('adminPath')}
	 */
	public static String getConfig(String key) {
		String value = map.get(key);
		if (value == null){
			value = loader.getProperty(key);
			map.put(key, value != null ? value : StringUtils.EMPTY);
		}
		return value;
	}
		
	/**
	 * 获取管理端根路径
	 */
	public static String getAdminPath() {
		return getConfig("adminPath");
	}
	

	
	
	
}
