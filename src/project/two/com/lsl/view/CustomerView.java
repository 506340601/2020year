package project.two.com.lsl.view;

import project.two.com.lsl.bean.Customer;
import project.two.com.lsl.service.CustomerList;
import project.two.com.lsl.util.CMUtility;

/**
 * ToDo
 * CustomerView为主模块，负责菜单的显示和处理用户操作
 *
 * @authorLong
 * @Date2020/2/19 12:21
 */
public class CustomerView {

    private CustomerList customerList = new CustomerList(10);


    public CustomerView(){
        Customer customer = new Customer("李羽羽",'女',18,"136477753417","506340601@qq.com");
        customerList.addCustomer(customer);
    }
    /**
     * 显示《客户信息管理软件》界面的方法
     *
     * @author Long
     * @date 2020/2/19 13:58
     */
    public void enterMainMenu() {

        boolean loopFlag = true;
        while (loopFlag) {
            System.out.println("*******************客户信息管理软件*******************");
            System.out.println();
            System.out.println("                    1 添加客户");
            System.out.println("                    2 修改客户");
            System.out.println("                    3 删除客户");
            System.out.println("                    4 客户列表");
            System.out.println("                    5 退出");
            System.out.println("                 请选择(1-5): ");

            char key = CMUtility.readMenuSelection();
            System.out.println();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N):");
                   char isExit = CMUtility.readConfirmSelection();
                   if (isExit =='Y'){
                       loopFlag =false;
                   }
            }
        }


    }

    /**
     * 添加客户的操作
     *
     * @author Long
     * @date 2020/2/19 13:58
     */
    private void addNewCustomer() {
//        System.out.println("添加客户的操作");
        System.out.println("-----------------------添加客户----------------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);

        System.out.print("性别：");
        char gender = CMUtility.readChar();

        System.out.print("年龄：");
        int age = CMUtility.readInt();

        System.out.print("电话：");
        String phone =CMUtility.readString(13);

        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        //将上述数据封装到对象当中
        Customer customer = new Customer(name,gender,age,phone,email);
         boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("-----------------------添加完成----------------------------");
        }else {
            System.out.println("--------------------客户目录已满，添加失败----------------------------");
        }


    }

    /**
     * 修改客户的操作
     *
     * @author Long
     * @date 2020/2/19 13:58
     */
    private void modifyCustomer() {

//        System.out.println("修改客户的操作");
        System.out.println("-----------------------修改客户----------------------------");

        Customer cust;
        int number;
        for(;;){
            System.out.print("请选择待修改的客户编号(-1退出)：");
             number = CMUtility.readInt();

            if(number == -1){
                return;
            }
             cust = customerList.getCustomer(number -1);
            if (cust ==null){
                System.out.println("无法找到指定的客户！");
            }else{
                //找到相应编号的客户
                break;
            }
        }
        //修改客户信息
        System.out.println("姓名("+ cust.getName()+"):");
        String name =CMUtility.readString(10,cust.getName());

        System.out.println("性别("+ cust.getGender()+"):");
        char gender = CMUtility.readChar(cust.getGender());

        System.out.println("年龄("+ cust.getAge()+"):");
        int age = CMUtility.readInt(cust.getAge());

        System.out.println("电话("+ cust.getPhone()+"):");
        String phone = CMUtility.readString(13,cust.getPhone());

        System.out.println("邮箱("+ cust.getEmail()+"):");
        String email =CMUtility.readString(30,cust.getEmail());

        Customer newcust = new Customer(name,gender,age,phone,email);

        boolean isReplaced = customerList.replaceCustomer(number-1,newcust);
        if(isReplaced){
            System.out.println("-------------------客户信息修改完成！---------------------");
        }else {
            System.out.println("-------------------修改失败------------------------------");
        }
    }

    /**
     * 删除客户的操作
     *
     * @author Long
     * @date 2020/2/19 13:58
     */
    private void deleteCustomer() {

//        System.out.println("删除客户的操作");
        System.out.println("------------------------删除客户------------------------");
        int number;
        for (;;) {
            System.out.print("请选择待删除的客户编号(-1退出)：");
             number = CMUtility.readInt();

            if(number== -1){
                return;
            }
            Customer customer = customerList.getCustomer(number -1);
            if(customer == null){
                System.out.println("无法找到指定的客户！");
            }else{
                break;
            }
        }
        //找到了指定的客户
        System.out.print("确认是否删除(Y/N):");
        char isDelete = CMUtility.readConfirmSelection();
        if(isDelete == 'Y'){
           boolean deleteSuccess =  customerList.deleteCustomer(number -1);
           if(deleteSuccess){
               System.out.println("----------------------删除成功-----------------------");
           }else{
               System.out.println("----------------------删除失败-----------------------");
           }

        }else {
            return;
        }
    }

    /**
     * 显示客户列表的操作
     *
     * @author Long
     * @date 2020/2/19 13:58
     */
    private void listAllCustomers() {

        System.out.println("-----------------------客户列表----------------------------");
        int total =customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录");
        }
        else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i <custs.length ; i++) {
                Customer cust =custs[i];
                System.out.println((i+1)+"\t\t"+cust.getName()+"\t"+cust.getGender()+"\t\t"+
                        cust.getAge()+"\t"+cust.getPhone()+ "\t"+cust.getEmail());

            }
        }
        System.out.println("");

        System.out.println("-----------------------客户列表完成------------------------");

    }

    public static void main(String[] args) {

        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
