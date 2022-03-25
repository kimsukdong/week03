package ex;

public class Cylinder {
	public static void main(String[] args) {
        double r = 7;
        double h = 5;
        double v = volume(r, h);
        v = (int)((v+0.05) * 10)/10.0;
        System.out.println("반지름이 "+r+",  높이가 " + h+ "인 원기둥의 부피: " + v);
    }

    // 반지름의 길이와 높이를 입력받아, 원기둥의 부피를 반환하는 메소드
    public static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}