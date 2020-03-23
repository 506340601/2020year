package com.lsl.java;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *  File类的使用：
 *      1、File类的对象代表一个文件或者一个文件目录（俗称文件夹）
 *      2、File类声明在java.io包下的
 *      3、File类中涉及到关于文件或目录的创建、删除、重命名、修改时间、文件大小等方法，
 *          并未涉及到写入或读取文件的内容的操作。如果需要写入文件内容，必须使用IO流来完成
 *      4、后续File类的对象常会作为参数传递到流的构造器中，指明读取或者写入的“终点”
 * @author Long
 * @Date 2020/3/22 23:03
 */
public class FileTest {
    /*
        1、如何创建File类的实例
            File(String filePath)
            File(String parentPath,String childPath);
            File(File parentFile,String childPath);

        2、
        相对路径：相较于某个路径下，指明的路径。
        绝对路径：包含盘符在内的文件或文件目录的路径

        3、路径分隔符
             Windows：\\
             Unix:/


     */

    @Test
    public void test1(){

        //构造器1：
        File file1 =new File("hello.txt");//相当于当前的module

        File file2 = new File("E:\\idea\\code\\2020year\\day26\\he.txt");//绝对路径

        System.out.println(file1);
        System.out.println(file2);

        //构造器2：
        File file3 =new File("E:\\idea\\code","day26");
        System.out.println(file3);

        //构造器3：
        File file4 = new File(file3,"he.txt");
        System.out.println(file4);
    }

    /*
         public String getAbsolutePath()：获取绝对路径
         public String getPath() ：获取路径
         public String getName() ：获取名称
         public String getParent()：获取上层文件目录路径。若无，返回null
         public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
         public long lastModified() ：获取最后一次的修改时间，毫秒值

        如下的两个方法适用于文件目录：

         public String[] list() ：获取指定目录下的所有文件或者文件目录的名称数组
         public File[] listFiles() ：获取指定目录下的所有文件或者文件目录的File数组
     */

    @Test
    public void test2(){

        File file1 =new File("Hello.txt");
        File file2 =new File("D\\io\\hi.txt");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println("*******************************");

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

    }

    @Test
    public void test3(){

        File file1 =new File("E:\\idea\\code\\2020year");

        String[] list = file1.list();
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println("********************");
        File[] files =file1.listFiles();
        for (File f:files) {
            System.out.println(f);
        }
    }

    // public boolean renameTo(File dest):把文件重命名为指定的文件路径
    @Test
    public void test4(){
        File file1 = new File("Hello.txt");
        File file2 = new File("E:\\io\\hi.txt");

        boolean renameTo =file2.renameTo(file1);
        System.out.println(renameTo);
    }

    /*
     File类的判断功能
          public boolean isDirectory()：判断是否是文件目录
          public boolean isFile() ：判断是否是文件
          public boolean exists() ：判断是否存在
          public boolean canRead() ：判断是否可读
          public boolean canWrite() ：判断是否可写
          public boolean isHidden() ：判断是否隐藏
     */
    @Test
    public void test5(){

        File file1 = new File("Hello.txt");
//        file1 =new File("Hello1.txt");

        System.out.println("是否是文件夹"+file1.isDirectory());
        System.out.println("是否是文件"+file1.isFile());
        System.out.println("是否存在"+file1.exists());
        System.out.println("是否能读"+file1.canRead());
        System.out.println("是否能写"+file1.canWrite());
        System.out.println("是否隐藏"+file1.isHidden());

        System.out.println("*****************************");
        File file2 =new File("E:\\io");
        file2 =new File("E:\\io1");

        System.out.println("是否是文件夹"+file2.isDirectory());
        System.out.println("是否是文件"+file2.isFile());
        System.out.println("是否存在"+file2.exists());
        System.out.println("是否能读"+file2.canRead());
        System.out.println("是否能写"+file2.canWrite());
        System.out.println("是否隐藏"+file2.isHidden());

    }

    /*
         File类的创建功能
          public boolean createNewFile() ：创建文件。若文件存在，则不创建，返回false
          public boolean mkdir() ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
          public boolean mkdirs() ：创建文件目录。如果上层文件目录不存在，一并创建
        注意事项：如果你创建文件或者文件目录没有写盘符路径，那么，默认在项目 路径下。

     */
    @Test
    public void test6() throws IOException {
        //文件的创建
        File file1 = new File("hi.txt");
        if (!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else {//文件存在
            file1.delete();
            System.out.println("删除成功!");
        }

    }
    @Test
    public void test7(){

        //文件目录的创建
        File file1 =new File("E:\\io\\io1\\io3");

        boolean mkdir = file1.mkdir();
        if(mkdir){
            System.out.println("创建成功mkdir");

        }
        File file2 =new File("E:\\io\\io1\\io4");
        boolean mkdir2 = file2.mkdirs();
        if(mkdir2){
            System.out.println("创建成功mkdirs");
        }

        //要想删除成功，io4文件目录下不能有子目录或文件
        File file3 =new File("E:\\io\\io1\\io4");
        System.out.println(file3.delete());
    }
}
