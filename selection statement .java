import java.util.*;
public class selection statement  {
    public static void main(String args[])
    {   System.out.println("enter the second");
        Scanner sc =new Scanner(System.in());
        int second=sc.nextInt();
        convert cc=new convert(second);
        cc.min();
    }
}
class convert{
    int se;
    convert(second)
    {
        se=this.second;
    }
    int min(int se)
    {
        if(second>3600)
        {
            int hr=se/3600;
            int mine=se%3600;
            mine=mine/60;
            int sss=mine%60;
            sss=sss/60;
            System.out.println(hr+"hour"+mine+"min"+ sss+"second");
        }
        else if(second<3600)
        {
            int mm=se/60;
            int ss=se%60;
            System.out.println("0 hours"+ mm+ "min" + ss +"ss");
        }
        else{
        
            
        }
    }
}
