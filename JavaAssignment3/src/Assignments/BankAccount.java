package Assignments;

public class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    void deposit(float amt){
        if (amt<0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("Negative amount not valid!!!");
            }
        }else {
            balance = balance + amt;
        }

    }

    void withdraw(int amt){
        if ((balance < 1000) && amt >0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("Insufficient balance!!!");
            }
        }
        else {
            if(amt + 1000 > balance ){
                try {
                    throw new ArithmeticException();
                }catch (ArithmeticException e){
                    System.out.println("Amount above balance!!!");
                }
            }else {
                balance = balance - amt;
            }
        }
        if (amt < 0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("Amount entered Invalid!!!");
            }
        }
    }

    public BankAccount(int accNo, String custName, String accType, float balance) {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (this.balance < 0){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("balance can't be negative!!");
            }
        }else {
            this.balance = this.balance + balance;
        }
    }

    void getbalance(){
        if(this.balance < 1000){
            try {
                throw new ArithmeticException();
            }catch (ArithmeticException e){
                System.out.println("LowBalance!!!");
            }
        }else {
            System.out.println("balance : "+balance);
        }

    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount(101,"aman","savings",100000);
        obj.getbalance();
        obj.withdraw(50);
        obj.getbalance();
    }
}
