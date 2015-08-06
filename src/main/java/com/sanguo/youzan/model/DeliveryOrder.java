package com.sanguo.youzan.model;

import java.util.Date;
import java.util.List;

public class DeliveryOrder {
    private String shopName;
    private String receiverName;
    private String receiverPhone;
    private String receiverAddress;
    private String orderTime;
    private String tid;
    private Double totalFee;
    private Double payment;
    private String payType;         //付款方式
    private String shippingType;   //提货方式
    private String buyerMessage;   //买家留言
    private List<T_order> orderList;
	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
	}
	public String getReceiverAddress() {
		return this.receiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	public String getOrderTime() {
		return this.orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getTid() {
		return this.tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public Double getTotalFee() {
		return this.totalFee;
	}
	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	public Double getPayment() {
		return this.payment;
	}
	public void setPayment(Double payment) {
		this.payment = payment;
	}
	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getShippingType() {
		return this.shippingType;
	}
	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}
	public String getBuyerMessage() {
		return this.buyerMessage;
	}
	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	public List<T_order> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<T_order> orderList) {
		this.orderList = orderList;
	}
	
    
    
}
