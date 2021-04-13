package classone.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: 学生2
 * @author: shallwetalk
 * @time: 2021/3/16 3:02
 * @since: 1.8.0
 * @version: 0.0.1
 */
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student2 implements Serializable {

    private String id ;

    private String name;


}
