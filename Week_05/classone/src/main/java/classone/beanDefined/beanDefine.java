package classone.beanDefined;

import classone.domain.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>xml方式 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/14 1:52
 * @since 1.8
 */
public class beanDefine {

    public static void main(String[] args) {
        // 1
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("classone.domain");
        // 3
        ApplicationContext annotationConfigApplicationContext1 = new AnnotationConfigApplicationContext(Bean.class);
        // 4
        ApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("applicationContext.xml");
        // 5 @Autowrid @Resource
        // 6
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        Object student = beanFactory.getBean("Student");
        // 7
        StaticApplicationContext staticApplicationContext = new StaticApplicationContext();
        staticApplicationContext.registerBeanDefinition("stu",new AnnotatedGenericBeanDefinition(Student.class));

    }

}
