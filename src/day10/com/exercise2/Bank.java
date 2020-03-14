package day10.com.exercise2;

public class Bank {

    private Customer[] customers;//存放多个用户的数组
    private int numberofCustomers;//记录客户个数

    public  Bank(){
        customers = new Customer[10];
    }

    //添加客户
    public void addCustomer(String f,String l){

        Customer cust = new Customer(f,l);
        customers[numberofCustomers++] = cust;
    }

    //获取客户个数
    public int getNumberOfCustomers(){

        return numberofCustomers;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index){

//        return customers[index];//可能导致异常
        if(index >= 0 && index < numberofCustomers){
            return customers[index];
        }
        return null;
    }
}
