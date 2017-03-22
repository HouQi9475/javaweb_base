<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   function change() {
	   var img = document.getElementById("img");
	   img.src="/javaweb_base/VcodeServlet?a="+new Date().getTime();
	
}
</script>
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
<table>
<tr>
   <td>用户名：</td>
    <td><input type="text" name="username" value="<%=uname%>"/></td>
</tr>
<tr>
   <td>密码：</td>
   <td><input type="password" name="password"/></td>
</tr>
<tr>
   <td>验证码：</td>
   <td><input type="text" name="vcode" size="5"><img id="img" alt="验证码" src="/javaweb_base/VcodeServlet"><a href="javascript:change();">换一张</a></td>
</tr>
<tr>
   <td colspan="2"><input type="submit" value="登录"/></td>
</tr>


</table>
</form>

</body>
</html>