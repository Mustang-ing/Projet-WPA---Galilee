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
		
	    
		try 
		{
		    long id = Long.parseLong(request.getParameter("id"));
		    Adherent a = em.find(Adherent.class, id);
		    // Trouver la personne id=id
		    if (a == null) 
		    {
		        System.out.println("Personne introuvable");
		    } 
		    else 
		    {
		        System.out.println("Personne.nom=" + a.getNom());
		        em.getTransaction().begin();
		        em.remove(a); // supprimer l’objet
		        em.getTransaction().commit();
		        System.out.println("Personne supprimée");
		    }
		}
		catch (NumberFormatException e) 
		{
		    System.out.println("Invalid ID format: " + e.getMessage());
		} 
		catch (Exception e) 
		{
		    System.out.println("An unexpected error occurred: " + e.getMessage());
		}

		List<Adherent> adherentsList = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();
	    request.setAttribute("Adherents", adherentsList);
	    request.getRequestDispatcher("List_User.jsp").forward(request, response);
	    
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
