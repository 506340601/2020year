package com.lsl.java1;

import org.junit.Test;

import java.io.*;

/**
 *      处理流之一：缓冲流的使用：
 *      1、缓冲流：
 *          BufferedInputStream
 *          BufferedOutputStream
 *          BufferedReader
 *          BufferedWriter
 *
 *      2、作用：提供流的读取、写入速度
 *      提高读写速度的原因：内部提供了一个缓冲区
 * @author Long
 * @Date 2020/3/24 15:09
 */
public class BufferedTest {

    @Test
    public void BufferedStreamTest(){

        //造缓冲流
        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
        try {
            //1、造文件
            File srcFile = new File("订单.png");
            File destFile = new File("订单11.png");

            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //造缓冲流
             bis = new BufferedInputStream(fis);
             bos = new BufferedOutputStream(fos);

            //3、复制的细节：读取。写入
            byte[] buffer = new byte[10];
            int len;
            while ((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、资源的关闭
            //要求：先关闭外层的流，在关闭内层的流
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            //说明：关闭外层流的时候，内层流也会自动关闭。关于内层流的关闭可以省略
//            fos.close();
//            f1s.close();
        }
    }

    //实现文件复制的方法
    public void copyFileWithBuffered(String srcPath,String destPath){
        //造缓冲流
        BufferedInputStream bis =null;
        BufferedOutputStream bos = null;
        try {
            //1、造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2.造流
            //2.1 造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3、复制的细节：读取。写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer))!= -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4、资源的关闭
            //要求：先关闭外层的流，在关闭内层的流
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


            //说明：关闭外层流的时候，内层流也会自动关闭。关于内层流的关闭可以省略
//            fos.close();
//            f1s.close();
        }

    }

    @Test
    public void testCopyFileWithBuffered(){
        long start = System.currentTimeMillis();

        String srcPath="E:\\io\\01-视频.mp4";
        String destPath="E:\\io\\03-视频.mp4";
//        String srcPath="Hello.txt";
//        String destPath="hello3.txt";
        copyFileWithBuffered(srcPath,destPath);
        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为:"+(end -start));//7349   //5976   //1723
    }

}
