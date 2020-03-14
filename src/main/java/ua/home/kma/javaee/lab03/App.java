package ua.home.kma.javaee.lab03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.home.kma.javaee.lab03.catalogue.Catalogue;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        Catalogue catalogue = context.getBean(Catalogue.class);
        System.out.println(catalogue);
    }

}
