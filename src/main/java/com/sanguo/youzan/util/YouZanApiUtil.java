package com.sanguo.youzan.util;
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
import org.apache.log4j.Logger;

import com.sanguo.youzan.api.KdtApiClient;


/*
 * 这是个例子
 */
public class YouZanApiUtil {
	private static final String APP_ID = "4b7ef998633137a904"; //这里换成你的app_id
	private static final String APP_SECRET = "bf46dee0f406a41a1836059fd6caf2b1"; //这里换成你的app_secret
	private static Logger logger = Logger.getLogger(YouZanApiUtil.class);
	public static void main(String[] args){
		//sendGet();
		//sendPost();
		getTraderOrder("WAIT_SELLER_SEND_GOODS","2015-07-30 00:00:00");
		getShopName();
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
	
	/**
	 * 根据交易状态status，交易创建时间start_created获取订单交易信息
	 * @param status
	 * @param start_created
	 * @return
	 */
	public static String getTraderOrder(String status, String start_created){
		String method = "kdt.trades.sold.get";
		HashMap<String, String> params = new HashMap<String, String>();
		String data = null;
		
		/*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//时间格式
		Date nowDate = null;
		try {
			nowDate = sdf.parse("2015-07-30 00:00:00");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String date = sdf.format(nowDate);*/
		if(status != null){
			params.put("status", status);
		}
		if(start_created != null){
			params.put("start_created",start_created);
		}
		
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
            data = result.toString();
            
            if(data != null){
            	String responseData = JsonDataUtil.getOneLevelJsonData(data, "response");
                List<JSONObject> tradesList = JsonDataUtil.getJsonArray(responseData, "trades");
                String tradeNum = JsonDataUtil.getOneLevelJsonData(responseData, "total_results");
                
                System.out.println(tradeNum);
                Iterator<JSONObject> it = tradesList.iterator();
                while(it.hasNext()){
                	JSONObject tradesData = (JSONObject)it.next();
                	String numid = tradesData.getString("buyer_message");
                	System.out.println(numid);
                }
            }
            
		//System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	/**
	 * 获取店铺名
	 * @return
	 */
	public static String getShopName(){
		String method = "kdt.shop.basic.get";
		HashMap<String, String> params = new HashMap<String, String>();
		String shopName = null;
		
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
            
            if(data != null){
            	String responseData = JsonDataUtil.getOneLevelJsonData(data, "response");
                shopName = JsonDataUtil.getOneLevelJsonData(responseData, "name");
            }
            
		System.out.println(shopName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return shopName;
	}
}


