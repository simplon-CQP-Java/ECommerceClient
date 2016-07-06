<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Catalogue</title>
	</head>
	<body>
		<div class="catalogue">
			<h2>Catalogue</h2>
			<div class="articles">
				<div class="article">
					<h3>Nom de l'article</h3>
					<div class="content">
						<span class="prix">42€</span> <span class="remise">(-5€)</span>
					</div>
					<form class="acheter" action="AcheterArticle" method="POST">
						<button type="submit" value="acheter">ACHETER</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>