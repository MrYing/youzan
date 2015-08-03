<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">

<title>打印测试</title>

<OBJECT ID="jatoolsPrinter"
	CLASSID="CLSID:B43D3361-D075-4BE2-87FE-057188254255"
	codebase="xyz/jatoolsPrinter.cab#version=8,6,1,0"></OBJECT>

<script>
	function doPrint() {
		myDoc = {
			documents : document, // 要打印的div 对象在本文档中，控件将从本文档中的 id 为 'page1' 的div对象，
			// 作为首页打印id 为'page2'的作为第二页打印            
			copyrights : '杰创软件拥有版权  www.jatools.com' // 版权声明,必须   
		};
		jatoolsPrinter.print(myDoc, false); // 直接打印，不弹出打印机设置对话框 
	}
</script>
</head>
<body bgcolor="#e0e0e0">
	<div id='page1'
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>发票1
		金额:80</div>
	<div id='page2'
		style='background: #ffffff; margin: 10; width: 270; height: 450; float: left'>发票1
		金额:100</div>
	<input type="button" value="打印" onClick=' doPrint()'>
</body>
</html>
