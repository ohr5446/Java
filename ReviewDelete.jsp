<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% int num  = Integer.parseInt(request.getParameter("num")); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="Delete()">

</body>
<script>
	function Delete(){
		var con = confirm('정말로 삭제하시겠습니까?');
		
		if(con==true){
			location.href="ReviewDelete?num=<%=num %>";
		}else{
			window.history.back();
		}
		
		
	}
</script>
</html>