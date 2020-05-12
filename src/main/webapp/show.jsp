<%--
  Created by IntelliJ IDEA.
  User: xiaohe
  Date: 2020/5/13
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>show</title>
</head>
<body>
<table align="center" border="1" cellspacing="0" width="500px">

    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>姓名</td>
        <td>修改操作</td>
        <td>删除操作</td>
    </tr>

    <s:iterator value="list" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.user}</td>
            <td>${u.password}</td>
            <td><a href="finEdit?user.id=${u.id}">修改</a></td>
            <td><a href="finDelete?user.id=${u.id}">删除</a></td>
        </tr>
    </s:iterator>
</table>

<br/>

<form action="finAdd" method="post">
    <table border="1" cellspacing="0">
        <h1>添加用户</h1>
        <tr>
            <td>
                用户名:
            </td>
            <td>
                <input type="text" name="user.user" value="">
            </td>
        </tr>

        <tr>
            <td>
                密码：
            </td>
            <td>
                <input type="text" name="user.password" value="">
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" value="增加">
            </td>
        </tr>
    </table>

</form>
</body>
</html>
