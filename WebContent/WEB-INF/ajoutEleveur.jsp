<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un nouvel éleveur</title>
</head>
<body>
<form action="ajoutEleveur" method="post">
<div>
		<label>Nom du nouvel éleveur</label>
		<input type="text" name="nomEleveur">
	</div>
	<div>
		<label>Age de l'éleveur</label>
		<input type="text" name="age">
	</div>
	<div>
		<label>Statut</label>
		<select name="statut" id="statut-select">
		<option value="">--Please choose an option--</option>
		<option value="true">True</option>
		<option value="false">False</option>
		</select>
	</div>
	<div>
		<button type="submit" name="ajoutEleveur">Ajouter</button>
	</div>
	</form>
</body>
</html>