package week03;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("���� ���� : "); 		
		int kor = stdIn.nextInt();		
		System.out.print("���� ���� : "); 		
		int eng = stdIn.nextInt();	
		System.out.print("���� ���� : "); 		
		int mat = stdIn.nextInt();	
		
		sum(kor,eng,mat); // ���� ����ϴ� �޼ҵ�
		avg(kor,eng,mat); // ��� ����ϴ� �޼ҵ�
	}
	
	public static void sum(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		System.out.println( "������ " +s + " ���Դϴ�" );
	}
	public static void avg(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		double d = s/3.0;
		int i =(int)((d+0.05)*10);
		d=i/10.0;
		System.out.println( "����� " + d + " ���Դϴ�" );
	}
}
