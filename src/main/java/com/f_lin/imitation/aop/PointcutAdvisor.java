package com.f_lin.imitation.aop;

/**
 * @author F_lin
 * @since 2019/4/18
 */
public interface PointcutAdvisor extends Advisor{

   Pointcut getPointcut();
}
