package mypkg;

public class MyCalc {
	public int sum(int a , int b ) {
	     return a+b;
	}
	public int diff(int a , int b ) {
	     return a-b;
	}
	public int mul(int a , int b ) {
	     return a*b;
	}

	public static void main(String[] args) {
		
		
		MyCalc ob= new MyCalc();
		System.out.println("sum is"+ob.sum(10, 20));
		System.out.println("sum is"+ob.diff(10, 20));
		System.out.println("sum is"+ob.mul(10, 20));

	}

}
