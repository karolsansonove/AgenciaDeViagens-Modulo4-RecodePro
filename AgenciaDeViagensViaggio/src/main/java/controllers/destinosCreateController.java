package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDAO;
import models.Destino;

/**
 * Servlet implementation class destinosCreateController
 */
@WebServlet("/criar.destino")
public class destinosCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public destinosCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Destino destino = new Destino();
		destino.setUF(request.getParameter("txtUF"));
		destino.setCidade(request.getParameter("txtCidade"));
		destino.setPreco(request.getParameter("txtPreco"));
		destino.setUrlImagem(request.getParameter("txtURL"));
		
		DestinoDAO destinoDAO = new DestinoDAO();
		
		if (destinoDAO.create(destino)) {
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
