
public class IntArrayTest {

	
    static void displayarray(int []a ) // display the array
	{
	for(int i=0;i<a.length ;i++)
		{
		System.out.print(a[i]);
		}
		
}
	static void reverseArray (int []a )  // draw arrays in reverse order
	{
		for(int i= a.length -1 ; i >= 0; i--)
		{
			//System.out.print("" + a[4] + a[3] + a[2] + a[1] + a[0]);
			System.out.print(a[i]);
		}
		
	}
	
	static void copyArray (int[] a, int []b)// used to transfer the contents of one array in to another
	{
		b= a;
		for(int i=0;i<a.length ;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("");
		for(int i=0;i<b.length ;i++)			
		System.out.print(b[i]);
		
	}
	
//	static void displayarray(int []a )
//	{
	//	for(int i= a.length; i >=0 ;i--)
	//	{
	//		System.out.print(a[i]);
		//}
		
	//}
	//static void displayarray(int []a )
	//{
	//	int i=a.length;
	//	while( i != 0)
	//	{
	//		System.out.print(a[i]);
	//		i--;
	//	}
		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []array1 ={10,20,30,40,50};   // an array of ints

int[] array2 = array1;   // copies array1 in to array 2
int[] array3 = new int[5];   // createa   new arra yif ints that can hold 5 numbers

displayarray(array1); // Displays Array 1
System.out.println("");


displayarray(array2); // Displays array2
System.out.println("");


displayarray(array3);  // displays array 3
System.out.println("");
copyArray(array1,array3);  // copies array 3 into array 1
System.out.println("");

reverseArray(array2); // drawsa rray 2 in reverse
System.out.println("");

	}

}
