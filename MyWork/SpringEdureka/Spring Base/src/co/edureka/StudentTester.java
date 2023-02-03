package co.edureka;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("studentBeanConfig.xml");
//		Student std = (Student) context.getBean("std");
//		OR
		Student std = context.getBean("std",Student.class);
		System.out.println(std);
		
	}
}
