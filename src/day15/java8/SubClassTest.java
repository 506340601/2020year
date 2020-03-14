package day15.java8;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/25 10:28
 */
public class SubClassTest {

    public static void main(String[] args) {
        SubClass s = new SubClass();

//        s.method1();
          //知识点一：接口中定义的静态方法，只能通过接口来调用。
        CompareA.method1();

        //知识点二：通过实现类的对象，可以调用接口中默认方法
        //如果实现类重写了接口的方法，调用时，仍然调用重写以后的方法
        s.method2();
        System.out.println("**********");
        //知识点三：如果子类(或实现类)继承的父类和实现的接口中声明了同名同参数的方法
        //那么子类在没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法 ----》 类优先原则

        //知识点四：如果实现类实现了多个接口而这个多个1接口定义了同名同参数的默认方法，
        //那么在实现类没有重写的情况下，报错。----接口冲突。
        //这就必须在实现类中重写此方法
        s.method3();
    }
}

class SubClass extends SuperClass implements CompareA,CompareB{

    public  void method2(){
        System.out.println("默认方法--重写---CompareA：上海");
    }

    @Override
    public void method3() {
        System.out.println("冲突重写 Sub：深圳");
    }

    //如何在子类（或实现类）的方法调用父类、实现类的、接口中被重写的方法
    public void myMethod(){
        method3();//自定义的重写的方法
        super.method3();//调用的是父类中声明的

        //调用接口中的默认方法
        CompareA.super.method3();
        CompareB.super.method3();
    }
}
