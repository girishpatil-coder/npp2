package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.ServiceI;

@RestController
public class HomeController {
	
	@Autowired
	private ServiceI s;
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String addData(@RequestBody Customer cust)
	{
		System.out.println("Data insert:"+cust);
		
			s.addCustomer(cust);
			
			return "Data Insert";
	}

}
