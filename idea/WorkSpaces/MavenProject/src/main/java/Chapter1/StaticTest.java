package Chapter1;

/**
 * @author benqi
 * @date 2020/1/5 12:49
 * @Description
 */
public class StaticTest {
    {
        System.out.println("非静态代码块");
    }
    static {
        System.out.println("静态代码块");
    }
    public  StaticTest(){
        System.out.println("构造方法");
    }
}
