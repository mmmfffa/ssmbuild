<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/13
  Time: 21:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
    <style>
         a{
            text-decoration: none;
            color: black;
            font-size: 18px;
         }
         h3{
           opacity: 0.72;
           background: #48ffa5;
           width: 180px;
           height: 38px;
           margin: 100px auto;
           text-align: center;
           line-height: 38px;
           border-radius: 9px;
         }
    </style>
  </head>
  <body>
  <h3>
      <a href="${pageContext.request.contextPath}/book/allBooks">进入书籍页面</a>
  </h3>
  </body>
</html>