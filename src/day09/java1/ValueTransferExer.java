package day09.java1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * 网红题目：
 */
public class ValueTransferExer {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void method(int a, int b) {
        a =a * 10;
        b =b * 20;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }

}
