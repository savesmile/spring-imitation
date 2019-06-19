package com.f_lin.imitation.beans.factory;

import com.f_lin.imitation.beans.io.ResourceLoader;
import com.f_lin.imitation.beans.support.AbstractBeanDefinitionReader;
import com.f_lin.imitation.beans.support.BeanDefinition;
import com.f_lin.imitation.beans.support.xml.XmlBeanDefinitionReader;
import com.f_lin.imitation.test.HelloWorldBeanTest;
import org.junit.Test;

import java.util.Map;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class BeanFactoryTest4 {
    @Test
    public void Test() throws Exception {
        //初始化factory
        BeanFactory beanFactory = new AutowireCapableBeanFactory();

        //加载xml
        AbstractBeanDefinitionReader reader = new XmlBeanDefinitionReader(new ResourceLoader());
        reader.loadBeanDefinitions("spring-bean-test.xml");

        for (Map.Entry<String, BeanDefinition> entry : reader.getRegistry().entrySet()) {
            ((AbstractBeanFactory)beanFactory).registerBeanDefinition(entry.getKey(), entry.getValue());
        }
        ((AutowireCapableBeanFactory)beanFactory).preInstantiateSingletons();

        HelloWorldBeanTest worldBeanTest = ( HelloWorldBeanTest) beanFactory.getBean("helloWorldBeanTest");
        System.out.println(worldBeanTest.toString());
    }


}
