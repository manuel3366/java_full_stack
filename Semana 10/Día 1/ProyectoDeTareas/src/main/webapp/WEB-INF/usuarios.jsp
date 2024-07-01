<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Usuarios </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1 class="col-9 mt-4"> Bienvenid@ de vuelta ${nombre_usuario} ${apellido_usuario}</h1>
				<form class="col-3" action="/procesa/logout" method="GET">
					<button class="btn btn-secondary mt-4">
						Logout
					</button>
				</form>
			</div>
			<div class="row">
				<h1> ${titulo} </h1>
			</div>
			<div class="row">
				<table class="table table-striped">
					<tr>
						<th> Nombre </th>
						<th> Correo </th>
						<th> Eliminar usuario </th>
						<th> Editar usuario </th>
						<th> Ver tareas </th>
					</tr>
					<c:forEach var="usuario" items="${usuarios}">
						<tr> 
							<td> ${usuario.nombre} ${usuario.apellido} </td>
							<td> ${usuario.correo} </td>
							<td>
								<form method="POST" action="/eliminar/usuario/${usuario.id}">
									<input type="hidden" name="_method" value="DELETE"/>
									<button class="btn btn-danger"> Eliminar </button>
								</form>
							</td>
							<td>
								<a href="/formulario/editar/usuario/${usuario.id}"> Editar </a>
							</td>
							<td>
								<a href="/tareas/usuario/${usuario.id}"> Ver tareas </a>
							</td>
						</tr>
					</c:forEach>
				</table>
			</div>
			<div class="row">
				<a class="col-2" href="/formulario/tarea"> Agregar tarea </a>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>