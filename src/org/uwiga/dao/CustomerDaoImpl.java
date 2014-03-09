package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	//tempat penyimpanan >>Nantinya akan diganti dengan database
	List<Customer> listCustumer = new ArrayList<>();
	
	@Override
	public void saveOrUpdate(Customer o) {
	listCustumer.add(o);
	}

	@Override
	public void delete(Customer o) {
		listCustumer.remove(o) ;
	}

	@Override
	public List<Customer> findAll() {
		return listCustumer;
	}

	@Override
	public List<Customer> findById() {
		//
		return listCustumer;
	}
}
