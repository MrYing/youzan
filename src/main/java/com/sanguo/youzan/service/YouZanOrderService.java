package com.sanguo.youzan.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.sanguo.youzan.model.DeliveryOrder;
import com.sanguo.youzan.model.T_order;
import com.sanguo.youzan.model.T_trade;
import com.sanguo.youzan.util.DateUtil;
import com.sanguo.youzan.util.JsonDataUtil;
import com.sanguo.youzan.util.YouZanApiUtil;

/**
 *
 * @author JabnMai
 * @date 2015年8月4日
 * 
 */
public class YouZanOrderService {
	
    /**获取交易订单信息
     * @param trade
     * @param order
     */
    @SuppressWarnings("rawtypes")
	public Map<String, T_trade> getTradeOrderInfo(String tradeNum, String status, String start_created){
		Map<String, T_trade> tradeOrderMap = new LinkedHashMap<String, T_trade>();
    	String tradeOrderInfo = YouZanApiUtil.getTraderOrder(status, start_created);
    	String responseData = JsonDataUtil.getOneLevelJsonData(tradeOrderInfo, "response");
    	tradeNum = JsonDataUtil.getOneLevelJsonData(responseData, "total_results");
        List<JSONObject> tradesList = JsonDataUtil.getJsonArray(responseData, "trades");
        Iterator<JSONObject> it = tradesList.iterator();
        while(it.hasNext()){
        	T_trade trader = new T_trade();
        	List<T_order> orderList = new ArrayList<T_order>();
        	JSONObject tradesData = (JSONObject)it.next();
        	trader.setAdjust_fee(tradesData.getDouble("adjust_fee"));
        	trader.setBuyer_area(tradesData.getString("buyer_area"));
        	trader.setBuyer_id(tradesData.getInt("buyer_id"));
        	trader.setBuyer_message(tradesData.getString("buyer_message"));
        	trader.setBuyer_nick(tradesData.getString("buyer_nick"));
        	trader.setBuyer_type(tradesData.getInt("buyer_type"));
        	//trader.setConsign_time(DateUtil.str2Date(tradesData.getString("consign_time")));
        	//trader.setCoupon_details_id(tradesData.getString("coupon_details_id"));
        	trader.setCreated(DateUtil.str2Date(tradesData.getString("created")));
        	trader.setDiscount_fee(tradesData.getDouble("discount_fee"));
        	trader.setFeedback(tradesData.getInt("feedback"));
        	//trader.setFetch_detail_id(tradesData.getString("fetch_detail_id"));
        	trader.setNum(tradesData.getInt("num"));
        	trader.setNum_iid(tradesData.getInt("num_iid"));
        	
        	trader.setOuter_tid(tradesData.getString("outer_tid"));
        	//trader.setPay_time(DateUtil.str2Date(tradesData.getString("pay_time")));
        	String payType = tradesData.getString("pay_type");
        	if(payType.equals("CODPAY")){
        		trader.setPay_type("货到付款");
        	}else{
        		trader.setPay_type("在线支付");
        	}
        	trader.setPayment(tradesData.getDouble("payment"));
        	trader.setPic_path(tradesData.getString("pic_path"));
        	trader.setPic_thumb_path(tradesData.getString("pic_thumb_path"));
        	trader.setPost_fee(tradesData.getDouble("post_fee"));
        	trader.setPrice(tradesData.getDouble("price"));
        	//trader.setPromotion_details_id(tradesData.getString("promotion_details_id"));
        	trader.setReceiver_address(tradesData.getString("receiver_state")+
        			                   tradesData.getString("receiver_city")+
        			                   tradesData.getString("receiver_district")+
        			                   tradesData.getString("receiver_address"));
        	trader.setReceiver_city(tradesData.getString("receiver_city"));
        	trader.setReceiver_district(tradesData.getString("receiver_district"));
        	trader.setReceiver_mobile(tradesData.getString("receiver_mobile"));
        	trader.setReceiver_name(tradesData.getString("receiver_name"));
        	trader.setReceiver_state(tradesData.getString("receiver_state"));
        	trader.setRefunded_fee(tradesData.getDouble("refunded_fee"));
        	trader.setReceiver_zip(tradesData.getString("receiver_zip"));
        	trader.setRefund_state(tradesData.getString("refund_state"));
        	trader.setRefunded_fee(tradesData.getDouble("refunded_fee"));
        	trader.setSeller_flag(tradesData.getInt("seller_flag"));
        	String shippingType = tradesData.getString("shipping_type");
        	if(shippingType.equals("express")){
        		trader.setShipping_type("送货上门");
        	}
        	if(shippingType.equals("fetch")){
        		trader.setShipping_type("到店自提");
        	}
            //trader.setSign_time(DateUtil.str2Date(tradesData.getString("sign_time")));
            trader.setStatus(tradesData.getString("status"));
            //trader.setSub_trades_id(tradesData.getString("sub_trades_id"));
           
            trader.setTid(tradesData.getString("tid"));
            trader.setTitle(tradesData.getString("title"));
            trader.setTotal_fee(tradesData.getDouble("total_fee"));
            trader.setTrade_memo(tradesData.getString("trade_memo"));
            //trader.setTradeNum(tradesData.getString("tradeNum"));
            trader.setType(tradesData.getString("type"));
            trader.setUpdate_time(DateUtil.str2Date(tradesData.getString("update_time")));
            trader.setWeixin_user_id(tradesData.getInt("weixin_user_id"));
            JSONArray orderArray = tradesData.getJSONArray("orders");
            Iterator iterator = orderArray.iterator();
            while(iterator.hasNext()){
            	T_order order = new T_order();
            	JSONObject orderData = (JSONObject) iterator.next();
            	//order.setBuyer_messages_content(orderData.getString("buyer_messages_content"));
            	//order.setBuyer_messages_title(orderData.getString("buyer_messages_title"));
            	order.setDiscount_fee(orderData.getDouble("discount_fee"));
            	order.setFenxiao_payment(orderData.getDouble("fenxiao_payment"));
            	order.setFenxiao_price(orderData.getDouble("fenxiao_price"));
            	order.setItem_type(orderData.getInt("item_type"));
            	order.setNum(orderData.getInt("num"));
            	order.setNum_iid(orderData.getInt("num_iid"));
            	order.setOid(orderData.getInt("oid"));
            	trader.setOrders_oid(Integer.toString(orderData.getInt("oid")));
            	//order.setOrder_promotion_deta_typeils(orderData.getString("order_promotion_deta_typeils"));
            	//order.setOrder_promotion_details_apply_at(orderData.getString("order_promotion_details_apply_at"));
            	//order.setOrder_promotion_details_discount_fee(order_promotion_details_discount_fee);
            	//order.setOrder_promotion_details_name(order_promotion_details_name);
            	order.setOuter_item_id(orderData.getString("outer_item_id"));
            	order.setOuter_sku_id(orderData.getString("outer_sku_id"));
            	order.setPayment(orderData.getDouble("payment"));
            	order.setPic_path(orderData.getString("pic_path"));
            	order.setPic_thumb_path(orderData.getString("pic_thumb_path"));
            	order.setPrice(orderData.getDouble("price"));
            	order.setSeller_nick(orderData.getString("seller_nick"));
            	order.setSku_id(orderData.getInt("sku_id"));
            	order.setSku_properties_name(orderData.getString("sku_properties_name"));
            	order.setSku_unique_code(orderData.getString("sku_unique_code"));
            	order.setTitle(orderData.getString("title"));
            	order.setTotal_fee(orderData.getDouble("total_fee"));
            	orderList.add(order);
            }
            
            trader.setT_orderList(orderList);
            tradeOrderMap.put(tradesData.getString("tid"), trader);
        }
		return tradeOrderMap;
        
        
    }
    
