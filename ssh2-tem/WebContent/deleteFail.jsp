<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>删除失败</title>
</head>
<body>
删除失败...不存在该用户

<% out.println("test123");


%>
<br/>


<%="TEST"%>
  <s:property value="tip"/>
  <s:property value="#a"/>
  
  	<s:iterator id="temporder" value="orderList">
				<tr onmouseover="this.style.backgroundColor='#ffff66';" onmouseout="this.style.backgroundColor='#d4e3e5';">
					<td align="center">${temporder}</td>
				</tr>
	</s:iterator>
 
 
</body>
</html>
