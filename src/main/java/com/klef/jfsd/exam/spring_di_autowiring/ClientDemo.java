package com.klef.jfsd.exam.spring_di_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

       
        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
