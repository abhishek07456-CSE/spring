package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Model.Skills;
import Prototype.Person;

public class PersonController {
		
	    private Person person; // or student and teacher;
	    @Autowired(required=false)
		@Qualifier("student")
		public void setPerson(Person person) {
			this.person = person;
		}

		public void personDetails() {
			 if(this.person!=null) {
				 System.out.println("\n----------------person details-------------------");
	        	 System.out.println("Name - "+ this.person.getFirst_name()+" "+this.person.getLast_name());
	        	 System.out.println("Position - "+ this.person.getType());
	        	 System.out.println("Skill Details ---");
	        	 for(Skills skill : this.person.getSkills()) {
	        		 System.out.println(" - " + skill.getName());
	        	 }
				 System.out.println("-------------------------------------------------\n");
			 }

         }
}
