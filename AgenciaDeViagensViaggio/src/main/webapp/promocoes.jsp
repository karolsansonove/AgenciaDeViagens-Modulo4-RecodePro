<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Promoções</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/promocoes.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<section class="section-banner">
		<img class="banner-img" alt="Banner" src="./img/banner-promocoes.jpg">
		<section class="section-content">
			<div class="container section-promocoes">
				<div class="card">
					<img class="card-img" src="./img/img-teste.jpg">
					<div class="card-legenda">
						<p>Local</p>
						<p>Descrição</p>
						<p>0.0%</p>
					</div>
					<form action="" method="get" class="btn-form">
						<input type="submit" value="Ver mais" class="btn btn-card"/>
					</form>
				</div>
			</div>
		</section>
	</section>
</body>
</html>