<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>    
<%@ page import="Class_Definition.Adherent" %>
<%@ page import="jakarta.persistence.EntityManager, jakarta.persistence.EntityManagerFactory, jakarta.persistence.Persistence" %>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Association sportive de Galilee</title>
	<link rel="stylesheet" href="style/template.css">
	<link rel="stylesheet" href="style/liste_utilisateurs.css">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>

<header>
        <nav>
            <ul>
                <li><a href="Index.html">Accueil</a></li>
                <li><a href="List_user.jsp">Liste des adhérents</a></li>
                <li><a href="Groupe.jsp">Liste des groupes</a></li>
            </ul>
        </nav>
    </header>

<h1> Liste des adhérent 2024-2025</h1>

<div class="container-tableau">

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
    <!-- Dynamic population -->
	   <%
		   EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
	       EntityManager em = emf.createEntityManager();
	       List<Adherent> adherentsList = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();
	       em.close();

	       //List<Adherent> adherents = (List<Adherent>) request.getAttribute("Adherents");
	
	       if (adherentsList != null && !adherentsList.isEmpty()) 
	       {
	           for (Class_Definition.Adherent adherent : adherentsList) 
	           {
	   %>
   <tr>
       <td><%= adherent.getPrenom() %></td>
       <td><%= adherent.getNom() %></td>
       <td><%= adherent.getDateNaissance() %></td>
       <td><%= adherent.getAdresse() %></td>
	   <td><%= adherent.getCodePostal() %></td>
	   <td><%= adherent.getVille() %></td>
	   <td><%= adherent.getAdresseCourriel() %></td>
	   <td><%= adherent.getNumeroTelephone() %></td>
	   <td><%= adherent.getDatePaiementCotisation() %></td>
       <td>
        	<a class="btn-modifier" type="submit">Modifier </a>
          	<a class="btn-supprimer" href="DeleteAdherent?id=<%= adherent.getId() %>" >Supprimer</a>
       </td>
   </tr>
   <%
           }
       } 
	       else {
   %>
   <tr>
       <td colspan="10">Aucun adhérent inscrit</td>
   </tr>
   <%
       }
   %>
</tbody>  			
</tbody>
    
    
</table>
</div>


<p> <a class="redirect" href="Inscription.jsp"> Inscrit des nouveaux membres !</a> </p>
<footer>
		<p>&copy; 2025 Association sportive de Galilée. Tous droits réservés.</p>
</footer>
</body>
</html>