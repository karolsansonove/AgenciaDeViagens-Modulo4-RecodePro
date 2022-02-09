package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDAO;

/**
 * Servlet implementation class contatosDeleteController
 */
@WebServlet("/removercontato")
public class contatosDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contatosDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String action = request.getParameter("action");
		
		switch (action) {
			case "confirm":
				request.setAttribute("id", id);
				request.getRequestDispatcher("contatoConfirmarDelete.jsp").forward(request, response);
				break;
			case "delete":
				if (ContatoDAO.delete(id)) {
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
