class increment{
    public static void main(String args[])
    {
         int x=5;
         int z=10;
        int y= ++x - z++;
        int m=++x + --y + z--;
        int r=++z;
        System.out.println(y);
        System.out.println(r);
    }
}