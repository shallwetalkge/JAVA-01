package classone.guavaBus.Service;


import classone.guavaBus.bus.Bus;
import classone.guavaBus.domain.OutStudent;
import classone.guavaBus.domain.Student;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>生产者 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/13 22:35
 * @since 1.8
 */
public class Producter {

    public static void main(String[] args) {
        //注册事件
        new Consumer();
        Bus.INSTANCE.getBus().post(Student.builder().name("李四").age(19).idNum("666555").build());

        Bus.INSTANCE.getBus().post(OutStudent.builder().stuId("666555").build());

    }

}
