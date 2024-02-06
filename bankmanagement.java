public class bankmanagement {
    public static void main(String args[])
    {
         bank a1=new bank(10000);//create a bank class object
         a1.depositamount(2000);//function call for deposit money
         a1.withdrawalamount(2000);// fuction call for withrawal money
         a1.display();// for display the balance
    }
}
class bank{
    double amount;
    bank(double amount)    // create constructor 
    {
        this.amount=amount;   
    }
    double withdrawalamount(double withdrawamount)// function for withdraw 
    {
       amount=(amount>withrawamount)?(amount=amount-withdrawamount):(System.out.println("insuffiecient balance")); //ternary operator
       return amount;
       
    }
    double depositamount(double depositamount)  // deposit function
    {   
        amount=amount+depositamount;
        return amount;
    }
    void display()
    {
        System.out.println("AVALIABE AMOUNT :",amount);// display amount function 
    }

}
