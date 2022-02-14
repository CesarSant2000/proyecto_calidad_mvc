<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Tickets-Listar Ticket</title>
    <link rel="stylesheet" href="../../BootStrap/bootstrap.css">
</head>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark inli">
        <div class="collapse navbar-collapse" id="navbarNav">
            <img src="../Imagenes/ticket.png" width="30" height="30" class="d-inline-block align-top" alt="">
            <ul class="navbar-nav ">
                <li class="nav-item  px-3">
                    <a class="nav-link" href="#">Editar</a>
                </li>
                <li class="nav-item  px-3">
                    <a class="nav-link" href="#">Listar</a>
                </li>
            </ul>
        </div>
        <div class="float-sm-end d-inline-block " id="navbarNav">
    
            <ul class="navbar-nav ">
                <li class="nav-item  px-3">
                    <a class="nav-link" href="#">Salir</a>
                </li>
            </ul>
        </div>
    </nav>
</header>

<body>
    <div >
        <h3 class="text-center">Tickets</h3>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Título</th>
                    <th scope="col">Descripción</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Prioridad</th>
                    <th scope="col">Observaciones</th>
                </tr>
            </thead>
            <tbody>
                <tr *ngFor="" (click)="">
                    <th scope="row">{{ticket.id}}</th>
                    <td>{{ticket.titulo}}</td>
                    <td>{{ticket.descripción}}</td>
                    <td>{{ticket.estado}}</td>
                    <td>{{ticket.prioridad}}</td>
                    <td>{{ticket.observaciones}}</td>
                </tr>
            </tbody>
        </table>
        <button type="button" class="float-sm-end  btn btn-primary btn-lg btn-block   btn-dark bg-dark">Editar
            Ticket</button>
    </div>
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
</html>