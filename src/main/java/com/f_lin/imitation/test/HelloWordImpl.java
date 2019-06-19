package com.f_lin.imitation.test;

import lombok.Getter;
import lombok.Setter;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class HelloWordImpl implements HelloWord {

    @Setter
    @Getter
    private String text;

    @Override
    public void helloWord() {
        System.out.println("hello word!" + text);
    }
}
