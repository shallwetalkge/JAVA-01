package classtwo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>
 *     静态内部类
 *     比双重监测简单，又做到延迟加载
 * </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-12 16:25
 * @since 1.8
 */
public class IdGeneratorStatic {

    private AtomicLong id = new AtomicLong(0);
    private IdGeneratorStatic(){}

    /**
     * 静态内部类当外部类被加载de时候不会创建此类实例
     * 只有当getInstance()被调用的时候才会创建instance
     */
    private static class SingletonHolder{
        private static final IdGeneratorStatic instance = new IdGeneratorStatic();
    }

    public static IdGeneratorStatic getInstance(){
        return SingletonHolder.instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }

}
