
public class Book0 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book0() {
		this("", "");
		System.out.println("������ ȣ���");
	}

	public Book0(String title) {
		this(title, "���ڹ̻�");
	}
	
	public Book0(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		Book0 javaBook = new Book0("�����", "�������丮");
		Book0 bible = new Book0("������");
		Book0 emptyBook = new Book0();
		
		bible.show();
	}
}
