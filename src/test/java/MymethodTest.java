import com.kaishengit.HelloWord;
import com.kaishengit.cgLib.MymethodIntercopter;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
public class MymethodTest {
    @Test
    public void mymeshod(){
        //创建net.sf.cglib.proxy.Enhancer的模板对象
        Enhancer enhancer= new Enhancer();
        //设置目标对象
        enhancer.setSuperclass(HelloWord.class);
        //设置MymethodIntercopter的实现类
        enhancer.setCallback(new MymethodIntercopter());
        //创建子类
        HelloWord helloWord=(HelloWord) enhancer.create();
        helloWord.printHello();
    }
}
