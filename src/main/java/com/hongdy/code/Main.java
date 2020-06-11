package com.hongdy.code;

import com.hongdy.code.controller.MainController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "EmployeeService";

    private static EntityManagerFactory factory;

    public static void main(String[] args) {
//        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
//        EntityManager em = factory.createEntityManager();
//        em.getTransaction().begin();
//        PersonInformation person = new PersonInformation();
//        person.setId(1);
//        person.setAge(30);
//        person.setName("fred");
//        em.persist(person);
//        em.getTransaction().commit();
//        em.close();

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        Query query = em.createQuery("SELECT pi.age FROM PersonInformation pi where pi.id=?1");
        query.setParameter(1, 1);
        Object object = query.getSingleResult();
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        MainController controller = (MainController)context.getBean("mainController");
        controller.test1();
    }
}
