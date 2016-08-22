/**
 * 
 */
package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author user Aug 10, 2016 5:10:19 PM fj21-agenda br.com.caelum.mvc.logica 2016
 *
 */
public class PrimeiraLogica implements Logica{
	


	/* (non-Javadoc)
	 * @see br.com.caelum.mvc.logica.Logica#executa(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception{
		System.out.println("Executando a logica...");
		System.out.println("Retornando o nome da pagina jsp...");
		return "primeira-logica.jsp";
	}

}
