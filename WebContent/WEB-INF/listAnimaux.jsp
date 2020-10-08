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
    <h3 class="card-header text-center font-weight-bold text-uppercase py-4">List of products</h3>

<div class="card">
    <h3 class="card-header text-center font-weight-bold text-uppercase py-4">List of products</h3>
    <div class="card-body">
        <div id="table" class="table-editable">
      <span class="table-add float-right mb-3 mr-2"><a href="#!" class="text-success"><i
              class="fas fa-plus fa-2x" aria-hidden="true"></i></a></span>
            <table class="table table-bordered table-responsive-md table-striped text-center">
                <thead>
                <tr>
                    <th class="text-center">Id</th>
                    <th class="text-center">Etat</th>
                </tr>
                 </thead>
    <c:forEach items="${animals}" var="a">
     <tr>
                    <td class="pt-3-half" contenteditable="true">${a.idAnimal}</td>
                    <td class="pt-3-half" contenteditable="true">${a.etat}</td>
        </tr>             
         </c:forEach>       
                 </table>
        </div>
    </div>
</div>
</body>
</html>