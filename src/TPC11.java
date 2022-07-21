import kr.tpc.BookVO;

public class TPC11 {
	public static void main(String[] args) {
		
		// 책 1권을 저장하기 위한 [객체를 생성]하시오.
		
		BookVO b = new BookVO();    // b가 책 한권임(변수가 객체)
		b.title="Python";
		b.price=16000;
		b.company="에이콘";
		b.page=700;
		
		System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.println(b.page);
		
		BookVO b1 = new BookVO();    // b가 책 한권임(변수가 객체)
		b1.title="오라클";
		b1.price=25000;
		b1.company="이지스퍼블리싱";
		b1.page=560;
		
		System.out.print(b1.title +"\t");
		System.out.print(b1.price +"\t");
		System.out.print(b1.company +"\t");
		System.out.println(b1.page);
		
		// 책이라는 자료형이 기존에 없기 때문에 클래스로 설계를 해서 사용한다. BookVO(클래스 자료형) a = new BookVO();

	}

}
