package classtwo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>
 *     饿汉式
 *     在类加载的时候，instance 静态实例就已经创建并初始化好了，
 *     所以，instance 实例的创建过程是线程安全的。
 *     不过，这样的实现方式不支持延迟加载（在真正用到 IdGenerator 的时候，再创建实例）
 * </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-12 10:02
 * @since 1.8
 */
public class IdGeneratorHungry {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorHungry instance = new IdGeneratorHungry();
    private IdGeneratorHungry(){}
    public static IdGeneratorHungry getInstance(){
        return instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }
}
