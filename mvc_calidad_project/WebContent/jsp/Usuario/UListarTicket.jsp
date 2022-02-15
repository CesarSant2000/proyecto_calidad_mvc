<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tickets-Listar Ticket</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<!--Header-->
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark inli">
        <div class="collapse navbar-collapse" id="navbarNav">
            <img src="../../imagenes/ticket.png" width="30" height="30" class="d-inline-block align-top" alt="">
            <ul class="navbar-nav ">
                <li class="nav-item  px-3">
                    <a class="nav-link" href="#">Crear</a>
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
                </tr>
            </thead>
            <tbody>
                <tr *ngFor="" (click)="">
                    <th scope="row">{{ticket.id}}</th>
                    <td>{{ticket.titulo}}</td>
                    <td>{{ticket.descripción}}</td>
                    <td>{{ticket.estado}}</td>
                </tr>
            </tbody>
        </table>
        <button type="button" class="float-sm-end  btn btn-primary btn-lg btn-block   btn-dark bg-dark">Nuevo
            Ticket</button>
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