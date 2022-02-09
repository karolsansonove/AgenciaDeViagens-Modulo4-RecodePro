package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DestinoDAO;
import dao.PromocaoDAO;
import models.Destino;
import models.Promocao;

/**
 * Servlet implementation class promocoesEditarController
 */
@WebServlet("/editarpromocao")
public class promocoesEditarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public promocoesEditarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		int id = Integer.parseInt(request.getParameter("id"));
		Promocao promo = new Promocao();
		
		switch (action) {
			case "get":
				
				promo = PromocaoDAO.readById(id);
				request.setAttribute("promo", promo);
				
				request.getRequestDispatcher("promocoesUpdate.jsp").forward(request, response);
				
				break;
			case "post":
				
				promo.setId(Integer.parseInt(request.getParameter("id")));
				promo.setDescricao(request.getParameter("txtDescricao"));
				promo.setPercentDesconto(Double.parseDouble(request.getParameter("txtPercentual")));
				
				if (PromocaoDAO.update(promo)) {
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
