package classtwo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>
 *     懒汉式
 *     支持延迟加载
 * </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-12 10:10
 * @since 1.8
 */
public class IdGeneratorLazy {

    private AtomicLong id = new AtomicLong(0);
    private static IdGeneratorLazy instance;
    private IdGeneratorLazy(){}
    public static synchronized IdGeneratorLazy getInstance(){
        if (null==instance){
            instance = new IdGeneratorLazy();
        }
        return instance;
    }
    public long getId(){
        return id.incrementAndGet();
    }

}
