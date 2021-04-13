package classone.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description: 测试
 * @author: shallwetalk
 * @time: 2021/3/16 2:49
 * @since: 1.8.0
 * @version: 0.0.1
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();


        System.out.println(String.join(",",context.getBeanDefinitionNames()));

   /*     Student student = (Student) context.getBean("student");

        student.console();*/

    }
}
