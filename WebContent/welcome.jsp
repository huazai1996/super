<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>带来什么好消息了？</h1>
	${info }
	编号:	${user.id }<br/>
	姓名:${user.name }<br/>
	爱好:${user.hobbies }<br/>
	生日:${user.birthday }<br/>
	婚否:${user.married }
</body>
</html>