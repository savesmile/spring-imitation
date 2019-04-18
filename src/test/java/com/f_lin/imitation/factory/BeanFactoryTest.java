package com.f_lin.imitation.factory;

import com.f_lin.imitation.support.BeanDefinition;
import com.f_lin.imitation.support.PropertyValue;
import com.f_lin.imitation.support.PropertyValues;
import org.junit.Test;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class BeanFactoryTest {
    @Test
    public void Test() throws Exception {
        //初始化factory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //解析xml为bean定义
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("com.f_lin.imitation.factory.HelloWorldBeanTest");

        //解析xml中的相关bean属性
        PropertyValue value1 = new PropertyValue("name", "hello name");
        PropertyValue value2 = new PropertyValue("value", "hello value");
        PropertyValue value3 = new PropertyValue("type", "hello type");
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(value1);
        propertyValues.addPropertyValue(value2);
        propertyValues.addPropertyValue(value3);

        beanDefinition.setPropertyValues(propertyValues);

        //注册bean
        beanFactory.registryBeanDefinition("HelloWorldBeanTest", beanDefinition);

        //生产bean
        HelloWorldBeanTest helloWorldBeanTest = (HelloWorldBeanTest)beanFactory.getBean("HelloWorldBeanTest");

        System.out.println(helloWorldBeanTest.toString());
    }


}
