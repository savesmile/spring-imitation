package com.f_lin.imitation.beans.support;

import com.f_lin.imitation.beans.io.ResourceLoader;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    /**
     * 注册中心
     */
    @Getter
    private Map<String, BeanDefinition> registry;

    @Getter
    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<String, BeanDefinition>();
        this.resourceLoader = resourceLoader;
    }

}
