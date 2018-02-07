package com.jn.jntender.common.config;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 
 * @����: TimestampConverter
 * @����:
 * @����: lhs
 * @���� 2018��2��7�� ����9:35:19
 * @�޸���:
 * @�޸�ʱ��:
 */
public class TimestampConverter implements Converter<Date, Timestamp> {

	public Timestamp convert(Date date) {
		if (date != null) {
			return new Timestamp(date.getTime());
		}
		return null;
	}

}