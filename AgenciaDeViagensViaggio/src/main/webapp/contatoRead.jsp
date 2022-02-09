<%@page import="models.Contato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Contato</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link rel="stylesheet" type="text/css" href="./css/contatoRead.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<% Contato c = (Contato) request.getAttribute("contato"); %>
	<%@ include file="header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-contato.jpg">
		<section class="section-content">
			<div class="container section-form">
				<div class="header-mensagem">
					<h1>Mensagem</h1>
					<div class="form-item-btn">
							<a href="listarcontatos" class="btn btn-form btn-voltar">Voltar</a>
							<a href="editarcontato?action=get&id=<%= c.getId() %>" class="btn btn-form btn-voltar">Editar</a>
							<a href="removercontato?action=confirm&id=<%= c.getId() %>" class="btn btn-form btn-remover">Excluir</a>
					</div>
				</div>
				
				<section class="box-mensagem">
					<div class="info-remetente">
						<p><span>De: </span><%= c.getNome() %></p>
						<p><span>E-mail: </span> <%= c.getEmail() %></p>
					</div>
					<p class="msg-titulo">Mensagem:</p>
					<p><%= c.getMensagem() %></p>
				</section>
			</div>
		</section>
	</section>
</body>
</html>