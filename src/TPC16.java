import kr.tpc.Overload;

public class TPC16 {
	public static void main(String[] args) {

		// 1+1=?, 23.4+56=?, 56.7+78.9=? 
		
		Overload ov=new Overload();
		
		ov.hap(20, 50);  // ov.hap_int_int(20, 50) 호출
		ov.hap(23.4f, 56);  // ov.hap_float_int(23.4f, 56) 호출
		ov.hap(56.7f, 78.9f);  // ov.hap_float_float(56.7f, 78.9f) 호출
		// 이것을 정적 바인딩이라고 한다.
		// 컴파일 시점에 호출될 메서드가 다 결정이 된다.
		
	}

}
