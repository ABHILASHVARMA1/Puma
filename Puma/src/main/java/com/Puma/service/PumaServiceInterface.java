package com.Puma.service;

import java.util.List;

import com.Puma.Pumauser.Pumauser;

public interface PumaServiceInterface {

//	int createprofileservice(Pumauser pu);

	Pumauser viewprofileservice(Pumauser pu);

	int deleteprofileservice(Pumauser pu);

	List<Pumauser> viewallprofileservice();

	Pumauser searchprofileservice(Pumauser pu);

//	Pumauser loginprofileservice(Pumauser pu);

	int editProfileService(Pumauser pu);

	int signup(Pumauser pu);

	 Pumauser validation(Pumauser pu);

	

	

	

	
}
