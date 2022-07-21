import kr.tpc.BookDTO;

public class TPC13 {
	public static void main(String[] args) {

		// DTO ���鿡�� 
		// å->class���� BookDTO�� ����-> ��ü-> �ν��Ͻ�
		String title="������";
		int price=25000;
		String company="������";
		int page=890;
		
		// ���������� �����ϴ� ����(��)���� �ٸ� �޼���� �̵��ϱ�
		BookDTO dto;    // dto����(object: ��ü)
		dto=new BookDTO(title, price, company, page);  // dto����(instance: �ν��Ͻ�(����))

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
