package com.sanguo.youzan.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author JabnMai
 * @date 2015年8月3日
 * 
 */
public class DateUtil {
	public static Date str2Date(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式
		Date nowDate = null;
		try {
			nowDate = sdf.parse(date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return nowDate;
	}
}
