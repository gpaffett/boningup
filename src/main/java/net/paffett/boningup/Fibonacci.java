package net.paffett.boningup;

public class Fibonacci {
	
	
	public void printFibonacci(int last) {
		int start = 0;
		doNext(0, ++start, last);
		System.out.println();
		
	}
	
	private void doNext(int i, int j, int last) {
		if ( i <= last) {
			System.out.print(i + " ");
			doNext(j, i + j, last);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		fibonacci.printFibonacci(1000);
	}

}