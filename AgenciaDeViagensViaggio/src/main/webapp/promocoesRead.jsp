<%@page import="models.Promocao"%>
<%@page import="models.Destino"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Destinos</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/promocaoRead.css">
	<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;1,300;1,400;1,500;1,600&display=swap" rel="stylesheet">
</head>
<body>
	<% 
		Promocao p = (Promocao) request.getAttribute("promo");
	%>
	<%@ include file="header.jsp" %>
	<section class="section-promo">
		<section class="container">
			<div class="promo-content">
				<div class="box-detalhes">
					
					<div class="card-descricao">
						<p class="text-descricao">
							<%= p.getDescricao() %>
						</p>
						<p class="text-percentual">
							Desconto de <span class="percentual"><%= p.getPercentDesconto() %>%</span> por pessoa.
						</p>
					</div>
					
					<div class="box-acoes">
						<a href="editarpromocao?action=get&id=<%= p.getId() %>" class="btn btn-edit">Editar</a>
						<a href="removerpromocao?action=confirm&id=<%= p.getId() %>" class="btn btn-remove">Remover</a>
					</div>
					
				</div>
			</div>				
		</section>
	</section>
</body>
</html>