package Topics.Operators;

public class Logical_And_Bitwise_Operators {

	public static void main(String[] args) {
		/*1.And Statement  (&&)
		 * 2.Or Statement  (||)
		 */
		int a=10;
		int b=20;
		int c=30;
// In "AND" Operator the given both statements should be correct other wise the resultant will be false
		System.out.println(a<b&& b>c);//false
		System.out.println(a<b && b<c);//true
		
// In "OR" Operators the given one statement should be correct the resultant will be true
		System.out.println(a<b || b>c);//true
		System.out.println(a>b || b>c);
		
	}

}
