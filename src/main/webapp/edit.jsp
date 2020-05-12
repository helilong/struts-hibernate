<%--
  Created by IntelliJ IDEA.
  User: xiaohe
  Date: 2020/5/13
  Time: 2:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="Update" method="post">
    <table align="center" border="1" cellspacing="0">
        <tr>
            <td>
                用户名:
            </td>
            <td>
                <input type="text" name="userinfo.uuser" value="${user.name }">
            </td>
        </tr>

        <tr>
            <td>
                密码：
            </td>
            <td>
                <input type="text" name="userinfo.upassword" value="${user.password }">
            </td>
        </tr>


        <tr>
            <td colspan="2" align="center">
                <input type="hidden" name="user.id" value="${user.id}">
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>

</form>

</body>
</html>
