import com.kaishengit.HelloWord;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 蔡林红 on 2017/10/28.
 */
public class SpringContextTest {
    @Test
    public void context(){
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWord helloWord =(HelloWord) context.getBean("helloBean");
        HelloWord helloWord2 =(HelloWord) context.getBean("helloBean");
        helloWord.printHello();
        System.out.println(helloWord==helloWord2);
    }
}
