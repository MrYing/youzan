package com.sanguo.youzan.model;

import java.io.Serializable;
import java.util.Date;

   /**
    * t_order 实体类
    * Mon Aug 03 22:04:49 CST 2015 JasonLin
    */ 


public class T_order implements Serializable{
	private int oid;
	private int num_iid;
	private int sku_id;
	private String sku_unique_code;
	private int num;
	private String outer_sku_id;
	private String outer_item_id;
	private String title;
	private String seller_nick;
	private double fenxiao_price;
	private double fenxiao_payment;
	private double price;
	private double total_fee;
	private double discount_fee;
	private double payment;
	private String sku_properties_name;
	private String pic_path;
	private String pic_thumb_path;
	private int item_type;
	private String buyer_messages_title;
	private String buyer_messages_content;
	private String order_promotion_details_name;
	private String order_promotion_deta_typeils;
	private Date order_promotion_details_apply_at;
	private double order_promotion_details_discount_fee;
	public void setOid(int oid){
	this.oid=oid;
	}
	public int getOid(){
		return oid;
	}
	public void setNum_iid(int num_iid){
	this.num_iid=num_iid;
	}
	public int getNum_iid(){
		return num_iid;
	}
	public void setSku_id(int sku_id){
	this.sku_id=sku_id;
	}
	public int getSku_id(){
		return sku_id;
	}
	public void setSku_unique_code(String sku_unique_code){
	this.sku_unique_code=sku_unique_code;
	}
	public String getSku_unique_code(){
		return sku_unique_code;
	}
	public void setNum(int num){
	this.num=num;
	}
	public int getNum(){
		return num;
	}
	public void setOuter_sku_id(String outer_sku_id){
	this.outer_sku_id=outer_sku_id;
	}
	public String getOuter_sku_id(){
		return outer_sku_id;
	}
	public void setOuter_item_id(String outer_item_id){
	this.outer_item_id=outer_item_id;
	}
	public String getOuter_item_id(){
		return outer_item_id;
	}
	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setSeller_nick(String seller_nick){
	this.seller_nick=seller_nick;
	}
	public String getSeller_nick(){
		return seller_nick;
	}
	public void setFenxiao_price(double fenxiao_price){
	this.fenxiao_price=fenxiao_price;
	}
	public double getFenxiao_price(){
		return fenxiao_price;
	}
	public void setFenxiao_payment(double fenxiao_payment){
	this.fenxiao_payment=fenxiao_payment;
	}
	public double getFenxiao_payment(){
		return fenxiao_payment;
	}
	public void setPrice(double price){
	this.price=price;
	}
	public double getPrice(){
		return price;
	}
	public void setTotal_fee(double total_fee){
	this.total_fee=total_fee;
	}
	public double getTotal_fee(){
		return total_fee;
	}
	public void setDiscount_fee(double discount_fee){
	this.discount_fee=discount_fee;
	}
	public double getDiscount_fee(){
		return discount_fee;
	}
	public void setPayment(double payment){
	this.payment=payment;
	}
	public double getPayment(){
		return payment;
	}
	public void setSku_properties_name(String sku_properties_name){
	this.sku_properties_name=sku_properties_name;
	}
	public String getSku_properties_name(){
		return sku_properties_name;
	}
	public void setPic_path(String pic_path){
	this.pic_path=pic_path;
	}
	public String getPic_path(){
		return pic_path;
	}
	public void setPic_thumb_path(String pic_thumb_path){
	this.pic_thumb_path=pic_thumb_path;
	}
	public String getPic_thumb_path(){
		return pic_thumb_path;
	}
	public void setItem_type(int item_type){
	this.item_type=item_type;
	}
	public int getItem_type(){
		return item_type;
	}
	public void setBuyer_messages_title(String buyer_messages_title){
	this.buyer_messages_title=buyer_messages_title;
	}
	public String getBuyer_messages_title(){
		return buyer_messages_title;
	}
	public void setBuyer_messages_content(String buyer_messages_content){
	this.buyer_messages_content=buyer_messages_content;
	}
	public String getBuyer_messages_content(){
		return buyer_messages_content;
	}
	public void setOrder_promotion_details_name(String order_promotion_details_name){
	this.order_promotion_details_name=order_promotion_details_name;
	}
	public String getOrder_promotion_details_name(){
		return order_promotion_details_name;
	}
	public void setOrder_promotion_deta_typeils(String order_promotion_deta_typeils){
	this.order_promotion_deta_typeils=order_promotion_deta_typeils;
	}
	public String getOrder_promotion_deta_typeils(){
		return order_promotion_deta_typeils;
	}
	public void setOrder_promotion_details_apply_at(Date order_promotion_details_apply_at){
	this.order_promotion_details_apply_at=order_promotion_details_apply_at;
	}
	public Date getOrder_promotion_details_apply_at(){
		return order_promotion_details_apply_at;
	}
	public void setOrder_promotion_details_discount_fee(double order_promotion_details_discount_fee){
	this.order_promotion_details_discount_fee=order_promotion_details_discount_fee;
	}
	public double getOrder_promotion_details_discount_fee(){
		return order_promotion_details_discount_fee;
	}
}

