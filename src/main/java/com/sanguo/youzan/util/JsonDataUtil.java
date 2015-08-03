package com.sanguo.youzan.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author JabnMai
 * @date 2015年8月2日
 * 
 */
public class JsonDataUtil {
	/**
	 * 获取一级json数据
	 * @param jsonData
	 * @param key
	 * @return
	 */
	public static String getOneLevelJsonData(String jsonData, String key){
		String value = null;
		JSONObject jsonObject = JSONObject.fromObject(jsonData);
		if(jsonObject != null){
			value = jsonObject.getString(key);
    	}
		return value;
	}
	
	/**
	 * 获取二级json数据
	 * @param jsonData
	 * @param key
	 */
	public static void getTwoLevelJsonData(String jsonData, String key){
		String value = null;
		JSONObject jsonObject = JSONObject.fromObject(jsonData);
		if(jsonObject != null){
			value = jsonObject.getString(key);
    	}
	}
	
	/**
	 * 获取jsonArray里的内容
	 * @param data
	 * @param key
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<JSONObject> getJsonArray(String data, String key){
		JSONObject dataJsonObject = JSONObject.fromObject(data);
		List<JSONObject> list = new ArrayList<JSONObject>();
		JSONArray jsonArray = dataJsonObject.getJSONArray(key);
		 Iterator<JSONObject> it = jsonArray.iterator();
		 while(it.hasNext()){
			 JSONObject data1 = (JSONObject) it.next();
			 list.add(data1);
		 }
		 return list;
	}
}
