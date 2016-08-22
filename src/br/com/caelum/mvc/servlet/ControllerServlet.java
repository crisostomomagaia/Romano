/**
 * 
 */
package br.com.caelum.mvc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.mvc.logica.Logica;

/**
 * @author user Aug 10, 2016 5:15:57 PM fj21-agenda br.com.caelum.mvc.servlet
 *         2016
 *
 */
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parametro = request.getParameter("logica");
		String nomeDaClasse = "br.com.caelum.mvc.logica." + parametro;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Logica logica = (Logica) classe.newInstance();
			String pagina = logica.executa(request, response);
			request.getRequestDispatcher(pagina).forward(request, response);
		} catch (Exception e) {
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}
	}
}
