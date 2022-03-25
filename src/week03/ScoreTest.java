package week03;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("국어 점수 : "); 		
		int kor = stdIn.nextInt();		
		System.out.print("영어 점수 : "); 		
		int eng = stdIn.nextInt();	
		System.out.print("수학 점수 : "); 		
		int mat = stdIn.nextInt();	
		
		sum(kor,eng,mat); // 총점 계산하는 메소드
		avg(kor,eng,mat); // 평균 계산하는 메소드
	}
	
	public static void sum(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		System.out.println( "총점은 " +s + " 점입니다" );
	}
	public static void avg(int n1, int n2, int n3) {
		int s = n1+n2+n3;
		double d = s/3.0;
		int i =(int)((d+0.05)*10);
		d=i/10.0;
		System.out.println( "평균은 " + d + " 점입니다" );
	}
}
