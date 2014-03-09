package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class app {
	
	public app (){
		
	
	CustomerDao customerDao = new CustomerDaoImpl(); 
	
	Customer cust1 = new Customer();
	cust1.setIdCustomer("001");
	cust1.setName("Tole");
	customerDao.saveOrUpdate(cust1);
	
	
	Customer cust2 = new Customer();
	cust2.setIdCustomer("002");
	cust2.setName("Minthul");
	customerDao.saveOrUpdate(cust2);
	
	//menampilkan data
	List<Customer> customers = new ArrayList<>();
	customers = customerDao.findAll();
	for  (Customer item : customers){
		System.out.println(item);
	}
	
	for (int i = 0; i < customers.size(); i++) {
		Customer item = new Customer();
		item = customers.get(i);
		System.out.println(item);
		
		
	}
	
	}


public static void main(String[] args) {
	app f = new app();
}
}

