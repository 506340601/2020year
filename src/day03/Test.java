package day03;

public class Test {
    public static void main(String[] args){
        boolean  x =true;
        boolean y =false;
        short z =42;
        if((z++==42)&&(y=true))z++;//=为赋值符号
        System.out.println("第一次if完后Z的值为："+z);
        if((x==false)||(++z==45))z++;
        System.out.println("第二次if完后Z的值为："+z);

    }
}
