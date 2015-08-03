package com.sanguo.youzan.service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.http.HttpResponse;

import com.sanguo.youzan.api.KdtApiClient;
import com.sanguo.youzan.util.JsonDataUtil;


/*
 * 这是个例子
 */
public class YouZanApiTest {
	private static final String APP_ID = "9a3e278d9f654ee923"; //这里换成你的app_id
	private static final String APP_SECRET = "1a230d6a79a8718a07fdc546da5000f0"; //这里换成你的app_secret
	
	public static void main(String[] args){
		//sendGet();
		//sendPost();
		getTraderOrder();
	}
	
	/*
	 * 测试获取单个商品信息
	 */
	private static void sendGet(){
		String method = "kdt.item.get";
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("num_iid", "2651514");
		
		KdtApiClient kdtApiClient;
		HttpResponse response;
		
		try {
			kdtApiClient = new KdtApiClient(APP_ID, APP_SECRET);
			response = kdtApiClient.get(method, params);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				result.append(line);
			}

			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 测试获取添加商品
	 */
	private static void sendPost(){
		String method = "kdt.item.add";
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("price", "999.01");
		params.put("title", "测试商品");
		params.put("desc", "这是一个号商铺");
		params.put("is_virtual", "0");
		params.put("post_fee", "10.01");
		params.put("sku_properties", "");
		params.put("sku_quantities", "");
		params.put("sku_prices", "");
		params.put("sku_outer_ids", "");
		String fileKey = "images[]";
		List<String> filePaths = new ArrayList<String>();
		filePaths.add("/Users/xuexiaozhe/Desktop/1.png");
		filePaths.add("/Users/xuexiaozhe/Desktop/2.png");
		
		KdtApiClient kdtApiClient;
		HttpResponse response;
		
		try {
			kdtApiClient = new KdtApiClient(APP_ID, APP_SECRET);
			response = kdtApiClient.post(method, params, filePaths, fileKey);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				result.append(line);
			}

			System.out.println(result.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getTraderOrder(){
		String method = "kdt.trades.sold.get";
		HashMap<String, String> params = new HashMap<String, String>();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式
		Date nowDate = null;
		try {
			nowDate = sdf.parse("2015-07-30 00:00:00");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String date = sdf.format(nowDate);
		
		params.put("start_created",date);
		
		KdtApiClient kdtApiClient;
		HttpResponse response;
		
		try {
			kdtApiClient = new KdtApiClient(APP_ID, APP_SECRET);
			response = kdtApiClient.get(method, params);
			//System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				result.append(line);
			}
            String data = result.toString();
            String responseData = JsonDataUtil.getOneLevelJsonData(data, "response");
            List<JSONObject> tradesList = JsonDataUtil.getJsonArray(responseData, "trades");
            Iterator<JSONObject> it = tradesList.iterator();
            while(it.hasNext()){
            	JSONObject tradesData = (JSONObject)it.next();
            	String numid = tradesData.getString("orders");
            	System.out.println(numid);
            }
			//System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


