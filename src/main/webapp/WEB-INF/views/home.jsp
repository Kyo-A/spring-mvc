<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/style.css" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<title>Home</title>
</head>
<body>
	<div class="container">
		<h1 class="first">Hello World!</h1>
		<p>This is the homepage!</p>
		<p>Je suis ${ nom }</p>
		<c:if test="${empty personnes}">
			<p>Liste vide, veuillez inserer des valeurs</p>
		</c:if>
		<div class="list-group">
			<c:forEach items="${ personnes }" var="personne">
				<div class="list-group-item list-group-item-action">
					<p class="mb-1">
						<c:out value="${ personne.id }" />
					</p>
					<small class="text-muted"><c:out value="${ personne.nom }" /></small>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>
