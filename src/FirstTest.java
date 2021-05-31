import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    void test_one(){
        System.out.println("test_1");
    }

    @Test
    void test_tow(){
        System.out.println("test_2");
        Assert.assertEquals(1,2);
    }
}
