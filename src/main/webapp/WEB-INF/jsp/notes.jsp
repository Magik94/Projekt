<%--
  Created by IntelliJ IDEA.
  User: Dawid
  Date: 21.10.2017
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
<head>
    <title>Notes</title>
</head>
<body>

<TABLE BORDER=2>
    <%
        for ( int i = 0; i <5 ; i++ ) {
    %>
    <TR>
        <TD>Number</TD>
        <TD><%= i+1 %></TD>
    </TR>
    <%
        }
    %>
</TABLE>
<ul>
    <c:forEach var="listValue" items="${examples}">
        <li>${listValue.localDate} - ${listValue.desc}</li>
    </c:forEach>
</ul>
<h1>Wyniki</h1>
<table>
    <tr>
        <td>Notes</td>
        <td>${desc}</td>
    </tr>
</table>
<input type="button"  onclick="location.href='/'" value="Back" >
</body>
</html>
