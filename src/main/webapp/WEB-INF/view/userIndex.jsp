<%@page contentType="text/html;charset=utf-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>主页</title>
</head>
<body>
<%--${lists}--%>
<table>
    <tr>
        <td>账户</td>
        <td>密码</td>
        <td>邮箱</td>
    </tr>
    <c:forEach var="user" items="${pageInfo.list}">   <%--后边是一个对象内容，前边是一个变量--%>
        <tr>
            <td>${user.user}</td>
            <td>${user.password}</td>
            <td>${user.email}</td>
            <td><a href="/updateUser">修改</a></td><!--写修改的时候，里边一定要传个参数href="/updateUser?=$ {user.id}-->
        </tr>
    </c:forEach>
    <tr>
        <td>当前页：${pageInfo.pageNum} </td>
        <td>记录数：${pageInfo.total} </td>
        <td>总页数：${pageInfo.pages}</td>
    </tr>
</table>
</body>
</html>