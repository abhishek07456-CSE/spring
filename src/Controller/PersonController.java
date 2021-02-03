package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Model.Skills;
import Prototype.Person;

public class PersonController {
		@Autowired
		@Qualifier("student")
	    private Person person; // or student and teacher;
	    
		public void setPerson(Person person) {
			this.person = person;
		}

		public void personDetails() {
			 System.out.println("\n----------------person details-------------------");
        	 System.out.println("Name - "+ this.person.getFirst_name()+" "+this.person.getLast_name());
        	 System.out.println("Position - "+ this.person.getType());
        	 System.out.println("Skill Details ---");
        	 for(Skills skill : this.person.getSkills()) {
        		 System.out.println(" - " + skill.getName());
        	 }
			 System.out.println("-------------------------------------------------\n");

         }

		public void init() {
            System.out.println("New Bean Created - " + this.getClass().getSimpleName());		
		}

		public void destroy() {
			// TODO Auto-generated method stub
            System.out.println("Bean Destroyed - " + this.getClass().getSimpleName());		

		}
}
