package com.f_lin.imitation.aop;

import com.f_lin.imitation.beans.factory.BeanFactory;

/**
 * 提供让子类拿到bean工厂的能力
 *
 * @author F_lin
 * @since 2019/4/18
 **/
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;

}
