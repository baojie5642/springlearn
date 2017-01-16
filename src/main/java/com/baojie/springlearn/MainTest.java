package com.baojie.springlearn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainTest 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "classpath*:spring/applicationContext*.xml" });
    	
    	System.out.println("go");
    	
    	GetBeanFromSpring getBeanFromSpring=applicationContext.getBean(GetBeanFromSpring.class);
    	
    	if(null==getBeanFromSpring){
    		System.out.println("null.");
    	}
    	
    	
    }
}
