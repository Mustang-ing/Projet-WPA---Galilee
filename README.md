# Projet Programmation Web - Outils d'association sportive

Ce projet est conduit par Aïssa Pansan et Farouk EL Varougou 


## Contexte

Le projet consiste à dévelloper un logiciel destiné à gérer une association sportive en ajoutant,modifiant ou suprimant des adhérents. Le but est aussi d'associer ces adhérent dans des groupes. Chaque adhérent peut être associé à un seul groupe au maximum.

Le projet comporte plusieurs page Web 

- Page web principal de l'association sportive
- Page web pour gérer les membres de l'association (Voir/Ajouter/Modifier/Supprimer des membres)
- Formulaire pour enregistrer un nouvel adhérent
- Page web pour les groupes (Voir les groupes/jouter/Modifier/Supprimer un groupe , Ajouter des adhérent dans un groupe)
- Page pour créer un groupe (Rapide)

Le projet se fait en Java EE (Ou Jakarta EE ).

## Tâche à terminer 
Actuellement, voiçi les principaux chantier 

- [X] Page principal - Index.html
    - [x] Lien vers les pages groupes et liste user
    - [X] Style
- [X] Page Adhérent List_User.jsp
    - [X] Afficher les adhérents
        - [X] Connecter le projet à la JPA pour mettre en relation MariaDB
    - [X] Front-end de button pour ajouter/modifier ou supprimer des users
    - [X] Gêrer les fonctionnalités de modifications et de supression en temps réelle (Coté backend)
    - [X] Style
- [X]  Page Formulaire - Inscription.jsp
    - [x] Champs de base du sujet
    - [X] Envoyer les information dans la BDD
    - [X] Style
- [ ] Page Groupe - Pas encore commencé
    - [X] Front-end de button pour ajouter/modifier ou supprimer des groupes
    - [ ] Gêrer les fonctionnalités de modifications et de supression en temps réelle (Coté Backend)
    - [ ] Ajouter des user en respectant la contraintes
    - [ ] Style

- [X] Webservices REST
    - [X] Création, modification, suppression, lister les adhérents
    - [X] Lister les groupes et les personnes rattachées

- [ ] Test Selenium (Codé, mais non opérationnelle)

  Note : Ajouter des users doit rediger le client vers Form.html 
  

## Information suppléntaire 
Pour un Dynamic Web Project, formalisé en Tomcat, les fichiers/dossier les plus importants sont les suivant : 

- src/main/java : C'est dans ce dossier qu'on va générer nos Servlet Java qui vont gêrer les requetes utilisateur (POST/GET)
- src/main/webapp : C'est dans ce dossier que l'on stocke nos pages HTML et JSP pour afficher le rendu Front
    - WEB-INF/style : Dossier ou on mettre la CSS
 
