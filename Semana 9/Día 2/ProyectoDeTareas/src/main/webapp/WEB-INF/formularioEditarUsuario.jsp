<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Edición </title>
		<link rel="stylesheet" href="/css/usuarios.css">
	</head>
	<body>
		<h1> Editar usuario </h1>
		<form:form action="/procesar/editar/usuario/${usuario.id}" method="POST" modelAttribute="usuario">
			<input type="hidden" name="_method" value="PUT"/>
			<div>
				<form:label path="nombre">
					Nombre:
				</form:label>
				<form:input path="nombre" type="text" name="nombre" value="${usuario.nombre}"/>
				<form:errors path="nombre"/>
			</div>
			<div>
				<form:label path="apellido">
					Apellido:
				</form:label>
				<form:input path="apellido" type="text" name="apellido" value="${usuario.apellido}"/>
				<form:errors path="apellido"/>
			</div>
			<div>
				<form:label path="correo">
					Correo:
				</form:label>
				<form:input path="correo" type="text" name="correo" value="${usuario.correo}"/>
				<form:errors path="correo"/>
			</div>
			<div>
				<form:label path="contraseña">
					Contraseña:
				</form:label>
				<form:input path="contraseña" type="password" name="contraseña" value="${usuario.contraseña}"/>
				<form:errors path="contraseña"/>
			</div>
			<button>
				Editar
			</button>
		</form:form>
		<a href="/usuarios"> Volver al inicio </a>
	</body>
</html>