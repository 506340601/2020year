package com.lsl.java1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *  测试FIleInputStream和FileOutputStream的使用
 *      结论：
 *          对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理
 *          对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt)，使用字节流处理
 *
 * @author Long
 * @Date 2020/3/24 1:37
 */
public class FileInputStreamOutputStreamTest {

    //使用字节流FileInputStream处理文本文件可能会出现乱码
    @Test
    public void testFileInputStream(){
        //1、造文件
        FileInputStream fis = null;
        try {
            File file = new File("Hello.txt");

            //2、造流
            fis = new FileInputStream(file);

            //3、读数据
            byte[] buffer =new byte[5];
            int len;
            while ((len = fis.read(buffer)) !=-1){
                String str = new String(buffer,0,len);
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流
            try {
                if (fis!=null){
                    fis.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
       ;
    }
}
