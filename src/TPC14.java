import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
		MemberVO m=new MemberVO();
		
//		m.name="������";
//		m.age=1000;
//		m.tel="010-1234-1234";
//		m.addr="�λ걤���� ������";
		
		m.setName("������");
		m.setAge(37);
		m.setTel("010-2222-3333");
		m.setAddr("�λ�");
		
		System.out.print(m.getName() +"\t");
		System.out.print(m.getAge() +"\t");
		System.out.print(m.getTel() +"\t");
		System.out.println(m.getAddr());
		

	}
	
	
//	public static void call(MemberVO m1) {
//		System.out.print(m1.name +"\t");
//		System.out.print(m1.age +"\t");
//		System.out.print(m1.tel +"\t");
//		System.out.println(m1.addr);
//	}

}
