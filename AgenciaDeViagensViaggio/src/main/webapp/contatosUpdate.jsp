<%@page import="models.Contato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Atualizar Contato</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<% Contato c = (Contato) request.getAttribute("contato"); %> 
	<%@ include file="header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-contato.jpg">
		<section class="section-content">
			<div class="container section-form">
				<h1>Atualizar contato</h1>
				<form action="editarcontato?action=post&id=<%= c.getId() %>" method="post" class="formulario">
					<div class="form-item">
						<label>Nome:</label>
						<input class="input" type="text" name="txtNome" value="<%= c.getNome() %>" placeholder="Ex.: Maria Silva">
					</div>
						
					<div class="form-item">
						<label>E-mail:</label>
						<input class="input" type="email" name="txtEmail" value="<%= c.getEmail() %>" placeholder="exemplo@email.com">
					</div>
					
					<div class="form-item">
						<label>Mensagem:</label>
						<textarea name="txtMsg" placeholder="Digite sua mensagem aqui..."><%= c.getMensagem() %></textarea>
					</div>
					
					<div class="form-item-btn">
						<a href="listarcontatos" class="btn btn-form btn-mensagens">Ver todas as mensagens</a>
						<input class="btn btn-form btn-form-limpar" type="reset" value="Limpar dados">
						<input class="btn btn-form btn-form-enviar" type="submit" value="Atualizar mensagem">
					</div>
				</form>
			</div>
		</section>
	</section>
</body>
</html>