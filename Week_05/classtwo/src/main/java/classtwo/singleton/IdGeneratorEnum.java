package classtwo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>
 *     枚举单例
 *     通过java本身的枚举特性
 *     保证实力创建的线程安全性和实力的唯一性
 * </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-12 16:31
 * @since 1.8
 */
public enum IdGeneratorEnum {

    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId(){
        return id.incrementAndGet();
    }

}
