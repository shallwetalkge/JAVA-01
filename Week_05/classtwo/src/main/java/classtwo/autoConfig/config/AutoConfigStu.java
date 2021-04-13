package classtwo.autoConfig.config;

import classtwo.autoConfig.domain.Student;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>自动配置学生 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/14 2:28
 * @since 1.8
 */
@Configurable
public class AutoConfigStu {

    @Bean
    public Student gets(){
        return new Student("张三");
    }

}
