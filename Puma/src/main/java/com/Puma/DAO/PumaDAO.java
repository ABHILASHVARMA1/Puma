package com.Puma.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Puma.Pumauser.Pumauser;

public class PumaDAO implements PumaDAOinterface {

	/*public int createprofileDAO(Pumauser pu) {
		
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("insert into puma values(?,?,?,?)");
			ps.setString(1,pu.getName());
			ps.setString(2,pu.getPassword());
			ps.setString(3,pu.getEmail());
			ps.setString(4,pu.getAddress());
			
			i=ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}*/

	public Pumauser viewprofileDAO(Pumauser pu) {
		Pumauser p2=null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("select * from puma where email=?");
			ps.setString(1, pu.getEmail());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				p2=new Pumauser();
				p2.setName(n);
				p2.setPassword(p);
				p2.setEmail(e);
				p2.setAddress(a);
								
			  }
			}
			catch(Exception e) {
				e.printStackTrace();
			}			
		return p2;
	}

	public int deleteprofileDAO(Pumauser pu) {
		int i=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("delete from puma where email=?");
			ps.setString(1,pu.getEmail());
			
			
			i=ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	
	public List<Pumauser> viewallprofileDAO() {
		Pumauser v=null;
		List<Pumauser> ll = new ArrayList<Pumauser>();
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
		PreparedStatement ps = con.prepareStatement("select * from puma");
		
		ResultSet res = ps.executeQuery();
		
		while(res.next()) {
			
			String n = res.getString(1);
			String p = res.getString(2);
			String e = res.getString(3);
			String a = res.getString(4);		
					
			v = new Pumauser();
			v.setName(n);
			v.setPassword(p);
			v.setEmail(e);
			v.setAddress(a);
		
			ll.add(v);
			
		}
			
				}
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return ll;
}

	
	public Pumauser searchprofileDAO(Pumauser pu) {
		Pumauser p3=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("select * from puma where email=?");
			ps.setString(1, pu.getEmail());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				String a=res.getString(4);
				
				p3=new Pumauser();
				p3.setName(n);
				p3.setPassword(p);
				p3.setEmail(e);
				p3.setAddress(a);
								
			  }
			}
			catch(Exception e) {
				e.printStackTrace();
			}			
		return p3;
	
	}

	
	/*public Pumauser loginprofileDAO(Pumauser pu) {
     Pumauser p3=null;
		
		try {
			//System.out.println(pu.getEmail()+pu.getPassword());
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("select * from puma where email=? and password=?");
			ps.setString(1, pu.getEmail());
			ps.setString(2, pu.getPassword());
			
			ResultSet res=ps.executeQuery();
				if(res.next()) {
				//String n=res.getString(1);
				String p=res.getString(2);
				String e=res.getString(3);
				//String a=res.getString(4);
				
				p3=new Pumauser();
				//p3.setName(n);
				p3.setPassword(p);
				p3.setEmail(e);
				//p3.setAddress(a);
				
			  }
			}
			catch(Exception e) {
				e.printStackTrace();
			}			
		return p3;
		
	}*/

	
	public int editprofileDAO(Pumauser pu) {
             int i = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps = con.prepareStatement("update puma set name=?, password=?, address=? where email=?");
			ps.setString(1, pu.getName());
			ps.setString(2, pu.getPassword());
			ps.setString(3, pu.getAddress());
			ps.setString(4, pu.getEmail());
			
			i = ps.executeUpdate();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	
	}

	
	public int signup(Pumauser pu)
	{
		int i=0;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("insert into puma values(?,?,?,?)");
			ps.setString(1,pu.getName());
			ps.setString(2,pu.getPassword());
			ps.setString(3,pu.getEmail());
			ps.setString(4,pu.getAddress());
			
			i=ps.executeUpdate();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return i;
		
	}
 
	
	public Pumauser validation(Pumauser pu) {
		Pumauser po = null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","database");
			PreparedStatement ps=con.prepareStatement("select * from Puma where email=? and password=?");
			
			ps.setString(1,pu.getEmail1());
			ps.setString(2,pu.getPassword1());
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
			
			String e=res.getString(3);
			String p=res.getString(2);
			
			po=new Pumauser();
			
			
			po.setEmail(e);
			po.setPassword(p);
			}
	}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return po;
	}

	
	
}
