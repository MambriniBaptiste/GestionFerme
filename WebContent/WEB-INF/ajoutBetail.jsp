<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter un nouvel animal type bétail</title>
</head>
<body>
<form action="ajoutBetail" method="post">
<div>
		<label>Etat</label>
		<select name="etat" id="etat-select">
		<option value="">--Please choose an option--</option>
		<option value="true">True</option>
		<option value="false">False</option>
		</select>
	</div>
	<div>
		<label>techElevage</label>
		<input type="text" name="techElevage">
	</div>
	<div>
		<button type="submit" name="ajoutBetail">Ajouter</button>
	</div>
	</form>
</body>
</html>