package com.Puma.DAO;

import java.util.List;

import com.Puma.Pumauser.Pumauser;

public interface PumaDAOinterface {

	//int createprofileDAO(Pumauser pu);

	Pumauser viewprofileDAO(Pumauser pu);

	int deleteprofileDAO(Pumauser pu);

	List<Pumauser> viewallprofileDAO();

	Pumauser searchprofileDAO(Pumauser pu);

	//Pumauser loginprofileDAO(Pumauser pu);

	int editprofileDAO(Pumauser pu);

	int signup(Pumauser pu);

	

	Pumauser validation(Pumauser pu);

	

}
