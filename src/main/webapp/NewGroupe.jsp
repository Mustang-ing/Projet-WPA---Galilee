<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Genération d'un nouveau groupe</title>
    <link rel="stylesheet" href="style/template.css">
    <link rel="stylesheet" href="style/inscription.css">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>
    <header>
		<nav>
			<ul>
				<li><a href="">Accueil</a></li>
				<li><a href="">Liste des adhérents</a></li>
				<li><a href="">Liste des groupes</a></li>
			</ul>
		</nav>
	</header>

 <section>
        <main>
            <div class="Form">
                <form style="margin-top: 30px;" method="POST" action="Form_Group" class="sign-in-form">
                    <h1>Génération d'un nouveau groupe </h1>
					<input type="text" name="Nom_groupe" id="Nom_groupe" placeholder="Nom groupe"> </br>
                    <button class="btn-form form-signup" type="submit" name="submit">Ajouter l'adhérent</button>
                </form>
            </div>
        </main>
    </section>

</body>
</html>