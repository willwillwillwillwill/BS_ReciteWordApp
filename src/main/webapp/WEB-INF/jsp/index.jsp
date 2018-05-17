<%@page contentType="text/html" pageEncoding = "utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "htpp://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv = "Content-Type" content = "text/html; charset=UTF-8">
<title>参数</title>
<script src = "https://code.jquery.com/jquery-3.2.0.js"></script>

</head>
<body>
<form id = "form" action = "./submit.do" method = "POST">
<table>
<tr>
<td>角色名称</td>
<td><input id = "roleName" name="roleName" value=""/></td>
</tr>
<tr>
<td>备注</td>
<td><input id = "note" name="note" value=""/></td>
</tr>

<tr>
<td></td>
<td align="right"><input type = "submit" value = "提交"/></td>
</tr>

</table>
</form>
</body>
</html>