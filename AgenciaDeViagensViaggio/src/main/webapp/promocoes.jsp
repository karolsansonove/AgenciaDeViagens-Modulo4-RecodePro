<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
				<div class="box-btn-create-promo">
					<a href="promocoesCreate.jsp" class="btn btn-card">+ Nova promo</a>
				</div>
			
				<div class="box-cards">
					
					<c:forEach items="${promocoes}" var="p">
				
						<div class="card">
							<div class="card-info">
								<p class="card-descricao">
									<c:out value="${p.descricao}"/>
								</p>
								<p>
									<c:out value="${p.percentDesconto}"/>% de desconto
								</p>
							</div>
							<div class="btn-form">
								<a href="promocaodetalhes?id=${p.id}" class="btn btn-card">Ver detalhes</a>
							</div>
						</div>
					</c:forEach>
					
				</div>
			</div>
		</section>
	</section>
</body>
</html>