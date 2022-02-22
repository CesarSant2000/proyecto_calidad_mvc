<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Tickets-Log-in</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" 
		rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" 
		crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_style.css">
</head>
<body>
    <form method="POST" action="LoginController" class="needs-validation" novalidate>
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
                      	<input type="email" name="usuario" class="form-control form-control-lg" id="validation01" placeholder="Correo" required/>
                      	<div class="invalid-feedback">
				        	Ingrese un Correo.
						</div>
                    </div>

                    <div class="form-outline form-white mb-4">
                      	<input type="password" name="password" class="form-control" id="validation02" placeholder="" required>
                   		<div class="invalid-feedback">
				        	Ingrese una Clave.
						</div>
                    </div>

                    

                    <input type="submit" value="Ingresar" class="btn btn-outline-light btn-lg px-5" ></input>

                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
    </form>
    <script>
	(function() {
	  'use strict';
	  window.addEventListener('load', function() {
	    // Fetch all the forms we want to apply custom Bootstrap validation styles to
	    var forms = document.getElementsByClassName('needs-validation');
	    // Loop over them and prevent submission
	    var validation = Array.prototype.filter.call(forms, function(form) {
	      form.addEventListener('submit', function(event) {
	        if (form.checkValidity() === false) {
	          event.preventDefault();
	          event.stopPropagation();
	        }
	        form.classList.add('was-validated');
	      }, false);
	    });
	  }, false);
	})();
	</script>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
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