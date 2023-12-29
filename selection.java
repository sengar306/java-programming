package selection;

import java.util.*;
class selection{
    public static void main(String args[]) {
        System.out.println("Enter the seconds");
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
       Time t1=new Time(second);
       t1.cal();
       

       
    }
}
class Time {
	int sec,hr,min;
	Time(int second)
	{
		this.sec=second;
		hr=0;
		min=0;
	}
	public void cal(){
	        if (sec<0) {
	        	System.out.println("enter the positive value");
	        }
	        if (sec> 3600) {
	            hr = sec / 3600;
	            sec = sec % 3600;
	        }

	        if (sec > 60) {
	            min = sec / 60;
	            sec = sec% 60;
	        }

	        System.out.println("Hours: " + hr);
	        System.out.println("Minutes: " + min);
	        System.out.println("Seconds: " + sec);
	}
}