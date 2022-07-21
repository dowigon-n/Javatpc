package kr.tpc;

public class BookDTO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	
	// default 생성자 메서드(클래스를 만들면 기본적으로 생략되어 있음)
	
	public BookDTO() {
		//super();  : 입력하지 않아도 기본적으로 존재하는 것으로 알면 된다. => 객체를 생성하는 작업이다. (기계어코드)
	}

	public BookDTO(String title, int price, String company, int page) {		
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
