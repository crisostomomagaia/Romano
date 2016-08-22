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
 * @author user Aug 11, 2016 9:52:17 AM fj21-agenda br.com.caelum.mvc.logica
 *         2016
 *
 */
public class AdicionaContatoLogic implements Logica {

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		
		Contato contato = new Contato();
		// contato.setId(id);
		contato.setNome(req.getParameter("nome"));
		contato.setEmail(req.getParameter("email"));
		contato.setEndereco(req.getParameter("endereco"));
		String dataEmTexto = req.getParameter("dataNascimento");
		Calendar dataNascimento = null;
		
		
		// return "mvc?logica=ListaContatoLogic";
		
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			System.out.println("Erro de conversao de data");
			
		}
		contato.setDataNascimento(dataNascimento);
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		System.out.println("Inserindo contato");
		return "mvc?logica=ListaContatoLogic";
	}
	
}