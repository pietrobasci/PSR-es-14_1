<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Cache-Control" content="no-cache">

<title>Exams</title>
</head>
<body>

    <h2>Gli esami che hai sostenuto sono: <br></h2>
    
    <table border=1>
    <c:forEach items="${exam}" var="item" varStatus="status">
    <tr><td> ${status.index+1}</td><td>${item.getCourseName()}</td></tr>
    </c:forEach>
    </table>
    
    <br>
    <a title="Aggiungi un'altro esame" href="/es-14.1/RegisterExam.html">Aggiungi esame</a>   
    <a title="Torna alla pagina iniziale" href="/es-14.1/Authenticated.jsp">Home page</a>

</body>
</html>