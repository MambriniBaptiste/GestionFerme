<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">   <!-- Deux liens permettant d'utiliser le BootStrap à placer dans tous nos jsp -->
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
      <link rel="stylesheet" type="text/css" href="/Gestion_Ferme/login.css">
  
<title>Login</title>
</head>
<body>
<section class="sectionlogin">
<div class="form-log">
<h2 class="titre1" >Authentification </h2><br><br>
<form action="login" method="post"><br>
<input class="form-control" type="text" name="login" placeholder="Entrer votre login..."><br>
<input class="form-control" type="password" name="password" placeholder="Enter votre mot de passe..."><br>
<button class="btn btn-primary" type="submit">Connexion</button>
</form>
</div>
</section>
</body>
</html>