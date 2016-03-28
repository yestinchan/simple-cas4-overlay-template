import org.jasig.cas.authentication.handler.DefaultPasswordEncoder;

/**
 * Created by yestin on 2016/3/28.
 */
public class Test {
    public static void main(String[] args) {

        DefaultPasswordEncoder encoder = new DefaultPasswordEncoder("MD5");
        encoder.setCharacterEncoding("utf-8");
        System.out.println(encoder.encode("test"));
    }
}
