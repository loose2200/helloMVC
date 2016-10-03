package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService { 
	 
private Map<String, Customer>customers; //입력 후 c +s +o
//우클릭 > source > generate constructors from superclass object체크
 
private static final CustomerService instance = new CustomerService();

private CustomerService() {
	customers = new HashMap<String, Customer>();//c+s+o
}
 
public void addCustomer(Customer customer) {
	customers.put(customer.getId(), customer); //id는 key값 customer는 value값
}

	public Customer findCustomer(String id) {
		if (id != null)
			return (customers.get(id.toLowerCase()));

	else return null;
}

	public static CustomerService getInstance(){
		return instance;
	}
 
public Customer login(String id, String password) {
	Customer customer = findCustomer(id);
	
if(customer != null){
	if(customer.getPassword().equals(password))
		return customer;
	else return null;
}
else return null;
}
}