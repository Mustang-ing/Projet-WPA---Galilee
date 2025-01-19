
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

        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
		EntityManager em = emf.createEntityManager();
		
		List<Adherent> adherents = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();

		
		Adherent a = new Adherent();
		
		a.setNom(Surname);
		a.setPrenom(Name);
		a.setDateNaissance(birthYear);
		
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
