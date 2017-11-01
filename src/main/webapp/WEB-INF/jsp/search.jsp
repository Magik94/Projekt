<%--
  Created by IntelliJ IDEA.
  User: Dawid
  Date: 01.11.2017
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Search event or days</h2>
<form:form method = "POST" action = "/notes" >
    <table>
        <tr>
            <td><form:label path = "desc">Notes</form:label></td>
            <td><form:input path = "desc" /></td>
        </tr>
        <tr>
            <td colspan = "2">
                <input type = "submit" value = "Submit"/>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>