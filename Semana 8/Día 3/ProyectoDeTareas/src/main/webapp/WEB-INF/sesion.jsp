<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
		<title> Sesiones </title>
	</head>
	<body>
		<h1> Mecanismo de sesion </h1>
		<p> El contador va en : ${contador} </p>
		<form method="POST" action="/actualizar/contador">
			<button>
				Iniciar o agregar al contador
			</button>
		</form>
	</body>
</html>