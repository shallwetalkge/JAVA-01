package classtwo;

import classtwo.autoConfig.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>启动类 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/14 2:41
 * @since 1.8
 */

@SpringBootApplication
public class SpringBootApplicationStarter implements CommandLineRunner {

    @Autowired
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationStarter.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(student);
    }
}
