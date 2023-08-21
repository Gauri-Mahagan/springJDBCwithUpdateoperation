package com.mahagan.test;

import com.mahagan.doa.ProjectDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("appication-context.xml");

        ProjectDao projectDao=applicationContext.getBean("projectDao", ProjectDao.class);
        int count = projectDao.updateProjects(1,"school managemnt system");
        System.out.println("Update one row succesfully"+ count);


    }
}
