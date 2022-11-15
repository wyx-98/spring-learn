package com.wyx.spring.learn.component;

import com.wyx.spring.learn.utils.TransactionManager;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: springCloudLearn
 * @description: 代理对象工厂
 * @author: wyx
 * @email: wyx9852@gmail.com
 * @create: 2022-06-18 16:06
 **/
public class ProxyFactory {

    private ProxyFactory() {
    }

    public static ProxyFactory proxyFactory = new ProxyFactory();

    public static ProxyFactory getProxyFactoryInstance() {
        return proxyFactory;
    }

    @Autowired
    public TransactionManager transactionManager;

    /**
     * jdk动态代理
     * @param obj 委托对象
     * @return 代理对象
     */
    public Object getJdkProxy(Object obj) {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                try {
                    transactionManager.beginTransaction();
                    Object result = method.invoke(obj, args);
                    transactionManager.commit();
                    return result;
                } catch (Exception e) {
                    transactionManager.rollback();
                    throw e;
                }
            }
        });
    }

    public Object getCglibProxy(Object obj) {
        return Enhancer.create(obj.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object result;
                System.out.println("收取中介费");
                result = method.invoke(obj,objects);
                System.out.println("贩卖客户信息");
                return result;
            }
        });
    }
}
