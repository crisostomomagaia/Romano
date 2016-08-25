<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
<title>AdicionaContacto</title>
</head>

<body>
	<c:import url="cabecalho.jsp" />
	<hr />
	<form action="mvc?logica=AdicionaContatoLogic" method="post"  >
		<label for="nome">Nome:</label> <input type="text" name="nome"
			id="nome" /><br /> 
		 
		 <caelum:campoData id="dataNascimento" />
		<br /> <input type="submit" value="Gravar"/>
	</form>

	<c:import url="rodape.jsp" />

</body>
</html>