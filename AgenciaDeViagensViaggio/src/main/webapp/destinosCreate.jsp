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
						<label>Cidade:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtCidade" placeholder="Ex.: São Paulo">
					</div>
					
					<div class="form-item">
						<label>UF:<span class="campo-required"> *</span></label>
						<!-- <input class="input" type="text" name="txtUF" placeholder="Ex.: SP"> -->
						<select class="input" name="txtUF" required>
		                    <option value="SE" disabled selected>Selecione uma opção</option>
		                    <option value="AC">AC</option>
				            <option value="AL">AL</option>
				            <option value="AM">AM</option>
				            <option value="AP">AP</option>
				            <option value="BA">BA</option>
				            <option value="CE">CE</option>
				            <option value="DF">DF</option>
				            <option value="ES">ES</option>
				            <option value="GO">GO</option>
				            <option value="MA">MA</option>
				            <option value="MG">MG</option>
				            <option value="MS">MS</option>
				            <option value="MT">MT</option>
				            <option value="PA">PA</option>
				            <option value="PB">PB</option>
				            <option value="PE">PE</option>
				            <option value="PI">PI</option>
				            <option value="PR">PR</option>
				            <option value="RJ">RJ</option>
				            <option value="RN">RN</option>
				            <option value="RO">RO</option>
				            <option value="RR">RR</option>
				            <option value="RS">RS</option>
				            <option value="SP">SP</option>
				            <option value="SC">SC</option>
				            <option value="SE">SE</option>
				            <option value="TO">TO</option>
		                </select>
					</div>
						
					<div class="form-item">
						<label>Preço por pessoa:<span class="campo-required"> *</span></label>
						<input required class="input" type="number" name="txtPreco" placeholder="Ex.: 99.90">
					</div>
					
					<div class="form-item">
						<label>Nome da imagem:<span class="campo-required"> *</span></label>
						<input required class="input" type="text" name="txtURL" placeholder="Ex.: nome-do-arquivo.jpg">
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