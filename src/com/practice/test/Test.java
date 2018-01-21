package com.practice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.bean.A;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/practice/config/applicationContext.xml");
//		Object obj=ctx.getBean("a");
//		A a=(A)obj;
		A a=(A)ctx.getBean("a");
		System.out.println("Number of objects created by Container----------->" + ctx.getBeanDefinitionCount());
		String[] names=ctx.getBeanDefinitionNames();
		for(String name:names) {
			System.out.println("Name of tyhe objects created by Container------>" +name);
		}
		System.out.println();
		System.out.println(a.toString());
	}
}
