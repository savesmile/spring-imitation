package com.f_lin.imitation.aop;

/**
 * 被代理的目标
 *
 * @author F_lin
 * @since 2019/4/18
 **/
public class TargetSource {
    private Class<?>[] targetClass;

    private Object target;

    public TargetSource(Object target, Class<?>... targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }

    public Class<?>[] getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }
}
