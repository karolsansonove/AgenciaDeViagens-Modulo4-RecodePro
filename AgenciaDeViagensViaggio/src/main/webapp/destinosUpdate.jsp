<%@ page import="models.Destino"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Atualizar Destino</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<% Destino d = (Destino) request.getAttribute("destino"); %> 
	<%@ include file="../header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-destinos.jpg">
		<section class="section-content">
			<div class="container section-form">
				<h1>Atualizar destino</h1>
				<form action="editardestino?action=post&id=<%= d.getId() %>" method="post" class="formulario">
				
					<div class="form-item">
						<label>Cidade:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtCidade" value="<%= d.getCidade() %>" placeholder="Ex.: São Paulo">
					</div>
					
					<div class="form-item">
						<label>UF:<span class="campo-required"> *</span></label>
						<input class="input" type="text" name="txtUF" value="<%= d.getUF() %>" placeholder="Ex.: SP">
					</div>
						
					<div class="form-item">
						<label>Preço por pessoa:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtPreco"  value="<%= d.getPreco() %>" placeholder="Ex.: 99,90">
					</div>
					
					<div class="form-item">
						<label>Nome da imagem:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtURL"  value="<%= d.getUrlImagem() %>" placeholder="Ex.: nome-do-arquivo.jpg">
					</div>
					
					<div class="form-item-btn">
						<a href="destinosReadController?id=<%=d.getId() %>" class="btn btn-form btn-form-limpar">Cancelar</a>
						<input type="submit" class="btn btn-form btn-form-enviar" value="Atualizar"/>
					</div>						
				</form>
			</div>
		</section>
	</section>
</body>
</html>