<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>发票1
		金额:80</div><br>
	<div id='page2'
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>发票1
		金额:100</div><br>
		<div id='page3'
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>发票1
		金额:100</div><br>
	<input type="button" value="打印" onClick=' doPrint()'>
	<div class="box">
	<form action="test/t.do" method="post">
         <input type="submit" value="test"/>
    </form>
    </div>
    <div id="register" class="wrap">
		<div class="shadow">
			<em class="corner lb"></em> <em class="corner rt"></em>
			<div class="box">
				<h1>管理员登陆</h1>
				<form id="loginForm" method="post" action="adminlogin/submit.do">
					<table>
						<tr>
							<td class="field">用户名：</td>
							<td><input class="text" type="text" id="userName"
								name="userName" <%-- value="${user.userName }" --%> /><span></span></td>
						</tr>
						<tr>
							<td class="field">登录密码：</td>
							<td><input class="text" type="password" id="password"
								name="password" <%--  value="${password}" --%>/><span></span></td>
						</tr>
						<tr>
							<td class="field">验证码：</td>
							<td><input class="text"
								style="width: 60px; margin-right: 10px;" type=text
								value="${imageCode }" name="imageCode" id="imageCode"><img
								onclick="javascript:loadimage();" title="换一张试试" name="randImage"
								id="randImage"
								src="${pageContext.request.contextPath}/image.jsp" width="60"
								height="20" border="1" align="absmiddle"></td>
						</tr>
						<tr>
							<td><input type="hidden" name="user.status" value="2" /></td>
							<td><label class="ui-green"><input type="submit"
									name="submit" value="立即登录" /></label>&nbsp;&nbsp;<font id="error"
								color="red">${error }</font></td>
						</tr>
					</table>
				</form>
				<form action="test/t.do" method="post">
					<input type="submit" value="test" />
				</form>
			</div>
		</div>
		<div class="clear"></div>
	</div>
</body>
</html>