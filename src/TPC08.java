public class TPC08 {
	public static void main(String[] args) {
		
		int a=30;
		int b=50;
		int v=add(a, b); // static method call (static method 인 경우 이탤릭체로 바뀜)
		
		System.out.println(v); 
		

	}
	
	public static int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

}

// static 키워드는 프로그램을 실행하기 전에 메서드의 기계어 코드를 자동으로 메모리에 로딩시키기 위해 사용하는 키워드임.