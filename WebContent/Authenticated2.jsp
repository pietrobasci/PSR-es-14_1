<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Cache-Control" content="no-cache">

<title>Authenticated</title>
</head>
<body>

    <h2>
	${user.firstName} , benvenuto <br>
	</h2>
	
	<br>
	<h3>Questo e' il tuo profilo</h3>
	<br>
	
	<table border="1">
	<tr><td>Nome:</td><td> ${user.firstName} </td></tr> 
	<tr><td>Cognome:</td><td> ${user.lastName} </td></tr> 
	<tr><td>Sesso:</td><td> ${user.sex} </td></tr> 
	<tr><td>Email:</td><td> ${user.email} </td></tr> 
	<tr><td>Eta':</td><td> ${user.eta} </td></tr> 
	</table> 
	
    <br>
    <a title="Visualizza esami sostenuti" href="/es-14.1/restricted/AServlet">Esami sostenuti</a>   
    <a title="Aggiungi un esame" href="/es-14.1/RegisterExam.html">Aggiungi esame</a>
    
</body>
</html>