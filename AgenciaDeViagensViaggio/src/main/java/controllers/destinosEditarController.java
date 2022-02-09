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
 * Servlet implementation class destinosEditarController
 */
@WebServlet("/editardestino")
public class destinosEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public destinosEditarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		int id = Integer.parseInt(request.getParameter("id"));
		Destino destino = new Destino();
		
		switch (action) {
			case "get":
				
				destino = DestinoDAO.readById(id);
				request.setAttribute("destino", destino);
				
				request.getRequestDispatcher("destinosUpdate.jsp").forward(request, response);
				
				break;
			case "post":
				
				destino.setId(Integer.parseInt(request.getParameter("id")));
				destino.setCidade(request.getParameter("txtCidade"));
				destino.setUF(request.getParameter("txtUF"));
				destino.setPreco(request.getParameter("txtPreco"));
				destino.setUrlImagem(request.getParameter("txtURL"));
				
				if (DestinoDAO.update(destino)) {
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
