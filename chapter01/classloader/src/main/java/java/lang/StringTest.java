package java.lang;

/**
 * 防止核心类库被恶意篡改
 *
 * @author Qh
 * @version 1.0
 * @date 2021-06-15-0:21
 */
public class StringTest {

    public static void main(String[] args) {
        //java.lang.SecurityException: Prohibited package name: java.lang
        System.out.println("hello!");
    }
}
