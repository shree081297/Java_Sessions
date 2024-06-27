package ControlFlowStatements.Looping_Statements;

public class Do_While_Loop {

	public static void main(String[] args) {
		/*Do{
		 * statement
		 * logic
		 * }while(condition);
		 */
		int a=0;
		do {
			System.out.println("The values of a is"+" "+ a);
			a=a+1;
		}while(a<10);
	}

}
