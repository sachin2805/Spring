package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("spring.xml");
			Triangle t=(Triangle) c.getBean("tri");
			t.display();
		}
		catch(Exception e)
		{
		 e.printStackTrace();
		}

}
}
