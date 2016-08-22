<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Primeira JSP</title>
</head>
<body>
<center>
	<%--comments in jsp --%>
	<%
		String mensagem = "Bemvindo ao sistema de  agenda fj21";
	%>

	<%
		out.println(mensagem);
	%>
	</br>

	<%
		String desenvolvimento = "Desenvolvido por Cris&oacutestomo Magaia";
	%>

	<%=desenvolvimento%>

	<%
		System.out.println("Tudo foi executado como deve ser!.");
	%>
	
	</center>
</body>
</html>