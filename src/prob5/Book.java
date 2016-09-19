package prob5;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public void rent() {
		if (this.stateCode == 0) {
			this.stateCode = 1;
		} else {
			this.stateCode = 0;
		}
	}

	public void print() {
		String answer;
		if(this.stateCode == 0){
			answer = "재고있읍";
		}else{
			answer = "대여중";
		}
		System.out.println("책 제목:" + this.title + 
							", 작가:" + this.author + 
							", 대여 유무:" + answer);
	}
}
