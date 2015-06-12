<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Security</title>
</head>
<body>
<h1>Spring MVC View Demo</h1>
<form:form commandName="customer" method="post" action="error">
    <form:errors/>
    <div>
        <label for="name">name :</label>
        <form:input path="name" id="name"/> <form:errors path="name"/>
    </div>
    <div>
        <label for="password">password :</label>
        <form:password path="password" id="password"/> <form:errors path="password"/>
    </div>
    <input type="submit" value="submit">
</form:form>
</body>
</html>