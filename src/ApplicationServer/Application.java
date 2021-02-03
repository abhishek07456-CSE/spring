package ApplicationServer;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Controller.PersonController;

public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext beanFactory = new ClassPathXmlApplicationContext("xml_configuration/employee_spring_bean_container.xml");
		beanFactory.registerShutdownHook();
		PersonController controller = (PersonController) beanFactory.getBean("person_controller");
		controller.personDetails();
		
		controller = null;
		
		
	}

}
