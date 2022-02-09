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
 * Servlet implementation class contatosEditarController
 */
@WebServlet("/editarcontato")
public class contatosEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public contatosEditarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		int id = Integer.parseInt(request.getParameter("id"));
		Contato contato = new Contato();
		
		switch (action) {
			case "get":
				
				contato = ContatoDAO.readById(id);
				request.setAttribute("contato", contato);
				
				request.getRequestDispatcher("contatosUpdate.jsp").forward(request, response);
				
				break;
			case "post":
				
				contato.setId(Integer.parseInt(request.getParameter("id")));
				contato.setNome(request.getParameter("txtNome"));
				contato.setEmail(request.getParameter("txtEmail"));
				contato.setMensagem(request.getParameter("txtMsg"));
				
				if (ContatoDAO.update(contato)) {
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
