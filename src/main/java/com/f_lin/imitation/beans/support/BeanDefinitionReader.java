package com.f_lin.imitation.beans.support;

/**
 * bean定义 reader
 * @author F_lin
 * @since 2019/4/18
 **/
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;

}
