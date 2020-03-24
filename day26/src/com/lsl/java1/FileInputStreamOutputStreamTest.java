package com.lsl.java1;

import org.junit.Test;

import java.io.*;

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

    }
  /*
    实现对图片的复制：

    */
    @Test
    public void testFileOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建实例化对象
            File srcFile = new File("订单.png");
            File destFile =new File("订单2.png");

            //2、造流
             fis = new FileInputStream(srcFile);
           fos = new FileOutputStream(destFile);

            //3、
            byte[] buffer = new byte[5];
            int len;
            while ((len =fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

 /*
    指定路径下的文件复制：

    */

    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1、创建实例化对象
            File srcFile = new File(srcPath);
            File destFile =new File(destPath);

            //2、造流
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3、复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while ((len =fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、关闭流
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testCopyFile(){
        long start = System.currentTimeMillis();

//        String srcPath="E:\\io\\01-视频.mp4";
//        String destPath="E:\\io\\02-视频.mp4";
        String srcPath="Hello.txt";
        String destPath="hello3.txt";
        copyFile(srcPath,destPath);
        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为:"+(end -start));//7349
    }

}
