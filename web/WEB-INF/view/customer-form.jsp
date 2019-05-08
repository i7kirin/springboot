<%--
  Created by IntelliJ IDEA.
  User: duman
  Date: 5/3/19
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{
            color:red;
        }
    </style>
</head>
<body>

<br/>

<f:form action="processForm" modelAttribute="customer" method="post">

    First name: <f:input path="firstName"/>
    <f:errors path="firstName" cssClass="error"/>
    <br>
    <br>

    Last name(*): <f:input path="lastName"/>
    <f:errors path="lastName" cssClass="error"/>
    <br>
    <br>
    Free passes(*): <f:input path="freePasses"/>
    <f:errors path="freePasses" cssClass="error"/>
    <br>
    <br>

    Postal code: <f:input path="postalCode"/>
    <f:errors path="postalCode" cssClass="error"/>
    <br>
    <br>

    Course code: <f:input path="courseCode"/>
    <f:errors path="courseCode" cssClass="error"/>
    <br>
    <br>

    <input type="submit" value="Submit"/>

</f:form>

</body>
</html>
