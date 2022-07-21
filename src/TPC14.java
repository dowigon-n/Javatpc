import kr.tpc.MemberVO;

public class TPC14 {
	public static void main(String[] args) {
		
		MemberVO m=new MemberVO();
		
//		m.name="서범진";
//		m.age=1000;
//		m.tel="010-1234-1234";
//		m.addr="부산광역시 동래구";
		
		m.setName("서범진");
		m.setAge(37);
		m.setTel("010-2222-3333");
		m.setAddr("부산");
		
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
