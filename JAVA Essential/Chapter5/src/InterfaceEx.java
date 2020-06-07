
interface PhoneInterface0 { 
	final int TIMEOUT = 10000; 
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
class Calc {
	public int calculate(int x, int y) { return x + y; }
}

class SamsungPhone implements PhoneInterface0 {
	
	@Override
	public void sendCall() { 
		System.out.println("�츮������"); 
	}
	
	@Override
	public void receiveCall() { 
		System.out.println("��ȭ�� �Խ��ϴ�"); 
	}

	public void flash() { 	System.out.println("��ȭ�⿡ ���� �������ϴ�."); }
}
public class InterfaceEx {
	public static void main(String [] args) {
		SamsungPhone phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
		phone.receiveCall();
		phone.flash();
	}
}
