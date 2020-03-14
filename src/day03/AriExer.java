package day03;

public class AriExer {
    public static  void main(String[] args){
        int x = 153;
        int bai =x /100;
        int shi = x % 100 /10;
        int ge = x % 10;

        System.out.println("百位数为："+bai);
        System.out.println("十位数为："+shi);
        System.out.println("个位数为："+ge);
        int i =3;
        i *= 0.1;
        System.out.println(i);

        int n = 10;
        n +=(n++)+(++n);//n =n+(n++)+(++n) n =10 +10 +12=32
        System.out.println("n"+n);

    }
}
