
public class Circle0 {
	int radius;
	String name;
	
	public Circle0() {
		radius = 1; name = "";
	}
	
	public Circle0(int r, String n) {
		radius = r; name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle0 pizza = new Circle0(10, "�ڹ�����");
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle0 donut = new Circle0();
		donut.name = "��������";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}

}
