<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">


		<title>Insert title here</title>
	</head>
	<body>
		<form class="w-75 mx-auto">
			<div class="form-group">
				<label for="ticker">Ticker</label>
				<input id="ticker" class="form-control">
			</div>
			<div class="form-group">
				<label for="data">Data</label>
				<input type="date" id="data" class="form-control">
			</div>
			<div class="form-group">
				<label for="preco">Preço</label>
				<input id="preco" type="number" min="0.01" step="0.01" class="form-control">
			</div>
			<div class="form-group">
				<label for="quantidade">Quantidade</label>
				<input id="quantidade" class="form-control">
			</div>
			<div class="form-group">
				<label for="tipo">Tipo</label>
				<input id="tipo" class="form-control">
			</div>
			<input class="mt-2 btn-primary" type="submit" value="Enviar">
		</form>
		<h1 class="text-center">Carteira de Ações</h1>
		<table class="table table-bordered table-hover w-75 mx-auto">
			<thead>
				<tr class="table-primary">
					<th>TICKER</th>
					<th>DATA</th>
					<th>PREÇO</th>
					<th>QUANTIDADE</th>
					<th>TIPO</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${transacoes}" var="t" >
					<tr>
						<td>${t.ticker}</td>
						<td>${t.data}</td>
						<td>${t.preco}</td>
						<td>${t.quantidade}</td>
						<td>${t.tipo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
	</body>
</html>