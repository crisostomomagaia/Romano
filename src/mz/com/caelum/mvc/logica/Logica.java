/**
 * 
 */
package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author user Aug 10, 2016 5:07:11 PM fj21-agenda br.com.caelum.mvc.logica 2016
 *
 */
public interface Logica {

	 String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
	
}
