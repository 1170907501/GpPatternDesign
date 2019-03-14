package com.zzh.design.proxy.dynamicproxy.jdkproxy;

import com.zzh.design.proxy.IPerson;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKProxyTest {

    public static void main(String[] args) {
        //此处的object是jdk在jvm内存里面生成的动态代理类 $proxy0
        Object object = new JDKMeipo().getInstance(new Girl());


        try{
            //$Proxy0
            /*byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{IPerson.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();*/

            Method method = object.getClass().getMethod("findLove",null);
            method.invoke(object);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
