<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>����ҳ��</title>
</head>
<body>
	<p>����д�����Ϣ</p>
	<s:form action="updateAction">
		<s:textfield name="username" label="�û���" />
		<s:textfield name="oldPassword" label="������" />
		<s:textfield name="newPassword" label="������" />
		<tr align="center">
			<td colspan="2"><s:submit value="����" theme="simple" /></td>
		</tr>
	</s:form>
	<a href="index">������ҳ��</a>
</body>
</html>
