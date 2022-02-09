<%@page import="models.Contato"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agência Viaggio | Contato</title>
	<link rel="stylesheet" type="text/css" href="./css/site.css">
	<link rel="stylesheet" type="text/css" href="./css/forms.css">
	<link rel="stylesheet" type="text/css" href="./css/contatoList.css">
	<link href="https://fonts.googleapis.com/css2?family=Zen+Tokyo+Zoo&display=swap" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<section class="section-banner section-banner-form">
		<img class="banner-img" alt="Banner" src="./img/banner-contato.jpg">
		<section class="section-content">
			<div class="container section-form">
				<h1>Mensagens</h1>
				<section class="formulario">
					<ul>
					
						<c:forEach items="${ contatos }" var="contato">
							<li>
								<a href="vercontato?id=${ contato.id }" class="contato-item">
								<span>
									<Strong>Nome:</Strong> <c:out value="${ contato.nome }"/>
								</span>
								<span>
									<Strong>E-mail:</Strong> <c:out value="${ contato.email }"/>
								</span>
								</a>
							</li>
						</c:forEach>
					
					</ul>
				</section>
			</div>
		</section>
	</section>
</body>
</html>