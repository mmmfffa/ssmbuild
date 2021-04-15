<%--suppress ALL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>书籍展示</title>
<%-- bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
         <div class="row clearfix">
               <div class="col-md-12 column">
                    <div class="page-header">
                        <h1>
                            <small>书籍列表——————————显示所有书籍</small>
                        </h1>
                    </div>
               </div>
         </div>

        <div class="row clearfix">
              <div class="col-md-4">
<%--              交由toAddBook请求处理--%>
                  <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
              </div>

              <div class="col-md-8">
                  <%--                查询书籍--%>
                  <form action="${pageContext.request.contextPath}/book/queryBook" method="post" class="form-inline" style="float: right">
                      <button type="submit" class="btn btn-primary">查询书籍</button>
                      <div class="form-group">
                          <input type="text" class="form-control" name="QUbookname" placeholder="请输入要查询书名" style="width:380px">
                      </div>
                  </form>
              </div>

        </div>
        <br>
        <div class="row clearfix">
            <div class="col-md-12">
                <table class="table table-hover table-striped">
                    <thead>
                       <tr>
                           <th>书籍编号</th>
                           <th>书籍名称</th>
                           <th>书籍数量</th>
                           <th>书籍详情</th>
                           <th>操作</th>
                       </tr>
                    </thead>
<%--                 数据从数据库中查询出来--%>

                    <tbody>
                          <c:forEach var="book" items="${books}">
                              <tr>
                                  <td>${book.bookID}</td>
                                  <td>${book.bookname}</td>
                                  <td>${book.bookCounts}</td>
                                  <td>${book.detail}</td>
                                  <td>
                                      <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${book.bookID}">修改</a>
                                      &nbsp;| &nbsp;
                                      <a href="${pageContext.request.contextPath}/book/deleteBook/${book.bookID}">删除</a>
                                  </td>
                              </tr>
                          </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</body>
</html>
