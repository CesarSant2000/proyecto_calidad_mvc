<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Tickets-Editar Ticket</title>
    <link rel="stylesheet" href="../../BootStrap/bootstrap.css">
</head>

<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark inli">
        <div class="collapse navbar-collapse" id="navbarNav">
            <img src="../Imagenes/ticket.png" width="30" height="30" class="d-inline-block align-top" alt="">
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
    <form method="post" action="#" class="p-5">
        <div class="form-group">
            <label for="titulo">Titulo</label>
            <input type="text" class="form-control" id="titulo" aria-describedby="tituloHelp"
                placeholder="Ingrese el Título">
        </div>
        <br>

        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <textarea class="form-control" id="descripcion" rows="3" placeholder="Ingrese la descripción..."></textarea>
        </div>
        <br>
        <div class="dropdown form-group">
            <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton"
                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Estado
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="#">Abierto</a>
                <a class="dropdown-item" href="#">Aplazado</a>
                <a class="dropdown-item" href="#">Nuevo</a>
                <a class="dropdown-item" href="#">Sin Solución</a>
                <a class="dropdown-item" href="#">Solucionado</a>

            </div>
        </div>
        <br>
        <div class="dropdown form-group">
            <button class="btn btn-dark dropdown-toggle" type="button" id="dropdownMenuButton"
                data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Prioridad
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="#">Importante</a>
                <a class="dropdown-item" href="#">Común</a>
                <a class="dropdown-item" href="#">Menos Importante</a>
            </div>
        </div>
        <br>

        <div class="form-group">
            <label for="Observaciones">Observaciones</label>
            <textarea class="form-control" id="Observaciones" rows="3" placeholder="Ingrese la observaciones..."></textarea>
        </div>

        <br>
        <button type="submit" class="btn btn-dark ">Guardar</button>
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
</html>