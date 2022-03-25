package week03;

public class Fibonachi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		fibo(n);
	}
	
	public static void fibo(int k) {
		int f0 = 0, f1 =1,f2;
		System.out.print("0 1");
		for(int i=3; i<=k; i++) {
			f2 = f0+f1;
			f0= f1;
			f1=f2;
			System.out.print(" "+ f2);
		}
	}
}
