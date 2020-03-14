package day04;

public class JinzhiTest {
    public static void main(String[] args){

        int i1 = 60;
        int i2 =i1&15;
        System.out.println(i2);
        String j =(i2>9)?(char)(i2-10+'A')+"":i2+"";
        int temp = i1>>4;
        i2 =temp&15;
        String k =(i2>9)?(char)(i2-10+'A')+"":i2+"";
        System.out.println(k+""+j);
    }

}
