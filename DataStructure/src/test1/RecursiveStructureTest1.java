package test1;

public class RecursiveStructureTest1 {

	public static void main(String[] args) {
		RecursiveStructureTest1 t = new RecursiveStructureTest1();
		System.out.println(t.recursive(10));

	}
	
	public int recursive(int n) {
		if( n == 1 ) {
			
			return 1;
		}
		else {
			
			return recursive(n-1) + 3;
		}
	}

}
