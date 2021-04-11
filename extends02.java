package extends01;

public class extends02 {
    public static void main(String[] args) {
        //创建普通用户
        Account1 act= new Account1();
        act.setActon("111111");
        act.setBalance(10000);
        System.out.println(act.getActon()+"余额"+act.getBalance());
        //创建信用卡用户
        CreitAccount1 ca=new CreitAccount1();
        ca.setActon("222222");
        ca.setBalance(-10000);
        ca.setCredit(0.99);
        System.out.println(ca.getActon()+"余额"+ca.getBalance()+"信誉度"+ca.getCredit());



    }
}
class Account1 {//父类
    //属性
    private String acton;
    private  double balance;
    //构造方法
    public String getActon() {
        return acton;
    }

    public void setActon(String acton) {
        this.acton = acton;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //构造方法
    public Account1(){
    }
    public  Account1(String acton, double balance){
        this.acton=acton;
        this.balance=balance;
    }
}
//其他类型的账户：信用卡账户
class CreitAccount1 extends Account1{//子类

    private  double credit;
    public CreitAccount1(){

    }
    //setget方法


    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}

