package com.loan.mfi.loancloser.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.mfi.loancloser.main.model.NormalCloser;
import com.loan.mfi.loancloser.main.repository.NormalCloserrepo;



@Service
public class ServiceImpl implements ServiceI{

	
	@Autowired
	private NormalCloserrepo ncr;
	
	
	//--------------NormalCloser-------------
	//-------------Insert-----------------

	@Override
	public int addNormalCloser(NormalCloser nc) {
		
		ncr.save(nc);
		System.out.println("Service Data"+nc);
		return nc.getNormalClosureId();
	}
	
	//-------------Update-----------------

	@Override
	public NormalCloser getNormalCloser(int id) {
		
		NormalCloser nc= ncr.findById(id).get();
		
		System.out.println("services Data:-"+nc);
			return nc;
		
	}

	@Override
	public void upDateNormalCloser(NormalCloser nc) {
		
		ncr.save(nc);
		
	}
	
	//------------Delete------------------
	
	@Override
	public void deleteNormalCloser(int id) {
		
		ncr.deleteById(id);
		
	}
	
	//----------Display------------------
	@Override
	public List<NormalCloser> getDataAll() {
		List<NormalCloser> nc=(List<NormalCloser>)ncr.findAll();
		return nc;
	}



}

