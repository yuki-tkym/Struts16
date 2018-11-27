<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tld/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/tld/struts-bean.tld" prefix="bean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>割る数０のエラーが発生</h3>
<html:messages id="msg" message="false">
    <bean:write name="msg" ignore="true"/>
</html:messages>
<br>
入力された計算
"<bean:write name="ExException" property="num1" scope="request" />" ÷
"<bean:write name="ExException" property="num2" scope="request" />"
<br>
<a href="http://localhost:8080/Struts16/">入力画面に戻る</a>

</body>
</html>