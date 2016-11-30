package main;

import impls.robot.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by User on 30.11.2016...
 */
public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        ModelT1000 t1000 = (ModelT1000) context.getBean("t1000");
        t1000.dance();
        t1000.action();

    }
}
