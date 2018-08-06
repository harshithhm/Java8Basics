package com.harshi.jaava8.lamba.in;

public class Lambdaexamples {
public static void main(String[] args) {
	Lambdaexamples lambdaexamples=new Lambdaexamples();
	MathInterface subtraction=(a,b)->a-b;
	MathInterface addition=(a,b)->a+b;
	System.out.println(operate(1, 2, addition));
}
private static int operate(int a,int b,MathInterface mathInterface) {
	return mathInterface.mathOperator(a, b);
	
}
}
