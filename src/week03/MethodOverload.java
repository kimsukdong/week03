package week03;

public class MethodOverload {
	public static void main(String[] args) {
		area(2,3,4);
		area(2,3);
		area(2);			
	}
	public static void area(double a1, double a2, double a3) {
		System.out.println("��ٸ��� ���� \t= \t"+(a1+a2)*a3/2.0);
	}
	public static void area(double a1, double a2) {
		System.out.println("�簢�� ���� \t= \t"+a1*a2);
	}
	public static void area(double a1) {
		System.out.println("�� ���� \t\t= \t"+ 3.14*a1*a1);
	}
}
