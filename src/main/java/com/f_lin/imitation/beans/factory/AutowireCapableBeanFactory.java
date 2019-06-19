package com.f_lin.imitation.beans.factory;

import com.f_lin.imitation.BeanReference;
import com.f_lin.imitation.aop.BeanFactoryAware;
import com.f_lin.imitation.beans.support.BeanDefinition;
import com.f_lin.imitation.beans.support.PropertyValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

        if (bean instanceof BeanFactoryAware) {
            ((BeanFactoryAware) bean).setBeanFactory(this);
        }

        for (PropertyValue propertyValue : bd.getPropertyValues().getPropertyValueList()) {

            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                String beanName = ((BeanReference) value).getName();
                value = getBean(beanName);
            }

            try {
                //使用setter方法进行注入。如果没有的话才使用 Field 方式
                Method declaredMethod = bean.getClass().getDeclaredMethod(
                        "set" + propertyValue.getName().substring(0, 1).toUpperCase()
                                + propertyValue.getName().substring(1), value.getClass());
                declaredMethod.setAccessible(true);

                declaredMethod.invoke(bean, value);

            } catch (NoSuchMethodException e) {
                Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
                declaredField.setAccessible(true);
                declaredField.set(bean, value);
            }
        }
    }

}
