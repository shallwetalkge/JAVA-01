package classone.domain;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @description: 定义
 * @author: shallwetalk
 * @time: 2021/3/16 2:55
 * @since: 1.8.0
 * @version: 0.0.1
 */
@Configurable
public class Define {

    @Bean(name = "student2")
    public Student2 gets(){
        return new Student2("2","张三");
    }
}
