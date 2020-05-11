
public class Book0 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book0() {
		this("", "");
		System.out.println("생성자 호출됨");
	}

	public Book0(String title) {
		this(title, "작자미상");
	}
	
	public Book0(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String [] args) {
		Book0 javaBook = new Book0("어린왕자", "생텍쥐페리");
		Book0 bible = new Book0("춘향전");
		Book0 emptyBook = new Book0();
		
		bible.show();
	}
}
