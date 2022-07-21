package kr.tpc;
// 책(object)->제목, 가격, 출판사, 페이지수 ...
public class BookVO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	
	// Default 생성자메서드 (생략되어있음)

	public BookVO() {
		// 초기화 작업
		this.title="자바";
		this.price=14000;
		this.company="이지스퍼블리싱";
		this.page=780;
	}
	
	// 생성자 메서드의 중복정의(overloading) : 매개변수 개수, 타입 등이 다르면 문제없다.
	public BookVO(String title, int price, String company, int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
