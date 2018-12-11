package iterationAndArrays;

public class arrays {

	public static void main(String[] args) {
		int[] myArray;
		myArray = new int[10];
		
		for (int a = 0; a < myArray.length -1; a++) {
			myArray[a] = a;
			//System.out.println(myArray[a] + " ");
			multiply(myArray[a], myArray[a+1], true);
		}
	}
	{
		multiply(25, 0, true);
	}
	public static void multiply(int a, int b, boolean isMultiply) {
		if (isMultiply == true) {
			System.out.println(a * b);
		}
		
		else {
			System.out.println(a + b);
		}
		if (a == 0 & b > 0) {
			System.out.println(b);
		}
		else if(b == 0 & a > 0) {
			System.out.println(a);
		}
		else if((a & b) == 0) {
			System.out.println("Both values are equal to 0");
		}	
		else {
			return;
		}
	}
}

