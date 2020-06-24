<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Type an Id to return a brewery
	<form action="lookForABreweryAction">
		<input type="text" name = "Id">
		<input type="submit"><br>
	</form>
	Search for a brewery by query
	<form action="listOfBreweriesAction">
		<input type="text" name = "q">
		<input type="submit"><br>
	</form>
</body>
</html>