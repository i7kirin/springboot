<%--
  Created by IntelliJ IDEA.
  User: duman
  Date: 5/3/19
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Form</title>
</head>
<style>
    .error{
        color:red;
    }
</style>
<body>

<br/>

<form:form action="register" modelAttribute="student">

    First name: <form:input path="firstName"/>
    <form:errors path="firstName" cssClass="error"/>
    <br>
    <br>

    Last name: <form:input path="lastName"/>

    <br>
    <br>

    Country: <form:select path="country">
    <form:options items="${student.countryOptions}"/>
</form:select>
    <br>
    <br>

    Java<form:radiobutton path="language" value="Java"/>
    C++<form:radiobutton path="language" value="C++"/>
    PHP<form:radiobutton path="language" value="PHP"/>
    <br>
    <br>
    Operating Systems:
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
    Windows <form:checkbox path="operatingSystems" value="Windows"/>
    <br>
    <br>

    <input type="submit" value="Submit"/>

</form:form>

</body>
</html>
