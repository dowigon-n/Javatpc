public class TPC07 {
	public static void main(String[] args) {
		
		// 6. 매개변수를 전달하는 기법
		// 메서드는 변수다. (매개 변수 = parameter)
		
		
		int a=20;
		float b=56.7f;
		// 1) a+b=?
		
		float v=sum(a, b);   // Call By Value(값)
		System.out.println(v);
		
		
		
		int[] arr={1, 2, 3, 4, 5};
		// 2) 배열의 총 합이 얼마인가?
		int vv=arrSum(arr);  // Call By Reference(번지) : 이제부터 클래스를 많이 다루기 때문에 [번지 전달] 기법을 많이 사용하게 된다.
		System.out.println(vv);  // 15
		
	}
	
	private static int arrSum(int[] x) {
		
		int hap=0;
		for(int i=0; i<x.length; i++) {
			hap+=x[i];
		}
		return hap;
	}

	public static float sum(int a, float b) {
		
		float v=a+b;
		return v;
		
	}

}
