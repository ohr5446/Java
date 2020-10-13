<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	int num = Integer.parseInt(request.getParameter("num"));
	String title = request.getParameter("title");
	String content = request.getParameter("content");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="ReviewProcess()">

</body>
<script>
function ReviewProcess(){
	var passConfirm = prompt('비밀번호를 입력해주세요.');
	var pass = "${sessionScope.pw}";
	
	if(passConfirm == pass){
		alert('비밀번호가 일치합니다.');
		location.href="ReviewReWrite.jsp?rNum=<%=num%>&title=<%=title%>&content=<%=content%>";
		
	}else{
		alert('비밀번호가 틀립니다.');
		location.href="ReviewList";
	}
}
</script>
</html>