package kr.tpc;
// å(object)->����, ����, ���ǻ�, �������� ...
public class BookVO {
	
	public String title;
	public int price;
	public String company;
	public int page;
	
	// Default �����ڸ޼��� (�����Ǿ�����)

	public BookVO() {
		// �ʱ�ȭ �۾�
		this.title="�ڹ�";
		this.price=14000;
		this.company="�������ۺ���";
		this.page=780;
	}
	
	// ������ �޼����� �ߺ�����(overloading) : �Ű����� ����, Ÿ�� ���� �ٸ��� ��������.
	public BookVO(String title, int price, String company, int page) {
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
}
