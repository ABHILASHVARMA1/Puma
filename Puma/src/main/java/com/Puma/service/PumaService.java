package com.Puma.service;

import java.util.List;

import com.Puma.DAO.PumaDAO;
import com.Puma.DAO.PumaDAOinterface;
import com.Puma.Pumauser.Pumauser;

public class PumaService implements PumaServiceInterface {

/*	public int createprofileservice(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		int i=pd.createprofileDAO(pu);
		return i;
	}*/

	public Pumauser viewprofileservice(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		Pumauser p=pd.viewprofileDAO(pu);
		return p;
	}
	public int deleteprofileservice(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		int i=pd.deleteprofileDAO(pu);
		return i;
	}

	public List<Pumauser> viewallprofileservice() {
		PumaDAOinterface pd=new PumaDAO();
		List<Pumauser> i=pd.viewallprofileDAO();
					
		return i;
	}
	
	public Pumauser searchprofileservice(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		Pumauser p=pd.searchprofileDAO(pu);
		return p;
	}

	/*public Pumauser loginprofileservice(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
	   Pumauser p=pd.loginprofileDAO(pu);
		return p;
	}*/
	
	public int editProfileService(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		int i=pd.editprofileDAO(pu);
		return i;
		
	}
	
	public int signup(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		int i = pd.signup(pu);
		return i;
	}
	
	public Pumauser validation(Pumauser pu) {
		PumaDAOinterface pd=new PumaDAO();
		Pumauser p=pd.validation(pu);
				return p;
	}




	


	

}
