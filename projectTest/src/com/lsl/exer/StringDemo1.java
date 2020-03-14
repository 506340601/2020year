package com.lsl.exer;

import org.junit.Test;

/**
 * 3. 获取一个字符串在另一个字符串中出现的次数。 比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 * @author Long
 * @Date 2020/3/3 13:58
 */
public class StringDemo1 {
  /*
    3. 获取一个字符串在另一个字符串中出现的次数。 比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
*/

  /**
   *    判断获取subStr在mainStr中出现的次数
   *
   *@param {@link int}
   *@return {@link int}
   *@throws
   *@author Long
   *@date 2020/3/3 14:00
   */
  public int getCount(String mainStr,String subStr){


     int mainLength = mainStr.length();
     int subLength = subStr.length();
     int count = 0;
     int index =0;
     if(mainLength >= subLength){

            //方式一：
//         while ((index = mainStr.indexOf(subStr)) != -1){
//             count++;
//             mainStr = mainStr.substring(index+subStr.length());
//         }

         //方式二：对方式一的改进：
         //   int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引
         //  int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出 现处的索引，从指定的索引开始
         while((index =mainStr.indexOf(subStr,index)) != -1){
             count++;
             index +=subLength;
         }
         return count;
     }else {
         return 0;
     }
  }

  @Test
    public void testGetCount(){
      String str = "abkkcadkabkebfkabkskab";
      String str1 = "ab";


      int count = getCount(str,str1);
      System.out.println(count);
  }
}
