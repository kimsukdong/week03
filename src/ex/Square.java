package ex;

public class Square {
	public static void main(String[] args) {
        int n = 4;
        int s = square(n);
        System.out.println("�� ���� ���̰�" + n + "�� ���簢���� ����: "+ s);
    }

    // ������ �Է¹޾� �� ������ ��ȯ�ϴ� �޼ҵ�
    public static int square(int length) {
        return length * length;
    }
}