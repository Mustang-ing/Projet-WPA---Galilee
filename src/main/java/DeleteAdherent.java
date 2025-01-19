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


/**
 * Servlet implementation class DeleteAdherent
 */
@WebServlet("/DeleteAdherent")
public class DeleteAdherent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteAdherent() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
		EntityManager em = emf.createEntityManager();
			
		Adherent a = EntityManager.find(Class<Adherent>, 4);
		// Trouver la personne id=4
		if (a == null) 
		{
			System.out.println("Personne introuvable");
		}
		else 
		{
			System.out.println("Personne.nom=" + a.getNom());
			EntityTransaction transac = entityManager.getTransaction();
			transac.begin();
			entityManager.remove(personne); // supprimer l’objet
			transac.commit();
			System.out.println("Personne supprimée");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
