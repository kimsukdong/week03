package week03;

public class Summation {

    public static void main(String[] args) {
        int s = sum(1,10);
        System.out.println("1���� 10������ ��: "+ s);
    }

    // 1���� 10������ ���� ����
    public static int sum(int start, int end) {
    	int s=0;
        for(int i = start; i<=end; i++) 
        	s+=i;     
        return s;
    }

}
