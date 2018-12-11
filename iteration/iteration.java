package iteration;

public class iteration {

	public static void main(String[] args) {
		int count = 0;
		addition (9, 7, false, count);
		

	}
	public static void addition (int num1, int num2, boolean bool, int count) {
	
	for (count = 0; count < 10; count ++)
		
		if(bool == true)
		{
			System.out.println(num1 + num2);
		}
		else
		{
			System.out.println(num1 * num2);
		}
	
		if (num1 == 0)
		{
			System.out.println(num2);
		}
		else
		{
			System.out.println(num1);
		}
	}
}