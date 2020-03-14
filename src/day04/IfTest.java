package day04;

import java.util.Scanner;

public class IfTest {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入岳小鹏的期末成绩：(0~100)");
        int score= scan.nextInt();
        if(score==100){
            System.out.println("奖励一辆BMW");
        }else if(score>80 && score<=99){
            System.out.println("奖励一台iPhone xs max");
        }
        else if(score>=60 && score<=80){
            System.out.println("奖励一个iPad");
        }else{
            System.out.println("奖励个锤子,等着挨打");
        }
    }
}
