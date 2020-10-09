<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un nouvel animal type basse cour</title>
</head>
<body>
<form action="ajoutBasseCour" method="post">
<div>
		<label>Etat</label>
		<select name="etat" id="etat-select">
		<option value="">--Please choose an option--</option>
		<option value="true">True</option>
		<option value="false">False</option>
		</select>
	</div>
	<div>
		<label>Habitat</label>
		<input type="text" name="habitat">
	</div>
	<div>
		<button type="submit" name="ajoutBasseCour">Ajouter</button>
	</div>
	</form>
</body>
</html>