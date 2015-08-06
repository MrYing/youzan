<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>打印测试</title>

<OBJECT ID="jatoolsPrinter"
	CLASSID="CLSID:B43D3361-D075-4BE2-87FE-057188254255"
	codebase="/jatoolsPrinter.cab#version=8,6,1,0"></OBJECT>

<script>
	function doPrint() {
		myDoc = {
			documents : document, // 要打印的div 对象在本文档中，控件将从本文档中的 id 为 'page1' 的div对象，
			// 作为首页打印id 为'page2'的作为第二页打印            
			copyrights : '杰创软件拥有版权  www.jatools.com' // 版权声明,必须   
		};
		jatoolsPrinter.printPreview(myDoc); //打印预览
		//jatoolsPrinter.print(myDoc, false); // 直接打印，不弹出打印机设置对话框 
	}
</script>
</head>
<body bgcolor="#e0e0e0">
	<div id='page1'
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>
		<c:forEach items="${deliveryOrders}" var="deliveryOrder">
			<div style="padding: 30px;">
				<h2>${deliveryOrder.shopName}</h2>
			</div>
			<br>
				订单号：${deliveryOrder.tid}<br>
				下单时间：${deliveryOrder.orderTime}<br>
				收货人：${deliveryOrder.receiverName}<br>
				电话：${deliveryOrder.receiverPhone}<br>
				地址：${deliveryOrder.receiverAddress}<br>
				---------------------<br>
			<div>
				<tr>
					<td>商品名称</td>
					<td>单价</td>
					<td>数量</td>
				</tr>
				<br>
				<c:forEach items="${deliveryOrder.orderList}" var="order">
					<tr>
						<td>${order.title}</td>
						<td>${order.price}</td>
						<td>${order.num}</td>
					</tr>
					<br>
				</c:forEach>
			</div><br>
			---------------------<br>
				总计：${deliveryOrder.totalFee}<br>
				实付：${deliveryOrder.payment}<br>
				付款方式：${deliveryOrder.payType}<br>
				提货方式：${deliveryOrder.shippingType}<br>
				留言：${deliveryOrder.buyerMessage}<br>
			<br>
			<br>
		</c:forEach>
	</div>
	<br>
	<input type="button" value="打印" onClick=' doPrint()'>
</body>
</html>