<%--
  Created by IntelliJ IDEA.
  User: 王
  Date: 2017/6/16
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <form action="UserServlet" method="post">
    <input type="text" name="name">
    <input type="submit" value="提交">

  </form>
  <div>上次类容为：${requestScope.name}</div>
  </body>
</html>
