package week03;

public class MethodOverload {
	public static void main(String[] args) {
		area(2,3,4);
		area(2,3);
		area(2);			
	}
	public static void area(double a1, double a2, double a3) {
		System.out.println("사다리꼴 면적 \t= \t"+(a1+a2)*a3/2.0);
	}
	public static void area(double a1, double a2) {
		System.out.println("사각형 면적 \t= \t"+a1*a2);
	}
	public static void area(double a1) {
		System.out.println("원 면적 \t\t= \t"+ 3.14*a1*a1);
	}
}
