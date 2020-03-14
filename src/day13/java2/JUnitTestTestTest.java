package day13.java2;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/22 21:49
 */
class JUnitTestTestTest {
    int num = 10;
    @Test
    void testEquals() {
        String s1 = "MM";
        String s2 = "MM";
        System.out.println(s1.equals(s2));


//  java.lang.ClassCastException:
//        Object obj = new String("GG");
//        Date date = (Date)obj;
        System.out.println(num);

    }
    public void show(){
        num =20;
        System.out.println("show()...");
    }

    @Test
    public void testToString(){
        String s3 = "MMM";
        System.out.println(s3);
    }
}