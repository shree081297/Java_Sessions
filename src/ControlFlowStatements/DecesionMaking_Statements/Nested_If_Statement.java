package ControlFlowStatements.DecesionMaking_Statements;

public class Nested_If_Statement {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		if(a+b<25) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}if(a+b>28) {
			System.out.println("Passed");
		}else {
			System.out.println("failed");
		}if(a+b<=30) {
			System.out.println("Passed");
		}else {
			System.out.println("failed");
		}
	}

}
