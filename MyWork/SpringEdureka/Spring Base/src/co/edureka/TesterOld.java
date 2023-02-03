package co.edureka;

import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TesterOld {

	public static void main(String[] args) {
//traditional object
		Employee emp = new Employee();
		emp.setEid(01);
		emp.setEname("Pintu");
		emp.setEsalary(50000);
		System.out.println(emp);
//application context object--> using spring container = application context
		ApplicationContext empContext = new ClassPathXmlApplicationContext("empbean-config.xml");
		Employee e1 = (Employee) empContext.getBean("emp1");
		//OR method of cast
		Employee e2 = empContext.getBean("emp2",Employee.class);
		System.out.println(e1);
		System.out.println(e2);
		//for closing 
		ClassPathXmlApplicationContext dest = (ClassPathXmlApplicationContext)empContext;
		dest.close();
		
//spring way IOC object--> using spring container = beanfacory
		Resource resource = new ClassPathResource("empbean-config.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee e3 = factory.getBean("emp3",Employee.class);
		System.out.println(e3);
	
//
	}

}
