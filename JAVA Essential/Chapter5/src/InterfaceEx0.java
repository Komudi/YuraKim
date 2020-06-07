
interface PhoneInterface { 
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

class SmartPhone extends Calc implements PhoneInterface {
	
	@Override
	public void sendCall() { System.out.println("������������~~"); }
	
	@Override
	public void receiveCall() { System.out.println("��ȭ �Ծ��~"); }

	public void schedule() { 	System.out.println("���� �����մϴ�~"); }
}
public class InterfaceEx0 {
	public static void main(String [] args) {
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		System.out.println("3�� 5�� ���ϸ� " + phone.calculate(3,5));
		phone.schedule();
	}
}
