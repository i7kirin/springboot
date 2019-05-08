<%--
  Created by IntelliJ IDEA.
  User: duman
  Date: 5/3/19
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>${student.firstName}</title>
</head>
<body>
    The student is confirmed: ${student.firstName} ${student.lastName}
    <br>
    <br>
    Country: ${student.country}
    <br>
    <br>
    Favourite Language: ${student.language}
    <br>
    <br>
    Operating Systems:
    <ul>
        <c:forEach var = "temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>
