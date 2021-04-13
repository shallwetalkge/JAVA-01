package classone.domain;

import lombok.*;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description: 学生类
 * @author: shallwetalk
 * @time: 2021/3/16 2:30
 * @since: 1.8.0
 * @version: 0.0.1
 */
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student implements BeanNameAware, ApplicationContextAware {

    private String name;

    private int age;

    private String beanName;

    private ApplicationContext applicationContext;


    public void console(){
        System.out.println(String.join(",",applicationContext.getBeanDefinitionNames()));
    }

}
