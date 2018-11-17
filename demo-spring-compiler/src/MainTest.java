import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.DatagramSocket;
import java.net.Socket;


public class MainTest {

    public static void main(String[] args) {
        System.out.println("编译开始");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
        System.out.println("编译结束");

    }
}
