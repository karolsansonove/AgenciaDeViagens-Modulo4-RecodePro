<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ag�ncia Viaggio | Novo Destino</title>
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
						<!-- <input class="input" type="text" name="txtUF" placeholder="Ex.: RS"> -->
						<select class="input" name="txtUF">
		                    <option value="SE" disabled selected>Selecione uma op��o</option>
		                    <option value="AC">Acre</option>
		                    <option value="AL">Alagoas</option>
		                    <option value="AP">Amap�</option>
		                    <option value="AM">Amazonas</option>
		                    <option value="BA">Bahia</option>
		                    <option value="CE">Cear�</option>
		                    <option value="DF">Distrito Federal</option>
		                    <option value="ES">Esp�rito Santo</option>
		                    <option value="GO">Goi�s</option>
		                    <option value="MA">Maranh�o</option>
		                    <option value="MT">Mato Grosso</option>
		                    <option value="MS">Mato Grosso do Sul</option>
		                    <option value="MG">Minas Gerais</option>
		                    <option value="PA">Par�</option>
		                    <option value="PB">Para�ba</option>
		                    <option value="PR">Paran�</option>
		                    <option value="PE">Pernambuco</option>
		                    <option value="PI">Piau�</option>
		                    <option value="RJ">Rio de Janeiro</option>
		                    <option value="RN">Rio Grande do Norte</option>
		                    <option value="RS">Rio Grande do Sul</option>
		                    <option value="RO">Rond�nia</option>
		                    <option value="RR">Roraima</option>
		                    <option value="SC">Santa Catarina</option>
		                    <option value="SP">S�o Paulo</option>
		                    <option value="SE">Sergipe</option>
		                    <option value="TO">Tocantins</option>
		                </select>
					</div>
						
					<div class="form-item">
						<label>Pre�o por pessoa:</label>
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