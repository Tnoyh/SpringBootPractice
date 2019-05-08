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
            <td><a href="/updateUser">修改</a></td>
        </tr>
    </c:forEach>
    <tr>当前页：${pageInfo.pageNum} 记录数：${pageInfo.total} 总页数：${pageInfo.pages}</tr>
</table>
</body>
</html>