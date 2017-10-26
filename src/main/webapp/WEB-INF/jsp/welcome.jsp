<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page  language="java" import="java.util.*,java.text.*"%>
<html>
<head>
<%
//		Date today= new Date();
//		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
//		String yyyyMMdd = DATE_FORMAT.format(today);
//
//		SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("MM/dd/yyyy");
//		String MMddyyyyToday = DATE_FORMAT2.format(today);

	Calendar ca = new GregorianCalendar();
	int iTDay=ca.get(Calendar.DATE);
	int iTYear=ca.get(Calendar.YEAR);
	int iTMonth=ca.get(Calendar.MONTH);
	int iNDay = +1;



%>
<body>
<title>Calendar in JSP</title>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<p>Dzisiaj jest : <%=iTDay%>/<%=iTMonth%>/<%=iTYear%></p>
</table >
<form>
<input type= "button" onclick="location.href='/notes'" value="next day"  >

<p>Dzisiaj jest : </p>
<tr>

<input type="button"   value="Add Notes" >

</tr>
</form>
</body>
</html>
