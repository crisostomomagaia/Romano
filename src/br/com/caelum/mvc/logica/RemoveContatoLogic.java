/**
 * 
 */
package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

/**
 * @author user Aug 10, 2016 5:31:53 PM fj21-agenda br.com.caelum.mvc.logica
 *         2016
 *
 */
public class RemoveContatoLogic implements Logica {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest request, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(request.getParameter("id"));
		Contato contato = new Contato();
		contato.setId(id);
		
		Connection connection = (Connection) request
				.getAttribute("conexao");
		
		ContatoDao dao = new ContatoDao(connection);
		dao.exclui(contato);
		System.out.println("Excluindo contato... ");
		return "mvc?logica=ListaContatoLogic";
	}

}
