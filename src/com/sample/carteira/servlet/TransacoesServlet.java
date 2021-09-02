 package com.sample.carteira.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.DateFormatter;

import com.sample.carteira.modelo.TipoTransacao;
import com.sample.carteira.modelo.Transacao;

/**
 * Servlet implementation class TransacoesServlet
 */
@WebServlet("/transacoes")
public class TransacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    private List<Transacao> transacoes = new ArrayList<>();
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("transacoes", transacoes);
		
		request.getRequestDispatcher("WEB-INF/jsp/transacoes.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ticker = req.getParameter("ticker");
		LocalDate data = LocalDate.parse(req.getParameter("date"));
		BigDecimal preco = new BigDecimal(req.getParameter("preco").replace(",", ".")); 
		int quantidade = Integer.parseInt(req.getParameter("quantidade"));
		TipoTransacao tipo = TipoTransacao.valueOf(req.getParameter("tipo"));
		
		
		
		Transacao t1 = new Transacao(ticker, preco, quantidade, data, tipo);
		
		transacoes.add(t1);
		resp.sendRedirect("transacoes");
	}
	
	

}
