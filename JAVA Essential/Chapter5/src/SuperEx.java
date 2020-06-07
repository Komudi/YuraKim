
class Point1 {
	private int x, y; 
	Point1() {
		this.x = this.y = 0;
	}
	Point1(int x, int y) {
		this.x = x; this.y = y;
	}
	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint1 extends Point1 { 
	private String color; 
	ColorPoint1(int x, int y, String color) {
		super(x, y); 
		this.color = color;
	}	
	void showColorPoint() { 
		System.out.print(color);
		showPoint(); 
	}
}

public class SuperEx {
	public static void main(String[] args) {
		ColorPoint1 cp = new ColorPoint1(5, 6, "blue");
		cp.showColorPoint();
	}
}