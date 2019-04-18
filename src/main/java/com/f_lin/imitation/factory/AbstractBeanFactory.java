package com.f_lin.imitation.factory;

import com.f_lin.imitation.support.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public abstract class AbstractBeanFactory implements BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();


    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registryBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 初始化bean
     * 可以让子类根据自己的需求进行bean初始化。
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
