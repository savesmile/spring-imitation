package com.f_lin.imitation.support;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
@NoArgsConstructor
public class BeanDefinition {
    @Setter
    @Getter
    private Object bean;

    @Getter
    private Class beanClass;

    @Getter
    private String beanClassName;

    @Setter
    @Getter
    private PropertyValues propertyValues;


    public void setBeanClassName(String beanClassName) {
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {

        }
    }
}
