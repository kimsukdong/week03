package ex;

public class Cylinder {
	public static void main(String[] args) {
        double r = 7;
        double h = 5;
        double v = volume(r, h);
        v = (int)((v+0.05) * 10)/10.0;
        System.out.println("�������� "+r+",  ���̰� " + h+ "�� ������� ����: " + v);
    }

    // �������� ���̿� ���̸� �Է¹޾�, ������� ���Ǹ� ��ȯ�ϴ� �޼ҵ�
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}