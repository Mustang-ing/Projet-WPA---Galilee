
import Class_Definition.Adherent;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 //private static List<Adherent> adherents = new ArrayList<>();
       
    public Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		
		
		String Surname = request.getParameter("Nom");
		if(Surname == null) throw new IllegalArgumentException("name cannot be null or empty");;
		//LocalDate birthYear_Test = LocalDate.parse("Date_naissance");
		String Name = request.getParameter("Prenom");
		String birthYear = request.getParameter("Date_naissance");
		if(birthYear == null) throw new IllegalArgumentException("BirthYear cannot be null or empty");;

		String adresse = request.getParameter("Adresse");
		if (adresse == null || adresse.isEmpty()) {
		    throw new IllegalArgumentException("Adresse cannot be null or empty");
		}
		
		String codePostal = request.getParameter("Code_postal");
		if (codePostal == null || codePostal.isEmpty()) {
		    throw new IllegalArgumentException("Code_postal cannot be null or empty");
		}
		
		String ville = request.getParameter("Ville");
		if (ville == null || ville.isEmpty()) {
		    throw new IllegalArgumentException("Ville cannot be null or empty");
		}
		
		String adresseCourriel = request.getParameter("email");
		if (adresseCourriel == null || adresseCourriel.isEmpty()) {
		    throw new IllegalArgumentException("Adresse_courriel cannot be null or empty");
		}
		
		String numeroTelephone = request.getParameter("Telephone");
		if (numeroTelephone == null || numeroTelephone.isEmpty()) {
		    throw new IllegalArgumentException("Numero_telephone cannot be null or empty");
		}
		
		String paiementCotisation = request.getParameter("Date_paiement");
		String datePaiementCotisation = null;
		if (paiementCotisation != null && !paiementCotisation.isEmpty()) {
		    datePaiementCotisation = paiementCotisation; // Ensure proper date format (YYYY-MM-DD)
		}
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
		EntityManager em = emf.createEntityManager();
		
		List<Adherent> adherents = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();

		
		Adherent a = new Adherent();
		
		a.setNom(Surname);
		a.setPrenom(Name);
		a.setDateNaissance(birthYear);
		a.setAdresse(adresse);
		a.setCodePostal(codePostal);
	    a.setVille(ville);
	    a.setAdresseCourriel(adresseCourriel);
	    a.setNumeroTelephone(numeroTelephone);
	    a.setDatePaiementCotisation(datePaiementCotisation);
		
		adherents.add(a);
		
		System.out.println("Surname : " + a.getNom() + "Name : " + a.getPrenom());
		//a.getAdherent().add(a);
		
		int taille = adherents.size();
		
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		

		
		request.setAttribute("Taille", taille);
		request.setAttribute("Adherents", adherents);
        request.getRequestDispatcher("List_User.jsp").forward(request, response);
        
		

		//doGet(request, response);
	}

}
