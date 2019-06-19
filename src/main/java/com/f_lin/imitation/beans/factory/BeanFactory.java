package com.f_lin.imitation.beans.factory;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public interface BeanFactory {
    /**
     * 获取bean
     */
    Object getBean(String beanName) throws Exception;

}
