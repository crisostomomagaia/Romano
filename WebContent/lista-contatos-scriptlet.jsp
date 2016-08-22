<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ page
	import="java.util.*,
                 
 				java.text.SimpleDateFormat,
				java.util.Calendar,
				java.util.Date,
                br.com.caelum.agenda.dao.*,
				br.com.caelum.agenda.modelo.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListaContatosScriptlet</title>
</head>
<body>

	<table border=1>
		<tr><
			<td><center><b>Nome</center></b></td>
			<td><b><center>Email</center></b></td>
			<td><b><center>Endereco</center></b></td>
			<td><center><b>Data de Nascimento</b></center></td>
		</tr>
		<%
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();

			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			for (Contato contato : contatos) {
		%>
		<tr>
		 <td><center><%=contato.getNome()%></center></td> 
			
		<!--<td>${contato.nome}</td>-->	
			<td><center><%=contato.getEmail()%></center></td>
			<td><center><%=contato.getEndereco()%></center></td>
			<td><center><%=sdf.format(contato.getDataNascimento().getTime())%></center></td>
		</tr>
		<%
			}
		%>
	</table>

	

</body>
</html>