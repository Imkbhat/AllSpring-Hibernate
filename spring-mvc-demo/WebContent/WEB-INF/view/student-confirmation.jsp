<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title> Confirmation Form </title>
</head>
<body>
The Student is Confirmed : 
First Name : ${student.firstName}
Last Name: ${student.lastName}
Country : ${student.country}
<%-- Fav Language : ${student.favoriteLangauge} --%>

<ul>
	<c:forEach items="${student.operatingSystems}" var="temp">
	<li>${temp}</li>
	</c:forEach>
</ul>

</body>
</html>