class Array{
	int arr[]= {3,5,6,20,8,};  //intiliaze the array
	int element;
	public void display(){//display method
		try {                               //exception handle
			
		for (int i=0; i<=arr.length;i++){
			 element=arr[i];
			 System.out.println("The element at index " + i + " is " +element);
		}
		
		
	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}
	}
}
public class ArrayIndexException {

	public static void main(String[] args) {
		Array ar=new Array();// creating class for object
		ar.display();
		

	}

}
