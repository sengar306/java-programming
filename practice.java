abstract class A
{
  abstract void callme(){
    
  };
}
class practice extends A
{
  void callme()
  {
    System.out.println("Calling...");
  }
  public static void main(String[] args)
  {  
    practice b = new practice();
    b.callme();
  }
}