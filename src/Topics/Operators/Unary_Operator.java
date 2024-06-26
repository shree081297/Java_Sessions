package Topics.Operators;

public class Unary_Operator {

	public static void main(String[]args) {
		//Incrementing Operator
		System.out.println("Incrementing the values");

		int a=10;
		System.out.println(a);//10
System.out.println(a++);//The value will asigned and the assigned value will be printed first
		System.out.println(a);//incremented to +1 =11
		System.out.println(a++);//11
		System.out.println(a);//12
		
		//Decrementing Operator
		System.out.println("Decrementing the values");
		int b=20;
		System.out.println(b);//20
		System.out.println(b--);//20
		System.out.println(b);//19
	}
	
}
