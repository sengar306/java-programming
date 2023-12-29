import java.util.Scanner;
public class selectio{
    public static void main(String args[])
    {   System.out.println("enter the second");
        Scanner sc =new Scanner(System.in);
        int second=sc.nextInt();
        Timeconvert t1=new Timeconvert(second);
        t1.validate();
    }
}
class Timeconvert{
    int sec,hour,min;
     public Timeconvert(int second)
    {
      this.sec=second;
      hour=0;
      min=0;
    }
    void validate()
    {
        if(sec>=3600)
        {//hour conversion
             hour=sec/3600;37
             sec =sec%3600;
        }
             if(sec>=60)
            { //min conversion
                min=sec/60;
               sec=sec%60;
            }
       System.out.println(hour + "hour" + min + "minutes" + sec + "seconds");
        }
       
}
