import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		
		MemberVO m=new MemberVO("홍길동", 40, "010-0070-1111", "부산시");
		// setter getter method - 필요없는 구조
		
		System.out.println(m.toString());
		
		MemberVO m1=new MemberVO();
		m1.setName("나길동");
		m1.setAge(32);
		m1.setTel("010-2222-3333");
		m1.setAddr("서울");
		
		System.out.print(m1.getName() +"\t");
		System.out.print(m1.getAge() +"\t");
		System.out.print(m1.getTel() +"\t");
		System.out.println(m1.getAddr());
		// 이처럼 toString()을 만들지 않으면 하나씩 set, get 하는 번거로움이 있다.
		System.out.println(m1);   // toString() 이 생략되어 있다.

	}

}

// toString()을 만들어 놓으면 디버깅 하기가 상당히 쉽다.