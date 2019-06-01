<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Quartos</title>
</head>
<body>
	
	
	<form method="post" action="/bates-hotel/quartos">
		<div>
			<label for="number">Numero do Quarto</label> <input type="text" name="number"
				id="pages" />
		</div>
		<c:forEach items="${ types }" var="type" varStatus="status">
         	<div>
         		<label for="price_${ type }">${ type }</label>
         		<input type="text" name="prices[${ status.index }].value"/>
         		<input type="hidden" name="prices[${ status.index }].type" 
         			value="${ type }"/>
         	</div>
         </c:forEach>
		<div>
			<input type="submit" value="Enviar">
			<a href ="/bates-hotel/quartos">
	<button type = "button"> Voltar</button>
</a>
		</div>
	</form>
</body>
</html>