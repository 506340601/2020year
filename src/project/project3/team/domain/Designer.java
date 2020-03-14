package project.project3.team.domain;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/27 11:55
 */
public class Designer extends Programmer {


    private double bouns;

    public Designer() {
        super();
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bouns) {
        super(id, name, age, salary, equipment);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }




}
