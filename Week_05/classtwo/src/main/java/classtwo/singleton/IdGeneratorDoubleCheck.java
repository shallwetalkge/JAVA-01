package classtwo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>
 *     双重检测
 *     支持延迟加载，又支持高并发
 * </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-12 10:14
 * @since 1.8
 */
public class IdGeneratorDoubleCheck {

    private AtomicLong id = new AtomicLong(0);

    private static IdGeneratorDoubleCheck instance;

    private IdGeneratorDoubleCheck(){}

    /**
     * 将类锁放在实例化之前，第一次竞争锁之后后期无需再进入锁机制中
     * @return
     */
    public static IdGeneratorDoubleCheck getInstance(){
        if (instance == null){
            synchronized (IdGeneratorDoubleCheck.class){
                if (instance == null){
                    instance = new IdGeneratorDoubleCheck();
                }
            }
        }
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }

}
