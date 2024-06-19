<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="/css/usuarios.css">
	</head>
	<body>
		<h1> Agregar nuevo usuario </h1>
		<form method="POST" action="/agregar/usuario">
			<div>
				<label for="nombre"> Nombre: </label>
				<input type="text" id="nombre" name="nombre"> 
				<span class="mensaje-error">${errorNombre}</span>
			</div>
			<div>
				<label for="apellido"> Apellido: </label>
				<input type="text" id="apellido" name="apellido">
				<span class="mensaje-error">${errorApellido}</span>
			</div>
			<button> Agregar </button>
		</form>
		<p> El contador va en : ${contador} </p>
		<a href="/usuarios"> Lista de usuarios </a>
	</body>
</html>