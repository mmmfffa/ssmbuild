<%--suppress ALL --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>查询书籍</title>
    <%-- bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12">
            <div class="page-header">
                <h1>查询书籍</h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-4">
            <%--              交由toAddBook请求处理--%>
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBooks">返回书籍列表</a>
        </div>
        <div class="col-md-8">
            <span style="float: right;color:red; opacity:0.72; background:whitesmoke;font-size: 20px;">${error}</span>
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
                    <tr>
                        <td>${books.bookID}</td>
                        <td>${books.bookname}</td>
                        <td>${books.bookCounts}</td>
                        <td>${books.detail}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/book/toUpdateBook?id=${books.bookID}">修改</a>
                            &nbsp;| &nbsp;
                            <a href="${pageContext.request.contextPath}/book/deleteBook/${books.bookID}">删除</a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>

</div>
</body>
</html>
