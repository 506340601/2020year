package day15.java1;

/**
 * ToDo
 *  接口的使用：
 *      1、接口在使用上也体现了多态性
 *      2、接口，实际上就是定义了一种规范
 *      3、开发中，体会面向接口编程
 *
 *
 * @authorLong
 * @Date2020/2/24 23:48
 */
public class USBTest {

    public static void main(String[] args) {
        Computer con = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        con.transferData(flash);
        System.out.println("********************8s");
        //2、创建了接口的非匿名实现类的匿名对象
        con.transferData(new Print());

        System.out.println("********************8s");

        //3、创建了接口的匿名实现类对象的非匿名对象
//        con.transferData(new USB{}.);
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("匿名实现类对象的匿名对象-开启");
            }

            @Override
            public void stop() {
                System.out.println("匿名实现类对象的匿名对象-关闭");
            }
        };

        con.transferData(phone);

        // 4、创建了接口的匿名实现类的匿名对象

        con.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();
        System.out.println("具体传输的细节");
        usb.stop();
    }
}

interface USB{

    //常量：定义长、宽、、最大最小的传输速度


    void start();

    void stop();
}

class  Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}

class Print implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}