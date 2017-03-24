<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 获取参数值
  http://localhost:8080/javaweb_base/EL/param.jsp?username=aaa
      获取到aaa
 -->
${param.username }<br/>
<!-- 获取多个参数值，paramValues,获取到的是一个数组
     http://localhost:8080/javaweb_base/EL/param.jsp?username=aaa&hobby=bbb&hobby=ccc
 -->
${paramValues.hobby[0] }<br/>
${paramValues.hobby[1] }
</body>
</html>