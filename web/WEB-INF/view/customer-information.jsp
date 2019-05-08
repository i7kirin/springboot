<%--
  Created by IntelliJ IDEA.
  User: duman
  Date: 5/3/19
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer</title>
</head>
<body>
    The customer is: ${customer.firstName} ${customer.lastName}
    <br>
    <br>
    Free passes: ${customer.freePasses}
    <br>
    <br>
    Postal code: ${customer.postalCode}
    <br>
    <br>
    Course code: ${customer.courseCode}
</body>
</html>
