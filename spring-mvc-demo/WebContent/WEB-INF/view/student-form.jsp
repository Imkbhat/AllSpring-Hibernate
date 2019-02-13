<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title> Registration Form </title>
</head>
<body>
<form:form action="processForm"  modelAttribute="student">
First Name : <form:input path="firstName"/>
Last Name : <form:input path="lastName"/>

Country : <form:select path="country">
		<form:options items="${student.countryOptions}"/>
	</form:select>
OS :
Ubuntu:	<form:checkbox path="operatingSystems" value="Ubuntu"/>
Linux <form:checkbox path="operatingSystems" value="Linux"/>
MAC <form:checkbox path="operatingSystems" value="Mac"/>
Windows <form:checkbox path="operatingSystems" value="Windows"/>

<input type="submit"  value="Submit"/>
</form:form>
</body>
</html>