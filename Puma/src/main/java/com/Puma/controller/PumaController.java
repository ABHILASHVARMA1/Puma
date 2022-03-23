package com.Puma.controller;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.Puma.Pumauser.Pumauser;
import com.Puma.service.PumaService;
import com.Puma.service.PumaServiceInterface;

public class PumaController implements PumaControllerInterface {
	Logger log = Logger.getLogger("puma Controller");
/*	public void createprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your password");
		String password=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		
		
		Pumauser pu=new Pumauser();
		pu.setName(name);
		pu.setPassword(password);
		pu.setEmail(email);
		pu.setAddress(address);
		
		
		PumaServiceInterface ps=new PumaService();
		int i=ps.createprofileservice(pu);
		
		if(i>0) {
			System.out.println("profile created"+name);
			
		}else {
			System.out.println("this email is already exists enter  new email");
		}
				
	}*/

	public void viewprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr your email");
		String email=sc.next();
		

		Pumauser pu=new Pumauser();
		pu.setEmail(email);
		
		PumaServiceInterface ps=new PumaService();
		
		Pumauser p1=ps.viewprofileservice(pu);
		
		if(p1!=null) {
			System.out.println("HERE IS YOUR DETAILS");
			System.out.println("name is "+p1.getName());
			System.out.println("password is "+p1.getPassword());
			System.out.println("email is "+p1.getEmail());
			System.out.println("address is "+p1.getAddress());
		}else {
			System.out.println("your profile is not found ");
		}
		
		
	}

	public void deleteprofilecontroller() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email to deleteprofile");
		String email=sc.next();
		
		Pumauser pu=new Pumauser();
		pu.setEmail(email);
		
		PumaServiceInterface ps=new PumaService();
		int p1=ps.deleteprofileservice(pu);
		
		if(p1>0) {
			System.out.println("delete your profile" +email);
			}
		else {
			System.out.println("email is not found in data");
		}
		
		
	}

	public void viewallprofilecontroller() {
		PumaServiceInterface ps=new PumaService();
    List<Pumauser> ll = ps.viewallprofileservice();
		
		System.out.println(ll.size()+ "HERE DATA FOUND IN YOUR RECORD");
		
		for(Pumauser l:ll) {
			
			System.out.println("**********");
			System.out.println("Name is "+l.getName());
			System.out.println("Password is "+l.getPassword());
			System.out.println("Email is "+l.getEmail());
			System.out.println("Address is "+l.getAddress());
			System.out.println("**********");
			
		}
		
		ll.forEach(p->{
			
			System.out.println("**********");
			System.out.println("Name is "+p.getName());
			System.out.println("Password is "+p.getPassword());
			System.out.println("Email is "+p.getEmail());
			System.out.println("Address is "+p.getAddress());
			System.out.println("**********");
			
		});
		
		
	}

	@Override
	public void searchprofilecontroller() {
Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr your email");
		String email=sc.next();
		

		Pumauser pu=new Pumauser();
		pu.setEmail(email);
		
		PumaServiceInterface ps=new PumaService();
		
		Pumauser p1=ps.searchprofileservice(pu);
		
		if(p1!=null) {
			System.out.println("HERE IS YOUR DETAILS");
			System.out.println("name is "+p1.getName());
			System.out.println("password is "+p1.getPassword());
			System.out.println("email is "+p1.getEmail());
			System.out.println("address is "+p1.getAddress());
		}else {
			System.out.println("your profile is not found ");
		}
		
		
		
	}

	@Override
/*	public int loginprofilecontroller() {
		int v=2;
       Scanner sc=new Scanner(System.in);
		
		System.out.println("enetr your email");
		String email1=sc.next();
		System.out.println("enetr your password");
		String password1=sc.next();

		Pumauser pu=new Pumauser();
		pu.setEmail(email1);
		pu.setPassword(password1);
		
		PumaServiceInterface ps=new PumaService();
		
		Pumauser s1=ps.loginprofileservice(pu);
		
		 if(s1!=null) 
		    {    		
		 	if((s1.getPassword().equals(pu.getPassword1())) && (s1.getEmail().equals(pu.getEmail1())))
		    		v=1;
			}
			else
			{
				System.out.println("record not found for email "+email1);
			}
			return v;
	}
		if(p1!=null) {
			System.out.println("HERE IS YOUR PROFILE");
			System.out.println("name is "+p1.getName());
			System.out.println("password is "+p1.getPassword());
			System.out.println("email is "+p1.getEmail());
			System.out.println("address is "+p1.getAddress());
		}else {
			System.out.println("your password is wrong");
		}
		*/
		
		
	

	
	public void editprofilecontroller() {
    Scanner sc = new Scanner(System.in);
		
	    log.info("Enter old Email: ");
	     String email = sc.next();
    
    
		log.info("Enter new name: ");
		String name = sc.next();
		
		log.info("Enter new Password: ");
		String password = sc.next();
		
		
		log.info("Enter new Address: ");
		String address = sc.next();
		
		Pumauser pu=new Pumauser();
		pu.setName(name);
		pu.setPassword(password);
		pu.setEmail(email);
		pu.setAddress(address);
		
		PumaServiceInterface ps=new PumaService();
		int i = ps.editProfileService(pu);
		
		
		
		if(i>0) {
			
			System.out.println("Updated data is....");
			System.out.println("Name is "+name);
			System.out.println("Password is "+password);
			System.out.println("Email is "+email);
			System.out.println("Address is "+address);
			
		}
		
		else {
			System.out.println("Sorry you enter wrong email that's why you can't update your profile");
		}

}

	@Override
	public void signup() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your password");
		String password=sc.next();
		System.out.println("enter your email");
		String email=sc.next();
		System.out.println("enter your address");
		String address=sc.next();
		
		
		Pumauser pu=new Pumauser();
		pu.setName(name);
		pu.setPassword(password);
		pu.setEmail(email);
		pu.setAddress(address);
		
		PumaServiceInterface ps=new PumaService();
	    int i=ps.signup(pu);
		
		if(i>0) {
			System.out.println("profile created"+name);
			
		}else {
			System.out.println("this email is already exists enter  new email");
		}
				
		
	}

	
	public int signin() {
		
		 int v = 2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your email");
		String email1=sc.next();
		System.out.println("enter your password");
		String password1=sc.next();
		
		Pumauser pu=new Pumauser();	
		pu.setEmail1(email1);
		pu.setPassword1(password1);
		
		PumaServiceInterface ps=new PumaService();
		Pumauser s1=ps.validation(pu);
	    if(s1!=null) 
	    {    		
	   	if((s1.getPassword().equals(pu.getPassword1())) && (s1.getEmail().equals(pu.getEmail1())))
	    	
	    	{
	    		v=1;
			}
		}
		else
		{
			System.out.println("record not found for email "+email1);
		}
		return v;
	}


}







