<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un nouvel animal</title>
</head>
<body>
<form action="ajoutAnimal" method="post">
<div>
		<label>Etat</label>
		<select name="etat" id="etat-select">
		<option value="">--Please choose an option--</option>
		<option value="true">True</option>
		<option value="false">False</option>
		</select>
	</div>
	<div>
		<input type="radio" id="choix1" name="typeAnimal" value="BasseCour">
		<label for="choix1">BasseCour</label>
		<input type="radio" id="choix2" name="typeAnimal" value="B�tail">
		<label for="choix2">B�tail</label>
	</div>
	<div>
		<button type="submit" name="ajoutAnimal">Ajouter</button>
	</div>
	</form>
</body>
</html>