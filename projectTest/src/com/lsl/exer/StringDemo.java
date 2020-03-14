package com.lsl.exer;

import org.junit.Test;

/**
 * @author Long
 * @Date 2020/3/3 13:03
 */
public class StringDemo {
/*

    将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反 转为”abfedcg”
    方式一：转化为char[]
*/

    public String reverse(String str,int startIndex,int endIndex){
       if(str != null && str.length() !=0){
           char[] arr =str.toCharArray();
           for (int x = startIndex,y = endIndex; x < y ; x++,y--) {
               char temp = arr[x];
               arr[x] = arr[y];
               arr[y] = temp;
           }

           return new String(arr);
       }
       return null;
    }

//    方式一：转化为char[] 使用String的拼接方法：将字符串分为三部分。
public String reverse1(String str,int startIndex,int endIndex){
        if (str !=null){
            //第1部分
            String reversestart = str.substring(0,startIndex);
            //第2部分
            for (int i = endIndex; i >= startIndex ; i--) {
                reversestart += str.charAt(i);
            }
            //第3部分
            reversestart += str.substring(endIndex+1);
            return reversestart;
        }
        return null;
}
        //方式三：使用StringBuffer/StringBuilder替换String
        public String reverse2(String str,int startIndex,int endIndex){

          if(str != null){
              StringBuilder builder = new StringBuilder(str.length());

              //第1部分：
              builder.append(str.substring(0,startIndex));
              //第2部分：
              for (int i = endIndex; i >=startIndex ; i--) {
                  builder.append(str.charAt(i));
              }
              //第3部分：
              builder.append(str.substring(endIndex+1));

//            return new String(builder);
              return builder.toString();

          }
          return null;
        }

    @Test
    public void test(){
        String str ="abcdefg";
        String reverse = reverse1(str,2,5);
        System.out.println(reverse);
    }


}
