<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>订单系统</title>
<body bgcolor="#e0e0e0">
	<div id="register" class="wrap">
		<div class="shadow">
			<em class="corner lb"></em> <em class="corner rt"></em>
			<div class="box">
				<h1>送货订单查询</h1>
				<form id="loginForm" method="post" action="user_show.do">
					<table>
						<tr>
							<td class="field">交易状态：</td>
							<td><%-- <input class="text" type="text" id="tradeStatus"
								name="tradeStatus" value="${user.userName }" />  --%>
								<select
								name="tradeStatus" id="tradeTime">
									<option value="WAIT_SELLER_SEND_GOODS" selected>等待卖家发货</option>
									<option value="WAIT_BUYER_PAY">等待买家付款</option>
									<option value="TRADE_NO_CREATE_PAY">没有创建支付交易</option>
									<option value="WAIT_BUYER_CONFIRM_GOODS">等待买家确认收货</option>
									<option value="TRADE_BUYER_SIGNED ">买家已签收</option>
									<option value="TRADE_CLOSED">付款以后用户退款成功，交易自动关闭</option>
									<option value="TRADE_CLOSED_BY_USER">付款以前，卖家或买家主动关闭交易</option>

							    </select> <span></span></td>
						</tr>
						<tr>
							<td class="field">交易时间：</td>
							<td>
								<input class="text" type="text" id="tradeTime"
								name="tradeTime"  <%-- value="${password}"--%>/> 
								<img onclick="WdatePicker({el:'tradeTime'})" src="../js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
							</td>
						</tr>
						<tr>
							<td><input type="hidden" name="user.status" value="2" /></td>
							<td><label class="ui-green"><input type="submit"
									name="submit" value="查询" /></label>&nbsp;&nbsp;<font id="error"
								color="red">${error }</font></td>
						</tr>
						
					</table>
				</form>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</body>
</html>