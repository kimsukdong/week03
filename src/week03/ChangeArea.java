package week03;

import java.util.Scanner;

public class ChangeArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("����Ʈ ������ �Է��Ͻÿ�(������ m2) : "); 		
		int data = stdIn.nextInt();			
		compute(data); // �������͸� ����� ����ϴ� �޼ҵ�
	}
	
	public static void compute(int n) {
		double d = n/3.3058;
		int i = (int) d;
		int j = (int) (d+0.5);
		System.out.println( n + "m2�� ������ " +j + "�� �Դϴ�" );
	}
}
