<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Tickets-Editar Ticket</title>
    <!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
		rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
		crossorigin="anonymous">
</head>

<body>
	<%@include file="../templates/banner.html" %>
    <form method="post" action="UEditarTicketController?idTicket=${ticket.idTicket}&idUsuario=${ticket.idUser}" class="p-5">
        <div class="form-group">
            <label for="titulo">Titulo</label>
            <input type="text" class="form-control" id="titulo"
                value="${ticket.titulo}" readonly="readonly" name="titulo">
        </div>
        <br>
        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <textarea class="form-control" id="descripcion" rows="3" name="descripcion">${ticket.descripcion}</textarea>
        </div>
        <br>
        <div class="form-group">
            <label for="estado">Estado del ticket</label>
            <input type="text" class="form-control" id="estado"
                value="${ticket.estado}" readonly="readonly" name="estado">
        </div>
        <br>
        <div class="form-group">
            <label for="prioridad">Prioridad</label>
            <input type="text" class="form-control" id="prioridad"
                value="${ticket.prioridad}" readonly="readonly" name="prioridad">
        </div>
        <br>
        <div class="form-group">
            <label for="encargado">Encargado</label>
            <input type="text" class="form-control" id="encargado"
                value="${ticket.idDeveloper}" readonly="readonly" name="encargado">
        </div>
        <br>
        <div class="form-group">
            <label for="observaciones">Observaciones</label>
            <textarea class="form-control" id="observaciones" rows="3" placeholder="Ingrese la observaciones..." readonly="readonly" name="observaciones">${ticket.observaciones}</textarea>
        </div>

        <br>
        <input type="submit" value="Guardar" class="btn btn-dark">
    </form>
</body>
<!--Footer-->
<footer class="text-center text-lg-start fixed-bottom">
    <!-- Copyright -->
    <div class="text-center p-3">
        © 2022
        <a class="text-dark"
            href="https://calidad2021b.atlassian.net/jira/software/projects/SEDT/boards/2/backlog">Calidad de
            Software</a>
    </div>
    <!-- Copyright -->
</footer>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" 
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" 
		crossorigin="anonymous"></script>
</html>