package week03;

public class Factorial {

    public static void main(String[] args) {
        int s = fac(10);
        System.out.println("10 ! = " + s);
    }

    // 1���� 10������ ���� ����
    public static int fac(int end) {
    	int s=1;
        for(int i = 1; i<=end; i++) 
        	s*=i;     
        return s;
    }
}
