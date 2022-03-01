<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Tickets-Listar Ticket</title>
    <!-- CSS only -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
		rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
		crossorigin="anonymous">
</head>

<body>
	<%@include file="../templates/banner.html" %>
    <div class="wrapper">
        <h3 class="text-center">Tickets</h3>
        <c:if test="${tickets.size()==0}">
			<div>
				No existen tickets de soporte
			</div>
		</c:if>
        <c:if test="${tickets.size() > 0 }">
        	<table class="table table-hover">
	            <thead>
	                <tr>
	                    <th>Título</th>
	                    <th>Descripción</th>
	                    <th>Estado</th>
	                    <th>Prioridad</th>
	                </tr>
	            </thead>
	            <tbody>
	                <c:forEach items="${tickets}" var="ticket">
	                	<tr>
		                    <td>${ticket.titulo}</td>
		                    <td>${ticket.descripcion}</td>
		                    <td>${ticket.estado}</td>
		                    <td>${ticket.prioridad}</td>
		                    <td>
		                    	<a class="btn btn-outline-info btn-sm" href="UEditarTicketController?idTicket=${ticket.idTicket}">Actualizar ticket</a>
		                    </td>
		                </tr>
	                </c:forEach>
	            </tbody>
	        </table>
        </c:if>
    </div>
    <h3 class="text-center">Crear un ticket</h3>
    <div class="row d-flex justify-content-center flex-nowrap my-3">
   
    <a class="btn btn-outline-success btn-sm text-center w-auto" href="UCrearTicketController?idUsuario=${elUsuario}">Crear ticket</a>
    </div>
</body>
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
</html>