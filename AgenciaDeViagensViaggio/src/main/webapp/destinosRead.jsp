<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Destinos</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/destinos.css">
</head>
<body>
	<% String url = (String) request.getAttribute("url"); %>
	<%@ include file="header.jsp" %>
	<section class="section-banner">
		<img class="banner-img" alt="Banner" src="<%= url %>">
		<section class="section-content">
			<div class="container section-destinos">
			
				<div class="box-btn-create-destino">
					<a href="destinosCreate.jsp" class="btn btn-card">+ Novo destino</a>
				</div>
			
				<div class="box-cards">
			
					<div class="card">
						<img class="card-img" src="./img/img-teste.jpg">
						<div class="card-legenda">
							<p>Local</p>
							<p>A partir de</p>
							<p class="card-preco">
								R$ 0,00
							</p>
						</div>
						<form action="" method="get" class="btn-form">
							<a href="readDestino.jsp" class="btn btn-card">Ver detalhes</a>
						</form>
					</div>
					
				</div>
			</div>
		</section>
	</section>
</body>
</html>