	public List<DeliveryOrder> getDeliveryOrderInfo(Map<String, T_trade> TradeOrderMap){
		List<DeliveryOrder> deliveryOrderList = new ArrayList<DeliveryOrder>();
    	String shopName = YouZanApiUtil.getShopName();
    	System.out.println(TradeOrderMap.toString());
    	for(Map.Entry<String, T_trade> entry : TradeOrderMap.entrySet()){
    		DeliveryOrder deliveryOrder = new DeliveryOrder();
    		deliveryOrder.setShopName(shopName);
    		T_trade trade = entry.getValue();
    		String id = entry.getKey();
    		deliveryOrder.setBuyerMessage(trade.getBuyer_message());
    		deliveryOrder.setOrderList(trade.getT_orderList());
    		deliveryOrder.setOrderTime(DateUtil.formatDate(trade.getCreated()));
    		deliveryOrder.setPayment(trade.getPayment());
    		deliveryOrder.setPayType(trade.getPay_type());
    		deliveryOrder.setReceiverAddress(trade.getReceiver_address());
    		deliveryOrder.setReceiverName(trade.getReceiver_name());
    		deliveryOrder.setReceiverPhone(trade.getReceiver_mobile());
    		deliveryOrder.setTid(trade.getTid());
    		deliveryOrder.setTotalFee(trade.getTotal_fee());
    		deliveryOrder.setShippingType(trade.getShipping_type());
    		deliveryOrderList.add(deliveryOrder);
    		List<T_order> list = trade.getT_orderList();
    		Iterator<T_order> it = list.iterator();
    		while(it.hasNext()){
    			T_order order = it.next();
    			System.out.println(order.getTitle());
    		}
    	}
		return deliveryOrderList;
    	
    }
}
