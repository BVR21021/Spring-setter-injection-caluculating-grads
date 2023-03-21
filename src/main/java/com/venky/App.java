package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        StudentBean ab=(StudentBean)ctx.getBean("Sb");
       String s= ab.toString();
       System.out.println(s);
       
       ab.printTotal();
       ab.printAverage();
       ab.printGrade();
    }
}
