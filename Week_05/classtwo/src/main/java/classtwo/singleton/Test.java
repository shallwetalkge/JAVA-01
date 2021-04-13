package classtwo.singleton;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>测试</p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021-03-09 10:17
 * @since 1.8
 */
public class Test {

    public static void main(String[] args) {
        IdGeneratorStatic.getInstance().getId();
        IdGeneratorEnum.INSTANCE.getId();
        IdGeneratorDoubleCheck.getInstance().getId();
        IdGeneratorLazy.getInstance().getId();
        IdGeneratorHungry.getInstance().getId();
    }

}
