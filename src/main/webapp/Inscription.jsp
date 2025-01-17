<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Association sportive de Galilee</title>
</head>
<body>
 <section>
        <main>
            <div class="Form">
                <form method="POST" action="Form" class="sign-in-form">
                    <h1>Inscription d'un nouvel adhérent </h1>
					<input type="text" name="Nom" id="Nom" placeholder="Votre nom" value="Votre nom"> </br>
					<label for="date_naissance">Votre date de naissance</label>
					<input type="date" name="Date_naissance" id="Date_naissance" placeholder="Date de naissance" value="Votre date de naissance"></br>
					<!--  
					<input type="email" name="email" id="email" placeholder="Adresse e-mail" value="Votre e-mail"></br>
					<input type="text" name="Adresse" id="Adresse" placeholder="Adresse" value="Votre adresse"></br>
					<input type="text" name="Code_postal" id="Code_postal" placeholder="Code postal" value="Votre code postal"></br>
					<input type="text" name="Ville" id="Ville" placeholder="Ville" value="Votre ville"></br>
					<input type="email" name="email" id="email" placeholder="E-mail" value="Votre e-mail"></br>
					<input type="text" name="Telephone" id="Telephone" placeholder="Numéro de téléphone" value="Votre numéro de téléphone"></br>
					<label for="date_paiement">La date de paiement de votre cotisation</label>
					<input type="date" name="Date_paiement" id="Date_paiement" placeholder="Date de paiement de la cotisation" value="La date de paiement de votre cotisation"></br>
					-->
                    <button class="btn-form form-signup" type="submit" name="submit">Ajouter l'adhérent</button>
                </form>
            </div>
        </main>
    </section>
</body>
</html>