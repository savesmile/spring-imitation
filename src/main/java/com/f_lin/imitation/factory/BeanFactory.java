package com.f_lin.imitation.factory;

import com.f_lin.imitation.support.BeanDefinition;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public interface BeanFactory {
    /**
     * 获取bean
     */
    Object getBean(String beanName);

    /**
     * 注册bean的定义
     */
    void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception;
}
