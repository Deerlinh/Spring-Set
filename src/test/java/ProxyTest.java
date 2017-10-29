import com.kaishengit.service.Proxy;
import com.kaishengit.service.myProxy;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
public class ProxyTest {
    @Test
    public void demo1() {
        //获得接口的实现类
        Proxy proxy = new myProxy();

        Proxy myProxy = (Proxy) java.lang.reflect.Proxy.newProxyInstance(proxy.getClass().getClassLoader(), proxy.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if(method.getName().equals("save")){
                    System.out.println("拦截了");
                    return null;
                }
                return method.invoke(proxy,args);
            }
        });
        proxy.save();
    }

}
