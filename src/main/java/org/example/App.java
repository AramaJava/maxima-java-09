package org.example;

import org.example.config.SpringConfig;

import org.example.model.Cat;

import org.example.repository.CatRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello JPA!!!");

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        CatRepository repoCat = context.getBean(CatRepository.class);


        Cat murzik = new  Cat("Мурзик", 10, true);



        repoCat.save(murzik);

        System.out.println("Коты");
        repoCat.findAll().forEach(System.out::println);




    }
}