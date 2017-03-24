<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.leo.javaweb.el.domain.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
   User user=new User();
   Address address=new Address();
   address.setCity("介休");
   address.setStreet("东大街");
   user.setUsername("houqi");
   user.setPassword("hou111");
   user.setAddress(address);
   request.setAttribute("user", user);
%>
<!-- 获取街道名称 -->
${user.address.street }
</body>
</html>