package com.lsl.exer;

/**
 * @author Long
 * @Date 2020/3/14 10:40
 */

public class OOCTest {
    public static void main(String[] args) {

//       String str= generateSquare(4);
//        System.out.println(str);

        String str1 =pattern(4);
        System.out.println(str1);
    }


    public static String pattern ( int n) {
        if(n<1) return "";
        String output="";
        for(int i=1; i<=n; i++)
        {  for(int j=n; j>=i; j--)
            output+=j;
            output+="\n";
        }
        return output;
    }


    public static final String generateSquare(int n) {
        String cube = "";
        int i = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                cube += "+";
            }
            i++;
            if (i < n){
                cube += "\n";
            }
        }
        return cube;
    }


}
