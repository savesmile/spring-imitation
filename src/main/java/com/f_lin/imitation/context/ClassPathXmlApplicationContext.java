package com.f_lin.imitation.context;

import com.f_lin.imitation.beans.factory.AbstractBeanFactory;
import com.f_lin.imitation.beans.factory.AutowireCapableBeanFactory;
import com.f_lin.imitation.beans.factory.BeanFactory;
import com.f_lin.imitation.beans.io.ResourceLoader;
import com.f_lin.imitation.beans.support.AbstractBeanDefinitionReader;
import com.f_lin.imitation.beans.support.BeanDefinition;
import com.f_lin.imitation.beans.support.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(new AutowireCapableBeanFactory(), configLocation);
    }

    public ClassPathXmlApplicationContext(AbstractBeanFactory beanFactory, String configLocation) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    protected void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
