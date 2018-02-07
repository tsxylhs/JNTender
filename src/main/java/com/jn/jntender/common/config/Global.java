package com.jn.jntender.common.config;

import java.util.Map;

import com.google.common.collect.Maps;
import com.jn.jntender.common.utils.PropertiesLoader;
import com.jn.jntender.common.utils.StringUtils;



/**
 * 
 * @����: Global
 * @����:ȫ�ֵ�������
 * @����: hezw
 * @���� 2018��2��4�� ����5:42:24
 * @�޸���:
 * @�޸�ʱ��:
 */
public class Global {

	/**
	 * ��ǰ�����ʵ��
	 */
	private static Global global = new Global();
	
	/**
	 * ����ȫ������ֵ
	 */
	private static Map<String, String> map = Maps.newHashMap();
	
	/**
	 * �����ļ����ض���
	 */
	private static PropertiesLoader loader = new PropertiesLoader("jntender.properties");
	
	/**
	 * ��ʾ/����
	 */
	public static final String SHOW = "1";
	public static final String HIDE = "0";

	/**
	 * ��/��
	 */
	public static final String YES = "1";
	public static final String NO = "0";
	
	/**
	 * ��/��
	 */
	public static final String TRUE = "true";
	public static final String FALSE = "false";

	
	/**
	 * ��ȡ��ǰ����ʵ��
	 */
	public static Global getInstance() {
		return global;
	}
	
	/**
	 * ��ȡ����
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
	 * ��ȡ����˸�·��
	 */
	public static String getAdminPath() {
		return getConfig("adminPath");
	}
	

	
	
	
}
