import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m=new MemberVO("ȫ�浿", 40, "010-0070-1111", "�λ��");
		// setter getter method - �ʿ���� ����
		
		System.out.println(m.toString());
		
		MemberVO m1=new MemberVO();
		m1.setName("���浿");
		m1.setAge(32);
		m1.setTel("010-2222-3333");
		m1.setAddr("����");
		
		System.out.print(m1.getName() +"\t");
		System.out.print(m1.getAge() +"\t");
		System.out.print(m1.getTel() +"\t");
		System.out.println(m1.getAddr());
		// ��ó�� toString()�� ������ ������ �ϳ��� set, get �ϴ� ���ŷο��� �ִ�.
		System.out.println(m1);   // toString() �� �����Ǿ� �ִ�.

	}

}

// toString()�� ����� ������ ����� �ϱⰡ ����� ����.