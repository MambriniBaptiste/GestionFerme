<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter une nouvelle ferme</title>
</head>
<body>
<form action="ajoutFerme" method="post">
<div>
		<label>Nom de la nouvelle ferme</label>
		<input type="text" name="nomFerme">
	</div>
	<div>
		<label>Date d'achat de la nouvelle ferme</label>
		<input type="date" name="dateAchat" min="1900-01-01" max="2020-12-31">
	</div>
	<div>
		<button type="submit" name="ajoutFerme">Ajouter</button>
	</div>
	</form>
</body>
</html>