<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Clinica Inicio</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>

<nav class="navbar bg-primary navbar-expand-lg" data-bs-theme="dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">Navbar</span>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href='<c:url value="/"/>'>Inicio</a><br/>
        </li>
        <li class="nav-item">
          <a class="nav-link" href='<c:url value="/paciente"/>'>Paciente</a><br/>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true" href=`<c:url value="/otra"/>`>Otra</a><br/>
        </li>
      </ul>
      <form:form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Buscar Paciente" aria-label="Search">
        <button class="btn btn-outline-light" type="submit">Buscar</button>
      </form:form>
    </div>
  </div>
</nav>



<div class="mt-1 mb-5 justify-content-center d-flex" >
	<h1 class="mt-3 mb-3">Bienvenido</h1>
	<c:out value="${pacienteForm}" ></c:out>
</div>

</body>
</html>