import kr.tpc.BookDTO;

public class TPC10 {
	public static void main(String[] args) {
		
		
		// ***** �� �˾ƾ� �Ѵ�. *****
		// 1. �⺻�ڷ���(UDT) VS ����������ڷ���(UDDT) : DataType�� Ȯ���� ��������.
		// 2. class, object, instance ��ȣ���� : ��ü��������(new ������, ������ �޼���, this)
		// 3. �� ����� Ŭ���� : DTO(VO), DAO, Utility
		
		// int, float, char, boolean -> PDT
		int a;
		a=10;
		
		// å�̶�� �ڷ����� ������ �Ѵ�. -> class
		//BookDTO b;  		// b�� Book�� ��ƾ� ��. 
		//b = new BookDTO();
		
		BookDTO b=new BookDTO(); // ��ü ����
		
		b.title="Java";
		b.price=17000;
		b.company="����";
		b.page=670;

		System.out.print(b.title +"\t");
		System.out.print(b.price +"\t");
		System.out.print(b.company +"\t");
		System.out.println(b.page +"\t");

	}

}
