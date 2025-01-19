

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


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
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("Nom");
		if(name == null) throw new IllegalArgumentException("name cannot be null or empty");;
		//LocalDate birthYear_Test = LocalDate.parse("Date_naissance");
		String birthYear = request.getParameter("Date_naissance");
		if(birthYear == null) throw new IllegalArgumentException("BirthYear cannot be null or empty");
		
		request.setAttribute("Name", name);
		request.setAttribute("dateOfBirth", birthYear);
		//request.setAttribute("dateOfBirth2", birthYear_Test);

        request.getRequestDispatcher("age.jsp").forward(request, response);
		
		doGet(request, response);
	}

}
