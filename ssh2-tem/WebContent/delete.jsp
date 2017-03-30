<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>管理员页面</title>
</head>
<body>
	<p>管理员页面</p>
	<s:form action="deleteAction">
		<p>输入你要删除的用户</p>
		<s:textfield name="username" label="用户名" />
		<tr align="center">
			<td colspan="2"><s:submit value="删除" theme="simple" /></td>
		</tr>
	</s:form>
	
	  	<s:iterator id="t" value="userList">
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td align="center">${t.id}</td>
				</tr>
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td align="center">${t.username}</td>
				</tr>
	</s:iterator>
	
	<a href="index">返回主页面</a>
</body>
</html>
