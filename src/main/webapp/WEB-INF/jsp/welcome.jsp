<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page  language="java" import="java.util.*,java.text.*"%>
<html>
<head>
<body>
<title>Calendar in JSP</title>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
</table >
<form>

<p>Dzisiaj jest : </p>
<tr>
	<input type="button" value="PreviusDay" onclick="location.href='/previusDay'">
<input type="button"   value="NextDay" onclick="location.href='/nextDay?nextDate=${day.nextDate}'" >
	<p>${day.localDate} - ${day.desc}</p>

</form>

</body>
</html>
