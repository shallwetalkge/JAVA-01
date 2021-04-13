package classone.guavaBus.domain;

import lombok.*;

import java.io.Serializable;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>退学 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/13 22:48
 * @since 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class OutStudent implements Serializable {

    private String stuId;

}
