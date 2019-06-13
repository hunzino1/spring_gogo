package test.java.com.shj.test;

import com.shj.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @create 2019/6/13
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestIoC extends UnitTestBase {
    public TestIoC() {
        super("classpath:spring-context.xml");
    }

    @Test
    public void testGetBean() {
        User user = super.getBean("user");
        user.setId(12);
        user.setName("shj");
        System.out.println(user.toString());
    }

}
