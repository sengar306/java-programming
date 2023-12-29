  Class add{
        int num1,num2,num3;
        add(int num1, int num2,int num3)
        {
            this.num1=num1;
            this.num2=num2;
            this.num3=num3;

        }
       public  int addition(int num1,int num2,int num3)
        {
             num3=num1+num2+num3;
             return num3;
        }
    }
Class obj{
  
    public static void main(String args[])`
    {
        add a1=new add(1,2,3);
        int sum= a1.addition();
        System.out.println(sum);
    }

}