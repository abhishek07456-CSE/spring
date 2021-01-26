package Prototype;

public abstract class Person {
	   protected String id;
	   protected String first_name;
       protected String last_name;
       protected String email;
       protected int age;
       protected int phone;
       protected abstract void setFirst_name(String first_name);
       protected abstract void setLast_name(String last_name);
       protected abstract void setEmail(String email);
       protected abstract void setAge(int age);
       protected abstract void setPhone(int phone);
       public abstract String getFirst_name();
       public abstract String getLast_name();
       public abstract String getEmail();
       public abstract String getId();
       public abstract int getAge();
       public abstract int getPhone();
}
