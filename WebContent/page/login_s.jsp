<%@page import="java.util.Date"%>
<%@ page language="java" import="java.lang.*, java.io.*, java.sql.*, java.util.*"  pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String username = (String)session.getAttribute("uid");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>Struts2 Person Login Result</title>
  </head>
  
  <body>
    Hi:<br>
    <%=username%><br>
    Welcome... <br>
    
    <%
    Date date = new Date();
    out.print(date.toGMTString());
    %>
    
  </body>
</html>
