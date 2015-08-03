package com.sanguo.youzan.model;

import java.util.Date;

/**
 * t_trade 实体类 Mon Aug 03 22:05:57 CST 2015 JasonLin
 */

public class T_trade {
	private String tid;
	private int num;
	private int num_iid;
	private double price;
	private String pic_path;
	private String pic_thumb_path;
	private String title;
	private String type;
	private int weixin_user_id;
	private int buyer_type;
	private int buyer_id;
	private String buyer_nick;
	private String buyer_message;
	private int seller_flag;
	private String trade_memo;
	private String receiver_city;
	private String receiver_district;
	private String receiver_name;
	private String receiver_state;
	private String receiver_address;
	private String receiver_zip;
	private String receiver_mobile;
	private int feedback;
	private String refund_state;
	private String outer_tid;
	private String status;
	private String shipping_type;
	private double post_fee;
	private double total_fee;
	private double refunded_fee;
	private double discount_fee;
	private double payment;
	private Date created;
	private Date update_time;
	private Date pay_time;
	private String pay_type;
	private Date consign_time;
	private Date sign_time;
	private String buyer_area;
	private String orders_oid;
	private String fetch_detail_id;
	private String coupon_details_id;
	private String promotion_details_id;
	private double adjust_fee;
	private String sub_trades_id;

	public void setTid(String tid) {
		this.tid = tid;
	}

	public String getTid() {
		return tid;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum_iid(int num_iid) {
		this.num_iid = num_iid;
	}

	public int getNum_iid() {
		return num_iid;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}

	public String getPic_path() {
		return pic_path;
	}

	public void setPic_thumb_path(String pic_thumb_path) {
		this.pic_thumb_path = pic_thumb_path;
	}

	public String getPic_thumb_path() {
		return pic_thumb_path;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setWeixin_user_id(int weixin_user_id) {
		this.weixin_user_id = weixin_user_id;
	}

	public int getWeixin_user_id() {
		return weixin_user_id;
	}

	public void setBuyer_type(int buyer_type) {
		this.buyer_type = buyer_type;
	}

	public int getBuyer_type() {
		return buyer_type;
	}

	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}

	public int getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_nick(String buyer_nick) {
		this.buyer_nick = buyer_nick;
	}

	public String getBuyer_nick() {
		return buyer_nick;
	}

	public void setBuyer_message(String buyer_message) {
		this.buyer_message = buyer_message;
	}

	public String getBuyer_message() {
		return buyer_message;
	}

	public void setSeller_flag(int seller_flag) {
		this.seller_flag = seller_flag;
	}

	public int getSeller_flag() {
		return seller_flag;
	}

	public void setTrade_memo(String trade_memo) {
		this.trade_memo = trade_memo;
	}

	public String getTrade_memo() {
		return trade_memo;
	}

	public void setReceiver_city(String receiver_city) {
		this.receiver_city = receiver_city;
	}

	public String getReceiver_city() {
		return receiver_city;
	}

	public void setReceiver_district(String receiver_district) {
		this.receiver_district = receiver_district;
	}

	public String getReceiver_district() {
		return receiver_district;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_state(String receiver_state) {
		this.receiver_state = receiver_state;
	}

	public String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_zip(String receiver_zip) {
		this.receiver_zip = receiver_zip;
	}

	public String getReceiver_zip() {
		return receiver_zip;
	}

	public void setReceiver_mobile(String receiver_mobile) {
		this.receiver_mobile = receiver_mobile;
	}

	public String getReceiver_mobile() {
		return receiver_mobile;
	}

	public void setFeedback(int feedback) {
		this.feedback = feedback;
	}

	public int getFeedback() {
		return feedback;
	}

	public void setRefund_state(String refund_state) {
		this.refund_state = refund_state;
	}

	public String getRefund_state() {
		return refund_state;
	}

	public void setOuter_tid(String outer_tid) {
		this.outer_tid = outer_tid;
	}

	public String getOuter_tid() {
		return outer_tid;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setShipping_type(String shipping_type) {
		this.shipping_type = shipping_type;
	}

	public String getShipping_type() {
		return shipping_type;
	}

	public void setPost_fee(double post_fee) {
		this.post_fee = post_fee;
	}

	public double getPost_fee() {
		return post_fee;
	}

	public void setTotal_fee(double total_fee) {
		this.total_fee = total_fee;
	}

	public double getTotal_fee() {
		return total_fee;
	}

	public void setRefunded_fee(double refunded_fee) {
		this.refunded_fee = refunded_fee;
	}

	public double getRefunded_fee() {
		return refunded_fee;
	}

	public void setDiscount_fee(double discount_fee) {
		this.discount_fee = discount_fee;
	}

	public double getDiscount_fee() {
		return discount_fee;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getPayment() {
		return payment;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getCreated() {
		return created;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setPay_time(Date pay_time) {
		this.pay_time = pay_time;
	}

	public Date getPay_time() {
		return pay_time;
	}

	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}

	public String getPay_type() {
		return pay_type;
	}

	public void setConsign_time(Date consign_time) {
		this.consign_time = consign_time;
	}

	public Date getConsign_time() {
		return consign_time;
	}

	public void setSign_time(Date sign_time) {
		this.sign_time = sign_time;
	}

	public Date getSign_time() {
		return sign_time;
	}

	public void setBuyer_area(String buyer_area) {
		this.buyer_area = buyer_area;
	}

	public String getBuyer_area() {
		return buyer_area;
	}

	public void setOrders_oid(String orders_oid) {
		this.orders_oid = orders_oid;
	}

	public String getOrders_oid() {
		return orders_oid;
	}

	public void setFetch_detail_id(String fetch_detail_id) {
		this.fetch_detail_id = fetch_detail_id;
	}

	public String getFetch_detail_id() {
		return fetch_detail_id;
	}

	public void setCoupon_details_id(String coupon_details_id) {
		this.coupon_details_id = coupon_details_id;
	}

	public String getCoupon_details_id() {
		return coupon_details_id;
	}

	public void setPromotion_details_id(String promotion_details_id) {
		this.promotion_details_id = promotion_details_id;
	}

	public String getPromotion_details_id() {
		return promotion_details_id;
	}

	public void setAdjust_fee(double adjust_fee) {
		this.adjust_fee = adjust_fee;
	}

	public double getAdjust_fee() {
		return adjust_fee;
	}

	public void setSub_trades_id(String sub_trades_id) {
		this.sub_trades_id = sub_trades_id;
	}

	public String getSub_trades_id() {
		return sub_trades_id;
	}
}
