package net.javaguides.registration.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import net.javaguides.registration.dao.employeeDao;
import net.javaguides.registration.model.employee;

import java.io.IOException;

/**
 * Servlet implementation class employeeServlet
 */
@WebServlet("/register")
public class employeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	private employeeDao employeeDao = new employeeDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public employeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String passsword = request.getParameter("password");
		
		employee employee = new employee();
		employee.setFirstName(first_name);
		employee.setLastName(last_name);
		employee.setUsername(username);
		employee.setAddress(address);
		employee.setContact(contact);
		employee.setPassword(passsword);
		
		try {
			employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request, response);
	}

}
