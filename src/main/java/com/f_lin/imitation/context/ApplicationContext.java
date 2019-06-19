package com.f_lin.imitation.context;

import com.f_lin.imitation.beans.factory.BeanFactory;

/**
 * 上下文。可以为bean生产或者销毁等操作提供支持以及一些资源管控、
 * 让beanFactory专心做自己bean生产的一些事情
 *
 * @author F_lin
 * @since 2019/4/18
 **/
public interface ApplicationContext extends BeanFactory {
}
