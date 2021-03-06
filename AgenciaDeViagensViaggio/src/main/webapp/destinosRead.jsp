<%@page import="models.Destino"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ag?ncia Viaggio | Destinos</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/destinosRead.css">
	<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;1,300;1,400;1,500;1,600&display=swap" rel="stylesheet">
</head>
<body>
	<% 
		Destino d = (Destino) request.getAttribute("destino");
	%>
	<%@ include file="header.jsp" %>
	<section class="section-destino">
		<section class="container">
			<div class="destino-content">
				<img class="destino-img" src="./img/cidades/<%= d.getUrlImagem() %>" alt="Imagem do local"/>
				<div class="box-detalhes">
					
					<div class="legenda">
						
						<p class="local">
							<%= d.getCidade() %> - <%= d.getUF() %>
						</p>
						<p class="preco">
							R$ <%= d.getPreco() %>
							<span class="preco-obs">por pessoa</span>
						</p>
					</div>
					
					<div class="box-acoes">
						<a href="editardestino?action=get&id=<%= d.getId() %>" class="btn btn-edit">Editar</a>
						<a href="removerdestino?action=confirm&id=<%= d.getId() %>" class="btn btn-remove">Remover</a>
					</div>
					
				</div>
			</div>				
		</section>
	</section>
</body>
</html>