import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		
		
		// ***** 꼭 알아야 한다. *****
		// 1. 기본자료형(UDT) VS 사용자정의자료형(UDDT) : DataType을 확실히 이해하자.
		// 2. class, object, instance 상호관계 : 객체생성과정(new 연산자, 생성자 메서드, this)
		// 3. 잘 설계된 클래스 : DTO(VO), DAO, Utility
		
		// int, float, char, boolean -> PDT
		int a;
		a=10;
		
		// 책이라는 자료형을 만들어야 한다. -> class
		//BookDTO b;  		// b는 Book을 담아야 됨. 
		//b = new BookDTO();
		
		BookDTO b=new BookDTO(); // 객체 생성
		
		b.title="Java";
		b.price=17000;
		b.company="영진";
		b.page=670;

		System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.println(b.page +"\t");

	}

}
