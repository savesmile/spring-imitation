package com.f_lin.imitation.factory;

import com.f_lin.imitation.support.BeanDefinition;
import com.f_lin.imitation.support.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    protected Object doCreateBean(BeanDefinition beanDefinition) throws Exception {
        //初始化bean
        Object instanceBean = newInstanceBean(beanDefinition);
        //为bean字段赋值
        applyPropertyValue(instanceBean, beanDefinition);
        return instanceBean;
    }

    protected Object newInstanceBean(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    /**
     * 为bean注入相关的属性
     */
    protected void applyPropertyValue(Object bean, BeanDefinition bd) throws Exception {
        for (PropertyValue propertyValue : bd.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, propertyValue.getValue());
        }

    }

}
