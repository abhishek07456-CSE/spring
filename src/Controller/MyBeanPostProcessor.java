package Controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;

public class MyBeanPostProcessor implements DestructionAwareBeanPostProcessor , BeanFactoryPostProcessor{



	public Object postProcessBeforeInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("Post before intilization called " + beanname);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanname) throws BeansException {
		System.out.println("Post After intilization called " + beanname);
		return bean;
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanname) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("Post before destruction called " + beanname);

	}
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
          System.out.println("Properties file read befor object creation");	
	}
	
}
