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
		<input type="radio" id="choix1" name="typeAnimal" value="BasseCour">
		<label for="choix1">BasseCour</label>
		<input type="radio" id="choix2" name="typeAnimal" value="Bétail">
		<label for="choix2">Bétail</label>
	</div>
	<div>
		<input type="submit" name="ajoutAnimal">
	</div>
</body>
</html>