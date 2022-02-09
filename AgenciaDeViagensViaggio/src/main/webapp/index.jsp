<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@ page import="models.Destino" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Destinos</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/destinos.css">
	<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;1,300;1,400;1,500;1,600&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<section class="section-banner">
		<img class="banner-img" alt="Banner" src="./img/banner-destinos.jpg">
		<section class="section-content">
			<div class="container section-destinos">
			
				<div class="box-btn-create-destino">
					<a href="destinosCreate.jsp" class="btn btn-card">+ Novo destino</a>
				</div>
			
				<div class="box-cards">
					
					<c:forEach items="${destinos}" var="d">
				
						<div class="card">
							<img class="card-img" src="./img/cidades/${d.urlImagem}"/>
							<div class="card-legenda">
								<p>
									<c:out value="${d.cidade}"/>
								</p>
								<p>A partir de</p>
								<p class="card-preco">
									R$ <c:out value="${d.preco}"/>
								</p>
							</div>
							<form action="" method="get" class="btn-form">
								<a href="destinosReadController?id=${d.id}" class="btn btn-card">Ver detalhes</a>
							</form>
						</div>
					</c:forEach>
					
				</div>
			</div>
		</section>
	</section>
</body>
</html>