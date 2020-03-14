package day12.exer;

/**
 * ToDo
 *  定义类Kids继承ManKind，并包括 成员变量int yearsOld； 方法printAge()打印yearsOld的值
 * @authorLong
 * @Date2020/2/20 14:28
 */
public class Kids extends ManKind {
     private int yearsOld;

    public Kids() {

    }
    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public  void printAge(){
        System.out.println("I am "+yearsOld+"years old.");
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
