<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Recetas </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1 class="col-6"> Bienvenid@ ${nombre_usuario} ${apellido_usuario}</h1>
				<a class="col-4" href="/nueva/receta"> + Nueva receta </a>
				<a class="col-2" href="/logout"> Logout </a>
			</div>
			<div class="row">
				<table class="table table-striped">
					<tr>
						<th> Nombre </th>
						<th> Menos de 30 mins </th>
						<th> Autor </th>
						<th> Acciones </th>
					</tr>
					<c:forEach var="receta" items="${recetas}">
						<tr>
							<td> ${receta.nombre} </td>
							<td>
								<c:if test="${receta.menosDe30 == 1}">
									Sí
								</c:if>
								<c:if test="${receta.menosDe30 == 0}">
									No
								</c:if>
							</td>
							<td> ${receta.usuario.nombre} ${receta.usuario.apellido} </td>
							<td> 
								<a href="/detalle/receta/${receta.id}"> Ver receta </a>
								<c:if test="${receta.usuario.id == id_usuario}">
									- <a href="/editar/receta/${receta.id}"> Editar </a>
									- <a href="/eliminar/receta/${receta.id}"> Eliminar </a>
								</c:if>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>