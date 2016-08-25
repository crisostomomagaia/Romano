/**
 * 
 */
package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.agenda.dao.ContatoDao;
import br.com.caelum.agenda.modelo.Contato;

/**
 * @author user Aug 11, 2016 8:45:04 AM fj21-agenda br.com.caelum.mvc.logica
 *         2016
 *
 */
public class AtualizaContatoLogic implements Logica {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		long id = Long.parseLong(req.getParameter("id"));
		/*
		 * String nome = req.getParameter("nome"); String email =
		 * req.getParameter("email"); String endereco =
		 * req.getParameter("endereco");
		 */
		// Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		Contato contato = dao.pesquisa(id);
		contato.setId(id);
		contato.setNome(req.getParameter("nome"));
		 contato.setEmail(req.getParameter("email"));
		 contato.setEndereco(req.getParameter("endereco"));
		 //ContatoDao dao = new ContatoDao();
		// dao.exclui(contato);
		 dao.atualiza(contato);
		//req.setAttribute("contato", contato);
		System.out.println("Atualizando contato... ");
		return "mvc?logica=ListaContatoLogic";
	}
}