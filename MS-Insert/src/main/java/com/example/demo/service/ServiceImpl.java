package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.Homerepo;

@Service
public class ServiceImpl implements ServiceI{

	@Autowired
	private Homerepo hr;
	
	@Override
	public int addCustomer(Customer c) {
		
		hr.save(c);
		System.out.println("services Data:-"+c);
		return c.getCid();
	}

}

