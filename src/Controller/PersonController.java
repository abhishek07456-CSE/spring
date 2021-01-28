package Controller;


import Model.Skills;
import Prototype.Person;

public class PersonController{
	    private Person person; // or student and teacher;

		public void setPerson(Person person) {
			this.person = person;
		}

		public void personDetails() {
			 System.out.println("----------------person details-------------------");
        	 System.out.println("Name - "+ this.person.getFirst_name()+" "+this.person.getLast_name());
        	 System.out.println("Position - "+ this.person.getType());
        	 System.out.println("Skill Details ---");
        	 for(Skills skill : this.person.getSkills()) {
        		 System.out.println(" - " + skill.getName());
        	 }
         }
}
