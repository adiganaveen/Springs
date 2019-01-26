package com.bridgelabz.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		// Resource r=new ClassPathResource("applicationContext.xml");
		// BeanFactory factory=new XmlBeanFactory(r);
		//
		// Employee s=(Employee)factory.getBean("e");
		// s.show2();

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) context.getBean("e");
		employee.show();
		System.out.println("--------------------");
		employee.show2();
		System.out.println("--------------------");
		employee.displayInfo();
		System.out.println("--------------------");
		employee.displayInfo2();
	}
}
