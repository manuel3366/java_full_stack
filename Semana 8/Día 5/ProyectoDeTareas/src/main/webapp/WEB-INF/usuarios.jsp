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
		<ul class="listado">
			<c:forEach var="usuario" items="${usuarios}">
				<li> ${usuario.nombre} ${usuario.apellido} - ${usuario.correo}</li>
			</c:forEach>
		</ul>
		<p> El contador va en : ${contador} </p>
		<a href="/formulario/usuario"> Agregar usario</a> -
		<a href="/iniciar/sesion"> Apartado de sesión </a>
	</body>
</html>