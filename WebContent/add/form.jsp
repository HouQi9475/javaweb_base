<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String path=request.getContextPath();//获取项目名称
   String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>jsp and servlet</h1><br/>
<form action="/javaweb_base/JServlet" method="post">
数字1：<input type="text" name="num1"/><br/>
数字2：<input type="text" name="num2"/><br/>
<input type="submit" value="提交"/>
</form>
</body>
</html>