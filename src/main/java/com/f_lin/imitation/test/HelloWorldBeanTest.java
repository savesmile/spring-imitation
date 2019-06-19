package com.f_lin.imitation.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
@Setter
@Getter
@ToString
@NoArgsConstructor
public class HelloWorldBeanTest {
    private String name;
    private String value;
    private String type;

    private HelloWordBean2 refTest;
}
