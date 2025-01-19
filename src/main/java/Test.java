import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		//1) getting the content of id (HTML) année by the request object
		//2) Converting String to Int
		int birthYear = Integer.parseInt(request.getParameter("année"));		
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		//A l'objet request, on lui attribue l'age via la méthode getAge
		// L'etiquette est appelé "age"
		request.setAttribute("age", getAge(birthYear,currentYear));
		
		//A ce stade, on a deux possibilités 
		//1) Ecrire de l'HTML pour le générer dans une page
		//2) Envoyer le résultat à la JSP (Sol retenu)
		
		request.getRequestDispatcher("age.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

	public int getAge(int a, int b)
	{
			return b-a;
	}

}
