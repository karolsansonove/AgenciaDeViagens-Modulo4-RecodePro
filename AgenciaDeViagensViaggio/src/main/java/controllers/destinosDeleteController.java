package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDAO;

/**
 * Servlet implementation class destinosDeleteController
 */
@WebServlet("/removerdestino")
public class destinosDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public destinosDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DestinoDAO dao = new DestinoDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		String action = request.getParameter("action");
		
		switch (action) {
			case "confirm":
				request.setAttribute("id", id);
				request.getRequestDispatcher("confirmacao.jsp").forward(request, response);
				break;
			case "delete":
				if (dao.delete(id)) {
					request.getRequestDispatcher("sucesso.jsp").forward(request, response);			
				} else {
					request.getRequestDispatcher("erro.jsp").forward(request, response);	
				}
				break;
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
