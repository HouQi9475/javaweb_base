<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登录</h1><br/>
<%
   /*
     获取cookies中的值，默认为""
   */
   String uname="";
   Cookie[] cs=request.getCookies();
   if(cs!=null){
	   
	   for(Cookie c:cs){
		   if("uname".equals(c.getName())){
			   uname=c.getValue(); 
		   }
	   }
   }
%>
<%
   String error=(String)request.getAttribute("error");
   if(error!=null){
	   out.print(error);
   }
  
%>
<form action="/javaweb_base/SessionServlet" method="post">
用户名：<input type="text" name="username" value="<%=uname%>"/><br/>
密码：<input type="password" name="password"/><br/>
<input type="submit" value="登录"/>
</form>

</body>
</html>