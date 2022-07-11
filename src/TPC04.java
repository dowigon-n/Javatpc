public class TPC04 {
	public static void main(String[] args) {
	// 4. 데이터를 이동하라.(변수 VS 배열)의 관계
		
		int a, b, c;
		a=10;
		b=20;
		c=30;
		// a+b+c=? 메서드 처리 -> hap()
		
		// 3개 데이터를 다른 함수, 클래스로 이동할 때 어떻게 이동하는 것이 합리적이고 쉬운지 실습

		// 함수(메서드) 호출=콜
		hap(a, b, c);    // 메서드 호출이 되면 제어권이 넘어간다. 제어권이 넘어갈 때 int x, int y, int z로.. a값->x, b값->y, c값->z : 10, 20, 30 값이 넘어간다.
		
		
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b; 
		arr[2] = c;
		
		hap1(arr);  // 호출
		
		
		int[][] marr;
		marr = new int[3][4];   // 행렬=객체 생성
		
	}
	
	public static void hap(int x, int y, int z) {   // 매개 변수 a, b, c가 아니라 x, y, z여도 상관업다.
		
		// hap()에 3개 데이터를 받아서 합을 구해서 출력을 해도 되고 다시 리턴해도 되고..
		int sum = x + y + z;
		
		System.out.println(sum);
	}
	
	public static void hap1(int[] x) {    // main의 arr을 x로 넘기면 x가 arr[0]의 a, arr[1]의 b, arr[2]의 c를 가리킬 수 있다.
		
		// 배열이니까 반복문 활용 - for, while
		// 반복문 모르면
		//int sum = x[0] + x[1] + x[2];
		//System.out.println(sum);
		
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		System.out.println(sum);
	}
	
	// 1차원 배열 : Vector, List
	// 2차원 배열 : Array
	
}
