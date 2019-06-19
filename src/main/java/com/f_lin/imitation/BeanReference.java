package com.f_lin.imitation;

import lombok.Getter;
import lombok.Setter;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
@Setter
@Getter
public class BeanReference {

    private String name;

    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }
}
