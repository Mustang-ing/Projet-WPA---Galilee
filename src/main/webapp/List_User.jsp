<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Association sportive de Galilee</title>
</head>
<body>

<h1> Liste des adhérent 2024-2025</h1>
<table>
    <caption>Adhérent</caption>
    <thead>
        <tr>
            <th>Prenom</th>
            <th>Nom </th>
            <th>Date de naissance</th>
            <th>Adresse</th>
            <th>Code postal</th>
            <th>Ville</th>
            <th>Adresse courriel</th>
            <th>Numéro de téléphone</th>
            <th>Date paiement de la cotisation</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>John</td>
            <td>Doe</td>
            <td>01/01/1990</td>
            <td>123 Rue de Paris</td>
            <td>75000</td>
            <td>Paris</td>
            <td>johndoe@example.com</td>
            <td>+33 6 12 34 56 78</td>
            <td>15/01/2025</td>
            <td>
                <button class="btn-form form-signup" type="submit" name="submit">Modifier</button> 
                <button class="btn-form form-signup" type="submit" name="submit">Supprimer</button> 
            </td>
        </tr>
    </tbody>
    
</table>


<p> <a href="Inscription.jsp"> Inscrit des nouveaux membres !</a> </p>
</body>
</html>