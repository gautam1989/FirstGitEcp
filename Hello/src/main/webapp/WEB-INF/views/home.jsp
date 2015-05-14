<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%-- <P>  The time on the server is ${serverTime}. </P> --%>
<a href="/myapp/test">Click This!</a>

<c:forEach items="${personList}" var="person">
${person.name}
${person.age}
</br>
</c:forEach>

</body>
</html>
