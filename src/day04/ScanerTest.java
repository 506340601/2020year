package day04;

import java.util.Scanner;

public class ScanerTest {

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的姓名：");
            String name = scan.next();
            System.out.println(name);

            System.out.println("请输入你的年龄：");
            int age = scan.nextInt();
            System.out.println(age);

            System.out.println("请输入你的体重：");
            double weight = scan.nextDouble();
            System.out.println(weight);

            System.out.println("姑娘向北走，小生不才，未得姑娘青睐：");
            boolean isLove = scan.nextBoolean();
            System.out.println(isLove);

//            对于char型的获取，Scanner没有提供相应的方法
            System.out.println("请输入你的性别：（男/女）");
            String gender = scan.next();
            char genderChar = gender.charAt(0);//获取索引上为0位置上的字符
            System.out.println(gender);
        }
}
