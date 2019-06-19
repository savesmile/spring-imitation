package com.f_lin.imitation.aop;

import com.f_lin.imitation.context.ClassPathXmlApplicationContext;
import com.f_lin.imitation.test.HelloWord;
import com.f_lin.imitation.test.HelloWorldBeanTest;
import org.junit.Test;

/**
 * @author F_lin
 * @since 2019/4/18
 **/
public class JdkDynamicAopProxyTest {

    @Test
    public void test() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-test.xml");
        HelloWord beanTest = (HelloWord) context.getBean("helloWord");
        beanTest.helloWord();
        System.out.println("\n");

        // --------- helloWorldService with AOP
        // 1. 设置被代理对象(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(beanTest, HelloWord.class);
        advisedSupport.setTargetSource(targetSource);

        // 2. 设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        // 3. 创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloWord helloWorldServiceProxy = (HelloWord) jdkDynamicAopProxy.getProxy();

        // 4. 基于AOP的调用
        helloWorldServiceProxy.helloWord();

    }

}
