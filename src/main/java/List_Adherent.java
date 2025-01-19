
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
 * Servlet implementation class List_Adherent
 */
@WebServlet("/List_Adherent")
public class List_Adherent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public List_Adherent() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projectBDD");
		EntityManager em = emf.createEntityManager();
		
		List<Adherent> adherents = em.createQuery("SELECT a FROM Adherent a", Adherent.class).getResultList();

		request.setAttribute("Adherents", adherents);
        request.getRequestDispatcher("List_User.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}