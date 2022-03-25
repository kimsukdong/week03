package week03;

import java.util.Scanner;

public class ChangeArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);		
		System.out.print("아파트 면적을 입력하시오(단위는 m2) : "); 		
		int data = stdIn.nextInt();			
		compute(data); // 제곱미터를 평수로 계산하는 메소드
	}
	
	public static void compute(int n) {
		double d = n/3.3058;
		int i = (int) d;
		int j = (int) (d+0.5);
		System.out.println( n + "m2의 면적은 " +j + "평 입니다" );
	}
}
