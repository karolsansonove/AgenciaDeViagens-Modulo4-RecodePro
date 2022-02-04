<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Home</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/index.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<section class="section-banner section-banner-home">
		<img class="banner-img" alt="Banner" src="./img/banner-home.jpg">
		<section class="section-content">
			<div class="container card-content">
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
						<input type="submit" value="Ver mais" class="btn btn-destinos"/>
					</form>
				</div>
			</div>
		</section>
	</section>
</body>
</html>