package day15.exer2;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/25 9:26
 */
interface A {
    int x = 0;
}

class B {
    int x = 1;
}

class C extends B implements A {
    public void pX() {
//        System.out.println(x);//编译不通过，x混淆，父类和接口的变量重名了
        System.out.println(super.x);
        System.out.println(A.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}