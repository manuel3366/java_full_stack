<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Detalle usuario </title>
	</head>
	<body>
		<h1> Información del usuario </h1>
		<h2> ${usuario.nombre} ${usuario.apellido}</h2>
		<h3> Lista de tareas </h3>
		<ul>
			<c:forEach var="tarea" items="${usuario.tareas}">
			<li>
				${tarea.descripcion} - ${tarea.status}
			</li>
			</c:forEach>
		</ul>
		<a href="/usuarios"> Volver al inicio </a>
	</body>
</html>