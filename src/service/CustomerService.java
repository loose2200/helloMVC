package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService { 
	 
private Map<String, Customer>customers; //�Է� �� c +s +o
//��Ŭ�� > source > generate constructors from superclass objectüũ
 
public CustomerService() {
customers = new HashMap<String, Customer>();//c+s+o
 
addCustomer(new Customer("id001", "Alice", "alce.hansung.ac.kr"));
addCustomer(new Customer("id002", "Bob", "bob.hansung.ac.kr"));
addCustomer(new Customer("id003", "Charlie", "charlie.hansung.ac.kr"));
addCustomer(new Customer("id004", "David", "david.hansung.ac.kr"));
addCustomer(new Customer("id005", "Trudy", "trudy.hansung.ac.kr"));
}
 
public void addCustomer(Customer customer) {
customers.put(customer.getId(), customer); //id�� key�� customer�� value��
}
 
public Customer findCustomer(String id) {
if(id != null)
return(customers.get(id.toLowerCase()));
else 
return null;
}
}