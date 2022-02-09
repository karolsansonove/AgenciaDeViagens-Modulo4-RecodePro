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
	<link rel="stylesheet" type="text/css" href="./css/destinosRead.css">
	<link href="https://fonts.googleapis.com/css2?family=Open+Sans:ital,wght@0,300;0,400;0,500;0,600;1,300;1,400;1,500;1,600&display=swap" rel="stylesheet">
</head>
<body>
	<% 
		int id = (int) request.getAttribute("id");
	%>
	<%@ include file="header.jsp" %>
	<section class="section-destino">
		<section class="container">
			<div class="destino-content">
				<div class="box-detalhes">
					
					<p class="local">
						Tem certeza que deseja excluir?
					</p>
					
					<div class="box-acoes">
						<a href="promocaodetalhes?id=<%= id %>" class="btn btn-edit">Cancelar</a>
						<a href="removerpromocao?action=delete&id=<%= id %>" class="btn btn-remove">Confirmar</a>
					</div>
					
				</div>
			</div>				
		</section>
	</section>
</body>
</html>