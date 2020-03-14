package project.project3.team.domain;

/**
 * ToDo
 *
 * @authorLong
 * @Date2020/2/27 11:57
 */
public class Architect extends Designer {

    private  int stock;


    public Architect() {
        super();
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bouns, int stock) {
        super(id, name, age, salary, equipment, bouns);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
