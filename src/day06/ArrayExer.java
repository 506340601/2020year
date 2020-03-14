package day06;

import java.util.Scanner;

/*
    一维数组练习题二：成绩找最高分
    从键盘读入学生成绩，找出最高分， 并输出学生成绩等级。
     成绩>=最高分-10    等级为’A’
     成绩>=最高分-20   等级为’B’
     成绩>=最高分-30    等级为’C’
     其余 等级为’D’
    提示：先读入学生人数，根据人数创建int数组， 存放学生成绩。

 */
public class ArrayExer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int num =sc.nextInt();

        System.out.println("请输入"+ num+"个成绩");
        int[] scores = new int[num];

        for (int i =0;i< num;i++){
            scores[i] =sc.nextInt();
        }

        /*
            此处可优化，将这个变量放在赋值那里，直接赋值比较
         */
        //定义一个临时变量获取最大值
        int temp = 0;
        for(int i =0; i<scores.length;i++){
            if(scores[i]>temp){
                temp = scores[i];
            }
        }
        System.out.println("最高分是："+ temp);
        //找差值
        char level;
        for(int i =0; i < scores.length; i++){
            if(temp - scores[i] <= 10){
                level ='A';
            }else if(temp - scores[i] <= 20){
                level ='B';
            }else if(temp - scores[i] <= 30){
                level ='C';
            }else {
                level ='D';
            }
            System.out.println("student "+ i +"score is "+",grade is "+level);
        }

    }
}
