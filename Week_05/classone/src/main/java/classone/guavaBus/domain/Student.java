package classone.guavaBus.domain;

import lombok.*;

/**
 * Copyright (C) 2021 Shall
 *
 * <p>学生 </p>
 *
 * @author shallwetalk
 * @version 0.0.1
 * @date 2021/4/13 22:23
 * @since 1.8
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
@Builder
public class Student {

    private String name;

    private Integer age;

    private String idNum;
}
