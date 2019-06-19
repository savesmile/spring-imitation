package com.f_lin.imitation.beans.support;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public interface BeanPostProcessor {
    /**
     * 前置
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    /**
     * 后置
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
