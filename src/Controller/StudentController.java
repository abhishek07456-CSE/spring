package Controller;

import Model.Skills;
import Model.StudentModel;

public class StudentController {
	     private StudentModel student;
         private Skills skill1; //auto wire
         private Skills skill2; //auto wire


		public void setStudent(StudentModel student) {
			this.student = student;
		}

		public void setSkill1(Skills skill1) {
			this.skill1 = skill1;
		}

		public void setSkill2(Skills skill2) {
			this.skill2 = skill2;
		}

		public void studentDetails() {
        	 if(this.student.getAge() > 18)
        		 System.out.println(this.student.getFirst_name() + " " + this.student.getLast_name() + " is Eligible for Vote");
        	 else
    		 System.out.println(this.student.getFirst_name() + " " + this.student.getLast_name() + " is not Eligible for Vote");
        	 
        	 System.out.println("skill 1 "+ skill1.getName());
        	 System.out.println("skill 2 "+ skill2.getName());
         }
}
