package com.f_lin.imitation.aop;

import java.lang.reflect.Method;

/**
 * @author F_lin
 * @since 2019/4/18
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);
}
