import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
	public static void main(String[] args) {
		// ���踦 �����϶�. PDT VS UDDT ��
		// ����) ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		
		int a;            // �̰� ������ ������ ��
		a=10;      // ���� a�� 10�̶�� ������ �ִ´�.
		
		// �׷� �̷�����? å 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		Book b;    // ���� b�� Book(��ü)�� �ִ´�? No. ��ü�� ���� �� ����. �׷��� b�� Book�� �޸� �������� ����Ű�� �Ѵ�. 
		
		b=new Book();   // ()�� ������ �Լ�
		
		// b(Book)�� �����͸� �ִ´�. 
		b.title="�ڹ�å";
		b.price=15000;
		b.company="�Ѻ��̵��";
		b.page=700;
		
		System.out.print(b.title + "\t");  // ���� tab (���)
		System.out.print(b.price + "\t");
		System.out.print(b.company + "\t");
		System.out.println(b.page);
		
		// ���� b��� ���ؼ� �۾��� �߱⶧���� å �ѱ��̶� �� �� �ִ�.
		
		
		// Book�̶�� �ڷ����� �ʿ��ؼ� ���� ��������� �ڷ����̴�.
		// �̸� ����Ϸ��� class ���Ϸ� ������ �Ѵ�. ��, class�� ���ο� �ڷ����� ����� ����. �𵨸� ����.
		// ����������ڷ���(UDDT) = ��ü�ڷ���
		// ���ڿ� String �� �ڹٿ��� �̹� ���� �����ϴ� ���̶� ���� ���� �ʿ䰡 ����.
		
		// �޸𸮿� �������� �����(��ü) �̰��� ��ü�� �����Ѵٰ� �Ѵ�.
		// �׸��� �� ��ü�� �ν��Ͻ�(Instance)��� �Ѵ�.
		// b�� �ν��Ͻ��� ����Ű�� �ν��Ͻ� ���� �Ǵ� ��ü�� ����Ű�� ��ü ������ �Ѵ�. (��ü�� �����ϰ� �ִ� ����)
		// b�� ��ü��� ���� �ȴ�.
		
		// VO�� DTO�� �����.(class)
		PersonVO p;     // p��� ������ PersonVO�� ����Ų��(��ü�� ��´�)
		p=new PersonVO();    // ��ü ����
		
		// class�� ����� ����ϴ� ���� �⺻���� ���
		p.name="������";
		p.age=37;
		p.weight=74.5f;
		p.height=180.0f;
		
		System.out.print(p.name + "\t");
		System.out.print(p.age + "\t");
		System.out.print(p.weight + "\t");
		System.out.println(p.height + "\t");
		
		
		// p�� ��ü�� name, age, w, h �� �޸𸮿� ����Ǿ� ������ �迭�� �ƴϴ�. ���ο� ������ ����.
		// �迭�� ��������(�޸�) �����Ͱ� ������ �����͸� �־�� �Ѵ�. �迭�δ� ��ü�� ǥ���ϱⰡ ��ƴ�.

	}

}