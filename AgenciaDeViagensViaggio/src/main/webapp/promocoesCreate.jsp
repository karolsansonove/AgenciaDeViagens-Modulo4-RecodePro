<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Nova Promo</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="../header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-promocoes.jpg">
		<section class="section-content">
			<div class="container section-form">
				<h1>Cadastro de nova promoção</h1>
				<form action="criarpromocao" method="post" class="formulario">
				
					<div class="form-item">
						<label>Descricao:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtDescricao" placeholder="Ex.: Férias em família">
					</div>
						
					<div class="form-item">
						<label>Percentual do desconto:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtPercentual" placeholder="Ex.: 10">
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