package com.in28minutes.gokul;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02Helloworld {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2"));
			System.out.println(context.getBean("person3parameters"));
			System.out.println(context.getBean("address2"));
		}
	}
}