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
 
@WebServlet("/LlamaJSTL")
public class LlamaJSTL extends HttpServlet {
    private static final long serialVersionUID = 1L;
        
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Empleado emp1 = new Empleado();
        emp1.setEmpno(1); emp1.setEname("Smith"); emp1.setJob("Salesman");
        Empleado emp2 = new Empleado();
        emp2.setEmpno(2); emp2.setEname("Jones"); emp2.setJob("Manager");
        listaEmpleados.add(emp1); listaEmpleados.add(emp2);
        request.setAttribute("listaEmpleados", listaEmpleados);
         
        request.setAttribute("htmlTagData", "La etiqueta <br /> crea un salto de línea");
        request.setAttribute("url", "http://www.journaldev.com");
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
        rd.forward(request, response);
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}


}