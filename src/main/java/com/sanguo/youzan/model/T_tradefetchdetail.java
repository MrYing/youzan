package com.sanguo.youzan.model;

import java.util.Date;

/**
 * t_tradefetchdetail 实体类 Mon Aug 03 22:06:09 CST 2015 JasonLin
 */

public class T_tradefetchdetail {
	private String fetcher_id;
	private String fetcher_name;
	private String fetcher_mobile;
	private Date fetch_time;
	private String shop_name;
	private String shop_mobile;
	private String shop_state;
	private String shop_city;
	private String shop_district;
	private String shop_address;

	public void setFetcher_id(String fetcher_id) {
		this.fetcher_id = fetcher_id;
	}

	public String getFetcher_id() {
		return fetcher_id;
	}

	public void setFetcher_name(String fetcher_name) {
		this.fetcher_name = fetcher_name;
	}

	public String getFetcher_name() {
		return fetcher_name;
	}

	public void setFetcher_mobile(String fetcher_mobile) {
		this.fetcher_mobile = fetcher_mobile;
	}

	public String getFetcher_mobile() {
		return fetcher_mobile;
	}

	public void setFetch_time(Date fetch_time) {
		this.fetch_time = fetch_time;
	}

	public Date getFetch_time() {
		return fetch_time;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_mobile(String shop_mobile) {
		this.shop_mobile = shop_mobile;
	}

	public String getShop_mobile() {
		return shop_mobile;
	}

	public void setShop_state(String shop_state) {
		this.shop_state = shop_state;
	}

	public String getShop_state() {
		return shop_state;
	}

	public void setShop_city(String shop_city) {
		this.shop_city = shop_city;
	}

	public String getShop_city() {
		return shop_city;
	}

	public void setShop_district(String shop_district) {
		this.shop_district = shop_district;
	}

	public String getShop_district() {
		return shop_district;
	}

	public void setShop_address(String shop_address) {
		this.shop_address = shop_address;
	}

	public String getShop_address() {
		return shop_address;
	}
}
