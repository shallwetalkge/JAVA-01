package classone.guavaBus.Service;


import classone.guavaBus.bus.Bus;
import classone.guavaBus.domain.OutStudent;
import classone.guavaBus.domain.Student;
import com.google.common.eventbus.Subscribe;


/**
 * Copyright (C) 2021 Shall
 *
 * <p>生产者 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/13 22:32
 * @since 1.8
 */
public class Consumer {

    static {
        Bus.INSTANCE.getBus().register(new Consumer());
    }


    /**
     * 注册学生
     * @param student
     */
    @Subscribe
    public void register(Student student){
        System.out.println("register:"+student);
    }

    @Subscribe
    public void getOut(OutStudent outStudent){
        System.out.println("out:"+outStudent);
    }

}
