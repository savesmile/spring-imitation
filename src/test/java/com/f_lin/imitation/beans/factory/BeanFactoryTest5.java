package com.f_lin.imitation.beans.factory;

import com.f_lin.imitation.context.ClassPathXmlApplicationContext;
import com.f_lin.imitation.test.HelloWord;
import com.f_lin.imitation.test.HelloWorldBeanTest;
import org.junit.Test;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class BeanFactoryTest5 {
    @Test
    public void Test() throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-test.xml");
        HelloWord helloWord = (HelloWord) context.getBean("helloWord");
        helloWord.helloWord();

    }


}
