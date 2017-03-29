<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>注册页面</title>
</head>
<body>
	<p>请填写注册信息</p>
	<s:form action="registerAction">
		<s:textfield name="username" label="用户名" />
		<s:textfield name="password" label="密码" />
		<tr align="center">
			<td colspan="2"><s:submit value="注册" theme="simple" /></td>
		</tr>
	</s:form>
	<a href="index">返回主页面</a>
</body>
</html>