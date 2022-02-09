package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContatoDAO;
import models.Contato;

/**
 * Servlet implementation class contatosCreateController
 */
@WebServlet("/criarcontato")
public class contatosCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contatosCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contato c = new Contato();
		c.setNome(request.getParameter("txtNome"));
		c.setEmail(request.getParameter("txtEmail"));
		c.setMensagem(request.getParameter("txtMsg"));
		
		if (ContatoDAO.create(c)) {
			request.getRequestDispatcher("sucesso.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("erro.jsp").forward(request, response);
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
