package ControlFlowStatements.Looping_Statements;

public class For_each_loop {

	public static void main(String[] args) {
		//array is used to store multiple values in a single variable
		String []arr= {"one","two","three","four"};
		int []num= {1,2,3,4,5};
		for(int num1:num) {
			System.out.println(num1);
		}
		
		for(String str:arr) {
			System.out.println(str);
		}
	}

}
