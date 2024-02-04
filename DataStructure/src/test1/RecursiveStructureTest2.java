package test1;

public class RecursiveStructureTest2 {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		int third = 0;
		
		for (int i = 3; i <= 20; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		System.out.println(third);
		
		System.out.println(fibo(20));
		System.out.println(fibo2(20));

	}
	
	static int fibo(int n) {
		if (n==1 || n==2) {
			return 1;
		}
		int first = 1;
		int second = 1;
		int third = 0;
		for (int i = 1; i <= n-2; i++) {
			third = first + second;
			first = second;
			second = third;
			
		}
		
		return third;
	}
	
	static int fibo2(int n) {
		if(n < 3) {
			return 1;
		}
		
		return fibo2(n-1) + fibo2(n-2);
	} 

}
