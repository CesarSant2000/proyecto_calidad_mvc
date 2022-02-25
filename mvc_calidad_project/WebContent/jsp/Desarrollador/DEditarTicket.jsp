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
    <form method="post" action="DEditarTicketController?idTicket=${ticket.idTicket}&idUsuario=${ticket.idUser}" class="p-5">
        <div class="form-group">
            <label for="titulo">Titulo</label>
            <input type="text" class="form-control" id="titulo"
                value="${ticket.titulo}" readonly="readonly" name="titulo">
        </div>
        <br>
        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <textarea class="form-control" id="descripcion" rows="3" readonly="readonly" name="descripcion">${ticket.descripcion}</textarea>
        </div>
        <br>
        <label for="estado">Estado del ticket</label>
        <div>
        	<select id="estado" name="estado" class="form-select">
	        	<c:if test="${ticket.estado == ''}">
	        		<option value="" selected>Seleccionar</option>
		        	<option value="abierto">Abierto</option>
		        	<option value="aplazado">Aplazado</option>
		        	<option value="nuevo">Nuevo</option>
		        	<option value="sin_solucion">Sin Solución</option>
		        	<option value="solucionado">Solucionado</option>
	        	</c:if>
	        	<c:if test="${ticket.estado == 'abierto'}">
	        		<option value="">Seleccionar</option>
		        	<option value="abierto" selected>Abierto</option>
		        	<option value="aplazado">Aplazado</option>
		        	<option value="nuevo">Nuevo</option>
		        	<option value="sin_solucion">Sin Solución</option>
		        	<option value="solucionado">Solucionado</option>
	        	</c:if>
	        	<c:if test="${ticket.estado == 'aplazado'}">
	        		<option value="">Seleccionar</option>
		        	<option value="abierto">Abierto</option>
		        	<option value="aplazado" selected>Aplazado</option>
		        	<option value="nuevo">Nuevo</option>
		        	<option value="sin_solucion">Sin Solución</option>
		        	<option value="solucionado">Solucionado</option>
	        	</c:if>
	        	<c:if test="${ticket.estado == 'nuevo'}">
	        		<option value="">Seleccionar</option>
		        	<option value="abierto">Abierto</option>
		        	<option value="aplazado">Aplazado</option>
		        	<option value="nuevo" selected>Nuevo</option>
		        	<option value="sin_solucion">Sin Solución</option>
		        	<option value="solucionado">Solucionado</option>
	        	</c:if>
	        	<c:if test="${ticket.estado == 'sin_solucion'}">
	        		<option value="">Seleccionar</option>
		        	<option value="abierto">Abierto</option>
		        	<option value="aplazado">Aplazado</option>
		        	<option value="nuevo">Nuevo</option>
		        	<option value="sin_solucion" selected>Sin Solución</option>
		        	<option value="solucionado">Solucionado</option>
	        	</c:if>
	        	<c:if test="${ticket.estado == 'solucionado'}">
	        		<option value="">Seleccionar</option>
		        	<option value="abierto">Abierto</option>
		        	<option value="aplazado">Aplazado</option>
		        	<option value="nuevo">Nuevo</option>
		        	<option value="sin_solucion">Sin Solución</option>
		        	<option value="solucionado" selected>Solucionado</option>
	        	</c:if>
	        </select>
        </div>
        <br>
        <label for="prioridad">Prioridad</label>
        <div>
        	<select id="prioridad" name="prioridad" class="form-select">
	        	<c:if test="${ticket.prioridad == 'alta'}">
	        		<option value="">Seleccionar</option>
	        		<option value="alta" selected>Alta</option>
	        		<option value="media">Media</option>
	        		<option value="baja">Baja</option>
	        	</c:if>
	        	<c:if test="${ticket.prioridad == 'media'}">
	        		<option value="">Seleccionar</option>
	        		<option value="alta">Alta</option>
	        		<option value="media" selected>Media</option>
	        		<option value="baja">Baja</option>
	        	</c:if>
	        	<c:if test="${ticket.prioridad == 'baja'}">
	        		<option value="">Seleccionar</option>
	        		<option value="alta">Alta</option>
	        		<option value="media">Media</option>
	        		<option value="baja" selected>Baja</option>
	        	</c:if>
	        	<c:if test="${ticket.prioridad == ''}">
	        		<option value="" selected>Seleccionar</option>
	        		<option value="alta">Alta</option>
	        		<option value="media">Media</option>
	        		<option value="baja">Baja</option>
	        	</c:if>
	        </select>
        </div>
        <br>
        <label for="encargado">Encargado</label>
		<div>
        	<select id="encargado" name="encargado" class="form-select">
	        	<option value="0">Seleccionar</option>
	        	<c:forEach items="${desarrolladores}" var="desarrollador">
	        	<c:if test="${desarrollador.idUsuario == ticket.idDeveloper}">
	        		<option value="${desarrollador.idUsuario}" selected>${desarrollador.username}</option>
	        	</c:if>
	        	<c:if test="${desarrollador.idUsuario != ticket.idDeveloper}">
	        		<option value="${desarrollador.idUsuario}">${desarrollador.username}</option>
	        	</c:if>
	        	</c:forEach>
	        </select>
        </div>
        <br>
        <div class="form-group">
            <label for="observaciones">Observaciones</label>
            <textarea class="form-control" id="observaciones" rows="3" placeholder="Ingrese la observaciones..." name="observaciones">${ticket.observaciones}</textarea>
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