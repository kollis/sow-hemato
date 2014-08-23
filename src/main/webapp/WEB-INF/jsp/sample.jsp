<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<body>

This is sample.jsp

<div>
	<a href='<c:url value="j_spring_security_logout"/>'>Logout</a>
</div>

</body>
</html>