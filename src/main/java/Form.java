
import Class_Definition.Adherent;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
		
		String name = request.getParameter("Nom");
		if(name == null) throw new IllegalArgumentException("name cannot be null or empty");;
		//LocalDate birthYear_Test = LocalDate.parse("Date_naissance");
		String birthYear = request.getParameter("Date_naissance");
		if(birthYear == null) throw new IllegalArgumentException("BirthYear cannot be null or empty");;

        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
		EntityManager em = emf.createEntityManager();
		
		Adherent a1 = new Adherent();
		
		a1.setNom("Z2N");
		a1.setPrenom("Z20900");
		a1.setDateNaissance("2001");
		
		em.getTransaction().begin();
		em.persist(a1);
		em.getTransaction().commit();
		

		
		request.setAttribute("Name", name);
		request.setAttribute("dateOfBirth", birthYear);
		//request.setAttribute("dateOfBirth2", birthYear_Test);

        request.getRequestDispatcher("age.jsp").forward(request, response);
        
		

		//doGet(request, response);
	}

}
