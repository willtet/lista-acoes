package com.sample.carteira.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.carteira.modelo.TipoTransacao;
import com.sample.carteira.modelo.Transacao;

/**
 * Servlet implementation class TransacoesServlet
 */
@WebServlet("/transacoes")
public class TransacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private List<Transacao> transacoes = new ArrayList<>();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Transacao t1 = new Transacao("ABCD", new BigDecimal("10.00"), 100, LocalDate.now(), TipoTransacao.VENDA);
		Transacao t2 = new Transacao("ABCD", new BigDecimal("10.00"), 50, LocalDate.now(), TipoTransacao.COMPRA);
		
		transacoes.add(t1);
		transacoes.add(t2);
		
		request.setAttribute("transacoes", transacoes);
		
		request.getRequestDispatcher("WEB-INF/jsp/transacoes.jsp").forward(request, response);
	}
	
	

}
