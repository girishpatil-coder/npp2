package com.loan.mfi.loancloser.main.service;

import java.util.List;

import com.loan.mfi.loancloser.main.dummymodel.Customer;
import com.loan.mfi.loancloser.main.model.NormalCloser;

public interface ServiceI {
     //------------NormalCloser-----------
    //------------Insert-----------------
	public int addNormalCloser(NormalCloser ncl);	

	//------------Update-----------------
	public NormalCloser getNormalCloser(int id);
	
	public void upDateNormalCloser(NormalCloser nc);
	
	//------------Delete-----------------
	public void deleteNormalCloser(int id);
	
	//-----------Display----------------
	public List<NormalCloser>  getDataAll();
	
	

}
