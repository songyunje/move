package com.ssafy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws OuchException {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		Person p = context.getBean("ssafy", Person.class);
//		try {
//			p.coding();
//		} catch (OuchException e) {
////			e.printStackTrace();
//		}
		p.coding();
	}
}
