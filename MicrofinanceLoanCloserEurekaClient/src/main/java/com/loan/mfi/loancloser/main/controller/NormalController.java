package com.loan.mfi.loancloser.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loan.mfi.loancloser.main.model.NormalCloser;
import com.loan.mfi.loancloser.main.service.ServiceI;

@RestController
@RequestMapping("/normalcloser")
public class NormalController {

	@Autowired
	private ServiceI s;
	
	@GetMapping("/test")
	public String test() {
		return "Normal Closer works";
	}
	
	//----------------Normal Closer---------------------------------
	//------------Insert----------------
	@PostMapping("/addNc")
	public String addData(@RequestBody NormalCloser ncl) {
		System.out.println("Data Insert"+ncl);
		s.addNormalCloser(ncl);
		
		return "Data inserted";
	}
	
	//-----------Update---------------
	@RequestMapping(value = "/getNc/{id}",method = RequestMethod.GET)
	//	@GetMapping(value = "/getNc/{id}")
	public NormalCloser getNormalCloser(@PathVariable("id") int id)
	{
		System.out.println(id);
		NormalCloser ncl=s.getNormalCloser(id);
		
		return ncl;
	}
	
	@RequestMapping(value = "/updateNc/{id}",method = RequestMethod.PUT)
//	@PutMapping(value ="/updateNc" )
	public String updateNormalCloser(@RequestBody NormalCloser ncltable )
	{
		s.upDateNormalCloser(ncltable);
			
		return "Update Data";
	}

	//--------------Delete-----------------
	@RequestMapping(value = "/deleteNc/{id}",method = RequestMethod.DELETE)
//	@DeleteMapping("/deleteNc/{id}")
	public String addData(@PathVariable("id") int id )
	{
		
			s.deleteNormalCloser(id);
			
			return "Data Delete";
	}

	//-------------Display------------------
	@GetMapping(value = "/getAllNc")
	public List<NormalCloser> getDataAll()
	{
		List<NormalCloser> ncl=(List<NormalCloser>)s.getDataAll();
		return ncl;
	}

}
