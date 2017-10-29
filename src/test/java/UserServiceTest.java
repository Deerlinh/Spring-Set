import com.kaishengit.HelloWord;
import com.kaishengit.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 蔡林红 on 2017/10/28.
 */

public class UserServiceTest {
    @Test
  public void  context(){
      ApplicationContext context= new ClassPathXmlApplicationContext("UserService.xml");
      UserService userService=(UserService) context.getBean("userservice");
        HelloWord helloWord = (HelloWord) context.getBean("helloBean");
        helloWord.printHello();


  }

}
