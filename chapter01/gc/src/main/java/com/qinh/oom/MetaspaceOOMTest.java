package com.qinh.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * java.lang.OutOfMemoryError:Metaspace
 *
 * 1、Metaspace是方法区在Hotspot中的实现，它与永久代最大的区别在于：
 * Metaspace并不在虚拟机内存中而是使用本地内存，也即在java8中，classe metadata(the virtual machines internal presentation of Java class)，
 * 被存储在叫做Metaspace的native memory
 *
 * 2、Java 8及之后的版本使用Metaspace来替代永久代，存放了以下信息：
 *     1、虚拟机加载的类信息
 *     2、常量池
 *     3、静态变量
 *     4、即时编译后的代码缓存
 *
 * -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 *
 * @author Qh
 * @version 1.0
 * @date 2021-11-03 22:06
 */
public class MetaspaceOOMTest {
    static class OOMTest {

    }

    public static void main(String[] args) {
        //模拟多少次后发生异常
        int i = 0;
        try {
            while (true) {
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                //匿名实现类的匿名对象
                enhancer.setCallback(new MethodInterceptor(){
                    @Override
                    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                        return proxy.invokeSuper(obj, args);
                    }
                });
                enhancer.create();
            }
        } catch (Throwable e) {
            System.out.println("********多少次后发生了异常：" + i);
            e.printStackTrace();
        }
    }
}
