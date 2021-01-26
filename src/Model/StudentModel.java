package Model;

import Prototype.Person;

public class StudentModel extends Person {

	public StudentModel() {
		System.out.println("Student Model Intiated");
	}
	@Override
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
		
	}
     
	@Override
	public void setLast_name(String last_name) {
        this.last_name = last_name;		
	}

	@Override
	public void setEmail(String email) {
        this.email = email;		
	}

	@Override
	public void setAge(int age) {
         this.age = age;		
	}

	@Override
	public void setPhone(int phone) {
         this.phone = phone;		
	}

	@Override
	public String getFirst_name() {
		// TODO Auto-generated method stub
		return this.first_name;
	}

	@Override
	public String getLast_name() {
		// TODO Auto-generated method stub
		return this.last_name;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public int getPhone() {
		// TODO Auto-generated method stub
		return this.phone;
	}


}
