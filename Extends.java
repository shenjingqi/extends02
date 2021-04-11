package extends01;
//分析以下程序有什么问题？代码臃肿，代码没有得到重复利用
public class Extends {
    public static void main(String[] args) {
        //创建普通用户
        Account act= new Account();
        act.setActon("111111");
        act.setBalance(10000);
        System.out.println(act.getActon()+"余额"+act.getBalance());
    //创建信用卡用户
        CreitAccount ca=new CreitAccount();
        ca.setActon("222222");
        ca.setBalance(-10000);
        ca.setCredit(0.99);
        System.out.println(ca.getActon()+"余额"+ca.getBalance()+"信誉度"+ca.getCredit());




    }
}
class Account {
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
    public Account(){
    }
    public  Account(String acton, double balance){
        this.acton=acton;
        this.balance=balance;
    }
}
//其他类型的账户：信用卡账户
class CreitAccount{
  private    String acton;
    private   double balance;
    private  double credit;
    public CreitAccount(){

    }
//setget方法
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

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}