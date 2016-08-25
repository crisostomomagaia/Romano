/**
 * 
 */
package br.com.caelum.mvc.logica;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

/**
 * @author user Aug 11, 2016 11:47:32 AM fj21-agenda br.com.caelum.mvc.logica
 *         2016
 *
 */
public class MostraContatoLogic implements Logica {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Long id = Long.parseLong(req.getParameter("id"));
		
		
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisa(id);
		//contato.setId(id);
		
		
		req.setAttribute("contato", contato);

		 return "atualiza-contato.jsp";
		//return "mvc?logica=";

	}

}
