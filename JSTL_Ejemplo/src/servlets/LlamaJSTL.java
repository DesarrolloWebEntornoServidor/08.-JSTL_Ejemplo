package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojos.Empleado;
import utils.Constants;

@WebServlet("/LlamaJSTL")
public class LlamaJSTL extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private List<Empleado> listaEmpleados;
	

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) {

		iniciarListaEmpleados();

		fijarAtributos(request);

		RequestDispatcher rd = getServletContext().getRequestDispatcher(Constants.HOME);

		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

	/** 
	 * Método utilizado para enviar atributos a la página jsp HOME
	 * @param request
	 */
	private void fijarAtributos(HttpServletRequest request) {
		
		request.setAttribute(Constants.ATTRIBUTE_LISTA_EMPLEADOS, listaEmpleados);

		request.setAttribute(Constants.ATTRIBUTE_HTML_TAG_DATA,
				Constants.HTML_TAG_DATA);
		request.setAttribute(Constants.ATTRIBUTE_URL, Constants.URL);
	}

	/**
	 * Método para cargar empleados
	 */
	private void iniciarListaEmpleados() {
		listaEmpleados = new ArrayList<Empleado>();

		Empleado emp1 = new Empleado();
		emp1.setEmpno(1);
		emp1.setEname("Smith");
		emp1.setJob("Salesman");
		Empleado emp2 = new Empleado();
		emp2.setEmpno(2);
		emp2.setEname("Jones");
		emp2.setJob("Manager");
		listaEmpleados.add(emp1);
		listaEmpleados.add(emp2);
	}

	

}