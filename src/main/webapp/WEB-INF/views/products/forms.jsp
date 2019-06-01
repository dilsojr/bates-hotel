<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Quartos</title>
<link href="/webjars/bootstrap/4.3.1/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body>
	
<div class="col-sm-6 col-xs-12">
	<form method="post" action="/products/create">
		<input type="hidden" name="id" value="${ room.id }">
		<div class="form-group">
			<label for="number">Informe o Numero do Quarto</label>
			<input type="number"  value="${ room.number }" class="form-control" id="number" name="number"  placeholder="Número do Quarto">
		</div>
		<div class="form-group">
			<label for="exampleInputPassword1">Informe o Valor da Diária</label>
			<input type="number" value="${ room.dailyValue }" class="form-control" id="dailyValue" name="dailyValue" placeholder="Valor da Diária">
		</div>
		<div class="form-group">
			<label for="type">Informe o Tipo do Quarto</label>
			<select  id="type" name="type" class="form-control">
				<option ${ room.type == "SINGLE" ? "selected" : ""} value="SINGLE">Solteiro</option>
				<option ${ room.type == "COUPLE" ? "selected" : ""} value="COUPLE">Casal</option>
				<option ${ room.type == "FAMILY" ? "selected" : ""} value="FAMILY">Família</option>
				<option ${ room.type == "EXECUTIVE" ? "selected" : ""} value="EXECUTIVE">Executivo</option>
			</select>
		</div>
		
		<button type="submit" class="btn btn-primary">Enviar</button>
		<c:if test="${ room.id != null}">
			<a href="products/delete?id=${ room.id }">
	    		<button type="button" class="btn btn-danger">Excluir</button>
			</a>
		</c:if>
	</form>
</div>
<script src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>