package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PromocaoDAO;
import models.Promocao;

/**
 * Servlet implementation class promocoesCreateController
 */
@WebServlet("/criarpromocao")
public class promocoesCreateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public promocoesCreateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Promocao promo = new Promocao();
		promo.setDescricao(request.getParameter("txtDescricao"));
		promo.setPercentDesconto(Double.parseDouble(request.getParameter("txtPercentual")));
		
		if (PromocaoDAO.create(promo)) {
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
