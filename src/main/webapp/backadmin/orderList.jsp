<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>订单系统</title>
</head>

<body>
	<h2>订单列表</h2>

	<div style="padding: 10px;">
		<form action="print.do" method="post">
			<input type="submit" value="打印" />
		</form>
	</div>

	<table border="1">
		<tr>
			<td>店名</td>
			<td>订单号</td>
			<td>订单时间</td>
			<td>收货人</td>
			<td>联系电话</td>
			<td>地址</td>
			<td>总价</td>
			<td>实付</td>
			<td>付款方式</td>
			<td>提货方式</td>
			<td>留言</td>
			<td>商品详情</td>
		</tr>
		<c:forEach items="${deliveryOrders}" var="deliveryOrder">
			<tr>
				<td>${deliveryOrder.shopName}</td>
				<td>${deliveryOrder.tid}</td>
				<td>${deliveryOrder.orderTime}</td>
				<td>${deliveryOrder.receiverName}</td>
				<td>${deliveryOrder.receiverPhone}</td>
				<td>${deliveryOrder.receiverAddress}</td>
				<td>${deliveryOrder.totalFee}</td>
				<td>${deliveryOrder.payment}</td>
				<td>${deliveryOrder.payType}</td>
				<td>${deliveryOrder.shippingType}</td>
				<td>${deliveryOrder.buyerMessage}</td>
				<td>
					<div style="padding: 10px;">
						<table border="1">
							<tr>
								<td>商品名称</td>
								<td>单价</td>
								<td>数量</td>
							</tr>
							<c:forEach items="${deliveryOrder.orderList}" var="order">
								<tr>
									<td>${order.title}</td>
									<td>${order.price}</td>
									<td>${order.num}</td>
								</tr>
							</c:forEach>

						</table>
					</div>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>