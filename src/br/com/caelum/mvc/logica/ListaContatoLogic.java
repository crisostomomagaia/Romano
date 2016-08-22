/**
 * 
 */
package br.com.caelum.mvc.logica;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.*;

/**
 * @author user Aug 10, 2016 5:37:28 PM fj21-agenda br.com.caelum.mvc.logica 2016
 *
 */
public class ListaContatoLogic implements Logica{

	/* (non-Javadoc)
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<Contato> contatos = new ContatoDao().getLista();
		req.setAttribute("contatos", contatos);
		return "lista-contatos.jsp";
		//return "mvc?logica=ListaContatoLogic";
		//return "WEB-INF/lista-contatos.jsp";
		}

}
