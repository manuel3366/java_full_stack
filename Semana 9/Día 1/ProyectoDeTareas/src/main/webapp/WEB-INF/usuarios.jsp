<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Usuarios </title>
		<link rel="stylesheet" href="css/usuarios.css">
	</head>
	<body>
		<h1> ${titulo} </h1>
		<table class="listado">
			<tr>
				<th> Nombre </th>
				<th> Correo </th>
				<th> Eliminar usuario </th>
				<th> Editar usuario </th>
			</tr>
			<c:forEach var="usuario" items="${usuarios}">
				<tr> 
					<td> ${usuario.nombre} ${usuario.apellido} </td>
					<td> ${usuario.correo} </td>
					<td>
						<form method="POST" action="/eliminar/usuario/${usuario.id}">
							<input type="hidden" name="_method" value="DELETE"/>
							<button> Eliminar </button>
						</form>
					</td>
					<td>
						<a href="/formulario/editar/usuario/${usuario.id}"> Editar </a>
					</td>
				</tr>
			</c:forEach>
		</table>
		<p> El contador va en : ${contador} </p>
		<a href="/formulario/usuario"> Agregar usario</a> -
		<a href="/iniciar/sesion"> Apartado de sesión </a>
	</body>
</html>