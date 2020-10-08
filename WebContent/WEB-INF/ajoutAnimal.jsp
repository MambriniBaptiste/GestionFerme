<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un nouvel animal</title>
</head>
<body>
<form action="ajoutAnimal" method="post"></form>
<div>
		<label>Etat</label>
		<input type="text" name="etat">
	</div>
	<div>
		<input type="radio" name="BasseCour" value="BasseCour">
		<label for="BasseCour">BasseCour</label>
		<input type="radio" name="Bétail" value="Bétail">
		<label for="Bétail">Bétail</label>
	</div>
	<div>
		<button type="submit">Ajouter</button>
	</div>
</body>
</html>