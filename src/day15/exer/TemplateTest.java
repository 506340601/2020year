package day15.exer;

/**
 * ToDo
 *  设计模式：模板方法
 * @authorLong
 * @Date2020/2/24 16:15
 */
public class TemplateTest {
    public static void main(String[] args) {

        SubTemplate st = new SubTemplate();
        st.spendTime();

    }
}

abstract class Tempate {
    public void spendTime() {
            long start = System.currentTimeMillis();

            this.code();//不确定部分、易变部分
            long end = System.currentTimeMillis();
        System.out.println("花费的时间为："+(end -start));
    }

    public  abstract void code();
}
class SubTemplate extends  Tempate{

    @Override
    public void code() {

        //1000以内的质数

        for (int i = 2; i < 1000 ; i++) {
            boolean isFlag = true;
            for (int j = 2; j <Math.sqrt(i) ; j++) {

                if(i % j ==0){
                    isFlag =false;
                    break;
                }

            }
            if (isFlag){
                System.out.println(i);
            }

        }
    }
}