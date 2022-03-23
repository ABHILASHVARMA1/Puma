package com.Puma.view;

import java.util.Scanner;

import com.Puma.controller.PumaController;
import com.Puma.controller.PumaControllerInterface;

public class Puma {
 static	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		PumaControllerInterface pc=new PumaController();
		
		String s="yes";
		int pk;
		
		while(s.equals("yes"))
		{
			System.out.println("***************");
			System.out.println("press 1 to sign-up");
			System.out.println("press 2 to sign-in");
			//System.out.println("press to 2 loginprofile");
			System.out.println("enter your choice");
			int ch=sc.nextInt();
			
			switch(ch) {
			case 1:pc.signup();
			break;
			case 2:pk= pc.signin();
		    if(pk==1) {
			while(s.equals("yes"))
		
			
			{
			
		//PumaControllerInterface pc=new PumaController();
		
		System.out.println("press to 1 viewprofile");
		System.out.println("press to 2 deleteprofile");
		System.out.println("press to 3 viewallprofile");
		System.out.println("press to 4 searchprofile");	
		System.out.println("press to 6 editprofile");
		
		System.out.println("enter your choice");
		
		 ch=sc.nextInt();
		
		
		
		
		switch(ch) {
		
		case 1:
			pc.viewprofilecontroller();
			break;
		case 2:
			pc.deleteprofilecontroller();
			break;
		case 3:
			pc.viewallprofilecontroller();
			break;
		case 4:
			pc.searchprofilecontroller();
			break;
		/*case 5:
			pc.loginprofilecontroller();
			break;*/
		case 6:
			pc.editprofilecontroller();
			break;
		default:
			
				System.out.println("enter wrong choice");
		    }
		
	 }

}
		 else
		 {
		System.out.println("enter wrong password or not registered");
	     }
		break;
          }
		System.out.println("enter yes/no to continue");
			s=sc.next();


		}
	}
}
