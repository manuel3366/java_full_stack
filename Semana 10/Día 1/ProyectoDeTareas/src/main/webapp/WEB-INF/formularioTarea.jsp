<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Tarea nueva </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1 class="mt-4 text-primary"> Nueva tarea </h1>
				<form:form action="/procesar/tarea/nueva" method="POST" modelAttribute="tarea">
					<div>
						<form:label class="form-label" path="descripcion">
							Descripción:
						</form:label>
						<form:input class="form-control mb-4" path="descripcion" name="descripcion" type="text"/>
						<div>
							<form:errors class="alert alert-danger" path="descripcion"/>
						</div>
					</div>
					<div>
						<form:label class="form-label" path="status">
							Status:
						</form:label>
						<form:input class="form-control mb-4" path="status" name="status" type="text"/>
						<div>
							<form:errors class="alert alert-danger" path="status"/>
						</div>
					</div>
					<button class="btn btn-primary"> Agregar tarea </button>
				</form:form>
			</div>
			<div class="row">
				<a href="/usuarios"> Volver al inicio </a>
			</div>
		</div>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>