<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>四大域</h1>
	<%
		pageContext.setAttribute("xxx", "page_XXX");
		request.setAttribute("xxx", "request_XXX");
		session.setAttribute("xxx", "session_XXX");
		application.setAttribute("xxx", "application_XXX");
	%>
	<!-- 全域查找 -->
	${xxx } <br/><hr/>
	<!-- 各个域中 -->
	${pageScope.xxx }<br/>
	${requestScope.xxx }<br/>
	${sessionScope.xxx }<br/>
	${applicationScope.xxx }
</body>
</html>