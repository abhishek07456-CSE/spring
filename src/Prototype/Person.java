package Prototype;

import java.util.ArrayList;

import Model.Skills;

public abstract class Person {
	   protected String type;
	   protected ArrayList <Skills> skills;
	   protected String id;
	   protected String first_name;
       protected String last_name;
       protected String email;
       protected int age;
       protected int phone;
       
	   	public void setFirst_name(String first_name) {
	   		this.first_name = first_name;
	   		
	   	}
	        
	   	public void setLast_name(String last_name) {
	           this.last_name = last_name;		
	   	}
	
	   	public void setEmail(String email) {
	           this.email = email;		
	   	}
	
	   	public void setAge(int age) {
	            this.age = age;		
	   	}
	
	   	public void setPhone(int phone) {
	            this.phone = phone;		
	   	}
	
	   	public String getFirst_name() {
	   		// TODO Auto-generated method stub
	   		return this.first_name;
	   	}
	
	   	public String getLast_name() {
	   		// TODO Auto-generated method stub
	   		return this.last_name;
	   	}
	
	   	public String getEmail() {
	   		// TODO Auto-generated method stub
	   		return this.email;
	   	}
	
	   	public String getId() {
	   		// TODO Auto-generated method stub
	   		return this.id;
	   	}
	
	   	
	   	public int getAge() {
	   		// TODO Auto-generated method stub
	   		return this.age;
	   	}
	
	   	public int getPhone() {
	   		return this.phone;
	   	}
	   	public ArrayList<Skills> getSkills() {
			return this.skills;
		}

		public  void setType(String type) {
			this.type= type;
		}

		public String getType() {
	   		return this.type;
	   	}
	   	public void setSkills(ArrayList <Skills> skills) {
	   		this.skills = skills;
	   	}

}
