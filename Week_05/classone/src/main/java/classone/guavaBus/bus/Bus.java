package classone.guavaBus.bus;

import com.google.common.eventbus.EventBus;
import lombok.Getter;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>事件总线 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/13 22:20
 * @since 1.8
 */
@Getter
public enum Bus {

    /**单例*/
    INSTANCE;

    private EventBus bus = new EventBus();

    public EventBus getBus(){
        return bus;
    }

}
