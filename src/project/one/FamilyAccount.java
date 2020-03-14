package project.one;

/*
    家庭记账软件：
 */
public class FamilyAccount {
    public static void main(String[] args){

        boolean isFlag = true;

        //用于记录用户的收入和支出详情
        String details = "收支\t账户金额\t\t\t\t收支金额\t\t\t说    明\n";
        //初始金额
        int balance = 10000;
        while(isFlag){

            System.out.println("************************家庭记账软件**********************");
            System.out.println("                        1.收支明细");
            System.out.println("                        2.登记收入");
            System.out.println("                        3.登记支出");
            System.out.println("                        4.退    出\n");
            System.out.println("                        请选择<1 4>");

//            获取用户的选择：1-4
            char seletion =Utility.readMenuSelection();

            switch (seletion){
                case '1':
//                    System.out.println("1.收支明细");
                    System.out.println("************************当前收支明细记录**********************");
//                    System.out.println("收支\t账户金额\t收支金额\t说    明\n");
                    System.out.println(details);
                    System.out.println("-------------------------------------------------------------");
                    break;
                case '2':
//                    System.out.println("2.登记收入");
                    System.out.print("本次收入金额：");
                    int addMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String  addInfo =Utility.readString();
                    System.out.println("----------------------------登记完成--------------------------");

                    //处理余额balance
                    balance += addMoney;

                    //处理details
                    details +="收入\t" + balance + "\t\t\t\t"+ addMoney +"\t\t\t\t"+addInfo + "\n";
                    break;
                case '3':
//                    System.out.println("3.登记支出");
                    System.out.print("本次支出金额：");
                    int minusMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String  minusInfo =Utility.readString();
                    System.out.println("----------------------------登记完成--------------------------");

                    //处理余额balance
                    if(balance > minusMoney){
                        balance -= minusMoney;
                        //处理details
                        details +="支出\t" + balance + "\t\t\t\t"+ minusMoney +"\t\t\t\t"+minusInfo + "\n";
                    }else {
                        System.out.println("支出超出账户额度，余额不足，支付失败");
                    }

                    break;
                case '4':
//                    System.out.println("4.退    出");
                    System.out.println("确认是否退出（Y/N）");
                   char isExit = Utility.readConfirmSelection();
                   if(isExit == 'Y'){
                       isFlag = false;
                   }
//                    break;

            }
        }


    }
}
