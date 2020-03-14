package day16.java2;

/**
 * ToDo
 *  如何自定义异常类？
 *      1.继承于现有的异常结构：RuntimeException、Exception
 *      2、提供全局常量：erialVersionUID
 *      3、提供重载的构造器
 *
 * @author Long
 * @Date 2020/2/26 14:21
 */
public class MyException extends RuntimeException{
    static final long serialVersionUID = -703489719075766939L;

    public MyException(){

    }

    public MyException(String msg){
        super(msg);
    }
}
