package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

@WebServlet("/dologin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String customerId = request.getParameter("customerId");
		 
		// 비즈니스 로직을 수행하고 a bean(customer의 정보)의 결과를 리턴함
		  
		CustomerService service = new CustomerService();//c+s+o
		Customer customer = service.findCustomer(customerId);//c+s+o
		request.setAttribute("customer", customer); //작성 후 success.jsp에서 사용 가능
		 
		//iterate over lists using forEach in JSTL
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("id006", "Kim", "kim@hansung.ac.kr"));
		customers.add(new Customer("id007", "Lee", "lee@hansung.ac.kr"));
		customers.add(new Customer("id008", "Park", "park@hansung.ac.kr"));
		request.setAttribute("customerList", customers);
		 
		 
		String page;
		 
		if(customer == null)
			page ="/view/error.jsp";
		else
			page ="/view/success.jsp";
		 
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
		 
		}
	}


