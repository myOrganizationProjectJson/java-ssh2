<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>ע��ҳ��</title>
</head>
<body>
	<p>����дע����Ϣ</p>
	<s:form action="registerAction">
		<s:textfield name="username" label="�û���" />
		<s:textfield name="password" label="����" />
		<tr align="center">
			<td colspan="2"><s:submit value="ע��" theme="simple" /></td>
		</tr>
	</s:form>
	<a href="index">������ҳ��</a>
</body>
</html>