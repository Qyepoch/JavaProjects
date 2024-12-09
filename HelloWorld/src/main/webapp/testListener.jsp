<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>测试监听器</title>
</head>
<body>
<%
	out.println("Test ServletContextListern" + "<br>");
	application.setAttribute("userid","1234");
	application.setAttribute("userid","12345"); // 替换掉已经添加的属性
	application.removeAttribute("userid");
	out.println("监听器已作出反应，详情见D:\\context.text");
	
%>

</body>
</html>