import com.kaishengit.service.Proxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
public class AopAspectTest {
    @Test
    public void aop(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Module.xml");
        Proxy proxy=(Proxy) context.getBean("myProxy");
        proxy.save();
    }
}
