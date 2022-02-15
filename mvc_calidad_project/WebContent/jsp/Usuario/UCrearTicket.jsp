<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Tickets-Crear Ticket</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>

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

<body >
    <h3 class="text-center">Nuevo Ticket</h3>
    <form method="post" action="#" class="p-5">
        <div class="form-group">
          <label for="titulo">Título</label>
          <input type="text" class="form-control" id="titulo" aria-describedby="tituloHelp" placeholder="Ingrese el Título">
        </div>
        <br>
        <div class="form-group">
            <label for="descripcion">Descripción</label>
            <textarea class="form-control" id="descripcion" rows="3" placeholder="Ingrese la descripción..."></textarea>
          </div>

        <br>
        <button type="submit" class="btn btn-dark ">Enviar</button>
      </form>
</body>
<footer class="text-center text-lg-start fixed-bottom">
    <!-- Copyright -->
    <div class="text-center p-3">
      © 2022
      <a class="text-dark" href="https://calidad2021b.atlassian.net/jira/software/projects/SEDT/boards/2/backlog">Calidad de Software</a>
    </div>
    <!-- Copyright -->
  </footer>
</html>
