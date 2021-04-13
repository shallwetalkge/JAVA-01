import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description: 测试bean装配
 * @author: shallwetalk
 * @time: 2021/3/16 2:35
 * @since: 1.8.0
 * @version: 0.0.1
 */
@Setter
@Getter
public class TestBean implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private List<String> beanNames;

    public void setApplicationContext(ApplicationContext applicationContext) {
        for(String beanName:applicationContext.getBeanDefinitionNames()){
            beanNames.add(beanName);
        }
    }

    @Test
    public void consoleAllBean(){
        ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println(String.join(",",context.getBeanDefinitionNames()));
        System.out.println(String.join(",",beanNames));
    }

}
