package ex;

public class RandomNumber {
    public static void main(String[] args) {
        int n = rollDie();
        System.out.println("�ֻ����� ��: "+ n);
    }

    // 1�̻� 6������ ������ ������ ��ȯ�ϴ� �޼ҵ�
    public static int rollDie() {
        double x = 6 * Math.random();
        int temp = (int) x;
        return temp + 1;
    }
}