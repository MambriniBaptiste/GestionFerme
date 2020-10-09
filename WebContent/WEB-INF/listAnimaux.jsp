<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
  
<title>Liste des animaux</title>
</head>
<body>
  <table border="1">
<tr>
<th>id</th>
<th>Etat</th>
</tr>
<c:forEach var="a" items="${animaux}">
<td>${a.getIdAnimal()}</td>
<td>${a.isEtat()}</td>
<td><a href="delete?pId=${a.getIdAnimal() }" class="btn badge-danger">Supprimer</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>