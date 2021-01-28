package ApplicationServer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.PersonController;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext beanFactory = new ClassPathXmlApplicationContext("./xml_configuration/employee_spring_bean_container.xml");
		PersonController controller = (PersonController) beanFactory.getBean("person_controller");
		controller.personDetails();
		
		controller = null;
		
		
	}

}
