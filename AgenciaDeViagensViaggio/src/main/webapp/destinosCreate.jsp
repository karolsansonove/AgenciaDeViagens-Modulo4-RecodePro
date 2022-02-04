<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Novo Destino</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="../header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-destinos.jpg">
		<section class="section-content">
			<div class="container section-form">
				<h1>Cadastro de novo destino</h1>
				<form action="criar.destino" method="post" class="formulario">
				
					<div class="form-item">
						<label>Cidade:</label>
						<input class="input" type="text" name="txtCidade" placeholder="Ex.: Torres">
					</div>
					
					<div class="form-item">
						<label>UF:</label>
						<input class="input" type="text" name="txtUF" placeholder="Ex.: RS">
					</div>
						
					<div class="form-item">
						<label>Preço por pessoa:</label>
						<input class="input" type="text" name="txtPreco" placeholder="Ex.: 99.90">
					</div>
					
					<div class="form-item">
						<label>URL da imagem:</label>
						<input class="input" type="text" name="txtURL" placeholder="Ex.: ../img/nome-do-arquivo.jpg">
					</div>
					
					<div class="form-item-btn">
						<input class="btn btn-form btn-form-limpar" type="reset" value="Limpar dados">
						<input class="btn btn-form btn-form-enviar" type="submit" value="Salvar cadastro">
					</div>						
				</form>
			</div>
		</section>
	</section>
</body>
</html>