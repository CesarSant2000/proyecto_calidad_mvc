<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tickets-Log-in</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
    <form method="post" action="#">
    <section class="vh-100 gradient-custom">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col-12 col-md-8 col-lg-6 col-xl-5">
              <div class="card bg-dark text-white" style="border-radius: 1rem;">
                <div class="card-body p-5 text-center">
                  <div class="mb-md-5 mt-md-4 pb-5">
                    <h2 class="fw-bold mb-2 text-uppercase">Log-in</h2>
                    <p class="text-white-50 mb-5">Ingrese el correo y contraseña!</p>

                    <!--NO SÉ SI AGREGARLE EL RADIOBUTTON PARA SABER QUE QUE TIPO DE USUARIO ES, O NO
                        EL CÓDIGO DE LOS RADIOBUTTON ESTÁ AHI POR SI TOCA USARLO
                        <div class="custom-control custom-radio">
                        <h6>¿Usted es usuario o desarrollador?</h6>
                        <input type="radio" id="customRadio1" name="customRadio" class="custom-control-input">
                        <label class="custom-control-label" for="customRadio1">Usuario</label>
                      </div>
                      <div class="custom-control custom-radio">
                        <input type="radio" id="customRadio2" name="customRadio" class="custom-control-input">
                        <label class="custom-control-label" for="customRadio2">Desarrollo</label>
                        <br><br>
                      </div>-
                    -->
                    <div class="form-outline form-white mb-4">
                      <input type="email" id="typeEmailX" class="form-control form-control-lg" />
                      <label class="form-label" for="typeEmailX">Correo</label>
                    </div>
                    <div class="form-outline form-white mb-4">
                      <input type="password" id="typePasswordX" class="form-control form-control-lg" />
                      <label class="form-label" for="typePasswordX">Contraseña</label>
                    </div>
                    <button class="btn btn-outline-light btn-lg px-5" type="submit">Ingresar</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
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