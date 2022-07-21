import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {

		// DTO 측면에서 
		// 책->class명을 BookDTO로 설계-> 객체-> 인스턴스
		String title="스프링";
		int price=25000;
		String company="제이펍";
		int page=890;
		
		// 개별적으로 존재하는 변수(값)들을 다른 메서드로 이동하기
		BookDTO dto;    // dto상태(object: 객체)
		dto=new BookDTO(title, price, company, page);  // dto상태(instance: 인스턴스(변수))

		//System.out.println(title);
		
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO dto) {
		System.out.print(dto.title +"\t");
		System.out.print(dto.price +"\t");
		System.out.print(dto.company +"\t");
		System.out.println(dto.page);
	}

}
