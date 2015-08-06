package com.sanguo.youzan.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sanguo.youzan.model.DeliveryOrder;
import com.sanguo.youzan.model.T_trade;
import com.sanguo.youzan.service.YouZanOrderService;

@Controller
@RequestMapping(value = "/backadmin")
public class DeliveryOrderController {
	/**
	 * 查阅订单信息
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	List<DeliveryOrder> deliveryOrders = new ArrayList<DeliveryOrder>();
	
	@RequestMapping(value = "/user_show")
	public ModelAndView orderInfoShow(String tradeStatus, String tradeTime,
			Model model, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		// 设置请求的字符编码
		request.setCharacterEncoding("UTF-8");
		// 设置返回请求的字符编码
		response.setCharacterEncoding("UTF-8");
		// 调用服务
		YouZanOrderService orderService = new YouZanOrderService();
		String tradeNum = null;
		Map<String, T_trade> tradeOrderMap = orderService.getTradeOrderInfo(
				tradeNum, tradeStatus, tradeTime);
		deliveryOrders = orderService
				.getDeliveryOrderInfo(tradeOrderMap);
		mv.addObject("deliveryOrders", deliveryOrders);
		mv.setViewName("orderList");
		return mv;
	}
	
	@RequestMapping(value = "/print")
	public ModelAndView print(String tradeStatus, String tradeTime,
			Model model, HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		// 设置请求的字符编码
		request.setCharacterEncoding("UTF-8");
		// 设置返回请求的字符编码
		response.setCharacterEncoding("UTF-8");
		
		mv.addObject("deliveryOrders", deliveryOrders);
		/*Iterator<DeliveryOrder> it = deliveryOrders.iterator();
		while(it.hasNext()){
			DeliveryOrder order = it.next();
			System.out.println(order.getOrderTime());
		}*/
		mv.setViewName("print");
		return mv;
	}

}
