<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>Test in progress  </h1>
	<p>  </p>
	<ul>
		<li> Nom : <%= request.getAttribute("Name") %> </li>
		<li> Date de naissance : <%= request.getAttribute("dateOfBirth") %>
		
	
	</ul>
</body>
</html>