<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Tarea nueva </title>
	</head>
	<body>
		<h1> Nueva tarea </h1>
		<form:form action="/procesar/tarea/nueva" method="POST" modelAttribute="tarea">
			<div>
				<form:label path="descripcion">
					Descripción:
				</form:label>
				<form:input path="descripcion" name="descripcion" type="text"/>
				<form:errors path="descripcion"/>
			</div>
			<div>
				<form:label path="status">
					Status:
				</form:label>
				<form:input path="status" name="status" type="text"/>
				<form:errors path="status"/>
			</div>
			<div>
				<form:label path="usuario">
					Selecciona el usuario:
				</form:label>
				<form:select path="usuario">
					<c:forEach var="usuario" items="${usuarios}">
						<form:option value="${usuario.id}">
							${usuario.nombre} ${usuario.apellido}
						</form:option>
					</c:forEach>
				</form:select>
			</div>
			<button> Agregar tarea </button>
		</form:form>
		<a href="/usuarios"> Volver al inicio </a>
	</body>
</html>