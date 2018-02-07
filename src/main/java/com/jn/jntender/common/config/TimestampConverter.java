package com.jn.jntender.common.config;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * @类名: TimestampConverter
 * @描述:
 * @作者: lhs
 * @日期 2018年2月7日 下午9:35:19
 * @修改人:
 * @修改时间:
 */
public class TimestampConverter implements Converter<Date, Timestamp> {

	public Timestamp convert(Date date) {
		if (date != null) {
			return new Timestamp(date.getTime());
		}
		return null;
	}

}