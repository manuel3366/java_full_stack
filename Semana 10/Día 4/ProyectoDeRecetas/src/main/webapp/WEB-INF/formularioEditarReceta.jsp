<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title> Editar receta </title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<h1 class="col-6"> Editar receta </h1>
				<a class="col-4" href="/recetas"> Todas las recetas</a>
				<a class="col-2" href="/logout"> Logout </a>
			</div>
			<div class="row">
				<form:form action="/procesar/editar/receta/${receta.id}" method="POST" modelAttribute="receta">
					<input type="hidden" name="_method" value="PUT"  />
					<div class="mt-4">
						<form:label class="form-label" path="nombre">
							Nombre:
						</form:label>
						<form:input class="form-control mb-4" path="nombre" type="text" name="nombre" value="${receta.nombre}"/>
						<div>
							<form:errors class="alert alert-danger" path="nombre"/>
						</div>
					</div>
					<div class="mt-4">
						<form:label class="form-label" path="descripcion">
							Descripción:
						</form:label>
						<form:input class="form-control mb-4" path="descripcion" type="text" name="descripcion" value="${receta.descripcion}"/>
						<div>
							<form:errors class="alert alert-danger" path="descripcion"/>
						</div>
					</div>
					<div class="mt-4">
						<form:label class="form-label" path="instrucciones">
							Instrucciones:
						</form:label>
						<form:input class="form-control mb-4" path="instrucciones" type="text" name="instrucciones" value="${receta.instrucciones}"/>
						<div>
							<form:errors class="alert alert-danger" path="instrucciones"/>
						</div>
					</div>
					<div class="mt-4">
						<form:label class="form-label" path="fechaCoccion">
							Fecha de cocción:
						</form:label>
						<form:input class="form-control mb-4" path="fechaCoccion" type="date" name="fechaCoccion" value="${receta.fechaCoccion}"/>
						<div>
							<form:errors class="alert alert-danger" path="fechaCoccion"/>
						</div>
					</div>
					<div>
						<h3> Se cocina en menos de 30 minutos? </h3>
						<c:if test="${receta.menosDe30 == 1}">
							<form:label for="si" class="form-label" path="menosDe30">
								Sí:
							</form:label>
							<form:radiobutton path="menosDe30" id="si" name="menosDe30" value="1" checked="true"/>
							<form:label for="no" class="form-label" path="menosDe30">
								No:
							</form:label>
							<form:radiobutton path="menosDe30" id="no" name="menosDe30" value="0"/>
						</c:if>
						<c:if test="${receta.menosDe30 == 0}">
							<form:label for="si" class="form-label" path="menosDe30">
								Sí:
							</form:label>
							<form:radiobutton path="menosDe30" id="si" name="menosDe30" value="1" />
							<form:label for="no" class="form-label" path="menosDe30">
								No:
							</form:label>
							<form:radiobutton path="menosDe30" id="no" name="menosDe30" value="0" checked="true"/>
						</c:if>
						<div>
							<form:errors class="alert alert-danger" path="menosDe30"/>
						</div>
					</div>
					<button class="btn btn-primary">
						Editar receta
					</button>
				</form:form>
			</div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
	</body>
</html>