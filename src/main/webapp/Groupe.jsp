<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Groupe</title>
</head>
<body>

<h1> Liste des groupes de l'association</h1>

<table>
    <caption>Groupes</caption>
    <tr>
        <th>Nom groupe</th>
        <th>Liste inscrit </th>
        
    </tr>
    <tr>
        <td>G1</td>
        <td>Adhérent inscrit</td>
        <td> <button class="btn-form form-signup" type="submit" name="submit">Ajouter un adhérent</button> </td>
        <td> <button class="btn-form form-signup" type="submit" name="submit">Suprimer un adhérent</button> </td>
        <td> <button class="btn-form form-signup" type="submit" name="submit"> Supprimer groupe</button> </td>
    </tr>
</table>

<p> <a href="NewGroupe.jsp"> Faites un nouveau groupe</a> </p>

</body>
</html>